/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Rewards;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author kalle
 */
public class RewardsUtil {
   
    public static int getRewardPoints(String category, String subCategory, String itemType) {
        try{
            JSONParser parser = new JSONParser();
            File file = new File(RewardsUtil.class.getResource("RewardsConfig.json").toURI());
            Object obj = parser.parse(new FileReader(file));
            JSONObject rewardsConfig = (JSONObject) obj;
            JSONObject categoryConfig = (JSONObject) rewardsConfig.get(category);
            JSONObject subCatConfig = (JSONObject) categoryConfig.get(subCategory);
            return (itemType.equals("REFURB")) ? ((Long) subCatConfig.get("refurb")).intValue() : ((Long) subCatConfig.get("recycle")).intValue();
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }
    
    
    public static int updateRewardPoints(String category, String subCategory, String itemType, int value) {
        JSONParser parser = new JSONParser();
        try {
            File file = new File(RewardsUtil.class.getResource("RewardsConfig.json").toURI());
            Object obj = parser.parse(new FileReader(file));
            JSONObject rewardsConfig = (JSONObject) obj;
            JSONObject categoryConfig = (JSONObject) rewardsConfig.get(category);
            JSONObject subCatConfig = (JSONObject) categoryConfig.get(subCategory);
            subCatConfig.put(itemType, value);
            
            categoryConfig.put(subCategory, subCatConfig);
            rewardsConfig.put(category, categoryConfig);
            FileWriter writeFile = new FileWriter("src/models/Rewards/RewardsConfig.json");
            writeFile.write(rewardsConfig.toJSONString());
            writeFile.flush();
            writeFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.util.HashMap;

/**
 *
 * @author Pranav Kashyap Komanduri
 */
public class CategoryDropDownUtil {
    
    private static final HashMap<String, String[]> categoryMap = new HashMap<>();
    
    
    static {
        categoryMap.put("Laptops", new String[]{"Ultrabooks",
            "Notebooks",
            "Convertible360",
            "TouchLaptops",
            "RuggedLaptop"});
        categoryMap.put("Desktops", new String[]{"PersonalComputers", 
            "Mainframes",
            "DesktopServer",
            "Workstations",
            "GamingComputer"});
        categoryMap.put("Peripherals", new String[]{"Mouse",
            "Keyboards",
            "Microphone",
            "Webcam",
            "DiskDrive",
            "MemoryCards"});
        categoryMap.put("Semiconductor", new String[]{"CPUs",
            "GPUs",
            "SSDs",
            "HDDs",
            "USBs",
            "HDMIs"
        });
        categoryMap.put("Cables", new String[]{"HDMICable",
            "AUXCable",
            "VGACable",
            "USBCable",
            "TypeCCable",
            "MicroUSBCable"});
        categoryMap.put("Other", new String[]{"other"});
    }
    
    public static String[] getList(String s) {
        return categoryMap.get(s);
    }
}

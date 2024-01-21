/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Work;


import SystemModels.ClientOrder.ClientOrder;
import SystemModels.User.Employee.LogisticsMan;

/**
 *
 * @author kalle
 */
public class ClientDropoff extends WorkRequest{
    
    private ClientOrder clientOrder;
    private LogisticsMan logisticsMan;
    
    public ClientDropoff(ClientOrder clientOrder, LogisticsMan logisticsMan) {
        this.clientOrder = clientOrder;
        this.logisticsMan = logisticsMan;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    } 

    public LogisticsMan getLogisticsMan() {
        return logisticsMan;
    }
    
}

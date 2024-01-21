/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.User.Employee;

import java.util.ArrayList;
import SystemModels.User.UserAccount;

/**
 *
 * @author Vennela Bandla
 */
public class EmployeeDirectory {
    
    private ArrayList<LogisticsMan> logisticsMen;
    private ArrayList<OperationsManager> inventoryManagers;
    private ArrayList<QCInspector> qcInspectors;
    private ArrayList<Technician> technicians;
    
    public EmployeeDirectory() {
        this.logisticsMen = new ArrayList<>();
        this.inventoryManagers = new ArrayList<>();
        this.qcInspectors = new ArrayList<>();
        this.technicians = new ArrayList<>();
    }
    
    public LogisticsMan addLogisticsMen(LogisticsMan logMan) {
        this.logisticsMen.add(logMan);
        return logMan;
    }
    
    public OperationsManager addInventoryManager(OperationsManager invMan) {
        this.inventoryManagers.add(invMan);
        return invMan;
    }
    
    public QCInspector addQCInspector(QCInspector qc) {
        this.qcInspectors.add(qc);
        return qc;
    }
    
    public Technician addTechnician(Technician technician) {
        this.technicians.add(technician);
        return technician;
    }
    
    public void removeLogisticsMan(LogisticsMan logMan) {
        this.logisticsMen.remove(logMan);
    }
    
    public void removeInventoryManager(OperationsManager invMan) {
        this.inventoryManagers.remove(invMan);
    }
    
    public void removeQCInspector(QCInspector qc) {
        this.qcInspectors.remove(qc);
    }
    
    public void removeTechnician(Technician technician) {
        this.technicians.remove(technician);
    }

    public ArrayList<LogisticsMan> getLogisticsMen() {
        return this.logisticsMen;
    }

    public ArrayList<OperationsManager> getInventoryManagers() {
        return this.inventoryManagers;
    }

    public ArrayList<QCInspector> getQcInscpectors() {
        return this.qcInspectors;
    }

    public ArrayList<Technician> getTechnicians() {
        return technicians;
    }
    
    public LogisticsMan getNextAvailableLogisticsMan() {
        for (LogisticsMan logisticsMan: this.logisticsMen) {
            if (logisticsMan.isAvailable()) return logisticsMan;
        }
        return null;
    }
    
    public OperationsManager getManagerByUserAccount(UserAccount userAccount) {
        for (OperationsManager manager: this.inventoryManagers) {
            if (manager.getUserAccount() == userAccount) return manager;
        }
        return null;
    }
    
    public LogisticsMan getLogisticsManByUserAccount(UserAccount userAccount) {
        for (LogisticsMan lagMan: this.logisticsMen) {
            if (lagMan.getUserAccount() == userAccount) return lagMan;
        }
        return null;
    }
    
    public QCInspector getQCInspectorByUserAccount(UserAccount userAccount) {
        for (QCInspector qc: this.qcInspectors) {
            if (qc.getUserAccount() == userAccount) return qc;
        }
        return null;
    }
    
    public Technician getTechnicanByUserAccount(UserAccount userAccount) {
        for (Technician tech: this.technicians) {
            if (tech.getUserAccount() == userAccount) return tech;
        }
        return null;
    }
    
    public ArrayList<LogisticsMan> getActiveLogisticsMen() {
        ArrayList<LogisticsMan> logMen = new ArrayList<>();
        for (LogisticsMan logMan: this.logisticsMen) {
            if (logMan.isAvailable()) logMen.add(logMan);
        }
        return logMen;
    }
    
    
}

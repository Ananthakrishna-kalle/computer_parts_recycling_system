/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import SystemModels.User.Employee.LogisticsMan;
import SystemModels.User.Employee.QCInspector;
import SystemModels.User.Employee.Technician;

/**
 *
 * @author kalle
 */
public class WorkRequestDirectory {
    
    ArrayList<ClientDropoff> dropOffs;
    ArrayList<InventoryPickup> inventoryPickups;
    ArrayList<QCInspection> qcInspections;
    ArrayList<RefurbAssignment> refurbAssignments;
    
    private HashMap<QCInspector, Integer> qcInspectionAssignmentMap;
    private HashMap<Technician, Integer> refurbAssignmentMap;
    
    public WorkRequestDirectory() {
        this.dropOffs = new ArrayList<>();
        this.inventoryPickups = new ArrayList<>();
        this.qcInspections = new ArrayList<>();
        this.refurbAssignments = new ArrayList<>();
        this.qcInspectionAssignmentMap = new HashMap<>();
        this.refurbAssignmentMap = new HashMap<>();
    }

    public ArrayList<ClientDropoff> getRetailOrders() {
        return dropOffs;
    }

    public ArrayList<InventoryPickup> getInventoryPickups() {
        return inventoryPickups;
    }

    public ArrayList<QCInspection> getQcInspections() {
        return qcInspections;
    }

    public ArrayList<RefurbAssignment> getRefurbAssignments() {
        return refurbAssignments;
    }
    
    public ClientDropoff addClientDropoff(ClientDropoff retailOrder) {
        this.dropOffs.add(retailOrder);
        return retailOrder;
    }
    
    public InventoryPickup addInventoryPickup(InventoryPickup inventoryPickup) {
        this.inventoryPickups.add(inventoryPickup);
        return inventoryPickup;
    }
    
    public QCInspection addQCInspection(QCInspection qcInspleciton) {
        this.qcInspections.add(qcInspleciton);
        return qcInspleciton;
    }
    
    public RefurbAssignment addRefurbAssignment(RefurbAssignment retailOrder) {
        this.refurbAssignments.add(retailOrder);
        return retailOrder;
    }
    
    
    public ArrayList<InventoryPickup> getPickupsByLogisticMan(LogisticsMan logisticsMan) {
        ArrayList<InventoryPickup> pickups = new ArrayList<>();
        for (InventoryPickup pickup: this.inventoryPickups) {
            if (pickup.getLogisticsMan() == logisticsMan) pickups.add(pickup);
        }
        return pickups;
    }
    
    public ArrayList<ClientDropoff> getDropoffByLogisticMan(LogisticsMan logisticsMan) {
        ArrayList<ClientDropoff> dropoffs = new ArrayList<>();
        for (ClientDropoff dropoff: this.dropOffs) {
            if (dropoff.getLogisticsMan()== logisticsMan) dropoffs.add(dropoff);
        }
        return dropoffs;
    }
    
    public InventoryPickup getActivePickup(LogisticsMan logisticsMan) {
        for (InventoryPickup pickup: this.getPickupsByLogisticMan(logisticsMan)) {
            if (pickup.getStatus() == InventoryPickup.RequestStatus.ASSIGNED || pickup.getStatus() == InventoryPickup.RequestStatus.ONGOING) return pickup;
        }
        return null;
    }
    
    
    public ClientDropoff getActiveDropOff(LogisticsMan logisticsMan) {
        for (ClientDropoff dropoff: this.getDropoffByLogisticMan(logisticsMan)) {
            if (dropoff.getStatus() == ClientDropoff.RequestStatus.ASSIGNED || dropoff.getStatus() == ClientDropoff.RequestStatus.ONGOING) return dropoff;
            return dropoff;
            }
        return null;
    }
    
    
    public ArrayList<QCInspection> getInspectionsByInspector(QCInspector qcInspector) {
        ArrayList<QCInspection> inspections = new ArrayList<>();
        for (QCInspection qcInspection: this.qcInspections) {
            if (qcInspection.getInspector() == qcInspector) inspections.add(qcInspection);
        }
        return inspections;
    }
    
    public ArrayList<RefurbAssignment> getRefurbAssignmentsByTechnician(Technician technician) {
        ArrayList<RefurbAssignment> assignments = new ArrayList<>();
        for (RefurbAssignment assignment: this.refurbAssignments) {
            if (assignment.getTechnician()== technician) assignments.add(assignment);
        }
        return assignments;
    }
    
    public void increaseqcInspectionAssignmentCount(QCInspector qcInspector) {
        if(!this.qcInspectionAssignmentMap.containsKey(qcInspector)){
            this.qcInspectionAssignmentMap.put(qcInspector, 0);
        }
        Integer x = this.qcInspectionAssignmentMap.get(qcInspector);
        this.qcInspectionAssignmentMap.replace(qcInspector, ++x);
    }
    
    public void decreaseqcInspectionAssignmentCount(QCInspector qcInspector) {
        Integer x = this.qcInspectionAssignmentMap.get(qcInspector);
        this.qcInspectionAssignmentMap.replace(qcInspector, --x);
    }
    
    public void increaserefurbAssignmentMapCount(Technician technician) {
        if(!this.refurbAssignmentMap.containsKey(technician)){
            this.refurbAssignmentMap.put(technician, 0);
        }
        Integer x = this.refurbAssignmentMap.get(technician);
        this.refurbAssignmentMap.replace(technician, ++x);
    }
    
    public void decreaserefurbAssignmentMapCount(Technician technician) {
        Integer x = this.refurbAssignmentMap.get(technician);
        this.refurbAssignmentMap.replace(technician, --x);
    }
    
    public QCInspector getQCtoAssign() {
        // round robin to assign for QC
        return Collections.min(this.qcInspectionAssignmentMap.entrySet(), HashMap.Entry.comparingByValue()).getKey();
    }
    
    public Technician getTechniciantoAssign() {
        // round robin to assign for Technician
        return Collections.min(this.refurbAssignmentMap.entrySet(), HashMap.Entry.comparingByValue()).getKey();
    }
    
}

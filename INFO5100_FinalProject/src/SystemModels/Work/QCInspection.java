/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.Work;

import SystemModels.Inventory.Item;
import SystemModels.User.Employee.QCInspector;


/**
 *
 * @author kalle
 */
public class QCInspection extends WorkRequest{
    
    private final QCInspector inspector;
    private final Item item;
    
    public QCInspection(Item item, QCInspector inspector) {
        this.item = item;
        this.inspector = inspector;
    }

    public QCInspector getInspector() {
        return inspector;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return this.getId();
    }
    
    
}

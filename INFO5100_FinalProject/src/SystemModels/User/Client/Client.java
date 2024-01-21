/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.User.Client;

import java.util.UUID;
import SystemModels.Roles.ClientRole;
import SystemModels.User.Person;
import SystemModels.User.UserAccount;

/**
 *
 * @author Pranav Kashyap Komanduri
 */
public class Client extends Person{
    
    private String id;
    private boolean verified;
    private UserAccount userAccount;
    private paymentType paymenttype;
    private clientType clienttype;
    
    public Client(String username, String password, boolean verified) {
        this.userAccount = new UserAccount(username, password, new ClientRole());
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.verified = verified;
        this.paymenttype = paymentType.BANK_TRANSFER;
    }

    public String getId() {
        return id;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }
    
    public enum paymentType {
        CASH_ON_DELIVERY,
        BANK_TRANSFER,
        PAYPAL
    }
    public enum clientType {
        RECYCLER,
        RETAILER
    }

    public clientType getClienttype() {
        return clienttype;
    }

    public void setClienttype(clientType clienttype) {
        this.clienttype = clienttype;
    }
    
    

    public paymentType getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(paymentType paymenttype) {
        this.paymenttype = paymenttype;
    }
    
    
}

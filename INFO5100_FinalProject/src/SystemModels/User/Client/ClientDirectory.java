/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModels.User.Client;

import java.util.ArrayList;
import SystemModels.User.UserAccount;

/**
 *
 * @author Pranav Kashyap Komanduri
 */
public class ClientDirectory {
    
    private ArrayList<Client> clients;
    
    public ClientDirectory() {
        this.clients = new ArrayList<>();
    }
    
    public Client addClient(Client client) {
        this.clients.add(client);
        return client;
    }
    
    
    public Client removeClient(Client client) {
        this.clients.remove(client);
        return client;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
    
    public Client getClientByUserAccount(UserAccount userAccount) {
        for (Client client: this.clients) {
            if (client.getUserAccount() == userAccount) return client;
        }
        return null;
    }
}

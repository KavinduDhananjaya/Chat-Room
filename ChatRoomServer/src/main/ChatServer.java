/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllerImpl.ChatControllerImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ChatServer {
    
    public static void main(String[] args) {
        
        
        try {
            Registry chatRegistry = LocateRegistry.createRegistry(5050);
            System.out.println("Server is Running...........");
            chatRegistry.rebind("ChatServer", new ChatControllerImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}

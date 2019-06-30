/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import observer.ChatObserver;

/**
 *
 * @author User
 */
public interface ChatController extends Remote {

    public void setChat(String message) throws RemoteException;
    
    public void addChatObserver(ChatObserver chatObserver) throws RemoteException;
    
    public void removeChatObserver(ChatObserver chatObsever) throws RemoteException ;

}

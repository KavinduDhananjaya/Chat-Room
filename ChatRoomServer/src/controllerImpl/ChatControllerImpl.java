/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerImpl;

import controller.ChatController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import observable.ChatObservable;
import observer.ChatObserver;

/**
 *
 * @author User
 */
public class ChatControllerImpl extends UnicastRemoteObject implements ChatController {

    public ChatControllerImpl() throws RemoteException{
    }

    
   
    private String message;
    private ChatObservable chatObservable = new ChatObservable();

    @Override
    public void setChat(String message) throws RemoteException {
        chatObservable.setNote(message);
    }

    @Override
    public void addChatObserver(ChatObserver chatObserver) throws RemoteException {
        chatObservable.addChatObserver(chatObserver);
    }

    @Override
    public void removeChatObserver(ChatObserver chatObsever) throws RemoteException {
        chatObservable.removeChatObserver(chatObsever);
    }

  

}

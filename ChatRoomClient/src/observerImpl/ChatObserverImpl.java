/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import observer.ChatObserver;
import sun.rmi.server.UnicastRef;
import view.ChatView;

/**
 *
 * @author User
 */
public class ChatObserverImpl extends UnicastRemoteObject implements ChatObserver {

    private ChatView chatView;
    public ChatObserverImpl(ChatView chatViewer) throws RemoteException {
        this.chatView = chatViewer;
    }

    @Override
    public void update(String message) throws RemoteException {
        chatView.setMessage(message);
    }

}

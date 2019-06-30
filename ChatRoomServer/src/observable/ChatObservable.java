/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import observer.ChatObserver;

/**
 *
 * @author User
 */
public class ChatObservable {
    
    private String message="";
    private ArrayList<ChatObserver> observerList=new ArrayList<>();
    
     public void addChatObserver(ChatObserver noteObserver){
        observerList.add(noteObserver);
    }
    public void removeChatObserver(ChatObserver noteObserver){
        observerList.remove(noteObserver);
    }
    public void notifyChatObservers() throws RemoteException{
        for (ChatObserver observer : observerList) {
            observer.update(message);
        }
    }
    
    
     public void setNote(String note){
        try {
            if(!this.message.equals(note)){
                this.message=note;
            }
            notifyChatObservers();
            
        } catch (RemoteException ex) {
            Logger.getLogger(ChatObservable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

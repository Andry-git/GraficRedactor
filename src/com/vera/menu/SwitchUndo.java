/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vera.menu;


import com.vera.mvc.model.UndoMachine;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractAction;
import javax.swing.Icon;

/**
 *
 * @author Wera
 */
public class SwitchUndo extends AbstractAction implements Observer{

    public SwitchUndo(String name, Icon icon, UndoMachine machine) {
        super(name, icon);
        putValue("machine", machine);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UndoMachine m = (UndoMachine)getValue("machine");
        if (this.isEnabled()) m.unexecute();
        
    }

    @Override
    public void update(Observable o, Object arg) {
        UndoMachine.StateUndo stateUndo = (UndoMachine.StateUndo) arg;
        this.setEnabled(stateUndo.undo);
    }
    
}

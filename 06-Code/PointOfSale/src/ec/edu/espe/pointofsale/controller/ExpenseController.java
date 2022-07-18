package ec.edu.espe.pointofsale.controller;

import ec.edu.espe.pointofsale.model.Expense;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;
import utils.DataBaseManager;
import utils.DataCustomer;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class ExpenseController {
        public boolean register(JFrame frame,Expense expense){
        
        int reply;
        String message;
        message = "Are you sure you want save this bills?";
        
        reply = JOptionPane.showConfirmDialog(frame,message);
        DataCustomer fileManager = new DataBaseManager();
        Document d1 = new Document("date",expense.getDate())
                .append("electricity",expense.getElectricity())
                .append("water", expense.getWater())
                .append("rent", expense.getRent())
                .append("gas",expense.getGas());
        
        if(reply == JOptionPane.YES_OPTION){
            fileManager.create(d1,"expenses");
            JOptionPane.showMessageDialog(frame,"Saved","OK",JOptionPane.OK_OPTION);
        }else{
            JOptionPane.showMessageDialog(frame,"It was not saved","Warning",JOptionPane.CANCEL_OPTION);
        }
        
        return true;
    }
}

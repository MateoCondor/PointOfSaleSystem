/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.pointofsale.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.pointofsale.model.Product;
import ec.edu.espe.pointofsale.model.User;
import ec.edu.espe.pointofsale.view.FrmMenu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import utils.DataBaseManager;
import utils.DataCustomer;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class UserController {

    public boolean registerNewUser(JFrame frame, User users) {

        int reply1;
        int reply2;
        String message1;
        String message2;
        DataCustomer fileManager;
        fileManager = new DataBaseManager();
        Document d1 = new Document("username", users.getUsername())
                .append("password", users.getPassword());

        message1 = "Are you sure you want register this user?\n\n"
                + "Username: " + users.getUsername() + "\n"
                + "Password: " + users.getPassword();
        message2 = "Do you want register other user and password?";
        reply1 = JOptionPane.showConfirmDialog(frame, message1);
        if (reply1 == JOptionPane.YES_OPTION) {
            fileManager.create(d1, "users");
            JOptionPane.showMessageDialog(frame, "Saved", "OK", JOptionPane.OK_OPTION);
            reply2 = JOptionPane.showConfirmDialog(frame, message2);
            if (reply2 == JOptionPane.NO_OPTION) {
                FrmMenu view = new FrmMenu();
                view.setVisible(true);
                frame.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(frame, "It was not saved", "Warning", JOptionPane.CANCEL_OPTION);
        }

        return true;
    }

    public void verifyLogin(JFrame frame, String username, String password) {

        Document result1;
        Document result2;

        DataCustomer fileManager;
        fileManager = new DataBaseManager();

        result1 = fileManager.search("users", "username", username);
        result2 = fileManager.search("users", "password", password);

        if (result1 != null && result2 != null) {
            JOptionPane.showMessageDialog(frame, "Login succesfull", "Welcome", JOptionPane.OK_OPTION);
            FrmMenu view = new FrmMenu();
            view.setVisible(true);
            frame.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(frame, "Username or password incorect", "Attention", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String verifyUsername(String username) {
        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = DatabaseController.database.withCodecRegistry(codecRegistry);
        MongoCollection<User> collection = db.getCollection("users", User.class);
        List<User> users = collection.find(new Document(), User.class).into(new ArrayList<User>());

        String value = null;
        Object[] objects = new Object[users.size()];

        for (int i = 0; i < users.size(); i++) {
            objects[i] = users.get(i).getUsername();
            if (username.equals(objects[i])) {
                value = String.valueOf(objects[i]);
            }
        }

        return value;
    }
}

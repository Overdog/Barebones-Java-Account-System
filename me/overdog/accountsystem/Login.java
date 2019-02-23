package me.overdog.accountsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.bind.DatatypeConverter;

import me.overdog.accountsystem.mysql.MySQL;

/*
 * Honestly, the only IMPORTANT code you should keep here is the login() method. 
 * Otherwise, you can delete the other methods. 
 * I wouldn't advise deleting variables unless you want to break something.
 * 
 * You can configure the Database strings in the MySQL package. I'm hoping to make a system where security can be stronger, as of right now, logins aren't hashed. 
 * I will update this as soon as possible. For now, passwords are just encoded and decoded using Base64. :P
 * 
 * I am currently working on a register system. This is only for logins.
 * 
 * Please keep this credit in the file, I can't force you to do anything, however, this WAS developed by me, not you. 
 * You must keep this code in the file. Or just ask and maybe I'll let you get rid of it.
 * 
 * This was created by Overdog, my social medias...
 * 
 * Youtube: www.youtube.com/c/Overdog
 * Github: https://github.com/Overdog
 * 
 * Thank you for using the code! :P
 */
public class Login {
	
    public static void login(String username, String password) {                                              

        Connection connection;
        PreparedStatement ps;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + MySQL.Host + ":3306/" + MySQL.DatabaseName, MySQL.Username, MySQL.Password);
            ps = connection.prepareStatement("SELECT `username`, `password` FROM `users` WHERE `username` = ? AND `password` = ?");
            ps.setString(1, username);
            
            String decoded = new String(DatatypeConverter.parseBase64Binary(password));
            
            ps.setString(2, decoded);
            ResultSet result = ps.executeQuery();
            if(result.next()) {
            	// Failed login code.
            	System.out.print("Login successful!");
            }
            else {
            	// Failed login code.
            	System.out.print("Login failed!");
            }
        } catch (SQLException ex) {
            System.out.print("Error! SQL exception.");
        }
    }          
	
}

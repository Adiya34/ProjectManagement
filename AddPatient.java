


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class AddPatient{
    
   public void insertUpdateDeletePatient(char operation, Integer id, String fname, String lname, String sex, String age, String sisiId, String Class,
                                        String branch, String phone, String address, String register, String allergyinfo, String email, String emd,
                                        String job, String education)
   {
       Connection con = MyConnection.getConnection();
        
       
       if(operation == 'i')
       {
           String sql = "INSERT INTO patient(FirstName, LastName, Sex, Age, SisiID, Class, Branch, Phone, Address, Register, AllergyInfo, Email, EMD, Job, Education) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           try {
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setString(1, fname);
               ps.setString(2, lname);
               ps.setString(3, sex);
               ps.setString(4, age);
               ps.setString(5, sisiId);
               ps.setString(6, Class);
               ps.setString(7, branch);
               ps.setString(8, phone);
               ps.setString(9, address);
               ps.setString(10, register);
               ps.setString(11, allergyinfo);
               ps.setString(12, email);
               ps.setString(13, emd);
               ps.setString(14, job);
               ps.setString(15, education);
               
               if(ps.executeUpdate() > 0){
                            JOptionPane.showMessageDialog(null, "New Patient added");
                            
               }
                       
           } catch (SQLException ex) {
               Logger.getLogger(AddPatient.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
   }        

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           

    

    
}

  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.dao;
import student.dbutil.DBConnection;
import student.pojo.StudentPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author misha
 */
public class StudentDAO {
     public static boolean addStudent(StudentPojo e) throws SQLException {
        //prepered statement object 
        //prepared setter
        // query
        // return tru ,false
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into students values(?,?,?)");
        ps.setString(1,e.getStudentName());
        ps.setString(2,e.getStudentRoll());
        ps.setString(3,e.getStudentGrade());
        
        return ps.executeUpdate()==1;
              
    }
     public static List<StudentPojo> getAllStudents() throws SQLException{
          Connection conn=DBConnection.getConnection();
          Statement st=conn.createStatement();
          List<StudentPojo> studentList=new ArrayList<>();
          ResultSet rs=st.executeQuery("Select * from students");
          while(rs.next()){
              StudentPojo student=new StudentPojo();
              student.setStudentName( rs.getString(1));
              student.setStudentRoll(rs.getString(2));
              student.setStudentGrade(rs.getString(3));
              
             studentList.add(student);             
          }
         return studentList;
     }
      
    public static StudentPojo getStudentByName(String name) throws SQLException {
           Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement("select * from students where ST_NAME=?");
            ps.setString(1,name);
            
            StudentPojo st=null;
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                st=new StudentPojo();
                 st.setStudentName(name);
                st.setStudentRoll(rs.getString(2)); 
                st.setStudentGrade(rs.getString(3));
            }
       return st;
     }
    public static  boolean removeStudentByName(String name) throws SQLException {
            Connection conn=DBConnection.getConnection();
           
            PreparedStatement ps=conn.prepareStatement("delete from students where ST_NAME=?");
            ps.setString(1,name);
            int rowsAffected=ps.executeUpdate();
            return rowsAffected>0;
           
    }
    
     public static  boolean updateStudentByName(String name,String roll,String grade) throws SQLException {
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement("UPDATE students SET ST_ROLL=?, ST_GRADE=? WHERE ST_NAME = ?");
            ps.setString(1,name);
            ps.setString(2,roll);
            ps.setString(3,grade);
            int rowAffected=ps.executeUpdate();
            return rowAffected>=0;
          
    }
}

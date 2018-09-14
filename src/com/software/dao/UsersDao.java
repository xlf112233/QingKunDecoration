package com.software.dao;

import com.software.utils.JDBCUtils;
import com.software.domain.Announcement;
import com.software.domain.UserLogInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UsersDao {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	Statement stmt = null;
	private UserLogInfo userLogInfo;

    /**
     * @function �� user_info ���в������� txt_name �� pwd ���У������ڷ��� true�����򷵻� false��
     *     ʵ���ϲ�ĵ�¼���ܡ�
     * @param user �洢�û��˺����롣
     * @return ���ڷ��� true�����򷵻� false��
     */
	public boolean login(String text_name,String pwd) {
		try {
			conn = JDBCUtils.getConnnection();
			String sql = "select * from user_info where txt_name=? and pwd=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, text_name);
			pstm.setString(2, pwd);
			rs = pstm.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs, pstm, conn);
		}
		return false;
	}


    public String find_txt_name() {
    	 try {
             conn = JDBCUtils.getConnnection();
             String sql = "select txt_name from user_info";           
             stmt = conn.createStatement();
             rs = stmt.executeQuery(sql);  
             String name = null;
             UserLogInfo userLogInfo = new UserLogInfo();
             while (rs.next()) {          	
            	 name =rs.getString("txt_name");
             }
             return name;
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             JDBCUtils.release(rs, stmt, conn);
         }
         return null;
    }
    
    public String find_pwd() {
   	 try {
            conn = JDBCUtils.getConnnection();
            String sql = "select pwd from user_info";           
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);  
            UserLogInfo userLogInfo = new UserLogInfo();
            while (rs.next()) {          	
           	 userLogInfo.setPwd(rs.getString("pwd"));
            }
            return userLogInfo.getPwd();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
        return null;
   }
    
    public String find_email() {
      	 try {
               conn = JDBCUtils.getConnnection();
               String sql = "select email from user_info";           
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);  
               UserLogInfo userLogInfo = new UserLogInfo();
               while (rs.next()) {          	
              	 userLogInfo.setEmail(rs.getString("email"));
               }
               return userLogInfo.getEmail();
           } catch (Exception e) {
               e.printStackTrace();
           } finally {
               JDBCUtils.release(rs, stmt, conn);
           }
      	  return null;
      }
    
    public String find_tel() {
      	 try {
               conn = JDBCUtils.getConnnection();
               String sql = "select tel from user_info";           
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);  
               UserLogInfo userLogInfo = new UserLogInfo();
               while (rs.next()) {          	
              	 userLogInfo.setTel(rs.getString("tel"));
               }
               return userLogInfo.getTel();
           } catch (Exception e) {
               e.printStackTrace();
           } finally {
               JDBCUtils.release(rs, stmt, conn);
           }
           return null;
      }
    
    public String find_sex() {
      	 try {
               conn = JDBCUtils.getConnnection();
               String sql = "select sex from user_info";           
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);  
               UserLogInfo userLogInfo = new UserLogInfo();
               while (rs.next()) {          	
              	 userLogInfo.setSex(rs.getString("sex"));
               }
               return userLogInfo.getSex();
           } catch (Exception e) {
               e.printStackTrace();
           } finally {
               JDBCUtils.release(rs, stmt, conn);
           }
           return null;
      }
    
    public String find_age() {
      	 try {
               conn = JDBCUtils.getConnnection();
               String sql = "select age from user_info";           
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);  
               UserLogInfo userLogInfo = new UserLogInfo();
               while (rs.next()) {          	
              	 userLogInfo.setAge(rs.getString("age"));
               }
               return userLogInfo.getAge();
           } catch (Exception e) {
               e.printStackTrace();
           } finally {
               JDBCUtils.release(rs, stmt, conn);
           }
           return null;
      }
    /**
     * @function ���һ�� user_info ���������洢�û��ĸ�����Ϣ��ͬʱ���һ�� hobby �������洢�û��Ķ�����á�
     *     ʵ���ϲ��ע�Ṧ�ܡ�
     * @param userRegisterInfo �洢�û�������Ϣ��
     * @return �ɹ�д��������󷵻� true�����򷵻� false��
     */
	

   
}

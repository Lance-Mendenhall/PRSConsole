package prs.util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import prs.business.Product;

public class ProductDB {

	
    public List<Product> getAll() {
        String sql = "SELECT * FROM Product";
                  
        List<Product> products = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
            	
            	int id = rs.getInt(1);
            	int vid = rs.getInt(2);
            	String partNum = rs.getString(3);
            	String name = rs.getString(4);
            	double price = rs.getDouble(5);
            	String unit = rs.getString(6);
            	String photoPath = rs.getString(7);
            	  	
               // String code = rs.getString("ProductCode");
                //String description = rs.getString("Description");
                //ouble price = rs.getDouble("Price");

                Product p = new Product(id, vid, partNum,name, price, unit, photoPath);
                products.add(p);
            }
            return products;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

  
    public Product getProduct(int pid) {
        String sql = "SELECT * FROM Product WHERE ID = ?";
        Product p = null; //new Product(code, description, price);
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
        	
        	
            ps.setInt(1, pid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	
                //String description = rs.getString("Description");
                //double price = rs.getDouble("Price");
               
                
                int id = rs.getInt(1);
            	int vid = rs.getInt(2);
            	String partNum = rs.getString(3);
            	String name = rs.getString(4);
            	double price = rs.getDouble(5);
            	String unit = rs.getString(6);
            	String photoPath = rs.getString(7);
            	
            	p = new Product(id, vid, partNum,name, price, unit, photoPath);
                
                rs.close();
                return p;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
    
    public Product get(int pid) {   // accepts product ID
        String sql = "SELECT ProductCode, Description, Price "
                   + "FROM Products "
                   + "WHERE Product ID = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            // ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");
                
                Product p = null; //new Product(code, description, price);
                rs.close();
                return p;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
    
     
    private Product getProductFromResultSet(ResultSet rs) throws SQLException {
    	int id = rs.getInt(1);
    	int vid = rs.getInt(2);
    	String partNum = rs.getString(3);
    	String name = rs.getString(4);
    	double price = rs.getDouble(5);
    	String unit = rs.getString(6);
    	String photoPath = rs.getString(7);
    	Product p = new Product(id, vid, partNum,
    			name, price, unit,
    			photoPath);
    	return p;
    }
    
    
    public boolean add(Product p) {
        String sql = "INSERT INTO product (VendorID, PartNumber, Name, Price)\r\n" + 
        		"VALUES (?, ?,?, ?)";
        		
        		        	
        try (Connection connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
        	ps.setInt(1, p.getVendorID());
            ps.setString(1, p.getPartNumber());
            ps.setString(2, p.getName());
            ps.setDouble(3, p.getPrice());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    
    public boolean update(Product p) {
        String sql = "UPDATE product WHERE Set Name = ?" + 
        		"where ID = ?";
        		
        		        	
        try (Connection connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
        	ps.setInt(2, p.getId());
            ps.setString(1, p.getName());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public boolean delete(Product p) {
        String sql = "delete from product where id = ?; ";
        		        	
        try (Connection connection = DBUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
        	ps.setInt(2, p.getId());
            ps.setString(1, p.getName());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
	
}

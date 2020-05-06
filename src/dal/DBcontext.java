/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import Product_Management.Product_Cate;
import Product_Management.Product_entity;
import Report.Report_entity;
import Staff_Management.Staff_entity;
import Store_Login.Login_entity;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class DBcontext {

    public Connection connection;

    public DBcontext() {
        try {
            String username = "hieuls123";
            String password = "hieuls123";
            String url = "jdbc:sqlserver://PEN15:1433;databaseName=Store_Login";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//------------------------------------------------------------------------------Staff--------------------------//

    public ArrayList<Staff_Management.Staff_entity> getStaff() {
        ArrayList<Staff_Management.Staff_entity> staff = new ArrayList<>();
        String sql = "SELECT [ID]\n"
                + "      ,[Name]\n"
                + "      ,[Dob]\n"
                + "      ,[Gender]\n"
                + "      ,[Address]\n"
                + "      ,[Phone]\n"
                + "  FROM [Staff]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ID");
                String name = rs.getNString("Name");
                Date dob = rs.getDate("Dob");
                boolean gender = rs.getBoolean("gender");
                String address = rs.getNString("Address");
                int phone = rs.getInt("Phone");
                Staff_Management.Staff_entity s = new Staff_entity(id, name, dob, gender, address, phone);
                staff.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return staff;
    }

    public Staff_entity getStaff(String s_id) {
        try {
            String sql = "SELECT [ID]\n"
                    + "      ,[Name]\n"
                    + "      ,[Dob]\n"
                    + "      ,[Gender]\n"
                    + "      ,[Address]\n"
                    + "      ,[Phone]\n"
                    + "  FROM [Staff] WHERE [ID] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, s_id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ID");
                String name = rs.getNString("Name");
                Date dob = rs.getDate("Dob");
                boolean gender = rs.getBoolean("gender");
                String address = rs.getNString("Address");
                int phone = rs.getInt("Phone");
                Staff_Management.Staff_entity s = new Staff_entity(id, name, dob, gender, address, phone);
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insert(Staff_entity staff) {
        try {
            String sql = "INSERT INTO [Staff]\n"
                    + "           ([ID]\n"
                    + "           ,[Name]\n"
                    + "           ,[Dob]\n"
                    + "           ,[Gender]\n"
                    + "           ,[Address]\n"
                    + "           ,[Phone])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, staff.getId_nv());
            statement.setString(2, staff.getTen_nv());
            statement.setDate(3, staff.getDate_nv());
            statement.setBoolean(4, staff.isGt_nv());
            statement.setString(5, staff.getDiachi_nv());
            statement.setInt(6, staff.getSdt_nv());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Staff_entity staff) {
        try {
            String sql = "UPDATE [Staff]\n"
                    + "   SET [Name] = ?\n"
                    + "      ,[Dob] = ?\n"
                    + "      ,[Gender] = ?\n"
                    + "      ,[Address] = ?\n"
                    + "      ,[Phone] = ?\n"
                    + "WHERE [ID] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, staff.getTen_nv());
            statement.setDate(2, staff.getDate_nv());
            statement.setBoolean(3, staff.isGt_nv());
            statement.setString(4, staff.getDiachi_nv());
            statement.setInt(5, staff.getSdt_nv());
            statement.setString(6, staff.getId_nv());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(Staff_entity staff) {
        try {
            String sql = "DELETE FROM [Staff]\n"
                    + "      WHERE [ID] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, staff.getId_nv());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//------------------------------------------------------------------------------Product-----------//
    public ArrayList<Product_Management.Product_entity> getProducts() {
        ArrayList<Product_Management.Product_entity> products = new ArrayList<>();
        String sql = "SELECT [ID]\n"
                + "      ,[Category]\n"
                + "      ,[Name]\n"
                + "      ,[Brand]\n"
                + "      ,[Guarantee]\n"
                + "      ,[Price]\n"
                + "      ,[Amout]\n"
                + "      ,[Directory]\n"
                + "  FROM [Product]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ID");
                String loai = rs.getString("Category");
                String ten = rs.getString("Name");
                String hang = rs.getString("Brand");
                String baohanh = rs.getString("Guarantee");
                String gia = rs.getString("Price");
                int soluong = rs.getInt("Amout");
                String duongdan = rs.getString("Directory");
                Product_Management.Product_entity p = new Product_entity(id, loai, ten, hang, baohanh, gia, soluong, duongdan);
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public Product_entity getProduct(String p_id) {
        String sql = "SELECT [ID]\n"
                + "      ,[Category]\n"
                + "      ,[Name]\n"
                + "      ,[Brand]\n"
                + "      ,[Guarantee]\n"
                + "      ,[Price]\n"
                + "      ,[Amout]\n"
                + "      ,[Directory]\n"
                + "  FROM [Product] WHERE [ID] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, p_id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ID");
                String loai = rs.getString("Category");
                String ten = rs.getString("Name");
                String hang = rs.getString("Brand");
                String baohanh = rs.getString("Guarantee");
                String gia = rs.getString("Price");
                int soluong = rs.getInt("Amout");
                String duongdan = rs.getString("Directory");
                Product_Management.Product_entity p = new Product_entity(id, loai, ten, hang, baohanh, gia, soluong, duongdan);
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insert_P(Product_entity product) {
        try {
            String sql = "INSERT INTO [dbo].[Product]\n"
                    + "           ([ID]\n"
                    + "           ,[Category]\n"
                    + "           ,[Name]\n"
                    + "           ,[Brand]\n"
                    + "           ,[Guarantee]\n"
                    + "           ,[Price]\n"
                    + "           ,[Amout]\n"
                    + "           ,[Directory])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, product.getMa_sp());
            statement.setString(2, product.getLoai_sp());
            statement.setString(3, product.getTen_sp());
            statement.setString(4, product.getHang_sp());
            statement.setString(5, product.getBao_hanh());
            statement.setString(6, product.getGia_sp());
            statement.setInt(7, product.getSlg_sp());
            statement.setString(8, product.getDuong_dan());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update_p(Product_entity product) {
        try {
            String sql = "UPDATE [dbo].[Product]\n"
                    + "   SET [Category] = ?\n"
                    + "      ,[Name] = ?\n"
                    + "      ,[Brand] = ?\n"
                    + "      ,[Guarantee] = ?\n"
                    + "      ,[Price] = ?\n"
                    + "      ,[Amout] = ?\n"
                    + "      ,[Directory] = ?\n"
                    + " WHERE [ID] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, product.getLoai_sp());
            statement.setString(2, product.getTen_sp());
            statement.setString(3, product.getHang_sp());
            statement.setString(4, product.getBao_hanh());
            statement.setString(5, product.getGia_sp());
            statement.setInt(6, product.getSlg_sp());
            statement.setString(7, product.getDuong_dan());
            statement.setString(8, product.getMa_sp());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete_p(Product_entity product) {
        try {
            String sql = "DELETE FROM [Product]\n"
                    + "      WHERE [ID] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, product.getMa_sp());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Product_Management.Product_Cate> getCate() {
        ArrayList<Product_Management.Product_Cate> Cates = new ArrayList<>();
        String sql = "SELECT [Brand]\n"
                + "  FROM [Brand_]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String cate = rs.getString("Brand");
                Product_Management.Product_Cate c = new Product_Cate(cate);
                Cates.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Cates;
    }

    //------------------------------------------------------------------Report----
    public ArrayList<Report.Report_entity> getReports() {
        ArrayList<Report.Report_entity> reports = new ArrayList<>();
        String sql = "SELECT [Name]\n"
                + "      ,[Amount]\n"
                + "      ,[Guarantee]\n"
                + "      ,[Price]\n"
                + "      ,[Address]\n"
                + "      ,[Deliver]\n"
                + "      ,[Total]\n"
                + "      ,[Method]\n"
                + "  FROM [Payment]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("Name");
                int amount = rs.getInt("Amount");
                String guarantee = rs.getString("Guarantee");
                String price = rs.getString("price");
                String address = rs.getString("Address");
                Date deliver = rs.getDate("Deliver");
                String total = rs.getString("Total");
                boolean method = rs.getBoolean("Method");
                Report.Report_entity r = new Report_entity(name, amount, guarantee, price, address, deliver, total, method);
                reports.add(r);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reports;
    }
    public Report_entity getReport(String ten){
        String sql = "SELECT [Name]\n"
                + "      ,[Amount]\n"
                + "      ,[Guarantee]\n"
                + "      ,[Price]\n"
                + "      ,[Address]\n"
                + "      ,[Deliver]\n"
                + "      ,[Total]\n"
                + "      ,[Method]\n"
                + "  FROM [Payment] WHERE [Name] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, ten);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("Name");
                int amount = rs.getInt("Amount");
                String guarantee = rs.getString("Guarantee");
                String price = rs.getString("price");
                String address = rs.getString("Address");
                Date deliver = rs.getDate("Deliver");
                String total = rs.getString("Total");
                boolean method = rs.getBoolean("Method");
                Report.Report_entity r = new Report_entity(name, amount, guarantee, price, address, deliver, total, method);
                return r;

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void insert_Re(Report_entity report) {
        try {
            String sql = "INSERT INTO [Payment]\n"
                    + "           ([Name]\n"
                    + "           ,[Amount]\n"
                    + "           ,[Guarantee]\n"
                    + "           ,[Price]\n"
                    + "           ,[Address]\n"
                    + "           ,[Deliver]\n"
                    + "           ,[Total]\n"
                    + "           ,[Method])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, report.getTen_sp());
            statement.setInt(2, report.getSo_luong());
            statement.setString(3, report.getBao_hanh());
            statement.setString(4, report.getGia_sp());
            statement.setString(5, report.getDia_chi());
            statement.setDate(6, report.getGiao_hang());
            statement.setString(7, report.getTong_tien());
            statement.setBoolean(8, report.isPhuong_thuc());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update_Re(Report_entity report) {
        try {
            String sql = "UPDATE [Payment]\n"
                    + "   SET [Amount] = ?\n"
                    + "      ,[Guarantee] = ?\n"
                    + "      ,[Price] = ?\n"
                    + "      ,[Address] = ?\n"
                    + "      ,[Deliver] = ?\n"
                    + "      ,[Total] = ?\n"
                    + "      ,[Method] = ?\n"
                    + " WHERE [Name] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, report.getSo_luong());
            statement.setString(2, report.getBao_hanh());
            statement.setString(3, report.getGia_sp());
            statement.setString(4, report.getDia_chi());
            statement.setDate(5, report.getGiao_hang());
            statement.setString(6, report.getTong_tien());
            statement.setBoolean(7, report.isPhuong_thuc());
            statement.setString(8, report.getTen_sp());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete_Re(Report_entity report) {
        try {
            String sql = "DELETE FROM [Payment]\n"
                    + "      WHERE [Name] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, report.getTen_sp());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

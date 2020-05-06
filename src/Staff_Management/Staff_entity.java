/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff_Management;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Staff_entity {
    String id_nv;
    String ten_nv;
    Date date_nv;
    boolean gt_nv;
    String diachi_nv;
    int sdt_nv;

    public Staff_entity() {
    }

    public Staff_entity(String id_nv, String ten_nv, Date date_nv, boolean gt_nv, String diachi_nv, int sdt_nv) {
        this.id_nv = id_nv;
        this.ten_nv = ten_nv;
        this.date_nv = date_nv;
        this.gt_nv = gt_nv;
        this.diachi_nv = diachi_nv;
        this.sdt_nv = sdt_nv;
    }

    public String getId_nv() {
        return id_nv;
    }

    public void setId_nv(String id_nv) {
        this.id_nv = id_nv;
    }

    public String getTen_nv() {
        return ten_nv;
    }

    public void setTen_nv(String ten_nv) {
        this.ten_nv = ten_nv;
    }

    public Date getDate_nv() {
        return date_nv;
    }

    public void setDate_nv(Date date_nv) {
        this.date_nv = date_nv;
    }

    public boolean isGt_nv() {
        return gt_nv;
    }

    public void setGt_nv(boolean gt_nv) {
        this.gt_nv = gt_nv;
    }

    public String getDiachi_nv() {
        return diachi_nv;
    }

    public void setDiachi_nv(String diachi_nv) {
        this.diachi_nv = diachi_nv;
    }

    public int getSdt_nv() {
        return sdt_nv;
    }

    public void setSdt_nv(int sdt_nv) {
        this.sdt_nv = sdt_nv;
    }

    
    
    
}

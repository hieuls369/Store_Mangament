/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Report_entity{
    String ten_sp;
    int so_luong;
    String bao_hanh;
    String gia_sp;
    String dia_chi;
    Date giao_hang;
    String tong_tien;
    boolean phuong_thuc;

    public Report_entity() {
    }

    public Report_entity(String ten_sp, int so_luong, String bao_hanh, String gia_sp, String dia_chi, Date giao_hang, String tong_tien, boolean phuong_thuc) {
        this.ten_sp = ten_sp;
        this.so_luong = so_luong;
        this.bao_hanh = bao_hanh;
        this.gia_sp = gia_sp;
        this.dia_chi = dia_chi;
        this.giao_hang = giao_hang;
        this.tong_tien = tong_tien;
        this.phuong_thuc = phuong_thuc;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String getBao_hanh() {
        return bao_hanh;
    }

    public void setBao_hanh(String bao_hanh) {
        this.bao_hanh = bao_hanh;
    }

    public String getGia_sp() {
        return gia_sp;
    }

    public void setGia_sp(String gia_sp) {
        this.gia_sp = gia_sp;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public Date getGiao_hang() {
        return giao_hang;
    }

    public void setGiao_hang(Date giao_hang) {
        this.giao_hang = giao_hang;
    }

    public String getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(String tong_tien) {
        this.tong_tien = tong_tien;
    }

    public boolean isPhuong_thuc() {
        return phuong_thuc;
    }

    public void setPhuong_thuc(boolean phuong_thuc) {
        this.phuong_thuc = phuong_thuc;
    }

    
    
    
    
}

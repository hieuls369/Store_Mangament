/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product_Management;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Product_entity {
    String ma_sp;
    String loai_sp;
    String ten_sp;
    String hang_sp;
    String bao_hanh;
    String gia_sp;
    int slg_sp;
    String duong_dan;

    public Product_entity() {
    }

    public Product_entity(String ma_sp, String loai_sp, String ten_sp, String hang_sp, String bao_hanh, String gia_sp, int slg_sp, String duong_dan) {
        this.ma_sp = ma_sp;
        this.loai_sp = loai_sp;
        this.ten_sp = ten_sp;
        this.hang_sp = hang_sp;
        this.bao_hanh = bao_hanh;
        this.gia_sp = gia_sp;
        this.slg_sp = slg_sp;
        this.duong_dan = duong_dan;
    }

    public String getMa_sp() {
        return ma_sp;
    }

    public void setMa_sp(String ma_sp) {
        this.ma_sp = ma_sp;
    }

    public String getLoai_sp() {
        return loai_sp;
    }

    public void setLoai_sp(String loai_sp) {
        this.loai_sp = loai_sp;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public String getHang_sp() {
        return hang_sp;
    }

    public void setHang_sp(String hang_sp) {
        this.hang_sp = hang_sp;
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

    public int getSlg_sp() {
        return slg_sp;
    }

    public void setSlg_sp(int slg_sp) {
        this.slg_sp = slg_sp;
    }

    public String getDuong_dan() {
        return duong_dan;
    }

    public void setDuong_dan(String duong_dan) {
        this.duong_dan = duong_dan;
    }

   
}

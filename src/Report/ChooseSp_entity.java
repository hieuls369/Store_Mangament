/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

/**
 *
 * @author admin
 */
public class ChooseSp_entity {
    String ten;
    String baohanh;
    String gia;

    public ChooseSp_entity() {
    }

    public ChooseSp_entity(String ten, String baohanh, String gia) {
        this.ten = ten;
        this.baohanh = baohanh;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getBaohanh() {
        return baohanh;
    }

    public void setBaohanh(String baohanh) {
        this.baohanh = baohanh;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
    
}

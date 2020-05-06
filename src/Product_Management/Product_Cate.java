/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product_Management;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Product_Cate {
    String loai;

    public Product_Cate() {
    }

    public Product_Cate(String loai) {
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    public String toString(){
        return ""+loai;
    }
    
}

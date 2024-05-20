/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan8_9;

public class GeometricObject {
    private String warna = "putih";
    private boolean diisi;

    
    public GeometricObject() {
    }

    
    public GeometricObject(String warna, boolean diisi) {
        this.warna = warna;
        this.diisi = diisi;
    }

    
    public String getWarna() {
        return warna;
    }

    
    public void setWarna(String warna) {
        this.warna = warna;
    }

   
    public boolean isDiisi() {
        return diisi;
    }

    
    public void setDiisi(boolean diisi) {
        this.diisi = diisi;
    }

    
    @Override
    public String toString() {
        return "ObjekGeometris: warna = " + warna + " diisi = " + diisi;
    }
}

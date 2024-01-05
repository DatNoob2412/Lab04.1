package com.example.lab041;

// MonHoc.java
public class MonHoc {
    private int tenHinh;
    private String maHP;
    private String tenHP;
    private String tenGV;

    public MonHoc(int tenHinh, String maHP, String tenHP, String tenGV) {
        this.tenHinh = tenHinh;
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.tenGV = tenGV;
    }

    public int getTenHinh() {
        return tenHinh;
    }

    public String getMaHP() {
        return maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public String getTenGV() {
        return tenGV;
    }
}

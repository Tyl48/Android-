package com.example.chbangiay;

public class Loaisp {
    public int id;
    public String Tenloaisp;
    public String Hinhanhloaisp;

    public Loaisp(int id, String tenloaisp, String hinhanhloaisp) {
        this.id = id;
        Tenloaisp = tenloaisp;
        Hinhanhloaisp = hinhanhloaisp;
    }

    public int getId() {
        return id;
    }

    public String getTenloaisp() {
        return Tenloaisp;
    }

    public String getHinhanhloaisp() {
        return Hinhanhloaisp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTenloaisp(String tenloaisp) {
        Tenloaisp = tenloaisp;
    }

    public void setHinhanhloaisp(String hinhanhloaisp) {
        Hinhanhloaisp = hinhanhloaisp;
    }
}

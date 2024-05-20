/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Lenovo
 */
public class objekGeometris {
    private String warna;
    private boolean terisi = false;

    public objekGeometris() {
    }

    public objekGeometris(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    public String getWarna() {
        return warna;
    }

    public boolean isTerisi() {
        return terisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

}

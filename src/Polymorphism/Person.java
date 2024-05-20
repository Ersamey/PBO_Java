/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Lenovo
 */
public class Person {
    protected String nama;
    protected String alamat;
    protected String noTelp;
    protected String email;

    public Person() {
    }

    public Person(String nama, String alamat, String noTelp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    public String toString() {
        return "Person{" + "nama=" + nama + ", alamat=" + alamat + ", noTelp=" + noTelp + ", email=" + email + '}';
    }
}

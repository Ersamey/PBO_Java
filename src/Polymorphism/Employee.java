/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    // protected tanggalBekerja;
    protected LocalDate tanggalBekerja;

    public Employee() {
    }

    public Employee(String kantor, double gaji, LocalDate tanggalBekerja, String nama, String alamat, String noTelp,
            String email) {
        super(nama, alamat, noTelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalBekerja = tanggalBekerja;
    }

    public String toString() {
        return "Employee{" + "nama=" + super.nama + ", alamat=" + super.alamat + ", noTelp=" + super.noTelp + ", email="
                + super.email + ", kantor=" + kantor + ", gaji=" + gaji + ", tanggalBekerja=" + tanggalBekerja + '}';
    }

}

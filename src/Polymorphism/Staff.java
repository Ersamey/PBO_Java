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
public class Staff extends Employee {
    // Seorang anggota staf memiliki gelar.
    private String gelar;

    public Staff() {
    }

    public Staff(String kantor, double gaji, LocalDate tanggalBekerja, String nama, String alamat, String noTelp,
            String email, String gelar) {
        super(kantor, gaji, tanggalBekerja, nama, alamat, noTelp, email);
        this.gelar = gelar;
    }

    public String toString() {
        return "Staff{" + "nama=" + super.nama + ", alamat=" + super.alamat + ", noTelp=" + super.noTelp + ", email="
                + super.email + ", kantor=" + super.kantor + ", gaji=" + super.gaji + ", tanggalBekerja="
                + super.tanggalBekerja + ", gelar=" + gelar + '}';
    }
}

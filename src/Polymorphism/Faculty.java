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
public class Faculty extends Employee {
    // Seorang anggota fakultas memiliki jam kerja dan pangkat.
    private int jamKerja;
    private String pangkat;

    public Faculty() {
    }

    public Faculty(String kantor, double gaji, LocalDate tanggalBekerja, String nama, String alamat, String noTelp,
            String email, int jamKerja, String pangkat) {
        super(kantor, gaji, tanggalBekerja, nama, alamat, noTelp, email);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    public String toString() {
        return "Faculty{" + "nama=" + super.nama + ", alamat=" + super.alamat + ", noTelp=" + super.noTelp + ", email="
                + super.email + ", kantor=" + super.kantor + ", gaji=" + super.gaji + ", tanggalBekerja="
                + super.tanggalBekerja + ", jamKerja=" + jamKerja + ", pangkat=" + pangkat + '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Lenovo
 */
public class Student extends Person {
    // Seorang siswa memiliki status kelas (mahasiswa baru, mahasiswa tahun
    // kedua, junior, atau senior). Tentukan status sebagai konstanta.
    public static final String Status[] = { "Mahasiswa baru ", "Mahasiswa tahun kedua", "Junior", "Senior" };
    private int status;

    public Student() {
    }

    public Student(String nama, String alamat, String noTelp, String email, int status) {
        super(nama, alamat, noTelp, email);
        this.status = status;
    }

    public String toString() {
        return "Student{" + "nama=" + super.nama + ", alamat=" + super.alamat + ", noTelp=" + super.noTelp
                + ", email=" + super.email + ", status=" + Status[status] + '}';
    }

}

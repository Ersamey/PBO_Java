package Polymorphism;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // program pengujian yang membuat Person, Student, Employee, Faculty, dan Staff,
        // dan memanggil metode toString() mereka.
        Scanner input = new Scanner(System.in);

        // Input data Person
        System.out.println("Input data Person");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("No Telp: ");
        String noTelp = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        Person person = new Person(nama, alamat, noTelp, email);

        // Input data Student
        System.out.println("Input data Student");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("No Telp: ");
        noTelp = input.nextLine();
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Status: \n1. Mahasiswa Baru\n2. Mahasiswa Tahun Kedua\n3. Junior\n4. Senior\n");
        int status = input.nextInt();
        input.nextLine(); // Mengonsumsi karakter newline yang tersisa
        Student student = new Student(nama, alamat, noTelp, email, status);

        // Input data Employee
        System.out.println("Input data Employee");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("No Telp: ");
        noTelp = input.nextLine();
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Kantor: ");
        String kantor = input.nextLine();
        System.out.print("Gaji: ");
        double gaji = input.nextDouble();
        input.nextLine(); // Mengonsumsi karakter newline yang tersisa
        System.out.print("Tanggal Bekerja: \n");
        System.out.print("Masukan Tahun (int): ");
        int tahun = input.nextInt();
        System.out.print("Masukan Bulan (int): ");
        int bulan = input.nextInt();
        System.out.print("Masukan Hari (int): ");
        int hari = input.nextInt();
        input.nextLine(); // Mengonsumsi karakter newline yang tersisa
        LocalDate tanggalBekerja = LocalDate.of(tahun, bulan, hari);

        Employee employee = new Employee(kantor, gaji, tanggalBekerja, nama, alamat, noTelp, email);

        // Input data Faculty
        System.out.println("Input data Faculty");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("No Telp: ");
        noTelp = input.nextLine();
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Kantor: ");
        kantor = input.nextLine();
        System.out.print("Gaji: ");
        gaji = input.nextDouble();
        input.nextLine(); // Mengonsumsi karakter newline yang tersisa
        System.out.print("Tanggal Bekerja: \n");
        System.out.print("Masukan Tahun (int): ");
        tahun = input.nextInt();
        System.out.print("Masukan Bulan (int): ");
        bulan = input.nextInt();
        System.out.print("Masukan Hari (int): ");
        hari = input.nextInt();
        input.nextLine(); // Mengonsumsi karakter newline yang tersisa
        tanggalBekerja = LocalDate.of(tahun, bulan, hari);
        System.out.println("Jam Kerja (int): ");
        int jamKerja = input.nextInt();
        input.nextLine(); // Mengonsumsi karakter newline yang tersisa
        System.out.println("Pangkat: ");
        String pangkat = input.nextLine();
        Faculty faculty = new Faculty(kantor, gaji, tanggalBekerja, nama, alamat, noTelp, email, jamKerja, pangkat);

        // Input data Staff
        System.out.println("Input data Staff");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("No Telp: ");
        noTelp = input.nextLine();
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Kantor: ");
        kantor = input.nextLine();
        System.out.print("Gaji: ");
        gaji = input.nextDouble();
        input.nextLine(); // Mengonsumsi karakter newline yang tersisa
        System.out.print("Tanggal Bekerja: \n");
        System.out.print("Masukan Tahun (int): ");
        tahun = input.nextInt();
        System.out.print("Masukan Bulan (int): ");
        bulan = input.nextInt();
        System.out.print("Masukan Hari (int): ");
        hari = input.nextInt();
        input.nextLine(); // Mengonsumsi karakter newline yang tersisa
        tanggalBekerja = LocalDate.of(tahun, bulan, hari);
        System.out.println("Pangkat: ");
        pangkat = input.nextLine();
        String gelar = input.nextLine();
        Staff staff = new Staff(kantor, gaji, tanggalBekerja, nama, alamat, noTelp, email, gelar);

        // Output data Person
        System.out.println(person.toString());
        // Output data Student
        System.out.println(student.toString());
        // Output data Employee
        System.out.println(employee.toString());
        // Output data Faculty
        System.out.println(faculty.toString());
        // Output data Staff
        System.out.println(staff.toString());

    }
}

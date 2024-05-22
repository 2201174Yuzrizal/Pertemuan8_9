/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String nomorTelepon, 
            String alamatEmail, String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, nomorTelepon, alamatEmail);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    public String getKantor() {
        return kantor;
    }

    public void setKantor(String kantor) {
        this.kantor = kantor;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public MyDate getTanggalDipekerjakan() {
        return tanggalDipekerjakan;
    }

    public void setTanggalDipekerjakan(MyDate tanggalDipekerjakan) {
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return "Employee" + "\n" + super.toString() + "\n" +
               "Kantor: " + kantor + "\n" +
               "Gaji: " + gaji + "\n" +
               "Tanggal Dipekerjakan: " + tanggalDipekerjakan;
    }
}

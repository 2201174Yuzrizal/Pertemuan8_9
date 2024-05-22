/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

public class Faculty extends Employee {
    private String jamKantor;
    private String pangkat;

    public Faculty(String nama, String alamat, String nomorTelepon, 
            String alamatEmail, String kantor, double gaji, 
            MyDate tanggalDipekerjakan, String jamKantor, String pangkat) {
        super(nama, alamat, nomorTelepon, alamatEmail, kantor, gaji, tanggalDipekerjakan);
        this.jamKantor = jamKantor;
        this.pangkat = pangkat;
    }

    public String getJamKantor() {
        return jamKantor;
    }

    public void setJamKantor(String jamKantor) {
        this.jamKantor = jamKantor;
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Faculty" + "\n" + super.toString() + "\n" +
               "Jam Kantor: " + jamKantor + "\n" +
               "Pangkat: " + pangkat;
    }
}

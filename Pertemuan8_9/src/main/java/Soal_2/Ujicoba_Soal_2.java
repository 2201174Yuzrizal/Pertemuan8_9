/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

public class Ujicoba_Soal_2 {

    public static void main(String[] args) {
        Person person = new Person("yuz", "Jalan Kawung 245",
                "081863468473", "yuz@example.com");
        Student student = new Student("Rizal", "Jalan Merauke 123",
                "089635735282", "rizal@example.com", Student.MARU);
        Employee employee = new Employee("hidayat", "Jalan jatihandap 90",
                "081376543210", "hidayat@example.com", "Kantor Pusat",
                7000000, new MyDate(2022, 1, 10)); // January is 0
        Faculty faculty = new Faculty("dayat", "Jalan dago 945",
                "0897637364441", "dayat@example.com", "Kantor Fakultas",
                15000000, new MyDate(), "9am - 5pm", "Professor");
        Staff staff = new Staff("usep", "Jalan lurus 927",
                "0893574657772", "usep@example.com", "Kantor Administrasi",
                5000000, new MyDate(2024, 5, 10), "Manager");

        System.out.println(person);
        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.println(faculty);
        System.out.println();
        System.out.println(staff);
    }
    
}
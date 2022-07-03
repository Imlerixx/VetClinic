import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Person {

    protected static Scanner s = new Scanner(System.in);

    private  double appointmentCost;

    public Doctor(long id, String name, int age, double appointmentCost) {
        super(id, name, age);
        this.appointmentCost = appointmentCost;
    }


    public double getAppointmentCost() {
        return appointmentCost;
    }

    public void setAppointmentCost(double appointmentCost) {
        this.appointmentCost = appointmentCost;
    }




    /////////////////////////////////////////////
    /////////////////////////////////////////////




     static ArrayList<String> doctors = new ArrayList<>();
     static final ArrayList<Integer> idDoctors = new ArrayList<>();

    public static void setDoctors() { //добавление доктора
        System.out.print("Напишите ФИО доктора для добавления: ");
        String name = s.nextLine();
        doctors.add(name);
        int id = doctors.size();
        idDoctors.add(id - 1);
        System.out.println("Вы добавили доктора: " + name);

    }

    public static int getDoctors() { //вывод докторов

            for (int i = 0; i < doctors.size(); i++) {
                System.out.print(idDoctors.get(i) + " " +  doctors.get(i) + "\n");

        }
        return 1;
    }

    public static void changeDoctors() { //изменение докторов

            getDoctors();
            System.out.print("Напишите номер доктора по списку, начиная с 0, фио которого хотите изменить: ");
            int number = s.nextInt();
            System.out.println("Вы изменяете врача: " + doctors.get(number)); //не работает
            System.out.print("Напишите новое фио доктора: "); //после этой фразы сразу выводиться та, с первой строчки метода
            String name = s.nextLine();
            name = s.nextLine();
            doctors.set(number, name);

    }

    public static void removeDoctors() { //удаление докторов

            getDoctors();
            System.out.println("Напишите номер доктора, ФИО которого хотите удалить: ");
            int number = s.nextInt();
            System.out.println("Вы удаляете: " + doctors.get(number));
            doctors.remove(number);
    }



}



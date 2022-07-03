import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class OwnerPet extends Person {

    protected static Scanner s = new Scanner(System.in);

    private String pet;
    private LocalDate registrationDate;
    private LocalTime registrationTime;


    public OwnerPet(long id, String name, int age, String pet) {
        super(id, name, age);

        this.pet = pet;
        this.registrationDate = registrationDate;
        this.registrationTime = registrationTime;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalTime registrationTime) {
        this.registrationTime = registrationTime;
    }





    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////



    static ArrayList<String> owner = new ArrayList<>();
     static final ArrayList<Integer> idOwner = new ArrayList<>();
     static final ArrayList<String> dateOwner = new ArrayList<>();
     static final ArrayList<String> pets = new ArrayList<>();




    public static void setOwner() { //добавление клиентов
        System.out.print("Напишите ФИО пациента для добавления: ");
        String name = s.nextLine();
        System.out.print("Напишите животное пациента: ");
        String pet = s.nextLine();
        getDate();
        owner.add(name);
        pets.add(pet);
        int id = owner.size();
        idOwner.add(id-1);
        dateOwner.add(getDate());
        System.out.println("Вы добавили пациента: " + name + "  с животным: " + pet);
    }

    public static void removeOwner() {//удаление клиента
        getOwner();
        System.out.println("Напишите номер клиента, которого хотите удалить: ");
        int number = s.nextInt();
        System.out.println("Вы удаляете пациента: " + owner.get(number));
        idOwner.remove(number);
        owner.remove(number);
        dateOwner.remove(number);
        pets.remove(number);
    }

    public static String getOwner() { //вывод клиентов

        for(int i = 0; i < idOwner.size(); i++) {
            System.out.print(idOwner.get(i) + " " + owner.get(i) + " " + pets.get(i) + " Дата регистрации: " + dateOwner.get(i) + "\n" );

        }
        return (" ");
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void changeOwner() { //изменение клиента

            getOwner();
            System.out.print("Напишите номер клиента по списку, начиная с 0, ФИО которого хотите изменить: ");
            int number = s.nextInt();
            System.out.println("Вы изменяете клиента: " + owner.get(number));
            System.out.print("Напишите новое ФИО клиента: ");
            String name = s.nextLine();
            name = s.nextLine();
            owner.set(number, name);


    }
}

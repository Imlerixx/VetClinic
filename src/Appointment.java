import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Appointment {



    private long id;
    private long ownerPetId;
    private long doctorId;
    private StatusAppointment status;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;

    public Appointment(long id, long ownerPetId, long doctorId, StatusAppointment status, LocalDate appointmentDate, LocalTime appointmentTime) {
        this.id = id;
        this.ownerPetId = ownerPetId;
        this.doctorId = doctorId;
        this.status = status;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOwnerPetId() {
        return ownerPetId;
    }

    public void setOwnerPetId(long ownerPetId) {
        this.ownerPetId = ownerPetId;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public StatusAppointment getStatus() {
        return status;
    }

    public void setStatus(StatusAppointment status) {
        this.status = status;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }



    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////



    private static final ArrayList<String> appointmentOwners = new ArrayList<>();
    private static final ArrayList<String> appointmentDoctors = new ArrayList<>();
    private static final ArrayList<String> time = new ArrayList<>();
    private static final ArrayList<String> statuss = new ArrayList<>();

     static Scanner s = new Scanner(System.in);


    public static void setAppointments() { //добавление приемов
        System.out.println("Список зарегестрированных клиентов: ");
        System.out.println(OwnerPet.getOwner());
        System.out.print("Введите id клиента для записи: ");
        int number = s.nextInt();
        System.out.println(Doctor.getDoctors());
        System.out.print("Введите id доктора для записи: ");
        int id = s.nextInt();
        System.out.print("Введите время записи на прием в формате \"dd-MM HH:mm\": ");
        String timeDate = s.nextLine();
        timeDate = s.nextLine();

            appointmentOwners.add(OwnerPet.owner.get(number));
            appointmentDoctors.add(Doctor.doctors.get(id));
            time.add(timeDate);
            statuss.add("Новый");

    }

    public static void getAppointments() { //просмотр приемов

            for(int i = 0; i < appointmentOwners.size(); i++) {
                System.out.print("Клиент: " + appointmentOwners.get(i));
                System.out.print(" Доктор: " + appointmentDoctors.get(i));
                System.out.print(" Время приема: " + time.get(i));
                System.out.print(" Статус приема: " + statuss.get(i) + "\n");

        }

    }

    public static void removeAppoint() { // удаление приемов
        getAppointments();
        System.out.print("Напишите номер приема, начиная с 0, для удаления: ");
        int number = s.nextInt();
        appointmentOwners.remove(number);
        appointmentDoctors.remove(number);
        time.remove(number);
        statuss.remove(number);
    }

    public static void changeAppoint() { // изменение статуса приемов
        getAppointments();
        System.out.print("Напишите номер приема, начиная с 0, статус которого хотите изменить: ");
        int number = s.nextInt();
        System.out.println("Список статусов: новый, в процессе, отменен, ожидает оплаты, завершен.");
        System.out.print("Выберете и напишите статус в следующую строку для изменения: ");
        String status1 = s.nextLine();
        status1 = s.nextLine();
        statuss.set(number,status1);
    }



}

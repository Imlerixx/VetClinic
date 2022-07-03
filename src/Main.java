import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    // Здравствуйте. Логин:Artem  Пароль:1234
    // Сделать по примеру из урока не очень получилось, не до конца разобрался с конструкторами, почему-то после добавления в ArrayList некорректно выводилась информация.
    // Все рабочие методы в классах после слешей(///). В main пытался что-то сделать с вложенным switch в другой switch, но не смог придумать как возвращаться к началу внешнего switch.
    // В итоге получился switch с ifами. Вышло корявенько, но техническому заданию соответствует.



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int code = Authentication.authenticate();
        if(code == 0){
            System.out.println("Вход выполнен");
        }
        else
        {
            System.out.println("Ошибка входа, попробуйте еще раз");
            return;
        }



        int externalCycle =1;




        while(externalCycle == 1){

            System.out.println("Выберите пункт меню, где 1 - работа с докторами, 2 - работа с клиентами, 3 - работа с приемами");
            int switchVariable = s.nextInt();

            switch (switchVariable) {

                case 1: //пункт работы с докторами
                    int internalCycle1 = 1;
                    while (internalCycle1 == 1) {

                        System.out.println("Вы выбрали пункт работы с докторами. 1 - просмотр докторов, 2 - добавление докторов, 3 - удаление докторов, 4 - изменение докторов");
                        int a1 = s.nextInt();
                        if (a1 == 1) {
                            Doctor.getDoctors();
                        }
                        if (a1 == 2) {
                            Doctor.setDoctors();
                        }
                        if (a1 == 3) {
                            Doctor.removeDoctors();
                        }
                        if (a1 == 4) {
                            Doctor.changeDoctors();
                        }
                        System.out.println("Нажмите 1, чтобы продолжить работу с докторами, 0 чтобы выйти из меню докторов");
                        internalCycle1 = s.nextInt();
                    }
                    break;


                case 2: //пункт работы с клиентами
                    int internalCycle2 = 1;
                    while (internalCycle2 == 1) {

                        System.out.println("Вы выбрали пункт работы с клиентами. 1 - просмотр клиентов, 2 - добавление клиентов, 3 - удаление клиентов, 4 - изменение клиентов");
                        int a2 = s.nextInt();
                        if (a2 == 1) {
                            OwnerPet.getOwner();
                        }
                        if (a2 == 2) {
                            OwnerPet.setOwner();
                        }
                        if (a2 == 3) {
                            OwnerPet.removeOwner();
                        }
                        if (a2 == 4) {
                            OwnerPet.changeOwner();
                        }
                        System.out.println("Нажмите 1, чтобы продолжить работу с клиентами, 0 чтобы выйти из меню клиентов");
                        internalCycle2 = s.nextInt();

                    }
                    break;


                case 3: // пункт работы с приемами
                    int internalCycle3 = 1;
                    while (internalCycle3 == 1) {
                        System.out.println("Вы выбрали пункт работы с приемами.  1 - добавить новый прием, 2 - посмотреть приемы, 3 - удалить прием, 4 - изменить прием");
                        int a3 = s.nextInt();
                        if(a3 == 1) {
                            Appointment.setAppointments();
                        }
                        if(a3 == 2){
                            Appointment.getAppointments();
                        }
                        if(a3 == 3){
                            Appointment.removeAppoint();
                        }
                        if(a3 == 4){
                            Appointment.changeAppoint();
                        }

                        System.out.println("Нажмите 1, чтобы продолжить работу с приемами, 0 чтобы выйти из меню приемов");
                        internalCycle3 = s.nextInt();
                    }
                    break;




                default:
                    System.out.println("Вы выбрали несуществующий номер меню");
            }


            System.out.println("Введите 1 для продолжения работы, 0 для выхода из программы");
            externalCycle = s.nextInt();
        }






    }
}

import com.sun.security.jgss.GSSUtil;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();


    }

    private static void task9() {
        //Задание 9
        int one = 5;
        int two = 10;
        int free = 8;
        if (one > two && one > free){
            System.out.println(one);
        } else if (two > one && two > free){
            System.out.println(two);
        } else {
            System.out.println(free);
        }
    }

    private static void task8() {
        //Задание 8
        int age = 10;
        boolean childForbidden = age < 5;
        boolean childCanLimitation = age >= 5 && age < 14;
        boolean childCan = age >= 14;
        if (childForbidden) {
            System.out.println("Ребенку нельзя кататься на аттракционе");
        } else if (childCanLimitation) {
                System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else if (childCan) {
                System.out.println("Ребенок может кататься на аттракционах без сопровождения взрослого");
            }
        }


    private static void task7() {
        //Задание 7
        int age = 9;
        boolean ageKindergarten = age >= 2 && age <= 6;
        boolean ageSchool = age >= 7 && age <= 18;
        boolean ageUniversity = age > 18 && age <= 24;
        boolean ageWork = age > 24;
        if (ageKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (ageSchool) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else if (ageUniversity) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
            } else if (ageWork) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");

            }
        }



    private static void task6() {
        //Задание 6
        int place = 102;
        int seatPlace = 60;
        int standPlace = place - seatPlace;
        int people = 35;
        if (people >= place) {
            System.out.println("Мест нет!!!");
        } else {
            System.out.println("Еще есть свободные места");
            if (people >= seatPlace && people < place) {
                int standLeft = place - people;
                System.out.println("Осталось стоячих мест " + standLeft + ". Сидячих мест нет");
            } else {
                int seatsLeft = seatPlace - people;
                System.out.println("Осталос сидячих мест " + seatsLeft + ". Стоячих мест " + standPlace);
            }

        }
    }

    private static void task5() {
        //Задание 5
        int age = 5;
        if (age >= 7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Ребенок пока не ходит в школу");
        }
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Закончил школу и может отправляться в университет");
        } else {
            System.out.println("Еще учится в школе и пока рано в университет");
        }
        int age2 = 20;
        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Человек не закончил университет. Пока рано искать работу");
        }


    }

    private static void task4() {
        //Задание 4
        int age = 22;
        if (age >= 18) {
            System.out.println("Поздравляю с совершенолетием");
        } else {
            System.out.println("Совершеннолетия ещё не наступил, нужно немного подождать.");
        }
    }


    private static void task3() {
        //Задание 3
        int place = 102;
        int seatPlace = 60;
        int standPlace = place - seatPlace;
        int people = 87;
//        Scanner in = new Scanner(System.in);
//        people = Integer.parseInt(in.nextLine());
//        System.out.println("Введите значение " + people);
        int seatsLeft = seatPlace - people;
        int standLeft = people - standPlace;
        if (people >= place) {
            System.out.println("Мест нет!!!");
        }
        if (people >= seatPlace && people < place) {
            System.out.println("Осталось стоячих мест " + standLeft + ". Сидячих мест нет");
        }
        if (people < seatPlace) {
            System.out.println("Осталос сидячих мест " + seatsLeft + ". Стоячих мест " + standPlace);
        }

    }

    private static void task2() {
        //Задание 2
        int age = 7;
        if (age >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Закончил школу и может отправляться в университет");
        }
        int age2 = 24;
        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

    }

    private static void task1() {
        //Задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляю с совершенолетием");
        }
        if (age < 18) {
            System.out.println("Совершеннолетия ещё не наступил, нужно немного подождать.");
        }
    }

}
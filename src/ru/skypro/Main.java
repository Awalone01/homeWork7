package ru.skypro;

public class Main {

    public static void main(String[] args) {
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";

        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        String upperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperCase);

        String repStr1 = fullName.replace(firstName + " " + middleName + " " + lastName, firstName + ';' + " " +
                middleName + ';' + " " + lastName + ';');
        System.out.println("Данные ФИО сотрудника для административного отдела — " + repStr1);

        String repStr2 = fullName.replace("ё", "е");
        System.out.println(repStr2);
    }
}

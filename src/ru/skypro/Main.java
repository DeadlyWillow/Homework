package ru.skypro;

public class Main {
    public static void main(String[] args) {    
        int value = 33;
        changeValue(value);
        System.out.println(value);

        changeValueInteger(value);
        System.out.println(value);

        Integer[] valueArray = {3, 4};
        changeValueArray(valueArray);
        System.out.println(valueArray[0] + ", " +valueArray[1]);

        changeValueIntegerArray(valueArray);
        System.out.println(valueArray[0] + ", " +valueArray[1]);

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

        Person person1 = new Person("Lyapis", "Trubetskoy");
        changePerson(person1);
        System.out.println(person1);
    }

    public static int changeValue(int value) {
        value = 22;
        return value;
    }

    public static Integer changeValueInteger(Integer value) {
        value = 22;
        return value;
    }

    public static Integer[] changeValueArray(Integer[] value) {
        Integer[] valueInteger = {1, 2};
        return valueInteger;
    }

    public static Integer[] changeValueIntegerArray(Integer[] value) {
        Integer[] valueInteger = {99};
        return valueInteger;
    }

    public static String changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        Person person1 = new Person("Ilya", "Lagutenko");
        return null;
    }
}
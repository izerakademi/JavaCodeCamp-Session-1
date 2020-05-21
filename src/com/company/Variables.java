package com.company;

public class Variables {

    public static void main(String[] args) {
        System.out.println("Hello World");
        // CTRL + ALT + L
        // Integer Types Variables - Tam Sayı Değişkenleri

        byte number = 10; // 1 byte -128 to 127
        System.out.println("Byte Type Number : " + number);

        short number2 = 100; // 2 bytes -32,768 to 32,767
        System.out.println("Short Type Number : " + number2);

        int number3 = 100000; // 4 bytes -2,147,483,648 to 2,147,483,647
        System.out.println("Integer Type Number : " + number3);

        long number4 = 1000000000; // 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Long Type Number : " + number4);

        // Floating Types Variables - Ondalıklı Sayı Değişkenleri

        float number5 = 5.75f; // 4 bytes 7 decimal digits
        System.out.println("Floating Type Number : " + number5);

        double number6 = 19.99; // 8 bytes 16 decimal digits
        System.out.println("Double Type Number : " + number6);

        // Character Type Variable

        char grade = 'A';
        System.out.println("Character Type Grade: " + grade);

        // Logical Data Types - Mantıksal Veri Tipi

        boolean isCorrect = true;
        System.out.println("Boolean Type : " + isCorrect);
        isCorrect = false;
        System.out.println("Boolean Type : " + isCorrect);

        // Strings - Metinsel Veri Tipi
        // https://tr.lipsum.com/
        System.out.println("**************************");
        String firstName = "Mehmet";
        System.out.println("Firstname : " + firstName);
        String text = "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. " +
                "Lorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak" +
                " üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı" +
                " sahte metinler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış," +
                " aynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır. 1960'larda Lorem Ipsum pasajları" +
                " da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker gibi Lorem " +
                "Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.contains("yıl"));
        System.out.println(!text.isEmpty());
        System.out.println(text.length());

    }
}

/**
 Напишите программу которая принимает строку из консоли,
 сохраняет каждую новую строку в файл,
 потом считывает ее из файла и выводит в консоль.
 Вывод должен быть примерно таким:

 I see trees of green, red roses too
 I see trees of green, red roses too

 I see them bloom for me and you
 I see trees of green, red roses too
 I see them bloom for me and you


 And I think to myself
 I see them bloom for me and you
 I see trees of green, red roses too
 And I think to myself


 What a wonderful world.
 I see them bloom for me and you
 I see trees of green, red roses too
 And I think to myself
 What a wonderful world.
 **/


package com.madbad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine() + "\n";
            System.out.println("Продолжите вводить текст, для выхода введите exit");

            if(str.equals("exit" + "\n")) {
                break;
            } else {

                File file = new File("test.txt");
                FileOutputStream fos = new FileOutputStream(file, true);

                fos.write(str.getBytes());

                FileInputStream fis = new FileInputStream(file);
                int i;
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
                fos.close();
                fis.close();
            }
        }
    }
}

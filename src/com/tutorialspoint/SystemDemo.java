package com.tutorialspoint;

import java.awt.*;
import java.lang.*;
import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

import static javax.swing.JOptionPane.showMessageDialog;

public class SystemDemo<i> {

    public static void main(String[] args) throws IOException {

        int[] arr1 = { 0, 1, 2, 3, 4, 5 };
        int[] arr2 = { 0, 10, 20, 30, 40, 50 };
        int i;
        char[] karakterer = {'a', 'b', 'c', 'd', 'e' };
        String[] biler = {"Alfaromeo", "Cadylack", "Lada", "Passat CC", "SAAB"};


        // copies an array from the specified source array
        System.arraycopy(arr1, 0, arr2, 0, 1);
        System.out.print("array2 = ");
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.println(arr2[2] + " ");
        showMessageDialog(null, "array2 =\n "+arr2[0]+"\n"+arr2[1]+"\n"+arr2[2]+"\n"+arr2[3]+"\n"+arr2[4], "Tabell", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("c:\\javaprogrammer\\Joptions\\src\\Feeds_Green.PNG"));
        showMessageDialog(null, "array2 =\n "+arr1[0]+"\n"+arr1[1]+"\n"+arr1[2]+"\n"+arr1[3]+"\n"+arr1[4], "Tabell", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("c:\\javaprogrammer\\Systemexit_and_Array_Demo\\src\\nazish dholki bilde.png"));
        System.out.print("     "+karakterer[0] + "\n "+"     "+karakterer[1] + "\n "+"     "+karakterer[2] + "\n "+"     "+karakterer[3] + "\n "+"     "+karakterer[4] + "\n "+"     Thats it .....\n ");
        showMessageDialog(null, "biler =\n "+biler[0]+"\n"+biler[1]+"\n"+biler[2]+"\n"+biler[3]+"\n"+biler[4], "Tabell", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("c:\\Users\\M110800\\profilbilde.jpg"));
        showMessageDialog(null, "biler =\n "+biler[0]+"\n"+biler[1]+"\n"+biler[2]+"\n"+biler[3]+"\n"+biler[4], "Tabell", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("c:\\Temp\\DesktopKeepOnToastImg.gif"));

        for(i = 0;i < 3;i++) {
            if(arr2[i] >= 20) {
                System.out.println("exit... er flyttet til slutten av koden");

            } else {
                System.out.println("arr2["+i+"] = " + arr2[i]);
            }
        }
        showMessageDialog(null, "Åpner en tekst fil ", "En tekstfil", JOptionPane.INFORMATION_MESSAGE);
        //text file, should be opening in default text editor
        File fil = new File("c:\\Temp\\LexPrint1.1.log");
        //first check if Desktop is supported by Platform or not
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }

        showMessageDialog(null, "Åpner flere typer filer med deafult programmner", "Filer", JOptionPane.INFORMATION_MESSAGE);

        Desktop desktop = Desktop.getDesktop();
        if(fil.exists()) desktop.open(fil);

        //let's try to open PDF file
        fil = new File("c:\\Temp\\PowerApp kurs v 01.pdf");
        if(fil.exists()) desktop.open(fil);
        //let's try to open Excell file
        fil = new File("c:\\Temp\\Encoding Time.csv");
        if(fil.exists()) desktop.open(fil);
        //let's try to open Doc file
        fil = new File("c:\\Temp\\DigiHot.docx");
        if(fil.exists()) desktop.open(fil);

        //let's try to open ZIP file :-D  :-D
        fil = new File("c:\\Temp\\jdk-12.0.2_doc-all.zip");
        if(fil.exists()) desktop.open(fil);

        //let's try to open html file
        fil = new File("c:\\Temp\\index.html");
        if(fil.exists()) desktop.open(fil);

        //let's try to open gif file :-D  :-D
        fil = new File("c:\\Temp\\DesktopKeepOnToastImg.gif");
        if(fil.exists()) desktop.open(fil);

        // let`s skrvie en fil
        String data = "Dette vil bri skrevet på en fil, med JAVA, og selvfølgelig skal jeg konvertere det hele til Kotlin :-)";
        int antallLinjer=10000;
        writeUsingFiles(data);
        writeSimpleUsingFiles(antallLinjer);

        //System.exit(0);


    }

    private static void writeUsingFiles(String data) {
        try {
            System.out.println("skriver til fil  c:\\Temp\\fil1.txt");
            Files.write(Paths.get("c:\\Temp\\fil1.txt"), data.getBytes());
        } catch(IOException e){
                e.printStackTrace();
            }
    }

    private static void writeSimpleUsingFiles(int antallLinjer) {
        try {
            System.out.println("skriver til fil  c:\\Temp\\fil2.xls");
            Files.write(Paths.get("c:\\Temp\\fil2.xls"), Collections.singleton(String.valueOf(antallLinjer)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
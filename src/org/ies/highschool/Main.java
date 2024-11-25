package org.ies.highschool;

import org.ies.highschool.componentes.StudentReader;
import org.ies.highschool.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Creacion de componentes
        StudentReader studentReader= new StudentReader(scanner);
        //Ejecucion del programa
        Student datos = studentReader.read();
        //Muestra el resultado
        datos.showInfo();
    }
}
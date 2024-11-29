package br.edu.ifs.academico;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;

        menu.imprimir();
        opcao = sc.nextByte();

        while (opcao!=0) {
            switch (opcao){
                case 1:
                    System.out.println("aluno sendo cadastrado...");
                    break;
                case 2:
                    System.out.println("alunos sendo listados...");
                    break;
                case 3:
                    System.out.println("professor sendo cadastrado...");
                    break;
                case 4:
                    System.out.println("professor sendo listado...");
                    break;
                case 5:
                    System.out.println("pedagogo sendo cadastrado...");
                    break;
                case 6:
                    System.out.println("pedagogo sendo listado...");
                    break;
                case 7:
                    System.out.println("psicologo sendo cadastrado...");
                    break;
                case 8:
                    System.out.println("psicologo sendo listado...");
                    break;
                case 9:
                    System.out.println("tecnico sendo cadastrado...");
                    break;
                case 10:
                    System.out.println("tecnico sendo listado...");
                    break;
                default:
                        System.out.println("OPCAO INCORRETA!");
                        break;

            }
            menu.imprimir();
            opcao = sc.nextByte();
        }
    }
}

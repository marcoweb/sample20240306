package application;

import java.util.ArrayList;
import java.util.Scanner;

import application.model.AbstractAtividade;
import application.model.Compromisso;
import application.model.Tarefa;

public class App {
    private static ArrayList<AbstractAtividade> atividades = new ArrayList<AbstractAtividade>(); 

    private static void displayAtiviades() {
        System.out.println("---[ Atividades ]---");
        for(AbstractAtividade a : atividades) {
            System.out.println(a.getDetails());
        }
    }

    public static void main(String[] args) {
        atividades.add(new Tarefa("Teste de Tarefa"));

        atividades.add(new Compromisso("Exemplo de Compromisso", "06/03/2024", null));
        
        char option = 'l';
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----------------------------");
            System.out.println("(L) para listar as atividades");
            System.out.println("(S) para sair");
            option = sc.next().charAt(0);
            switch (option) {
                case 'l':
                case 'L':
                    displayAtiviades();
                    break;
            
                default:
                    break;
            }
        } while (option != 's' && option != 'S');
        sc.close();
    }
}
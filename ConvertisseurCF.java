package testpackage;

import java.util.Scanner;

public class ConvertisseurCF {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double aConvertir, convertit =0;
        char reponse = ' ', mode = ' ';
        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
        System.out.println("_________________________________________________");
        do {//pour lancer la boucle du programme
            do {//pour lancer la boucle du choix du mode
                System.out.println("Choisissez le mode de conversion");
                System.out.println("1 - C°>F");
                System.out.println("2 - F<C°");
                mode = sc.nextLine().charAt(0); //recupère la réponse
                if (mode != '1' && mode != '2')
                    System.out.println("veuillez ressaisir le mode."); //si mode mal saisi, message
            } while (mode != '1' && mode != '2');//termine la boucle du choix du mode si ok
            System.out.println("Saisir la temperature à convertir");
            aConvertir = sc.nextDouble();//recupère la réponse
            sc.nextLine();//vide la ligne
            if (mode == '1') {
                convertit = (aConvertir * 9 / 5) + 32;
                System.out.print(aConvertir + "C° correspond à ");
                System.out.println(arrondi(convertit, 2) + " C°");
            } else {
                convertit = (aConvertir - 32) * 5 / 9;
                System.out.print(aConvertir + "°F correspond à " );
                System.out.println(arrondi(convertit, 2) + "°F");
            }
            do {//demande pour une nouvelle conversion
                System.out.println("voulez vous faire une nouvelle conversion ? O/N");
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N');//ferme boucle de la demande, se répète tant que O ou N n'ont pas été saisi
        }while (reponse == 'O');//termine la boucle principale du programme
        System.out.println(" au revoir !");

    }public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }}


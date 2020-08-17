package testpackage;

import java.util.Scanner;

public class Mainclass {
    private static Object Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prixGasoil = 1.5, prixEssence = 2, litrage, prixTotal = 0;
        char reponseTypeCarburant = ' ', mode = ' ';
        System.out.println("DISTRIBUTEUR GASOIL OU ESSENCE");
        System.out.println("______________________________");
        do {//pour lancer la boucle du programme
            do {//pour lancer la boucle du choix du type de carburant
                System.out.println("Choisissez le type de carburant");
                System.out.println("1 - gasoil");
                System.out.println("2 - essence");
                reponseTypeCarburant = sc.nextLine().charAt(0); //recupère la réponse
                if (reponseTypeCarburant != '1' && reponseTypeCarburant != '2')
                    System.out.println("veuillez ressaisir le type de carburant."); //si mode mal saisi, message
            } while (reponseTypeCarburant != '1' && reponseTypeCarburant != '2');//termine la boucle du choix du type si ok
            System.out.println("Saisir le litrage voulu");
            litrage = sc.nextDouble();//recupère la réponse
            sc.nextLine();//vide la ligne
            if (reponseTypeCarburant == '1' ) {
                prixTotal = (prixGasoil * litrage);
                System.out.println("vous devez régler " + prixTotal);

            } else {
                prixTotal = (prixEssence * litrage);
                System.out.println("vous devez régler " + prixTotal);
                            }
            do {//demande pour un nouveau plein
                System.out.println("voulez vous faire un nouveau plein ? O/N");
                mode = sc.nextLine().charAt(0);
            } while (mode != 'O' && mode != 'N');//ferme boucle de la demande, se répète tant que O ou N n'ont pas été saisi
        }while (mode == 'O');//termine la boucle principale du programme
        System.out.println(" au revoir !");

        }}

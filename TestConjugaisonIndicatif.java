import java.util.Scanner;

/**
 * @author Meissa Birima Couly Mbaye
 * @since 09/12/18
 * @version 2.0
 * Refactoring 09/01/19
 */
public class TestConjugaisonIndicatif
{
    public static void main(String[] args)
    {
        if(args.length == 2)
        {
            if(args[0].equals("-v") && !args[1].isEmpty()) // or equals(avec chaîne vide)
            {
                if(estDuPremierGroupe(args[1]))
                {
                    ConjugaisonIndicatif c = new ConjugaisonIndicatif(args[1]);
                    System.out.println("------------------------");
                    System.out.println("Le verbe <"+ args[1]+ ">" + " au présent de l'indicatif: ");
                    c.present();
                    System.out.println("------------------------");
                    System.out.println("Le verbe <"+ args[1]+ ">" + " au passé simple de l'indicatif: ");
                    c.passe();
                    System.out.println("------------------------");
                    System.out.println("Le verbe <"+ args[1]+ ">" + " à l'imparfait de l'indicatif: ");
                    c.imparfait();
                    System.out.println("------------------------");
                    System.out.println("Le verbe <"+ args[1]+ ">" + " au futur simple de l'indicatif: ");
                    c.futur();
                } 
                else 
                {
                    System.out.println("Veuillez saisir un verbe du 1er groupe svp ou consultez l'aide (java TestConjugaisonIndicatif -h).");
                }
            }
            else 
            {
                System.out.println("Commande invalide ! Essayer l'option -h ou --h.");
            }
        }
        else if(args.length == 4)
        {
            if(!args[1].isEmpty() && !args[3].isEmpty() && args[0].equals("-v") && args[2].equals("-t"))
            {
                if(estDuPremierGroupe(args[1]))
                {
                    ConjugaisonIndicatif c = new ConjugaisonIndicatif(args[1]);
                
                    switch(args[3])
                    {
                        case "présent": System.out.println("------------------------");
                                        System.out.println("Le verbe <"+ args[1]+ ">" + " au présent de l'indicatif: ");
                                        c.present();
                                        break;
                        case "passé":  System.out.println("------------------------");
                                        System.out.println("Le verbe <"+ args[1]+ ">" + " au passé de l'indicatif: ");
                                        c.passe();
                                        break;
                        case "futur":  System.out.println("------------------------");
                                        System.out.println("Le verbe <"+ args[1]+ ">" + " au futur de l'indicatif: ");
                                        c.futur();
                                        break;
                        case "imparfait": System.out.println("------------------------");
                                        System.out.println("Le verbe <"+ args[1]+ ">" + " à l'imparfait de l'indicatif: ");
                                        c.imparfait();
                                        break;
                        default: System.out.println("Commande invalide ! Essayer l'option -h ou --h.");
                                break;
                    }
                }
                else 
                {
                    System.out.println("Veuillez saisir un verbe du 1er groupe svp ou consultez l'aide (java TestConjugaisonIndicatif -h).");
                }
            }
            else
            {
                System.out.println("Commande invalide ! Essayer l'option -h ou --h.");
            }
        }
        else if(args.length == 1 && (args[0].equals("-h") || args[0].equals("--h") || args[0].equals("--help")))
        {
            System.out.println("Ce programme permet d'effectuer la conjugaison de verbe du premier groupe.");
            System.out.println("Usages: \n\t TestConjugaisonIndicatif –v verbeAConjuguer afin d'afficher la conjugaison de verbeAConjuguer \n\t java TestConjugaisonIndicatif –v verbeAConjuguer –t tempsDeConjugaison");
            System.out.println("Options: \n\t -v <verbeAConjuguer> pour spécifier le verbe à conjuguer \n\t -t <tempsDeConjugaison> afin de spécifier le temps du verbe à conjuguer \n\t -h, --h, --help pour afficher l'aide");
            System.out.println("AUTEUR: \n\t Codé par Meissa Birima Couly Mbaye (itdev) <itdev94@gmail.com> Site Web <http://www.itdev.site>");
            System.out.println("\t\t\t 09 Décembre 2018, M1GLSI");
        }
        else if(args.length == 0)
        {
            String verbe = new String("");
            Scanner sc = new Scanner(System.in);

            while(!estDuPremierGroupe(verbe))
            {
                System.out.println("Quel verbe voulez vous conjuguer ? (verbe du premier groupe svp.)");
                verbe = sc.next();
            }

            ConjugaisonIndicatif c = new ConjugaisonIndicatif(verbe);

            System.out.println("A quel temps ? présent - passé - futur - imparfait ?");
            String temps = sc.next();
            sc.close();

            switch(temps)
                {
                    case "présent": System.out.println("------------------------");
                                    System.out.println("Le verbe <"+ verbe +">" + " au présent de l'indicatif: ");
                                    c.present();
                                    break;
                    case "passé": System.out.println("------------------------");
                                    System.out.println("Le verbe <"+ verbe + ">" + " au passé de l'indicatif: ");
                                    c.passe();
                                    break;
                    case "futur": System.out.println("------------------------");
                                    System.out.println("Le verbe <"+ verbe + ">" + " au futur de l'indicatif: ");
                                    c.futur();
                                    break;
                    case "imparfait": System.out.println("------------------------");
                                    System.out.println("Le verbe <"+ verbe + ">" + " à l'imparfait de l'indicatif: ");
                                    c.imparfait();
                                    break;
                    default: System.out.println("Commande invalide ! Essayer l'option -h ou --h.");
                             break;
                }
        }
        else
        {
            System.out.println("Commande invalide ! Essayer l'option -h ou --h.");
        }       
    }

    public static boolean estDuPremierGroupe(String verbe) 
    {
        boolean estDuPremierGroupe = (verbe.endsWith("er")) ? true : false;

        return estDuPremierGroupe;
    }
}
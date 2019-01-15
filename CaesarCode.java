/**
 * @author Meissa Birima Couly Mbaye
 * @since 09/12/18
 * @version 2.0
 * Refactoring 09/01/19
 */
public class CaesarCode
{
    public static void main(String[] args)
    {
        if(args.length == 0 || args[0].equals("-h") || args[0].equals("--help"))
        {
            System.out.println("Ce programme permet de chiffrer et de déchiffrer un message selon le chifremment de Cesar.");
            System.out.println("Usages: \n\t java CaesarCode –c messageACrypter –k clé \n\t java CaesarCode –d messageADecrypter –k clé");
            System.out.println("Options: \n\t -c <messageACrypter> pour spécifier le message à crypter \n\t -k <clé> pour spécifier la clé de cryptage \n\t -d <messageADecrypter> pour spécifier le message à décrypter \n\t -h, --help pour afficher l'aide");
            System.out.println("AUTEUR: \n\t Codé par Meissa Birima Couly Mbaye (itdev) <itdev94@gmail.com> Site Web <http://www.itdev.site>");
            System.out.println("\t\t\t 09 Décembre 2018, M1GLSI");
        }
        else if(args.length == 2 && args[1] != "")
        {
            switch(args[0])
            {
                case "-c": System.out.println(crypter(args[1].toLowerCase(), 13));
                           break;
                case "-d": System.out.println(decrypter(args[1].toLowerCase(), 13));
                           break;
                default: System.out.println("Commande invalide ! Faites un java CaesarCode -h ou java CaesarCode --h");
                         break;
            }
        }
        else if(args.length == 4 && args[1] != "" && args[3] != "" && args[2].equals("-k"))
        {
            switch(args[0])
            {
                case "-c": System.out.println(crypter(args[1].toLowerCase(), Integer.valueOf(args[3])));
                           break;
                case "-d": System.out.println(decrypter(args[1].toLowerCase(), Integer.valueOf(args[3])));
                           break;
                default: System.out.println("Commande invalide ! Faites un java CaesarCode -h ou java CaesarCode --h !");
                          break;
            }
        }
        else
        {
            System.out.println("Commande invalide ! faites java CaesarCode -h ou java Caesar --help afin de consulter l'aide !");
        }
    }

    public static String crypter(String message, int cle)
    {

        String msgCrypter = new String("");

        for(int i = 0; i < message.length(); i++)
        {
            int posCar = recherchePosition(message.charAt(i));
            int newPosCar = posCar + cle;

            while(newPosCar >= 26)
            {
                newPosCar -= 26;
            }
            msgCrypter = msgCrypter.concat(String.valueOf(rechercheCar(newPosCar))); 
        }

        return msgCrypter;
    }

    public static String decrypter(String message, int cle)
    {
        String msgDecrypter = new String("");

        for(int i = 0; i < message.length(); i++)
        {
            int posCar = recherchePosition(message.charAt(i));
            int newPosCar = posCar - cle;

            while(newPosCar < 0)
            {
                newPosCar += 26;
            }
            msgDecrypter = msgDecrypter.concat(String.valueOf(rechercheCar(newPosCar))); 
        }

        return msgDecrypter;
    }

    public static char[] getDico()
    {
        char[] dico = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x','y', 'z'};
        return dico;
    }

    public static int recherchePosition(char c)
    {
        int pos = 0;
        char [] dico = getDico();

        for(int i = 0; i < dico.length; i++)
        {
            if(dico[i] == c)
            {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static char rechercheCar(int pos)
    {
        char[] dico = getDico();
        return dico[pos];
    }
}
/**
 * @author Meissa Birima Couly Mbaye
 * @since 09/12/18
 * @version 1.0
 * Refactoring 09/01/19
 */
public class ConjugaisonIndicatif
{
    private String verbe;
    private String[] pronoms;
    private String[] terminaisonPresent; 
    private String[] terminaisonPasse; 
    private String[] terminaisonFutur; 
    private String[] terminaisonImparfait;
    private String radicalDuVerbe;
    
    ConjugaisonIndicatif(String verbe)
    {
        this.setVerbe(verbe);
        String[] pronoms = {"je", "tu", "il", "nous", "vous", "ils"};
        this.setPronoms(pronoms);
        String[] terminaisonPresent = {"e", "es", "e", "ons", "ez", "ent"};
        this.setTerminaisonPresent(terminaisonPresent);
        String[] terminaisonFutur = {"erai", "eras", "era", "erons", "erez", "eront"};
        this.setTerminaisonFutur(terminaisonFutur);
        String[] terminaisonImparfait = {"ais", "ais", "ait", "ions", "iez", "aient"};
        this.setTerminaisonImparfait(terminaisonImparfait);
        String[] terminaisonPasse = {"ais", "as", "a", "âmes", "âtes", "èrent"};
        this.setTerminaisonPasse(terminaisonPasse);
        this.setRadical(getRadical(verbe));
    }

    private String getRadical(String verbe)
    {
        String radical = new String("");

        for(int i = 0; i < verbe.length() - 2; i++)
        {
            radical = radical.concat(String.valueOf(verbe.charAt(i)));
        }

        return radical;
    }

    public void present()
    {
        for(int i = 0; i < 6; i++)
        {
            System.out.println(this.pronoms[i] + " " + this.radicalDuVerbe + this.terminaisonPresent[i]);
        }
    }

    public void passe()
    {
        for(int i = 0; i < 6; i++)
        {
            System.out.println(this.pronoms[i] + " " + this.radicalDuVerbe + this.terminaisonPasse[i]);
        }
    }

    public void imparfait()
    {
        for(int i = 0; i < 6; i++)
        {
            System.out.println(this.pronoms[i] + " " + this.radicalDuVerbe + this.terminaisonImparfait[i]);
        }
    }

    public void futur()
    {
        for(int i = 0; i < 6; i++)
        {
            System.out.println(this.pronoms[i] + " " + this.radicalDuVerbe + this.terminaisonFutur[i]);
        }
    }
    
    private void setRadical(String radical)
    {
        this.radicalDuVerbe = radical;
    } 

    public String getVerbe()
    {
        return this.verbe;
    }

    public void setVerbe(String verbe)
    {
        if(verbe.endsWith("er"))
        {
            this.verbe = verbe;
        }
        else
        {
            System.out.println("Donner un verbe du premier groupe svp !");
        }
    }

    public String[] getPronoms()
    {
        return this.pronoms;
    }

    public String[] getTerminaisonsPresent()
    {
        return this.terminaisonPresent;
    }

    public String[] getTerminaisonsPasse()
    {
        return this.terminaisonPasse;
    }

    public String[] getTerminaisonsFutur()
    {
        return this.terminaisonFutur;
    }

    public String[] getTerminaisonsImparfait()
    {
        return this.terminaisonImparfait;
    }

    private void setPronoms(String[] p)
    {
        this.pronoms = p;
    }

    private void setTerminaisonPresent(String[] p)
    {
        this.terminaisonPresent = p;
    }

    private void setTerminaisonPasse(String[] p)
    {
        this.terminaisonPasse = p;
    }

    private void setTerminaisonFutur(String[] p)
    {
        this.terminaisonFutur = p;
    }

    private void setTerminaisonImparfait(String[] p)
    {
        this.terminaisonImparfait = p;
    }
}
package graphique.devoirgestionsbulletin.Model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Matiere
{
    private int numeroMatiere;
    private String nomMatiere;
    private ArrayList<Devoir> lesDevoirs;

    public Matiere(int numeroMatiere, String nomMatiere) {
        this.numeroMatiere = numeroMatiere;
        this.nomMatiere = nomMatiere;
        this.lesDevoirs = new ArrayList<>();
    }

    public int getNumeroMatiere() {
        return numeroMatiere;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public ArrayList<Devoir> getLesDevoirs() {
        return lesDevoirs;
    }

    public void ajouterDevoir(Devoir unDevoir)
    {
        lesDevoirs.add(unDevoir);
    }

    public String calculerMoyenneMatiere()
    {
        double somme = 0;
        int nbNotes = 0;

        for (int i = 0; i < lesDevoirs.size(); i++)
        {
            Devoir devoir = lesDevoirs.get(i);

            for (int j = 0; j < devoir.getLesEtudiants().size(); j++)
            {
                Etudiant etudiant = devoir.getLesEtudiants().get(j);

                somme = somme + etudiant.getNote();
                nbNotes = nbNotes + 1;
            }
        }

        if (nbNotes == 0)
        {
            return "";
        }

        double moyenne = somme / nbNotes;

        return String.valueOf(moyenne);
    }


}

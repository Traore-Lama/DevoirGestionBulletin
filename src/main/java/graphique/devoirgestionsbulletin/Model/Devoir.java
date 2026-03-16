package graphique.devoirgestionsbulletin.Model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Devoir
{
    private int numeroDevoir;
    private String nomDevoir;
    private String dateDevoir;
    private ArrayList<Etudiant> lesEtudiants;

    public Devoir(int numeroDevoir, String nomDevoir, String dateDevoir) {
        this.numeroDevoir = numeroDevoir;
        this.nomDevoir = nomDevoir;
        this.dateDevoir = dateDevoir;
        this.lesEtudiants = new ArrayList<>();
    }

    public int getNumeroDevoir() {
        return numeroDevoir;
    }

    public String getNomDevoir() {
        return nomDevoir;
    }

    public String getDateDevoir() {
        return dateDevoir;
    }

    public ArrayList<Etudiant> getLesEtudiants() {
        return lesEtudiants;
    }

    public void ajouterEtudiant(Etudiant unEtudiant)
    {
        lesEtudiants.add(unEtudiant);
    }

    public String calculerMoyenneDevoir()
    {
        double somme = 0;
        int nbNotes = 0;

        for (int i = 0; i < lesEtudiants.size(); i++)
        {
            Etudiant etudiant = lesEtudiants.get(i);
            somme = somme + etudiant.getNote();
            nbNotes = nbNotes + 1;
        }

        double moyenne = somme / nbNotes;

        return String.valueOf(moyenne);
    }
}

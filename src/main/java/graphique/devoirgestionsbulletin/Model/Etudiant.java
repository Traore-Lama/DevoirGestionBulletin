package graphique.devoirgestionsbulletin.Model;

public class Etudiant
{
    private String prenom;
    private double note;

    public Etudiant(String prenom, double note) {
        this.prenom = prenom;
        this.note = note;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public String calculerMoyenneGenerale(Matiere matiere)
    {
        double somme = 0;
        int nbNotes = 0;

        for (int i = 0; i < matiere.getLesDevoirs().size(); i++)
        {
            Devoir devoir = matiere.getLesDevoirs().get(i);
            for (int j = 0; j < devoir.getLesEtudiants().size(); j++)
            {
                Etudiant etudiant = devoir.getLesEtudiants().get(j);
                if (etudiant.getPrenom().equals(this.getPrenom()))
                {
                    somme = somme + etudiant.getNote();
                    nbNotes = nbNotes + 1;
                }
            }
        }

        double moyenne = somme / nbNotes;
        return String.valueOf(moyenne);
    }

}

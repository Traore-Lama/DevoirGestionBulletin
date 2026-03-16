module graphique.devoirgestionsbulletin {
    requires javafx.controls;
    requires javafx.fxml;


    opens graphique.devoirgestionsbulletin to javafx.fxml;
    exports graphique.devoirgestionsbulletin;
}
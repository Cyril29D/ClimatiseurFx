package sio.d3.javafx.climatiseurfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController {

    public void initialize(URL url, ResourceBundle resourceBundl)
    {
        marque.setText("Saisir la marque : ");
        puissance.setText("Saisir la puissance : ");
    }
    @FXML
    private Label welcomeText;
    @FXML
    private Label marque ;
    @FXML
    private Label puissance ;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public TextArea valMarque, valPuissance ;


    private List<Climatiseur> lesclims = new ArrayList<>();
    String infos = "";

    public void ajoutClimatiseur(Climatiseur climatiseur) {
        lesclims.add(climatiseur);
    }

    public String climatiseursToString() {
        for (int i = 0; i < lesclims.size(); i++) {
            infos = infos + "Climatiseur" + ":" + lesclims.get(i).getPuissance() + "BTU, de" +
                    lesclims.get(i).getSurfaceMin() + "à" + lesclims.get(i).getSurfaceMax() + "m²";
        }
        return infos;
    }

    public List<Climatiseur> ClimParMarque(String marque) {
        List<Climatiseur> clims = new ArrayList<>();
        for (int i = 0; i < lesclims.size(); i++) {
                    if (lesclims.get(i).getMarque().equals(marque)){
                        clims.add(lesclims.get(i)) ;
                    }
        }
        return clims;
    }
    public List<Climatiseur> ClimParPuissance(int puissance) {
        List<Climatiseur> clims = new ArrayList<>();
        for (int i = 0; i < lesclims.size(); i++) {
            if (lesclims.get(i).getPuissance() == puissance){
                clims.add(lesclims.get(i)) ;
            }
        }
        return clims;
    }

    public void enregistrer(MouseEvent mouseEvent) {
        int p = Integer.parseInt(valPuissance.getText());
        String m = valMarque.getText();
        Climatiseur mp = new Climatiseur(marque, puissance);
        lesclims.add(mp);

        System.out.println(climatiseursToString());
    }
}
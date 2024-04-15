package sio.d3.javafx.climatiseurfx;

import javafx.scene.control.Label;

public class Climatiseur {


    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissance() {
        return puissance;
    }
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    private String marque ;

    private int puissance ;

    public int getSurfaceMin() {
        return SurfaceMin;
    }

    public int getSurfaceMax() {
        return SurfaceMax;
    }

    public void setSurfaceMin(int surfaceMin) {
        SurfaceMin = surfaceMin;
    }

    public void setSurfaceMax(int surfaceMax) {
        SurfaceMax = surfaceMax;
    }

    private int SurfaceMin ;

    private int SurfaceMax ;

    public Climatiseur (String marque , int puissance){
        this.marque= marque ;
        this.puissance = puissance;
        if (this.puissance == 7000) {
            this.SurfaceMin = 7 ;
            this.SurfaceMax = 15 ;

        } else if (this.puissance == 9000){

            this.SurfaceMin = 15 ;
            this.SurfaceMax = 25 ;
        }
        else if (this.puissance == 12000) {

            this.SurfaceMin = 25 ;
            this.SurfaceMax = 35 ;
        }
        else if (this.puissance == 18000) {

            this.SurfaceMin = 35 ;
            this.SurfaceMax = 50 ;
        }
        else if (this.puissance == 24000) {

            this.SurfaceMin = 50 ;
            this.SurfaceMax = 70 ;
        }
        else if (this.puissance == 30000) {

            this.SurfaceMin = 70 ;
            this.SurfaceMax = 80 ;
        }
    }
    public Climatiseur (Label marque , Label puissance){

    }

}

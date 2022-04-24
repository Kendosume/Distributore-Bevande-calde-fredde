/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package it.moscagoretta.distributorecaldofreddo;

/**
 *
 * @author Matteo
 */
public enum B_Calda {
    CAFFE("caffe", 1.2,0),
    CAFFEORZO("caffe d'orzo", 1.2,1),
    CIOCCOLATA("cioccolata", 1.5,2),
    CAPPUCCINO("cappuccino", 2.2,3),
    GINSENG("ginseng", 2.0,4);

    private String selezione;
    private double prezzo;
    private int ordine;

    private B_Calda(String selezione, double prezzo, int ordine) {
        this.selezione = selezione;
        this.prezzo = prezzo;
        this.ordine = ordine;
    }

    public String getSelezione() {
        return selezione;
    }

    public void setSelezione(String selezione) {
        this.selezione = selezione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getOrdine() {
        return ordine;
    }

    public void setOrdine(int ordine) {
        this.ordine = ordine;
    }

 
   

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false 
        return selezione.equals(otherName);
    }

    public String toString() {
        return this.selezione;
    }

    public static B_Calda of(int selectedindex) {   //converte un altro valere in "me"

        switch (selectedindex) {
            case 0:
                return B_Calda.CAFFE;
            case 1:
                return B_Calda.CAFFEORZO;
            case 2:
                return B_Calda.CIOCCOLATA;
            case 3:
                return B_Calda.CAPPUCCINO;
            case 4:
                return B_Calda.GINSENG;
            default:
                return B_Calda.CAFFE;
        }

    }
    
    
 
}

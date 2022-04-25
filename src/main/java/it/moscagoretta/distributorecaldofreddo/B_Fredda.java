/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package it.moscagoretta.distributorecaldofreddo;

/**
 *
 * @author Matteo
 */
public enum B_Fredda {
    ACQUA("acqua",1,0),
    SUCCO("succo",1.5,1),
    GATORADE("gatorade",2.5,2),
    COCACOLA("coca-cola",2.5,3),
    FANTA("fanta",2.40,4);

    
    private String selezione;
    private double prezzo;
     private int ordine;

    private B_Fredda(String selezione, double prezzo, int ordine) {
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

    
    
     public static B_Fredda of(int selectedindex) {   //converte un altro valere in "me"
        switch (selectedindex) {
            case 0:
                return  B_Fredda.ACQUA;
            case 1:
                return B_Fredda.COCACOLA;
            case 2:
                return B_Fredda.FANTA;
            case 3:
                return B_Fredda.GATORADE;
            case 4:
                return B_Fredda.SUCCO;
            default:
                return B_Fredda.ACQUA;
        }
    }
}

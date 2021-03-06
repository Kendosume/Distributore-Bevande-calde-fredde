/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.moscagoretta.distributorecaldofreddo;

import java.util.Scanner;

/**
 *
 * @author Matteo
 */
public class Distributore {

    Scanner scanner = new Scanner(System.in);

    private BevandaFredda[] bevandeFredde;
    private BevandaCalda[] bevandeCalde;
    private int indexCalde = 0;
    private int indexFredde = 0;

    int sum = 0;

    public Distributore() {
    }

    public Distributore(int nbevandeFredde, int nbevandeCalde) {
        this.bevandeFredde = new BevandaFredda[nbevandeFredde];
        this.bevandeCalde = new BevandaCalda[nbevandeCalde];
    }

    public void addBevandaCalda(BevandaCalda bevanda_calda) {

        if (this.indexCalde == bevandeCalde.length) {
            System.out.println("Non c'è più spazio nel distributore");
            return;
        } else {
            this.bevandeCalde[indexCalde] = bevanda_calda;
            this.indexCalde++;
        }
    }

    public void addBevandaFredda(BevandaFredda bevanda_fredda) {

        if (this.indexFredde == bevandeFredde.length) {
            System.out.println("Non c'è più spazio nel distributore");
            return;
        } else {
            this.bevandeFredde[indexFredde] = bevanda_fredda;
            this.indexFredde++;
        }
    }

    public int cercaProdottoCaldo(int pSelezionato) {
        for (int i = 0; i < this.indexCalde; i++) {
            if (bevandeCalde[i].getSelezione().getOrdine() == pSelezionato) {
                return i;
            }
        }
        return -1; //errore si assicuri di aver scelto la categoria giusta //errore greve il porodotto non esiste
    }

    public int cercaProdottoFreddo(int pSelezionato) {
        for (int i = 0; i < this.indexFredde; i++) {
            if (bevandeFredde[i].getSelezione().getOrdine() == pSelezionato) {
                return i;
            }
        }
        return -1; //errore si assicuri di aver scelto la categoria giusta //errore greve il porodotto non esiste
    }

    public double erogaProdottoCaldo(int i, double valutaIns) {

        double x = 0;
        if (bevandeCalde[i].tipo.equals("caldo")) {
            //resto
            return x = valutaIns - bevandeCalde[i].getSelezione().getPrezzo();

        }

        return -12; //boh fra esplodi
    }
    
    
    public float fSegretaCalda(int i){
        float a=0;
        a+=bevandeCalde[i].getSelezione().getPrezzo();
        return a;
    }
    public float fSegretaFredda(int i){
        float a=0;
        a+=bevandeFredde[i].getSelezione().getPrezzo();
        return a;
    }
    
    
    

    public double erogaProdottoFreddo(int i, double valutaIns) {

        double x = 0;
        if (bevandeFredde[i].tipo.equals("freddo")) {
            //resto
            return x = valutaIns - bevandeFredde[i].getSelezione().getPrezzo();

        }

        return -16; //boh fra esplodi
    }

    public double sceltaDenaroCaldo(int i) {
        double somma = 0;
        boolean a = true;
        do {
            System.out.println("Inserire un importo fino al raggiungimento del costo del prodotto selezionato");
            System.out.println("----------------------------------------");
            System.out.println("0: 0.10€");
            System.out.println("1: 0.20€");
            System.out.println("2: 0.50€");
            System.out.println("3: 1€");
            System.out.println("4: 2€");
            System.out.println("5: 5€");
            System.out.println("6: 10€");
            System.out.println("----------------------------------------");

            System.out.println("Scegli un opzione per pagare: ");
            String sceltaaa = scanner.nextLine();
            Integer scelta = Integer.parseInt(sceltaaa);

            switch (scelta) {
                case 0:
                    somma += 0.10;
                    break;

                case 1:
                    somma += 0.20;
                    break;

                case 2:
                    somma += 0.50;
                    break;

                case 3:
                    somma += 1;
                    break;
                case 4:
                    somma += 2;
                    break;
                case 5:
                    somma += 5;
                    break;
                case 6:
                    somma += 10;
                    break;

                default:
                    System.out.println("Il distributore non acetta altri importi");
            }
            if (somma >= bevandeCalde[i].getSelezione().getPrezzo()) {
                a = false;
            }

        } while (a);

        return somma;
    }

    public double sceltaDenaroFreddo(int i) {
        double somma = 0;
        boolean a = true;
        do {
            System.out.println("Inserire un importo fino al raggiungimento del costo del prodotto selezionato");
            System.out.println("----------------------------------------");
            System.out.println("0: 0.10€");
            System.out.println("1: 0.20€");
            System.out.println("2: 0.50€");
            System.out.println("3: 1€");
            System.out.println("4: 2€");
            System.out.println("5: 5€");
            System.out.println("6: 10€");
            System.out.println("----------------------------------------");

            System.out.println("Scegli un opzione per pagare: ");
            String sceltaaa = scanner.nextLine();
            Integer scelta = Integer.parseInt(sceltaaa);

            switch (scelta) {
                case 0:
                    somma += 0.10;
                    break;

                case 1:
                    somma += 0.20;
                    break;

                case 2:
                    somma += 0.50;
                    break;

                case 3:
                    somma += 1;
                    break;
                case 4:
                    somma += 2;
                    break;
                case 5:
                    somma += 5;
                    break;
                case 6:
                    somma += 10;
                    break;

                default:
                    System.out.println("Il distributore non acetta altri importi");
            }

            if (somma >= bevandeFredde[i].getSelezione().getPrezzo()) {
                a = false;
            }

        } while (a);

        return somma;
    }

    public int sceltaZucchero() {
        //int sum=0;
        boolean a = true;
        do {
            System.out.println("----------------------------------------");
            System.out.println("0: senza zucchero");
            System.out.println("1: *");
            System.out.println("2: **");
            System.out.println("3: ***");
            System.out.println("4: ****");
            System.out.println("5: *****");
            System.out.println("----------------------------------------");

            System.out.println("Scegli la quantità di zucchero: ");
            String sceltaaa = scanner.nextLine();
            Integer scelta = Integer.parseInt(sceltaaa);

            switch (scelta) {
                case 0:
                    sum += 0;
                    break;

                case 1:
                    sum += 1;
                    break;

                case 2:
                    sum += 2;
                    break;

                case 3:
                    sum += 3;
                    break;
                case 4:
                    sum += 4;
                    break;
                case 5:
                    sum += 5;
                    break;

                default:
                    System.out.println("inserisca uno dei numeri selezionati");
                    return -69;
            }

            break;

        } while (true);

        return sum;
    }

    public void eliminaAtIndexCalde(int ix) {
        bevandeCalde[ix] = null;
        for (int i = ix; i < this.indexCalde; i++) {
            bevandeCalde[i] = bevandeCalde[i + 1];
        }
        this.indexCalde--;
    }

    public void eliminaAtIndexFredde(int ix) {
        bevandeFredde[ix] = null;
        for (int i = ix; i < this.indexFredde; i++) {
            bevandeFredde[i] = bevandeFredde[i + 1];
        }
        this.indexFredde--;
    }

    public void vediProdottiCaldi() {
        for (int i = 0; i < this.indexCalde; i++) {
            System.out.println(bevandeCalde[i].toString());
        }
    }

    public void vediProdottiFreddi() {
        for (int i = 0; i < this.indexFredde; i++) {
            System.out.println(bevandeFredde[i].toString());
        }
    }

    public void outputDistributoreCaldi(int i, double resto, double valutaIns) {
        float restto = (float) resto;
        if (resto == -12 || i == -1) {
            System.out.println("non puoi eseguire questo comando");
        } else {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Prodotto erogato: ");
            System.out.println("Tipo: " + bevandeCalde[i].getTipo());
            System.out.println("Prodotto erogato: " + bevandeCalde[i].getSelezione().getSelezione());
            if (sum == 0) {
                System.out.println("Zucchero: " + "senza zucchero");
            } else {
                System.out.println("Zucchero: " + sum);
            }
            System.out.println("Denaro inserito: " + valutaIns);
            System.out.println("Resto dovuto: " + restto);
        }

    }

    public void outputDistributoreFreddi(int i, double resto, double valutaIns) {
        float restto = (float) resto;
        if (resto == -12 || i == -1) {
            System.out.println("non puoi eseguire questo comando");
        } else {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Prodotto erogato: ");
            System.out.println("Tipo: " + bevandeFredde[i].getTipo());
            System.out.println("Prodotto erogato: " + bevandeFredde[i].getSelezione().getSelezione());
            System.out.println("Denaro inserito: " + valutaIns);
            System.out.println("Resto dovuto: " + restto);
        }

    }

}

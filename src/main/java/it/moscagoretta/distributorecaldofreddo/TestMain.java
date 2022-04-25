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
public class TestMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Distributore d = new Distributore(20, 20);
        double valutaIns = 0;
        double resto = 0;
        int zucchero = 0;
        int i = 0;
        String string;
        //inseermento automatico dei prodotti / in futuro si potranno aggiungere tramite una funzione apposita
        for (int ih = 0; ih < 2; ih++) {
            BevandaCalda ac = new BevandaCalda(B_Calda.of(0));
            d.addBevandaCalda(ac);
            BevandaCalda bc = new BevandaCalda(B_Calda.of(1));
            d.addBevandaCalda(bc);
            BevandaCalda cc = new BevandaCalda(B_Calda.of(2));
            d.addBevandaCalda(cc);
            BevandaCalda dc = new BevandaCalda(B_Calda.of(3));
            d.addBevandaCalda(dc);
            BevandaCalda ec = new BevandaCalda(B_Calda.of(4));
            d.addBevandaCalda(ec);
        }
        for (int ih = 0; ih < 2; ih++) {
            BevandaFredda af = new BevandaFredda(B_Fredda.of(0));
            d.addBevandaFredda(af);
            BevandaFredda bf = new BevandaFredda(B_Fredda.of(1));
            d.addBevandaFredda(bf);
            BevandaFredda cf = new BevandaFredda(B_Fredda.of(2));
            d.addBevandaFredda(cf);
            BevandaFredda df = new BevandaFredda(B_Fredda.of(3));
            d.addBevandaFredda(df);
            BevandaFredda ef = new BevandaFredda(B_Fredda.of(4));
            d.addBevandaFredda(ef);
        }

        do {
            System.out.println("----------------------------------------");
            System.out.println("Caldi:                               Freddi:");
            System.out.println("0: Caffé             1.20€           0: Acqua      1.00€");
            System.out.println("1: Caffe d'orzo      1.20€           1: Succo      1.50€");
            System.out.println("2: Cioccolata calda  1.50€           2: Gatorade   2.50€");
            System.out.println("3: Cappuccino        2.20€           3: Coca-Cola  2.50€");
            System.out.println("4: Ginseng           2.00€           4: Fanta      2.40€");
            System.out.println("----------------------------------------");

            System.out.println("Bevanda Calda o Fredda?");
            String sceltaa = scanner.nextLine();
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (sceltaa.equals("calda")) {

                System.out.println("Scegli un opzione: ");
                String sceltaaa = scanner.nextLine();
                Integer scelta = Integer.parseInt(sceltaaa);

                switch (scelta) {
                    case 0:
                        i = d.cercaProdottoCaldo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            //zucchero solo caldi 
                            zucchero = d.sceltaZucchero();
                            valutaIns = d.sceltaDenaroCaldo(i);
                            resto = d.erogaProdottoCaldo(i, valutaIns);
                            d.outputDistributoreCaldi(i, resto, valutaIns);
                            d.eliminaAtIndexCalde(i);

                        }
                        break;

                    case 1:
                        i = d.cercaProdottoCaldo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            //zucchero solo caldi 
                            zucchero = d.sceltaZucchero();
                            valutaIns = d.sceltaDenaroCaldo(i);
                            resto = d.erogaProdottoCaldo(i, valutaIns);
                            d.outputDistributoreCaldi(i, resto, valutaIns);
                            d.eliminaAtIndexCalde(i);

                        }
                        break;

                    case 2:
                        i = d.cercaProdottoCaldo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            //zucchero solo caldi 
                            zucchero = d.sceltaZucchero();
                            valutaIns = d.sceltaDenaroCaldo(i);
                            resto = d.erogaProdottoCaldo(i, valutaIns);
                            d.outputDistributoreCaldi(i, resto, valutaIns);
                            d.eliminaAtIndexCalde(i);

                        }
                        break;

                    case 3:
                        i = d.cercaProdottoCaldo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            //zucchero solo caldi 
                            zucchero = d.sceltaZucchero();
                            valutaIns = d.sceltaDenaroCaldo(i);
                            resto = d.erogaProdottoCaldo(i, valutaIns);
                            d.outputDistributoreCaldi(i, resto, valutaIns);
                            d.eliminaAtIndexCalde(i);

                        }
                        break;
                    case 4:
                        i = d.cercaProdottoCaldo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            //zucchero solo caldi 
                            zucchero = d.sceltaZucchero();
                            valutaIns = d.sceltaDenaroCaldo(i);
                            resto = d.erogaProdottoCaldo(i, valutaIns);
                            d.outputDistributoreCaldi(i, resto, valutaIns);
                            d.eliminaAtIndexCalde(i);

                        }
                        break;
                    case 1234:
                        d.vediProdottiCaldi();
                        break;
                    case 4321:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("inserisci uno dei numeri presenti");

                }

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            } else if (sceltaa.equals("fredda")) {

                System.out.println("Scegli un opzione: ");
                String sceltaaa = scanner.nextLine();
                Integer scelta = Integer.parseInt(sceltaaa);

                switch (scelta) {
                    case 0:
                        i = d.cercaProdottoFreddo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            valutaIns = d.sceltaDenaroFreddo(i);
                            resto = d.erogaProdottoFreddo(i, valutaIns);
                            d.outputDistributoreFreddi(i, resto, valutaIns);
                            d.eliminaAtIndexFredde(i);

                        }
                        break;

                    case 1:
                        i = d.cercaProdottoFreddo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            valutaIns = d.sceltaDenaroFreddo(i);
                            resto = d.erogaProdottoFreddo(i, valutaIns);
                            d.outputDistributoreFreddi(i, resto, valutaIns);
                            d.eliminaAtIndexFredde(i);

                        }
                        break;

                    case 2:
                        i = d.cercaProdottoFreddo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            valutaIns = d.sceltaDenaroFreddo(i);
                            resto = d.erogaProdottoFreddo(i, valutaIns);
                            d.outputDistributoreFreddi(i, resto, valutaIns);
                            d.eliminaAtIndexFredde(i);

                        }
                        break;
                    case 3:
                        i = d.cercaProdottoFreddo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            valutaIns = d.sceltaDenaroFreddo(i);
                            resto = d.erogaProdottoFreddo(i, valutaIns);
                            d.outputDistributoreFreddi(i, resto, valutaIns);
                            d.eliminaAtIndexFredde(i);

                        }
                        break;
                    case 4:
                        i = d.cercaProdottoFreddo(scelta);
                        if (i == -1) {
                            System.out.println("Il prodotto e' terminato");
                        } else {
                            valutaIns = d.sceltaDenaroFreddo(i);
                            resto = d.erogaProdottoFreddo(i, valutaIns);
                            d.outputDistributoreFreddi(i, resto, valutaIns);
                            d.eliminaAtIndexFredde(i);

                        }
                        break;
                    case 1234:
                        d.vediProdottiFreddi();
                        break;
                    case 4321:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("inserisci uno dei numeri presenti");

                }

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
            } else if (sceltaa.equals("wasd")) {
                System.out.println("1234: visualizza i prodotti nel distributore");
                System.out.println("4321: Exit");
            } else {
                System.out.println("Provi ascrivere con la minuscola la categoria");
            }

        } while (true);

    }

}

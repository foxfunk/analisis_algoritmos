package controlador;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;

/**
 *
 * @author Fox
 */
public class random {

    Random r = new Random();

    public ArrayList generardiez() {

        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 10; i++) {
            numero = r.nextInt(10);
            lista.add(i, numero);
        }

        return lista;
    }

    public ArrayList generarcincuenta() {

        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 50; i++) {
            numero = r.nextInt(50);
            lista.add(i, numero);
        }

        return lista;
    }

    public ArrayList generarcien() {

        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 100; i++) {
            numero = r.nextInt(100);
            lista.add(i, numero);
        }

        return lista;
    }

    public ArrayList generarquinientos() {

        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 500; i++) {
            numero = r.nextInt(500);
            lista.add(i, numero);

        }

        return lista;
    }

    public ArrayList generarmil() {

        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 1000; i++) {
            numero = r.nextInt(1008);
            lista.add(i, numero);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(" " + lista.get(i));
        }
        return lista;
    }

    public ArrayList generacincormil() {

        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 5000; i++) {
            numero = r.nextInt(5008);
            lista.add(i, numero);

        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(" " + lista.get(i));
        }
        return lista;
    }

    public ArrayList generardiezmil() {

        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 10000; i++) {
            numero = r.nextInt(10000);
            lista.add(i, numero);
        }

        return lista;
    }

    public ArrayList generardorveinticincomil() {
        Random r = new Random();
        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 25000; i++) {
            numero = r.nextInt(10000);
            lista.add(i, numero);
        }

        return lista;
    }

    public ArrayList generarciencuamil() {
        Random r = new Random();
        ArrayList lista = new ArrayList();
        int numero;
        for (int i = 0; i < 50000; i++) {
            numero = r.nextInt(1000);
            lista.add(i, numero);

        }

        return lista;
    }

    public ArrayList generarsetentaycinco() {
  Random r = new Random();
        ArrayList lista = new ArrayList();

        int numero;
        for (long i = 0; i < 75000; i++) {
            numero = r.nextInt(1000);
            lista.add((int) i, numero);
        }

        return lista;
    }

    public ArrayList generarcienmil() {
        Random r = new Random();
        ArrayList lista = new ArrayList();

        int numero;
        for (long i = 0; i < 100000; i++) {
            numero = r.nextInt(1000);
            lista.add((int) i, numero);
        }

        return lista;
    }

    public ArrayList generardocientoscincuentamil() {
        Random r = new Random();
        ArrayList lista = new ArrayList();

        int numero;
        for (long i = 0; i < 250000; i++) {
            numero = r.nextInt(1000);
            lista.add((int) i, numero);

        }

        return lista;
    }

    public ArrayList generardorquinientosmil() {
        Random r = new Random();
        ArrayList lista = new ArrayList();

        int numero;
        for (long i = 0; i < 500000; i++) {
            numero = r.nextInt(1000);
            lista.add((int) i, numero);
        }

        return lista;
    }

    public ArrayList generardorsetecientoscincuentamil() {
        Random r = new Random();
        ArrayList lista = new ArrayList();

        int numero;
        for (long i = 0; i < 750000; i++) {
            numero = r.nextInt(1000);
            lista.add((int) i, numero);
        }

        return lista;
    }

    public ArrayList generarmillon() {
        ArrayList lista = new ArrayList();
        Random rnd = new Random();

        int res = 0;
        for (int i = 0; i < 1000000; i++) {
            res = rnd.nextInt(1000000);
            lista.add(res);

        }

        return lista;

    }

    public ArrayList generardosmillonesquinientos() {
        ArrayList lista = new ArrayList();
        Random rnd = new Random();

        int res = 0;
        for (int i = 0; i < 2500000; i++) {
            res = rnd.nextInt(2500000);
            lista.add(res);

        }

        return lista;

    }

    public ArrayList generardorcincomillones() {
        ArrayList lista = new ArrayList();
        Random rnd = new Random();

        int res = 0;
        for (int i = 0; i < 5000000; i++) {
            res = rnd.nextInt(5000000);
            lista.add(res);

        }

        return lista;
    }

    public ArrayList generardorsietequinientos() {
        ArrayList lista = new ArrayList();
        Random rnd = new Random();

        int res = 0;
        for (int i = 0; i < 7500000; i++) {
            res = rnd.nextInt(7500000);
            lista.add(res);

        }

        return lista;
    }

    public ArrayList generardiezmillones() {
        ArrayList lista = new ArrayList();
        Random rnd = new Random();

        int res = 0;
        for (int i = 0; i < 7500000; i++) {
            res = rnd.nextInt(7500000);
            lista.add(res);

        }

        return lista;
    }

//AQUI COMIENZAN LOS QUE NO SE LES REPIRE UN NUMERO
    public ArrayList generardiezsinrepetirse() {
        System.out.println("");

        Random r = new Random();
        ArrayList lista = new ArrayList();
        ArrayList aux = new ArrayList();
        int numero;
        for (int i = 0; i < 10; i++) {
            numero = r.nextInt(15);
            if (!lista.contains(numero)) {
                lista.add(numero);

                if (lista.size() == 10) {
                    for (int m = 0; m < lista.size(); m++) {
                        aux.add(m, lista.get(m));

                    }
                } else {
                    i = 0;
                }
            }
            System.out.println(i);
        }
        return aux;
    }

    public ArrayList generarveinteycincoinrepetirse() {
        System.out.println("");

        Random r = new Random();
        ArrayList lista = new ArrayList();
        ArrayList aux = new ArrayList();
        int numero;
        for (int i = 0; i < 25; i++) {
            numero = r.nextInt(30);
            if (!lista.contains(numero)) {
                lista.add(numero);

                if (lista.size() == 25) {
                    for (int m = 0; m < lista.size(); m++) {
                        aux.add(m, lista.get(m));

                    }
                } else {
                    i = 0;
                }
            }
            System.out.println(i);
        }
        return aux;
    }

    public ArrayList generarcincuentasinrepetirse() {
        Random r = new Random();
        ArrayList lista = new ArrayList();
        ArrayList aux = new ArrayList();
        int numero;
        for (int i = 0; i < 50; i++) {
            numero = r.nextInt(55);
            if (!lista.contains(numero)) {
                lista.add(numero);

                if (lista.size() == 50) {
                    for (int m = 0; m < lista.size(); m++) {
                        aux.add(m, lista.get(m));

                    }
                } else {
                    i = 0;
                }
            }
            System.out.println(i);
        }
        return aux;
    }

    public ArrayList generarcienlsinrepetirse() {
        Random r = new Random();
        ArrayList lista = new ArrayList();
        ArrayList aux = new ArrayList();
        int numero;
        for (int i = 0; i < 100; i++) {
            numero = r.nextInt(150);
            if (!lista.contains(numero)) {
                lista.add(numero);

                if (lista.size() == 100) {
                    for (int m = 0; m < lista.size(); m++) {
                        aux.add(m, lista.get(m));
                    }
                } else {
                    i = 0;
                }
            }
            System.out.println(i);
        }
        return aux;

    }

    public ArrayList generarquinientossinrepetirse() {
        System.out.println("");

        Random r = new Random();
        ArrayList lista = new ArrayList();
        ArrayList aux = new ArrayList();
        int numero;
        for (int i = 0; i < 500; i++) {
            numero = r.nextInt(512);
            if (!lista.contains(numero)) {
                lista.add(numero);

                if (lista.size() == 500) {
                    for (int m = 0; m < lista.size(); m++) {
                        aux.add(m, lista.get(m));

                    }
                } else {
                    i = 0;
                }
            }
            System.out.println(i);
        }
        return aux;

    }

    public ArrayList generarmilsinrepetirse() {
        System.out.println("");

        Random r = new Random();
        ArrayList lista = new ArrayList();
        ArrayList aux = new ArrayList();
        int numero;
        for (int i = 0; i < 1000; i++) {
            numero = r.nextInt(1012);
            if (!lista.contains(numero)) {
                lista.add(numero);

                if (lista.size() == 1000) {
                    for (int m = 0; m < lista.size(); m++) {
                        aux.add(m, lista.get(m));

                    }
                } else {
                    i = 0;
                }
            }
            System.out.println(i);
        }
        return aux;
    }

    public ArrayList generarcincomilsinrepetirse() {
        System.out.println("");

        Random r = new Random();
        ArrayList lista = new ArrayList();
        ArrayList aux = new ArrayList();
        int numero;
        for (int i = 0; i < 5000; i++) {
            numero = r.nextInt(5012);
            if (!lista.contains(numero)) {
                lista.add(numero);

                if (lista.size() == 5000) {
                    for (int m = 0; m < lista.size(); m++) {
                        aux.add(m, lista.get(m));
                    }
                } else {
                    i = 0;
                }
            }
            System.out.println(i);
        }
        return aux;
    }

    public ArrayList generarDiezmilsinrepetirse() {

        ArrayList lista = new ArrayList();
        int tamaño = 10000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList generarveinteycincomilsinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 25000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList generarcincuentamilsinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 50000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList generarsetentaycincomilsinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 75000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);
            System.out.println(resultado[i]);
        }

        return lista;
    }

    public ArrayList generarCienmilsinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 100000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;

    }

    public ArrayList generardoscincuentamilsinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 250000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList quinientosmilsinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 500000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList setencientoscincuentamilsinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 750000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;

    }

    public ArrayList generarunmillonsinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 1000000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList generardosmillonesquinientosinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 2500000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList generarcincomillonessinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 5000000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList generarsietemillonessquinientosinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 7500000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    public ArrayList generardiezmillonesinrepetirse() {
        ArrayList lista = new ArrayList();
        int tamaño = 10000000;
        int k = tamaño;
        int[] resultado = new int[tamaño];
        int[] numeros = new int[tamaño];
        Random rnd = new Random();
        int res;

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < tamaño; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
//        for (int i = 0; i < tamaño; i++) {
//            System.out.println(i + "---- " +resultado[i]);
//        }

        for (int i = 0; i < tamaño; i++) {
            //Object o = resultado[i];
            lista.add(resultado[i]);

        }

        return lista;
    }

    //+++++++++GENERAR MENOR A MAYOR+++++++++
    public ArrayList mayoramenor (int tamaño) {
        ArrayList lista = new ArrayList();

        for (int i = tamaño; i > 0; i--) {
          
            lista.add(i);
        }
        return lista;
    }

    //+++++++++++++Mayoramenor++++++
    public ArrayList menoramayor(int tamaño) {
        ArrayList lista = new ArrayList();

        for (int i = 0; i < tamaño; i++) {
           
            lista.add(i);
        }

        return lista;
    }

}

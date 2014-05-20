/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Fox
 */
public class algoritmos {

    //BURBUJA
    public ArrayList burbujaMayoraMenor(ArrayList lista) {

        int i, j, aux;
        for (i = 0; i < lista.size() - 1; i++) {
            for (j = 0; j < lista.size() - i - 1; j++) {
                int n = (int) lista.get(j);
                int n2 = (int) lista.get(j + 1);
                if (n < n2) {
                    aux = (int) lista.get(j + 1);
                    lista.set(j + 1, lista.get(j));
                    lista.set(j, aux);

                }
            }
            System.out.println("Burbuja " + i);
        }

        return lista;
    }

    public ArrayList burbujaMenoraMayor(ArrayList lista) {

        int i, j, aux;
        for (i = 0; i < lista.size() - 1; i++) {
            for (j = 0; j < lista.size() - i - 1; j++) {
                int n = (int) lista.get(j);
                int n2 = (int) lista.get(j + 1);
                if (n > n2) {
                    aux = (int) lista.get(j + 1);
                    lista.set(j + 1, lista.get(j));
                    lista.set(j, aux);
                }
            }

        }

        return lista;
    }

    //BURBUJA MEJORADA
    public ArrayList burbujaMejoradaMayoraMenor(ArrayList lista) {
        boolean bandera = true;
        int tamaño = lista.size();
        int aux, i, j;
        ArrayList lista2 = new ArrayList();

        for (i = 0; i < tamaño && bandera; ++i) {
            bandera = false;
            for (j = 0; j < tamaño - i - 1; ++j) {
                int n = (int) lista.get(j);
                int n2 = (int) lista.get(j + 1);
                if (n < n2) {
                    aux = (int) lista.get(j);

                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);

                    bandera = true;
                }
            }
        }

        return lista;
    }

    public ArrayList burbujaMejoradaMenoraMayor(ArrayList lista) {
        boolean bandera = true;
        int tamaño = lista.size();
        int aux, i, j;
        ArrayList lista2 = new ArrayList();

        for (i = 0; i < tamaño && bandera; ++i) {
            bandera = false;
            for (j = 0; j < tamaño - i - 1; ++j) {
                int n = (int) lista.get(j);
                int n2 = (int) lista.get(j + 1);
                if (n > n2) {
                    aux = (int) lista.get(j);

                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);

                    bandera = true;
                }
            }
        }

        return lista;
    }

    //+++++++++++++QUICKSORT++++++++++++++++++
    public ArrayList quicksort(ArrayList input) {
        if (input.size() <= 1) {
            return input;
        }
        int middle = (int) Math.ceil((double) input.size() / 2);
        int pivot = (int) input.get(middle);

        ArrayList less = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();
        for (int i = 0; i < input.size(); i++) {
            if ((int) input.get(i) >= pivot) {
                if (i == middle) {
                    continue;
                }
                less.add(input.get(i));
            } else {
                greater.add((int) input.get(i));
            }
        }
        return concatenate(quicksort(less), pivot, quicksort(greater));
    }

    private ArrayList concatenate(ArrayList less, int pivot, ArrayList greater) {
        ArrayList list = new ArrayList<Integer>();
        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }
        list.add(pivot);
        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }
        return list;
    }

    public ArrayList quicksortMenoraMayor(ArrayList input) {
        if (input.size() <= 1) {
            return input;
        }
        int middle = (int) Math.ceil((double) input.size() / 2);
        int pivot = (int) input.get(middle);

        ArrayList less = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();
        for (int i = 0; i < input.size(); i++) {
            if ((int) input.get(i) <= pivot) {
                if (i == middle) {
                    continue;
                }
                less.add(input.get(i));
            } else {
                greater.add((int) input.get(i));
            }
        }
        return concatenate2(quicksortMenoraMayor(less), pivot, quicksortMenoraMayor(greater));
    }

    private ArrayList concatenate2(ArrayList less, int pivot, ArrayList greater) {
        ArrayList list = new ArrayList<Integer>();
        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }
        list.add(pivot);
        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }
        return list;
    }

    //++++++++++++++++++INSERTSORT+++++++++++++++++++++++++
    public ArrayList insertionSort(ArrayList<Integer> lista) {
        int val;
        int holePos;

        for (int k = 1; k < lista.size(); k++) {

            val = lista.get(k);

            holePos = k;

            while (holePos > 0 && lista.get(holePos - 1) < val) {

                lista.set(holePos, lista.get(holePos - 1));
                holePos--;
            }

            lista.set(holePos, val);
        }
        return lista;
    }

    public ArrayList insertionSortMenorMayor(ArrayList<Integer> lista) {

        for (int i = 1; i < lista.size(); i++) {
            //lista.set(i, i);
            int j = i-1;
            int B = lista.get(i);
            while ((j >= 0) && (lista.get(j) > B)) {

                lista.set(j+1, lista.get(j));
                j--;
            }
            lista.set(j+1, B);

        }
        return lista;
    }

    //++++++++++++++Seleccion++++++++++++
    public ArrayList seleccion(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i) > lista.get(j)) {
                    //... Exchange elements
                    int temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);

                }
            }
        }
        return lista;
    }

    public ArrayList seleccionMenoraMayor(ArrayList<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i) > lista.get(j)) {
                    //... Exchange elements
                    int temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);

                }
            }
          
        }

        return lista;
    }

    //++++++++++++SHELLSORT+++++++++++++++++++++++++
    public ArrayList shellSort(ArrayList<Integer> lista) {

        for (int increment = lista.size() / 2; increment > 0; increment
                = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < lista.size(); i++) {
                for (int j = i; j >= increment && lista.get(j - increment)
                        < lista.get(j); j -= increment) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j - increment));
                    lista.set(j - increment, temp);

                }
            }
        }

        return lista;
    }

    public ArrayList shellSortMenoraMayor(ArrayList<Integer> lista) {

        for (int increment = lista.size() / 2; increment > 0; increment
                = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < lista.size(); i++) {
                for (int j = i; j >= increment && lista.get(j - increment)
                        > lista.get(j); j -= increment) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j - increment));
                    lista.set(j - increment, temp);

                }
            }
        }

        return lista;
    }

    //++++++++++++++MARGESORT+++++++++++++
    public ArrayList<Integer> mergeSort(ArrayList<Integer> unsorted) {
        if (unsorted.isEmpty() || unsorted.size() == 1) {
            return unsorted;
        } else {
            int half = unsorted.size() / 2;
            return merge(mergeSort(new ArrayList<Integer>(unsorted.subList(0, half))), mergeSort(new ArrayList<Integer>(unsorted.subList(half, unsorted.size()))));
        }
    }

    public ArrayList <Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> retval = new ArrayList<Integer>();
        for (int i = 0; i < left.size(); i++) {
            int a = left.get(i);
            boolean addIt = true;
            for (int j = 0; j < right.size(); j++) {
                int b = right.get(j);
                addIt = addIt && a < b;
             
            }
            if (addIt) {
                retval.add(a);
            } else {
                retval.add(right.get(0));
                right.remove(0);
                i = i - 1;
            }
             
        }
        if (!right.isEmpty()) {
            retval.addAll(right);
        }
        return retval;
    }
}

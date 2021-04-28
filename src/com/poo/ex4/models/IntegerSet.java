package com.poo.ex4.models;

public class IntegerSet {
    private final int size = 101;
    private boolean array[] = new boolean[size];

    public IntegerSet() {
        for (int i = 0; i < size; i++) {
            array[i] = false;
        }
    }

    public IntegerSet(int[] array) {
        if (validateArray(array)) {
            for (int i : array) {
                this.array[i] = true;
            }
        }
    }

    public void insertElement(int element) {
        if (validateElement(element)) {
            array[element] = true;
        }
    }

    public void deleteElement(int element) {
        if (validateElement(element)) {
            array[element] = false;
        }
    }

    public boolean hasElement(int element) {
        if (validateElement(element)) {
            return array[element];
        } else {
            return false;
        }
    }

    public String toSetString() {
        String result = "";

        for (int i = 0; i < size; i++) {
            if (hasElement(i)) {
                result += i + " ";
            }
        }

        if (result.length() > 0) {
            result.substring(0, result.length() - 1);
        }

        return result;
    }

    public boolean isEqualTo(IntegerSet integerSet) {
        for (int i = 0; i < size; i++) {
            if (array[i] != integerSet.hasElement(i)) {
                return false;
            }
        }

        return true;
    }

    public IntegerSet union(IntegerSet integerSet) {
        IntegerSet result = new IntegerSet();

        for (int i = 0; i < size; i++) {
            if (hasElement(i) || integerSet.hasElement(i)) {
                result.insertElement(i);
            }
        }

        return result;
    }

    public IntegerSet intersection(IntegerSet integerSet) {
        IntegerSet result = new IntegerSet();

        for (int i = 0; i < size; i++) {
            if (hasElement(i) && integerSet.hasElement(i)) {
                result.insertElement(i);
            }
        }

        return result;
    }

    private boolean validateElement(int element) {
        if (element > size - 1 || element < 0) {
            System.out.printf("O vetor so pode representar inteiros de 0 a %d.\n", size - 1);
            return false;
        } else {
            return true;
        }
    }

    private boolean validateArray(int[] array) {
        if (array.length > size) {
            int realLength = array.length;

            for (int i = 0; i < array.length; i++) {
                for (int k = 0; k < array.length; k++) {
                    if (i != k && array[i] == array[k]) {
                        realLength--;
                    }
                }
            }

            if (realLength > size) {
                System.out.println("O vetor fornecido contem mais itens do que o permitido.");
                return false;
            }
        }

        for (int i : array) {
            if (!validateElement(i)) {
                return false;
            }
        }

        return true;
    }
}
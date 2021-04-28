package  com.poo.ex4;

import com.poo.ex4.models.IntegerSet;

public class App {
    public static void main(String args[]) {
        // Utilizados para testes simples:
        IntegerSet integerSet1 = new IntegerSet();
        IntegerSet integerSet2 = new IntegerSet();
        IntegerSet resultado;

        // Validação dos métodos com objetos vazios:
        System.out.printf("integerSet1 igual integerSet2?   %b\n", integerSet1.isEqualTo(integerSet2));

        resultado = integerSet1.intersection(integerSet2);
        System.out.printf("integerSet1 intersection integerSet2?   %s\n", resultado.toSetString());

        resultado = integerSet1.union(integerSet2);
        System.out.printf("integerSet1 union integerSet2?   %s\n", resultado.toSetString());

        // Operações simples:
        integerSet1.insertElement(10);
        System.out.printf("10 atribuido integerSet1?   %b\n", integerSet1.hasElement(10));

        integerSet2.insertElement(100);
        System.out.printf("100 atribuido integerSet2?   %b\n", integerSet2.hasElement(100));

        integerSet1.insertElement(-10);
        System.out.printf("-10 atribuido integerSet2?   %b\n", integerSet2.hasElement(-10));

        integerSet2.insertElement(1000);
        System.out.printf("1000 atribuido integerSet2?   %b\n", integerSet2.hasElement(1000));

        // Validação dos métodos com objetos carregados:
        System.out.printf("integerSet1 igual integerSet2?   %b\n", integerSet1.isEqualTo(integerSet2));

        integerSet2.insertElement(10);
        resultado = integerSet1.intersection(integerSet2);
        System.out.printf("integerSet1 intersection integerSet2?   %s\n", resultado.toSetString());

        resultado = integerSet1.union(integerSet2);
        System.out.printf("integerSet1 union integerSet2?   %s\n", resultado.toSetString());

        // Testes de inicialização avançados:
        int arr3[] = new int[10];
        int arr4[] = new int[110];
        int arr5[] = new int[110];

        for (int i = 0; i < 10; i++) {
            arr3[i] = 10 - i;
        }

        for (int i = 0; i < 110; i++) {
            if (i > 20) {
                arr4[i] = 110 - i;
            } else {
                arr4[i] = 20;
            }
            arr5[i] = i;
        }

        IntegerSet integerSet3 = new IntegerSet(arr3);
        IntegerSet integerSet4 = new IntegerSet(arr4);
        IntegerSet integerSet5 = new IntegerSet(arr5);

        System.out.printf("integerSet3?   %s\n", integerSet3.toSetString());
        System.out.printf("integerSet4?   %s\n", integerSet4.toSetString());
        System.out.printf("integerSet5?   %s\n", integerSet5.toSetString());
    }
}
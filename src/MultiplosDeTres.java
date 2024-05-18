public class MultiplosDeTres {
    public static void main(String[] args) {

        int[] valores = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            valores[i] = Integer.parseInt(args[i]);
        }
        suma(valores);
        promedio(valores);
    }

    private static void suma(int[] valores) {
        int total = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 3 == 0) {
                total += valores[i];
            }
        }
        System.out.println(total);
    }

    static void promedio(int[] valores) {
        int total = 0;
        int contador = 0;
        for (int numero : valores) {
            if (numero % 3 == 0) {
                total += numero;
                contador++;
            }
        }
        System.out.print("la suma de tus multiplos de 3 es: ");
        suma(valores);
        System.out.println("el promedio de tu suma es: " + total / contador);
    }
}

public class Visitas {
    public static void main(String[] args) {

        int[] visitas = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            visitas[i] = Integer.parseInt(args[i]);
        }

        promedio(visitas);

    }

    static void promedio(int[] visitas) {
        float promedio = 0;
        for (int visita : visitas) {
            promedio += visita;
        }
        System.out.println("El promedio de visitas de de: " + promedio / visitas.length);

    }
}
public class SmartWacht {
    public static void main(String[] args) {

        int[] recorrido = new int[args.length] ;
        for (int i = 0; i < args.length; i++) {
            recorrido[i] = Integer.parseInt(args[i]);
        }
        recorrido = clearSteps(recorrido);
        int promedio = 0;
        int contador = 0;
        for (int j : recorrido) {
            if (j > 0) {
                promedio += j;
                contador++;
            }
        }
        System.out.println("El promedio de pasos diarios es de: " + promedio/contador);
    }
    static int[] clearSteps(int[] filtrar){
        int[] filtrados = new int[filtrar.length];
        for (int i = 0; i < filtrar.length; i++) {
            if(filtrar[i]>200 && filtrar[i]<100000){
                filtrados[i] = filtrar[i];
            }else{
                filtrados[i] = 0;
            }
        }
        return filtrados;
    }
}

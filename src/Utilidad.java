public class Utilidad {
       public static void limpiezaDePantalla() {
           System.out.print("\033[H");
           System.out.print("\033[2J");
           System.out.flush();
    }

       public static void tiempoDeEspera(int tiempo) {
        try {
           Thread.sleep(tiempo);
        } catch (InterruptedException e) {
           System.out.println("Interrupción en la espera: " + e.getMessage());
        }
    }
}
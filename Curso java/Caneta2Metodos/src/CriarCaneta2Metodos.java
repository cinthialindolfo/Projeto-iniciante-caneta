public class CriarCaneta2Metodos {
    public static void main(String[] args) {
        Caneta2Metodos c1 = new Caneta2Metodos("Compactor", "Amarela", 0.5f);
        c1.Status();
        Caneta2Metodos c2 = new Caneta2Metodos("Paciencia", "Verde", 1.3f);
        c2.Status();
//        c1.setModelo("BIC");
//        c1.setPonta(0.7f);
//        System.out.println("Tenho uma caneta " +c1.getModelo()+ " de ponta: " +c1.getPonta());
    }
}

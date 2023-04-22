public class main {
    public static void main(String[] args) {
        Socio s1 = new Socio("Javier Quintana Rodriguez","javi@gmail.com"
        ,"calle cordoba","46248642N");

        System.out.println(s1.toString());
        s1.EliminarCuenta();
        System.out.println(s1.toString());

    }

}

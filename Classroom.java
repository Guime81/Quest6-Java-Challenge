public class Classroom {
    public static void main(String[] args) {

        Wilder firstWilder = new Wilder("Samy", true);
        Wilder secondWilder = new Wilder("Alban", false);

        System.out.println("Le nom du premier de la classe est: " + firstWilder.getFirstname());
        System.out.println(secondWilder.getFirstname() + " a brillamment obtenu le titre de BIQUET !");

        System.out.println(firstWilder.whoAmI());
        System.out.println(secondWilder.whoAmI());

        firstWilder.setFirstname("JB");
        System.out.println("Le nom du premier de la classe a changé: " + firstWilder.getFirstname());

        System.out.println(firstWilder.whoAmI());

        secondWilder.setFirstname("Voldemort");
        secondWilder.setAware(false);

        System.out.println(secondWilder.whoAmI());
    }
}

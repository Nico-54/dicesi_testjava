public class Main {
    public static void main(String[] args) {

        Personne moi = new Personne("Nicolas", "123456");
        //moi.setRole();
        System.out.println(moi.getNom() + ' ' + moi.getAge() + " " + moi.getRole() + " " + moi.getPassword());

    }
}
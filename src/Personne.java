public class Personne {

    private String nom;
    private String role;
    private String password;
    private int age;

    public Personne(String nom, String role, int age, String password){
        this.nom = nom;
        this.age = age;
        this.role = role;
        this.password = password;
    }

    public Personne(String nom, String password){
        this.nom = nom;
        age = 18;
        role = "admin";
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

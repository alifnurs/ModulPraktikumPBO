public class Character {
    String name;
    int health;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void tampil(){
        System.out.println("karakter " + name+ " dengan health "+health);
    }

    public String toString(){
        return "Karakter : "+name;
    }
}

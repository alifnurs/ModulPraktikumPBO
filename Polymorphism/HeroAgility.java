public class HeroAgility extends Hero {
    String type;
    
    public HeroAgility(String name, double health){
       super(name, health);
       this.type = "Agility";
    }
    
    public void display(){
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}

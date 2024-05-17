import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Character karakter1 = new Character("karakter1", 100);
        Hero hero1 = new Hero("hero1", 100);
        Hero hero2 = new Hero("hero2", 100);
        Enemy enemy1 = new Enemy("enemy1", 100);

        ArrayList<Character> listkarakter = new ArrayList<>();

        //Operasi 1 = add (Menambah member)
        System.out.println("Operasi 1 : Add");
        listkarakter.add(karakter1);
        listkarakter.add(hero1);
        listkarakter.add(hero2);

        System.out.println(listkarakter);
        System.out.println();

        //Operasi 2 = set (merubah member)
        System.out.println("Operasi 2 : set");
        listkarakter.set(2, enemy1);
        System.out.println(listkarakter);
        System.out.println();

        //Operasi 3 = remove (Menghapus member)
        System.out.println("Operasi 3 : remove");
        listkarakter.remove(2);
        System.out.println(listkarakter);
        System.out.println();

        //Operasi 4 = get (mengakses member)
        System.out.println("Operasi 4 : get");
        Character karDuplikat = listkarakter.get(0);
        System.out.println(listkarakter);
        karDuplikat.tampil();
        System.out.println();

        //Method lain
        System.out.println("Method2 lain");
        System.out.println("1. size() : " + listkarakter.size());
        System.out.println("2. isEmpty() : "+ listkarakter.isEmpty());
        System.out.println("3. contains(hero2) : "+ listkarakter.contains(hero2));
        System.out.println("   contains(hero1) : "+ listkarakter.contains(hero1));
        System.out.println("4. indexOf(hero1) : "+ listkarakter.indexOf(hero1));
        System.out.println("   indexOf(karakter1) : "+listkarakter.indexOf(karakter1));      
    }
}
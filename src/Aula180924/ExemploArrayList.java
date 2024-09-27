package Aula180924;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        //ArrayList<tipo -> integer | Float | Double | Pessoa> nome = new
        ArrayList<String> l1 = new ArrayList<>();
        //Método p adicionar elementos
        l1.add("A");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        System.out.println(l1);
        l1.add(1, "B");
        System.out.println(l1);
    }
}

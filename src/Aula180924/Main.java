package Aula180924;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista(5);
        l1.adiciona("A");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");
        System.out.println(l1);
        System.out.println("Elemento da posição 1 "+l1.obter(1));
        try{
            System.out.println("Elemento da posicao 11 "+l1.obter(11));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        l1.adiciona(1,"B");
        System.out.println(l1);
        System.out.println("Removendo o elemento "+l1.remove(3));
        System.out.println(l1);
        System.out.println("Qual a posicao do 'D' na lista "+l1.posicaoDe("E"));
        System.out.println("Qual a posicao do 'D' na lista "+l1.posicaoDe("d"));
    }
}

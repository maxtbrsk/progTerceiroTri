package Aula021024;

import java.util.HashMap
public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitais = new HashMap<>();
        capitais.put("RS","Porto Alegre");
        capitais.put("PR","Curitiba");
        capitais.put("SC","Florianopolis");
        capitais.put("GO","Goiânia");

        for(String estado:capitais.keySet())
            System.out.println(estado+" ");

        for(String cidade:capitais.values())
            System.out.println(cidade+" ");

        for(String cidade:capitais.values())
            System.out.println(cidade+" ");

        System.out.println(capitais);
        capitais.put("RS","Rio Grande");
        System.out.println(capitais);
        System.out.println(capitais.get("RS"));
    }
}

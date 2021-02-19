package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args){

        Map<String, String> cookies = new TreeMap<>();

        //inserirndo elementos
        cookies.put("nome", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("telefone", "62998855667");

        //removendo  pela chave email
        cookies.remove("email");

        System.out.println("Lista de todos: ");
        for(String key : cookies.keySet()){
            System.out.println(key +": "+cookies.get(key));
        }
    }
}

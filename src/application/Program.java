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

        //No Map contem?
        System.out.println("No Map contem a chave telefone? "+ cookies.containsKey("telefone"));

        //pegando o valor que contem na chave...
        System.out.println("O numero do telefone é: "+cookies.get("telefone"));

        //buscanco com map um valor que não existe
        System.out.println("Email: "+cookies.get("email"));

        //tamanho do Map
        System.out.println("Tamanho do Map: "+cookies.size());

        System.out.println("Lista de todos: ");
        for(String key : cookies.keySet()){
            System.out.println(key +": "+cookies.get(key));
        }
    }
}

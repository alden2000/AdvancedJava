package org.example.JavaAdvancedTest1.Zadaca2;

public class ConteinerDemo {
    public static void main(String[] args) {
        Conteiner<Integer> conteiner=new Conteiner<>();
        conteiner.add(25);
        conteiner.add(22);
        conteiner.add(33);
        conteiner.add(55);
        conteiner.remove(55);
        conteiner.remove(22);
        Conteiner<String> conteiner2=new Conteiner<>();
        conteiner2.add("Radi");
        conteiner2.add("Ne radi");
        conteiner2.remove("Radi");
        for (int i : conteiner){
            System.out.println(i);
        }
        for (String i : conteiner2){
            System.out.println(i);
        }
        Conteiner<Person> conteiner3=new Conteiner<>();
        Person person1=new Person();
        person1.setName("Zuti");
        person1.setSurname("Gavran");
        Person person2=new Person();
        person2.setName("Bik");
        person2.setSurname("KojiSjedi");
        conteiner3.add(person1);
        conteiner3.add(person2);
        conteiner3.remove(person1);
        for (Person i : conteiner3){
            System.out.println(i.getName()+" "+ i.getSurname());
        }
    }
}

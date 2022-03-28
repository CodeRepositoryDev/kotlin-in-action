package me.kylo.second;

public class PersonMain {
    public static void main(String[] args) {
        PersonKotlin person = new PersonKotlin("Kylo", false);
        System.out.println(person.getName());
        System.out.println(person.isMarried());

        person.setMarried(true);
    }
}

package task16;

import lesson16.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) {
        List<PersonStream> persons = new ArrayList<>();
        persons.add(new PersonStream("Bob", "Lem", 24));
        persons.add(new PersonStream("Bor", "Lem", 23));
        persons.add(new PersonStream("Bot", "Dem", 25));
        persons.add(new PersonStream("Bobt", "Lcem", 54));
        persons.add(new PersonStream("Bobv", "Lebm", 44));
        persons.add(new PersonStream("Bobb", "Lemb", 34));
        persons.add(new PersonStream("Bobf", "Lem", 23));
        persons.add(new PersonStream("Bokgf", "Lem", 64));
        persons.add(new PersonStream("Bok", "Leml", 22));
        persons.add(new PersonStream("Bos", "Leim", 21));
        persons.add(new PersonStream("Bof", "Lemu", 27));
        persons.add(new PersonStream("Bob", "Lemu", 29));
        persons.add(new PersonStream("Boe", "Lemd", 22));
        persons.add(new PersonStream("Boy", "Leme", 38));
        persons.add(new PersonStream("Bobe", "Lemr", 34));
        persons.add(new PersonStream("Boe", "Lemr", 19));
        persons.add(new PersonStream("Bore", "Lemw", 24));
        persons.add(new PersonStream("Brtyb", "Lemer", 34));
        persons.add(new PersonStream("Bob", "Leme", 43));
        persons.add(new PersonStream("Bob", "Lemr", 25));
        persons.add(new PersonStream("Bqb", "Lem", 27));
        persons.add(new PersonStream("Bab", "Lemg", 64));
        persons.add(new PersonStream("Bsb", "Lemg", 74));
        persons.add(new PersonStream("Boas", "Lem", 32));
        persons.add(new PersonStream("Bob", "Lemg", 20));
        persons.add(new PersonStream("Boss", "Lemd", 34));
        persons.add(new PersonStream("Bos", "Lemgd", 54));
        persons.add(new PersonStream("Boe", "Lemdd", 24));
        persons.add(new PersonStream("Bow", "Lem", 25));
        persons.add(new PersonStream("Bof", "Ledfsm", 24));
        persons.add(new PersonStream("Bod", "Lem", 24));
        persons.add(new PersonStream("Zol", "Lfsssem", 54));
        persons.add(new PersonStream("Zob", "Lem", 26));
        persons.add(new PersonStream("Vob", "gem", 27));
        persons.add(new PersonStream("Mob", "Fem", 28));
        persons.add(new PersonStream("Hob", "Lfgdem", 94));
        persons.add(new PersonStream("Hob", "Legdsm", 54));
        persons.add(new PersonStream("Kob", "Lems", 22));
        persons.add(new PersonStream("Pob", "Lesam", 34));
        persons.add(new PersonStream("Lob", "Lesm", 25));
        persons.add(new PersonStream("Kob", "Lems", 20));
        persons.add(new PersonStream("Nob", "Lesdm", 14));
        persons.add(new PersonStream("Vob", "Yem", 2));
        persons.add(new PersonStream("Dob", "temcd", 4));
        persons.add(new PersonStream("Bob", "gem", 19));
        System.out.println(persons.stream().filter(person -> person.getAge() < 21).sorted(Comparator.comparing(PersonStream::getSurname))
                .sorted(Comparator.comparing(PersonStream::getName)).limit(4)
                .collect(Collectors.toList()));




    }
}

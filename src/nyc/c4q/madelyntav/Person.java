package nyc.c4q.madelyntav;

/**
 * Created by c4q-madelyntavarez on 3/27/15.
 */
public class Person {
    protected String name;
    protected String city;
    private String number;


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setNumber( String number) {
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }


    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("John");
        person1.setCity("New York City");

        Person person2 = new Person();
        person2.setName("Jackie");
        person2.setCity("Miami");
        person2.setNumber("9175043573");

        if (sameCity(person1,person2)) {
            System.out.println((person2.getName()) +" and "+ (person1.getName() + " both live in the same city"));
        } else
            System.out.println((person2.getName())+ " and " +(person1.getName() + " live in different cities"));

        }


    public static Person registerChild (Person person2){
        Person person3= new Person();
        person3.setName("Baby");
        person3.setCity(person2.getCity());
        person3.setNumber(person2.getNumber());
        return person3;
    }


    public static boolean sameCity(Person person1, Person person2){
        return (person1.getCity().equalsIgnoreCase(person2.getCity()));
    }


}





public class Dog implements  Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog puppy = new Dog();
        Dog snoopy =(Dog) puppy.clone();
        System.out.println(puppy);
        System.out.println(snoopy);
    }
    int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package reflection;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("zhe ge ren shi :" + person.name);

        Class<? extends Person> c1 = person.getClass();
        System.out.println(c1.hashCode());
        Class<?> c2 = Class.forName("reflection.Student");
        System.out.println(c2.hashCode());
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());

        Class<?> superclass = c2.getSuperclass();
        System.out.println(superclass.getName());
    }
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {

    public Student() {
        this.name = "xueshen";
    }
}

class Teacher extends Person {

    public Teacher() {
        this.name = "laoshi";
    }
}



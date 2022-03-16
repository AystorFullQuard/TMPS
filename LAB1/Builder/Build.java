public class Build {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl().setAge(22).setSalary(1500).setName("Max").Build();
        person.print();
    }
}

class Person {
    String name;
    int age;
    int salary;

    public void print() {
        System.out.println(name + " " + age + " " + salary);
    }
}

interface PersonBuilder {
    PersonBuilder setName(String name);

    PersonBuilder setAge(int age);

    PersonBuilder setSalary(int salary);

    Person Build();
}

class PersonBuilderImpl implements PersonBuilder {
    Person personObj = new Person();

    @Override
    public PersonBuilder setName(String name) {
        personObj.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        personObj.age = age;
        return this;
    }

    @Override
    public PersonBuilder setSalary(int salary) {
        personObj.salary = salary;
        return this;
    }

    @Override
    public Person Build() {
        return personObj;
    }
}
package design;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Converter<T,U> {
    private Function<T,U> fromDto;
    private Function<U,T> fromEntity;
    public Converter(final Function<T, U> fromDto, final Function<U, T> fromEntity) {
        this.fromDto = fromDto;
        this.fromEntity = fromEntity;
    }
    public final U converterFromDto(final T dto){
        return fromDto.apply(dto);
    }

    public final T converterFromEntity(final U entity){
        return fromEntity.apply(entity);
    }

    public final List<U> batchConverterFromDto(final List<T> dtos){
        return dtos.stream().map(this::converterFromDto).collect(Collectors.toList());
    }

    public final List<T> batchConverterFromEntity(final List<U> entities){
        return entities.stream().map(this::converterFromEntity).collect(Collectors.toList());
    }

}

class PersonConverter extends Converter<PersonDto, Person> {
    public PersonConverter() {
        super(new PersonDtoFunction(), new PersonFunction());
    }
    // 自定义转换规则
    static class PersonDtoFunction implements Function<PersonDto, Person> {
        @Override
        public Person apply(PersonDto personDto) {
            // 可定制需要复制的属性
            Person person = new Person();
            person.setName(personDto.getName());
            person.setAge(personDto.getAge());
            person.setGender(personDto.getGender());
            return person;
        }
    }
    // 自定义转换规则
    static class PersonFunction implements Function<Person, PersonDto> {
        @Override
        public PersonDto apply(Person person) {
            // 可定制需要复制的属性
            PersonDto dto = new PersonDto();
            dto.setName(person.getName());
            dto.setAge(person.getAge());
            dto.setGender(person.getGender());
            return dto;
        }
    }
}

class PersonDto {

    private String name;

    private int age;

    private String gender;

    private String address;

    public PersonDto(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public PersonDto() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Person {

    private String name;

    private int age;

    private String gender;

    private String job;
    public Person(String name, int age, String gender, String job) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }
    public Person() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

class App {

    public static void main(String[] args) {
        Converter<PersonDto, Person> converter = new PersonConverter();

        PersonDto personDto = new PersonDto("zhangsan", 23, "male", "chengdou");
        Person person =  converter.converterFromDto(personDto);

        System.out.println(person);
    }
}

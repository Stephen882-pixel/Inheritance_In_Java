package Third_Package_Inheritance;

public class Main {
    public static void main(String[] args){
        Teacher t = new Teacher();
        Student s = new Student();


        t.setPost("Head Teacher");
        t.setGender(" Male ");
        t.setAge(41);
        t.setMarital_Status(" Married ");
        t.setReligion(" Christianity ");

        s.setPost(" Captain ");
        s.setGender(" Female ");
        s.setAge(22);
        s.setMarital_Status(" Female ");
        s.setReligion(" Christianity ");

        Parent p = new Parent();
        p.setPost(" Doctor ");
        p.setGender(" Male ");
        p.setAge(45);
        p.setMarital_Status(" divorced ");
        p.setReligion(" Islam ");


        System.out.println("The teachers gender is:" + t.getGender());
        System.out.println("The teachers age is: " + t.getAge());
        System.out.println("The teachers marital status is: " + t.getMarital_Status());
        System.out.println("The teachers religion is: " + t.getReligion());
        System.out.println("The teachers post is :" + t.getPost());

        System.out.println("The Student gender is:" + s.getGender());
        System.out.println("The Student age is: " + s.getAge());
        System.out.println("The student marital status is: " + s.getMarital_Status());
        System.out.println("The student religion is: " + s.getReligion());
        System.out.println("The student post is :" + s.getPost());

        System.out.println("The paren gender is:" + p.getGender());
        System.out.println("The parent age is: " + p.getAge());
        System.out.println("The parent  marital status is: " + p.getMarital_Status());
        System.out.println("The parent religion is: " + p.getReligion());
        System.out.println("The parent post is :" + p.getPost());

    }
}

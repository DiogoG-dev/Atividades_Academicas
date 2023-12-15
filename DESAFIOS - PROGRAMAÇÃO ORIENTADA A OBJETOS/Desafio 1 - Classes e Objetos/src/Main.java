public class Main {
    public static void main(String[] args){
        //CRIANDO PERSON
        Person p1 = new Person("Diogo",
                "Gabriel",
                29,
                "Rua Qualquer",
                "+5517999999999",
                "email2@gmail.com");
        Person p2 = new Person("Tifane",
                "Sobrenome",
                18,
                "Rua Qualquer 2",
                "+5516991515511",
                "email2@gmail.com");
        Person p3 = new Person("Pedro",
                "Sobrenome",
                31,
                "Sitio Qualquer",
                "+5515991111111",
                "email3@gmail.com");

        //SPEAK
        p1.speak("Olá gente!");
        p2.speak("Olá pessoal!");
        p3.speak("Opa galera!");

        //WALK
        p1.walk(5000);
        p2.walk(560);
        p3.walk(3000);

        //INCREASE_AGE_BY_YEARS
        p1.increaseAgeByYears(8);
        p2.increaseAgeByYears(7);
        p3.increaseAgeByYears(1);

        //EAT
        p1.eat("Macarrão");
        p2.eat("Açai");
        p3.eat("Banana");

        //DISPLAY_INFO
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();


        //CRIANDO COMPANY
        Company c1 = new Company("SOFTWARE COMPANY", 3, p1);
        Company c2 = new Company("INSS", 1052, p2);
        Company c3 = new Company("RECEITA FEDERAL", 2506, p3);

        //HIREEMPLOYEE
        c1.hireEmployee(p2);
        c1.hireEmployee(p3);
        c2.hireEmployee(p1);
        c2.hireEmployee(p3);
        c3.hireEmployee(p1);
        c3.hireEmployee(p2);

        //SCHEDULEMEETING
        c1.scheduleMeeting("17/12/2023 at 19:45hrs.");
        c2.scheduleMeeting("01/10/2023 at 21:00hrs.");
        c3.scheduleMeeting("05/02/2024 at 15:30hrs.");

        //DISPLAYCOMPANYINFO
        c1.displayCompanyInfo();
        c2.displayCompanyInfo();
        c3.displayCompanyInfo();
    }
}

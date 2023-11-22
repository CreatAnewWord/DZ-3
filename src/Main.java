public class Main {





    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.InfoCow(1,12,"ksimovroma@gmail.com","Юнга","Царенко Богдан Романович");
    }
}
class Employee{


    //1. Створити порожній проект в IntelliJ +
    //
    //2. Створити клас "Співробітник" з полями: ПІБ, посада, email, телефон, вік.
    //
    //3. Конструктор класу повинен заповнювати ці поля під час створення об'єкта. Забезпечити інкапсуляцію внутрішніх властивостей класу. +
    //
    //4. Створити два класи з однаковим ім'ям SameName. (Використовувати пакети)
    //
    //5. Створити клас Car з публічним методом start. Метод start викликає у собі методи:
    //
    //	- startElectricity()
    //
    //	- startCommand()
    //
    //	- startFuelSystem()
    //
    //  Перелічені методи, є внутрішньою (прихованою) частиною комплексного методу start. Вони по суті відображають внутрішню поведінку класу Car і не повинні використовуватися за межами даного класу.

    int number;
    int years;
    String email;
    String position;

    String BIO;

    public Employee() {
        this.number = number;
        this.years = years;
        this.email = email;
        this.position = position;
        this.BIO = BIO;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBIO() {
        return BIO;
    }

    public void setBIO(String BIO) {
        this.BIO = BIO;
    }

    public void InfoCow(int number, int years, String email, String position, String BIO){
        System.out.println("Трішки інфи про робітника:" + " " + "Номер телефону" + " " + number + " " + "Вік" + " " + years + " " + "Email" + " "  + email + " " + "Посада" + " "  + position+ " " + "БІО" + " "  + BIO);
    }


}
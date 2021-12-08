package Question2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws ParseException, ageException {
        DrivingLicenseApplication drivingLicenseApplication = new DrivingLicenseApplication();
    }
    Date dateOfBirth;
    Calendar today = Calendar.getInstance();
    Calendar birthday = Calendar.getInstance();
    int age;

    public DrivingLicenseApplication() throws ParseException, ageException {
        System.out.println("When is your birthday ?");
        System.out.println("Please tell us your birthday in \"MM-DD-YYYY\" format");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            this.dateOfBirth = new SimpleDateFormat("MM-DD-YYYY").parse(scanner.next());
        }
        today.setTime(new Date());
        birthday.setTime(dateOfBirth);

        if(birthday.after(today)){
            throw new IllegalArgumentException(" Your birthday is invalid");
        }
        age  = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        if(today.get(Calendar.DAY_OF_YEAR) < birthday.get(Calendar.DAY_OF_YEAR)){
            age = age - 1;
        }


        try{
            apply(age);
        } catch (ageException e) {
            System.out.println("The age of the applicant is "+ e.getAge() + " which is too early to apply for a driving license");
            e.printStackTrace();
        }}
        public static void apply(int age) throws ageException {
            if(age < 16) throw new ageException(age);
        }


   static class ageException extends Exception {
       int age;

       public ageException(int age) {
           this.age = age;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }
   }}


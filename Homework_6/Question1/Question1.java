package Question1;

import Question2.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;

public class Question1 {
    public static void main(String[] args) throws ParseException {
      Student James = new Student(1 ,"James",4.0, new SimpleDateFormat("MM/DD/YYYY").parse("12/06/1954"));
      Student Robert = new Student(2, "Robert", 2.5, new SimpleDateFormat("MM/DD/YYYY").parse("05/14/1984"));
      Student Mary = new Student(3, "Mary", 3.6, new SimpleDateFormat("MM/DD/YYYY").parse("12/21/1999"));
      Student Sarah = new Student(4, "Sarah", 3.8, new SimpleDateFormat("MM/DD/YYYY").parse("11/25/2007"));
      Student Thomas = new Student(5, "Thomas", 3.5, new SimpleDateFormat("MM/DD/YYYY").parse("07/11/2017"));
      Student Lisa = new Student(6, "Lisa", 1.9, new SimpleDateFormat("MM/DD/YYYY").parse("10/25/2006"));
      Student Paul = new Student(7, "Paul", 3.0, new SimpleDateFormat("MM/DD/YYYY").parse("03/26/1998"));

        List<Student> list = new ArrayList<Student>();
        list.add(James);
        list.add(Robert);
        list.add(Mary);
        list.add(Sarah);
        list.add(Thomas);
        list.add(Lisa);
        list.add(Paul);


        System.out.println("Sort by ascending order of 'name'");
        Collections.sort(list, Question1::NameComparator);
        for(Student students : list){
           print(students);
        }

      System.out.println("Sort by descending order of 'gpa'");
      Collections.sort(list, Question1::GpaComparator);
      for(Student students : list){
        print(students);
      }

      System.out.println("Sort by ascending order of 'dateOfBirth'");
      Collections.sort(list, Question1::DateOfBirthComparator);
      for(Student students : list){
        print(students);
      }
      }

    //1. NameComparator: Student objects should be sorted in ascending order by 'name' field of the object;
    public static int NameComparator(Student i, Student j){
      return i.getName().compareTo(j.getName());
    }
   //2. GpaComparator: Student objects should be sorted in descending order by 'gpa' field of the object;
    public static int GpaComparator(Student i, Student j) {
      if(i.getGpa()> j.getGpa()) return -1;
      else if (i.getGpa()> j.getGpa()) return 0;
      else return 1;
    }

    //3. DateOfBirthComparator: Student objects should be sorted in ascending order by 'dateOfBirth' field of the object;
     public static int DateOfBirthComparator(Student i, Student j){
      return i.getDateOfBirth().compareTo(j.getDateOfBirth());
     }
     public static void print(Student student){
       System.out.println("ID: " + student.getId() + " Name: " + student.getName() + " GPA: " + student.getGpa() + " DateOFBirth " + student.getDateOfBirth());

     }

}

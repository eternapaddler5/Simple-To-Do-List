import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ToDoList {

    private String Task; // what's the task you would like to execute.
    private String Details; // some specific details for the task.
    private String Date; // the scheduled date you would like to execute that task.
    private String Time; // the scheduled time you would like to do it.
    private String location; // the specific place to which you would like to execute this at.

    void dataCollection() {

        try {
            FileWriter file = new FileWriter("C:/Users/David/Desktop/MY_TO_DO_LIST.txt", true); // file object with append mode.
            Scanner scanner = new Scanner(System.in); // scanner object.

            String answer;
            do {
                System.out.println("What task would you like to do?: "); // asking the task at hand.
                this.Task = scanner.nextLine();

                file.write("---------------------\n");
                file.write("Title : " + Task + " \n");
                file.write("---------------------\n");

                System.out.println("What are the specifications of the task?: "); // asking task description.
                this.Details = scanner.nextLine();

                file.write("* " + Details + " \n");

                System.out.println("On which date would you like this task to be done?: "); // asking when the task.
                this.Date = scanner.nextLine();

                file.write(" " + Date);

                System.out.println("Around what time would you like to do it?: "); // asking what time the task can be done.
                this.Time = scanner.nextLine();

                file.write(" " + Time + " \n");

                System.out.println("Where would you like to do it from?: "); // asking which place the task can be done.
                this.location = scanner.nextLine();

                file.write(" " + location + " \n");

                System.out.println("");
                System.out.println("Is there another task you would like to enlist? (yes/no) ");
                answer = scanner.nextLine();

            } while (answer.equalsIgnoreCase("yes"));

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Great! Kindly go to your desktop. That is where your To do list has been saved. Good luck on your tasks. :)");
            }

            file.close();
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace(); // this will help us track if an error occurs.
        }

    }

 
}

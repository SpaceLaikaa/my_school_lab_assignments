package first_year_labs.lab_projects_Semester1.lab9;
import java.io.IOException;//"src/lab_projects/lab9/q3.txt"
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileWriter;

public class EmployeeManager {
        Employee[] employees = new Employee[3];;
        Scanner reader = null;
        Formatter f = null;
        FileWriter fw = null;

        public void loadEmployeesFromFile(String filePath){
            int index=0;
            try{
                reader = new Scanner(Paths.get(filePath));
                while(reader.hasNextLine()&&index<employees.length){
                    String line = reader.nextLine();
                    if(line.trim().isEmpty()) continue;
                    String[] words = line.split(" ");
                    if(words.length>=3){
                        String name = words[0];
                        String department = words[1];
                        String email = words[2];

                        Employee newEmployee = new Employee(name, department, email);
                        employees[index] =  newEmployee;
                        index++;
                    }
                }
            }catch (IOException e){e.printStackTrace();}
            finally {
                if(reader != null){reader.close();}
                if(f != null){f.close();}
            }
        }
        public void displayEmployees(){
            for (int i =0;i<employees.length;i++){
                System.out.println(employees[i]);
            }
        }
        public void addEmployee(String name, String department, String email){
            Employee newEmployee = new Employee(name,department,email);
            FileWriter fw = null;
            try{
               fw = new FileWriter("src/lab_projects/lab9/q3.txt", true);
               f = new Formatter(fw);
               f.format("%s%n", newEmployee);
               employees[2]=newEmployee;
            }catch (IOException e){e.printStackTrace();}
             finally {
                 if (f!=null) f.close();
            }
        }
        public void searchEmployee(String name){
            Scanner reader = null;
            int count = 0;
            try{
                reader = new Scanner(Paths.get("src/lab_projects/lab9/q3.txt"));
                while (reader.hasNextLine()){
                    String line = reader.nextLine();
                    if(line.trim().isEmpty())continue;
                    String[] words = line.split(", ");
                    for (int i =0;i<words.length;i+=3){
                        if(words[i].equalsIgnoreCase(name)){
                            count++;
                            System.out.println(count+"- "+words[i] +" is on the list.");
                        }
                        else {
                            count++;
                            System.out.println(count+"- Not your input.");
                        }
                    }
                }
            }catch (IOException e){e.printStackTrace();}
            finally {if (reader!=null){reader.close();}}


        }
    }


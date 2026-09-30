package first_year_labs.lab_projects_Semester1.lab7.L7Assignment3;

public class lab7assignment3BookDemo {


    public static void main(String[] args) {
        Book b1 = new Book("Animal Farm",144);
        Book b2 = b1;
        Book b3 = new Book("The Picture of Dorian Gray",304);// My fav book btw

        String titles = b2.titles;
        int pages = b2.pages;

        System.out.println("==Book b1==");
        b1.printBook();
        System.out.println("==Book b2==");
        b2.printBook();
        //Both of b2 and b1 shows the same result because actually when we called book b2 = b1
        //it literally copies b1 to b2
        System.out.println("==Book b3==");
        b3.printBook();
        // As we can see that b3 is completly different from b1

        System.out.println("");


        int result1 = b1.addPages(40);
        System.out.println(result1);

        int result2 = b2.addPages(20);
        System.out.println(result2);
    }

}

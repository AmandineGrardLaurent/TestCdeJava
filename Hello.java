import java.util.Scanner;

public class Hello{
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);

        System.out.println("Bonjour et bienvenue dans mon programme java");
        System.out.println("Quel est votre prénom ? ");
        String firstname = scan.nextLine();
        System.out.println("Salut " + firstname);
        System.out.println("Quel est votre nom ? ");
        String lastname = scan.nextLine();
        System.out.println("Bienvenue " + firstname + " " + lastname);
    }
}
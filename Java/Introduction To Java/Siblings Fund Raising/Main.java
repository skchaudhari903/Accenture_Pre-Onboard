import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of boxes sold by Sara");
        int sara = scan.nextInt();
        System.out.println("Enter the number of boxes sold by Harry");
        int harry = scan.nextInt();
        System.out.println("Enter the number of boxes sold by Leo");
        int leo = scan.nextInt();
        System.out.println("Enter the number of boxes sold by James");
        int james = scan.nextInt();
        if(sara == james && james == harry && harry == leo)
            System.out.println("All get the same gifts.");
        else if(sara == james && james == harry && harry > leo)
            System.out.println("Sara, Harry and James receive the gifts.");
        else if(sara == harry && harry == leo && leo > james)
            System.out.println("Sara, Harry and Leo receive the gifts.");
        else if(sara == james && james == leo && leo > harry)
            System.out.println("Sara, Leo and James receive the gifts.");
        else if(james == leo && leo == harry && harry > sara)
            System.out.println("Harry, Leo and James receive the gifts.");
        else if(sara == james && sara > harry && sara > leo)
            System.out.println("Sara and James receive the gifts.");
        else if(sara == leo && sara > harry && sara > james)
            System.out.println("Sara and Leo receive the gifts.");
        else if(harry == leo && leo > sara && leo > james)
            System.out.println("Harry and Leo receive the gifts.");
        else if(harry == james && james > sara && james > leo)
            System.out.println("Harry and James receive the gifts.");
        else if(leo == james && james > sara && james > harry)
            System.out.println("Leo and James receive the gifts.");
        else if(sara > james && sara > leo && sara > harry)
            System.out.println("Sara receives the gifts.");
        else if(james > sara && james > leo && james > harry)
            System.out.println("James receives the gifts.");
        else if(leo > sara && leo > james && leo > harry)
            System.out.println("Leo receives the gifts.");
        else
            System.out.println("Harry receives the gifts.");
    }
}
package week3;

public class CatNames {

   static String catname3= "Jack";
    public static void main(String[] args){
        System.out.println("cats are cool");
        String catTest = "Greg";
        System.out.println(catTest);
        System.out.println(catname3);
        // Initialize an object
        // NameOfFile NameOfObject = new NameOfContructor();
        Access cat = new Access();
        System.out.println(cat.catPublic);
        System.out.println(cat.getCat1());
        System.out.println(cat.getCat2());
        System.out.println(cat.getCatPublic());

    }

}

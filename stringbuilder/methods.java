import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name="Himanshi Bhardwaj";
        //converting into char array
        System.out.println(Arrays.toString(name.toCharArray()));
        //conerting to upper case
        System.out.println(name.toUpperCase());//it will create a new object
        //give index
        System.out.println(name.indexOf('B'));
        //to remove extra space
        System.out.println("            name       ".strip());
        //to split by space
        //it return result in array
        System.out.println(Arrays.toString(name.split( " ")));

        
    }
}

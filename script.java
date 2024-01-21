
public class script {

    public static void main(String[] args) {
        
        int a = add(5, 10);
        int b = sub(10, 5);

        System.out.println(a);
        System.out.println(b);
 
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

}
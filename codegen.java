import java.util.Random;
public class codegen {
    public static void main(String[] args) {

        int number;
        Random random=new Random();
        number=random.nextInt(10000);
        System.out.println("Genreated number is:"+number);
    }
}

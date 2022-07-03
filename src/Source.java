import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    String[] string = new String[] {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        System.out.println(points(string)==30);
    }
    public static int points(String[] games) {
        return Arrays.stream(games)
                .map(e-> e.split(":"))
                .map(i->new int[] {Integer.parseInt(i[0]),Integer.parseInt(i[1])})
                .mapToInt(i->(i[0]>i[1])? 3 : (i[0]==i[1])? 1 : 0).sum();
    }
}

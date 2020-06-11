public class Digit {
    public String solve(String s){
        String result = "";
        char array [] = s.toCharArray();
        int k =0;

        for(int i=0; i < array.length; i++){
            int number =Integer.parseInt(String.valueOf(array[i]));
            for(int j=0;j<number;j++){
                result+=array[k];
            }
            k++;

        }
        return result;
    }
    public static void main(String []args){
    Digit dig = new Digit();
        System.out.println(dig.solve("135"));
    }
}

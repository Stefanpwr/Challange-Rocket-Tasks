public class IncrementArray {
    public char[] solve(char array []){
        char result[];
        String s = "";
        for(int i =0; i< array.length; i++){
            s+=array[i];
        }
        int number = Integer.parseInt(s);
        number++;
        String temp = String.valueOf(number);

        result = temp.toCharArray();
        return result;


    }
    public static void main(String [] args){
        IncrementArray incA = new IncrementArray();
        char array [] = {'1', '2', '3','4'};
        System.out.println(incA.solve(array));
    }
}

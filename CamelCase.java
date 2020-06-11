public class CamelCase {
    public String camelCase(String s){
        String result = "";

        char [] temp = s.toCharArray();
        for(int i =0; i< temp.length; i++) {
            if (Character.isDigit(temp[i])) {

            } else {
                if (Character.isUpperCase(temp[i])) {
                    if(i!=0) {
                        result += "-";
                        result += Character.toLowerCase(temp[i]);
                    }else{

                        result += Character.toLowerCase(temp[i]);
                    }
                } else {
                    result += Character.toLowerCase(temp[i]);
                }
            }
        }

        return result;
    }
    public static void main(String [] args){
        CamelCase cc = new CamelCase();
        System.out.println(cc.camelCase("myName1"));
    }
}

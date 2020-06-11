class App {
    public int solve(int number) {
        int result = 0;
        int temp_value = 1;
        String s = Integer.toString(number);
        char temp[] = s.toCharArray();


        //Check if there is an 0 in input.
        for (int i = 0; i < temp.length; i++) {
            temp_value = temp_value * Character.getNumericValue(temp[i]);


            if (Character.getNumericValue(temp[i])== 0) {
                result ++;
                break;
            }
        }

        if (result == 1) {
            return result;

        } else {
            //
            for (int j = 0; j < temp.length; j++) {
                String hype = Integer.toString(temp_value);
                temp_value = 1;
                char secondary[] = hype.toCharArray();
                if(secondary.length == 1){
                    result++;
                    break;
                }

                for (int i = 0; i < secondary.length; i++) {
                    if (secondary[i] == 0) {
                        result += 1;
                        return  result;

                    }
                    temp_value = temp_value * Character.getNumericValue(secondary[i]);
                }
                result++;
            }
            return result;
        }

        //If result is equal 1 then number had a 0 in 1st loop so the result is 1.


    }


    public static void main(String []args){
        App app = new App();
        System.out.println(app.solve(1234));
    }

}
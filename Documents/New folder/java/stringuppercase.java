public class stringuppercase{
    public static String upperfirst(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;    
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<str.length();i++){
            Integer count = 0;
            sb.append(str.charAt(i));
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count ++;
                i++;
            }
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        // String str = "hi i am harshit mohindra.";
        // System.out.println(upperfirst(str));
        String str2 = "aaabbcccdd";
        System.out.println(compress(str2));
    }
}
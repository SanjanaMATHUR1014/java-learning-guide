public class StringReverse{
    public static void main(String[] args) {
        String str= "Reverse";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("Reversed String: "+rev);
    }
}
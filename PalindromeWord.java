public class PalindromeWord {
    public static void main(String[] args) {
        String str="I love my mom and dad";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(palindromeString(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean palindromeString(String s){
        s=s.toLowerCase();
        String result="";
        for (int i = s.length()-1; i >=0; i--) {
            result+=s.charAt(i);
        }
        if(s.equals(result)){
        return true;
        }
        else{
            return false;
        }
    }
}

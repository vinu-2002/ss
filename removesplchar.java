public class removesplchar {
    public static void main(String[] args) {
        String s="vin@a#y!ak";
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                res+=s.charAt(i);
            }
        }
        System.out.println(res);

        System.out.println("approacch 2");
        String res1=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(res1);
    }
}

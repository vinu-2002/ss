public class remmoveduplicates {
    //brute force approach
    public static void main(String[] args) {
        String s="vinayaka";

        String res="";
        int count=0;
        for(int i=0;i<s.length();i++){
            count=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>0){

            }
            else{
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }
}

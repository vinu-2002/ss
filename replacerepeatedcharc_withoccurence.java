public class replacerepeatedcharc_withoccurence {
    public static void main(String[] args) {
        String s="opentext";
        char repl='t';
        //check char preset in strinh
        if(s.indexOf(repl)==-1){
            System.out.println("char not present");
            System.exit(0);
        }
        char c[]=s.toCharArray();
        int count=1;
        for(int i=0;i<c.length;i++){
            if(c[i]==repl){

                c[i]= String.valueOf(count).charAt(0);

                count++;
            }
        }
        System.out.println(new String(c));
    }
}

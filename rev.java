public class rev {

    public static void main(String[] args) {
        String s="vinu";
        char c[]=s.toCharArray();
        String res="";
        for(int  i=0;i<c.length;i++){
            res=c[i]+res;
        }
        System.out.println(res);

        //approach 2
        StringBuffer sb=new StringBuffer(s);

        System.out.println(sb.reverse());

        StringBuilder sd=new StringBuilder(s);
        System.out.println(sd.reverse());
    }
}

public class sorting {
    public static void main(String[] args) {
        String s="vinayak";
        char c[]=s.toCharArray();

        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        String res="";
        for (int i=0;i<c.length;i++){
            res+=c[i];

        }
        System.out.println(res);
    }
}

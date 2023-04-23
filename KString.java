public class KString {
    public static void kthLargestString(String[] s, int k){
        StringBuilder s1= new StringBuilder();
        for(int i=0;i<s.length;i++){
            if(s[i].equals("")){
                continue;
            }
            else{
                s1.append(s[i]);
                if(s1.length()>k){
                    System.out.println(s1);
                }
                s1.delete(0,s1.length());
            }
        }
    }

    public static void main(String[] args) {
        String[] arr={"array","react","for","whyareyou"};
        kthLargestString(arr,3);
    }
}

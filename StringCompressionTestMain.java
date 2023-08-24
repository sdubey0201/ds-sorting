public class StringCompressionTestMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String input = "aabcccccaa";
        String output = compressed(input);
        System.out.println("-------------input---------");
        System.out.println(input);
        System.out.println("-------output------------");
        System.out.println(output);
    }

    public static String compressed(String str){
        String compressed = "";
        int count = 0;
        for (int i =0;i<str.length();i++){
            count++;
            if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)){
                char c = str.charAt(i);
                compressed += c+""+count;
                count =0;
            }
        }
        return compressed;

    }
}
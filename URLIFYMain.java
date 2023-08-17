import java.util.Arrays;

public class URLIFYMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String stt = "Mr john smith    ";
        //out put should be "mr%20john%20smith"
        int trueLength  = 13;
       char[] result =  replaceSpaces(stt.toCharArray(),trueLength);
        System.out.println("result "+Arrays.toString(result));
    }

    public static char [] replaceSpaces(char [] value, int trueLength){
        System.out.println("total length of  char array is "+value.length);
        int spaceCount = 0;
        for (int i = 0; i<trueLength;i++){
            System.out.println("char at "+i+" is "+value[i] );
            if (value[i] ==' '){
                spaceCount++;
                System.out.println("space count "+spaceCount);
            }
        }

        int index = trueLength+spaceCount*2;
        System.out.println("index : "+index);

        for (int i = trueLength-1;i>=0;i--){
            if (value[i] == ' '){
                value[index-1] = '0';
                value[index-2] = '2';
                value[index-3] = '%';
                index= index-3;
            }else {
                value[index-1] = value[i];
                index--;
            }
        }

        return value;
    }
}
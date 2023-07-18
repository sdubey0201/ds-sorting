import java.util.stream.IntStream;

public class StackTestMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StackImpl myStack = new StackImpl(10);
        IntStream.range(1,11).forEach(value -> {
           boolean isInsert =  myStack.push(value);
            System.out.println(value+ " :element inserted in stack is completed "+isInsert);
        });
        IntStream.range(0,10).forEach(value -> {
            int element =  myStack.pop();
            System.out.println("stack element  "+element);
        });
    }

}
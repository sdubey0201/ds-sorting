public class StackImpl {
    private int[] stackArray;
    private int stackTop = -1;

    public StackImpl(int capacity) {
        stackArray = new int[capacity];
        stackTop = -1;
    }

    private boolean isFull() {
        return stackTop >= stackArray.length - 1;
    }

    private boolean isEmpty() {
        return stackTop <0;
    }

    public boolean push(int element) {
        if (isFull()) {
            return false;
        }
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {

        }
        stackArray[++stackTop] = element;
        return true;

    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        try{Thread.sleep(1000);}catch (Exception ex){}
        int element  = stackArray[stackTop];
        stackArray[stackTop] = Integer.MIN_VALUE;
        stackTop--;
        return element;
    }


}

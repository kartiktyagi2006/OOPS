class SumThread implements Runnable {
    int[] arr;
    int start, end;
    static int total = 0;

    SumThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        synchronized (SumThread.class) {
            total += sum;
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        Thread t1 = new Thread(new SumThread(arr, 0, arr.length / 2));
        Thread t2 = new Thread(new SumThread(arr, arr.length / 2, arr.length));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Sum = " + SumThread.total);
    }
}
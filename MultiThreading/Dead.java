class Task1 extends Thread{
     
    synchronized public void run() {
        Task2 obj2=new Task2();
        obj2.m2();
    }

    public static void m1(){
        try{
        for(int i=0; i<3;i++){
            // System.out.println("M1 called..");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        }
        }catch(Exception e){e.printStackTrace();}
        }    
}

class Task2 extends Thread{
    // @Override
    synchronized public void run() {
        // System.out.println(Thread.currentThread().getName());
        Task1 obj1=new Task1();
        obj1.m1();
    }

    public static void m2(){
        try{
        for(int i=0; i<3;i++){
            // System.out.println("M2 called..");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1300);
        }
        }catch(Exception e){e.printStackTrace();}
    }
}

class Dead {
    public static void main (String args[]){

        System.out.println("");
        Task1 obj1=new Task1();
        obj1.start();
        // obj.run();

        Task2 obj2=new Task2();
        obj2.start();

        // System.out.println("program ended");
    }
}
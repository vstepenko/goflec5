package ua.edu.duan.gof;

public abstract class Worker {

    public void doDailyRoutine(){
        wakeUp();
        work();
        goHome();
        sleep();
    }

    protected void wakeUp(){
        System.out.println("Wake Up");
    }

    protected abstract void work();

    protected void goHome(){
        System.out.println("Go home");
    }

    protected void sleep(){
        System.out.println("Sleep");
    }
}

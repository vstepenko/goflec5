package ua.edu.duan.gof;

public class Policeman extends Worker{
    @Override
    protected void work() {
        System.out.println("Policemen work");
    }
    @Override
    protected void  goHome(){
        System.out.println("Policemen go home");
    }
}

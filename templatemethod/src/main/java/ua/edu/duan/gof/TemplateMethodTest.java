package ua.edu.duan.gof;

import java.util.List;

public class TemplateMethodTest {

    public static void main(String[] args) {
        List<Worker> workers = List.of( new Manager(), new Policeman());

        for (Worker worker: workers) {
            System.out.println(" nex worker");
            worker.doDailyRoutine();
        }


    }
}

package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class EmploymentAgency implements Observerable{
    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void attach(Observer observer) {
        //Cannot assign a value to final variable 'observers'
        //observers= new ArrayList<>();
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(JobPost jobPost) {
        for (Observer observer : observers) {
            observer.onJobPosted(jobPost);
        }
    }

    void addJob(JobPost jobPost) {
        notifyObservers(jobPost);
    }
}

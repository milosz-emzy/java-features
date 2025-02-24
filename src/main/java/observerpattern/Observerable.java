package observerpattern;

//
public interface Observerable {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(JobPost jobPost);
}

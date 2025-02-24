package observerpattern;

public record JobSeeker(String name) implements Observer {
    public void onJobPosted(JobPost jobPost) {
        System.out.println("Hello: " + name + " ! New job has been post: " + jobPost.title());
    }
}

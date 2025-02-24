package observerpattern;

public class Main {
    public static void main(String[] args) {
        JobSeeker js1 = new JobSeeker("Dog");
        JobSeeker js2 = new JobSeeker("Cat");

        EmploymentAgency employmentAgency = new EmploymentAgency();
        employmentAgency.attach(js1);
        employmentAgency.attach(js2);

        employmentAgency.addJob(new JobPost("Job for animals!!!"));

        //Hello: Dog ! New job has been post: Job for animals!!!
        //Hello: Cat ! New job has been post: Job for animals!!!
    }
}

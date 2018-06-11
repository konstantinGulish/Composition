//Person.java
public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        this.education = new Education();
    }
    public long getSalary() {
        return job.getSalary();
    }

    public String [] getSchools (){
        return education.getSchools();
    }

    public String getJob () {
        return job.toString();
    }

    public String getEducation () {
        return education.toString();
    }
}

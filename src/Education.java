public class Education {


    private String [] schools = {"School Ten",
                 "School Nine",
                 "School Eight",
                 "School Seven",
                 "School Six",
                 "School Five",
                 "School Four",
                 "School Three",
                 "School Two",
                 "School One"};

    // constructor
    public Education (){}

    // instance methods
    public String[] getSchools() {
        return schools;
    }

    @Override
    public String toString (){
        StringBuffer out = new StringBuffer();
        for (String school: schools)
            out.append(school + "\n");
        return out.toString();
    }
}

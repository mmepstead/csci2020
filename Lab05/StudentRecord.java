package Lab05;

public class StudentRecord {
    private String studentid;
    private float midterm;
    private float assignments;
    private float finalexam;
    private double finalmark;
    private String lettergrade;

    public StudentRecord () { }


    public StudentRecord(String studentid, float midterm, float assignments, float finalexam) {
        this.studentid = studentid;
        this.midterm = midterm;
        this.assignments = assignments;
        this.finalexam = finalexam;
        this.finalmark = 0.5*finalexam + 0.2*assignments + 0.3*midterm;
        if(80 <= this.finalmark && finalmark <= 100)
        {
            this.lettergrade = "A";
        }
        else if(70 <= this.finalmark && finalmark < 80)
        {
            this.lettergrade = "B";
        }
        else if(60 <= this.finalmark && finalmark < 70)
        {
            this.lettergrade = "C";
        }
        else if(50 <= this.finalmark && finalmark < 60)
        {
            this.lettergrade = "D";
        }
        else
        {
            this.lettergrade = "F";
        }
    }

    public String getStudentid()         {
        return this.studentid            ;}

    public float getMidterm()
    {
        return this.midterm;
    }

    public float getAssignments()
    {
        return this.assignments;
    }

    public float getFinalexam()
    {
        return this.finalexam;
    }

    public double getFinalmark()
    {
        return this.finalmark;
    }

    public String getLettergrade()
    {
        return this.lettergrade;
    }

}
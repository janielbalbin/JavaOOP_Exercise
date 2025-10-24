package course;

public class OnlineCourse extends Course {
    String platform;
    int duration; // in weeks

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    public boolean eligibleForCertificate() {
        return duration >= 4;
    }
}

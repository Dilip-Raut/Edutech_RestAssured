package constants;

public class Endpoints {

    public static final String LOGIN = "/api/auth/login";
    public static final String REGISTER = "/api/auth/register";

    public static final String STUDENTS = "/api/students";
    public static final String COURSES = "/api/courses";
    public static final String FEES = "/api/fees";
    public static final String FACULTY = "/api/faculty";
    
    
    
    
    
    public static String getPath(String name) {
        switch(name.toUpperCase()) {
            case "LOGIN": return LOGIN;
            case "REGISTER": return REGISTER;
            case "STUDENTS": return STUDENTS;
            case "COURSES": return COURSES;
            case "FEES": return FEES;
            case "FACULTY": return FACULTY;
            default: throw new IllegalArgumentException("Invalid endpoint: " + name);
        }
    }
}

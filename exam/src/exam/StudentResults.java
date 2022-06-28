
package exam;


public class StudentResults {
    
    private String Full_Name;      
    private String Exam_Name;    
    private String Exam_Score;    
    private String Exam_Grade;
    
    StudentResults() {
        Full_Name = "No Name Given";
        Exam_Name = "Unknown";
        Exam_Score = "No Score";
        Exam_Grade = "Unknown";
    }
    
    String fullName(String aName) {
        
        Full_Name = aName;
        return Full_Name;
    }
    
    String examName(String examCode) {
        
        if (examCode.equals("VB")) {
            Exam_Name = "Visual Basic .Net";
        }
        
        else if (examCode.equals("JV")) {
            Exam_Name = "Java";
        }
        
        else if (examCode.equals("C#")) {
            Exam_Name = "C# .Net";
        }
        
        else if (examCode.equals("PH")) {
            Exam_Name = "PHP";
        }
        
        else {
            Exam_Name = "No Exam Selected";
        }
        
        return Exam_Name;
    }
    
    String examScore(int aScore) {
        
        Exam_Score = aScore + "";
        return Exam_Score;
    }
    
    String examGrade(int aScore) {

        Exam_Grade = this.getGrade( aScore) ;
        return Exam_Grade;
    }
    
    
    private String getGrade(int aScore) {
        
        String examGrade = "";
        
        if (aScore >= 0 && aScore <= 10) {
            examGrade = "E";
        }
        
        else if (aScore >= 11 && aScore <= 20) {
            examGrade = "D";
        }
        
        else if (aScore >= 21 && aScore <= 30) {
            examGrade = "C";
        }
        
        else if (aScore >= 31 && aScore <= 40) {
            examGrade = "B";
        }
        
        else if (aScore >= 41 && aScore <= 50) {
            examGrade = "A";
        }
        
        return examGrade;
    }
    
}

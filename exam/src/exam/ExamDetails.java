
package exam;


public class ExamDetails {

  
    public static void main(String[] args) {
        
        StudentResults aStudent = new StudentResults();
        
        String sName = aStudent.fullName("Bill Gates");
        String exam = aStudent.examName("VB");
        String score = aStudent.examScore(31);
        String grade = aStudent.examGrade(31);
                
        String heading1 = "Full Name";
        String heading2 = "Exam Name";
        String heading3 = "Score";
        String heading4 = "Grade";
        
        System.out.printf("%-15s %-25s %-15s %-15s %n", heading1, heading2, heading3, heading4);
        System.out.printf("%-15s %-25s %-15s %-15s %n",sName, exam, score, grade);
        
        Certificates c1 = new Certificates();
                
//        String exam = c1.examName("VB");
        String award = c1.certificateAwarded(31);
        System.out.println( exam + " " + award );
        
        
        

//StudentResults aStudent = new StudentResults(" Bill Gates", "A");  
        //aStudent.Exam_Name = "VB NET";      
        //String exam = aStudent.Exam_Name;        
        //System.out.println(exam);
    }
    
}

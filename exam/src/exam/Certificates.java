
package exam;


public class Certificates extends StudentResults{
    
    private String certificate;
    
    Certificates () { 
        
        super();
        certificate = "No Certificate Awarded";
    }
    
    String certificateAwarded(int aScore) {
        
        String aGrade = examGrade(aScore);
        
        if (aGrade.equals ("A")) {
        this.certificate = "Certificate of Excellence";
    }
        
        else if (aGrade.equals ("B")) {
        this.certificate = "Certificate of Achievement";
    }
        
        else if (aGrade.equals ("C")) {
        this.certificate = "Certificate of Achievement";
    }
        
        else {
        this.certificate = "No Certificate Awarded";
    }
        
        return this.certificate;
    }
}

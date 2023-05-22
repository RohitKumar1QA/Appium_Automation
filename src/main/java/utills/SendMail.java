package utills;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

// ------------------- SENDS PDF REPORTS TO EMAILS-------------------------
public class SendMail {
	
//	public static void main(String ar[]) throws EmailException {
    public static void sendmail() throws EmailException {
        EmailAttachment attachment = new EmailAttachment();
        
        System.out.println(System.getProperty("user.dir") + "\\test-output-extent\\PdfReport\\CortevaTestReport.pdf");
        attachment.setPath(System.getProperty("user.dir") + "\\test-output-extent\\PdfReport\\CortevaTestReport.pdf");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Report");
        attachment.setName("CortevaMobileAutomationReport.pdf");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        // email.SMTP.starttls.enable=true

        email.setAuthenticator(new DefaultAuthenticator("sunil.kumar8@kellton.com", "xyz"));
        email.setSSLOnConnect(true);
        email.setFrom("sunil.kumar8@kellton.com");
      
        System.out.println("===========> Adding recipients");
//        email.addTo("nikhil.gupta@kellton.com", "Nikhil Gupta");
//        email.addCc("amit.surana@kellton.com", "Amit Surana");
//        email.addCc("neha.rani@kellton.com", "Neha Rani Wadhwa");
//        email.addCc("shivam.gupta2@kellton.com", "Shivam");
//        email.addCc("akash.sonawane@kellton.com", "Akash Prashant Sonawan");
//        email.addCc("mangesh.kulkarni@kellton.com", "Mangesh Mohanrao Kulkarni");
//        email.addCc("nikhil.chowdary@kellton.com", "V Nikhil Chowdary");
//        email.addCc("balaji.uphade@kellton.com", "Uphade Balaji Ashok");
//        email.addCc("manish.tiwari@kellton.com", "Manish Tiwari");
//        email.addCc("gaurav.tomar@kellton.com", "Gaurav Tomar");

      
        System.out.println("===========> Writing Subject Line");
        email.setSubject("Corteva Mobile Automation Report - Android");
        System.out.println("===========> Writing email body...");
        email.setMsg("Hello All, \n\n  Please find the attached Indigo Mobile Automation report \n \n Thanks, \n Avinash \n\n\n\n\n ***** This is system generated email *****");

        // add the attachment
        try {
            email.attach(attachment);
            System.out.println("===========> Attached the PDF Report...");
            // send the email
            email.send();
            System.out.println("===========> Report has been successfully sent...");
            
        } catch (Exception e) {
            System.out.println(" Attach the report");
        }
 
    }

}

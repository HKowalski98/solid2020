package pl.zzpj2020.solid.isp.contactbook.solution;



public interface Emailer {
     void sendEmail(String emailAddress, String subject, String body);
}

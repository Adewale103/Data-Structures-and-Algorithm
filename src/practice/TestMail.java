package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class TestMail {

    public static void main(String[] args) {
        String result = Send("adeyinkawale13@gmail.com","Internship Central","Welcome to Intership Central","Just Testing","engineersam13@gmail.com","false");
        System.out.println(result);
    }


    public static String Send(String from, String fromName, String subject, String body, String to, String isTransactional) {

        try {

            String encoding = "UTF-8";

            String data = "apikey=" + URLEncoder.encode("D095B7E16066678158D60218A9036B6919ED19A9CD9CA13B04E60BEC2A0BABFBA52879892FCBA25DEB4329CC5D75846E", encoding);
            data += "&from=" + URLEncoder.encode(from, encoding);
            data += "&fromName=" + URLEncoder.encode(fromName, encoding);
            data += "&subject=" + URLEncoder.encode(subject, encoding);
            data += "&bodyHtml=" + URLEncoder.encode(body, encoding);
            data += "&to=" + URLEncoder.encode(to, encoding);
            data += "&isTransactional=" + URLEncoder.encode(isTransactional, encoding);

            URL url = new URL("https://api.elasticemail.com/v2/email/send");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String result = rd.readLine();
            wr.close();
            rd.close();

            return result;
        } catch (Exception e) {

            e.printStackTrace();
        }
        return null;
    }
}

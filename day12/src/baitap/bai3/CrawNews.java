package baitap.bai3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawNews {
    public static void main(String[] args) {
        try {
            //Bước 3: Sử dụng URL của java.net để khởi tạo đường dẫn
            URL url = new URL("https://vtv.vn/");

            //Bước 4: Mở stream và đưa nó vào InputStreamReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();

            //Bước 5: Xóa tất cả các new line trong content lấy được
            // remove all new line
            content = content.replaceAll("\\n+", "");

            //Bước 6: Lọc nội dung content lấy được trong ..
            // regex
            //Pattern p = Pattern.compile("title=\"(.*?)\"");
            Pattern p = Pattern.compile("title=\"(.*?)\" data");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }

            // close scanner
            scanner.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

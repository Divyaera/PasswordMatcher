import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PwdMatcher {
	
	public static void main(String...args){
		passwordMatcherNew("T=1Phyq011");
	}
	
	public static void passwordMatcher(String inputPwd) {
        List<String> testPwds = Arrays.asList(inputPwd, "Puchu123", "123PUCHu", "papaya@123",
                "papayA123", "PUCHU123a", "p1p1p1pP", "a68464654654", "!J6q&B0f",
                "Ewewewe-123", "PUCHU 123a");
        for (String userPwd : testPwds) {
            String pre = "[A-Za-z0-9!@#$%^&*()]*";
            String regex2 = "((" +
                    "((?=" + pre + "[A-Z])(?=" + pre + "[a-z])(?=" + pre + "[\\d]))|" +
                    "((?=" + pre + "[A-Z])(?=" + pre + "[a-z])(?=" + pre + "[!@#$%^&*()]))|" +
                    "((?=" + pre + "[A-Z])(?=" + pre + "[\\d])(?=" + pre + "[!@#$%^&*()]))|" +
                    "((?=" + pre + "[a-z])(?=" + pre + "[\\d])(?=" + pre + "[!@#$%^&*()]))" +
                    ")" + pre + "){8,}";
            Pattern pwdPattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pwdPattern2.matcher(userPwd);
            try {
                if (matcher2.find())
                    System.out.println("Match found " + userPwd);
                else
                    System.out.println("No match flower" + userPwd);

            } catch (IllegalStateException|IllegalArgumentException e) {
                System.out.println("No match flower " + userPwd);
//                e.printStackTrace();
            }
        }
    }
	
}

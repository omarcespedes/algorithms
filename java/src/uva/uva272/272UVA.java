import java.util.ArrayList;
import java.util.Scanner;

class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strs = new ArrayList<>();
        String line;
        boolean opened = false;
        while(sc.hasNextLine()) {
            StringBuffer sb = new StringBuffer();
            line = sc.nextLine();
            for (int i = 0 ; i < line.length() ; i++) {
                char c = line.charAt(i);
                if(c == '\"') {
                    if (opened) {
                        sb.append("\'\'");
                    } else {
                        sb.append("``");
                    }
                    opened = !opened;
                } else {
                    sb.append(c);
                }
            }
            strs.add(sb.toString());
        }
        for(String s : strs) {
            System.out.println(s);
        }
    }
}

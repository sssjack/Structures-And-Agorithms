import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test1 {
    /**
     * 关于String的==和eequals的比较测试
     * @param args
     */
    public static void main(String[] args) {
        String s = "au";

        int sum = 0;

        for(int i=0;i<s.length();i++){
            StringBuilder per = new StringBuilder();
            int j = 0;


            String substring = s.substring(i,i+1);
            while (per.toString().equals("") ||!per.toString().contains(substring)){
                per.append(substring);
                j = j+1;
                if(i+j<=s.length()&&i+1+j<=s.length()){
                    substring = s.substring(i+j,i+1+j);
                }

            }
            if(per.toString().length()>sum){
                sum = per.toString().length();
            }

        }


        System.out.println(sum);




    }




}
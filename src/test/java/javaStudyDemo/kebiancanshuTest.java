package javaStudyDemo;

import java.awt.event.ItemEvent;

public class kebiancanshuTest {
    public static void main(String[] args) {
        ParameterTest test = new ParameterTest();
        System.out.println(test.Two("小明",60,70));
    }
}
class ParameterTest{
    public String Two(String name,double... num){
        double res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        return name + "的总成绩为" + res;
    }

}
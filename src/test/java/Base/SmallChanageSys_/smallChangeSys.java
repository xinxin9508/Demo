package Base.SmallChanageSys_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/**
 * 1.先完成框架
 * 2.完成零钱通明细
 * 3.完成收益入账
 * 4.完成消费
 * 5.退出
 */
public class smallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        String key = "";
        String conName = "";
        Scanner scanner = new Scanner(System.in);
        String detail = "-----------零钱通明细-------------";
        //定义收益
        double money = 0;
        //定义余额
        double balance = 0;
        //定义消费金额
        double consumption = 0;
        //定义时间
        Date date = null;
        //定义退出指令
        String choice = "";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        do {
            System.out.println("\n==========零钱通菜单=========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请选择1-4");

            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("收益金额：");
                    //输入变量给money
                    money = scanner.nextDouble();
                    while (true) {
                        if (money > 0) {
                            //余额加上变量
                            balance += money;
                            //获取时间
                            date = new Date();
                            //拼接明细
                            detail += "\n收益入账" + "\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
                            break;
                        } else {
                            System.out.println("你输入的金额有误，请重新输入");
                            money = scanner.nextDouble();
                        }
                    }
                    System.out.println("入账成功！！！");
                    break;
                case "3":
                    System.out.print("消费名称：");
                    conName = scanner.next();
                    System.out.println();
                    System.out.print("消费金额：");
                    consumption = scanner.nextDouble();
                    while (true) {
                        if (consumption > 0 && consumption <= balance) {
                            balance -= consumption;
                            detail += "\n" + conName + "\t-" + consumption + "\t" + simpleDateFormat.format(date) + "\t" + balance;
                            break;
                        } else if (consumption > 0 && consumption > balance){
                            System.out.println("余额不足，请重新输入");
                            consumption = scanner.nextDouble();
                        }else {
                            System.out.println("你输入的金额有误，请重新输入");
                            consumption = scanner.nextDouble();
                        }
                    }
                    break;
                case "4":
                    while (true) {
                        System.out.println("你确定要退出吗？y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("你输入的有误，请重新输入");

            }

        } while (loop);
        System.out.println("已退出零钱通");
    }
}

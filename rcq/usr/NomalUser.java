/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: NomalUser
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.BMS.rcq.usr;

import 图书管理系统1.BMS.rcq.operation.*;

public class NomalUser extends User {
    public NomalUser(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new Exit(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("================================================");
        System.out.println("Hello"+this.name + ",欢迎使用图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出");
        System.out.println("================================================");

        int choice = sc.nextInt();
        return choice;
    }
}

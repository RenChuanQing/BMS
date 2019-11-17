/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: ADmin
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.rcq.usr;

import 图书管理系统1.rcq.operation.*;


public class ADmin extends User {
    public ADmin(String name) {
        this.name = name;
        this.operations = new IOperation[] {
                new Exit(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("================================================");
        System.out.println("Hello"+this.name + ",欢迎使用图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出");
        System.out.println("================================================");
        int choice = sc.nextInt();
        return choice;
    }

}

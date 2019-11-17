/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: Main
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.rcq;

import 图书管理系统1.rcq.book.BookList;
import 图书管理系统1.rcq.usr.ADmin;
import 图书管理系统1.rcq.usr.NomalUser;
import 图书管理系统1.rcq.usr.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        System.out.println("请输入你的名字");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入你的身份（管理员:1   用户：2）");
        int id = sc.nextInt();
        if(id == 1){
            return new ADmin(name);
        }else{
            return new NomalUser(name);
        }

    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while(true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}

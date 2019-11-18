/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: User
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.BMS.rcq.usr;

        import 图书管理系统1.BMS.rcq.book.BookList;
        import 图书管理系统1.BMS.rcq.operation.IOperation;

        import java.util.Scanner;

public abstract class User {
    public String name;
    protected IOperation[] operations;//接口类型的数组
    public abstract int menu();
    Scanner sc = new Scanner(System.in);
    public  void doOperation(int choice, BookList bookList){
        operations[choice].work(bookList);

    }
}

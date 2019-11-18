/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: AddOperation
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.BMS.rcq.operation;

import 图书管理系统1.BMS.rcq.book.Book;
import 图书管理系统1.BMS.rcq.book.BookList;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //未考虑满的情况
        System.out.println("添加书籍");
        System.out.println("请输入图书的名字");
        String name = sc.next();
        System.out.println("请输入图书的作者");
        String auhtor = sc.next();
        System.out.println("请输入图书的价格");
        int price = sc.nextInt();
        System.out.println("请输入图书的类型");
        String type = sc.next();
        Book book = new Book(name,auhtor,price,type);
        int curSize = bookList.getSize();
        bookList.setBooks(curSize,book);
        bookList.setSize(curSize+1);
        System.out.println("添加书籍成功！");
    }
}

/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: BorrowOperation
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.rcq.operation;

import 图书管理系统1.rcq.book.Book;
import 图书管理系统1.rcq.book.BookList;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("BorrowOperation");
        //不会从bookList中删除
        /*
        * 1.找这本书是否存在
        * 2.是否被借出
        * */
        System.out.println("请输入需要借阅的书籍的名称");
        String name  = sc.next();
        int i = 0;
        for( ;i<bookList.getSize();i++){
            if(bookList.getBooks(i).name.equals(name)){
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("没有此书");
            return;
        }
        Book book = bookList.getBooks(i);
        if(book.isBorrowed){
            System.out.println("此书已经被借出");
        }else {
            book.isBorrowed = true;
            System.out.println(book.name +"借阅成功");
        }

    }
}

/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: FindOperation
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.BMS.rcq.operation;

import 图书管理系统1.BMS.rcq.book.Book;
import 图书管理系统1.BMS.rcq.book.BookList;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("FindOperation");
        System.out.println("请输入需要查找的书籍的名称");
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
        System.out.println(bookList.getBooks(i));
        System.out.println("书籍查找成功");
    }
}

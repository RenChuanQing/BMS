/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: DisplayOperation
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.BMS.rcq.operation;

import 图书管理系统1.BMS.rcq.book.BookList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("DisplayOperation");
        for(int i = 0;i<bookList.getSize();i++){
            System.out.println(bookList.getBooks(i));
        }
    }
}

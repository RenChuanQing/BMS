/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: Exit
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.BMS.rcq.operation;

import 图书管理系统1.BMS.rcq.book.BookList;

public class Exit implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("Exit");
        java.lang.System.exit(0);
    }
}

package 图书管理系统1.BMS.rcq.operation;

import 图书管理系统1.BMS.rcq.book.BookList;

import java.util.Scanner;

public interface IOperation {
     Scanner sc = new Scanner(System.in);
     void work(BookList bookList);
}

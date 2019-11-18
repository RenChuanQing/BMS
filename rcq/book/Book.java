/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: Book
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.BMS.rcq.book;

public class Book {
    public String name;
    public String author;
    public double price;
    public String type;//书的类型
    public boolean isBorrowed;//是否被借出

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" +"《"+ name + "》"+'\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ((isBorrowed == true)?"，已经被借出":"，未被借出") +
                '}';
    }
}

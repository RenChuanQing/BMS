/**
 * Copyright (c).2019-2019,西安科技大学
 * Filename: BookList
 * Author: RCQ
 * Date:2019/11/17
 * Description:
 */
package 图书管理系统1.rcq.book;

public class BookList {
    private Book[] books = new Book[10];
    private int size;//有效数据个数

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",13,"小说");
        books[1] = new Book("水浒传","施耐庵",13,"小说");
        books[2] = new Book("西游记","吴承恩",13,"小说");
        books[3] = new Book("红楼梦","曹雪芹",13,"小说");
        books[4] = new Book("java","aaa",53,"Java");
        this.size = 5;
    }

    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }


    public Book getBooks(int pos) {
        return books[pos];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

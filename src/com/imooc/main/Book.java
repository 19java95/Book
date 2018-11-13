package com.imooc.main;

/**
 * Created by TangTian on 2018/10/17.
 */
public class Book {

    private String bookId;
    private String bookName;
    private String bookPrice;
    private String bookDescribe;
    private String catgoryName1;
    public String getCatgoryName1() {
        return catgoryName1;
    }

    public void setCatgoryName1(String catgoryName1) {
        this.catgoryName1 = catgoryName1;
    }



    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookDescribe() {
        return bookDescribe;
    }

    public void setBookDescribe(String bookDescribe) {
        this.bookDescribe = bookDescribe;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookDescribe='" + bookDescribe + '\'' +
                ", catgoryName1='" + catgoryName1 + '\'' +
                '}';
    }
}

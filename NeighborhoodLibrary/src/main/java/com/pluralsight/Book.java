package com.pluralsight;

public class Book
{
    private int id;
    private int isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, int isbn, String title, boolean isCheckedOut, String checkedOutTo)
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getIsbn () { return isbn; }

    public void setIsbn(int isbn) { this.isbn = isbn; }

    public String getTitle () { return title; }

    public void setTitle(String title) { this.title = title; }

    public boolean getIsCheckedOut () { return isCheckedOut; }

    public void setIsCheckedOut(boolean isCheckedOut) { this.isCheckedOut = isCheckedOut; }

    public String getCheckedOutTo () { return checkedOutTo; }

    public void setCheckedOutTo(String checkedOutTo) { this.checkedOutTo = checkedOutTo; }
}

import java.util.ArrayList;
class Book {
private String title;
private String author;
public Book(String title, String author) {
this.title = title;
this.author = author;
}
public String getTitle() {
return title;
}
public String getAuthor() {
return author;
}
}
class Member {
private String name;
private String memberId;
public Member(String name, String memberId) {
this.name = name;
this.memberId = memberId;
}
public String getName() {
return name;
}
public String getMemberId() {
return memberId;
}
}
class Library {
private ArrayList<Book> books;
private ArrayList<Member> members;
public Library() {
books = new ArrayList<>();
members = new ArrayList<>();
}
public void addBook(Book book) {
books.add(book);
}
public void addMember(Member member) {
members.add(member);
}
public void displayAvailableBooks() {
if (books.isEmpty()) {
System.out.println("No books available in the library.");
} else {
System.out.println("Available books in the library:");
for (Book book : books) {
System.out.println("Title: " + book.getTitle() + ", Author: " +
book.getAuthor());
}
}
}
public void displayMemberInformation() {
if (members.isEmpty()) {
System.out.println("No members in the library.");
} else {
System.out.println("Library members:");
for (Member member : members) {
System.out.println("Name: " + member.getName() + ", Member ID: " +
member.getMemberId());
}
}
}
}
public class L6q1 {
public static void main(String[] args) {
Library library = new Library();
library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
library.addMember(new Member("John Doe", "M001"));
library.addMember(new Member("Jane Smith", "M002"));
library.displayAvailableBooks();
library.displayMemberInformation();
}
}
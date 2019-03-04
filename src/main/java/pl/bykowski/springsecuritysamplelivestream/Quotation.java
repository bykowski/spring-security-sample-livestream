package pl.bykowski.springsecuritysamplelivestream;

public class Quotation {

    private String content;
    private String author;

    public Quotation() {
    }

    public Quotation(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

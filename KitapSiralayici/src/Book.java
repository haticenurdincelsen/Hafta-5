public class Book implements Comparable<Book>{
    private String bookname;
    private int pageNumber;
    private String writerName;
    private int releaseDate;

    public Book(String bookname, int pageNumber, String writerName, int releaseDate) {
        this.bookname = bookname;
        this.pageNumber = pageNumber;
        this.writerName = writerName;
        this.releaseDate = releaseDate;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return new String(this.getBookname()).compareTo(o.getBookname());
    }
}

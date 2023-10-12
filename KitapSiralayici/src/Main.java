import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book>book=new TreeSet<Book>();
        TreeSet<Book>book1=new TreeSet<Book>(new  OrderNumberComperator());

        book.add(new Book("Bir Ömür Nasıl Yaşanır?",288 ,"İlber ORTAYLI       ",2019));
        book.add(new Book("Denemeler              ",314 ,"Montaigne           ",1580));
        book.add(new Book("Yeraltından Notlar     ",160 ,"Dostoyevski         ",1864));
        book.add(new Book("Sefiller               ",980, "Victor Hugo         ",1862));
        book.add(new Book("Türklerin Serüveni     ",248 ,"İlber ORTAYLI       ",2019));
        book1.addAll(book);
        System.out.println("Alfabetik Sıralama : ");
        System.out.println();
        System.out.println("Kitabın Adı:                    Kitabın Yazarı:           Sayfa Sayısı:    Yayın Tarihi:");

        for (Book b2:book){
            System.out.println(b2.getBookname()+"\t\t\t"+b2.getWriterName()+"\t\t\t"+b2.getPageNumber()+"\t\t\t"+b2.getReleaseDate());
        }
        System.out.println();
        System.out.println("************************************************************************************************************");
        System.out.println();
        System.out.println("Sayfa sayısına göre sıralama : ");
        System.out.println();

        for (Book b1 : book1){
            System.out.println(b1.getBookname()+"\t\t\t"+b1.getWriterName()+"\t\t\t"+b1.getPageNumber()+"\t\t\t"+b1.getReleaseDate());

            }

        }
    }

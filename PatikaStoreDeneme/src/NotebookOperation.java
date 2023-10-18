import java.util.ArrayList;
import java.util.Scanner;

public class NotebookOperation {

    static ArrayList<Notebook> notebooks = new ArrayList<>();
    public static void noteBooks() {
        notebooks.add(new Notebook(1,15000,15,50,"ASUS Tuf Gaming ","ASUS",8,512,14));
        notebooks.add(new Notebook(2,35000,15,50,"HUAWEI Matebook 14  ","HUAWEI",8,512,14));
        notebooks.add(new Notebook(3,25000,15,50,"LENOVO V14 IGL","LEVONO",8,512,14));

    }
    public static void printList() {

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-2s | %-27s |%-12s | %-10s | %-7s |%-10s| %-9s | %-16s | %-9s |\n",
                "ID", "Ürün Adı", "Marka", "Fiyat", "Stok", "Ekran","Depoloama", "İndirim Oranı", "RAM");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        for (Notebook nb : notebooks) {
            System.out.format("| %-2d | %-27s |%-12s | %-10.2f |%-7d| %-10d | %-9d | %-16d | %-9d |\n",
                    nb.getId(), nb.getName(), nb.getBrandName(), nb.getPrice(), nb.getStock(),nb.getScreen(), nb.getMemory(),
                    nb.getDiscount(),  nb.getRam());
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void addNotebooks() {
        //Kullanıcının ürün ekleme yapabildiği alan
        Scanner s = new Scanner(System.in);
        System.out.println("Yeni Ürün eklemek için aşağıdaki bilgileri doldurunuz : ");

        System.out.print("Ürün ID giriniz : ");
        int id = s.nextInt();
        s.nextLine();
        if (isContainsId(id)) {
            System.out.println("Girilen ID başka bir ürün adına kayıtlıdır, lütfen farklı bir ID giriniz!");
            addNotebooks();
        }
        System.out.print("Ürünün markasını giriniz : ");
        String brandName = s.nextLine();

        System.out.print("Ürünün modelini giriniz : ");
        String name = s.nextLine();

        System.out.print("Ürünün fiyatını giriniz : ");
        int price = s.nextInt();

        System.out.print("Ürünün indirim oranını giriniz : ");
        int discount = s.nextInt();

        System.out.print("Ürünün stok durumunu giriniz : ");
        int Stock = s.nextInt();

        System.out.print("Ürünün hafızasını giriniz : ");
        int memory = s.nextInt();

        System.out.print("Ürünün ekran boyutunu giriniz : ");
        int screen = s.nextInt();

        System.out.print("Ürünün ram değerini giriniz : ");
        int ram = s.nextInt();

        notebooks.add(new Notebook(id,price,discount,Stock,name,brandName,ram,memory,screen));
        System.out.println("Ürününüz başarılı bir şekilde eklendi !");
        printList();
    }
    //Kullanıcının ürün silebildiği alan;
    public static void deleteNotebook() {
        printList();
        Scanner delete = new Scanner(System.in);
        System.out.println("Silmek istediğiniz ürünün ID numarasını giriniz : ");
        int id = delete.nextInt();
        notebooks.remove(id - 1);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ürün başarılı bir şekilde silindi !");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        printList();
    }
    public static void filterById() {
        System.out.println("ID numarasını giriniz : ");
        boolean isCheck=false;
        Scanner searchId = new Scanner(System.in);
        int id = searchId.nextInt();

        for (Notebook nb : notebooks) {
            if (nb.getId() == id) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2s | %-27s |%-12s | %-10s | %-7s |%-10s| %-9s | %-16s | %-9s |\n",
                        "ID", "Ürün Adı", "Marka", "Fiyat", "Stok", "Ekran","Depoloama", "İndirim Oranı", "RAM");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2d | %-27s |%-12s | %-10.2f |%-7d| %-10d | %-9d | %-16d | %-9d |\n",
                        nb.getId(), nb.getName(), nb.getBrandName(), nb.getPrice(), nb.getStock(),nb.getScreen(), nb.getMemory(),
                        nb.getDiscount(),  nb.getRam());
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                break;
            }
        }
    }
    public static void filterByBrandName(){
        System.out.print("Ürünün markasını giriniz : ");
        Scanner brand=new Scanner(System.in);
        String brandName=brand.nextLine();
        for (Notebook nb : notebooks) {
            if (nb.getBrandName().equals(brandName)) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2s | %-27s |%-12s | %-10s | %-7s |%-10s| %-9s | %-16s | %-9s |\n",
                        "ID", "Ürün Adı", "Marka", "Fiyat", "Stok", "Ekran","Depoloama", "İndirim Oranı", "RAM");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2d | %-27s |%-12s | %-10.2f |%-7d| %-10d | %-9d | %-16d | %-9d |\n",
                        nb.getId(), nb.getName(), nb.getBrandName(), nb.getPrice(), nb.getStock(),nb.getScreen(), nb.getMemory(),
                        nb.getDiscount(),  nb.getRam());
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                break;
            }
            if (!nb.getBrandName().equals(brandName)) {
                System.out.println("Ürün bulunamadı!");
            }
        }
    }
    public static boolean isContainsId(int id) {
        for (Notebook nb : notebooks) {
            if (nb.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
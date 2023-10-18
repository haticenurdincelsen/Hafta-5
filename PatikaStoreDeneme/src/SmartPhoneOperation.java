import java.util.*;

public class SmartPhoneOperation {
    //3 adet ürün örnek olarak eklendi
    static ArrayList<SmartPhone> smartPhones = new ArrayList<>();
    //ArrayListe varsayılan olarak eklenen ürünler
    public static void mobilePhones() {
        smartPhones.add(new SmartPhone(1, 3199.0, "SAMSUNG", 15, 56, "SAMSUNG GALAXY A51", 128, 6.5, 4000, 6, "Siyah"));
        smartPhones.add(new SmartPhone(2, 7379.0, "Apple", 25, 156, "iPhone 11 64 GB", 64, 6.1, 3046,6  ,  "Mavi"));
        smartPhones.add(new SmartPhone(3, 4012.0, "Xiaomi", 15, 10, "Redmi Note 10 Pro 8GB", 128, 6.5, 4000, 12, "Beyaz"));
    }
    //Ürünler format yapısı kullanarak listelendi
    public static void printList() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-2s | %-27s |%-12s | %-10s | %-10s | %-9s | %-16s | %-9s | %-10s | %-10s |\n",
                "ID", "Ürün Adı", "Marka", "Fiyat", "Stok", "Ekran", "İndirim Oranı", "Pil", "RAM", "RENK");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        for (SmartPhone sp : smartPhones) {
            //System.out.println(sp.getId()+" "+sp.getPrice()+" "+sp.getDiscount()+" "+sp.getStock()+" "+sp.getName()+" "+sp.getMemory()+" "+sp.getScreen()+" "+sp.getBattary()+" "+sp.getRam()+" "+sp.getColor());
            System.out.format("| %-2d | %-27s |%-12s | %-10.2f | %-10d | %-9.1f | %-16d | %-9d | %-10d | %-10s |\n",
                    sp.getId(), sp.getName(), sp.getBrandName(), sp.getPrice(), sp.getStock(), sp.getScreen(),
                    sp.getDiscount(), sp.getBattary(), sp.getRam(), sp.getColor());
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    //Yeni ürün eklemesi yapılan alan
    public static void addMobilePhones() {
        Scanner s = new Scanner(System.in);
        System.out.println("Yeni Ürün eklemek için aşağıdaki bilgileri doldurunuz : ");

        System.out.print("Ürün ID giriniz : ");
        int id = s.nextInt();
        s.nextLine();
        if (isContainsId(id)) {
            System.out.println("Girilen ID başka bir ürün adına kayıtlıdır, lütfen farklı bir ID giriniz!");
            addMobilePhones();
        }
        System.out.print("Ürünün markasını giriniz : ");
        String brandName = s.nextLine();

        System.out.print("Ürünün modelini giriniz : ");
        String name = s.nextLine();

        System.out.print("Ürünün rengini giriniz : ");
        String color = s.nextLine();

        System.out.print("Ürünün fiyatını giriniz : ");
        int price = s.nextInt();

        System.out.print("Ürünün indirim oranını giriniz : ");
        int discount = s.nextInt();

        System.out.print("Ürünün stok durumunu giriniz : ");
        int Stock = s.nextInt();

        System.out.print("Ürünün depolama gücünü giriniz : ");
        int memory = s.nextInt();

        System.out.print("Ürünün ekran boyutunu giriniz : ");
        double screen = s.nextDouble();

        System.out.print("Ürünün batarya kapasitesini giriniz : ");
        int battary = s.nextInt();

        System.out.print("Ürünün ram değerini giriniz : ");
        int ram = s.nextInt();


        smartPhones.add(new SmartPhone(id, price, brandName, discount, Stock, name, memory, screen, battary, ram, color));
        System.out.println("Ürününüz başarılı bir şekilde eklendi !");
        printList();
    }
    //Kullanıcının veri silebilmesi için;
    public static void deleteMobilePhone() {
        printList();
        Scanner delete = new Scanner(System.in);
        System.out.println("Silmek istediğiniz ürünün ID numarasını giriniz : ");
        int id = delete.nextInt();
        smartPhones.remove(id - 1);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ürün başarılı bir şekilde silindi !");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        printList();
    }

    public static boolean isContainsId(int id) {
        for (SmartPhone sp : smartPhones) {
            if (sp.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void filterById() {
        System.out.println("ID numarasını giriniz : ");
        boolean isCheck=false;
        Scanner searchId = new Scanner(System.in);
        int id = searchId.nextInt();

        for (SmartPhone sp : smartPhones) {
            if (sp.getId() == id) {
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2s | %-27s |%-12s | %-10s | %-10s | %-9s | %-16s | %-9s | %-10s | %-10s |\n",
                        "ID", "Ürün Adı", "Marka", "Fiyat", "Stok", "Ekran", "İndirim Oranı", "Pil", "RAM", "RENK");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2d | %-27s |%-12s | %-10.2f | %-10d | %-9.1f | %-16d | %-9d | %-10d | %-10s |\n",
                        sp.getId(), sp.getName(), sp.getBrandName(), sp.getPrice(), sp.getStock(), sp.getScreen(),
                        sp.getDiscount(), sp.getBattary(), sp.getRam(), sp.getColor());
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                break;
            }

        }
    }
    public static void filterByBrandName(){
        System.out.print("Ürünün markasını giriniz : ");
        Scanner brand=new Scanner(System.in);
        String brandName=brand.nextLine();
        for (SmartPhone sp: smartPhones){
            if (sp.getBrandName().equals(brandName)){
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2s | %-27s |%-12s | %-10s | %-10s | %-9s | %-16s | %-9s | %-10s | %-10s |\n",
                        "ID", "Ürün Adı", "Marka", "Fiyat", "Stok", "Ekran", "İndirim Oranı", "Pil", "RAM", "RENK");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2d | %-27s |%-12s | %-10.2f | %-10d | %-9.1f | %-16d | %-9d | %-10d | %-10s |\n",
                        sp.getId(), sp.getName(), sp.getBrandName(), sp.getPrice(), sp.getStock(), sp.getScreen(),
                        sp.getDiscount(), sp.getBattary(), sp.getRam(), sp.getColor());
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                break;
            }
            if (!sp.getBrandName().equals(brandName)) {
                System.out.println("Ürün bulunamadı!");
            }
        }
    }
}
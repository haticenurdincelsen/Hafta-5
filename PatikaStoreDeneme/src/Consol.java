import java.util.Scanner;

public class Consol {

    public void screenConsol(){
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1- Notebook İşlemleri");
        System.out.println("2- Cep Telefonu İşlemleri");
        System.out.println("3- Markalar");
        System.out.println("0- Çıkış");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        Scanner select=new Scanner(System.in);
        int selected=select.nextInt();
        System.out.println("-----------------------------------------------");
        SmartPhoneOperation.mobilePhones();
        NotebookOperation.noteBooks();
        //while döngüsü ile caseleri tanımlayıp kullanıcıya seçenekler sunuldu
        while (true){
            switch (selected){
                case 0:
                    System.out.println("Çıkış yaptınız ! PatikaStore'a yine bekleriz.");
                    break;
                case 1:
                    System.out.println("1- Ürünleri Listele ");
                    System.out.println("2- Ürün ekle ");
                    System.out.println("3- Ürün sil ");
                    System.out.println("4- Filtreleme");
                    System.out.println("0- Ana menüye dön ");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    int selectnum=select.nextInt();
                    switch (selectnum){
                        case 0:
                            screenConsol();
                            break;
                        case 1:
                            System.out.println("Ürünler");
                            NotebookOperation.printList();
                            screenConsol();
                            break;
                        case 2:
                            NotebookOperation.addNotebooks();
                            screenConsol();
                            break;
                        case 3:
                            NotebookOperation.deleteNotebook();
                            screenConsol();
                            break;
                        case 4:
                            System.out.print("Filtreleme tercihinizi belirleyiniz : \n " +
                                    "1- ID numarasına göre \n " +
                                    "2- Markasına göre \n " +
                                    "Tercihiniz : ");
                            Scanner scan=new Scanner(System.in);
                            int choose=scan.nextInt();
                            if (choose==1){
                                NotebookOperation.filterById();
                            } else if (choose==2) {
                                NotebookOperation.filterByBrandName();
                            }else{
                                System.out.println("Hatalı bir giriş yaptınız!! Ana Menüye yönlendiriliyorsunuz!!");
                                screenConsol();
                            }
                            screenConsol();
                            break;
                        default:
                            System.out.println("Hatalı bir giriş yaptınız!! Ana Menüye yönlendiriliyorsunuz!!");
                            screenConsol();
                    }

                    break;
                case 2:
                    System.out.println("1- Ürünleri Listele ");
                    System.out.println("2- Ürün ekle ");
                    System.out.println("3- Ürün sil ");
                    System.out.println("4- Filtreleme");
                    System.out.println("0- Ana menüye dön ");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    int selectnumber=select.nextInt();
                    switch (selectnumber){
                        case 0:
                            screenConsol();
                            break;
                        case 1:
                            System.out.println("Ürünler");
                            SmartPhoneOperation.printList();
                            screenConsol();
                            break;
                        case 2:
                            SmartPhoneOperation.addMobilePhones();
                            screenConsol();
                            break;
                        case 3:
                            SmartPhoneOperation.deleteMobilePhone();
                            screenConsol();
                            break;
                        case 4:
                            System.out.print("Filtreleme tercihinizi belirleyiniz : \n " +
                                    "1- ID numarasına göre \n " +
                                    "2- Markasına göre \n " +
                                    "Tercihiniz : ");
                            Scanner scan=new Scanner(System.in);
                            int choose=scan.nextInt();
                            if (choose==1){
                                SmartPhoneOperation.filterById();
                            } else if (choose==2) {
                                SmartPhoneOperation.filterByBrandName();
                            }else{
                                System.out.println("Hatalı bir giriş yaptınız!! Ana Menüye yönlendiriliyorsunuz!!");
                                screenConsol();
                            }
                            break;
                        default:
                            System.out.println("Hatalı bir giriş yaptınız!! Ana Menüye yönlendiriliyorsunuz!!");
                            screenConsol();
                    }
                    break;
                case 3:
                    Brand.print();
                    screenConsol();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız tekrar giriş yapınız !");
                    screenConsol();
            }
            break;


        }

    }
    public static boolean isCheck(){
        return true;
    }
}
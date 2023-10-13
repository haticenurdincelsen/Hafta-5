import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap <String,Integer>repetitiveWord = new HashMap<String,Integer>();

        Scanner scan=new Scanner(System.in);
        System.out.println("Metin giriniz : ");
        String text=scan.nextLine();
        String[] split = text.split(" ");
//Döngüyle tek tek dolaşılıp kelimeler Hashmap'e eklendi.
        for (String i:split){
            if (repetitiveWord.containsKey(i)) {
                int value = repetitiveWord.get(i);
// Kelime daha önce eklenmişse value değeri 1 artırıldı.
                repetitiveWord.put(i, value + 1);
            }else {
                repetitiveWord.put(i,1);
            }
        }
        int j=0;
        String k="";
// foreach döngüsü ile en çok tekrar edilen kelime bulundu.
        for (Map.Entry<String,Integer>set:repetitiveWord.entrySet()){
            if (j<set.getValue()){
                j=set.getValue();
                k=set.getKey();
            }
        }
        System.out.println();
        System.out.println("Metinde en çok tekrar eden kelime : "+ k);

        }

    }

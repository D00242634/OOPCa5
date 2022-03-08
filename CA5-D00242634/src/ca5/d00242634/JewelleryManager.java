package ca5.d00242634;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JewelleryManager {

    private final ArrayList<Jewellery> JewelleryList;

    public JewelleryManager() {
        this.JewelleryList = new ArrayList<>();
        Ring ring1 = new Ring(12.88, "gold  ", true, 12);
        Ring ring2 = new Ring(8.88, "silver", false, 13);
        Ring ring3 = new Ring(6.22, "gold  ", true, 5);
        Ring ring4 = new Ring(3.77, "silver", true, 6.5);
        Ring ring5 = new Ring(8.999, "gold  ", true, 3.2);
        Necklace neck1 = new Necklace(12.88, "gold  ", true, 12, 25);
        Necklace neck2 = new Necklace(625.5, "diamond  ", false, 13, 5);
        Earring ear1 = new Earring(12.88, "gold  ", true, "Lobe", "Round");
        Earring ear2 = new Earring(13.50, "silver  ", true, "Lobe", "Cone");
        Earring ear3 = new Earring(75.33, "diamond  ", true, "rook", "Round");
        JewelleryList.add(ring1);
        JewelleryList.add(ring2);
        JewelleryList.add(ring3);
        JewelleryList.add(ring4);
        JewelleryList.add(ring5);
        JewelleryList.add(neck1);
        JewelleryList.add(neck2);
        JewelleryList.add(ear1);
        JewelleryList.add(ear2);
        JewelleryList.add(ear3);

        HashMap<String, Jewellery> hashmap = new HashMap<>();
        hashmap.put("1", ring1);
        hashmap.put("2", ring2);
        hashmap.put("3", ring3);
        hashmap.put("4", ring4);
        hashmap.put("5", ring5);
        hashmap.put("6", neck1);
        hashmap.put("7", neck2);
        hashmap.put("8", ear1);
        hashmap.put("9", ear2);
        hashmap.put("10", ear3);

    }

    public void displayAllJewellerys() {
        for (ca5.d00242634.Jewellery v : JewelleryList) {
            System.out.println(v.toString());
        }
    }

    public void ApplyJewelleryToHashMap(int x) {
        HashMap<Integer, Jewellery> hashmap = new HashMap<>();
        int i = 0;
        for (ca5.d00242634.Jewellery v : JewelleryList) {
            i++;
            hashmap.put(i, v);
        }
        int s = 1;
        do {
            if (x <= i) {
                System.out.println(hashmap.get(x));
                s = 2;
            } else {
                System.out.println("This entry doesnt exist , try again 1-10\n New Number: ");
                Scanner sc = new Scanner(System.in);
                x = sc.nextInt();
            }
        } while (s == 1);

    }

    public ca5.d00242634.Jewellery addJewellery(ca5.d00242634.Jewellery newV) {

        for (ca5.d00242634.Jewellery v : JewelleryList) {
            if (v.equals(newV)) {
                return null;
            }
        }
        JewelleryList.add(newV);
        return newV;
    }

}

package com.mujaddid.katalogpakaianmuslim;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.mujaddid.katalogpakaianmuslim.model.Pria;
import com.mujaddid.katalogpakaianmuslim.model.Pakaian;
import com.mujaddid.katalogpakaianmuslim.model.Wanita;

public class DataProvider {
    private static List<Pakaian> pakaians = new ArrayList<>();

    private static List<Pria> initDataPria(Context ctx) {
        List<Pria> prias = new ArrayList<>();
        prias.add(new Pria("Koko Kurta Pria Tangan 3/4", "Rp110.000",
                "Baju koko Kurta modern dewasa,Bahan:katun toyobo super (halus,lembut,jaton,dingin nyaman)" +
                        "M=panjang 80 cm,lingkaran dad 100cm" +
                        "L=panjang 83 cm,lingkaran dada 106 cm" +
                        "XL=Panjang 85 cm,Lingkaran Dada 112cm", R.drawable.maroon));
        prias.add(new Pria("Koko Pria Muslim Lis BURBERRY Super Jumbo", "Rp48.000",
                "Bahan Katun Paris (lembut,halus,tebal,nyaman dan tidak panas)" +
                        "M=panjang 80 cm,lingkaran dad 100cm" +
                        "L=panjang 83 cm,lingkaran dada 106 cm" +
                        "XL=Panjang 85 cm,Lingkaran Dada 112cm", R.drawable.burberry));
        prias.add(new Pria("Koko Qurta Pakistan", "Rp67.000",
                "Bahan Katun Paris (lembut,halus,tebal,nyaman dan tidak panas)" +
                        "M=panjang 80 cm,lingkaran dad 100cm" +
                        "L=panjang 83 cm,lingkaran dada 106 cm" +
                        "XL=Panjang 85 cm,Lingkaran Dada 112cm", R.drawable.pakistan));
        prias.add(new Pria("Quarta Gamis Pakistan", "Rp131.000",
                "Bahan Katun Paris (lembut,halus,tebal,nyaman dan tidak panas)" +
                        "M=panjang 80 cm,lingkaran dad 100cm" +
                        "L=panjang 83 cm,lingkaran dada 106 cm" +
                        "XL=Panjang 85 cm,Lingkaran Dada 112cm", R.drawable.gamis_pakistan));
        return prias;
    }

    private static List<Wanita> initDataWanita(Context ctx) {
        List<Wanita> wanitas = new ArrayList<>();
        wanitas.add(new Wanita("Mukaen Siti Khadijah Broderi Rose", "Rp400.000",
                "Material dari poplin khadijah" +
                        "desain kepala khadijah" +
                        "terdapat 2 varian warna" +
                        "pinggang elastis cocok untuk semua ukuran", R.drawable.mukena));
        wanitas.add(new Wanita("Gamis Wanita Muslim Dress", "Rp65.000 ",
                "Bahan : Balloteli" +
                        "UK.All Size To L+" +
                        "Ld=100cm" +
                        "Pj=135cm", R.drawable.gamis));
        wanitas.add(new Wanita("Gamis Putih ", "Rp190.000",
                "BAHAN:" +
                        "Cerutty Kombinasi Brukat Glitter" +
                        "Tanpa jilbab ", R.drawable.gamis_putih));
        wanitas.add(new Wanita("Renata Dress Baju Wanita Gamis Shopiya", "Rp56.000",
                "BAHAN:" +
                        "Cerutty Kombinasi Brukat Glitter" +
                        "Tanpa jilbab", R.drawable.renata));
        return wanitas;
    }

    private static void initAllPakaian(Context ctx) {
        pakaians.addAll(initDataPria(ctx));
        pakaians.addAll(initDataWanita(ctx));
    }

    public static List<Pakaian> getAllPakaian(Context ctx) {
        if (pakaians.size() == 0) {
            initAllPakaian(ctx);
        }
        return  pakaians;
    }

    public static List<Pakaian> getPakaiansByTipe(Context ctx, String jenis) {
        List<Pakaian> pakaiansByType = new ArrayList<>();
        if (pakaians.size() == 0) {
            initAllPakaian(ctx);
        }
        for (Pakaian h : pakaians) {
            if (h.getJenis().equals(jenis)) {
                pakaiansByType.add(h);
            }
        }
        return pakaiansByType;
    }

}

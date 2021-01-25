package com.example.remidi;

import android.content.Context;

import com.example.remidi.model.Anjing;
import com.example.remidi.model.Harimau;
import com.example.remidi.model.Kucing;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Kucing> kucings = new ArrayList<>();
    private static List<Anjing> anjings = new ArrayList<>();
    private static List<Harimau> harimaus = new ArrayList<>();

    static void iniDataKucing(Context ctx) {

        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
    }

    static void initDataAnjing(Context ctx) {
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));

    }

    static void iniDAtaHarimau(Context ctx) {
        harimaus.add(new Harimau("Harimau Benggala", "India",
                "salah satu spesies harimau yang terancam punah. Di alam liar, tercatat hanya ada sekitar 2000-2.500 ekor harimau Benggala.", R.drawable.tgr_benggala));
        harimaus.add(new Harimau("Harimau Kaspia", "Irak, Afganistan",
                "subspesies harimau yang habitatnya di wilayah Iran, Irak, Afganistan, Turki, Mongolia, Kazakhstan, Kaukasus, Tajikistan, Turkmenistan, dan Uzbekistan. Subspesies ini punah pada akhir tahun 1950-an.", R.drawable.tgr_kaspia));
        harimaus.add(new Harimau("Harimau Siberia","Wilayah Amur Timur Jauh",
                "subspesies harimau yang habitatnya berada di wilayah Amur di Timur Jauh dan berstatus dilindungi. Harimau siberia dianggap sebagai subspesies terbesar dari enam subspesies harimau.",R.drawable.tgr_siberia));
    }

    public static List<Kucing> getAllKucings(Context ctx){
        if (kucings.size() == 0) {
            iniDataKucing(ctx);
        }
        return kucings;
    }

    public static List<Anjing> getAllAnjings(Context ctx){
        if (anjings.size() == 0){
            initDataAnjing(ctx);
        }
        return anjings;
    }

    public static List<Harimau> getAllHarimau(Context ctx){
        if (harimaus.size() == 0){
            iniDAtaHarimau(ctx);
        }
        return harimaus;
    }
}

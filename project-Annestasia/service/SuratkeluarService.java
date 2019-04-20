package service;

import java.util.*;
import entity.*;

public class SuratkeluarService {

    private static List<Suratkeluar> data = new LinkedList<Suratkeluar>();

    public void tambahData(Suratkeluar sk) {
        data.add(sk);
        System.out.println("data telah tersimpan");
    }

    public void ubahData(Suratkeluar sk) {
        int idx = data.indexOf(sk);
        if(idx >= 0) {
            data.set(idx, sk);
            System.out.println("data telah berubah");
        }
    }

    public void hapusData(String penerima) {
        int idx = data.indexOf(new Suratkeluar(penerima, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void tampilkanData() {
        System.out.println("\n--= SURAT KELUAR =--");
        int urutan = 1;
        for (Suratkeluar sk : data){
            System.out.println("data ke-" + urutan++);
            System.out.println("  penerima : " + sk.getPenerima());
            System.out.println("  alamat penerima : " + sk.getAlamatpenerima());
            System.out.println("  diterima : " + sk.getDiterima());
        }
    }

}
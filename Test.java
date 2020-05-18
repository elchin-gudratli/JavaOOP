package com.bilgeadam.oop;

import com.bilgeadam.kalitim.AkilliCocuk;
import com.bilgeadam.kalitim.Anne;
import com.bilgeadam.kalitim.Baba;
import com.bilgeadam.kalitim.Cocuk;
import com.bilgeadam.kalitim.UsluCocuk;

public class Test {



	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{

		// Bir class tan nesne oluşturduk 
		//ClassIsmi nesnemizinAdi = new ClassIsmi();
		// instance örneği 
		
		Insan           i         = new Insan();
		i.Ad = "Elchin";
		i.Soyad = "Gudratli";
		i.Yas = 22;
		i.Maas = 8.500;
		i.Cinsiyet = true;
		i.Uyu(i.Ad, i.Soyad);
		
		Insan    i1   =new Insan("Can","Guliyev");
		
		Insan i2  =new Insan ("Selena","Guliyeva",27,3000);
		
		
		Anne  a  = new Anne();
		a.Ad = "Chimnaz";
		a.Soyad = "Guliyeva";
		a.Yas = 54;
		a.Oku(a.Ad);
		a.Yaz(a.Ad);
		a.Dinle(a.Ad);
		a.Uyu(a.Ad, a.Soyad);
		a.EkranaYaz(a.Ad, a.Soyad);
		
		
		Baba  b  = new Baba();
		b.Ad = "Gudrat";
		b.Soyad = "Guliyev";
		b.Yas = 62;
		b.Uyu(b.Ad, b.Soyad);
		b.EkranaYaz(b.Ad, b.Soyad);
		
		Cocuk  c  = new Cocuk();
		c.Ad = "Elchin";
		c.Soyad = "Gudratli";
		c.Yas = 22;
		c.Uyu(c.Ad, c.Soyad);
        c.EkranaYaz(c.Ad, c.Soyad);
        
        AkilliCocuk ak = new AkilliCocuk();
        ak.Ad = "Hakan";
        ak.Soyad = "Yilmaz";
        ak.Sifat = "Akillidir";
        ak.AdSoyadSifatYaz(ak.Ad, ak.Soyad, ak.Sifat);
        ak.AskereGit(ak.Ad);
        ak.EhliyetAl(ak.Ad);
        ak.KlubeGit(ak.Ad);
        
        UsluCocuk us = new UsluCocuk();
        us.Ad = "Sarp";
        us.Soyad = "Yilmaz";
        us.Sifat = "Usludur";
        us.AdSoyadSifatYaz(us.Ad, us.Soyad, us.Sifat);
        us.AskereGit(us.Ad);
        us.EhliyetAl(us.Ad);
      


	}

}

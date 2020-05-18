package com.bilgeadam.oop;

public class Insan
{
	
	public String Ad = null;  // alfanümeik tipte değer depolanır.
	public String Soyad = null;
	public int Yas = 0;  // sadece tamsayısal ifadeler depolanır.
	public double Maas = 0.0;  // .noktalı değerler  depolanır
	public boolean Cinsiyet; // true yada false değerlerinden birisi depolanır
	
	
	// Metotlar türkçe fiillere karşılık gelir. 
	// Metotlar 2 ye ayrılırlar
	// Değer Döndüren ve değer döndürmeyen şeklinde
	
	public Insan() {
		
	}
	
	public Insan(String adi,String soyadi) {
		Ad=adi;
		Soyad=soyadi;
		
	}
	public Insan(String adi,String soyadi,int yasi,double maasi) {
		Ad=adi;
		Soyad=soyadi;
		Yas=yasi;
		Maas=maasi;
	}
	
	
	public void Uyu(String adi,String soyadi)
	{
		
		System.out.println(adi+" "+soyadi+" Uyuyor");
		
	}
	
	
	public void EkranaYaz(String adi,String soyadi)
	{
		
		System.out.println("Kisinin Adi: " +adi + " Kisinin Soyadi : "+soyadi);
		
	}
	
	public int YasHesapla(int DogumYili)  // Metot kosullar Ifyas
	{
		
		int sonuc =0;
		
		sonuc=2019-DogumYili;
		
		return sonuc;
		
	}
	
	
	
	
}



package com.bilgeadam.oop;

public class Matematik {
	
	// geriye int dönen ve 2 tane int tipinde parametre topla adında bir metot tanımlayacağız
	
	public int Topla(int Sayi1,int Sayi2)
	{
		int sonuc;
		
		sonuc = Sayi1+Sayi2;
	
		return sonuc;
	
	}
	
	public int Cikar(int Sayi1,int Sayi2)
	{
		int sonuc;
		
		sonuc = Sayi1-Sayi2;

		return sonuc;
	}
	
	
	public int Carp(int Sayi1,int Sayi2)
	{
		int sonuc;
		
		sonuc = Sayi1*Sayi2;
	
		
		return sonuc;
	}
	

	public double Bol(double Sayi1,int Sayi2)
	{
		double sonuc;
		
		sonuc = Sayi1/Sayi2;

		
		return sonuc;
	}
	

}

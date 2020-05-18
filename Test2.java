package com.bilgeadam.oop;

public class Test2 {

	public static void main(String[] args) {
	
		
		Matematik   m  = new Matematik();
		
		//1. Yöntem
		System.out.println("Toplam " +m.Topla(5, 5));
		System.out.println("Cikan Sonuc " +m.Cikar(5, 5));
		System.out.println("Carpma Sonucu " +m.Carp(5, 5));
		System.out.println("Kalan Sonuc " +m.Bol(5, 5));
		
		
		
		// 2. Yöntem
		int gelenDeger;
		gelenDeger = m.Topla(5, 5);
		System.out.println("Toplam " +gelenDeger);

	}

}

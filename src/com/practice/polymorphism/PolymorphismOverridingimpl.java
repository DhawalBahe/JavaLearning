package com.practice.polymorphism;

public class PolymorphismOverridingimpl 
             extends PolymorphismOverriding {

	@Override
	public String dispaly() {
		return "Pratiksha";
	}

	public static void main(String[] args) {
		
		PolymorphismOverriding polymorphismOverriding 
		= new PolymorphismOverriding();
		String str = polymorphismOverriding.dispaly();
		System.out.println(str);
		
		PolymorphismOverridingimpl polymorphismOverridingimpl 
		= new PolymorphismOverridingimpl();
		String result = polymorphismOverridingimpl.dispaly();
		System.out.println(result);
	}
}

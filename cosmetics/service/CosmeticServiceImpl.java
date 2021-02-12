package com.xworkz.cosmetics.service;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class CosmeticServiceImpl implements CosmeticService {

	public CosmeticServiceImpl() {
		System.out.println("created cosmetic service impl");
	}
	
	public boolean ValidateAndSave(CosmeticsDTO cosmeticdto) {
		boolean validData=false;
		if(cosmeticdto!=null) {
			System.out.println("dto is not null , we can validate the dto fields");
			String brand=cosmeticdto.getBrand();
			if(brand!=null&& brand.length()>=3&&!brand.equals("")&&!brand.isEmpty()) {
				System.out.println("brand is valid");
				validData=true;
			}else {
				System.out.println("brand is not valid");
				validData=false;
			}
			if(validData) {
				CosmeticType type=cosmeticdto.getType();
				if(type!=null) {
					System.out.println("cosmetic type is not null,can validate");
					validData=true;
				}else {
					System.out.println("not a valid cosmetic type");
					validData=false;
				}
			}
			
			if(validData) {
				CosmeticShade shade=cosmeticdto.getShades();
				if(shade!=null) {
					System.out.println("valid shade and can validate");
					validData=true;
				}else {
					System.out.println("not a valid shade type");
					validData=false;
				}
			}
			if(validData) {
				int quantity=cosmeticdto.getQuantity();
				if(quantity>0&&quantity<=100) {
					System.out.println("quantity is valid");
					validData=true;
				}else {
					System.out.println("quantity is invalid");
					validData=false;
				}
			}
			if(validData) {
				double price=cosmeticdto.getPrice();
				if(price>0) {
					System.out.println("price is valid");
					validData=true;
				}else {
					System.out.println("price is not valid");
					validData=false;
				}
			}
			
			if(validData){
				System.out.println("data is valid ,we can invoke dao from service");
			}else {
					System.out.println("dto is null,cannot valid dto");
				}
			}
		return false;
		}

	@Override
	public boolean validateAndSave(CosmeticsDTO cosmeticdto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteByBrand(String brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int cosmeticsSize() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	}



package com.xworkz.cosmetics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticsDAO;
import com.xworkz.cosmetics.dao.CosmeticsDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class CosmeticsTester {
   public static void main(String[] args) {
	
	   CosmeticsDTO cosmeticsDTO=new CosmeticsDTO();
	   cosmeticsDTO.setBrand("maybelline");
	   cosmeticsDTO.setPrice(300);
	   cosmeticsDTO.setCosmeticType(CosmeticType.TONER);
	   cosmeticsDTO.setQuantity(50);
	   
	   CosmeticsDAO dao=new CosmeticsDAOImpl();
	   dao.save(cosmeticsDTO);
	   
		CosmeticsDTO cosmeticDTO2 = new CosmeticsDTO("Mac", CosmeticShade.BLUE, 2, 30, CosmeticType.EYELINER);
		dao.save(cosmeticDTO2);
		CosmeticsDTO cosmeticDTO3 = new CosmeticsDTO("Lakme", CosmeticShade.BLUE, 2, 20, CosmeticType.EYELINER);
		dao.save(cosmeticDTO3);
		
		List<CosmeticsDTO> cosmeticDTOs=new ArrayList<CosmeticsDTO>();
		cosmeticDTOs.add(cosmeticsDTO);
		cosmeticDTOs.add(cosmeticDTO2);
		cosmeticDTOs.add(cosmeticDTO3);
		
		System.out.println(cosmeticDTOs);
		
		for (CosmeticsDTO cosmeticDTO4 : cosmeticDTOs) {
			System.out.println(cosmeticDTO4.getBrand());
		}
		
		Collections.sort(cosmeticDTOs);
		
		for (CosmeticsDTO cosmeticDTO4 : cosmeticDTOs) {
			System.out.println(cosmeticDTO4.getBrand());
		}
	}


   
   }


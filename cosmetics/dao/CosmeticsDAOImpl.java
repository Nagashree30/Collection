package com.xworkz.cosmetics.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class CosmeticsDAOImpl implements CosmeticsDAO{

	private List<CosmeticsDTO>cosmetics;
	
	public CosmeticsDAOImpl() {
		this.cosmetics=new ArrayList<CosmeticsDTO>();
	}
	@Override
	public boolean save(CosmeticsDTO dto) {
		boolean added=this.cosmetics.add(dto);
		if(added)
			System.out.println("cosmetic added");
		else
			System.out.println("cosmetics not added");
		return added;
	}
	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		return false;
	}
	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		return false;
	}
	@Override
	public boolean updatePriceByBrand(String brand, CosmeticType type) {
		return false;
	}
	@Override
	public boolean deleteByBrand(String brand) {
		Iterator<CosmeticsDTO> iterator=this.cosmetics.iterator();
        while(iterator.hasNext())
        {
      	  CosmeticsDTO dto=iterator.next();
      	  if(dto.getBrand().equals(brand))
      	  {
      		  iterator.remove();
      		  return true;
      	  }
        }
		return false;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<CosmeticsDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int totalsize() {
		// TODO Auto-generated method stub
		return 0;
	}

}

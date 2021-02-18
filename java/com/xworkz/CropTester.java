package com.xworkz;



import com.xworkz.crop.cropenum.CropSeason;
import com.xworkz.crop.cropenum.CropType;
import com.xworkz.crop.dao.CropDAO;
import com.xworkz.crop.dao.CropDAOImpl;
import com.xworkz.crop.entity.CropEntity;

public class CropTester {

	public static void main(String[] args)  {
		
         CropEntity cropEntity = new CropEntity("Ragi", CropType.Kharif, 40.0, CropSeason.Summer, true, 5);
		 
		 CropDAO cropDAOImpl = new CropDAOImpl();
		 cropDAOImpl.saveCrop(cropEntity);
		
		
	}

}

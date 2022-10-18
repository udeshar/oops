package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileIS {
	
	private List<Mobile> allMobileList;
	
	public List<Mobile> getAllMobileList() {
		return allMobileList;
	}

	public void setAllMobileList(List<Mobile> allMobileList) {
		this.allMobileList = allMobileList;
	}
	
	public Map<String, Mobile> listByBrandName(String modalName){
		Mobile mByModal = null;
		for(Integer i=0; i<allMobileList.size(); i++) {
			if(allMobileList.get(i).getModalName() == modalName) {
				mByModal = allMobileList.get(i);
			}
		}
		Map<String, Mobile> mobByModal = new HashMap<String, Mobile>();
		mobByModal.put(modalName, mByModal);
		return mobByModal;
	}
	
	public List<Map<String, Mobile>> getMobileByPrice(Boolean isGreaterThen, Integer price){
		List<Map<String, Mobile>> mByPrice = null;
		for(Integer i=0; i<allMobileList.size(); i++) {
			Map<String,Mobile> priceMap = null; 
			if(isGreaterThen && allMobileList.get(i).getPrice() > price) {
				priceMap.put(allMobileList.get(i).getModalName(), allMobileList.get(i));
				mByPrice.add(priceMap);
			}
			if(!isGreaterThen && allMobileList.get(i).getPrice() < price) {
				priceMap.put(allMobileList.get(i).getModalName(), allMobileList.get(i));
				mByPrice.add(priceMap);
			}
		}
		if(mByPrice != null) return mByPrice;
		else return mByPrice;
	}
	
}

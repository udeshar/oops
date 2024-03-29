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
	
	public Map<String, List<Mobile>> getMobileByPrice(Boolean isGreaterThen, Integer price){
		Map<String, List<Mobile>> mByPrice = new HashMap<String, List<Mobile>>();
		List<Mobile> lsMb = new ArrayList<>();
		for(Integer i=0; i<allMobileList.size(); i++) {
			if(isGreaterThen && allMobileList.get(i).getPrice() > price) {
				lsMb.add(allMobileList.get(i));
			}
			if(!isGreaterThen && allMobileList.get(i).getPrice() < price) {
				lsMb.add(allMobileList.get(i));
			}
		}
		mByPrice.put("priceFilter", lsMb);
		return mByPrice;
	}
	
}

package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Tourist;

public interface ITouristMgmtService {
	
	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourists();
	public Tourist fetchTouristById(Integer id);
	public String updateToursitByDetailse(Tourist tourist);
	public String updateTouristById(Integer id, Float hikePercent);
	public String deleteTouristById(Integer id);

}

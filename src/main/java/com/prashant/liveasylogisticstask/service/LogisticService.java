package com.prashant.liveasylogisticstask.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.liveasylogisticstask.repository.LogisticRepository;
import com.prashant.liveasylogisticstask.model.LogisticEntity;

@Service
public class LogisticService {
	
	@Autowired
	private LogisticRepository logisticRepository;
	
	public List<LogisticEntity> getAllLoads() {
		return logisticRepository.findAll();
	}

    public Optional<LogisticEntity> getLoadsByLoadId(long loadId) {
        return logisticRepository.findById(loadId);
    }

    public LogisticEntity createLoad(LogisticEntity load) {
        return logisticRepository.save(load);
    }

    public LogisticEntity updateLoad(Long loadId, LogisticEntity updatedLoad) {
    	Optional<LogisticEntity> existing = logisticRepository.findById(loadId);

        if (existing.isEmpty()) {
            return null;
        }
        LogisticEntity existingLoad = existing.get();

        // Update the fields of the existing load with the values from the updatedLoad
        existingLoad.setLoadingPoint(updatedLoad.getLoadingPoint());
        existingLoad.setUnloadingPoint(updatedLoad.getUnloadingPoint());
        existingLoad.setProductType(updatedLoad.getProductType());
        existingLoad.setTruckType(updatedLoad.getTruckType());
        existingLoad.setNoOfTrucks(updatedLoad.getNoOfTrucks());
        existingLoad.setWeight(updatedLoad.getWeight());
        existingLoad.setComment(updatedLoad.getComment());
        // Update other fields as needed

        // Save the updated load to the database
        return logisticRepository.save(existingLoad);
    }

    public void deleteLoad(Long loadId) {
    	logisticRepository.deleteById(loadId);
    }
}

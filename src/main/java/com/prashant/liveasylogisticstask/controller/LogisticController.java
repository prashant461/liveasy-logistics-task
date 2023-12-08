package com.prashant.liveasylogisticstask.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.liveasylogisticstask.model.LogisticEntity;
import com.prashant.liveasylogisticstask.service.LogisticService;

@RestController
@RequestMapping("/load")
public class LogisticController {
	
	@Autowired
	private LogisticService logisticService;

    @PostMapping
    public ResponseEntity<String> createLoad(@RequestBody LogisticEntity load) {
    	logisticService.createLoad(load);
    	
        return ResponseEntity.ok("Loads details added successfully");
    }

    @GetMapping
    public ResponseEntity<List<LogisticEntity>> getAllLoads() {
        List<LogisticEntity> loads = logisticService.getAllLoads();
        return ResponseEntity.ok(loads);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<Optional<LogisticEntity>> getLoadById(@PathVariable Long loadId) {
        // Implement logic to retrieve a load by ID from the database
    	 Optional<LogisticEntity> load = logisticService.getLoadsByLoadId(loadId);
         return ResponseEntity.ok(load);
    }

    @PutMapping("/{loadId}")
    public ResponseEntity<LogisticEntity> updateLoad(@PathVariable Long loadId, @RequestBody LogisticEntity updatedLoad) {
    	LogisticEntity updaEntity = logisticService.updateLoad(loadId, updatedLoad);
    	return ResponseEntity.ok(updaEntity);
        
    }

    @DeleteMapping("/{loadId}")
    public ResponseEntity<String> deleteLoad(@PathVariable Long loadId) {
        logisticService.deleteLoad(loadId);
		return ResponseEntity.ok("Deleted successfully.");
    }

}

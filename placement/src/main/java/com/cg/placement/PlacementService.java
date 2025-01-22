package com.cg.placement;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {

    private final PlacementRepository placementRepository;

    public PlacementService(PlacementRepository placementRepository) {
        this.placementRepository = placementRepository;
    }

    public Placement createPlacement(Placement placement){
        return placementRepository.save(placement);
    }

    public Placement getPlacementById(int id){
        return placementRepository.findById(id).orElse(null);
    }

    public List<Placement> getAllPlacement(){
        return placementRepository.findAll();
    }
}

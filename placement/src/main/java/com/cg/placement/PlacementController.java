package com.cg.placement;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlacementController {

    private final PlacementService service;

    public PlacementController(PlacementService service) {
        this.service = service;
    }

    @GetMapping("/placement/{id}")
    public Placement get(@PathVariable int id) {
        return service.getPlacementById(id);
    }

    // Create a new Row in db
    @PostMapping("/placements")
    public Placement addPlacement(@RequestBody Placement placement) {
        return service.createPlacement(placement);
    }
    @GetMapping("/list")
    public List<Placement> getPlacementList(){
        return service.getAllPlacement();
    }
    // DELETE OPERATION


}

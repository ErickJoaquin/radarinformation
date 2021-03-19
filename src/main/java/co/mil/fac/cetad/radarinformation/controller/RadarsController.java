package co.mil.fac.cetad.radarinformation.controller;

import co.mil.fac.cetad.radarinformation.model.HRadares;
import co.mil.fac.cetad.radarinformation.repository.RadarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RadarsController {

    @Autowired
    RadarsRepository radarsRepository;

    @GetMapping()
    public List<HRadares> getAllRadarsInfo(){

        List <HRadares> radares = radarsRepository.findAll();
        if(!radares.isEmpty()){
            return radares;
        }
        else{
            return null;
        }

    }

    @GetMapping("/radares/{id}")
    public Optional<HRadares> one(@PathVariable int id) {
        Optional<HRadares> radar = radarsRepository.findById(id);
        if(radar.isPresent()){
            return radar;
        }
        else{
            return null;
        }
    }

    @PostMapping("/radares")
    ResponseEntity<HRadares> saveRadar(@RequestBody HRadares hRadares) {

        HRadares radars = radarsRepository.save(hRadares);
        return ResponseEntity.ok(radars);
    }

    @DeleteMapping ("/radares/{id}")
    public void delete(@PathVariable int id) {
        radarsRepository.deleteById(id);

    }
}

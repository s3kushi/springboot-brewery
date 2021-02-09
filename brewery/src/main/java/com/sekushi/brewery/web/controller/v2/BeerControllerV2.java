package com.sekushi.brewery.web.controller.v2;

import com.sekushi.brewery.services.v2.BeerServiceV2;
import com.sekushi.brewery.web.model.v2.BeerDTOV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDTOV2> getBeer(@PathVariable("beerId") UUID beerId) {
        // @PathVariable is unnecessary here, but wouldn't be if the mapping and signature variable didn't match
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody BeerDTOV2 beerDTO) {
        BeerDTOV2 savedDTO = beerService.saveBeer(beerDTO);

        HttpHeaders headers = new HttpHeaders();
        // todo add hostname
        headers.add("Location", "/api/v2/beer/" + savedDTO.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDTOV2 beerDTO) {

        beerService.updateBeer(beerId, beerDTO);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
        beerService.deleteById(beerId);
    }
}

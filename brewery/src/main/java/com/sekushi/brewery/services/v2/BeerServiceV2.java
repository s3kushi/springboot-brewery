package com.sekushi.brewery.services.v2;

import com.sekushi.brewery.web.model.v2.BeerDTOV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDTOV2 getBeerById(UUID beerId);

    BeerDTOV2 saveBeer(BeerDTOV2 beerDTO);

    void updateBeer(UUID beerId, BeerDTOV2 beerDTO);

    void deleteById(UUID beerId);
}

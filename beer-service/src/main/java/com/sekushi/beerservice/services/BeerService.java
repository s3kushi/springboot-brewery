package com.sekushi.beerservice.services;

import com.sekushi.beerservice.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    BeerDTO updateBeer(UUID beerId, BeerDTO beerDto);
}

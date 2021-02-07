package com.sekushi.springbootbrewery.services;

import com.sekushi.springbootbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveBeer(BeerDTO beerDTO);

    void updateBeer(UUID beerId, BeerDTO beerDTO);

    void deleteById(UUID beerId);
}

package com.sekushi.brewery.web.mappers;

import com.sekushi.brewery.domain.Beer;
import com.sekushi.brewery.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDTO(Beer beer);

    Beer beerDTOToBeer(BeerDTO dto);
}

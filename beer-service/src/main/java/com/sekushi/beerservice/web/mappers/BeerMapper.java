package com.sekushi.beerservice.web.mappers;

import com.sekushi.beerservice.domain.Beer;
import com.sekushi.beerservice.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO beerToBeerDTO (Beer beer);

    Beer BeerDtoToBeer(BeerDTO dto);
}

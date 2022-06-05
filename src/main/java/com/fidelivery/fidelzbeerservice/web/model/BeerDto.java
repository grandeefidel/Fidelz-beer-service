package com.fidelivery.fidelzbeerservice.web.model;

import com.fidelivery.fidelzbeerservice.web.enums.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private BeerStyleEnum beerStyle;
    private String upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}

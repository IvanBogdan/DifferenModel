package com.mcb.creditfactory.service;

import com.mcb.creditfactory.dto.Collateral;

import java.util.Optional;

public interface TheCollateralService <T, U extends Collateral> {
    boolean approve(U dto);
    T save(T car);
    Optional<T> load(Long id);
    T fromDto(U dto);
    U toDTO(T car);
    Long getId(T car);
    Class<U> getDtoClass();
}

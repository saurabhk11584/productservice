package com.scaler.productservicedecmwfeve.dtos;

import com.scaler.productservicedecmwfeve.models.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role extends BaseModel {
    private String name;

}

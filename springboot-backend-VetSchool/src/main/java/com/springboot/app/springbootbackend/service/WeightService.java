package com.springboot.app.springbootbackend.service;

import com.springboot.app.springbootbackend.model.Treatment;
import com.springboot.app.springbootbackend.model.Weight;

import java.util.List;

public interface WeightService {

    Weight saveWeight(Weight weight);
    List<Weight> getAllWeights();

}
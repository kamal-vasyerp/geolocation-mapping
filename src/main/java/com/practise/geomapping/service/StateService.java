package com.practise.geomapping.service;

import java.util.List;

import com.practise.geomapping.dto.ResponceCity;
import com.practise.geomapping.model.State;

public interface StateService {

	public List<State> getAllState();
	public List<ResponceCity> getAllCityInState(int stateId);
	public State getState(int stateId);
	public String saveState(State state);
	public String deleteState(int stateId);
}

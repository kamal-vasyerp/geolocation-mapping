package com.practise.geomapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.geomapping.dto.ResponceCity;
import com.practise.geomapping.exception.StateNotFoundException;
import com.practise.geomapping.model.State;
import com.practise.geomapping.repository.StateRepository;


@Service
public class StateServiceImp implements StateService {

	@Autowired
	private StateRepository stateRepositroy;

	@Override
	public List<State> getAllState() {
		return stateRepositroy.findAll();
	}

	@Override
	public State getState(int stateId) {
		return stateRepositroy.findById(stateId)
				.orElseThrow(() -> new StateNotFoundException("State is not present in the database."));
	}

	@Override
	public String saveState(State state) {
		stateRepositroy.save(state);
		return "State Saved";
	}

	@Override
	public String deleteState(int stateId) {
		stateRepositroy.deleteById(stateId);
		return "State Deleted";
	}

	@Override
	public List<ResponceCity> getAllCityInState(int stateId) {
		return stateRepositroy.allCityinState(stateId);
	}

}

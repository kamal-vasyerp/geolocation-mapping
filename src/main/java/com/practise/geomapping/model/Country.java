package com.practise.geomapping.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Country {

	@Id
	private int countryId;
	@Column(name="country_name")
	private String countryName;
	@Column(name="capital")
	private String countryCapital;
	
	@OneToMany(mappedBy="country", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<State> stateList;
	
}

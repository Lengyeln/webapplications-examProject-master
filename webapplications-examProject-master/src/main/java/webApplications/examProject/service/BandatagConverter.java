package webApplications.examProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import webApplications.examProject.model.Bandatag;

@Component
public class BandatagConverter implements Converter<Integer, Bandatag> {

	@Autowired
	private BandatagManager bandatagManager;
	
	@Override
	public Bandatag convert(Integer arg0) {
		Bandatag tag = bandatagManager.getBandatagById(arg0);
		return tag;
	}

}

package webApplications.examProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import webApplications.examProject.model.Album;

@Component
public class AlbumConverter implements Converter<Integer, Album> {

	@Autowired
	private AlbumManager albumManager;
	
	@Override
	public Album convert(Integer arg0) {
		Album album = albumManager.getAlbumById(arg0);
		return album;
	}

}

package webApplications.examProject.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DatumConverter implements Converter<String, Date> {

	@Override
	public Date convert(String arg0) {
		
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-DD");
		Date date = null;
		try {
			date = f.parse(arg0);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}

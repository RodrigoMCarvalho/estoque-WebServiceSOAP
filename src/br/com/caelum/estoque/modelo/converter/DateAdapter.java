package br.com.caelum.estoque.modelo.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	private String pattern = "dd/MM/yyyy";
	
	public Date unmarshal (String dataString) throws Exception {
		return new SimpleDateFormat(pattern).parse(dataString);
	}
	
	public String marshal(Date date) throws Exception {
		return new SimpleDateFormat(pattern).format(date);
	}
}

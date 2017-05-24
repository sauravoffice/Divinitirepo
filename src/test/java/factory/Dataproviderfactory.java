package factory;

import dataprovider.Readexcel;
import dataprovider.Readproperty;

public class Dataproviderfactory {
	public static Readexcel getExcel() throws Exception{
		Readexcel excelobj= new Readexcel();
		return excelobj;
		}
public static Readproperty getproperty() throws Exception{
	Readproperty readpro= new Readproperty();
	return readpro;
	
}
}

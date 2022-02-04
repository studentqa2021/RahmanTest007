package com.generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseLogin {
public String getvalue(String value) throws Exception{
	

String path=	"./config.properties";
FileInputStream fis= new FileInputStream(path);
Properties pro = new Properties();
pro.load(fis);
return pro.get(value).toString();
}


}

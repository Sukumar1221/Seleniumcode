package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {

	private String filePath;
	private Properties properties;
	private FileInputStream fip;
	
	public PropertiesReader(String filePath) throws IOException
	{
		this.filePath = filePath;
		fip = new FileInputStream(filePath);
		properties = new Properties();
		properties.load(fip);
	}
	
	public String getPropertyValue(String key) {
		String value = "";
		Optional<Properties> optional = Optional.ofNullable(properties);
		if (optional.isPresent())
			value = properties.getProperty(key);
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
		return value;
	}
	
	public String getPropertyValue(String key,String defaultValue) {
		String value = "";
		Optional<Properties> optional = Optional.ofNullable(properties);
		if (optional.isPresent()){
			value = properties.getProperty(key);
			if (value == null) {
				value = defaultValue;
			}
		}
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
		return value;
	}
	
	public String getPropertyValue(Object key) {
		String value = "";
		Optional<Properties> optional = Optional.ofNullable(properties);
		if (optional.isPresent())
			value = (String) properties.get(key);
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
		return value;
	}
	
	public String getPropertyValue(Object key,Object defaultValue) {
		String value = "";
		Optional<Properties> optional = Optional.ofNullable(properties);
		if (optional.isPresent()){
			value = properties.getProperty((String) key);
			if (value == null) {
				value = (String) defaultValue;
			}
		}
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
		return value;
	}
	public void setKeyValueData(String key,String value) throws FileNotFoundException, IOException {
		Optional<Properties> optional = Optional.ofNullable(properties);
		if (optional.isPresent()){
			properties.setProperty(key, value);
			properties.store(new FileOutputStream(filePath), "file is saved successfully");
		}
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
	}
	public void setKeyValueData(Object key,Object value) throws FileNotFoundException, IOException {
		Optional<Properties> optional = Optional.ofNullable(properties);
		if (optional.isPresent()){
			properties.put(key, value);
			properties.store(new FileOutputStream(filePath), "file is saved successfully");
		}
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
	}
	
	public void remove(String key) {
		Optional<Properties> optional = Optional.ofNullable(properties);
		if (optional.isPresent()){
			properties.remove(key);
		}
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
	}
	public void remove(String key,String value) {
		Optional<Properties> optional = Optional.ofNullable(properties);
		if (optional.isPresent()){
			properties.remove(key,value);
		}
		else
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
	}
	
	
	public Set<String> getAllKeys() {
		Set<Object> keys = properties.keySet();
		Set<String> set = new LinkedHashSet<String>();
		for(Object obj : keys)
		{
			String key = (String) obj;
			set.add(key);
		}
		return set;
	}
	
	public List<String> getAllValues()
	{
		Set<Object> keys = properties.keySet();
		List<String> list = new ArrayList<String>();
		for(Object obj : keys)
		{
			String key = (String) obj;
			String value = properties.getProperty(key);
			list.add(value);
		}
		return list;
	}
	
	public static void main(String[] args) throws IOException {	
		PropertiesReader pr = new PropertiesReader("E:\\MyWorkspace\\830amframeworks\\src\\com\\rameshsoft\\automation\\objectrepository\\OR_Gmial.properties");
		String un = pr.getPropertyValue("gmail_un_css");
		System.out.println(un);

		String un1 = pr.getPropertyValue("gmail_un_id123","PLZ PRACTICE");
		System.out.println(un1);
		
		Set<String> keys = pr.getAllKeys();
		System.out.println("Set: " +keys);
		
		List<String> values = pr.getAllValues();
		System.out.println("List: " +values);
		
		Map<String,String> kv = pr.getAllKeyValues();
		System.out.println("MAP: " +kv);		
	}
}

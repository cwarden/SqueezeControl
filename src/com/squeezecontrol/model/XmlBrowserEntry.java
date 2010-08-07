package com.squeezecontrol.model;

public class XmlBrowserEntry implements Browsable {

	public String id;
	public String name;
	public String type;
	public boolean hasItems;
	public String url;
	public String icon;
	public String title;
	public boolean isAudio;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return type + ":" + name;
	}
	
}

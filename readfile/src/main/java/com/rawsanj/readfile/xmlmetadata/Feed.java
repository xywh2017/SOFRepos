package com.rawsanj.readfile.xmlmetadata;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Feed
{
    private String title;

    private List<Entry> entry;
    
	@XmlElement
    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }
    
    @XmlElement
    public List<Entry> getEntry() {
		return entry;
	}

	public void setEntry(List<Entry> entry) {
		this.entry = entry;
	}
    
   
    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", entry = "+entry+"]";
    }
}

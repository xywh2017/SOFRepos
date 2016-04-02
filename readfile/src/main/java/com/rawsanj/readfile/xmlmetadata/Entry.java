package com.rawsanj.readfile.xmlmetadata;

public class Entry
{
    private String title;

    private Properties properties;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public Properties getProperties ()
    {
        return properties;
    }

    public void setProperties (Properties properties)
    {
        this.properties = properties;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", properties = "+properties+"]";
    }
}
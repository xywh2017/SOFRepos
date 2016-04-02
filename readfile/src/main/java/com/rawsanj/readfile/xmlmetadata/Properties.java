package com.rawsanj.readfile.xmlmetadata;

public class Properties
{
    private String id;

    private String mass;

    private String recclass;

    private String name;

    private String fall;

    private String year;

    private String reclong;

    private String reclat;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getMass ()
    {
        return mass;
    }

    public void setMass (String mass)
    {
        this.mass = mass;
    }

    public String getRecclass ()
    {
        return recclass;
    }

    public void setRecclass (String recclass)
    {
        this.recclass = recclass;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getFall ()
    {
        return fall;
    }

    public void setFall (String fall)
    {
        this.fall = fall;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    public String getReclong ()
    {
        return reclong;
    }

    public void setReclong (String reclong)
    {
        this.reclong = reclong;
    }

    public String getReclat ()
    {
        return reclat;
    }

    public void setReclat (String reclat)
    {
        this.reclat = reclat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", mass = "+mass+", recclass = "+recclass+", name = "+name+", fall = "+fall+", year = "+year+", reclong = "+reclong+", reclat = "+reclat+"]";
    }
}
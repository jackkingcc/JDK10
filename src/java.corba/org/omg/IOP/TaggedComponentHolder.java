package org.omg.IOP;

/**
* org/omg/IOP/TaggedComponentHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/src/java.corba/share/classes/org/omg/PortableInterceptor/IOP.idl
* Monday, March 26, 2018 at 6:17:13 PM Pacific Daylight Time
*/

public final class TaggedComponentHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedComponent value = null;

  public TaggedComponentHolder ()
  {
  }

  public TaggedComponentHolder (org.omg.IOP.TaggedComponent initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.TaggedComponentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.TaggedComponentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.TaggedComponentHelper.type ();
  }

}

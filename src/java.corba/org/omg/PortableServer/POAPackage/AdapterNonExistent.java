package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/AdapterNonExistent.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/src/java.corba/share/classes/org/omg/PortableServer/poa.idl
* Monday, March 26, 2018 at 6:17:20 PM Pacific Daylight Time
*/

public final class AdapterNonExistent extends org.omg.CORBA.UserException
{

  public AdapterNonExistent ()
  {
    super(AdapterNonExistentHelper.id());
  } // ctor


  public AdapterNonExistent (String $reason)
  {
    super(AdapterNonExistentHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterNonExistent

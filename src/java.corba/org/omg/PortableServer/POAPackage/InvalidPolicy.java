package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/InvalidPolicy.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/src/java.corba/share/classes/org/omg/PortableServer/poa.idl
* Monday, March 26, 2018 at 6:17:20 PM Pacific Daylight Time
*/

public final class InvalidPolicy extends org.omg.CORBA.UserException
{
  public short index = (short)0;

  public InvalidPolicy ()
  {
    super(InvalidPolicyHelper.id());
  } // ctor

  public InvalidPolicy (short _index)
  {
    super(InvalidPolicyHelper.id());
    index = _index;
  } // ctor


  public InvalidPolicy (String $reason, short _index)
  {
    super(InvalidPolicyHelper.id() + "  " + $reason);
    index = _index;
  } // ctor

} // class InvalidPolicy

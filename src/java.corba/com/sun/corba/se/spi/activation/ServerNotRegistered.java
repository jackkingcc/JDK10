package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerNotRegistered.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/src/java.corba/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, March 26, 2018 at 6:17:05 PM Pacific Daylight Time
*/

public final class ServerNotRegistered extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerNotRegistered ()
  {
    super(ServerNotRegisteredHelper.id());
  } // ctor

  public ServerNotRegistered (int _serverId)
  {
    super(ServerNotRegisteredHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerNotRegistered (String $reason, int _serverId)
  {
    super(ServerNotRegisteredHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerNotRegistered

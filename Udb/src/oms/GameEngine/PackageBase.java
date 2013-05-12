package oms.GameEngine;


public class PackageBase extends Object  {

// static fields
public static final int PACKAGEHEADSIZE = 0x10;
// direct methods

public PackageBase(){
	super();
}

public static byte GetInvalidLeng(byte[] headBuff){
	byte length = (byte)(((byte)(headBuff[3] * 0x80) + (byte)(headBuff[8] * 0x8)) + (byte)(headBuff[14] * 0x9));
	return length;
	//return length;
}

public static short GetPackageFactorA(byte[] headBuff){
	short Type = (short)(((headBuff[11] + headBuff[9]) * headBuff[8]) * headBuff[10]);
	return Type;
	//return Type;
}

}
package oms.GameEngine;


public class ACTStruct extends Object  {

// static fields
public static final int CENTERX = 0x2;
public static final int CENTERY = 0x2;
public static final int FILEINDEXADDR = 0x2;
public static final int FILENUM = 0x2;
public static final int RESID = 0x4;
public static final int SPRITEINDEXNUM = 0x4;
public static final int SPRITENUM = 0x4;
public static final int XHITL = 0x2;
public static final int XHITR = 0x2;
public static final int YHITD = 0x2;
public static final int YHITU = 0x2;
public static final int ZHITB = 0x2;
public static final int ZHITF = 0x2;
// instance fields
public int CenterX;
public int CenterY;
public int FileIndexAddr;
public int FileNum;
public int ResID;
public int SpriteIndexAddr;
public int SpriteNum;
public int XHitL;
public int XHitR;
public int YHitD;
public int YHitU;
public int ZHitB;
public int ZHitF;
// direct methods

public ACTStruct(){
	super();
	this.FileNum = 2;
	this.FileIndexAddr = 2;
	this.SpriteNum = 0 /* 0 */;
	this.SpriteIndexAddr = 0 /* 0 */;
	this.ResID = 0 /* 0 */;
	this.CenterX = 0 /* 0 */;
	this.CenterY = 0 /* 0 */;
	this.XHitL = 0 /* 0 */;
	this.XHitR = 0 /* 0 */;
	this.YHitU = 0 /* 0 */;
	this.YHitD = 0 /* 0 */;
	this.ZHitF = 0 /* 0 */;
	this.ZHitB = 0 /* 0 */;
}

}
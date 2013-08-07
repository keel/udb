package info.pharos.gameEngine;


public class SpriteDEF extends Object  {

// static fields
public static final int SPDepth00 = 0x0;
public static final int SPDepth01 = 0x1;
public static final int SPDepth02 = 0x2;
public static final int SPDepth03 = 0x3;
public static final int SPDepth04 = 0x4;
public static final int SPDepth05 = 0x5;
public static final int SPDepth06 = 0x6;
public static final int SPDepth07 = 0x7;
public static final int SPDepth08 = 0x8;
public static final int SPDepth09 = 0x9;
public static final int SPDepth0A = 0xa;
public static final int SPDepth0B = 0xb;
public static final int SPDepth0C = 0xc;
public static final int SPDepth0D = 0xd;
public static final int SPDepth0E = 0xe;
public static final int SPDepth0F = 0xf;
public static final int SPHFilp = 0x1;
public static final int SPVFilp = 0x2;
// instance fields
public short Alpha;
public float Rotate;
public short RotateX;
public short RotateY;
public float ScaleX;
public float ScaleY;
public int SpriteAttrib;
public short SpriteCenterX;
public short SpriteCenterY;
public short SpriteResID;
public int SpriteXVal;
public int SpriteYVal;
public int mPaintId;
public int mTransform;
// direct methods

public SpriteDEF(){
	super();
	this.SpriteCenterX = 0 /* 0 */;
	this.SpriteCenterY = 0 /* 0 */;
	this.Rotate = 0 /* 0 */;
	this.ScaleX = 1.0F;
	this.ScaleY = 1.0F;
	this.release();
}
// virtual methods

public void release(){
	this.SpriteResID = -1;
	this.SpriteXVal = 0 /* 0 */;
	this.SpriteYVal = 0 /* 0 */;
	this.SpriteAttrib = 0 /* 0 */;
	this.SpriteCenterX = 0 /* 0 */;
	this.SpriteCenterY = 0 /* 0 */;
	this.Rotate = 0 /* 0 */;
	this.ScaleX = 1.0F;
	this.ScaleY = 1.0F;
	this.Alpha = 255;
	this.RotateX = 0 /* 0 */;
	this.RotateY = 0 /* 0 */;
	this.mTransform = 0 /* 0 */;
	this.mPaintId = 0 /* 0 */;
	return;
}

}
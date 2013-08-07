package info.pharos.gameEngine;


public class TextDEF extends Object  {

// static fields
public static final int DDIR = 0x2;
public static final int HLOOP = 0x20;
public static final int LDIR = 0x4;
public static final int RDIR = 0x8;
public static final int TXDepth00 = 0x0;
public static final int TXDepth01 = 0x1;
public static final int TXDepth02 = 0x2;
public static final int TXDepth03 = 0x3;
public static final int TXDepth04 = 0x4;
public static final int TXDepth05 = 0x5;
public static final int TXDepth06 = 0x6;
public static final int TXDepth07 = 0x7;
public static final int TXDepth08 = 0x8;
public static final int TXDepth09 = 0x9;
public static final int TXDepth0A = 0xa;
public static final int TXDepth0B = 0xb;
public static final int TXDepth0C = 0xc;
public static final int TXDepth0D = 0xd;
public static final int TXDepth0E = 0xe;
public static final int TXDepth0F = 0xf;
public static final int TXLayer00 = 0x0;
public static final int TXLayer01 = 0x1;
public static final int TXLayer02 = 0x2;
public static final int TXLayer03 = 0x3;
public static final int TXLayer04 = 0x4;
public static final int TXLayer05 = 0x5;
public static final int TXLayer06 = 0x6;
public static final int TXLayer07 = 0x7;
public static final int TXLayer08 = 0x8;
public static final int TXLayer09 = 0x9;
public static final int TXLayer0A = 0xa;
public static final int TXLayer0B = 0xb;
public static final int TXLayer0C = 0xc;
public static final int TXLayer0D = 0xd;
public static final int TXLayer0E = 0xe;
public static final int TXLayer0F = 0xf;
public static final int TXLayerAll = 0x10;
public static final int UDIR = 0x1;
public static final int VLOOP = 0x10;
// instance fields
public short Alpha;
public float Rotate;
public float ScaleX;
public float ScaleY;
public android.graphics.Bitmap Text;
public int TextAttrib;
public int TextCtrl;
public int TextXInc;
public int TextXVal;
public int TextYInc;
public int TextYVal;
// direct methods

public TextDEF(){
	super();
	this.Rotate = 0 /* 0 */;
	this.ScaleX = 1.0F;
	this.ScaleY = 1.0F;
	this.Text = null /* 0 */;
	this.TextAttrib = 0 /* 0 */;
	this.TextCtrl = 0 /* 0 */;
	this.TextXVal = 0 /* 0 */;
	this.TextYVal = 0 /* 0 */;
	this.TextXInc = 0 /* 0 */;
	this.TextYInc = 0 /* 0 */;
	this.Alpha = 255;
	this.Rotate = 0 /* 0 */;
//	this.ScaleX = 0x3f80;
//	this.ScaleY = 0x3f80;
}

}
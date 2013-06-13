package oms.GameEngine;


public class TextManager extends Object  {

// static fields
private static oms.GameEngine.TextDEF[] Text;
// instance fields
private android.graphics.Matrix cMatrix;
private android.content.Context mContext;
private boolean mIsLogOut;
private long nCurBMPRamSize;
private int nTextLayerMax;
// direct methods

public TextManager(android.content.Context context,int TextLayer){
	super();
	this.mIsLogOut = true;
	this.nCurBMPRamSize = 0 /* 0 */;
	this.mContext = context;
	oms.GameEngine.TextManager.Text = null /* 0 */;
	this.nTextLayerMax = TextLayer;
	this.InitText(this.nTextLayerMax);
	;
	this.cMatrix = new android.graphics.Matrix();
	this.nCurBMPRamSize = 0 /* 0 */;
}

private int GetBitmapSize(android.graphics.Bitmap bitmap){
	int bit = 1;
	if (bitmap.getConfig() == android.graphics.Bitmap.Config.ALPHA_8) {
	bit = 1;
	// :cond_0
	} else {
	if (bitmap.getConfig() == android.graphics.Bitmap.Config.RGB_565) {
	bit = 2;
	// goto :goto_0
	} else {
	if (bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_4444) {
	bit = 2;
	// goto :goto_0
	} else {
	if (bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_8888) {
	bit = 4;
		}
		}
		}
		}
	// goto :goto_0
	// :goto_0
	;
	return (((bitmap.getWidth() * bitmap.getHeight()) * bit) + 0x80);
	//return (((bitmap.getWidth() * bitmap.getHeight()) * bit) + 0x80);
}
// virtual methods

public void CloseAllText(){
	int i = 0;
	while (i < this.nTextLayerMax) {
	this.CloseText(i);
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void CloseText(int TextLayer){
	if (TextLayer >= this.nTextLayerMax) {
	// :cond_0
	} else {
	if (oms.GameEngine.TextManager.Text[TextLayer].Text != null) {
	this.nCurBMPRamSize = (this.nCurBMPRamSize - (long)this.GetBitmapSize(oms.GameEngine.TextManager.Text[TextLayer].Text));
	oms.GameEngine.TextManager.Text[TextLayer].Text.recycle();
	oms.GameEngine.TextManager.Text[TextLayer].Text = null /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextAttrib = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextCtrl = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	if (this.mIsLogOut) {
	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
		}
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public long GetBMPRamSize(){
	;
	return this.nCurBMPRamSize;
	//return this.nCurBMPRamSize;
}

public int GetTextHeight(int TextLayer){
	if (oms.GameEngine.TextManager.Text[TextLayer].Text != null) {
	return oms.GameEngine.TextManager.Text[TextLayer].Text.getHeight();
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return oms.GameEngine.TextManager.Text[TextLayer].Text.getHeight();
}

public int GetTextWidth(int TextLayer){
	if (oms.GameEngine.TextManager.Text[TextLayer].Text != null) {
	return oms.GameEngine.TextManager.Text[TextLayer].Text.getWidth();
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return oms.GameEngine.TextManager.Text[TextLayer].Text.getWidth();
}

public int GetTextXVal(int TextLayer){
	;
	return oms.GameEngine.TextManager.Text[TextLayer].TextXVal;
	//return oms.GameEngine.TextManager.Text[TextLayer].TextXVal;
}

public int GetTextYVal(int TextLayer){
	;
	return oms.GameEngine.TextManager.Text[TextLayer].TextYVal;
	//return oms.GameEngine.TextManager.Text[TextLayer].TextYVal;
}

public void InitText(int TextLayerNum){
	this.nTextLayerMax = TextLayerNum;
	if (this.nTextLayerMax == 0) {
	this.nTextLayerMax = 1;
	// :cond_0
	}
	;
	oms.GameEngine.TextManager.Text = new oms.GameEngine.TextDEF[this.nTextLayerMax];
	int i = 0;
	while (i < this.nTextLayerMax) {
	;
	oms.GameEngine.TextManager.Text[i] = new oms.GameEngine.TextDEF();
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	return;
}

public void LoadPicture(int ResTextID,int TextLayer,int TextDepth){
	if (TextLayer >= this.nTextLayerMax) {
	// :cond_0
	} else {
	this.CloseText(TextLayer);
	android.graphics.Bitmap bmp = null;
	bmp = android.graphics.BitmapFactory.decodeResource(this.mContext.getResources(),ResTextID);
	if (bmp != null) {
	this.nCurBMPRamSize = (this.nCurBMPRamSize + (long)this.GetBitmapSize(bmp));
	if (this.mIsLogOut) {
	android.util.Log.v("GameEngine",new StringBuilder("ResID: ").append(ResTextID).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Width: ").append(bmp.getWidth()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Height: ").append(bmp.getHeight()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("OPtions: ").append(bmp.getConfig()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
	// :cond_2
	}
	oms.GameEngine.TextManager.Text[TextLayer].Text = bmp;
	oms.GameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].Alpha = 255;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleX = 0x3f80;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleY = 0x3f80;
	oms.GameEngine.TextManager.Text[TextLayer].Rotate = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextAttrib = TextDepth;
	oms.GameEngine.TextManager.Text[TextLayer].TextCtrl = 15;
		}
		}
	// goto/16 :goto_0
	// :goto_0
	return;
}

public void LoadText(int ResTextID,int TextLayer,int TextDepth){
	if (TextLayer >= this.nTextLayerMax) {
	// :cond_0
	} else {
	this.CloseText(TextLayer);
	android.graphics.Bitmap bmp = null;
	bmp = oms.GameEngine.PackageManager.loadPic(this.mContext,ResTextID);
	if (bmp != null) {
	this.nCurBMPRamSize = (this.nCurBMPRamSize + (long)this.GetBitmapSize(bmp));
	if (this.mIsLogOut) {
	android.util.Log.v("GameEngine",new StringBuilder("ResID: ").append(ResTextID).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Width: ").append(bmp.getWidth()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Height: ").append(bmp.getHeight()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("OPtions: ").append(bmp.getConfig()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
	// :cond_2
	}
	oms.GameEngine.TextManager.Text[TextLayer].Text = bmp;
	oms.GameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].Alpha = 255;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleX = 0x3f80;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleY = 0x3f80;
	oms.GameEngine.TextManager.Text[TextLayer].Rotate = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextAttrib = TextDepth;
	oms.GameEngine.TextManager.Text[TextLayer].TextCtrl = 15;
		}
		}
	// goto/16 :goto_0
	// :goto_0
	return;
}

public void LoadText(int Width,int Height,int TextLayer,int TextDepth){
	if (oms.GameEngine.TextManager.Text[TextLayer].Text != null) {
	oms.GameEngine.TextManager.Text[TextLayer].Text.recycle();
	oms.GameEngine.TextManager.Text[TextLayer].Text = null /* 0 */;
	// :cond_0
	}
	android.graphics.Bitmap bmp = null;
	bmp = android.graphics.Bitmap.createBitmap(Width,Height,android.graphics.Bitmap.Config.ARGB_8888);
	if (TextLayer < this.nTextLayerMax) {
	this.nCurBMPRamSize = (this.nCurBMPRamSize + (long)this.GetBitmapSize(bmp));
	if (this.mIsLogOut) {
	android.util.Log.v("GameEngine","ResID: 0");
	android.util.Log.v("GameEngine",new StringBuilder("Width: ").append(bmp.getWidth()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Height: ").append(bmp.getHeight()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("OPtions: ").append(bmp.getConfig()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
	// :cond_1
	}
	oms.GameEngine.TextManager.Text[TextLayer].Text = bmp;
	oms.GameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].Alpha = 255;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleX = 0x3f80;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleY = 0x3f80;
	oms.GameEngine.TextManager.Text[TextLayer].Rotate = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextAttrib = TextDepth;
	oms.GameEngine.TextManager.Text[TextLayer].TextCtrl = 15;
	// :cond_2
	}
	return;
}

public void LoadText(String sResPath,int TextLayer,int TextDepth){
	if (TextLayer >= this.nTextLayerMax) {
	// :cond_0
	return;
	} else {
	if (oms.GameEngine.TextManager.Text[TextLayer].Text != null) {
	oms.GameEngine.TextManager.Text[TextLayer].Text.recycle();
	oms.GameEngine.TextManager.Text[TextLayer].Text = null /* 0 */;
	// :cond_2
	}
	android.graphics.Bitmap bmp = null;
	java.io.InputStream inputStream = null;
	android.content.res.AssetManager am = this.mContext.getAssets();
	try {
		inputStream = am.open(sResPath);
	//end of try
	} catch (java.io.IOException e) {
		;
		e.printStackTrace();
			//}
	} //end of catch: goto/16 :goto_1
	// :goto_1
	if (inputStream != null) {
	bmp = android.graphics.BitmapFactory.decodeStream(inputStream);
	try {
	inputStream.close();
	//end of try
	} catch (java.io.IOException e) {
		
		e.printStackTrace();
			//}
	} //end of catch: goto/16 :goto_2
	// :goto_2
	if (bmp != null) {
	this.nCurBMPRamSize = (this.nCurBMPRamSize + (long)this.GetBitmapSize(bmp));
	if (this.mIsLogOut) {
	android.util.Log.v("GameEngine","ResID: 0");
	android.util.Log.v("GameEngine",new StringBuilder("Width: ").append(bmp.getWidth()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Height: ").append(bmp.getHeight()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("OPtions: ").append(bmp.getConfig()).toString());
	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
	// :cond_3
	}
	oms.GameEngine.TextManager.Text[TextLayer].Text = bmp;
	oms.GameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].Alpha = 255;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleX = 0x3f80;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleY = 0x3f80;
	oms.GameEngine.TextManager.Text[TextLayer].Rotate = 0 /* 0 */;
	oms.GameEngine.TextManager.Text[TextLayer].TextAttrib = TextDepth;
	oms.GameEngine.TextManager.Text[TextLayer].TextCtrl = 15;
		}
	// goto/16 :goto_0
	}
	}
	//[OTHER] end local v2           #e:Ljava/io/IOException;
	
}

	public void OnDraw(android.graphics.Canvas canvas, int Attrib, int XOff,
			int YOff, android.graphics.Paint paint) {
		int i = 0;
		while (i < this.nTextLayerMax) {
			if (oms.GameEngine.TextManager.Text[i].Text != null
					&& oms.GameEngine.TextManager.Text[i].TextAttrib == Attrib) {
				paint.setAlpha((oms.GameEngine.TextManager.Text[i].Alpha & 0xff));
				if ((oms.GameEngine.TextManager.Text[i].ScaleX - 0x3f80) == 0) {
					if ((oms.GameEngine.TextManager.Text[i].ScaleY - 0x3f80) == 0) {
						if ((oms.GameEngine.TextManager.Text[i].Rotate - 0) == 0) {
							canvas.drawBitmap(
									oms.GameEngine.TextManager.Text[i].Text,
									((float) oms.GameEngine.TextManager.Text[i].TextXVal + (float) XOff),
									((float) oms.GameEngine.TextManager.Text[i].TextYVal + (float) YOff),
									paint);
							// :cond_1
						}
						// :cond_2
					}
				}
				this.cMatrix.reset();
				int XVal = (oms.GameEngine.TextManager.Text[i].TextXVal + XOff);
				int YVal = (oms.GameEngine.TextManager.Text[i].TextYVal + YOff);
				this.cMatrix.setTranslate((float) XVal, (float) YVal);
				this.cMatrix.postRotate(
						oms.GameEngine.TextManager.Text[i].Rotate,
						(float) (oms.GameEngine.TextManager.Text[i].Text
								.getWidth() >> 0x1),
						(float) (oms.GameEngine.TextManager.Text[i].Text
								.getHeight() >> 0x1));
				if ((oms.GameEngine.TextManager.Text[i].ScaleX - 0x3f80) == 0 || (oms.GameEngine.TextManager.Text[i].ScaleY - 0x3f80) == 0) {
						// :cond_3
					this.cMatrix.postScale(
							oms.GameEngine.TextManager.Text[i].ScaleX,
							oms.GameEngine.TextManager.Text[i].ScaleY);
					// :cond_4
				}
				canvas.drawBitmap(oms.GameEngine.TextManager.Text[i].Text,
						this.cMatrix, paint);
				// goto :goto_1
			}
			i = (i + 0x1);
			// goto :goto_0
			// :cond_0
		}
		return;
	}

public void OnDraw(android.graphics.Canvas canvas,int Attrib,android.graphics.Paint paint){
	int i = 0;
	while (i < this.nTextLayerMax) {
	if (oms.GameEngine.TextManager.Text[i].Text != null && oms.GameEngine.TextManager.Text[i].TextAttrib == Attrib) {
	canvas.drawBitmap(oms.GameEngine.TextManager.Text[i].Text,(float)oms.GameEngine.TextManager.Text[i].TextXVal,(float)oms.GameEngine.TextManager.Text[i].TextYVal,paint);
	// :cond_1
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

public void ScrollText(int TextLayer){
	if (TextLayer < this.nTextLayerMax) {
	if (oms.GameEngine.TextManager.Text[TextLayer].Text == null) {
	// :cond_0
	// :cond_1
	}
	int ScreenWidth = oms.GameEngine.GameCanvas.GetScreenWidth();
	int ScreenHeight = oms.GameEngine.GameCanvas.GetScreenHeight();
	int Width = oms.GameEngine.TextManager.Text[TextLayer].Text.getWidth();
	int Height = oms.GameEngine.TextManager.Text[TextLayer].Text.getHeight();
	int TextCtrl = oms.GameEngine.TextManager.Text[TextLayer].TextCtrl;
	if (oms.GameEngine.TextManager.Text[TextLayer].TextXInc < 0 && (TextCtrl & 0x4) == 4) {
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = (oms.GameEngine.TextManager.Text[TextLayer].TextXVal - oms.GameEngine.TextManager.Text[TextLayer].TextXInc);
	if (oms.GameEngine.TextManager.Text[TextLayer].TextXVal >= 0) {
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	// :cond_2
	}
	}
	if (oms.GameEngine.TextManager.Text[TextLayer].TextXInc > 0 && (TextCtrl & 0x8) == 8) {
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = (oms.GameEngine.TextManager.Text[TextLayer].TextXVal - oms.GameEngine.TextManager.Text[TextLayer].TextXInc);
	if ((oms.GameEngine.TextManager.Text[TextLayer].TextXVal + ScreenWidth) >= Width) {
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = (ScreenWidth - Width);
	// :cond_3
	}
	}
	if (oms.GameEngine.TextManager.Text[TextLayer].TextYInc < 0 && (TextCtrl & 0x1) == 1) {
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = (oms.GameEngine.TextManager.Text[TextLayer].TextYVal - oms.GameEngine.TextManager.Text[TextLayer].TextYInc);
	if (oms.GameEngine.TextManager.Text[TextLayer].TextXVal >= 0) {
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	// :cond_4
	}
	}
	if (oms.GameEngine.TextManager.Text[TextLayer].TextYInc <= 0 || (TextCtrl & 0x2) != 2) {
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = (oms.GameEngine.TextManager.Text[TextLayer].TextYVal - oms.GameEngine.TextManager.Text[TextLayer].TextYInc);
	if ((oms.GameEngine.TextManager.Text[TextLayer].TextYVal + ScreenHeight) >= Height) {
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = (ScreenHeight - Height);
		}
		}
	// goto/16 :goto_0
	return;
		}
}

public void SetBMPSizeOut(boolean out){
	this.mIsLogOut = out;
	return;
}

public void SetTextAlpha(int TextLayer,int Alpha){
	oms.GameEngine.TextManager.Text[TextLayer].Alpha = (short)(Alpha & 0xff);
	return;
}

public void SetTextInc(int TextLayer,int XInc,int YInc){
	if (TextLayer < this.nTextLayerMax) {
	oms.GameEngine.TextManager.Text[TextLayer].TextXInc = XInc;
	oms.GameEngine.TextManager.Text[TextLayer].TextYInc = YInc;
	// :cond_0
	}
	return;
}

public void SetTextRotate(int TextLayer,float Rotate){
	if ((Rotate - 0) > 0) {
	oms.GameEngine.TextManager.Text[TextLayer].Rotate = Rotate;
	// :cond_0
	}
	return;
}

public void SetTextScale(int TextLayer,float Scale){
	if ((Scale - 0) > 0) {
	oms.GameEngine.TextManager.Text[TextLayer].ScaleX = Scale;
	oms.GameEngine.TextManager.Text[TextLayer].ScaleY = Scale;
	// :cond_0
	}
	return;
}

public void SetTextXVal(int TextLayer,int X){
	oms.GameEngine.TextManager.Text[TextLayer].TextXVal = X;
	return;
}

public void SetTextYVal(int TextLayer,int Y){
	oms.GameEngine.TextManager.Text[TextLayer].TextYVal = Y;
	return;
}

public int getTextLayer(){
	;
	return this.nTextLayerMax;
	//return this.nTextLayerMax;
}

public boolean getTextPixels(int TextLayer,int[] pixels){
	if (TextLayer >= this.nTextLayerMax) {
	;
	return false /* 0 */;
	} else {
	if (oms.GameEngine.TextManager.Text[TextLayer].Text == null) {
	;
	return false /* 0 */;
	// goto :goto_0
	} else {
	int width = oms.GameEngine.TextManager.Text[TextLayer].Text.getWidth();
	int height = oms.GameEngine.TextManager.Text[TextLayer].Text.getHeight();
	oms.GameEngine.TextManager.Text[TextLayer].Text.getPixels(pixels,0,width,0,0,width,height);
	;
	return true /* 1 */;
		}
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public void release(){
	this.CloseAllText();
	return;
}

public void setTextPixels(int TextLayer,int[] pixels){
	if (TextLayer >= this.nTextLayerMax) {
	// :cond_0
	} else {
	if (oms.GameEngine.TextManager.Text[TextLayer].Text != null) {
	int width = oms.GameEngine.TextManager.Text[TextLayer].Text.getWidth();
	int height = oms.GameEngine.TextManager.Text[TextLayer].Text.getHeight();
	oms.GameEngine.TextManager.Text[TextLayer].Text.setPixels(pixels,0,width,0,0,width,height);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void setTextPixels(int TextLayer,int[] pixels,int offset,int x,int y,int width,int height){
	if (TextLayer >= this.nTextLayerMax) {
	// :cond_0
	} else {
	if (oms.GameEngine.TextManager.Text[TextLayer].Text != null) {
	int BMPWidth = oms.GameEngine.TextManager.Text[TextLayer].Text.getWidth();
	oms.GameEngine.TextManager.Text[TextLayer].Text.setPixels(pixels,offset,BMPWidth,x,y,width,height);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void setTextPixels(int TextLayer,int[] pixels,int offset,int stride,int x,int y,int width,int height){
	if (TextLayer >= this.nTextLayerMax) {
	// :cond_0
	} else {
	if (oms.GameEngine.TextManager.Text[TextLayer].Text != null) {
	oms.GameEngine.TextManager.Text[TextLayer].Text.setPixels(pixels,offset,stride,x,y,width,height);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

}
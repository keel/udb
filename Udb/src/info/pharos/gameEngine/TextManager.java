package info.pharos.gameEngine;


public class TextManager extends Object  {

// static fields
private static info.pharos.gameEngine.TextDEF[] Text;
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
	info.pharos.gameEngine.TextManager.Text = null /* 0 */;
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
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text != null) {
	this.nCurBMPRamSize = (this.nCurBMPRamSize - (long)this.GetBitmapSize(info.pharos.gameEngine.TextManager.Text[TextLayer].Text));
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text.recycle();
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text = null /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextAttrib = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextCtrl = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	if (this.mIsLogOut) {
	//android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
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
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text != null) {
	return info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getHeight();
	} else {
	;
	return 0 /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return oms.GameEngine.TextManager.Text[TextLayer].Text.getHeight();
}

public int GetTextWidth(int TextLayer){
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text != null) {
	return info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getWidth();
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
	return info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal;
	//return oms.GameEngine.TextManager.Text[TextLayer].TextXVal;
}

public int GetTextYVal(int TextLayer){
	;
	return info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal;
	//return oms.GameEngine.TextManager.Text[TextLayer].TextYVal;
}

public void InitText(int TextLayerNum){
	this.nTextLayerMax = TextLayerNum;
	if (this.nTextLayerMax == 0) {
	this.nTextLayerMax = 1;
	// :cond_0
	}
	;
	info.pharos.gameEngine.TextManager.Text = new info.pharos.gameEngine.TextDEF[this.nTextLayerMax];
	int i = 0;
	while (i < this.nTextLayerMax) {
	;
	info.pharos.gameEngine.TextManager.Text[i] = new info.pharos.gameEngine.TextDEF();
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
//	android.util.Log.v("GameEngine",new StringBuilder("ResID: ").append(ResTextID).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Width: ").append(bmp.getWidth()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Height: ").append(bmp.getHeight()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("OPtions: ").append(bmp.getConfig()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
	// :cond_2
	}
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text = bmp;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].Alpha = 255;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleX = 1.0F;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleY = 1.0F;
	info.pharos.gameEngine.TextManager.Text[TextLayer].Rotate = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextAttrib = TextDepth;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextCtrl = 15;
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
	bmp = info.pharos.gameEngine.PackageManager.loadPic(this.mContext,ResTextID);
	if (bmp != null) {
	this.nCurBMPRamSize = (this.nCurBMPRamSize + (long)this.GetBitmapSize(bmp));
	if (this.mIsLogOut) {
//	android.util.Log.v("GameEngine",new StringBuilder("ResID: ").append(ResTextID).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Width: ").append(bmp.getWidth()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Height: ").append(bmp.getHeight()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("OPtions: ").append(bmp.getConfig()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
	// :cond_2
	}
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text = bmp;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].Alpha = 255;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleX = 1.0F;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleY = 1.0F;
	info.pharos.gameEngine.TextManager.Text[TextLayer].Rotate = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextAttrib = TextDepth;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextCtrl = 15;
		}
		}
	// goto/16 :goto_0
	// :goto_0
	return;
}

public void LoadText(int Width,int Height,int TextLayer,int TextDepth){
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text != null) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text.recycle();
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text = null /* 0 */;
	// :cond_0
	}
	android.graphics.Bitmap bmp = null;
	bmp = android.graphics.Bitmap.createBitmap(Width,Height,android.graphics.Bitmap.Config.ARGB_8888);
	if (TextLayer < this.nTextLayerMax) {
	this.nCurBMPRamSize = (this.nCurBMPRamSize + (long)this.GetBitmapSize(bmp));
	if (this.mIsLogOut) {
//	android.util.Log.v("GameEngine","ResID: 0");
//	android.util.Log.v("GameEngine",new StringBuilder("Width: ").append(bmp.getWidth()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Height: ").append(bmp.getHeight()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("OPtions: ").append(bmp.getConfig()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
	// :cond_1
	}
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text = bmp;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].Alpha = 255;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleX = 1.0F;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleY = 1.0F;
	info.pharos.gameEngine.TextManager.Text[TextLayer].Rotate = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextAttrib = TextDepth;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextCtrl = 15;
	// :cond_2
	}
	return;
}

public void LoadText(String sResPath,int TextLayer,int TextDepth){
	if (TextLayer >= this.nTextLayerMax) {
	// :cond_0
	return;
	} else {
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text != null) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text.recycle();
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text = null /* 0 */;
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
//	android.util.Log.v("GameEngine","ResID: 0");
//	android.util.Log.v("GameEngine",new StringBuilder("Width: ").append(bmp.getWidth()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Height: ").append(bmp.getHeight()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("OPtions: ").append(bmp.getConfig()).toString());
//	android.util.Log.v("GameEngine",new StringBuilder("Text use RAM: ").append((this.nCurBMPRamSize / 1024)).append(" KBytes").toString());
	// :cond_3
	}
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text = bmp;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].Alpha = 255;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleX = 1.0F;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleY = 1.0F;
	info.pharos.gameEngine.TextManager.Text[TextLayer].Rotate = 0 /* 0 */;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextAttrib = TextDepth;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextCtrl = 15;
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
			if (info.pharos.gameEngine.TextManager.Text[i].Text != null
					&& info.pharos.gameEngine.TextManager.Text[i].TextAttrib == Attrib) {
				paint.setAlpha((info.pharos.gameEngine.TextManager.Text[i].Alpha & 0xff));
				if ((info.pharos.gameEngine.TextManager.Text[i].ScaleX - 1.0F) == 0) {
					if ((info.pharos.gameEngine.TextManager.Text[i].ScaleY - 1.0F) == 0) {
						if ((info.pharos.gameEngine.TextManager.Text[i].Rotate - 0) == 0) {
							canvas.drawBitmap(
									info.pharos.gameEngine.TextManager.Text[i].Text,
									((float) info.pharos.gameEngine.TextManager.Text[i].TextXVal + (float) XOff),
									((float) info.pharos.gameEngine.TextManager.Text[i].TextYVal + (float) YOff),
									paint);
							// :cond_1
						}
						// :cond_2
					}
				}
				this.cMatrix.reset();
				int XVal = (info.pharos.gameEngine.TextManager.Text[i].TextXVal + XOff);
				int YVal = (info.pharos.gameEngine.TextManager.Text[i].TextYVal + YOff);
				this.cMatrix.setTranslate((float) XVal, (float) YVal);
				this.cMatrix.postRotate(
						info.pharos.gameEngine.TextManager.Text[i].Rotate,
						(float) (info.pharos.gameEngine.TextManager.Text[i].Text
								.getWidth() >> 0x1),
						(float) (info.pharos.gameEngine.TextManager.Text[i].Text
								.getHeight() >> 0x1));
				if ((info.pharos.gameEngine.TextManager.Text[i].ScaleX - 1.0F) == 0 || (info.pharos.gameEngine.TextManager.Text[i].ScaleY - 1.0F) == 0) {
						// :cond_3
					this.cMatrix.postScale(
							info.pharos.gameEngine.TextManager.Text[i].ScaleX,
							info.pharos.gameEngine.TextManager.Text[i].ScaleY);
					// :cond_4
				}
				canvas.drawBitmap(info.pharos.gameEngine.TextManager.Text[i].Text,
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
	if (info.pharos.gameEngine.TextManager.Text[i].Text != null && info.pharos.gameEngine.TextManager.Text[i].TextAttrib == Attrib) {
	canvas.drawBitmap(info.pharos.gameEngine.TextManager.Text[i].Text,(float)info.pharos.gameEngine.TextManager.Text[i].TextXVal,(float)info.pharos.gameEngine.TextManager.Text[i].TextYVal,paint);
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
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text == null) {
	// :cond_0
	// :cond_1
	}
	int ScreenWidth = info.pharos.gameEngine.GameCanvas.GetScreenWidth();
	int ScreenHeight = info.pharos.gameEngine.GameCanvas.GetScreenHeight();
	int Width = info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getWidth();
	int Height = info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getHeight();
	int TextCtrl = info.pharos.gameEngine.TextManager.Text[TextLayer].TextCtrl;
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc < 0 && (TextCtrl & 0x4) == 4) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = (info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal - info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc);
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal >= 0) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = 0 /* 0 */;
	// :cond_2
	}
	}
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc > 0 && (TextCtrl & 0x8) == 8) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = (info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal - info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc);
	if ((info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal + ScreenWidth) >= Width) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = (ScreenWidth - Width);
	// :cond_3
	}
	}
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc < 0 && (TextCtrl & 0x1) == 1) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = (info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal - info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc);
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal >= 0) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = 0 /* 0 */;
	// :cond_4
	}
	}
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc <= 0 || (TextCtrl & 0x2) != 2) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = (info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal - info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc);
	if ((info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal + ScreenHeight) >= Height) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = (ScreenHeight - Height);
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
	info.pharos.gameEngine.TextManager.Text[TextLayer].Alpha = (short)(Alpha & 0xff);
	return;
}

public void SetTextInc(int TextLayer,int XInc,int YInc){
	if (TextLayer < this.nTextLayerMax) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXInc = XInc;
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYInc = YInc;
	// :cond_0
	}
	return;
}

public void SetTextRotate(int TextLayer,float Rotate){
	if ((Rotate - 0) > 0) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].Rotate = Rotate;
	// :cond_0
	}
	return;
}

public void SetTextScale(int TextLayer,float Scale){
	if ((Scale - 0) > 0) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleX = Scale;
	info.pharos.gameEngine.TextManager.Text[TextLayer].ScaleY = Scale;
	// :cond_0
	}
	return;
}

public void SetTextXVal(int TextLayer,int X){
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextXVal = X;
	return;
}

public void SetTextYVal(int TextLayer,int Y){
	info.pharos.gameEngine.TextManager.Text[TextLayer].TextYVal = Y;
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
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text == null) {
	;
	return false /* 0 */;
	// goto :goto_0
	} else {
	int width = info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getWidth();
	int height = info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getHeight();
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getPixels(pixels,0,width,0,0,width,height);
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
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text != null) {
	int width = info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getWidth();
	int height = info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getHeight();
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text.setPixels(pixels,0,width,0,0,width,height);
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
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text != null) {
	int BMPWidth = info.pharos.gameEngine.TextManager.Text[TextLayer].Text.getWidth();
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text.setPixels(pixels,offset,BMPWidth,x,y,width,height);
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
	if (info.pharos.gameEngine.TextManager.Text[TextLayer].Text != null) {
	info.pharos.gameEngine.TextManager.Text[TextLayer].Text.setPixels(pixels,offset,stride,x,y,width,height);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

}

package info.pharos.gameEngine;

import android.R;


public class GameCanvas extends Object  {

// static fields
public static final int ORIENATION_LEFT = 0x1;
public static final int ORIENATION_NORMAL = 0x0;
public static final int ORIENATION_RIGHT = 0x2;
public static final int ORIENATION_UPSIDE_DOWN = 0x3;
public static final int PAINT_MAX = 0xa;
private static info.pharos.gameEngine.SpriteManager SpriteMgr;
private static info.pharos.gameEngine.TextManager TextMgr;
public static android.graphics.Paint[] cPaint;
private static float fRotate;
private static int nBackXOff;
private static int nBackYOff;
private static int nMaxLogicLayer;
private static int nScreenHeight;
private static int nScreenWidth;
public static int nScreenXOff;
public static int nScreenYOff;
private static int nSpriteXOff;
private static int nSpriteYOff;
private static android.graphics.Rect nViewRc;
private static android.graphics.Paint paint;
// instance fields
public boolean bUpdate;
private info.pharos.gameEngine.CCUserView cUserView;
private android.content.Context mContext;
private boolean mFirstOpen;
public int nScreenAlpha;
public int nScreenOrientation;
// direct methods

static{
	;
	info.pharos.gameEngine.GameCanvas.paint = new android.graphics.Paint();
	info.pharos.gameEngine.GameCanvas.fRotate = 0 /* 0 */;
	info.pharos.gameEngine.GameCanvas.nMaxLogicLayer = 8;
}

public GameCanvas(android.content.Context context,int TextLayer,int SpriteResNum,int SpriteNum){
	super();
	this.cUserView = null /* 0 */;
	this.mContext = context;
	info.pharos.gameEngine.GameCanvas.nViewRc = null /* 0 */;
	info.pharos.gameEngine.GameCanvas.SpriteMgr = null /* 0 */;
	info.pharos.gameEngine.GameCanvas.TextMgr = null /* 0 */;
	this.nScreenAlpha = 0 /* 0 */;
	this.bUpdate = false /* 0 */;
	info.pharos.gameEngine.GameCanvas.nBackXOff = 0 /* 0 */;
	info.pharos.gameEngine.GameCanvas.nBackYOff = 0 /* 0 */;
	info.pharos.gameEngine.GameCanvas.nSpriteXOff = 0 /* 0 */;
	info.pharos.gameEngine.GameCanvas.nSpriteYOff = 0 /* 0 */;
	info.pharos.gameEngine.GameCanvas.nScreenXOff = 0 /* 0 */;
	info.pharos.gameEngine.GameCanvas.nScreenYOff = 0 /* 0 */;
	this.mFirstOpen = false /* 0 */;
	this.SetScreenSize(320,480);
	this.SetViewRect(-120,-90,120,90);
	;
	info.pharos.gameEngine.GameCanvas.SpriteMgr = new info.pharos.gameEngine.SpriteManager(this.mContext,SpriteResNum,SpriteNum);
	;
	info.pharos.gameEngine.GameCanvas.TextMgr = new info.pharos.gameEngine.TextManager(this.mContext,TextLayer);
	this.InitPaint();
	this.nScreenOrientation = 0 /* 0 */;
}

public static int GetScreenHeight(){
	;
	return info.pharos.gameEngine.GameCanvas.nScreenHeight;
	//return oms.GameEngine.GameCanvas.nScreenHeight;
}

public static int GetScreenWidth(){
	;
	return info.pharos.gameEngine.GameCanvas.nScreenWidth;
	//return oms.GameEngine.GameCanvas.nScreenWidth;
}

public static android.graphics.Rect GetViewRect(){
	;
	return info.pharos.gameEngine.GameCanvas.nViewRc;
	//return oms.GameEngine.GameCanvas.nViewRc;
}

public static void Rotate(float angle){
	info.pharos.gameEngine.GameCanvas.fRotate = angle;
	return;
}

public static float getRotate(){
	;
	return info.pharos.gameEngine.GameCanvas.fRotate;
	//return oms.GameEngine.GameCanvas.fRotate;
}
// virtual methods

public boolean CHKACTTouch(int SACTName,int SXVal,int SYVal,int DACTName,int DXVal,int DYVal){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.CHKACTTouch(SACTName,SXVal,SYVal,DACTName,DXVal,DYVal);
	//return oms.GameEngine.GameCanvas.SpriteMgr.CHKACTTouch(SACTName,SXVal,SYVal,DACTName,DXVal,DYVal);
}

public boolean CHKACTTouch(int SXVal,int SYVal,int SXHitL,int SXHitR,int SYHitU,int SYHitD,int DACTName,int DXVal,int DYVal){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.CHKACTTouch(SXVal,SYVal,SXHitL,SXHitR,SYHitU,SYHitD,DACTName,DXVal,DYVal);
	//return oms.GameEngine.GameCanvas.SpriteMgr.CHKACTTouch(SXVal,SYVal,SXHitL,SXHitR,SYHitU,SYHitD,DACTName,DXVal,DYVal);
}

public void ClearACT(){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	} else {
	info.pharos.gameEngine.GameCanvas.SpriteMgr.ClearACT();
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CloseAllText(){
	info.pharos.gameEngine.GameCanvas.TextMgr.CloseAllText();
	return;
}

public void CloseText(int TextLayer){
	info.pharos.gameEngine.GameCanvas.TextMgr.CloseText(TextLayer);
	return;
}

public void FreeACT(int ACTLibId){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	} else {
	info.pharos.gameEngine.GameCanvas.SpriteMgr.FreeACT(ACTLibId);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void FreeACT(int ACTLibId,int ACTFrameID){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	} else {
	info.pharos.gameEngine.GameCanvas.SpriteMgr.FreeACT(ACTLibId,ACTFrameID);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void FreeAllACT(){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	} else {
	info.pharos.gameEngine.GameCanvas.SpriteMgr.FreeAllACT();
		}
	// goto :goto_0
	// :goto_0
	return;
}

public int GetACTCount(int ACTId,int ACTFileName){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetACTCount(ACTId,ACTFileName);
	//return oms.GameEngine.GameCanvas.SpriteMgr.GetACTCount(ACTId,ACTFileName);
}

public android.graphics.Bitmap GetSpriteBitmap(int resId){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	;
	return null /* 0 */;
	} else {
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetSpriteBitmap(resId);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public long GetSpriteRamSize(){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetBMPRamSize();
	//return oms.GameEngine.GameCanvas.SpriteMgr.GetBMPRamSize();
}

public long GetSpriteSegSize(int ACTLibIdx){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetSpriteSegSize(ACTLibIdx);
	//return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteSegSize(ACTLibIdx);
}

public int GetSpriteXHitL(int SpriteID){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetSpriteXHitL(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteXHitR(int SpriteID){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetSpriteXHitR(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteYHitD(int SpriteID){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetSpriteYHitD(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteYHitU(int SpriteID){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetSpriteYHitU(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteZHitB(int SpriteID){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetSpriteZHitB(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteZHitF(int SpriteID){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.GetSpriteZHitF(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetTextHeight(int TextLayer){
	return info.pharos.gameEngine.GameCanvas.TextMgr.GetTextHeight(TextLayer);
	//return oms.GameEngine.GameCanvas.TextMgr.GetTextHeight(TextLayer);
}

public long GetTextRamSize(){
	return info.pharos.gameEngine.GameCanvas.TextMgr.GetBMPRamSize();
	//return oms.GameEngine.GameCanvas.TextMgr.GetBMPRamSize();
}

public int GetTextWidth(int TextLayer){
	return info.pharos.gameEngine.GameCanvas.TextMgr.GetTextWidth(TextLayer);
	//return oms.GameEngine.GameCanvas.TextMgr.GetTextWidth(TextLayer);
}

public int GetTextXVal(int TextLayer){
	return info.pharos.gameEngine.GameCanvas.TextMgr.GetTextXVal(TextLayer);
	//return oms.GameEngine.GameCanvas.TextMgr.GetTextXVal(TextLayer);
}

public int GetTextYVal(int TextLayer){
	return info.pharos.gameEngine.GameCanvas.TextMgr.GetTextYVal(TextLayer);
	//return oms.GameEngine.GameCanvas.TextMgr.GetTextYVal(TextLayer);
}

public void InitACT(int ACTId,int ACTFileName){
	info.pharos.gameEngine.GameCanvas.SpriteMgr.InitACT(ACTId,ACTFileName);
	return;
}

public void InitPaint(){
	;
	info.pharos.gameEngine.GameCanvas.cPaint = new android.graphics.Paint[10];
	int i = 0;
	while (i < 10) {
	info.pharos.gameEngine.GameCanvas.cPaint[i] = null /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	;
	info.pharos.gameEngine.GameCanvas.cPaint[0] = new android.graphics.Paint();
	return;
}

public void LoadACT(int ACTLibId,int ACTFrameId,int ACTFileName){
	info.pharos.gameEngine.GameCanvas.SpriteMgr.LoadACT(ACTLibId,ACTFrameId,ACTFileName);
	return;
}

public void LoadACT(int ACTLibId,int ACTFrameBeg,int ACTFrameEnd,int ACTFileName){
	info.pharos.gameEngine.GameCanvas.SpriteMgr.LoadACT(ACTLibId,ACTFrameBeg,ACTFrameEnd,ACTFileName);
	return;
}

public boolean LoadACT(int ACTId,int ACTFileName){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.LoadACT(ACTId,ACTFileName);
	//return oms.GameEngine.GameCanvas.SpriteMgr.LoadACT(ACTId,ACTFileName);
}

public void LoadPicture(int ResTextID,int TextLayer,int TextDepth){
	info.pharos.gameEngine.GameCanvas.TextMgr.LoadPicture(ResTextID,TextLayer,TextDepth);
	return;
}

public void LoadText(int ResTextID,int TextLayer,int TextDepth){
	info.pharos.gameEngine.GameCanvas.TextMgr.LoadText(ResTextID,TextLayer,TextDepth);
	return;
}

public void LoadText(int Width,int Height,int TextLayer,int TextDepth){
	info.pharos.gameEngine.GameCanvas.TextMgr.LoadText(Width,Height,TextLayer,TextDepth);
	return;
}

public void ScrollText(int TextLayer){
	info.pharos.gameEngine.GameCanvas.TextMgr.ScrollText(TextLayer);
	return;
}

public void SetACTLibBeg(int beg){
	info.pharos.gameEngine.GameCanvas.SpriteMgr.SetACTLibBeg(beg);
	return;
}

public void SetBackgroundDrawOffset(int XOff,int YOff){
	info.pharos.gameEngine.GameCanvas.nBackXOff = XOff;
	info.pharos.gameEngine.GameCanvas.nBackYOff = YOff;
	return;
}

public void SetLogOut(boolean sprite,boolean text){
	info.pharos.gameEngine.GameCanvas.SpriteMgr.SetBMPSizeOut(sprite);
	info.pharos.gameEngine.GameCanvas.TextMgr.SetBMPSizeOut(text);
	return;
}

public void SetMaxLogicLayer(int Layer){
	info.pharos.gameEngine.GameCanvas.nMaxLogicLayer = Layer;
	return;
}

public void SetPaint(int paintId,android.graphics.Paint paint){
	info.pharos.gameEngine.GameCanvas.cPaint[paintId] = paint;
	return;
}

public void SetPaintId(int spriteId,int paintId){
	info.pharos.gameEngine.GameCanvas.SpriteMgr.SetPaintId(spriteId,paintId);
	return;
}

public void SetScreenOffset(int XOff,int YOff){
	info.pharos.gameEngine.GameCanvas.nScreenXOff = XOff;
	info.pharos.gameEngine.GameCanvas.nScreenYOff = YOff;
	return;
}

public void SetScreenOrientation(int orientation){
	this.nScreenOrientation = orientation;
	info.pharos.gameEngine.GameCanvas.SpriteMgr.SetScreenOrientation(orientation);
	return;
}

public void SetScreenSize(int Width,int Height){
	info.pharos.gameEngine.GameCanvas.nScreenWidth = Width;
	info.pharos.gameEngine.GameCanvas.nScreenHeight = Height;
	return;
}

public void SetSpriteAlpha(int spriteId,short alpha){
	info.pharos.gameEngine.GameCanvas.SpriteMgr.SetSpriteAlpha(spriteId,alpha);
	return;
}

public void SetSpriteDrawOffset(int XOff,int YOff){
	info.pharos.gameEngine.GameCanvas.nSpriteXOff = XOff;
	info.pharos.gameEngine.GameCanvas.nSpriteYOff = YOff;
	return;
}

public void SetSpriteTransform(int spriteId,int transform){
	info.pharos.gameEngine.GameCanvas.SpriteMgr.SetSpriteTransform(spriteId,transform);
	return;
}

public void SetTextAlpha(int TextLayer,int Alpha){
	info.pharos.gameEngine.GameCanvas.TextMgr.SetTextAlpha(TextLayer,Alpha);
	return;
}

public void SetTextInc(int TextLayer,int XInc,int YInc){
	info.pharos.gameEngine.GameCanvas.TextMgr.SetTextInc(TextLayer,XInc,YInc);
	return;
}

public void SetTextRotate(int TextLayer,float Rotate){
	info.pharos.gameEngine.GameCanvas.TextMgr.SetTextRotate(TextLayer,Rotate);
	return;
}

public void SetTextScale(int TextLayer,float Scale){
	info.pharos.gameEngine.GameCanvas.TextMgr.SetTextScale(TextLayer,Scale);
	return;
}

public void SetTextXVal(int TextLayer,int X){
	info.pharos.gameEngine.GameCanvas.TextMgr.SetTextXVal(TextLayer,X);
	return;
}

public void SetTextYVal(int TextLayer,int Y){
	info.pharos.gameEngine.GameCanvas.TextMgr.SetTextYVal(TextLayer,Y);
	return;
}

public void SetUserView(info.pharos.gameEngine.CCUserView view){
	this.cUserView = view;
	return;
}

public void SetViewRect(int BegX,int BegY,int EndX,int EndY){
	if (info.pharos.gameEngine.GameCanvas.nViewRc == null) {
	;
	info.pharos.gameEngine.GameCanvas.nViewRc = new android.graphics.Rect();
	// :cond_0
	}
	info.pharos.gameEngine.GameCanvas.nViewRc.left = BegX;
	info.pharos.gameEngine.GameCanvas.nViewRc.top = BegY;
	info.pharos.gameEngine.GameCanvas.nViewRc.right = (info.pharos.gameEngine.GameCanvas.nScreenWidth + EndX);
	info.pharos.gameEngine.GameCanvas.nViewRc.bottom = (info.pharos.gameEngine.GameCanvas.nScreenHeight + EndY);
	return;
}

public boolean ViewDark(int alphaSpeed){
	boolean bViewEnd = false;
	this.nScreenAlpha = (this.nScreenAlpha - alphaSpeed);
	if (this.nScreenAlpha <= 0) {
	this.nScreenAlpha = 0 /* 0 */;
	this.CloseAllText();
	this.ClearACT();
	bViewEnd = true;
	this.mFirstOpen = false /* 0 */;
	// :cond_0
	}
	return bViewEnd;
}

public boolean ViewOpen(int alphaSpeed){
	boolean bViewEnd = false;
	this.nScreenAlpha = (this.nScreenAlpha + alphaSpeed);
	if (this.nScreenAlpha >= 255) {
	this.nScreenAlpha = 255;
	bViewEnd = true;
	return true;
	// :cond_0
	}
	return bViewEnd;
}

public int WriteSprite(int SpriteResId,int SpriteX,int SpriteY,int SpriteAttr){
	if (info.pharos.gameEngine.GameCanvas.SpriteMgr == null) {
	;
	return -1;
	} else {
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr);
		}
	// goto :goto_0
	// :goto_0
	//return -1;
}

public int WriteSprite(int SpriteResId,int SpriteX,int SpriteY,int SpriteAttr,float rotate,float scale){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scale);
	//return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scale);
}

public int WriteSprite(int SpriteResId,int SpriteX,int SpriteY,int SpriteAttr,float rotate,float scaleX,float scaleY,short RotateX,short RotateY){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scaleX,scaleY,RotateX,RotateY);
	//return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scaleX,scaleY,RotateX,RotateY);
}

public int WriteSprite(int SpriteResId,int SpriteX,int SpriteY,int SpriteAttr,float rotate,float scale,short RotateX,short RotateY){
	return info.pharos.gameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scale,RotateX,RotateY);
	//return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scale,RotateX,RotateY);
}

public void flush(){
	this.bUpdate = true;
	return;
}

public boolean getTextPixels(int TextLayer,int[] pixels){
	return info.pharos.gameEngine.GameCanvas.TextMgr.getTextPixels(TextLayer,pixels);
	//return oms.GameEngine.GameCanvas.TextMgr.getTextPixels(TextLayer,pixels);
}

public boolean getUpdata(){
	;
	return this.bUpdate;
}

public boolean isReflash(){
	;
	return this.bUpdate;
}

	public void onDraw(android.graphics.Canvas canvas) {
		info.pharos.gameEngine.GameCanvas.paint.setColor(-0x1000000);
		boolean showSprite = true;
		int CurDepth = 0;
		int i = 0;
		while (i < info.pharos.gameEngine.GameCanvas.nMaxLogicLayer) {
			info.pharos.gameEngine.GameCanvas.TextMgr
					.OnDraw(canvas,
							CurDepth,
							(info.pharos.gameEngine.GameCanvas.nScreenXOff + info.pharos.gameEngine.GameCanvas.nBackXOff),
							(info.pharos.gameEngine.GameCanvas.nScreenYOff + info.pharos.gameEngine.GameCanvas.nBackYOff),
							info.pharos.gameEngine.GameCanvas.paint);
			if (showSprite) {
				if (info.pharos.gameEngine.GameCanvas.SpriteMgr
						.OnDraw(canvas,
								CurDepth,
								(info.pharos.gameEngine.GameCanvas.nScreenXOff + info.pharos.gameEngine.GameCanvas.nSpriteXOff),
								(info.pharos.gameEngine.GameCanvas.nScreenYOff + info.pharos.gameEngine.GameCanvas.nSpriteYOff),
								info.pharos.gameEngine.GameCanvas.cPaint)) {
					showSprite = false /* 0 */;
					// :cond_2
				}
			}
			CurDepth = (CurDepth + 0x1);
			i = (i + 0x1);
			// goto :goto_0
			// :cond_1
		}
		if (this.nScreenAlpha < 255) {
			canvas.drawARGB((255 - this.nScreenAlpha), 0, 0, 0);
			// :cond_0
			// :cond_3
		} else if (!this.mFirstOpen) {
			this.mFirstOpen = true;
			canvas.drawARGB(0, 0, 0, 0);
		}
		// goto :goto_1
		// :goto_1
		this.bUpdate = false /* 0 */;
		return;
	}

	public void onDraw(info.pharos.gameEngine.C_Lib cLib,
			android.graphics.Canvas canvas, int picHeight) {
		info.pharos.gameEngine.GameCanvas.paint.setColor(-0x1000000);
		boolean showSprite = true;
		int CurDepth = 0;
		if (!cLib.mTop && cLib.mBackground != null) {
			canvas.drawBitmap(cLib.mBackground,
					(float) info.pharos.gameEngine.GameCanvas.nScreenXOff,
					(float) (picHeight - cLib.mBackground.getHeight()),
					info.pharos.gameEngine.GameCanvas.paint);
			canvas.drawBitmap(cLib.mBackground,
					(float) info.pharos.gameEngine.GameCanvas.nScreenXOff,
					(float) (picHeight + 480),
					info.pharos.gameEngine.GameCanvas.paint);
			// :cond_0
		}
		int i = 0;
		while (i < info.pharos.gameEngine.GameCanvas.nMaxLogicLayer) {
			info.pharos.gameEngine.GameCanvas.TextMgr
					.OnDraw(canvas,
							CurDepth,
							(info.pharos.gameEngine.GameCanvas.nScreenXOff + info.pharos.gameEngine.GameCanvas.nBackXOff),
							(info.pharos.gameEngine.GameCanvas.nScreenYOff + info.pharos.gameEngine.GameCanvas.nBackYOff),
							info.pharos.gameEngine.GameCanvas.paint);
			if (showSprite) {
				if (info.pharos.gameEngine.GameCanvas.SpriteMgr
						.OnDraw(canvas,
								CurDepth,
								(info.pharos.gameEngine.GameCanvas.nScreenXOff + info.pharos.gameEngine.GameCanvas.nSpriteXOff),
								(info.pharos.gameEngine.GameCanvas.nScreenYOff + info.pharos.gameEngine.GameCanvas.nSpriteYOff),
								info.pharos.gameEngine.GameCanvas.cPaint)) {
					showSprite = false /* 0 */;
					// :cond_5
				}
			}
			CurDepth = (CurDepth + 0x1);
			i = (i + 0x1);
			// goto :goto_0
			// :cond_4
		}
		if (cLib.mTop && cLib.mBackground != null) {
			canvas.drawBitmap(cLib.mBackground,
					(float) info.pharos.gameEngine.GameCanvas.nScreenXOff,
					(float) (picHeight - cLib.mBackground.getHeight()),
					info.pharos.gameEngine.GameCanvas.paint);
			canvas.drawBitmap(cLib.mBackground,
					(float) info.pharos.gameEngine.GameCanvas.nScreenXOff,
					(float) (picHeight + 480),
					info.pharos.gameEngine.GameCanvas.paint);
			// :cond_1
		}
		if (this.cUserView != null) {
			this.cUserView.onDraw(canvas,
					info.pharos.gameEngine.GameCanvas.nScreenXOff,
					info.pharos.gameEngine.GameCanvas.nScreenYOff);
			// :cond_2
		}
		if (this.nScreenAlpha < 255) {
			canvas.drawARGB((255 - this.nScreenAlpha), 0, 0, 0);
			// :cond_3
			// :cond_6
		} else if (!this.mFirstOpen) {
			this.mFirstOpen = true;
			canvas.drawARGB(0, 0, 0, 0);
		}
		// goto :goto_1
		// :goto_1
		this.bUpdate = false /* 0 */;
		return;
	}

public void release(){
	this.CloseAllText();
	this.FreeAllACT();
	return;
}

public void setScreenAlpha(int Alpha){
	this.nScreenAlpha = Alpha;
	return;
}

public void setTextPixels(int TextLayer,int[] pixels){
	info.pharos.gameEngine.GameCanvas.TextMgr.setTextPixels(TextLayer,pixels);
	return;
}

public void setTextPixels(int TextLayer,int[] pixels,int offset,int x,int y,int width,int height){
	info.pharos.gameEngine.GameCanvas.TextMgr.setTextPixels(TextLayer,pixels,offset,x,y,width,height);
	return;
}

public void setTextPixels(int TextLayer,int[] pixels,int offset,int stride,int x,int y,int width,int height){
	info.pharos.gameEngine.GameCanvas.TextMgr.setTextPixels(TextLayer,pixels,offset,stride,x,y,width,height);
	return;
}

}

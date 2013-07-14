package oms.GameEngine;


public class GameCanvas extends Object  {

// static fields
public static final int ORIENATION_LEFT = 0x1;
public static final int ORIENATION_NORMAL = 0x0;
public static final int ORIENATION_RIGHT = 0x2;
public static final int ORIENATION_UPSIDE_DOWN = 0x3;
public static final int PAINT_MAX = 0xa;
private static oms.GameEngine.SpriteManager SpriteMgr;
private static oms.GameEngine.TextManager TextMgr;
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
private oms.GameEngine.CCUserView cUserView;
private android.content.Context mContext;
private boolean mFirstOpen;
public int nScreenAlpha;
public int nScreenOrientation;
// direct methods

static{
	;
	oms.GameEngine.GameCanvas.paint = new android.graphics.Paint();
	oms.GameEngine.GameCanvas.fRotate = 0 /* 0 */;
	oms.GameEngine.GameCanvas.nMaxLogicLayer = 8;
}

public GameCanvas(android.content.Context context,int TextLayer,int SpriteResNum,int SpriteNum){
	super();
	this.cUserView = null /* 0 */;
	this.mContext = context;
	oms.GameEngine.GameCanvas.nViewRc = null /* 0 */;
	oms.GameEngine.GameCanvas.SpriteMgr = null /* 0 */;
	oms.GameEngine.GameCanvas.TextMgr = null /* 0 */;
	this.nScreenAlpha = 0 /* 0 */;
	this.bUpdate = false /* 0 */;
	oms.GameEngine.GameCanvas.nBackXOff = 0 /* 0 */;
	oms.GameEngine.GameCanvas.nBackYOff = 0 /* 0 */;
	oms.GameEngine.GameCanvas.nSpriteXOff = 0 /* 0 */;
	oms.GameEngine.GameCanvas.nSpriteYOff = 0 /* 0 */;
	oms.GameEngine.GameCanvas.nScreenXOff = 0 /* 0 */;
	oms.GameEngine.GameCanvas.nScreenYOff = 0 /* 0 */;
	this.mFirstOpen = false /* 0 */;
	this.SetScreenSize(320,480);
	this.SetViewRect(-120,-90,120,90);
	;
	oms.GameEngine.GameCanvas.SpriteMgr = new oms.GameEngine.SpriteManager(this.mContext,SpriteResNum,SpriteNum);
	;
	oms.GameEngine.GameCanvas.TextMgr = new oms.GameEngine.TextManager(this.mContext,TextLayer);
	this.InitPaint();
	this.nScreenOrientation = 0 /* 0 */;
}

public static int GetScreenHeight(){
	;
	return oms.GameEngine.GameCanvas.nScreenHeight;
	//return oms.GameEngine.GameCanvas.nScreenHeight;
}

public static int GetScreenWidth(){
	;
	return oms.GameEngine.GameCanvas.nScreenWidth;
	//return oms.GameEngine.GameCanvas.nScreenWidth;
}

public static android.graphics.Rect GetViewRect(){
	;
	return oms.GameEngine.GameCanvas.nViewRc;
	//return oms.GameEngine.GameCanvas.nViewRc;
}

public static void Rotate(float angle){
	oms.GameEngine.GameCanvas.fRotate = angle;
	return;
}

public static float getRotate(){
	;
	return oms.GameEngine.GameCanvas.fRotate;
	//return oms.GameEngine.GameCanvas.fRotate;
}
// virtual methods

public boolean CHKACTTouch(int SACTName,int SXVal,int SYVal,int DACTName,int DXVal,int DYVal){
	return oms.GameEngine.GameCanvas.SpriteMgr.CHKACTTouch(SACTName,SXVal,SYVal,DACTName,DXVal,DYVal);
	//return oms.GameEngine.GameCanvas.SpriteMgr.CHKACTTouch(SACTName,SXVal,SYVal,DACTName,DXVal,DYVal);
}

public boolean CHKACTTouch(int SXVal,int SYVal,int SXHitL,int SXHitR,int SYHitU,int SYHitD,int DACTName,int DXVal,int DYVal){
	return oms.GameEngine.GameCanvas.SpriteMgr.CHKACTTouch(SXVal,SYVal,SXHitL,SXHitR,SYHitU,SYHitD,DACTName,DXVal,DYVal);
	//return oms.GameEngine.GameCanvas.SpriteMgr.CHKACTTouch(SXVal,SYVal,SXHitL,SXHitR,SYHitU,SYHitD,DACTName,DXVal,DYVal);
}

public void ClearACT(){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	} else {
	oms.GameEngine.GameCanvas.SpriteMgr.ClearACT();
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void CloseAllText(){
	oms.GameEngine.GameCanvas.TextMgr.CloseAllText();
	return;
}

public void CloseText(int TextLayer){
	oms.GameEngine.GameCanvas.TextMgr.CloseText(TextLayer);
	return;
}

public void FreeACT(int ACTLibId){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	} else {
	oms.GameEngine.GameCanvas.SpriteMgr.FreeACT(ACTLibId);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void FreeACT(int ACTLibId,int ACTFrameID){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	} else {
	oms.GameEngine.GameCanvas.SpriteMgr.FreeACT(ACTLibId,ACTFrameID);
		}
	// goto :goto_0
	// :goto_0
	return;
}

public void FreeAllACT(){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	} else {
	oms.GameEngine.GameCanvas.SpriteMgr.FreeAllACT();
		}
	// goto :goto_0
	// :goto_0
	return;
}

public int GetACTCount(int ACTId,int ACTFileName){
	return oms.GameEngine.GameCanvas.SpriteMgr.GetACTCount(ACTId,ACTFileName);
	//return oms.GameEngine.GameCanvas.SpriteMgr.GetACTCount(ACTId,ACTFileName);
}

public android.graphics.Bitmap GetSpriteBitmap(int resId){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	;
	return null /* 0 */;
	} else {
	return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteBitmap(resId);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public long GetSpriteRamSize(){
	return oms.GameEngine.GameCanvas.SpriteMgr.GetBMPRamSize();
	//return oms.GameEngine.GameCanvas.SpriteMgr.GetBMPRamSize();
}

public long GetSpriteSegSize(int ACTLibIdx){
	return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteSegSize(ACTLibIdx);
	//return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteSegSize(ACTLibIdx);
}

public int GetSpriteXHitL(int SpriteID){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteXHitL(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteXHitR(int SpriteID){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteXHitR(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteYHitD(int SpriteID){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteYHitD(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteYHitU(int SpriteID){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteYHitU(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteZHitB(int SpriteID){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteZHitB(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetSpriteZHitF(int SpriteID){
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	;
	return 0 /* 0 */;
	} else {
	return oms.GameEngine.GameCanvas.SpriteMgr.GetSpriteZHitF(SpriteID);
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public int GetTextHeight(int TextLayer){
	return oms.GameEngine.GameCanvas.TextMgr.GetTextHeight(TextLayer);
	//return oms.GameEngine.GameCanvas.TextMgr.GetTextHeight(TextLayer);
}

public long GetTextRamSize(){
	return oms.GameEngine.GameCanvas.TextMgr.GetBMPRamSize();
	//return oms.GameEngine.GameCanvas.TextMgr.GetBMPRamSize();
}

public int GetTextWidth(int TextLayer){
	return oms.GameEngine.GameCanvas.TextMgr.GetTextWidth(TextLayer);
	//return oms.GameEngine.GameCanvas.TextMgr.GetTextWidth(TextLayer);
}

public int GetTextXVal(int TextLayer){
	return oms.GameEngine.GameCanvas.TextMgr.GetTextXVal(TextLayer);
	//return oms.GameEngine.GameCanvas.TextMgr.GetTextXVal(TextLayer);
}

public int GetTextYVal(int TextLayer){
	return oms.GameEngine.GameCanvas.TextMgr.GetTextYVal(TextLayer);
	//return oms.GameEngine.GameCanvas.TextMgr.GetTextYVal(TextLayer);
}

public void InitACT(int ACTId,int ACTFileName){
	oms.GameEngine.GameCanvas.SpriteMgr.InitACT(ACTId,ACTFileName);
	return;
}

public void InitPaint(){
	;
	oms.GameEngine.GameCanvas.cPaint = new android.graphics.Paint[10];
	int i = 0;
	while (i < 10) {
	oms.GameEngine.GameCanvas.cPaint[i] = null /* 0 */;
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	;
	oms.GameEngine.GameCanvas.cPaint[0] = new android.graphics.Paint();
	return;
}

public void LoadACT(int ACTLibId,int ACTFrameId,int ACTFileName){
	oms.GameEngine.GameCanvas.SpriteMgr.LoadACT(ACTLibId,ACTFrameId,ACTFileName);
	return;
}

public void LoadACT(int ACTLibId,int ACTFrameBeg,int ACTFrameEnd,int ACTFileName){
	oms.GameEngine.GameCanvas.SpriteMgr.LoadACT(ACTLibId,ACTFrameBeg,ACTFrameEnd,ACTFileName);
	return;
}

public boolean LoadACT(int ACTId,int ACTFileName){
	return oms.GameEngine.GameCanvas.SpriteMgr.LoadACT(ACTId,ACTFileName);
	//return oms.GameEngine.GameCanvas.SpriteMgr.LoadACT(ACTId,ACTFileName);
}

public void LoadPicture(int ResTextID,int TextLayer,int TextDepth){
	oms.GameEngine.GameCanvas.TextMgr.LoadPicture(ResTextID,TextLayer,TextDepth);
	return;
}

public void LoadText(int ResTextID,int TextLayer,int TextDepth){
	oms.GameEngine.GameCanvas.TextMgr.LoadText(ResTextID,TextLayer,TextDepth);
	return;
}

public void LoadText(int Width,int Height,int TextLayer,int TextDepth){
	oms.GameEngine.GameCanvas.TextMgr.LoadText(Width,Height,TextLayer,TextDepth);
	return;
}

public void ScrollText(int TextLayer){
	oms.GameEngine.GameCanvas.TextMgr.ScrollText(TextLayer);
	return;
}

public void SetACTLibBeg(int beg){
	oms.GameEngine.GameCanvas.SpriteMgr.SetACTLibBeg(beg);
	return;
}

public void SetBackgroundDrawOffset(int XOff,int YOff){
	oms.GameEngine.GameCanvas.nBackXOff = XOff;
	oms.GameEngine.GameCanvas.nBackYOff = YOff;
	return;
}

public void SetLogOut(boolean sprite,boolean text){
	oms.GameEngine.GameCanvas.SpriteMgr.SetBMPSizeOut(sprite);
	oms.GameEngine.GameCanvas.TextMgr.SetBMPSizeOut(text);
	return;
}

public void SetMaxLogicLayer(int Layer){
	oms.GameEngine.GameCanvas.nMaxLogicLayer = Layer;
	return;
}

public void SetPaint(int paintId,android.graphics.Paint paint){
	oms.GameEngine.GameCanvas.cPaint[paintId] = paint;
	return;
}

public void SetPaintId(int spriteId,int paintId){
	oms.GameEngine.GameCanvas.SpriteMgr.SetPaintId(spriteId,paintId);
	return;
}

public void SetScreenOffset(int XOff,int YOff){
	oms.GameEngine.GameCanvas.nScreenXOff = XOff;
	oms.GameEngine.GameCanvas.nScreenYOff = YOff;
	return;
}

public void SetScreenOrientation(int orientation){
	this.nScreenOrientation = orientation;
	oms.GameEngine.GameCanvas.SpriteMgr.SetScreenOrientation(orientation);
	return;
}

public void SetScreenSize(int Width,int Height){
	oms.GameEngine.GameCanvas.nScreenWidth = Width;
	oms.GameEngine.GameCanvas.nScreenHeight = Height;
	return;
}

public void SetSpriteAlpha(int spriteId,short alpha){
	oms.GameEngine.GameCanvas.SpriteMgr.SetSpriteAlpha(spriteId,alpha);
	return;
}

public void SetSpriteDrawOffset(int XOff,int YOff){
	oms.GameEngine.GameCanvas.nSpriteXOff = XOff;
	oms.GameEngine.GameCanvas.nSpriteYOff = YOff;
	return;
}

public void SetSpriteTransform(int spriteId,int transform){
	oms.GameEngine.GameCanvas.SpriteMgr.SetSpriteTransform(spriteId,transform);
	return;
}

public void SetTextAlpha(int TextLayer,int Alpha){
	oms.GameEngine.GameCanvas.TextMgr.SetTextAlpha(TextLayer,Alpha);
	return;
}

public void SetTextInc(int TextLayer,int XInc,int YInc){
	oms.GameEngine.GameCanvas.TextMgr.SetTextInc(TextLayer,XInc,YInc);
	return;
}

public void SetTextRotate(int TextLayer,float Rotate){
	oms.GameEngine.GameCanvas.TextMgr.SetTextRotate(TextLayer,Rotate);
	return;
}

public void SetTextScale(int TextLayer,float Scale){
	oms.GameEngine.GameCanvas.TextMgr.SetTextScale(TextLayer,Scale);
	return;
}

public void SetTextXVal(int TextLayer,int X){
	oms.GameEngine.GameCanvas.TextMgr.SetTextXVal(TextLayer,X);
	return;
}

public void SetTextYVal(int TextLayer,int Y){
	oms.GameEngine.GameCanvas.TextMgr.SetTextYVal(TextLayer,Y);
	return;
}

public void SetUserView(oms.GameEngine.CCUserView view){
	this.cUserView = view;
	return;
}

public void SetViewRect(int BegX,int BegY,int EndX,int EndY){
	if (oms.GameEngine.GameCanvas.nViewRc == null) {
	;
	oms.GameEngine.GameCanvas.nViewRc = new android.graphics.Rect();
	// :cond_0
	}
	oms.GameEngine.GameCanvas.nViewRc.left = BegX;
	oms.GameEngine.GameCanvas.nViewRc.top = BegY;
	oms.GameEngine.GameCanvas.nViewRc.right = (oms.GameEngine.GameCanvas.nScreenWidth + EndX);
	oms.GameEngine.GameCanvas.nViewRc.bottom = (oms.GameEngine.GameCanvas.nScreenHeight + EndY);
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
	if (oms.GameEngine.GameCanvas.SpriteMgr == null) {
	;
	return -1;
	} else {
	return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr);
		}
	// goto :goto_0
	// :goto_0
	//return -1;
}

public int WriteSprite(int SpriteResId,int SpriteX,int SpriteY,int SpriteAttr,float rotate,float scale){
	return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scale);
	//return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scale);
}

public int WriteSprite(int SpriteResId,int SpriteX,int SpriteY,int SpriteAttr,float rotate,float scaleX,float scaleY,short RotateX,short RotateY){
	return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scaleX,scaleY,RotateX,RotateY);
	//return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scaleX,scaleY,RotateX,RotateY);
}

public int WriteSprite(int SpriteResId,int SpriteX,int SpriteY,int SpriteAttr,float rotate,float scale,short RotateX,short RotateY){
	return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scale,RotateX,RotateY);
	//return oms.GameEngine.GameCanvas.SpriteMgr.WriteSprite(SpriteResId,SpriteX,SpriteY,SpriteAttr,rotate,scale,RotateX,RotateY);
}

public void flush(){
	this.bUpdate = true;
	return;
}

public boolean getTextPixels(int TextLayer,int[] pixels){
	return oms.GameEngine.GameCanvas.TextMgr.getTextPixels(TextLayer,pixels);
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
		oms.GameEngine.GameCanvas.paint.setColor(-0x1000000);
		boolean showSprite = true;
		int CurDepth = 0;
		int i = 0;
		while (i < oms.GameEngine.GameCanvas.nMaxLogicLayer) {
			oms.GameEngine.GameCanvas.TextMgr
					.OnDraw(canvas,
							CurDepth,
							(oms.GameEngine.GameCanvas.nScreenXOff + oms.GameEngine.GameCanvas.nBackXOff),
							(oms.GameEngine.GameCanvas.nScreenYOff + oms.GameEngine.GameCanvas.nBackYOff),
							oms.GameEngine.GameCanvas.paint);
			if (showSprite) {
				if (oms.GameEngine.GameCanvas.SpriteMgr
						.OnDraw(canvas,
								CurDepth,
								(oms.GameEngine.GameCanvas.nScreenXOff + oms.GameEngine.GameCanvas.nSpriteXOff),
								(oms.GameEngine.GameCanvas.nScreenYOff + oms.GameEngine.GameCanvas.nSpriteYOff),
								oms.GameEngine.GameCanvas.cPaint)) {
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

	public void onDraw(oms.GameEngine.C_Lib cLib,
			android.graphics.Canvas canvas, int picHeight) {
		oms.GameEngine.GameCanvas.paint.setColor(-0x1000000);
		boolean showSprite = true;
		int CurDepth = 0;
		if (!cLib.mTop && cLib.mBackground != null) {
			canvas.drawBitmap(cLib.mBackground,
					(float) oms.GameEngine.GameCanvas.nScreenXOff,
					(float) (picHeight - cLib.mBackground.getHeight()),
					oms.GameEngine.GameCanvas.paint);
			canvas.drawBitmap(cLib.mBackground,
					(float) oms.GameEngine.GameCanvas.nScreenXOff,
					(float) (picHeight + 480),
					oms.GameEngine.GameCanvas.paint);
			// :cond_0
		}
		int i = 0;
		while (i < oms.GameEngine.GameCanvas.nMaxLogicLayer) {
			oms.GameEngine.GameCanvas.TextMgr
					.OnDraw(canvas,
							CurDepth,
							(oms.GameEngine.GameCanvas.nScreenXOff + oms.GameEngine.GameCanvas.nBackXOff),
							(oms.GameEngine.GameCanvas.nScreenYOff + oms.GameEngine.GameCanvas.nBackYOff),
							oms.GameEngine.GameCanvas.paint);
			if (showSprite) {
				if (oms.GameEngine.GameCanvas.SpriteMgr
						.OnDraw(canvas,
								CurDepth,
								(oms.GameEngine.GameCanvas.nScreenXOff + oms.GameEngine.GameCanvas.nSpriteXOff),
								(oms.GameEngine.GameCanvas.nScreenYOff + oms.GameEngine.GameCanvas.nSpriteYOff),
								oms.GameEngine.GameCanvas.cPaint)) {
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
					(float) oms.GameEngine.GameCanvas.nScreenXOff,
					(float) (picHeight - cLib.mBackground.getHeight()),
					oms.GameEngine.GameCanvas.paint);
			canvas.drawBitmap(cLib.mBackground,
					(float) oms.GameEngine.GameCanvas.nScreenXOff,
					(float) (picHeight + 480),
					oms.GameEngine.GameCanvas.paint);
			// :cond_1
		}
		if (this.cUserView != null) {
			this.cUserView.onDraw(canvas,
					oms.GameEngine.GameCanvas.nScreenXOff,
					oms.GameEngine.GameCanvas.nScreenYOff);
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
	oms.GameEngine.GameCanvas.TextMgr.setTextPixels(TextLayer,pixels);
	return;
}

public void setTextPixels(int TextLayer,int[] pixels,int offset,int x,int y,int width,int height){
	oms.GameEngine.GameCanvas.TextMgr.setTextPixels(TextLayer,pixels,offset,x,y,width,height);
	return;
}

public void setTextPixels(int TextLayer,int[] pixels,int offset,int stride,int x,int y,int width,int height){
	oms.GameEngine.GameCanvas.TextMgr.setTextPixels(TextLayer,pixels,offset,stride,x,y,width,height);
	return;
}

}
package oms.GameEngine.GameView;


public class RanderThread extends Thread  {

// annotations
// value = Loms/GameEngine/GameView;
// accessFlags = 0x1
// name = "RanderThread"
// instance fields
private oms.GameEngine.C_Lib cLib;
private boolean mRun;
private android.view.SurfaceHolder mSurfaceHolder;
public boolean mThreadEnd;
final synthetic oms.GameEngine.GameView this$0 = mSurfaceHolder;
// direct methods

public RanderThread(oms.GameEngine.GameView mSurfaceHolder,android.view.SurfaceHolder handler,android.os.Handler $$2){
	super();
	this.mRun = false /* 0 */;
	this.mThreadEnd = false /* 0 */;
	this.mSurfaceHolder = handler;
	handler.setType(2);
	this.cLib = null /* 0 */;
	this.mThreadEnd = false /* 0 */;
}
// virtual methods

public void SetDraw(oms.GameEngine.C_Lib c_lib){
	this.cLib = c_lib;
	return;
}

public boolean ismRun(){
	;
	return this.mRun;
	//return this.mRun;
}

public void run(){
	// :goto_0
	while (this.cLib == null) {
	try {
	Thread.sleep(0,500);
	//end of try
	} catch (InterruptedException e) {
		;
		e.printStackTrace();
	} //end of catch: goto/16 :goto_0
	// goto/16 :goto_0
	// :cond_4
	}
	long frameElapse = 0;
	long frameTick = 0;
	int rectHeight = ((this.cLib.nRefreshHeight - 480) / 0x2);
	if ((oms.GameEngine.C_Lib.mCanvasScaleX - oms.GameEngine.C_Lib.mCanvasScaleY) == 0) {
	if ((oms.GameEngine.C_Lib.mCanvasScaleX - 0x3f80) == 0) {
	boolean randerMode = true;
	// :cond_5
	}
	randerMode = false /* 0 */;
	
	// goto/16 :goto_1
	android.graphics.Bitmap canvasBMP = null;
	android.graphics.Canvas canvas = null;
	android.graphics.Canvas c = null;
	if (!randerMode) {
	canvasBMP = android.graphics.Bitmap.createBitmap(this.cLib.nRefreshWidth,this.cLib.nRefreshHeight,android.graphics.Bitmap.Config.ARGB_8888);
	//[OTHER] end local v6           #canvas:Landroid/graphics/Canvas;
	
	new android.graphics.Canvas().setBitmap(canvasBMP);
	// :cond_0
	}
	;
	new android.graphics.Rect(0,0,(int)((float)this.cLib.nRefreshWidth * oms.GameEngine.C_Lib.mCanvasScaleX),(int)((float)this.cLib.nRefreshHeight * oms.GameEngine.C_Lib.mCanvasScaleY));
	android.graphics.Rect rc = new android.graphics.Rect;
	// :cond_1
	// :goto_2
	while (this.mRun != 0) {
	frameTick = System.currentTimeMillis();
	// :goto_3
	while (this.mRun == 0) {
	if (this.cLib.isReflash()) {
	long randerStart = System.currentTimeMillis();
	try {
	c = this.mSurfaceHolder.lockCanvas(rc);
	if (!randerMode) {
	if (c != null) {
	// getter for: Loms/GameEngine/GameView;->drawFilter:Landroid/graphics/PaintFlagsDrawFilter;;
	c.setDrawFilter(oms.GameEngine.GameView.access$0(this.this$0));
	c.scale(oms.GameEngine.C_Lib.mCanvasScaleX,oms.GameEngine.C_Lib.mCanvasScaleY);
	// :cond_7
	}
	// getter for: Loms/GameEngine/GameView;->drawFilter:Landroid/graphics/PaintFlagsDrawFilter;;
	new android.graphics.Canvas().setDrawFilter(oms.GameEngine.GameView.access$0(this.this$0));
	if (rectHeight > 0) {
	this.cLib.onDraw(this.cLib,new android.graphics.Canvas(),rectHeight);
	} else {
	//:try_start_4
	this.cLib.OnDraw(new android.graphics.Canvas());
	//:try_end_4
	// goto/16 :goto_4
	// :cond_d
	}
	if (c != null) {
	//:try_start_5
	// getter for: Loms/GameEngine/GameView;->drawFilter:Landroid/graphics/PaintFlagsDrawFilter;;
	c.setDrawFilter(oms.GameEngine.GameView.access$0(this.this$0));
	// :cond_e
	}
	if (rectHeight > 0) {
	if (c != null) {
	this.cLib.onDraw(this.cLib,c,rectHeight);
		}
	// goto/16 :goto_5
	// :cond_f
	}
	if (c != null) {
	this.cLib.OnDraw(c);
	//:try_end_5
		}
		}
	// goto/16 :goto_5
	// :goto_4
	if (c != null) {
	c.drawBitmap(canvasBMP,0,0,0);
	//:try_end_1
	// :cond_9
	}
	this.cLib.nFPS = (int)(System.currentTimeMillis() - randerStart);
	frameElapse = (System.currentTimeMillis() - frameTick);
	if ((frameElapse - (long)System.currentTimeMillis().getFrameReflashTime()) < 0) {
	try {
	oms.GameEngine.GameView.RanderThread.sleep((((long)this.cLib.getFrameReflashTime() - frameElapse) - 1));
	//end of try
	} catch (InterruptedException e/* */) {
		e1.printStackTrace();
	} //end of catch: goto/16 :goto_2
		}
	// goto/16 :goto_2
	
	} else {
	try {
	Thread.sleep((long)(this.cLib.getFrameReflashTime() >> 0x2));
	//end of try
	} catch (InterruptedException [exception]) {
		
		[exception].printStackTrace();
		android.util.Log.v("Test",[exception].toString());
			}
	} //end of catch: goto/16 :goto_3
	} finally {
		if (c != null) {
		this.mSurfaceHolder.unlockCanvasAndPost(c);
		// :cond_c
	}
	} //end of finally
		}
	// goto/16 :goto_3
	//[OTHER] end local v9           #e1:Ljava/lang/InterruptedException;
	//[OTHER] end local v15           #randerStart:J
	
	//[OTHER] end local v8           #e:Ljava/lang/InterruptedException;
	
	// :cond_6
	}
	if (canvasBMP != null) {
	canvasBMP.recycle();
	canvasBMP = null /* 0 */;
	// :cond_2
	}
	this.mThreadEnd = true;
	return;
		}
	//[OTHER] end local v5           #c:Landroid/graphics/Canvas;
	//[OTHER] end local v6           #canvas:Landroid/graphics/Canvas;
	//[OTHER] end local v7           #canvasBMP:Landroid/graphics/Bitmap;
	//[OTHER] end local v10           #frameElapse:J
	//[OTHER] end local v12           #frameTick:J
	//[OTHER] end local v14           #randerMode:Z
	//[OTHER] end local v17           #rc:Landroid/graphics/Rect;
	//[OTHER] end local v18           #rectHeight:I
	
	//[OTHER] end local v8           #e:Ljava/lang/InterruptedException;
	
	
	
	
	
	
	
}

public void setRunning(boolean b){
	this.mRun = b;
	return;
}

}
package oms.GameEngine;


public class C_MotionEventWrapper5 extends Object  {

// static fields
public static final int ACTION_POINTER_1_DOWN = 0x5;
public static final int ACTION_POINTER_1_UP = 0x6;
public static final int ACTION_POINTER_2_DOWN = 0x105;
public static final int ACTION_POINTER_2_UP = 0x106;
public static final int ACTION_POINTER_3_DOWN = 0x205;
public static final int ACTION_POINTER_3_UP = 0x206;
// direct methods

public C_MotionEventWrapper5(){
	super();
}

public static int getPointerCount(android.view.MotionEvent motionEvent){
	return motionEvent.getPointerCount();
	//return motionEvent.getPointerCount();
}

public static int getPointerId(android.view.MotionEvent motionEvent,int index){
	return motionEvent.getPointerId(index);
	//return motionEvent.getPointerId(index);
}

public static float getX(android.view.MotionEvent motionEvent,int index){
	return motionEvent.getX(index);
	//return motionEvent.getX(index);
}

public static float getY(android.view.MotionEvent motionEvent,int index){
	return motionEvent.getY(index);
	//return motionEvent.getY(index);
}

}
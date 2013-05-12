package oms.GameEngine;


public class GameMath extends Object  {

// direct methods

public GameMath(){
	super();
}

public static boolean CHKTouch(int SB,int SC,int SE,int TB,int TC,int TE){
	if ((SC + SE) < (TC - TB)) {
	;
	return false /* 0 */;
	// :cond_0
	} else if ((TC + TE) < (SC - SB)) {
	;
	return false /* 0 */;
	// goto :goto_0
	} else {
	;
	return true /* 1 */;
		}
	// goto :goto_0
	// :goto_0
	//return 0;
}

public static int convertToRealX(int x){
	;
	return (int)((float)x / oms.GameEngine.C_Lib.mCanvasScaleX);
	//return (int)((float)x / oms.GameEngine.C_Lib.mCanvasScaleX);
}

public static int convertToRealY(int y){
	;
	return (int)((float)y / oms.GameEngine.C_Lib.mCanvasScaleY);
	//return (int)((float)y / oms.GameEngine.C_Lib.mCanvasScaleY);
}

public static int convertToUIX(int x){
	;
	return (int)(oms.GameEngine.C_Lib.mCanvasScaleX * (float)x);
	//return (int)(oms.GameEngine.C_Lib.mCanvasScaleX * (float)x);
}

public static int convertToUIY(int y){
	;
	return (int)(oms.GameEngine.C_Lib.mCanvasScaleY * (float)y);
	//return (int)(oms.GameEngine.C_Lib.mCanvasScaleY * (float)y);
}

public static boolean isCollapse(int[] P1,int[] P2,int P1Num,int P2Num){
	int i = 0;
	while (i < (P1Num - 1)) {
	if (oms.GameEngine.GameMath.isPointInPolygon(P1[(i << 0x1)],P1[((i << 0x1) + 0x1)],P2,P2Num)) {
	;
//	return (i << 0x1);
	return true;
	// goto :goto_2
	} else {
	i = (i + 0x1);
		
	}
	// goto :goto_0
	// goto :goto_1
	// :cond_0
	}
	i = 0 /* 0 */;
	while (i >= (P2Num - 1)) {
	
	if (oms.GameEngine.GameMath.isPointInPolygon(P2[(i << 0x1)],P2[((i << 0x1) + 0x1)],P1,P1Num)) {
		;
		return true /* 1 */;
		// goto :goto_2
	} else {
		i = (i + 0x1);
	}
//	return (i << 0x1);
	//return (i << 0x1);
	} 
	return false;
}

public static boolean isPointInLine(int x,int y,int x1,int y1,int x2,int y2){
	boolean Result = false;
	int maxY;
	if (y1 >= y2) {
	maxY = y1;
	} else {
	maxY = y2;
		}
	// goto :goto_0
	// :goto_0
	int minY;
	if (y1 <= y2) {
	minY = y1;
	} else {
	minY = y2;
		}
	// goto :goto_1
	// :goto_1
	if (y < maxY && y >= minY && x <= ((((x2 - x1) * (y - y1)) / (y2 - y1)) + x1)) {
	Result = true;
	return true;
	// :cond_0
	}
	return Result;
	//[OTHER] end local v1           #maxY:I
	//[OTHER] end local v2           #minY:I
	
}

public static boolean isPointInPolygon(int x,int y,int[] Polygon,int PolygonPointNum){
	int crossNum = 0;
	boolean Result = true;
	int i = 0;
	while (i < (PolygonPointNum - 1)) {
	if (oms.GameEngine.GameMath.isPointInLine(x,y,Polygon[(i << 0x1)],Polygon[((i << 0x1) + 0x1)],Polygon[((i << 0x1) + 0x2)],Polygon[((i << 0x1) + 0x3)])) {
	crossNum = (crossNum + 0x1);
	// :cond_2
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	if ((crossNum & 0x1) == 0) {
	Result = false /* 0 */;
	return false /* 0 */;
	// :cond_0
	}
	return Result;
}

}
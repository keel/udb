package com.game.UnicornDash;


public class C_SceneNormal extends Object  {

// static fields
public static final int HorizontalLine = 0x8c;
public static final int[] PowerBall_Dash_OffsetTBL;
public static final double[] ScaleTBL = {0x3ff0000000000000L,0x3ff0000000000000L,0x3feccccccccccccdL,0x3fe999999999999aL,0x3fe6666666666666L,0x3fe3333333333333L,0x3fe0000000000000L,0x3fd999999999999aL,0x3fd3333333333333L,0x3fc999999999999aL,0x3fc999999999999aL,0x3fb999999999999aL,0x3fb999999999999aL,0x3fb999999999999aL,0x3fc999999999999aL,0x3fc999999999999aL,0x3fd3333333333333L,0x3fd3333333333333L,0x3fd3333333333333L,0x3fd999999999999aL,0x3fe0000000000000L,0x3fe3333333333333L,0x3fe6666666666666L,0x3fe999999999999aL,0x3feccccccccccccdL,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L,0x3ff0000000000000L};
private static int[] SceneDashTBL = null;
public static final int TOUCH_BODY_X1 = 0xf;
public static final int TOUCH_BODY_Y1 = 0xf;
public static final int TOUCH_FEET_X1 = 0x0;
public static final int TOUCH_FEET_X2 = 0x0;
public static final int TOUCH_FEET_Y1 = 0xf;
public static final int TOUCH_FEET_Y2 = -0xf;
public static final int TOUCH_HEAD_X1 = 0x2d;
public static final int TOUCH_HEAD_Y1 = 0xf;
// instance fields
private com.game.UnicornDash.C_EVTDashBTN c_DashBTN;
private com.game.UnicornDash.C_EVTEffect[] c_EVTEffect;
private com.game.UnicornDash.C_EVTEidolon[] c_EVTEidolon;
private com.game.UnicornDash.C_EVTGameBTN[] c_EVTGameBTN;
private com.game.UnicornDash.C_EVTLand[] c_EVTLand;
private com.game.UnicornDash.C_EVTPlayer c_EVTPlayer;
private com.game.UnicornDash.C_EVTPowerBall c_EVTPowerBall;
private com.game.UnicornDash.C_EVTPropA[] c_EVTPropA;
private com.game.UnicornDash.C_EVTEffect c_Effect;
private com.game.UnicornDash.C_EVTEidolon c_Eidolon;
private com.game.UnicornDash.C_EVTGameBTN c_GameBTN;
private com.game.UnicornDash.C_EVTJumpBTN c_JumpBTN;
private com.game.UnicornDash.C_EVTLand c_Land;
private com.game.UnicornDash.C_EVTPropA c_PropA;
private int m_FinalCount;
private int m_FinalScore;
private int m_SCRIdx;
private int m_ScoreCount1;
private int m_ScoreCount2;
private int m_ScoreCount3;
private boolean m_isMsgRun;
private boolean m_isRun;
// direct methods

static{
	int[] v0v132 = new int[21];
	v0v132[1] = -4;
	v0v132[2] = 4;
	v0v132[3] = -6;
	v0v132[4] = 6;
	v0v132[5] = -2;
	v0v132[6] = 2;
	v0v132[7] = -10;
	v0v132[8] = 10;
	v0v132[9] = -4;
	v0v132[10] = 4;
	v0v132[11] = -2;
	v0v132[12] = 2;
	v0v132[13] = -4;
	v0v132[14] = 4;
	v0v132[15] = -2;
	v0v132[16] = 2;
	com.game.UnicornDash.C_SceneNormal.SceneDashTBL = v0v132;
	;
	int[] v0v112 = new int[13];
	v0v112[1] = 1;
	v0v112[2] = 2;
	v0v112[3] = 3;
	v0v112[4] = 4;
	v0v112[5] = 5;
	v0v112[6] = 6;
	v0v112[7] = 6;
	v0v112[8] = 5;
	v0v112[9] = 4;
	v0v112[10] = 3;
	v0v112[11] = 2;
	PowerBall_Dash_OffsetTBL = v0v112;
	// op;
	;
}

public C_SceneNormal(){
	super();
	this.c_EVTPlayer = null /* 0 */;
	this.c_Land = null /* 0 */;
	this.c_GameBTN = null /* 0 */;
	this.c_PropA = null /* 0 */;
	this.c_DashBTN = null /* 0 */;
	this.c_JumpBTN = null /* 0 */;
	this.c_Eidolon = null /* 0 */;
	this.c_Effect = null /* 0 */;
	this.c_EVTPowerBall = null /* 0 */;
	this.c_EVTLand = null /* 0 */;
	this.c_EVTGameBTN = null /* 0 */;
	this.c_EVTPropA = null /* 0 */;
	this.c_EVTEidolon = null /* 0 */;
	this.c_EVTEffect = null /* 0 */;
}

private void AddScoreMain(int AddScore){
	com.game.UnicornDash.C_Global.g_RunLength = (com.game.UnicornDash.C_Global.g_RunLength + (long)((AddScore << 0x10) * 0x5));
	return;
}

private void ClearACT(){
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().ClearACT();
	return;
}

private void ClearGameBTN(int BTNType){
	if (this.c_EVTGameBTN != null) {
	int i = 0;
	while (i < 5) {
	if (this.c_EVTGameBTN[i].m_BTNType == BTNType) {
	this.c_EVTGameBTN[i].EVTCLR();
	// :cond_2
	}
	i = (i + 0x1);
	// goto :goto_0
	// :cond_1
	}
	//[OTHER] end local v0           #i:I
	// :cond_0
	}
	return;
	
}

private void ExecEVENT(){
	this.ExecEVT();
	this.ExecRUN();
	this.ExecTouch();
	return;
}

private void ExecEVT(){
	;
	switch(com.game.UnicornDash.C_Global.g_GameState){
	case 3: case 7: 
	if (this.c_EVTPlayer != null) {
	this.c_EVTPlayer.ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	// :cond_1
	}
	if (this.c_EVTLand != null) {
	int i = 0 /* 0 */;
	
	while (i < 5) {
	this.c_EVTLand[i].ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_2
	// :cond_6
	}
	//[OTHER] end local v0           #i:I
	// :cond_2
	}
	if (this.c_EVTPropA != null) {
		int i = 0 /* 0 */;
	
	while (i < 5) {
	this.c_EVTPropA[i].ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_3
	// :cond_7
	}
	//[OTHER] end local v0           #i:I
	// :cond_3
	}
	if (this.c_EVTEidolon != null) {
		int i = 0 /* 0 */;
	
	while (i < 2) {
	this.c_EVTEidolon[i].ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
 i = (i + 0x1);
	// goto :goto_4
	// :cond_8
	}
	//[OTHER] end local v0           #i:I
	// :cond_4
	}
	if (this.c_EVTEffect != null) {
		int i = 0 /* 0 */;
	
	while (i < 10) {
	this.c_EVTEffect[i].ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_5
	// :cond_9
	}
	//[OTHER] end local v0           #i:I
	// :cond_5
	}
	this.c_DashBTN.ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	this.c_JumpBTN.ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	this.c_EVTPowerBall.ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	break;
	} //end of switch
	if (this.c_EVTGameBTN != null) {
	int i = 0;
	while (i < 5) {
	this.c_EVTGameBTN[i].ExecEVT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto/16 :goto_1
	// :cond_a
	}
	//[OTHER] end local v0           #i:I
	// :cond_0
	}
	return;
	
	// op;
	
}

private void ExecRUN(){
	if (com.game.UnicornDash.C_Global.g_GameState == 7) {
	if (this.c_EVTPlayer != null) {
	this.c_EVTPlayer.ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	// :cond_0
	}
	if (this.c_EVTLand != null) {
	int i = 0;
	while (i < 5) {
	this.c_EVTLand[i].ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_0
	// :cond_7
	}
	//[OTHER] end local v0           #i:I
	// :cond_1
	}
	if (this.c_EVTPropA != null) {
		int i = 0 /* 0 */;
	
	while (i < 5) {
	this.c_EVTPropA[i].ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_1
	// :cond_8
	}
	//[OTHER] end local v0           #i:I
	// :cond_2
	}
	if (this.c_EVTEidolon != null) {
		int i = 0 /* 0 */;
	
	while (i < 2) {
	this.c_EVTEidolon[i].ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_2
	// :cond_9
	}
	//[OTHER] end local v0           #i:I
	// :cond_3
	}
	if (this.c_EVTEffect != null) {
		int i = 0 /* 0 */;
	
	while (i < 10) {
	this.c_EVTEffect[i].ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_3
	// :cond_a
	}
	//[OTHER] end local v0           #i:I
	// :cond_4
	}
	this.c_DashBTN.ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	this.c_JumpBTN.ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	this.c_EVTPowerBall.ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	// :cond_5
	}
	if (this.c_EVTGameBTN != null) {
		int i = 0 /* 0 */;
	
	while (i < 5) {
	this.c_EVTGameBTN[i].ExecRUN(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto :goto_4
	// :cond_b
	}
	//[OTHER] end local v0           #i:I
	// :cond_6
	}
	return;
	
}

	private void ExecTouch() {
		if (this.c_EVTPlayer.EVT.Ctrl == 4) {
			// :cond_0
			return;
		}
		int Var1 = (this.getLandSpeed() >> 0x10);
		int Var2 = (this.c_EVTPlayer.EVT.XInc >> 0x10);
		if (Var2 > 0) {
			Var2 = 0 /* 0 */;
			// :cond_2
		}
		int MaxAdjust = ((Var1 - Var2) * 0x2);
		boolean Front_Test = false;
		boolean Back_Test = false;
		if (this.c_EVTLand != null && this.c_EVTPlayer != null) {
			this.c_EVTPlayer.m_isGround = false /* 0 */;
			int Feet_X1 = ((((this.c_EVTPlayer.EVT.XVal >> 0x10) + 0x0) + com.game.UnicornDash.C_Global.g_SceneFloat_X) + 0x0);
			int Feet_Y1 = (((this.c_EVTPlayer.EVT.YVal >> 0x10) + 0xf) + com.game.UnicornDash.C_Global.g_SceneFloat_Y);
			int Feet_X2 = ((((this.c_EVTPlayer.EVT.XVal >> 0x10) + 0x0) + com.game.UnicornDash.C_Global.g_SceneFloat_X) + 0x0);
			int Feet_Y2 = (((this.c_EVTPlayer.EVT.YVal >> 0x10) + -0xf) + com.game.UnicornDash.C_Global.g_SceneFloat_Y);
			int Body_X1 = (((this.c_EVTPlayer.EVT.XVal >> 0x10) + 0xf) + com.game.UnicornDash.C_Global.g_SceneFloat_X);
			int Body_Y1 = (((this.c_EVTPlayer.EVT.YVal >> 0x10) + 0xf) + com.game.UnicornDash.C_Global.g_SceneFloat_Y);
			int Head_X1 = (com.game.UnicornDash.C_Global.g_SceneFloat_X + ((this.c_EVTPlayer.EVT.XVal >> 0x10) + 0x2d));
			int Head_Y1 = (com.game.UnicornDash.C_Global.g_SceneFloat_Y + ((this.c_EVTPlayer.EVT.YVal >> 0x10) + 0xf));
			int Front_X = (this.c_EVTPlayer.EVT.XVal >> 0x10);
			int Back_X = (this.c_EVTPlayer.EVT.XVal >> 0x10);
			int i = 0;
			while (i < 5) {
				// :cond_7
				if (this.c_EVTLand[i].EVT.Valid) {
					if (this.c_EVTPlayer.EVT.Ctrl == 0
							|| this.c_EVTPlayer.EVT.Ctrl == 3) {
						// :cond_8
						switch (this.c_EVTLand[i].EVT.Ctrl) {
						case 5:
						case 10:
							if (MaxAdjust > 32) {
								MaxAdjust = 32;
								break;
							} // end of switch
								// :cond_9
						}
					}

					int Idx = 0;
					int Ctrl;
					do {
						// [OTHER] end local v6 #Head_X1:I
						int ACTName = this.c_EVTLand[i].EVT.ACTPtr[this.c_EVTLand[i].EVT.Ctrl][Idx];
						int XVal = (this.c_EVTLand[i].EVT.XVal >> 0x10);
						int YVal = (this.c_EVTLand[i].EVT.YVal >> 0x10);
						Ctrl = this.c_EVTLand[i].EVT.Ctrl;

						// Head_Y1 = ((this.c_EVTPlayer.EVT.YVal >> 0x10) +
						// 0xf);
						Head_X1 = ((this.c_EVTPlayer.EVT.XVal >> 16) + 45);
						Head_Y1 = ((this.c_EVTPlayer.EVT.YVal >> 16) + 15);

						if (com.game.UnicornDash.C_OPhoneApp.cLib
								.getGameCanvas().CHKACTTouch(Head_X1, Head_Y1,
										1, 1, 1, 1, ACTName, XVal, YVal)) {
							int Area = 0 /* 0 */;
							while (com.game.UnicornDash.C_PUB.GetActPixel(
									ACTName, XVal, YVal, Head_X1, Head_Y1) != 0) {
								Head_X1 = Head_X1 - 1;
								Area = (Area + 0x1);
								if (Area > (MaxAdjust + 0x2)) {
									// Head_X1=4;
									// Head_Y1=0;
									this.c_EVTPlayer.setPlayerCtrl(4, 0);
									return;
								}
							}
							com.game.UnicornDash.C_Global.g_SceneFloat_X = (com.game.UnicornDash.C_Global.g_SceneFloat_X + Area);
							this.c_EVTPlayer.EVT.XVal = ((Head_X1 - 45) << 0x10);
						}
						Feet_X1 = (((this.c_EVTPlayer.EVT.XVal >> 0x10) + 0x0) + 0x0);
						Feet_Y1 = ((this.c_EVTPlayer.EVT.YVal >> 0x10) + 0xf);

						if (com.game.UnicornDash.C_OPhoneApp.cLib
								.getGameCanvas().CHKACTTouch(Feet_X1, Feet_Y1,
										1, 1, 1, 1, ACTName, XVal, YVal)) {
							if (this.c_EVTPlayer.EVT.Ctrl == 0
									&& com.game.UnicornDash.C_PUB.GetActPixel(
											ACTName, XVal, YVal, Feet_X1,
											Feet_Y1) == 0
									&& com.game.UnicornDash.C_PUB.GetActPixel(
											ACTName, XVal, YVal,
											(Feet_X1 - MaxAdjust), Feet_Y1) != 0) {
								Front_X = (Front_X - (MaxAdjust / 0x2));
								Feet_X1 = (Feet_X1 - (MaxAdjust / 0x2));
								Front_Test = true;
								// :cond_d
							}
							int Area = 0 /* 0 */;
							// :cond_e
							while (com.game.UnicornDash.C_PUB.GetActPixel(
									ACTName, XVal, YVal, Feet_X1, Feet_Y1) != 0) {
								// [OTHER] end local v38 #Area:I
								// :cond_1b

								// :cond_14
								this.c_EVTPlayer.m_isGround = true;
								Feet_X1 = (Feet_X1 + 0x1);
								Area = (Area + 0x1);
								if (Area <= (MaxAdjust + 0x2)) {
									if (Front_X < Feet_X1) {
										Front_X = Feet_X1;
									}
								} else {
									this.c_EVTPlayer.setPlayerCtrl(4, 0);
									return;
								}
							}
						}
						Feet_X2 = (((this.c_EVTPlayer.EVT.XVal >> 0x10) + 0x0) + 0x0);

						Feet_Y2 = ((this.c_EVTPlayer.EVT.YVal >> 0x10) + -0xf);
						if (com.game.UnicornDash.C_OPhoneApp.cLib
								.getGameCanvas().CHKACTTouch(Feet_X2, Feet_Y2,
										1, 1, 1, 1, ACTName, XVal, YVal)) {
							if (this.c_EVTPlayer.EVT.Ctrl == 0
									&& com.game.UnicornDash.C_PUB.GetActPixel(
											ACTName, XVal, YVal, Feet_X2,
											Feet_Y2) == 0
									&& com.game.UnicornDash.C_PUB.GetActPixel(
											ACTName, XVal, YVal,
											(Feet_X2 - MaxAdjust), Feet_Y2) != 0) {
								Back_X = (Back_X - (MaxAdjust / 0x2));
								Feet_X2 = (Feet_X2 - (MaxAdjust / 0x2));
								Back_Test = true;
								// :cond_10
							}
							int Area = 0 /* 0 */;
							// :cond_11
							while (com.game.UnicornDash.C_PUB.GetActPixel(
									ACTName, XVal, YVal, Feet_X2, Feet_Y2) == 0) {
								// [OTHER] end local v38 #Area:I
								// :cond_f
								// :cond_16
								this.c_EVTPlayer.m_isGround = true;
								Feet_X2 = (Feet_X2 + 0x1);
								Area = (Area + 0x1);
								if (Area > (MaxAdjust + 0x2)) {
									Head_Y1 = 0 /* 0 */;
									this.c_EVTPlayer.setPlayerCtrl(4, Head_Y1);
									return;
									// :cond_b
								} else {
									if (Back_X < Feet_X2) {
										Back_X = Feet_X2;
									}
								}

							}

						}
						Body_X1 = (Front_X + 0xf);

						Body_Y1 = ((this.c_EVTPlayer.EVT.YVal >> 0x10) + 0xf);
						if (com.game.UnicornDash.C_OPhoneApp.cLib
								.getGameCanvas().CHKACTTouch(Body_X1, Body_Y1,
										1, 1, 1, 1, ACTName, XVal, YVal)
								&& com.game.UnicornDash.C_PUB.GetActPixel(
										ACTName, XVal, YVal, Body_X1, Body_Y1) != 0
								&& !Front_Test) {
							// Head_Y1 = 0 /* 0 */;
							this.c_EVTPlayer.setPlayerCtrl(4, 0);
							return;
						} else {
							if ((this.c_EVTPlayer.EVT.Ctrl == 1 || this.c_EVTPlayer.EVT.Ctrl == 2)
									&& this.c_EVTPlayer.m_isGround
									&& this.c_EVTPlayer.EVT.XInc <= 0) {
								// :cond_19
								this.c_EVTPlayer.setPlayerCtrl(0, 0);
								// :cond_1a
							}
							Idx = (Idx + 0x1);
						}

					} while (this.GetLandAct(i, Ctrl, Idx) == -1);

				}
				i++;

			}

			if (this.c_EVTPlayer.m_isGround) {
				this.c_EVTPlayer.CHKGameOperateClr();
				// [OTHER] end local v6 #Head_X1:I
				this.c_EVTPlayer.EVT.XVal = (((Front_X + Back_X) / 0x2) << 0x10);
				// :cond_3
			}
			if (this.c_EVTPlayer.EVT.Ctrl == 0) {
				this.c_EVTPlayer.m_BodyRadian = Math.atan2(
						(double) (Back_X - Front_X),
						(double) (Feet_Y1 - Feet_Y2));
				this.c_EVTPlayer.EVT.Rotate = (float) com.game.UnicornDash.C_PUB
						.RadianToAngle(this.c_EVTPlayer.m_BodyRadian);
				// [OTHER] end local v7 #Head_Y1:I
				// [OTHER] end local v16 #Feet_X1:I
				// [OTHER] end local v17 #Feet_Y1:I
				// [OTHER] end local v19 #Feet_X2:I
				// [OTHER] end local v20 #Feet_Y2:I
				// [OTHER] end local v22 #Body_X1:I
				// [OTHER] end local v23 #Body_Y1:I
				// [OTHER] end local v40 #Back_X:I
				// [OTHER] end local v43 #Front_X:I
				// [OTHER] end local v48 #i:I
				// goto/16 :goto_2
			} else {
				this.c_EVTPlayer.EVT.Rotate = 0 /* 0 */;
			}
			// :cond_4
		}

		// :goto_2
		if (this.c_EVTPlayer != null) {
			int SACTName = this.c_EVTPlayer.EVT.ACTIdx;
			int SXVal = (this.c_EVTPlayer.EVT.XVal >> 0x10);
			int SYVal = (this.c_EVTPlayer.EVT.YVal >> 0x10);
			if (this.c_EVTPropA != null) {
				int i = 0;
				while (i < 5) {
					if (this.c_EVTPropA[i].EVT.Valid
							&& this.c_EVTPropA[i].EVT.Ctrl == 0) {
						int DACTName = this.c_EVTPropA[i].EVT.ACTIdx;
						int DXVal = (this.c_EVTPropA[i].EVT.XVal >> 0x10);
						int DYVal = (this.c_EVTPropA[i].EVT.YVal >> 0x10);
						if (com.game.UnicornDash.C_OPhoneApp.cLib
								.getGameCanvas().CHKACTTouch(SACTName, SXVal,
										SYVal, DACTName, DXVal, DYVal)) {
							if (this.c_EVTPlayer.EVT.Ctrl == 3) {
								this.c_EVTPropA[i].SetEVTCtrl(1, 0);
								com.game.UnicornDash.C_Media.PlaySound(1);
								com.game.UnicornDash.C_PUB.setVibratorTime();
								com.game.UnicornDash.C_OPhoneApp.cLib
										.getMessageMgr()
										.SendMessage(
												40,
												42,
												0,
												0,
												DXVal,
												(DYVal - (this.getLandSpeed() >> 0x10)));
								com.game.UnicornDash.C_OPhoneApp.cLib
										.getMessageMgr().SendMessage(40, 45, 0);

							} else {
								if (this.c_EVTPowerBall.EVT.Valid
										&& this.c_EVTPowerBall.EVT.Ctrl == 1) {
									this.c_EVTPowerBall.SetEVTCtrl(2, 0);
									this.c_EVTPropA[i].SetEVTCtrl(1, 0);
									com.game.UnicornDash.C_Media.PlaySound(1);
									com.game.UnicornDash.C_PUB
											.setVibratorTime();
									com.game.UnicornDash.C_OPhoneApp.cLib
											.getMessageMgr()
											.SendMessage(
													40,
													42,
													0,
													0,
													DXVal,
													(DYVal - (this
															.getLandSpeed() >> 0x10)));
									com.game.UnicornDash.C_OPhoneApp.cLib
											.getMessageMgr().SendMessage(40,
													45, 0);
								} else {
									this.c_EVTPlayer.setPlayerCtrl(4, 0);
									return;
								}

							}
						}
					}
					i++;
				}
			}

			if (this.c_EVTEidolon != null) {
				int i = 0;
				while (i < 2) {
					if (this.c_EVTEidolon[i].EVT.Valid
							&& this.c_EVTEidolon[i].EVT.Ctrl == 0) {
						int DACTName = this.c_EVTEidolon[i].EVT.ACTIdx;

						int DXVal = (this.c_EVTEidolon[i].EVT.XVal >> 0x10);

						int DYVal = (this.c_EVTEidolon[i].EVT.YVal >> 0x10);
						if (com.game.UnicornDash.C_OPhoneApp.cLib
								.getGameCanvas().CHKACTTouch(SACTName, SXVal,
										SYVal, DACTName, DXVal, DYVal)) {
							this.c_EVTEidolon[i].SetEVTCtrl(1, 0);
							com.game.UnicornDash.C_Media.PlaySound(6);
							com.game.UnicornDash.C_OPhoneApp.cLib
									.getMessageMgr()
									.SendMessage(
											40,
											44,
											0,
											0,
											DXVal,
											(DYVal - (this.getLandSpeed() >> 0x10)));
						}

					}
					i++;
				}
			}

			if (this.c_EVTPowerBall.EVT.Valid
					&& this.c_EVTPowerBall.EVT.Ctrl == 0) {
				int DACTName = this.c_EVTPowerBall.EVT.ACTIdx;
				int DXVal = (this.c_EVTPowerBall.EVT.XVal >> 0x10);
				int DYVal = (this.c_EVTPowerBall.EVT.YVal >> 0x10);
				if (com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas()
						.CHKACTTouch(SACTName, SXVal, SYVal, DACTName, DXVal,
								DYVal)) {
					this.c_EVTPowerBall.SetEVTCtrl(1, 0);
					com.game.UnicornDash.C_Media.PlaySound(6);
					return;
				}

			}

		}

	}

private int GetLandAct(int EVTIdx,int EVTCtrl,int ACTIdx){
	;
	return this.c_EVTLand[EVTIdx].EVT.ACTPtr[EVTCtrl][ACTIdx];
	//return this.c_EVTLand[EVTIdx].EVT.ACTPtr[EVTCtrl][ACTIdx];
}

private void InitAgain(){
	this.m_SCRIdx = (3 - com.game.UnicornDash.C_Global.g_GameLife);
	com.game.UnicornDash.C_Global.g_LandMakeArea = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_LandSpace = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_RunLength = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_CurDistance = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_LandMoveSpeed = 0xa;
	com.game.UnicornDash.C_Global.g_DashSpeedArea = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_EidolonCount = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_PropACount = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_SceneFloat_X = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_MakeCloudDly = 0 /* 0 */;
	this.c_EVTPlayer.CreatePlayer();
	com.game.UnicornDash.C_Global.g_LandIdx = 0 /* 0 */;
	this.c_Land.CreateLand(100,60,false);
	com.game.UnicornDash.C_Global.g_LandIdx = 0 /* 0 */;
	this.c_Land.CreateLand(100,1392,false);
	this.c_DashBTN.CreateDashBTN(this.c_DashBTN,40,(com.game.UnicornDash.C_Global.g_ScreenScale_3_1 + 0x1a4));
	this.c_JumpBTN.CreateJumpBTN(this.c_JumpBTN,40,(60 - com.game.UnicornDash.C_Global.g_ScreenScale_3_1));
	this.c_GameBTN.CreateGameBTN(6,300,(50 - com.game.UnicornDash.C_Global.g_ScreenScale_3_1));
	return;
}

private void Initialize(){
	this.m_isRun = true;
	this.m_isMsgRun = true;
	com.game.UnicornDash.C_Global.g_LandIdx = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_LandTest = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_GameLife = 3;
	com.game.UnicornDash.C_Global.g_Dash1Score = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_Dash2Score = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_Dash3Score = 0 /* 0 */;
	;
	this.c_EVTPlayer = new com.game.UnicornDash.C_EVTPlayer();
	;
	this.c_Land = new com.game.UnicornDash.C_EVTLand();
	;
	this.c_GameBTN = new com.game.UnicornDash.C_EVTGameBTN();
	;
	this.c_PropA = new com.game.UnicornDash.C_EVTPropA();
	;
	this.c_DashBTN = new com.game.UnicornDash.C_EVTDashBTN();
	;
	this.c_JumpBTN = new com.game.UnicornDash.C_EVTJumpBTN();
	;
	this.c_Eidolon = new com.game.UnicornDash.C_EVTEidolon();
	;
	this.c_Effect = new com.game.UnicornDash.C_EVTEffect();
	;
	this.c_EVTPowerBall = new com.game.UnicornDash.C_EVTPowerBall();
	;
	this.c_EVTLand = new com.game.UnicornDash.C_EVTLand[5];
	int i = 0;
	while (i < 5) {
	;
	this.c_EVTLand[0] = new com.game.UnicornDash.C_EVTLand();
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	;
	this.c_EVTGameBTN = new com.game.UnicornDash.C_EVTGameBTN[5];
	i = 0 /* 0 */;
	while (i < 5) {
	;
	this.c_EVTGameBTN[0] = new com.game.UnicornDash.C_EVTGameBTN();
	i = (i + 0x1);
	// goto :goto_1
	// :cond_1
	}
	;
	this.c_EVTPropA = new com.game.UnicornDash.C_EVTPropA[5];
	i = 0 /* 0 */;
	while (i < 5) {
	;
	this.c_EVTPropA[0] = new com.game.UnicornDash.C_EVTPropA();
	i = (i + 0x1);
	// goto :goto_2
	// :cond_2
	}
	;
	this.c_EVTEidolon = new com.game.UnicornDash.C_EVTEidolon[2];
	i = 0 /* 0 */;
	while (i < 2) {
	;
	this.c_EVTEidolon[0] = new com.game.UnicornDash.C_EVTEidolon();
	i = (i + 0x1);
	// goto :goto_3
	// :cond_3
	}
	;
	this.c_EVTEffect = new com.game.UnicornDash.C_EVTEffect[10];
	i = 0 /* 0 */;
	while (i < 10) {
	;
	this.c_EVTEffect[0] = new com.game.UnicornDash.C_EVTEffect();
	i = (i + 0x1);
	// goto :goto_4
	// :cond_4
	}
	this.c_Land.InitNPCLandOBJ(this.c_EVTLand);
	this.c_EVTPlayer.InitPlaneOBJ(this.c_EVTPlayer);
	this.c_PropA.InitPropAOBJ(this.c_EVTPropA);
	this.c_GameBTN.InitGameBTNOBJ(this.c_EVTGameBTN);
	this.c_Eidolon.InitEidolonOBJ(this.c_EVTEidolon);
	this.c_Effect.InitEffectOBJ(this.c_EVTEffect);
	com.game.UnicornDash.C_PUB.InitTouch();
	com.game.UnicornDash.C_PUB.setGameState(1);
	return;
}

private void LandMain(){
	if (!this.c_EVTPlayer.EVT.Valid) {
	// :cond_0
	} else {
	if (this.c_EVTPlayer.EVT.Ctrl != 4) {
	if (com.game.UnicornDash.C_Global.g_LandMoveSpeed < 0x14) {
	com.game.UnicornDash.C_Global.g_LandMoveSpeed = (com.game.UnicornDash.C_Global.g_LandMoveSpeed + 0x100);
	// :cond_2
	}
	if (this.c_EVTPlayer.EVT.Ctrl == 3) {
	com.game.UnicornDash.C_Global.g_DashSpeedArea = (com.game.UnicornDash.C_Global.g_DashSpeedArea + 0x1);
	if (com.game.UnicornDash.C_Global.g_DashSpeedArea > 0x8) {
	com.game.UnicornDash.C_Global.g_DashSpeedArea = 0x8;
	// :cond_3
	}
	// :cond_9
	}
	com.game.UnicornDash.C_Global.g_DashSpeedArea = (com.game.UnicornDash.C_Global.g_DashSpeedArea - 480);
	if (com.game.UnicornDash.C_Global.g_DashSpeedArea < 0) {
	com.game.UnicornDash.C_Global.g_DashSpeedArea = 0 /* 0 */;
		}
	// goto :goto_1
	
	if (this.c_EVTLand != null) {
	int i = 0;
	while (i < 5) {
	if (this.c_EVTLand[i].EVT.Valid) {
	this.c_EVTLand[i].EVT.YVal = (this.c_EVTLand[i].EVT.YVal - this.getLandSpeed());
	int YVal = (this.c_EVTLand[i].EVT.YVal >> 0x10);
	//this.c_EVTLand[i].m_LandLen = -this.c_EVTLand[i].m_LandLen;
	if (YVal < -this.c_EVTLand[i].m_LandLen) {
	this.c_EVTLand[i].EVTCLR();
	//[OTHER] end local v0           #YVal:I
	// :cond_b
	}
	}
	i = (i + 0x1);
	// goto/16 :goto_2
	// :cond_a
	}
	//[OTHER] end local v1           #i:I
	// :cond_4
	}
	if (this.c_EVTPowerBall.EVT.Valid) {
	this.c_EVTPowerBall.EVT.YVal = (this.c_EVTPowerBall.EVT.YVal - this.getLandSpeed());
	// :cond_5
	}
	if (this.c_EVTPropA != null) {
	int i = 0 /* 0 */;
	
	while (i < 5) {
	if (this.c_EVTPropA[i].EVT.Valid) {
	if (this.c_EVTPropA[i].EVT.Ctrl == 0) {
	this.c_EVTPropA[i].EVT.YVal = (this.c_EVTPropA[i].EVT.YVal - this.getLandSpeed());
	} else {
	this.c_EVTPropA[i].EVT.YVal = (this.c_EVTPropA[i].EVT.YVal - ((this.getLandSpeed() * 0x2) / 0x3));
		}
	// goto :goto_6
	// :cond_d
	}
	// :goto_6
	i = (i + 0x1);
	// goto/16 :goto_3
	// :cond_c
	}
	//[OTHER] end local v1           #i:I
	// :cond_6
	}
	if (this.c_EVTEffect != null) {
	int i = 0 /* 0 */;
	
	while (i < 10) {
	if (this.c_EVTEffect[i].EVT.Ctrl == 3) {
	this.c_EVTEffect[i].EVT.YVal = (int)((double)this.c_EVTEffect[i].EVT.YVal - ((double)this.getLandSpeed() * 0x3ff8));
	// :cond_10
	}
	i = (i + 0x1);
	// goto/16 :goto_4
	// :cond_f
	}
	//[OTHER] end local v1           #i:I
	// :cond_7
	}
	if (this.c_EVTEidolon != null) {
	int i = 0 /* 0 */;
	
	while (i < 2) {
	if (this.c_EVTEidolon[i].EVT.Valid) {
	if (this.c_EVTEidolon[i].EVT.Ctrl == 0) {
	this.c_EVTEidolon[i].EVT.YVal = (this.c_EVTEidolon[i].EVT.YVal - this.getLandSpeed());
	} else {
	this.c_EVTEidolon[i].EVT.YVal = (this.c_EVTEidolon[i].EVT.YVal - ((this.getLandSpeed() * 0x2) / 0x3));
		}
	// goto :goto_7
	// :cond_12
	}
	// :goto_7
	i = (i + 0x1);
	// goto/16 :goto_5
	// :cond_11
	}
	//[OTHER] end local v1           #i:I
	// :cond_8
	}
	com.game.UnicornDash.C_Global.g_LandSpace = (com.game.UnicornDash.C_Global.g_LandSpace - this.getLandSpeed());
	if (com.game.UnicornDash.C_Global.g_LandSpace <= 0) {
	this.c_Land.CreateLand(30,480,true);
		}
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

private void MakeHorseEff(){
	int XVal = (this.c_EVTPlayer.EVT.XVal >> 0x10);
	int YVal = (this.c_EVTPlayer.EVT.YVal >> 0x10);
	int Speed = (this.getLandSpeed() >> 0x10);
	if (this.c_EVTPlayer.EVT.CurCNT == 0 && this.c_EVTPlayer.EVT.Ctrl == 0) {
	if (this.c_EVTPlayer.EVT.CurFRM == 0) {
	this.c_Effect.CreateHorse_Eff((XVal + 0x5),(YVal + 0x20),Speed);
	// :cond_0
	}
	if (this.c_EVTPlayer.EVT.CurFRM == 6) {
	this.c_Effect.CreateHorse_Eff((XVal + 0x5),(YVal - 32),Speed);
	// :cond_1
	}
	}
	if ((this.c_EVTPlayer.EVT.Ctrl == 1 || this.c_EVTPlayer.EVT.Ctrl == 2) && (com.game.UnicornDash.C_OPhoneApp.cLib.getVBLCount() % 0x5) == 0) {
	// :cond_2
	this.c_Effect.CreateHorse_Eff(((this.c_EVTPlayer.m_FeetOffset_B + XVal) + 0x14),(YVal - 20),Speed);
	// :cond_3
	}
	return;
}

	private void MsgLoop() {
		if (!this.m_isMsgRun) {
		} else {
			int MSGCount = com.game.UnicornDash.C_OPhoneApp.cLib
					.getMessageMgr().GetMessageQueueLength();
			int i = 0;
			while (i < MSGCount) {
				oms.GameEngine.C_MSG Msg = com.game.UnicornDash.C_OPhoneApp.cLib
						.getMessageMgr().GetMessageQueue(i);
				int hWnd = Msg.GetMsgHWnd();
				int message = Msg.GetMsgMessage();
				int param = Msg.GetwParam();
				int cursorX = Msg.GetCursorX();
				int cursorY = Msg.GetCursorY();
				switch (hWnd) {
				case 10:
					switch (message) {
					case 3:
						com.game.UnicornDash.C_PUB.setSoundStatus();
						break;
					case 6:
						if (com.game.UnicornDash.C_Global.g_GameState == 7) {
//							com.game.UnicornDash.C_PUB.ShowAdView(true);
							com.game.UnicornDash.C_Media.StopSound(3);
							this.ClearGameBTN(6);
							this.c_GameBTN.CreateGameBTN(7, 190, 240);
							this.c_GameBTN.CreateGameBTN(8, 130, 240);
							this.c_GameBTN.CreateGameBTN(3, 70, 170);
							this.c_GameBTN.CreateGameBTN(4, 70, 240);
							this.c_GameBTN.CreateGameBTN(5, 70, 310);
							com.game.UnicornDash.C_PUB.setGameState(11);
						}
						break;
					case 7:
						if (this.c_EVTPlayer.EVT.Ctrl == 0) {
							com.game.UnicornDash.C_Media.PlaySound(3);
							// :cond_3
						}
//						com.game.UnicornDash.C_PUB.ShowAdView(false);
						this.ClearGameBTN(7);
						this.ClearGameBTN(8);
						this.ClearGameBTN(3);
						this.ClearGameBTN(4);
						this.ClearGameBTN(5);
						this.c_GameBTN.CreateGameBTN(6, 300, 50);
						com.game.UnicornDash.C_PUB.setGameState(7);
						break;
					case 8:
						this.m_isRun = false /* 0 */;
						com.game.UnicornDash.C_PUB.setGameState(10);
						break;
					case 4:
						com.game.UnicornDash.C_PUB.setMusicStatus();
						break;
					case 5:
						com.game.UnicornDash.C_PUB.setVibratorStatus();
						break;
					} // end of switch
					break;
				case 40:
					switch (message) {
					case 46:
					case 47:
						break;
					case 41:
						this.c_PropA.CreatePropA(param, cursorX, cursorY);
						break;
					case 42:
						com.game.UnicornDash.C_Global.g_PropACount = (com.game.UnicornDash.C_Global.g_PropACount + 0x1);
						this.AddScoreMain((com.game.UnicornDash.C_Global.g_PropACount * 0x64));
						this.c_Effect.CreatePropAScore_Eff(cursorX, cursorY,
								com.game.UnicornDash.C_Global.g_PropACount);
						break;
					case 43:
						this.c_Eidolon.CreateEidolon(param, cursorX, cursorY);
						break;
					case 44:
						com.game.UnicornDash.C_Global.g_EidolonCount = (com.game.UnicornDash.C_Global.g_EidolonCount + 0x1);
						this.AddScoreMain((com.game.UnicornDash.C_Global.g_EidolonCount * 0xa));
						this.c_Effect.CreateEidolonScore_Eff(cursorX, cursorY,
								com.game.UnicornDash.C_Global.g_EidolonCount);
						break;
					case 48:
						this.c_EVTPowerBall.CreatePowerBall(
								this.c_EVTPowerBall, cursorX, cursorY);
						break;
					case 49:
						this.c_EVTPowerBall.EVTCLR();
						break;
					case 45:
						this.setSceneDash();
						break;
					} // end of switch
				case 20:
					switch (message) {
					case 9:
						this.ExitEVENT();
						com.game.UnicornDash.C_PUB.setGameState(12);
						this.subGameLife();
//						com.game.UnicornDash.C_PUB.ShowAdView(true);
						break;
					default:
						com.game.UnicornDash.C_PUB.setGameState(message);
					} // end of switch
					break;
				case 30:
					com.game.UnicornDash.C_PUB.setGameState(10);
					com.game.UnicornDash.C_PUB.setGameMode(message);
					break;
				} // end of switch
					// :cond_2
					// }
				i = (i + 0x1);
				// goto :goto_1
				// :cond_1
			}
			com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr()
					.RemoveAllMsgQueue();
		}
		// goto :goto_0
		// :goto_0
		return;

	}

private void ReadTouch(){
	com.game.UnicornDash.C_OPhoneApp.cTouch.ReadTouch();
	com.game.UnicornDash.C_PUB.CHKTouch_Input();
	com.game.UnicornDash.C_OPhoneApp.cLib.getInput().ReadKeyBoard();
	if (com.game.UnicornDash.C_OPhoneApp.cLib.getInput().CHKUpKey(4)) {
	if (com.game.UnicornDash.C_Global.g_GameState == 7) {
	com.game.UnicornDash.C_Media.PlaySound(5);
	com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().SendMessage(10,6,0);
	// :cond_0
	}
	if (com.game.UnicornDash.C_Global.g_GameState == 11) {
	com.game.UnicornDash.C_Media.PlaySound(5);
	com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().SendMessage(10,7,0);
	// :cond_1
	}
	}
	return;
}

	private void ResultMain() {
		boolean CountEnd = false;
		;
		switch (com.game.UnicornDash.C_Global.g_GameLife) {
		case 0:
			this.m_ScoreCount3 = (this.m_ScoreCount3 + this.getCountSpeed(
					this.m_ScoreCount3,
					com.game.UnicornDash.C_Global.g_Dash3Score));
			if (this.m_ScoreCount3 > com.game.UnicornDash.C_Global.g_Dash3Score) {
				this.m_ScoreCount3 = com.game.UnicornDash.C_Global.g_Dash3Score;
				this.m_FinalCount = (this.m_FinalCount + this.getCountSpeed(
						this.m_FinalCount, this.m_FinalScore));
				if (this.m_FinalCount > this.m_FinalScore) {
					this.m_FinalCount = this.m_FinalScore;
					CountEnd = true;
				}
			}
			break;
		case 1:
			this.m_ScoreCount2 = (this.m_ScoreCount2 + this.getCountSpeed(
					this.m_ScoreCount2,
					com.game.UnicornDash.C_Global.g_Dash2Score));
			if (this.m_ScoreCount2 > com.game.UnicornDash.C_Global.g_Dash2Score) {
				this.m_ScoreCount2 = com.game.UnicornDash.C_Global.g_Dash2Score;
				CountEnd = true;
			}
			break;
		case 2:
			this.m_ScoreCount1 = (this.m_ScoreCount1 + this.getCountSpeed(
					this.m_ScoreCount1,
					com.game.UnicornDash.C_Global.g_Dash1Score));
			if (this.m_ScoreCount1 > com.game.UnicornDash.C_Global.g_Dash1Score) {
				this.m_ScoreCount1 = com.game.UnicornDash.C_Global.g_Dash1Score;
				CountEnd = true;
				break;
			} // end of switch
				// :cond_0
		}
		if (!CountEnd
				&& (com.game.UnicornDash.C_OPhoneApp.cLib.nVBLCount % 0x3) == 0) {
			com.game.UnicornDash.C_Media.PlaySound(7);
			// :cond_1
		}
		com.game.UnicornDash.C_PUB.showPauseSCR();
		com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(
				2130837718, 160, 240, 6);
		if (CountEnd) {
			if (com.game.UnicornDash.C_Global.g_GameLife == 0) {
				com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas()
						.WriteSprite(2130837721, 20, 240, 6);
			} else {
				com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas()
						.WriteSprite(2130837720, 20, 240, 6);
			}
			// goto/16 :goto_1
			// :goto_1
			if ((com.game.UnicornDash.C_OPhoneApp.cLib.nVBLCount % 0x10) > 8) {
				com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas()
						.WriteSprite(2130837719, 20, 76, 6);
				// :cond_2
			}
		}
		int x = 145;
		int y = 285;
		;
		switch (com.game.UnicornDash.C_Global.g_GameLife) {
		case 0:
			com.game.UnicornDash.C_PUB.ShowNum(this.m_ScoreCount3, (x + 0x0),
					y, 12, 1, 5, com.game.UnicornDash.C_DEF.ResultNUM2TBL, 7);
			if (this.m_FinalCount != 0) {
				com.game.UnicornDash.C_PUB.ShowNum(this.m_FinalCount, 70, 175,
						15, 1, 5, com.game.UnicornDash.C_DEF.ResultNUM1TBL, 7);
				// :cond_6
			}
			if (this.m_FinalCount >= com.game.UnicornDash.C_Save.g_HighScore) {
				com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas()
						.WriteSprite(2130837722, 300, 240, 6);
				// :cond_7
			}
		case 1:
			com.game.UnicornDash.C_PUB.ShowNum(this.m_ScoreCount2, (x + 0x1c),
					y, 12, 1, 5, com.game.UnicornDash.C_DEF.ResultNUM2TBL, 7);
		case 2:
			com.game.UnicornDash.C_PUB.ShowNum(this.m_ScoreCount1, (x + 0x38),
					y, 12, 1, 5, com.game.UnicornDash.C_DEF.ResultNUM2TBL, 7);
			break;
		} // end of switch
		com.game.UnicornDash.C_PUB.ShowNum(
				com.game.UnicornDash.C_Save.g_HighScore, 70, 320, 15, 1, 5,
				com.game.UnicornDash.C_DEF.ResultNUM1TBL, 7);
		if (CountEnd
				&& (com.game.UnicornDash.C_OPhoneApp.cTouch.CHKTouchDown() || com.game.UnicornDash.C_OPhoneApp.cLib
						.getInput().CHKUpKey(4))) {
			// :cond_3
			this.ExitEVENT();
			this.ClearACT();
			com.game.UnicornDash.C_Media.PlaySound(5);
			;
			switch (com.game.UnicornDash.C_Global.g_GameLife) {
			case 0:
				com.game.UnicornDash.C_PUB.setGameState(10);
				this.m_isRun = false /* 0 */;
				break;
			case 1:
			case 2:
				this.ExitEVENT();
				com.game.UnicornDash.C_PUB.setGameState(1);
				com.game.UnicornDash.C_OPhoneApp.cLib.ViewDark(64);
				break;
			} // end of switch
//			com.game.UnicornDash.C_PUB.ShowAdView(false);
			// :cond_4
		}
		return;
		// [OTHER] end local v2 #y:I
		// [OTHER] end local v12 #x:I

		// op;

	}

private void SCRPullCtrl(){
	int XVal = (((com.game.UnicornDash.C_Global.g_SceneFloat_X * 0x2) / 0x4) - 200);
	if (XVal < -280) {
	XVal = -280;
	// :cond_0
	}
	if (XVal > 0) {
	XVal = 0 /* 0 */;
	// :cond_1
	}
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().SetTextXVal(0,(XVal - (com.game.UnicornDash.C_Global.g_SceneDash_X / 0x2)));
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().SetTextYVal(0,(-48 - (com.game.UnicornDash.C_Global.g_SceneDash_Y / 0x2)));
	return;
}

private void SceneDashCtrl(){
	com.game.UnicornDash.C_Global.g_SceneDash_X = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_SceneDash_Y = 0 /* 0 */;
	if (com.game.UnicornDash.C_Global.g_SceneDash_Idx > 0) {
	com.game.UnicornDash.C_Global.g_SceneDash_X = com.game.UnicornDash.C_SceneNormal.SceneDashTBL[com.game.UnicornDash.C_Global.g_SceneDash_Idx];
	com.game.UnicornDash.C_Global.g_SceneDash_Y = com.game.UnicornDash.C_SceneNormal.SceneDashTBL[com.game.UnicornDash.C_Global.g_SceneDash_Idx];
	com.game.UnicornDash.C_Global.g_SceneDash_Idx = (com.game.UnicornDash.C_Global.g_SceneDash_Idx - 1);
	// :cond_0
	}
	return;
}

private void SceneFloatCtrl(){
	if (!this.c_EVTPlayer.EVT.Valid) {
	// :cond_0
	} else {
	if (this.c_EVTPlayer.EVT.Ctrl != 4) {
	int Show_X = ((this.c_EVTPlayer.EVT.XVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_X);
	int Cur_X = (this.c_EVTPlayer.EVT.XVal >> 0x10);
	int XInc = (this.c_EVTPlayer.EVT.XInc >> 0x10);
	if (this.c_EVTPlayer.EVT.Valid) {
	;
	switch(this.c_EVTPlayer.EVT.Ctrl){
	case 1:  case 2: 
	if (Show_X < 0) {
	Show_X = 0 /* 0 */;
	// :cond_5
	}
	int Rate = (Show_X / 0xa);
	
	if (com.game.UnicornDash.C_Global.g_SceneFloat_X > 250) {
	Rate = ((com.game.UnicornDash.C_Global.g_SceneFloat_X - 250) / 0xa);
	// :cond_6
	}
	if (Rate >= 64) {
	Rate = 63;
	// :cond_7
	}
	com.game.UnicornDash.C_Global.g_SceneFloat_X = (com.game.UnicornDash.C_Global.g_SceneFloat_X - (int)((double)(this.c_EVTPlayer.EVT.XInc >> 0x10) * com.game.UnicornDash.C_SceneNormal.ScaleTBL[Rate]));
	break;
	default:
	Cur_X = (Cur_X + com.game.UnicornDash.C_Global.g_SceneFloat_X);
	Rate = (Math.abs((Cur_X - 140)) / 0xa);
	if (Cur_X > 145) {
	com.game.UnicornDash.C_Global.g_SceneFloat_X = (com.game.UnicornDash.C_Global.g_SceneFloat_X - Rate);
	// :cond_2
	}
	if (Cur_X < 135) {
	com.game.UnicornDash.C_Global.g_SceneFloat_X = (com.game.UnicornDash.C_Global.g_SceneFloat_X + Rate);
	//[OTHER] end local v1           #Rate:I
	// :cond_3
	}
	} //end of switch
	//:pswitch_0
	if (Show_X > 300) {
	com.game.UnicornDash.C_Global.g_SceneFloat_X = (com.game.UnicornDash.C_Global.g_SceneFloat_X - (Show_X - 300));
	// :cond_4
	}
	if (com.game.UnicornDash.C_Global.g_SceneFloat_X > 400) {
	com.game.UnicornDash.C_Global.g_SceneFloat_X = 400;
	//goto somewhere; //maybe return,continue,break: goto :goto_0
	return;
	// op;
	
		}
		}
		}
		}
	// :goto_0
	return;
}

private void ShowEVENT(){
	if (this.c_EVTPlayer != null) {
	this.c_EVTPlayer.EVT.Status = (this.c_EVTPlayer.EVT.Status | 0x800);
	this.c_EVTPlayer.EVT.DispX = (((this.c_EVTPlayer.EVT.XVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_X) + -0x1e);
	this.c_EVTPlayer.EVT.DispY = (((this.c_EVTPlayer.EVT.YVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_Y) + 0x0);
	this.c_EVTPlayer.ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	// :cond_0
	}
	if (this.c_EVTPowerBall != null && this.c_EVTPowerBall.EVT.Valid) {
		if (this.c_EVTPowerBall.EVT.Ctrl == 0) {
		this.c_EVTPowerBall.EVT.Status = (this.c_EVTPowerBall.EVT.Status | 0x800);
		this.c_EVTPowerBall.EVT.DispX = (((this.c_EVTPowerBall.EVT.XVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_X) + -0x1e);
		this.c_EVTPowerBall.EVT.DispY = (((this.c_EVTPowerBall.EVT.YVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_Y) + 0x0);
		} else {
		int Offset_Y = 0;
		if (this.c_EVTPlayer.EVT.Ctrl == 3 && (this.c_EVTPlayer.EVT.Status & 32768) != 32768) {
		Offset_Y = (com.game.UnicornDash.C_SceneNormal.PowerBall_Dash_OffsetTBL[this.c_EVTPlayer.EVT.CurFRM] * 0xa);
		this.c_EVTPowerBall.EVT.ACTIdx = 2130837688;
		// :cond_9
		}
		this.c_EVTPowerBall.EVT.DispX = (this.c_EVTPlayer.EVT.DispX + 0x19);
		this.c_EVTPowerBall.EVT.DispY = ((this.c_EVTPlayer.EVT.DispY + Offset_Y) + 0x5);
			}
	// goto/16 :goto_0
	// :goto_0
	this.c_EVTPowerBall.ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	// :cond_1
	}
	
	if (this.c_EVTLand != null) {
	int i = 0;
	while (i < 5) {
		if (this.c_EVTLand[i].EVT.Valid) {
		this.c_EVTLand[i].EVT.Status = (this.c_EVTLand[i].EVT.Status | 0x800);
		this.c_EVTLand[i].EVT.DispX = ((((this.c_EVTLand[i].EVT.XVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_X) + com.game.UnicornDash.C_Global.g_SceneDash_X) + -0x1e);
		this.c_EVTLand[i].EVT.DispY = ((((this.c_EVTLand[i].EVT.YVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_Y) + com.game.UnicornDash.C_Global.g_SceneDash_Y) + 0x0);
		int Idx = 0;
		int Ctrl = this.c_EVTLand[i].EVT.Ctrl;
		while (true) {
			int Act = this.c_EVTLand[i].EVT.ACTPtr[Ctrl][Idx];
			if(Act == -1){break;}
			if (this.chkACTIsShow_Y(Act,this.c_EVTLand[i].EVT.DispY)) {
			if (Ctrl == 6) {
			if (this.chkACTIsShow_X(Act,this.c_EVTLand[i].EVT.DispX)) {
			com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(Act,this.c_EVTLand[i].EVT.DispX,this.c_EVTLand[i].EVT.DispY,this.c_EVTLand[i].EVT.Attrib);
			} else {
			com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(Act,this.c_EVTLand[i].EVT.DispX,this.c_EVTLand[i].EVT.DispY,this.c_EVTLand[i].EVT.Attrib);
			// goto :goto_7
			//[OTHER] end local v0           #Act:I
			//[OTHER] end local v1           #Ctrl:I
			//[OTHER] end local v2           #Idx:I
				}
			// :cond_d
			}
			}
			// :goto_7
			Idx = (Idx + 0x1);
		// goto :goto_6
		// :cond_c
		}
		//[OTHER] end local v0           #Act:I
		//[OTHER] end local v1           #Ctrl:I
		//[OTHER] end local v2           #Idx:I
		// :cond_b
		}
		i = (i + 0x1);
		// goto/16 :goto_1
	//continue someWhile; //if (i < 5) {
	// :cond_a
	}
	//[OTHER] end local v4           #i:I
	// :cond_2
	}
	if (this.c_EVTPropA != null) {
	int i = 0 /* 0 */;
	
	while (i < 5) {
	this.c_EVTPropA[i].EVT.Status = (this.c_EVTPropA[i].EVT.Status | 0x800);
	this.c_EVTPropA[i].EVT.DispX = ((((this.c_EVTPropA[i].EVT.XVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_X) + com.game.UnicornDash.C_Global.g_SceneDash_X) + -0x1e);
	this.c_EVTPropA[i].EVT.DispY = ((((this.c_EVTPropA[i].EVT.YVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_Y) + com.game.UnicornDash.C_Global.g_SceneDash_Y) + 0x0);
	this.c_EVTPropA[i].ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto/16 :goto_2
	// :cond_f
	}
	//[OTHER] end local v4           #i:I
	// :cond_3
	}
	if (this.c_EVTGameBTN != null) {
	int i = 0 /* 0 */;
	
	while (i < 5) {
	this.c_EVTGameBTN[i].ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto/16 :goto_3
	// :cond_10
	}
	//[OTHER] end local v4           #i:I
	// :cond_4
	}
	if (this.c_EVTEidolon != null) {
	int i = 0 /* 0 */;
	
	while (i < 2) {
	this.c_EVTEidolon[i].EVT.Status = (this.c_EVTEidolon[i].EVT.Status | 0x800);
	this.c_EVTEidolon[i].EVT.DispX = ((((this.c_EVTEidolon[i].EVT.XVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_X) + com.game.UnicornDash.C_Global.g_SceneDash_X) + -0x1e);
	this.c_EVTEidolon[i].EVT.DispY = ((((this.c_EVTEidolon[i].EVT.YVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_Y) + com.game.UnicornDash.C_Global.g_SceneDash_Y) + 0x0);
	this.c_EVTEidolon[i].ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
	i = (i + 0x1);
	// goto/16 :goto_4
	// :cond_11
	}
	//[OTHER] end local v4           #i:I
	// :cond_5
	}
	
	
	if (this.c_EVTEffect != null) {
	int i = 0 /* 0 */;
	
	while (i < 10) {
		
		switch(this.c_EVTEffect[i].EVT.Ctrl){
		case 0:  case 3: 
			this.c_EVTEffect[i].EVT.Status = (this.c_EVTEffect[i].EVT.Status | 0x800);
			this.c_EVTEffect[i].EVT.DispX = ((((this.c_EVTEffect[i].EVT.XVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_X) + com.game.UnicornDash.C_Global.g_SceneDash_X) + -0x1e);
			this.c_EVTEffect[i].EVT.DispY = ((((this.c_EVTEffect[i].EVT.YVal >> 0x10) + com.game.UnicornDash.C_Global.g_SceneFloat_Y) + com.game.UnicornDash.C_Global.g_SceneDash_Y) + 0x0);
			break;
		} //end of switch
		
		this.c_EVTEffect[i].ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
		i = (i + 0x1);
		
		
	// :cond_6
	}
	if (com.game.UnicornDash.C_Global.g_GameState == 7) {
		this.c_DashBTN.ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
		this.c_JumpBTN.ShowEVENT(com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas());
		// :cond_7
		}
		return;
	}
	//[OTHER] end local v3           #Offset_Y:I
	
	
	
	
}

private void ShowLife(){
	int x = 300;
	int y = (com.game.UnicornDash.C_Global.g_ScreenScale_3_1 + 0x17c);
	int s = 30;
	int i = 0;
	while (i < 3) {
	if (com.game.UnicornDash.C_Global.g_GameLife > i) {
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(2130837515,x,((i * s) + y),5);
	} else {
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(2130837516,x,((i * s) + y),5);
		}
	// goto :goto_1
	// :goto_1
	i = (i + 0x1);
	// goto :goto_0
	// :cond_0
	}
	return;
}

private void ShowScore(){
	if (com.game.UnicornDash.C_Global.g_GameState == 7) {
	com.game.UnicornDash.C_Global.g_RunLength = (com.game.UnicornDash.C_Global.g_RunLength + (long)this.getLandSpeed());
	// :cond_0
	}
	com.game.UnicornDash.C_PUB.ShowNum(this.getGameScore(),300,240,15,0,5,com.game.UnicornDash.C_DEF.RunLengthNumTBL,5);
	return;
}

private boolean chkACTIsShow_X(int Act,int XVal){
	int XHitL = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().GetSpriteXHitL(Act);
	int XHitR = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().GetSpriteXHitR(Act);
	int X1 = (XVal - XHitL);
	int X2 = (XVal + XHitR);
	if (X1 >= 0 && X1 <= 320) {
	;
	return true /* 1 */;
	// :cond_0
	} else if (X2 >= 0 && X2 <= 320) {
	;
	return true /* 1 */;
	// goto :goto_0
	} else {
	;
	return false /* 0 */;
		}
	// goto :goto_0
	// :goto_0
	//return 1;
}

private boolean chkACTIsShow_Y(int Act,int YVal){
	int Area = ((com.game.UnicornDash.C_Global.g_scrHeight - 480) / 0x2);
	int YHitU = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().GetSpriteYHitU(Act);
	int YHitD = com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().GetSpriteYHitD(Act);
	int Y1 = (YVal + YHitD);
	int Y2 = (YVal - YHitU);
	//com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas() = -Area;
	if (Y1 >= -Area && Y1 <= (Area + 0x1e0)) {
	;
	return true /* 1 */;
	} else {
	//1 = -Area;
	if (Y2 >= -1 && Y2 <= (Area + 0x1e0)) {
	;
	return true /* 1 */;
	// goto :goto_0
	} else {
	;
	return false /* 0 */;
		}
		}
	// goto :goto_0
	// :goto_0
	//return 1;
}

private int getCountSpeed(int CurScore,int TarScore){
	int Speed = 1;
	if ((TarScore - CurScore) > 10) {
	Speed = (Speed + 0x1);
	// :cond_0
	}
	if ((TarScore - CurScore) > 100) {
	Speed = (Speed + 0xa);
	// :cond_1
	}
	if ((TarScore - CurScore) > 1000) {
	Speed = (Speed + 0x64);
	// :cond_2
	}
	if ((TarScore - CurScore) > 10000) {
	Speed = (Speed + 0x3e8);
	// :cond_3
	}
	if (com.game.UnicornDash.C_PUB.CHKisTouch()) {
	;
	return Speed;
	} else {
	;
	return Speed;
		}
	// goto :goto_0
	// :goto_0
	//return Speed;
}

private int getGameScore(){
	;
	return (int)((com.game.UnicornDash.C_Global.g_RunLength >> 16) / 5);
	//return (int)((com.game.UnicornDash.C_Global.g_RunLength >> 16) / 5);
}

private int getLandSpeed(){
	;
	return (com.game.UnicornDash.C_Global.g_LandMoveSpeed + com.game.UnicornDash.C_Global.g_DashSpeedArea);
	//return (com.game.UnicornDash.C_Global.g_LandMoveSpeed + com.game.UnicornDash.C_Global.g_DashSpeedArea);
}

private void setSceneDash(){
	com.game.UnicornDash.C_Global.g_SceneDash_Idx = 20;
	return;
}

private void showHightRecord(){
	if (com.game.UnicornDash.C_Global.g_GameState != 7) {
	// :cond_0
	} else {
	com.game.UnicornDash.C_Global.g_CurDistance = (com.game.UnicornDash.C_Global.g_CurDistance + (long)this.getLandSpeed());
	int RunLength = (int)(com.game.UnicornDash.C_Global.g_CurDistance >> 16);
	int YVal = (com.game.UnicornDash.C_Save.g_HighDistance - RunLength);
	if (com.game.UnicornDash.C_Save.g_HighDistance == 0 || YVal < -48 || YVal > 576) {
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(2130837537,0,YVal,5);
	com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().WriteSprite(2130837538,160,YVal,5);
		}
		}
	// goto :goto_0
	// :goto_0
	return;
}

private void subGameLife(){
	int CurDistance = (int)(com.game.UnicornDash.C_Global.g_RunLength >> 16);
	if (CurDistance > com.game.UnicornDash.C_Save.g_HighDistance) {
	com.game.UnicornDash.C_Save.g_HighDistance = CurDistance;
	// :cond_0
	}
	if (com.game.UnicornDash.C_Global.g_GameLife != 0) {
	com.game.UnicornDash.C_Global.g_GameLife = (com.game.UnicornDash.C_Global.g_GameLife - 1);
	// :cond_1
	}
	;
	switch(com.game.UnicornDash.C_Global.g_GameLife){
	case 0: 
	this.m_ScoreCount1 = com.game.UnicornDash.C_Global.g_Dash1Score;
	this.m_ScoreCount2 = com.game.UnicornDash.C_Global.g_Dash2Score;
	this.m_ScoreCount3 = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_Dash3Score = this.getGameScore();
	this.m_FinalScore = ((com.game.UnicornDash.C_Global.g_Dash1Score + com.game.UnicornDash.C_Global.g_Dash2Score) + com.game.UnicornDash.C_Global.g_Dash3Score);
	if (this.m_FinalScore > com.game.UnicornDash.C_Save.g_HighScore) {
	com.game.UnicornDash.C_Save.g_HighScore = this.m_FinalScore;
	}
	break;
	case 1: 
	this.m_ScoreCount1 = com.game.UnicornDash.C_Global.g_Dash1Score;
	this.m_ScoreCount2 = 0 /* 0 */;
	this.m_ScoreCount3 = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_Dash2Score = this.getGameScore();
	break;
	case 2: 
	this.m_ScoreCount1 = 0 /* 0 */;
	this.m_ScoreCount2 = 0 /* 0 */;
	this.m_ScoreCount3 = 0 /* 0 */;
	com.game.UnicornDash.C_Global.g_Dash1Score = this.getGameScore();
	break;
	} //end of switch
	// :cond_2
	this.m_FinalCount = 0 /* 0 */;
	com.game.UnicornDash.C_Save.UpdataData();
	return;
	// op;
	
}
// virtual methods

public void ExitEVENT(){
	if (this.c_EVTPlayer != null) {
	this.c_EVTPlayer.EVTCLR();
	// :cond_0
	}
	if (this.c_EVTLand != null) {
	int i = 0;
	while (i < 5) {
	this.c_EVTLand[i].EVTCLR();
	i = (i + 0x1);
	// goto :goto_0
	// :cond_5
	}
	//[OTHER] end local v0           #i:I
	// :cond_1
	}
	if (this.c_EVTGameBTN != null) {
	int i = 0 /* 0 */;
	
	while (i < 5) {
	this.c_EVTGameBTN[i].EVTCLR();
	i = (i + 0x1);
	// goto :goto_1
	// :cond_6
	}
	//[OTHER] end local v0           #i:I
	// :cond_2
	}
	if (this.c_EVTPropA != null) {
	int i = 0 /* 0 */;
	
	while (i < 5) {
	this.c_EVTPropA[i].EVTCLR();
	i = (i + 0x1);
	// goto :goto_2
	// :cond_7
	}
	//[OTHER] end local v0           #i:I
	// :cond_3
	}
	if (this.c_EVTEidolon != null) {
	int i = 0 /* 0 */;
	
	while (i < 2) {
	this.c_EVTEidolon[i].EVTCLR();
	i = (i + 0x1);
	// goto :goto_3
	// :cond_8
	}
	//[OTHER] end local v0           #i:I
	// :cond_4
	}
	return;
	
}

	public void GameMain() {
		this.Initialize();
		while (this.m_isRun) {
			// this.ExitEVENT();
			// com.game.UnicornDash.C_OPhoneApp.cLib.ViewDark(64);
			// com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().SendMessage(0,30,5);
			// return;
			// } else {
			this.ClearACT();
			this.ReadTouch();
			;
			switch (com.game.UnicornDash.C_Global.g_GameState) {
			case 1:
				this.InitAgain();
				com.game.UnicornDash.C_PUB.setGameState(3);
				break;
			case 3:
				com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas().LoadText(
						com.game.UnicornDash.C_DEF.SceSceneTBL[this.m_SCRIdx],
						0, 0);
				com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas()
						.SetTextYVal(0, -48);
				this.SCRPullCtrl();
				this.ShowEVENT();
				this.ShowScore();
				this.ShowLife();
				com.game.UnicornDash.C_OPhoneApp.cLib.ViewOpen(64);
				com.game.UnicornDash.C_PUB.setGameState(7);
				break;
			case 4:
				this.InitAgain();
				com.game.UnicornDash.C_PUB.setGameState(7);
				break;
			case 7:
				this.LandMain();
				this.SceneFloatCtrl();
				this.SCRPullCtrl();
				this.MakeHorseEff();
				this.c_Effect.CreateCloud_Eff(160, 240, this.getLandSpeed());
				break;
			case 11:
				com.game.UnicornDash.C_PUB.showPauseSCR();
				com.game.UnicornDash.C_OPhoneApp.cLib.getGameCanvas()
						.WriteSprite(2130837677, 260, 240, 6);
				break;
			case 12:
				this.ResultMain();
				break;
			case 10:
				this.m_isRun = false /* 0 */;
				break;
			} // end of switch
				// :pswitch_0
			this.ShowScore();
			this.ShowLife();
			this.showHightRecord();
			this.SceneDashCtrl();
			this.MsgLoop();
			this.ExecEVENT();
			this.ShowEVENT();
			com.game.UnicornDash.C_OPhoneApp.cLib.WaitBLK();
			// goto somewhere; //maybe return,continue,break: goto :goto_0
			// op;

		}

		this.ExitEVENT();
		com.game.UnicornDash.C_OPhoneApp.cLib.ViewDark(64);
		com.game.UnicornDash.C_OPhoneApp.cLib.getMessageMgr().SendMessage(0,
				30, 5);
	}

}
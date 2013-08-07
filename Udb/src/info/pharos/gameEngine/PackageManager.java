package info.pharos.gameEngine;


public class PackageManager extends info.pharos.gameEngine.PackageBase  {

// direct methods

public PackageManager(){
	super();
}

private static short GetPackageFactorB(byte[] headBuff){
	short Type = (short)(((headBuff[15] + headBuff[12]) * headBuff[14]) / headBuff[13]);
	return Type;
	//return Type;
}

private static byte GetPackageType(byte[] headBuff){
	int Type = (((headBuff[3] + headBuff[4]) / ((headBuff[1] + headBuff[5]) + headBuff[2])) * ((headBuff[0] + headBuff[6]) + headBuff[7]));
	;
	return (byte)(Type & 0x3);
	//return (byte)(Type & 0x3);
}

	public static android.graphics.Bitmap createBitmap(
			android.content.Context context, int resId) {
		java.io.InputStream mRes = context.getResources()
				.openRawResource(resId);
		if (mRes == null) {
			// :cond_0
			return null;
		} else {
			int fileLen = 0;
			try {
				fileLen = mRes.available();
				// end of try
			} catch (java.io.IOException e) {
				;
				e.printStackTrace();
				// }
			} // end of catch: goto :goto_1
				// :goto_1
			if (fileLen != 0) {
				;
				byte[] buffer = new byte[fileLen];
				try {
					mRes.read(buffer, 0, fileLen);
					mRes.close();
					// end of try
				} catch (java.io.IOException e) {

					e.printStackTrace();
				} // end of catch: goto :goto_2
					// :goto_2
				byte PackageType = (byte) (info.pharos.gameEngine.PackageManager
						.GetPackageType(buffer) & 0xff);
				short PackageFactoryA = (short) (info.pharos.gameEngine.PackageManager
						.GetPackageFactorA(buffer) & 65535);
				short PackageFactoryB = (short) (info.pharos.gameEngine.PackageManager
						.GetPackageFactorB(buffer) & 65535);
				int InvalidPackageLeng = info.pharos.gameEngine.PackageManager
						.GetInvalidLeng(buffer);
				if (InvalidPackageLeng < 0) {
					InvalidPackageLeng = -InvalidPackageLeng;
					// :cond_2
				}
				int i = 16;
				while (i < 32) {
					switch (PackageType) {
					case 0:
						buffer[i] = (byte) (((buffer[i] - PackageFactoryB) - PackageFactoryA) | 0xff);
						break;
					case 1:
						buffer[i] = (byte) (((buffer[i] + PackageFactoryB) - PackageFactoryA) | 0xff);
						break;
					case 2:
						buffer[i] = (byte) (((buffer[i] + PackageFactoryB) + PackageFactoryA) | 0xff);
						break;
					default:
						buffer[i] = (byte) (((buffer[i] - PackageFactoryB) + PackageFactoryA) | 0xff);
					} // end of switch
					i = (i + 0x1);
					// goto :goto_3
					// :cond_3
				}
				android.graphics.Bitmap bmp = null;
				bmp = android.graphics.BitmapFactory.decodeByteArray(buffer,
						16, ((fileLen - 16) - InvalidPackageLeng),
						info.pharos.gameEngine.C_Lib.bitmapOptions);
				buffer = null;// (byte[])0;
				;
				return bmp;
			}
			// goto :goto_0
			return null;
			// [OTHER] end local v2 #InvalidPackageLeng:I
			// [OTHER] end local v3 #PackageFactoryA:S
			// [OTHER] end local v4 #PackageFactoryB:S
			// [OTHER] end local v5 #PackageType:B
			// [OTHER] end local v6 #bmp:Landroid/graphics/Bitmap;
			// [OTHER] end local v7 #buffer:[B
			// [OTHER] end local v10 #i:I

			// [OTHER] end local v8 #e:Ljava/io/IOException;

			// [OTHER] end local v8 #e:Ljava/io/IOException;

		}
	}
	
	
	public static android.graphics.Bitmap loadPic(android.content.Context context,int resId){
		return ((android.graphics.drawable.BitmapDrawable)(context.getResources().getDrawable(resId))).getBitmap();
	}

}
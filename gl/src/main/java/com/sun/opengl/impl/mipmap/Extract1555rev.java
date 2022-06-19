package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;

public class Extract1555rev implements Extract {

	public void extract(boolean arg0, ByteBuffer arg1, float[] arg2) {
		boolean var4 = false;
		int var5;
		if (arg0) {
			var5 = Mipmap.GLU_SWAP_2_BYTES(arg1.getShort()) & 0xFFFF;
		} else {
			var5 = arg1.getShort() & 0xFFFF;
		}
		arg2[0] = (float) (var5 & 0x1F) / 31.0F;
		arg2[1] = (float) (var5 >> 5 & 0x1) / 31.0F;
		arg2[2] = (float) (var5 >> 10 & 0x1F) / 31.0F;
		arg2[3] = var5 >> 15 & 0x1;
	}

	public void shove(float[] arg0, int arg1, ByteBuffer arg2) {
		assert arg0[0] >= 0.0F && arg0[0] <= 1.0F;
		assert arg0[1] >= 0.0F && arg0[1] <= 1.0F;
		assert arg0[2] >= 0.0F && arg0[2] <= 1.0F;
		assert arg0[3] >= 0.0F && arg0[3] <= 1.0F;
		int var4 = (int) (arg0[0] * 31.0F + 0.5F) & 0x1F;
		int var5 = var4 | ((int) (arg0[1] * 31.0F + 0.5F) & 0x1F) << 5;
		int var6 = var5 | ((int) (arg0[2] * 31.0F + 0.5F) & 0x1F) << 10;
		int var7 = var6 | ((int) (arg0[3] + 0.5F) & 0x1) << 15;
		arg2.asShortBuffer().put(arg1, (short) var7);
	}
}
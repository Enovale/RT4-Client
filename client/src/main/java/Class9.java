import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class9 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!wa;")
	private Class3_Sub15 aClass3_Sub15_1;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "[Lclient!bg;")
	private Class14_Sub1[] aClass14_Sub1Array1;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "Lclient!k;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!jb;")
	private final Class73 aClass73_1;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!pm;")
	private Class3_Sub2_Sub5_Sub2 aClass3_Sub2_Sub5_Sub2_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!jb;Lclient!k;)V")
	public Class9(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class80 arg1) {
		this.aClass80_1 = arg1;
		this.aClass73_1 = arg0;
		if (!this.aClass73_1.method2326()) {
			this.aClass3_Sub2_Sub5_Sub2_1 = this.aClass73_1.method2330(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z")
	public final boolean method178() {
		if (this.aClass3_Sub15_1 != null) {
			return true;
		}
		if (this.aClass3_Sub2_Sub5_Sub2_1 == null) {
			if (this.aClass73_1.method2326()) {
				return false;
			}
			this.aClass3_Sub2_Sub5_Sub2_1 = this.aClass73_1.method2330(255, (byte) 0, 255, true);
		}
		if (this.aClass3_Sub2_Sub5_Sub2_1.aBoolean226) {
			return false;
		} else {
			this.aClass3_Sub15_1 = new Class3_Sub15(this.aClass3_Sub2_Sub5_Sub2_1.method3554());
			this.aClass14_Sub1Array1 = new Class14_Sub1[(this.aClass3_Sub15_1.aByteArray40.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public final void method179() {
		if (this.aClass14_Sub1Array1 == null) {
			return;
		}
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.aClass14_Sub1Array1.length; local13++) {
			if (this.aClass14_Sub1Array1[local13] != null) {
				this.aClass14_Sub1Array1[local13].method537();
			}
		}
		for (local13 = 0; local13 < this.aClass14_Sub1Array1.length; local13++) {
			if (this.aClass14_Sub1Array1[local13] != null) {
				this.aClass14_Sub1Array1[local13].method534();
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IILclient!ge;Lclient!ge;)Lclient!bg;")
	public final Class14_Sub1 method180(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) Class49 arg2) {
		return this.method188(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ge;IIZLclient!ge;)Lclient!bg;")
	private Class14_Sub1 method188(@OriginalArg(0) Class49 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class49 arg2) {
		if (this.aClass3_Sub15_1 == null) {
			throw new RuntimeException();
		}
		this.aClass3_Sub15_1.anInt2792 = arg1 * 8 + 5;
		if (this.aClass3_Sub15_1.aByteArray40.length <= this.aClass3_Sub15_1.anInt2792) {
			throw new RuntimeException();
		} else if (this.aClass14_Sub1Array1[arg1] == null) {
			@Pc(56) int local56 = this.aClass3_Sub15_1.method2174();
			@Pc(61) int local61 = this.aClass3_Sub15_1.method2174();
			@Pc(75) Class14_Sub1 local75 = new Class14_Sub1(arg1, arg0, arg2, this.aClass73_1, this.aClass80_1, local56, local61, true);
			this.aClass14_Sub1Array1[arg1] = local75;
			return local75;
		} else {
			return this.aClass14_Sub1Array1[arg1];
		}
	}
}
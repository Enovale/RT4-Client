import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "Lclient!sc;")
	private Class133 aClass133_14;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)I")
	public final int method2798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass133_14 == null) {
			return arg1;
		} else {
			@Pc(29) Class3_Sub21 local29 = (Class3_Sub21) this.aClass133_14.method3863((long) arg0);
			return local29 == null ? arg1 : local29.anInt3141;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!wa;IB)V")
	private void method2799(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(17) int local17 = arg0.method2229();
		@Pc(25) int local25;
		if (this.aClass133_14 == null) {
			local25 = Static165.method3164(local17);
			this.aClass133_14 = new Class133(local25);
		}
		for (local25 = 0; local25 < local17; local25++) {
			@Pc(45) boolean local45 = arg0.method2229() == 1;
			@Pc(49) int local49 = arg0.method2220();
			@Pc(58) Class3 local58;
			if (local45) {
				local58 = new Class3_Sub30(arg0.method2202());
			} else {
				local58 = new Class3_Sub21(arg0.method2174());
			}
			this.aClass133_14.method3862(local58, (long) local49);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!na;BI)Lclient!na;")
	public final Class100 method2802(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass133_14 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub30 local16 = (Class3_Sub30) this.aClass133_14.method3863((long) arg1);
			return local16 == null ? arg0 : local16.aClass100_980;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!wa;)V")
	public final void method2806(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2229();
			if (local5 == 0) {
				return;
			}
			this.method2799(arg0, local5);
		}
	}
}
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class69 {

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Lclient!ab;")
	private Class3 aClass3_110;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!ab;")
	public final Class3 aClass3_109 = new Class3();

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class69() {
		this.aClass3_109.aClass3_223 = this.aClass3_109;
		this.aClass3_109.aClass3_222 = this.aClass3_109;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public final void method2278() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_109.aClass3_222;
			if (local5 == this.aClass3_109) {
				this.aClass3_110 = null;
				return;
			}
			local5.method4658();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Lclient!ab;")
	public final Class3 method2279() {
		@Pc(7) Class3 local7 = this.aClass3_109.aClass3_223;
		if (this.aClass3_109 == local7) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local7.aClass3_223;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLclient!ab;)V")
	public final void method2282(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_223 != null) {
			arg0.method4658();
		}
		arg0.aClass3_222 = this.aClass3_109;
		arg0.aClass3_223 = this.aClass3_109.aClass3_223;
		arg0.aClass3_223.aClass3_222 = arg0;
		arg0.aClass3_222.aClass3_223 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!ab;)V")
	public final void method2283(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_223 != null) {
			arg0.method4658();
		}
		arg0.aClass3_222 = this.aClass3_109.aClass3_222;
		arg0.aClass3_223 = this.aClass3_109;
		arg0.aClass3_223.aClass3_222 = arg0;
		arg0.aClass3_222.aClass3_223 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)Lclient!ab;")
	public final Class3 method2286() {
		@Pc(13) Class3 local13 = this.aClass3_110;
		if (this.aClass3_109 == local13) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local13.aClass3_223;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lclient!ab;")
	public final Class3 method2287() {
		@Pc(3) Class3 local3 = this.aClass3_109.aClass3_222;
		if (this.aClass3_109 == local3) {
			return null;
		} else {
			local3.method4658();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)Lclient!ab;")
	public final Class3 method2288() {
		@Pc(12) Class3 local12 = this.aClass3_110;
		if (local12 == this.aClass3_109) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local12.aClass3_222;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)Lclient!ab;")
	public final Class3 method2289() {
		@Pc(3) Class3 local3 = this.aClass3_109.aClass3_222;
		if (this.aClass3_109 == local3) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local3.aClass3_222;
			return local3;
		}
	}
}
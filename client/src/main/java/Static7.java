import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
	public static int anInt986;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!n;")
	public static final Class99 aClass99_5 = new Class99(2);

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
	public static final int[] anIntArray75 = new int[3500];

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!na;")
	private static final Class100 aClass100_189 = Static28.method790("glow3:");

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	public static int anInt983 = 0;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!ih;")
	public static final Class69 aClass69_32 = new Class69();

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Lclient!na;")
	public static Class100 aClass100_190 = aClass100_189;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "Lclient!na;")
	public static final Class100 aClass100_191 = aClass100_189;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
	public static int anInt985 = 0;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!na;")
	public static final Class100 aClass100_192 = Static28.method790("Veuillez commencer par supprimer ");

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V")
	public static void method842(@OriginalArg(1) boolean arg0) {
		Static107.method2261();
		if (Static244.anInt5370 != 30 && Static244.anInt5370 != 25) {
			return;
		}
		Static131.anInt3251++;
		if (Static131.anInt3251 < 50 && !arg0) {
			return;
		}
		Static131.anInt3251 = 0;
		if (!Static224.aBoolean247 && Static124.aClass95_2 != null) {
			Static6.aClass3_Sub15_Sub1_1.method2242(93);
			try {
				Static124.aClass95_2.method2830(Static6.aClass3_Sub15_Sub1_1.aByteArray40, Static6.aClass3_Sub15_Sub1_1.anInt2792);
				Static6.aClass3_Sub15_Sub1_1.anInt2792 = 0;
			} catch (@Pc(53) IOException local53) {
				Static224.aBoolean247 = true;
			}
		}
		Static107.method2261();
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static void method843() {
		if (Static118.aClass13_15 != null || Static105.aClass13_14 != null) {
			return;
		}
		@Pc(20) int local20 = Static150.anInt3585;
		@Pc(93) int local93;
		@Pc(99) int local99;
		if (!Static60.aBoolean108) {
			if (local20 == 1 && Static231.anInt5204 > 0) {
				@Pc(37) short local37 = Static39.aShortArray6[Static231.anInt5204 - 1];
				if (local37 == 25 || local37 == 23 || local37 == 48 || local37 == 7 || local37 == 13 || local37 == 47 || local37 == 5 || local37 == 43 || local37 == 35 || local37 == 58 || local37 == 22 || local37 == 1006) {
					local93 = Static196.anIntArray408[Static231.anInt5204 - 1];
					local99 = Static56.anIntArray142[Static231.anInt5204 - 1];
					@Pc(103) Class13 local103 = Static5.method32(local99);
					@Pc(106) Class3_Sub4 local106 = Static36.method940(local103);
					if (local106.method511() || local106.method504()) {
						Static78.anInt2145 = 0;
						Static123.aBoolean155 = false;
						if (Static118.aClass13_15 != null) {
							Static43.method1143(Static118.aClass13_15);
						}
						Static118.aClass13_15 = Static5.method32(local99);
						Static149.anInt3554 = anInt985;
						Static206.anInt4773 = Static60.anInt1893;
						Static4.anInt36 = local93;
						Static43.method1143(Static118.aClass13_15);
						return;
					}
				}
			}
			if (local20 == 1 && (Static116.anInt2952 == 1 && Static231.anInt5204 > 2 || Static277.method4640(Static231.anInt5204 - 1))) {
				local20 = 2;
			}
			if (local20 == 2 && Static231.anInt5204 > 0 || Static162.anInt3953 == 1) {
				Static226.method3901();
			}
			if (local20 == 1 && Static231.anInt5204 > 0 || Static162.anInt3953 == 2) {
				Static59.method1372();
			}
			return;
		}
		@Pc(204) int local204;
		if (local20 != 1) {
			local93 = Static223.anInt5032;
			local204 = Static215.anInt4873;
			if (local204 < Static183.anInt4271 - 10 || local204 > Static24.anInt761 + Static183.anInt4271 + 10 || Static229.anInt5138 - 10 > local93 || local93 > Static13.anInt436 + Static229.anInt5138 + 10) {
				Static60.aBoolean108 = false;
				Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
			}
		}
		if (local20 != 1) {
			return;
		}
		local204 = Static183.anInt4271;
		local93 = Static229.anInt5138;
		local99 = Static24.anInt761;
		@Pc(265) int local265 = anInt985;
		@Pc(267) int local267 = Static60.anInt1893;
		@Pc(269) int local269 = -1;
		for (@Pc(271) int local271 = 0; local271 < Static231.anInt5204; local271++) {
			@Pc(289) int local289;
			if (Static261.aBoolean298) {
				local289 = (Static231.anInt5204 - local271 - 1) * 15 + local93 + 35;
			} else {
				local289 = (Static231.anInt5204 - local271 - 1) * 15 + local93 + 31;
			}
			if (local265 > local204 && local204 + local99 > local265 && local289 - 13 < local267 && local289 + 3 > local267) {
				local269 = local271;
			}
		}
		if (local269 != -1) {
			Static103.method2232(local269);
		}
		Static60.aBoolean108 = false;
		Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
	}
}

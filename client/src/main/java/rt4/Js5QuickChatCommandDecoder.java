package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Js5QuickChatCommandDecoder implements QuickChatCommandDecoder {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[IIJ)Lclient!na;")
	@Override
	public final JagString method30(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == 0) {
			@Pc(12) EnumType local12 = EnumTypeList.get(arg1[0]);
			return local12.getString((int) arg2);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(31) ObjType local31 = ObjTypeList.get((int) arg2);
			return local31.name;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return EnumTypeList.get(arg1[0]).getString((int) arg2);
		} else {
			return null;
		}
	}
}
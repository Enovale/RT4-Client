import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public interface Interface3 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[IIJ)Lclient!na;")
	Class100 method30(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2);
}
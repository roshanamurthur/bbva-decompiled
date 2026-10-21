package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class uz {
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArrCopyOf;
        int i13 = ~i11;
        int i14 = (((~((~i10) | i12)) | i13) * (-318)) + (i11 * (-317)) + (i10 * 319);
        int i15 = ~(i13 | i12);
        int i16 = ~i12;
        if ((((~(i10 | i11 | i12)) | (~(i13 | i16 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i15 | (~(i16 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i14 != 1) {
            ru ruVar = (ru) objArr[0];
            if (ruVar instanceof rp) {
                rp rpVar = (rp) ruVar;
                return new rp((sg) rp.setY(new Object[]{rpVar}, -1859324063, 1859324063, System.identityHashCode(rpVar)));
            }
            if (ruVar instanceof rt) {
                return new rt(((rt) ruVar).setCompoundDrawableTintBlendMode());
            }
            throw new NoWhenBranchMatchedException();
        }
        rs rsVar = (rs) objArr[0];
        Intrinsics.checkNotNullParameter(rsVar, "");
        if (rsVar instanceof rn) {
            return new rn(((rn) rsVar).setX());
        }
        if (!(rsVar instanceof rr)) {
            if (!(rsVar instanceof rw)) {
                throw new NoWhenBranchMatchedException();
            }
            rw rwVar = (rw) rsVar;
            byte[] dividerPadding = rwVar.setDividerPadding();
            byte[] bArrCopyOf2 = Arrays.copyOf(dividerPadding, dividerPadding.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "");
            return new rw(bArrCopyOf2, rwVar.setX(), rwVar.setOnFocusChangeListener());
        }
        rr rrVar = (rr) rsVar;
        ru ruVar2 = (ru) setCompoundDrawableTintBlendMode(new Object[]{rrVar.setOnFocusChangeListener()}, 263014150, -263014150, (int) System.currentTimeMillis());
        byte[] x4 = rrVar.setX();
        byte[] bArrCopyOf3 = Arrays.copyOf(x4, x4.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf3, "");
        sa compoundDrawableTintBlendMode = rrVar.setCompoundDrawableTintBlendMode();
        UUID y7 = rrVar.setY();
        byte[] dividerPadding2 = rrVar.setDividerPadding();
        if (dividerPadding2 != null) {
            bArrCopyOf = Arrays.copyOf(dividerPadding2, dividerPadding2.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        } else {
            bArrCopyOf = null;
        }
        return new rr(ruVar2, bArrCopyOf3, compoundDrawableTintBlendMode, y7, bArrCopyOf);
    }

    @NotNull
    public static final rs setY(@NotNull rs rsVar) {
        return (rs) setCompoundDrawableTintBlendMode(new Object[]{rsVar}, 1881517747, -1881517746, (int) System.currentTimeMillis());
    }
}

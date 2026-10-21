package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class x3 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x3 f61737p0 = new x3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61738q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61739r0 = 1;

    static {
        int i10 = f61738q0;
        int i11 = i10 & 21;
        int i12 = (((i10 | 21) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f61739r0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public x3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i12)) | (~((~i10) | i14)) | (~(i11 | i12))) * 831) + ((~(i13 | i10 | i12)) * (-1662)) + (((~(i13 | i14)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830)) != 1) {
            cv cvVar = (cv) objArr[1];
            int i15 = f61738q0;
            int i16 = ((i15 & 12) + (i15 | 12)) - 1;
            f61739r0 = i16 % 128;
            if (i16 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar}, -756210758, 756210779, System.identityHashCode(cvVar));
                return null;
            }
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, -756210758, 756210779, System.identityHashCode(cvVar));
            throw null;
        }
        x3 x3Var = (x3) objArr[0];
        Object obj = objArr[1];
        int i17 = f61739r0;
        int i18 = i17 ^ 73;
        int i19 = -(-((i17 & 73) << 1));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        f61738q0 = i20 % 128;
        int i21 = i20 % 2;
        a(new Object[]{x3Var, (cv) obj}, -995864329, 995864329, System.identityHashCode(x3Var));
        Unit unit = Unit.INSTANCE;
        int i22 = f61738q0;
        int i23 = ((i22 | 45) << 1) - (i22 ^ 45);
        f61739r0 = i23 % 128;
        if (i23 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -718568380, 718568381, System.identityHashCode(this));
    }
}

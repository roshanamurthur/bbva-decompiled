package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class b4 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b4 f54255p0 = new b4();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54256q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54257r0 = 1;

    static {
        int i10 = f54257r0;
        int i11 = i10 & 91;
        int i12 = i10 | 91;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f54256q0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public b4() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = i13 | i11;
        int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 == 1) {
            b4 b4Var = (b4) objArr[0];
            Object obj = objArr[1];
            int i18 = f54257r0;
            int i19 = ((((i18 ^ 29) | (i18 & 29)) << 1) - (~(-(((~i18) & 29) | (i18 & (-30)))))) - 1;
            f54256q0 = i19 % 128;
            cv cvVar = (cv) obj;
            if (i19 % 2 == 0) {
                a(new Object[]{b4Var, cvVar}, 1186715541, -1186715541, System.identityHashCode(b4Var));
                return Unit.INSTANCE;
            }
            a(new Object[]{b4Var, cvVar}, 1186715541, -1186715541, System.identityHashCode(b4Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        cv cvVar2 = (cv) objArr[1];
        int i20 = f54256q0;
        int i21 = i20 & 115;
        int i22 = (i20 ^ 115) | i21;
        int i23 = (i21 & i22) + (i22 | i21);
        f54257r0 = i23 % 128;
        if (i23 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cvVar2, "");
            cv.setDividerPadding(new Object[]{cvVar2}, 1509608714, -1509608708, System.identityHashCode(cvVar2));
            return null;
        }
        Intrinsics.checkNotNullParameter(cvVar2, "");
        cv.setDividerPadding(new Object[]{cvVar2}, 1509608714, -1509608708, System.identityHashCode(cvVar2));
        int i24 = 15 / 0;
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, -1131935820, 1131935821, System.identityHashCode(this));
    }
}

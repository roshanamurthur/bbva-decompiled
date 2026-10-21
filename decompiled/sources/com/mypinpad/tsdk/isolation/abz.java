package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class abz extends acq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f52360g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52361h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public acq f52362f;

    public abz(@NotNull acq acqVar) {
        Intrinsics.checkNotNullParameter(acqVar, "");
        this.f52362f = acqVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object objValueOf;
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        switch (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711))) {
            case 1:
                abz abzVar = (abz) objArr[0];
                int i17 = f52361h;
                int i18 = i17 & 71;
                int i19 = i18 + ((i17 ^ 71) | i18);
                f52360g = i19 % 128;
                int i20 = i19 % 2;
                long jC_ = abzVar.f52362f.c_();
                int i21 = f52361h;
                int i22 = (i21 | 85) << 1;
                int i23 = -(((~i21) & 85) | (i21 & (-86)));
                int i24 = (i22 & i23) + (i23 | i22);
                f52360g = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 28 / 0;
                }
                objValueOf = Long.valueOf(jC_);
                break;
            case 2:
                abz abzVar2 = (abz) objArr[0];
                int i26 = f52361h;
                int i27 = ((i26 ^ 19) | (i26 & 19)) << 1;
                int i28 = -(((~i26) & 19) | (i26 & (-20)));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f52360g = i29 % 128;
                int i30 = i29 % 2;
                long jA_ = abzVar2.f52362f.a_();
                if (i30 != 0) {
                    int i31 = 7 / 0;
                }
                int i32 = f52360g;
                int i33 = i32 & 19;
                int i34 = -(-((i32 ^ 19) | i33));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                f52361h = i35 % 128;
                int i36 = i35 % 2;
                return Long.valueOf(jA_);
            case 3:
                abz abzVar3 = (abz) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i37 = f52361h + 81;
                f52360g = i37 % 128;
                if (i37 % 2 == 0) {
                    return abzVar3.f52362f.setY(jLongValue);
                }
                abzVar3.f52362f.setY(jLongValue);
                throw null;
            case 4:
                abz abzVar4 = (abz) objArr[0];
                int i38 = f52360g;
                int i39 = (i38 ^ 49) + ((i38 & 49) << 1);
                f52361h = i39 % 128;
                int i40 = i39 % 2;
                acq acqVar = abzVar4.f52362f;
                if (i40 != 0) {
                    return acqVar.d_();
                }
                acqVar.d_();
                throw null;
            case 5:
                abz abzVar5 = (abz) objArr[0];
                int i41 = f52360g;
                int i42 = i41 ^ 105;
                int i43 = ((i41 & 105) | i42) << 1;
                int i44 = -i42;
                int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
                f52361h = i45 % 128;
                int i46 = i45 % 2;
                boolean zB_ = abzVar5.f52362f.b_();
                int i47 = f52361h;
                int i48 = (i47 & (-78)) | ((~i47) & 77);
                int i49 = (i47 & 77) << 1;
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                f52360g = i50 % 128;
                int i51 = i50 % 2;
                return Boolean.valueOf(zB_);
            case 6:
                abz abzVar6 = (abz) objArr[0];
                int i52 = f52360g;
                int i53 = i52 & 71;
                int i54 = (i52 | 71) & (~i53);
                int i55 = -(-(i53 << 1));
                int i56 = (i54 & i55) + (i54 | i55);
                f52361h = i56 % 128;
                int i57 = i56 % 2;
                objValueOf = abzVar6.f52362f.setOnDragListener();
                if (i57 == 0) {
                    int i58 = 42 / 0;
                }
                break;
            case 7:
                abz abzVar7 = (abz) objArr[0];
                long jLongValue2 = ((Number) objArr[1]).longValue();
                TimeUnit timeUnit = (TimeUnit) objArr[2];
                int i59 = f52360g + 105;
                f52361h = i59 % 128;
                int i60 = i59 % 2;
                Intrinsics.checkNotNullParameter(timeUnit, "");
                acq onFocusChangeListener = abzVar7.f52362f.setOnFocusChangeListener(jLongValue2, timeUnit);
                int i61 = f52360g;
                int i62 = i61 & 31;
                int i63 = ((i61 ^ 31) | i62) << 1;
                int i64 = -((i61 | 31) & (~i62));
                int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                f52361h = i65 % 128;
                int i66 = i65 % 2;
                return onFocusChangeListener;
            case 8:
                abz abzVar8 = (abz) objArr[0];
                acq acqVar2 = (acq) objArr[1];
                int i67 = f52360g;
                int i68 = ((((i67 ^ 91) | (i67 & 91)) << 1) - (~(-(((~i67) & 91) | (i67 & (-92)))))) - 1;
                f52361h = i68 % 128;
                if (i68 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(acqVar2, "");
                    abzVar8.f52362f = acqVar2;
                    return abzVar8;
                }
                Intrinsics.checkNotNullParameter(acqVar2, "");
                abzVar8.f52362f = acqVar2;
                int i69 = 22 / 0;
                return abzVar8;
            case 9:
                abz abzVar9 = (abz) objArr[0];
                int i70 = f52360g;
                int i71 = (i70 & 25) + (i70 | 25);
                f52361h = i71 % 128;
                if (i71 % 2 != 0) {
                    return abzVar9.f52362f;
                }
                acq acqVar3 = abzVar9.f52362f;
                throw null;
            default:
                abz abzVar10 = (abz) objArr[0];
                int i72 = f52360g + 39;
                f52361h = i72 % 128;
                int i73 = i72 % 2;
                abzVar10.f52362f.getNavBarTitleString();
                int i74 = f52361h;
                int i75 = ((i74 & 46) + (i74 | 46)) - 1;
                f52360g = i75 % 128;
                int i76 = i75 % 2;
                return null;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.acq
    public final long a_() {
        return ((Long) setY(new Object[]{this}, 1427251917, -1427251915, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.acq
    public final boolean b_() {
        return ((Boolean) setY(new Object[]{this}, 1752332186, -1752332181, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.acq
    public final long c_() {
        return ((Long) setY(new Object[]{this}, 1629371312, -1629371311, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.acq
    @NotNull
    public final acq d_() {
        return (acq) setY(new Object[]{this}, -1335263466, 1335263470, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acq
    public final void getNavBarTitleString() throws IOException {
        setY(new Object[]{this}, -1923336548, 1923336548, System.identityHashCode(this));
    }

    @NotNull
    public final abz setCompoundDrawableTintBlendMode(@NotNull acq acqVar) {
        return (abz) setY(new Object[]{this, acqVar}, 1384003668, -1384003660, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acq
    @NotNull
    public final acq setOnDragListener() {
        return (acq) setY(new Object[]{this}, 475285376, -475285370, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acq
    @NotNull
    public final acq setOnFocusChangeListener(long j10, @NotNull TimeUnit timeUnit) {
        return (acq) setY(new Object[]{this, Long.valueOf(j10), timeUnit}, -1739710932, 1739710939, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acq
    @NotNull
    public final acq setY(long j10) {
        return (acq) setY(new Object[]{this, Long.valueOf(j10)}, -794721030, 794721033, System.identityHashCode(this));
    }

    @JvmName(name = "delegate")
    @NotNull
    public final acq setY() {
        return (acq) setY(new Object[]{this}, 1027643068, -1027643059, System.identityHashCode(this));
    }
}

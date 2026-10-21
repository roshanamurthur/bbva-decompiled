package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkTxnResultCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTxnResultCallback.kt\ncom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionNotAuthorised\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,448:1\n30#2:449\n14#2:450\n*S KotlinDebug\n*F\n+ 1 SdkTxnResultCallback.kt\ncom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionNotAuthorised\n*L\n204#1:449\n204#1:450\n*E\n"})
public final class rt extends ru {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f58152q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58153r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final rv f58154p0;

    public rt(@Nullable rv rvVar) {
        super(null);
        this.f58154p0 = rvVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        if ((((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i13 | i14 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317)) != 1) {
            int i15 = f58153r0;
            int i16 = i15 + 103;
            f58152q0 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((i15 ^ 20) + ((i15 & 20) << 1)) - 1;
            f58152q0 = i18 % 128;
            int i19 = i18 % 2;
            return "";
        }
        rt rtVar = (rt) objArr[0];
        int i20 = f58152q0;
        int i21 = ((i20 | 77) << 1) - (i20 ^ 77);
        int i22 = i21 % 128;
        f58153r0 = i22;
        int i23 = i21 % 2;
        rv rvVar = rtVar.f58154p0;
        int i24 = i22 & 83;
        int i25 = -(-((i22 ^ 83) | i24));
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        f58152q0 = i26 % 128;
        if (i26 % 2 == 0) {
            return rvVar;
        }
        int i27 = 62 / 0;
        return rvVar;
    }

    @Nullable
    public final rv setCompoundDrawableTintBlendMode() {
        return (rv) setY(new Object[]{this}, -1450751029, 1450751030, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, -1737586708, 1737586708, System.identityHashCode(this));
    }
}

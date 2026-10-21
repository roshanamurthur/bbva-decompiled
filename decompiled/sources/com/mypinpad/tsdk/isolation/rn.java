package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkTxnResultCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTxnResultCallback.kt\ncom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionCancelled\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,448:1\n30#2:449\n14#2:450\n*S KotlinDebug\n*F\n+ 1 SdkTxnResultCallback.kt\ncom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionCancelled\n*L\n53#1:449\n53#1:450\n*E\n"})
public final class rn extends rs {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f58142q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58143r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final rq f58144p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(@NotNull rq rqVar) {
        super(null);
        Intrinsics.checkNotNullParameter(rqVar, "");
        this.f58144p0 = rqVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        if ((((~(i10 | i12)) | (~((~i11) | i10)) | i13) * 70) + ((~(i10 | i11 | i12)) * 70) + (((~(i11 | i12)) | i13) * (-140)) + (i11 * (-69)) + (i10 * 71) != 1) {
            rn rnVar = (rn) objArr[0];
            int i14 = f58143r0;
            int i15 = i14 + 41;
            f58142q0 = i15 % 128;
            int i16 = i15 % 2;
            rq rqVar = rnVar.f58144p0;
            int i17 = i14 + 65;
            f58142q0 = i17 % 128;
            int i18 = i17 % 2;
            return rqVar;
        }
        int i19 = f58142q0;
        int i20 = i19 + 109;
        f58143r0 = i20 % 128;
        int i21 = i20 % 2;
        int i22 = i19 ^ 97;
        int i23 = -(-((i19 & 97) << 1));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        f58143r0 = i24 % 128;
        int i25 = i24 % 2;
        return "";
    }

    @NotNull
    public final rq setX() {
        return (rq) setCompoundDrawableTintBlendMode(new Object[]{this}, -1499104483, 1499104483, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -828307041, 828307042, System.identityHashCode(this));
    }
}

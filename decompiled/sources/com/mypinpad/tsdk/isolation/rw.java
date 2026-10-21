package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkTxnResultCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTxnResultCallback.kt\ncom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionFailed\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,448:1\n30#2:449\n14#2:450\n*S KotlinDebug\n*F\n+ 1 SdkTxnResultCallback.kt\ncom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionFailed\n*L\n110#1:449\n110#1:450\n*E\n"})
public final class rw extends rs implements un {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f58155s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f58156t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f58157p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ro f58158q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final qw f58159r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(@NotNull byte[] bArr, @NotNull ro roVar, @Nullable qw qwVar) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(roVar, "");
        this.f58157p0 = bArr;
        this.f58158q0 = roVar;
        this.f58159r0 = qwVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i10 | i14)) * 69) + (((~(i11 | i12)) | (~(i13 | i12)) | (~(i13 | i11))) * (-69)) + (((~(i13 | i14 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70);
        if (i15 == 1) {
            rw rwVar = (rw) objArr[0];
            int i16 = f58156t0;
            int i17 = (((i16 ^ 77) | (i16 & 77)) << 1) - ((i16 & (-78)) | ((~i16) & 77));
            f58155s0 = i17 % 128;
            int i18 = i17 % 2;
            ro roVar = rwVar.f58158q0;
            if (i18 != 0) {
                throw null;
            }
            int i19 = i16 + 45;
            f58155s0 = i19 % 128;
            if (i19 % 2 == 0) {
                return roVar;
            }
            throw null;
        }
        if (i15 == 2) {
            rw rwVar2 = (rw) objArr[0];
            int i20 = f58155s0;
            int i21 = ((i20 & 68) + (i20 | 68)) - 1;
            int i22 = i21 % 128;
            f58156t0 = i22;
            int i23 = i21 % 2;
            byte[] bArr = rwVar2.f58157p0;
            int i24 = (((i22 & (-120)) | ((~i22) & 119)) - (~(-(-((i22 & 119) << 1))))) - 1;
            f58155s0 = i24 % 128;
            int i25 = i24 % 2;
            return bArr;
        }
        if (i15 == 3) {
            int i26 = f58155s0;
            int i27 = (i26 | 111) << 1;
            int i28 = -((i26 & (-112)) | ((~i26) & 111));
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            f58156t0 = i29 % 128;
            int i30 = i29 % 2;
            int i31 = (i26 & 61) + (i26 | 61);
            f58156t0 = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 14 / 0;
            }
            return "";
        }
        if (i15 != 4) {
            rw rwVar3 = (rw) objArr[0];
            int i33 = f58156t0;
            int i34 = ((i33 | 59) << 1) - (i33 ^ 59);
            f58155s0 = i34 % 128;
            if (i34 % 2 == 0) {
                return rwVar3.f58159r0;
            }
            qw qwVar = rwVar3.f58159r0;
            throw null;
        }
        rw rwVar4 = (rw) objArr[0];
        int i35 = f58156t0;
        int i36 = (i35 & (-110)) | ((~i35) & 109);
        int i37 = -(-((i35 & 109) << 1));
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        f58155s0 = i38 % 128;
        if (i38 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.un
    public final void junkify() {
        setX(new Object[]{this}, 1350138926, -1350138922, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 1334330703, -1334330701, System.identityHashCode(this));
    }

    @Nullable
    public final qw setOnFocusChangeListener() {
        return (qw) setX(new Object[]{this}, -1769449695, 1769449695, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -162338292, 162338295, System.identityHashCode(this));
    }

    @NotNull
    public final ro setX() {
        return (ro) setX(new Object[]{this}, 677881860, -677881859, System.identityHashCode(this));
    }
}

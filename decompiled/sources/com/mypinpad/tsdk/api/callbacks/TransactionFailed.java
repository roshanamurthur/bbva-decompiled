package com.mypinpad.tsdk.api.callbacks;

import com.mypinpad.tsdk.isolation.un;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TransactionFailed;", "Lcom/mypinpad/tsdk/api/callbacks/TransactionResult;", "Lcom/mypinpad/tsdk/i/un;", "", "toString", "()Ljava/lang/String;", "", "junkify", "()V", "", "p0", "[B", "getDiscretionaryTagData", "()[B", "discretionaryTagData", "Lcom/mypinpad/tsdk/api/callbacks/TransactionErrorCause;", "q0", "Lcom/mypinpad/tsdk/api/callbacks/TransactionErrorCause;", "getError", "()Lcom/mypinpad/tsdk/api/callbacks/TransactionErrorCause;", "error", "", "r0", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "exception", "<init>", "([BLcom/mypinpad/tsdk/api/callbacks/TransactionErrorCause;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTxnResultCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TxnResultCallback.kt\ncom/mypinpad/tsdk/api/callbacks/TransactionFailed\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,282:1\n30#2:283\n14#2:284\n*S KotlinDebug\n*F\n+ 1 TxnResultCallback.kt\ncom/mypinpad/tsdk/api/callbacks/TransactionFailed\n*L\n89#1:283\n89#1:284\n*E\n"})
public final class TransactionFailed extends TransactionResult implements un {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f51652s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f51653t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] discretionaryTagData;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TransactionErrorCause error;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Throwable exception;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionFailed(@NotNull byte[] bArr, @NotNull TransactionErrorCause transactionErrorCause, @Nullable Throwable th2) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(transactionErrorCause, "");
        this.discretionaryTagData = bArr;
        this.error = transactionErrorCause;
        this.exception = th2;
    }

    @JvmName(name = "getDiscretionaryTagData")
    @NotNull
    public final byte[] getDiscretionaryTagData() {
        int i10 = f51652s0;
        int i11 = i10 & 123;
        int i12 = -(-(i10 | 123));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f51653t0 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = (i10 & (-82)) | ((~i10) & 81);
        int i16 = -(-((i10 & 81) << 1));
        int i17 = (i15 & i16) + (i16 | i15);
        f51653t0 = i17 % 128;
        int i18 = i17 % 2;
        byte[] bArr = this.discretionaryTagData;
        if (i18 == 0) {
            int i19 = 38 / 0;
        }
        return bArr;
    }

    @JvmName(name = "getError")
    @NotNull
    public final TransactionErrorCause getError() {
        int i10 = f51652s0 + 125;
        int i11 = i10 % 128;
        f51653t0 = i11;
        int i12 = i10 % 2;
        int i13 = (i11 & 79) + (i11 | 79);
        f51652s0 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.error;
        }
        throw null;
    }

    @JvmName(name = "getException")
    @Nullable
    public final Throwable getException() {
        int i10 = f51653t0;
        int i11 = ((i10 ^ 89) | (i10 & 89)) << 1;
        int i12 = -((i10 & (-90)) | ((~i10) & 89));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f51652s0 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        int i14 = i10 ^ 5;
        int i15 = ((((i10 & 5) | i14) << 1) - (~(-i14))) - 1;
        f51652s0 = i15 % 128;
        int i16 = i15 % 2;
        Throwable th2 = this.exception;
        if (i16 != 0) {
            int i17 = 31 / 0;
        }
        return th2;
    }

    @Override // com.mypinpad.tsdk.isolation.un
    public final void junkify() {
        int i10 = f51653t0 + 115;
        f51652s0 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = f51652s0;
        int i13 = i12 & 109;
        int i14 = ((i12 ^ 109) | i13) << 1;
        int i15 = -((i12 | 109) & (~i13));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f51653t0 = i16 % 128;
        int i17 = i16 % 2;
    }

    @NotNull
    public final String toString() {
        int i10 = f51652s0;
        int i11 = ((((i10 ^ 47) | (i10 & 47)) << 1) - (~(-(((~i10) & 47) | (i10 & (-48)))))) - 1;
        f51653t0 = i11 % 128;
        if (i11 % 2 != 0) {
            return "";
        }
        throw null;
    }
}

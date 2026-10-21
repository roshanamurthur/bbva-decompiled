package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TransactionNotAuthorised;", "Lcom/mypinpad/tsdk/api/callbacks/TransactionProcessingResult;", "", "toString", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/api/callbacks/TransactionNotAuthorisedReason;", "a", "Lcom/mypinpad/tsdk/api/callbacks/TransactionNotAuthorisedReason;", "getReason", "()Lcom/mypinpad/tsdk/api/callbacks/TransactionNotAuthorisedReason;", "reason", "<init>", "(Lcom/mypinpad/tsdk/api/callbacks/TransactionNotAuthorisedReason;)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTxnResultCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TxnResultCallback.kt\ncom/mypinpad/tsdk/api/callbacks/TransactionNotAuthorised\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,282:1\n30#2:283\n14#2:284\n*S KotlinDebug\n*F\n+ 1 TxnResultCallback.kt\ncom/mypinpad/tsdk/api/callbacks/TransactionNotAuthorised\n*L\n123#1:283\n123#1:284\n*E\n"})
public final class TransactionNotAuthorised extends TransactionProcessingResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51657b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TransactionNotAuthorisedReason reason;

    public TransactionNotAuthorised(@Nullable TransactionNotAuthorisedReason transactionNotAuthorisedReason) {
        super(null);
        this.reason = transactionNotAuthorisedReason;
    }

    @JvmName(name = "getReason")
    @Nullable
    public final TransactionNotAuthorisedReason getReason() {
        int i10 = f51657b;
        int i11 = i10 & 9;
        int i12 = -(-(i10 | 9));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        int i16 = (i14 & (-14)) | ((~i14) & 13);
        int i17 = (i14 & 13) << 1;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f51657b = i18 % 128;
        int i19 = i18 % 2;
        return this.reason;
    }

    @NotNull
    public final String toString() {
        int i10 = f51657b;
        int i11 = ((i10 ^ 11) | (i10 & 11)) << 1;
        int i12 = -(((~i10) & 11) | (i10 & (-12)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        if (i13 % 2 == 0) {
            return "";
        }
        throw null;
    }
}

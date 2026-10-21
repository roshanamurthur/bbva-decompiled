package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TransactionCancelled;", "Lcom/mypinpad/tsdk/api/callbacks/TransactionResult;", "", "toString", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/api/callbacks/TransactionCancelReason;", "p0", "Lcom/mypinpad/tsdk/api/callbacks/TransactionCancelReason;", "getReason", "()Lcom/mypinpad/tsdk/api/callbacks/TransactionCancelReason;", "reason", "<init>", "(Lcom/mypinpad/tsdk/api/callbacks/TransactionCancelReason;)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTxnResultCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TxnResultCallback.kt\ncom/mypinpad/tsdk/api/callbacks/TransactionCancelled\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,282:1\n30#2:283\n14#2:284\n*S KotlinDebug\n*F\n+ 1 TxnResultCallback.kt\ncom/mypinpad/tsdk/api/callbacks/TransactionCancelled\n*L\n31#1:283\n31#1:284\n*E\n"})
public final class TransactionCancelled extends TransactionResult {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f51643q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TransactionCancelReason reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionCancelled(@NotNull TransactionCancelReason transactionCancelReason) {
        super(null);
        Intrinsics.checkNotNullParameter(transactionCancelReason, "");
        this.reason = transactionCancelReason;
    }

    @JvmName(name = "getReason")
    @NotNull
    public final TransactionCancelReason getReason() {
        int i10 = f51643q0;
        int i11 = i10 & 1;
        int i12 = i11 + ((i10 ^ 1) | i11);
        int i13 = i12 % 128;
        if (i12 % 2 != 0) {
            return this.reason;
        }
        throw null;
    }

    @NotNull
    public final String toString() {
        int i10 = f51643q0;
        int i11 = i10 ^ 109;
        int i12 = (i10 & 109) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        int i16 = i14 & 91;
        int i17 = (i14 | 91) & (~i16);
        int i18 = i16 << 1;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        f51643q0 = i19 % 128;
        if (i19 % 2 == 0) {
            return "";
        }
        throw null;
    }
}

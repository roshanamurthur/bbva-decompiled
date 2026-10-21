package com.mypinpad.tsdk.api.callbacks;

import com.mypinpad.tsdk.api.models.CardScheme;
import com.mypinpad.tsdk.isolation.un;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TransactionCompleted;", "Lcom/mypinpad/tsdk/api/callbacks/TransactionResult;", "Lcom/mypinpad/tsdk/i/un;", "", "toString", "()Ljava/lang/String;", "", "junkify", "()V", "Lcom/mypinpad/tsdk/api/callbacks/TransactionProcessingResult;", "p0", "Lcom/mypinpad/tsdk/api/callbacks/TransactionProcessingResult;", "getProcessingResult", "()Lcom/mypinpad/tsdk/api/callbacks/TransactionProcessingResult;", "processingResult", "", "q0", "[B", "getDiscretionaryTagData", "()[B", "discretionaryTagData", "Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "r0", "Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "getUiMessage", "()Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "uiMessage", "Ljava/util/UUID;", "s0", "Ljava/util/UUID;", "getServiceTransactionId", "()Ljava/util/UUID;", "serviceTransactionId", "t0", "getMetadata", "metadata", "Lcom/mypinpad/tsdk/api/models/CardScheme;", "u0", "Lcom/mypinpad/tsdk/api/models/CardScheme;", "getCardScheme", "()Lcom/mypinpad/tsdk/api/models/CardScheme;", "cardScheme", "<init>", "(Lcom/mypinpad/tsdk/api/callbacks/TransactionProcessingResult;[BLcom/mypinpad/tsdk/api/callbacks/UiMessage;Ljava/util/UUID;[B)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTxnResultCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TxnResultCallback.kt\ncom/mypinpad/tsdk/api/callbacks/TransactionCompleted\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,282:1\n30#2:283\n14#2:284\n*S KotlinDebug\n*F\n+ 1 TxnResultCallback.kt\ncom/mypinpad/tsdk/api/callbacks/TransactionCompleted\n*L\n60#1:283\n60#1:284\n*E\n"})
public final class TransactionCompleted extends TransactionResult implements un {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f51645w0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TransactionProcessingResult processingResult;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] discretionaryTagData;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiMessage uiMessage;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UUID serviceTransactionId;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] metadata;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CardScheme cardScheme;

    public /* synthetic */ TransactionCompleted(TransactionProcessingResult transactionProcessingResult, byte[] bArr, UiMessage uiMessage, UUID uuid, byte[] bArr2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(transactionProcessingResult, bArr, uiMessage, (i10 & 8) != 0 ? null : uuid, (i10 & 16) != 0 ? null : bArr2);
    }

    @JvmName(name = "getCardScheme")
    @Nullable
    public final CardScheme getCardScheme() {
        int i10 = v0;
        int i11 = i10 & 51;
        int i12 = (i11 - (~((i10 ^ 51) | i11))) - 1;
        int i13 = i12 % 128;
        f51645w0 = i13;
        int i14 = i12 % 2;
        int i15 = ((i13 ^ 1) | (i13 & 1)) << 1;
        int i16 = -((1 & (~i13)) | (i13 & (-2)));
        int i17 = (i15 & i16) + (i16 | i15);
        v0 = i17 % 128;
        int i18 = i17 % 2;
        return this.cardScheme;
    }

    @JvmName(name = "getDiscretionaryTagData")
    @NotNull
    public final byte[] getDiscretionaryTagData() {
        int i10 = f51645w0 + 69;
        int i11 = i10 % 128;
        v0 = i11;
        int i12 = i10 % 2;
        int i13 = ((i11 & (-126)) | ((~i11) & 125)) + ((i11 & 125) << 1);
        f51645w0 = i13 % 128;
        int i14 = i13 % 2;
        return this.discretionaryTagData;
    }

    @JvmName(name = "getMetadata")
    @Nullable
    public final byte[] getMetadata() {
        int i10 = f51645w0;
        int i11 = ((i10 & 36) + (i10 | 36)) - 1;
        v0 = i11 % 128;
        if (i11 % 2 == 0) {
            return this.metadata;
        }
        throw null;
    }

    @JvmName(name = "getProcessingResult")
    @NotNull
    public final TransactionProcessingResult getProcessingResult() {
        int i10 = v0;
        int i11 = ((i10 | 67) << 1) - (i10 ^ 67);
        f51645w0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = ((i10 | 117) << 1) - (i10 ^ 117);
        f51645w0 = i12 % 128;
        int i13 = i12 % 2;
        return this.processingResult;
    }

    @JvmName(name = "getServiceTransactionId")
    @Nullable
    public final UUID getServiceTransactionId() {
        int i10 = f51645w0;
        int i11 = i10 ^ 17;
        int i12 = (((i10 & 17) | i11) << 1) - i11;
        v0 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 18 / 0;
        }
        return this.serviceTransactionId;
    }

    @JvmName(name = "getUiMessage")
    @NotNull
    public final UiMessage getUiMessage() {
        int i10 = v0;
        int i11 = ((i10 | 115) << 1) - (i10 ^ 115);
        int i12 = i11 % 128;
        f51645w0 = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i13 = i12 ^ 73;
        int i14 = (((i12 & 73) | i13) << 1) - i13;
        v0 = i14 % 128;
        int i15 = i14 % 2;
        return this.uiMessage;
    }

    @Override // com.mypinpad.tsdk.isolation.un
    public final void junkify() {
        int i10 = f51645w0;
        int i11 = (((i10 ^ 13) | (i10 & 13)) << 1) - (((~i10) & 13) | (i10 & (-14)));
        v0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = f51645w0;
        int i14 = i13 & 9;
        int i15 = ((i13 | 9) & (~i14)) + (i14 << 1);
        v0 = i15 % 128;
        int i16 = i15 % 2;
    }

    @NotNull
    public final String toString() {
        int i10 = v0;
        int i11 = i10 & 109;
        int i12 = (i10 ^ 109) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f51645w0 = i14;
        int i15 = i13 % 2;
        int i16 = i14 & 101;
        int i17 = ((i14 ^ 101) | i16) << 1;
        int i18 = -((i14 | 101) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        v0 = i19 % 128;
        if (i19 % 2 == 0) {
            return "";
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionCompleted(@NotNull TransactionProcessingResult transactionProcessingResult, @NotNull byte[] bArr, @NotNull UiMessage uiMessage, @Nullable UUID uuid, @Nullable byte[] bArr2) {
        super(null);
        Intrinsics.checkNotNullParameter(transactionProcessingResult, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(uiMessage, "");
        this.processingResult = transactionProcessingResult;
        this.discretionaryTagData = bArr;
        this.uiMessage = uiMessage;
        this.serviceTransactionId = uuid;
        this.metadata = bArr2;
        TransactionApproved transactionApproved = transactionProcessingResult instanceof TransactionApproved ? (TransactionApproved) transactionProcessingResult : null;
        this.cardScheme = transactionApproved != null ? transactionApproved.getCardScheme() : null;
    }
}

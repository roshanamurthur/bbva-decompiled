package com.mypinpad.tsdk.api.callbacks;

import com.mypinpad.tsdk.api.models.CardScheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TransactionApproved;", "Lcom/mypinpad/tsdk/api/callbacks/TransactionProcessingResult;", "Lcom/mypinpad/tsdk/api/models/CardScheme;", "a", "Lcom/mypinpad/tsdk/api/models/CardScheme;", "getCardScheme", "()Lcom/mypinpad/tsdk/api/models/CardScheme;", "cardScheme", "<init>", "(Lcom/mypinpad/tsdk/api/models/CardScheme;)V"}, k = 1, mv = {1, 8, 0})
public final class TransactionApproved extends TransactionProcessingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CardScheme cardScheme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionApproved(@NotNull CardScheme cardScheme) {
        super(null);
        Intrinsics.checkNotNullParameter(cardScheme, "");
        this.cardScheme = cardScheme;
    }

    @JvmName(name = "getCardScheme")
    @NotNull
    public final CardScheme getCardScheme() {
        return this.cardScheme;
    }
}

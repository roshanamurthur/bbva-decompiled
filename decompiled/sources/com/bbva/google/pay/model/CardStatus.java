package com.bbva.google.pay.model;

import androidx.annotation.Keep;
import com.bbva.google.pay.utils.TokenState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CardStatus.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/google/pay/model/CardStatus;", "", "status", "Lcom/bbva/google/pay/utils/TokenState;", "tokenReferenceId", "", "(Lcom/bbva/google/pay/utils/TokenState;Ljava/lang/String;)V", "getStatus", "()Lcom/bbva/google/pay/utils/TokenState;", "getTokenReferenceId", "()Ljava/lang/String;", "google-pay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardStatus {

    @NotNull
    private final TokenState status;

    @Nullable
    private final String tokenReferenceId;

    public CardStatus(@NotNull TokenState status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.tokenReferenceId = str;
    }

    @NotNull
    public final TokenState getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    public /* synthetic */ CardStatus(TokenState tokenState, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenState, (i10 & 2) != 0 ? null : str);
    }
}

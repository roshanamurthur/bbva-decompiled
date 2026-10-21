package com.bbva.ethermobilesdk.tokencompat.model.legacy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TokenPub.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "", "chrotpTimeIncrement", "", "getChrotpTimeIncrement", "()J", "description", "", "getDescription", "()Ljava/lang/String;", "needsPin", "", "getNeedsPin", "()Z", "serial", "getSerial", "totpTimeIncrement", "getTotpTimeIncrement", "type", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "getType", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "useQrCode", "getUseQrCode", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TokenPub {
    long getChrotpTimeIncrement();

    @NotNull
    String getDescription();

    boolean getNeedsPin();

    @NotNull
    String getSerial();

    long getTotpTimeIncrement();

    @NotNull
    TokenType getType();

    boolean getUseQrCode();
}

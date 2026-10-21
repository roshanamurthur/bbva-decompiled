package com.bbva.ethermobilesdk.tokencompat.model.legacy.impl;

import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: STTokenPubImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006%"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenPubImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "getType", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "type", "", "b", "Ljava/lang/String;", "getSerial", "()Ljava/lang/String;", "serial", "c", "getDescription", "description", "", "d", "Z", "getNeedsPin", "()Z", "needsPin", "e", "getUseQrCode", "useQrCode", "", "f", "J", "getTotpTimeIncrement", "()J", "totpTimeIncrement", "g", "getChrotpTimeIncrement", "chrotpTimeIncrement", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;Ljava/lang/String;Ljava/lang/String;ZZJJ)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class STTokenPubImpl implements TokenPub {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TokenType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serial;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean needsPin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean useQrCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long totpTimeIncrement;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long chrotpTimeIncrement;

    public STTokenPubImpl(@NotNull TokenType type, @NotNull String serial, @NotNull String description, boolean z10, boolean z11, long j10, long j11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(description, "description");
        this.type = type;
        this.serial = serial;
        this.description = description;
        this.needsPin = z10;
        this.useQrCode = z11;
        this.totpTimeIncrement = j10;
        this.chrotpTimeIncrement = j11;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub
    public long getChrotpTimeIncrement() {
        return this.chrotpTimeIncrement;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub
    @NotNull
    public String getDescription() {
        return this.description;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub
    public boolean getNeedsPin() {
        return this.needsPin;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub
    @NotNull
    public String getSerial() {
        return this.serial;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub
    public long getTotpTimeIncrement() {
        return this.totpTimeIncrement;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub
    @NotNull
    public TokenType getType() {
        return this.type;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub
    public boolean getUseQrCode() {
        return this.useQrCode;
    }
}

package com.bbva.ethermobilesdk.token.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/OTP;", "", "value", "", GenerateOtpCommand.VALID_UNTIL, "", GenerateOtpCommand.TIME_WINDOW, "", "(Ljava/lang/String;JI)V", "getTimeWindow", "()I", "getValidUntil", "()J", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OTP {
    private final int timeWindow;
    private final long validUntil;

    @NotNull
    private final String value;

    public OTP(@NotNull String value, long j10, int i10) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.validUntil = j10;
        this.timeWindow = i10;
    }

    public static /* synthetic */ OTP copy$default(OTP otp, String str, long j10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = otp.value;
        }
        if ((i11 & 2) != 0) {
            j10 = otp.validUntil;
        }
        if ((i11 & 4) != 0) {
            i10 = otp.timeWindow;
        }
        return otp.copy(str, j10, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getValidUntil() {
        return this.validUntil;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimeWindow() {
        return this.timeWindow;
    }

    @NotNull
    public final OTP copy(@NotNull String value, long validUntil, int timeWindow) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new OTP(value, validUntil, timeWindow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTP)) {
            return false;
        }
        OTP otp = (OTP) other;
        return Intrinsics.areEqual(this.value, otp.value) && this.validUntil == otp.validUntil && this.timeWindow == otp.timeWindow;
    }

    public final int getTimeWindow() {
        return this.timeWindow;
    }

    public final long getValidUntil() {
        return this.validUntil;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        long j10 = this.validUntil;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.timeWindow;
    }

    @NotNull
    public String toString() {
        return "OTP(value=" + this.value + ", validUntil=" + this.validUntil + ", timeWindow=" + this.timeWindow + ")";
    }
}

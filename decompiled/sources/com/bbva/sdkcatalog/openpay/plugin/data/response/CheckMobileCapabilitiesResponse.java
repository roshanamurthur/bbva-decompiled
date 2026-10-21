package com.bbva.sdkcatalog.openpay.plugin.data.response;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CheckTapOnPhoneMobileCapabilitiesResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/response/CheckMobileCapabilitiesResponse;", "", "isDeviceCapable", "", "reason", "Lcom/bbva/sdkcatalog/openpay/plugin/data/response/Reason;", "<init>", "(ZLcom/bbva/sdkcatalog/openpay/plugin/data/response/Reason;)V", "()Z", "getReason", "()Lcom/bbva/sdkcatalog/openpay/plugin/data/response/Reason;", "component1", "component2", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckMobileCapabilitiesResponse {
    private final boolean isDeviceCapable;

    @Nullable
    private final Reason reason;

    public CheckMobileCapabilitiesResponse(boolean z10, @Nullable Reason reason) {
        this.isDeviceCapable = z10;
        this.reason = reason;
    }

    public static /* synthetic */ CheckMobileCapabilitiesResponse copy$default(CheckMobileCapabilitiesResponse checkMobileCapabilitiesResponse, boolean z10, Reason reason, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = checkMobileCapabilitiesResponse.isDeviceCapable;
        }
        if ((i10 & 2) != 0) {
            reason = checkMobileCapabilitiesResponse.reason;
        }
        return checkMobileCapabilitiesResponse.copy(z10, reason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDeviceCapable() {
        return this.isDeviceCapable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Reason getReason() {
        return this.reason;
    }

    @NotNull
    public final CheckMobileCapabilitiesResponse copy(boolean isDeviceCapable, @Nullable Reason reason) {
        return new CheckMobileCapabilitiesResponse(isDeviceCapable, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckMobileCapabilitiesResponse)) {
            return false;
        }
        CheckMobileCapabilitiesResponse checkMobileCapabilitiesResponse = (CheckMobileCapabilitiesResponse) other;
        return this.isDeviceCapable == checkMobileCapabilitiesResponse.isDeviceCapable && this.reason == checkMobileCapabilitiesResponse.reason;
    }

    @Nullable
    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int i10 = (this.isDeviceCapable ? 1231 : 1237) * 31;
        Reason reason = this.reason;
        return i10 + (reason == null ? 0 : reason.hashCode());
    }

    public final boolean isDeviceCapable() {
        return this.isDeviceCapable;
    }

    @NotNull
    public String toString() {
        return "CheckMobileCapabilitiesResponse(isDeviceCapable=" + this.isDeviceCapable + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ CheckMobileCapabilitiesResponse(boolean z10, Reason reason, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : reason);
    }
}

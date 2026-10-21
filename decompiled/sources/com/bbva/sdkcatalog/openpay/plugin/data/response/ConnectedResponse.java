package com.bbva.sdkcatalog.openpay.plugin.data.response;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectedResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/response/ConnectedResponse;", "", "isConnected", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectedResponse {
    private final boolean isConnected;

    public ConnectedResponse(boolean z10) {
        this.isConnected = z10;
    }

    public static /* synthetic */ ConnectedResponse copy$default(ConnectedResponse connectedResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = connectedResponse.isConnected;
        }
        return connectedResponse.copy(z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    @NotNull
    public final ConnectedResponse copy(boolean isConnected) {
        return new ConnectedResponse(isConnected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConnectedResponse) && this.isConnected == ((ConnectedResponse) other).isConnected;
    }

    public int hashCode() {
        return this.isConnected ? 1231 : 1237;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    @NotNull
    public String toString() {
        return "ConnectedResponse(isConnected=" + this.isConnected + ")";
    }
}

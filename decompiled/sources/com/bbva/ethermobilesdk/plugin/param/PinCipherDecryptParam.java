package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinCipherDecryptParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/PinCipherDecryptParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "data", "", "asHexEncoded", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getAsHexEncoded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bbva/ethermobilesdk/plugin/param/PinCipherDecryptParam;", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PinCipherDecryptParam implements MalformedParams {

    @Nullable
    private final Boolean asHexEncoded;

    @Nullable
    private String data;

    /* JADX WARN: Multi-variable type inference failed */
    public PinCipherDecryptParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PinCipherDecryptParam copy$default(PinCipherDecryptParam pinCipherDecryptParam, String str, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pinCipherDecryptParam.data;
        }
        if ((i10 & 2) != 0) {
            bool = pinCipherDecryptParam.asHexEncoded;
        }
        return pinCipherDecryptParam.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAsHexEncoded() {
        return this.asHexEncoded;
    }

    @NotNull
    public final PinCipherDecryptParam copy(@Nullable String data, @Nullable Boolean asHexEncoded) {
        return new PinCipherDecryptParam(data, asHexEncoded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinCipherDecryptParam)) {
            return false;
        }
        PinCipherDecryptParam pinCipherDecryptParam = (PinCipherDecryptParam) other;
        return Intrinsics.areEqual(this.data, pinCipherDecryptParam.data) && Intrinsics.areEqual(this.asHexEncoded, pinCipherDecryptParam.asHexEncoded);
    }

    @Nullable
    public final Boolean getAsHexEncoded() {
        return this.asHexEncoded;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.asHexEncoded;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str = this.data;
        return str == null || str.length() == 0;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    @NotNull
    public String toString() {
        return "PinCipherDecryptParam(data=" + this.data + ", asHexEncoded=" + this.asHexEncoded + RootService.CLOSE_BRACKET;
    }

    public PinCipherDecryptParam(@Nullable String str, @Nullable Boolean bool) {
        this.data = str;
        this.asHexEncoded = bool;
    }

    public /* synthetic */ PinCipherDecryptParam(String str, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? Boolean.FALSE : bool);
    }
}

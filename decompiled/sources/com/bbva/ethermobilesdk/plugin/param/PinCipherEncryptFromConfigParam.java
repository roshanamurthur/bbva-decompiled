package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinCipherEncryptFromConfigParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0005\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/PinCipherEncryptFromConfigParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "data", "", "keyTag", "isHexEncoded", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKeyTag", "setKeyTag", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bbva/ethermobilesdk/plugin/param/PinCipherEncryptFromConfigParam;", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PinCipherEncryptFromConfigParam implements MalformedParams {

    @Nullable
    private String data;

    @Nullable
    private final Boolean isHexEncoded;

    @SerializedName("key_tag")
    @Nullable
    private String keyTag;

    public PinCipherEncryptFromConfigParam() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PinCipherEncryptFromConfigParam copy$default(PinCipherEncryptFromConfigParam pinCipherEncryptFromConfigParam, String str, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pinCipherEncryptFromConfigParam.data;
        }
        if ((i10 & 2) != 0) {
            str2 = pinCipherEncryptFromConfigParam.keyTag;
        }
        if ((i10 & 4) != 0) {
            bool = pinCipherEncryptFromConfigParam.isHexEncoded;
        }
        return pinCipherEncryptFromConfigParam.copy(str, str2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyTag() {
        return this.keyTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsHexEncoded() {
        return this.isHexEncoded;
    }

    @NotNull
    public final PinCipherEncryptFromConfigParam copy(@Nullable String data, @Nullable String keyTag, @Nullable Boolean isHexEncoded) {
        return new PinCipherEncryptFromConfigParam(data, keyTag, isHexEncoded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinCipherEncryptFromConfigParam)) {
            return false;
        }
        PinCipherEncryptFromConfigParam pinCipherEncryptFromConfigParam = (PinCipherEncryptFromConfigParam) other;
        return Intrinsics.areEqual(this.data, pinCipherEncryptFromConfigParam.data) && Intrinsics.areEqual(this.keyTag, pinCipherEncryptFromConfigParam.keyTag) && Intrinsics.areEqual(this.isHexEncoded, pinCipherEncryptFromConfigParam.isHexEncoded);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getKeyTag() {
        return this.keyTag;
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.keyTag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isHexEncoded;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isHexEncoded() {
        return this.isHexEncoded;
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str = this.data;
        return str == null || str.length() == 0;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setKeyTag(@Nullable String str) {
        this.keyTag = str;
    }

    @NotNull
    public String toString() {
        return "PinCipherEncryptFromConfigParam(data=" + this.data + ", keyTag=" + this.keyTag + ", isHexEncoded=" + this.isHexEncoded + RootService.CLOSE_BRACKET;
    }

    public PinCipherEncryptFromConfigParam(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.data = str;
        this.keyTag = str2;
        this.isHexEncoded = bool;
    }

    public /* synthetic */ PinCipherEncryptFromConfigParam(String str, String str2, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? Boolean.FALSE : bool);
    }
}

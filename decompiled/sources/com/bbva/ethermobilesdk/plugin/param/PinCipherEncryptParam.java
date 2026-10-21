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

/* JADX INFO: compiled from: PinCipherEncryptParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\b\u0010\u001e\u001a\u00020\u0007H\u0016J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/PinCipherEncryptParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "data", "", "modulus", "keyIndex", "isHexEncoded", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKeyIndex", "setKeyIndex", "getModulus", "setModulus", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bbva/ethermobilesdk/plugin/param/PinCipherEncryptParam;", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PinCipherEncryptParam implements MalformedParams {

    @Nullable
    private String data;

    @Nullable
    private final Boolean isHexEncoded;

    @SerializedName("key_index")
    @Nullable
    private String keyIndex;

    @Nullable
    private String modulus;

    public PinCipherEncryptParam() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ PinCipherEncryptParam copy$default(PinCipherEncryptParam pinCipherEncryptParam, String str, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pinCipherEncryptParam.data;
        }
        if ((i10 & 2) != 0) {
            str2 = pinCipherEncryptParam.modulus;
        }
        if ((i10 & 4) != 0) {
            str3 = pinCipherEncryptParam.keyIndex;
        }
        if ((i10 & 8) != 0) {
            bool = pinCipherEncryptParam.isHexEncoded;
        }
        return pinCipherEncryptParam.copy(str, str2, str3, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModulus() {
        return this.modulus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKeyIndex() {
        return this.keyIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsHexEncoded() {
        return this.isHexEncoded;
    }

    @NotNull
    public final PinCipherEncryptParam copy(@Nullable String data, @Nullable String modulus, @Nullable String keyIndex, @Nullable Boolean isHexEncoded) {
        return new PinCipherEncryptParam(data, modulus, keyIndex, isHexEncoded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinCipherEncryptParam)) {
            return false;
        }
        PinCipherEncryptParam pinCipherEncryptParam = (PinCipherEncryptParam) other;
        return Intrinsics.areEqual(this.data, pinCipherEncryptParam.data) && Intrinsics.areEqual(this.modulus, pinCipherEncryptParam.modulus) && Intrinsics.areEqual(this.keyIndex, pinCipherEncryptParam.keyIndex) && Intrinsics.areEqual(this.isHexEncoded, pinCipherEncryptParam.isHexEncoded);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getKeyIndex() {
        return this.keyIndex;
    }

    @Nullable
    public final String getModulus() {
        return this.modulus;
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.modulus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.keyIndex;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isHexEncoded;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isHexEncoded() {
        return this.isHexEncoded;
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2;
        String str3 = this.data;
        return str3 == null || str3.length() == 0 || (str = this.modulus) == null || str.length() == 0 || (str2 = this.keyIndex) == null || str2.length() == 0;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setKeyIndex(@Nullable String str) {
        this.keyIndex = str;
    }

    public final void setModulus(@Nullable String str) {
        this.modulus = str;
    }

    @NotNull
    public String toString() {
        return "PinCipherEncryptParam(data=" + this.data + ", modulus=" + this.modulus + ", keyIndex=" + this.keyIndex + ", isHexEncoded=" + this.isHexEncoded + RootService.CLOSE_BRACKET;
    }

    public PinCipherEncryptParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        this.data = str;
        this.modulus = str2;
        this.keyIndex = str3;
        this.isHexEncoded = bool;
    }

    public /* synthetic */ PinCipherEncryptParam(String str, String str2, String str3, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? Boolean.FALSE : bool);
    }
}

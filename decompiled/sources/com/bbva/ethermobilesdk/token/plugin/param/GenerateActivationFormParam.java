package com.bbva.ethermobilesdk.token.plugin.param;

import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenerateActivationFormParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/param/GenerateActivationFormParam;", "Lcom/bbva/ethermobilesdk/token/plugin/param/MalformedParams;", "authCode", "", ActivateTokenCommand.TOKEN_ID, "deviceId", "protocolVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getDeviceId", "getProtocolVersion", "getTokenId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GenerateActivationFormParam implements MalformedParams {

    @SerializedName("authCode")
    @Nullable
    private final String authCode;

    @SerializedName("deviceId")
    @Nullable
    private final String deviceId;

    @SerializedName("protocolVersion")
    @Nullable
    private final String protocolVersion;

    @SerializedName(ActivateTokenCommand.TOKEN_ID)
    @Nullable
    private final String tokenId;

    public GenerateActivationFormParam() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GenerateActivationFormParam copy$default(GenerateActivationFormParam generateActivationFormParam, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = generateActivationFormParam.authCode;
        }
        if ((i10 & 2) != 0) {
            str2 = generateActivationFormParam.tokenId;
        }
        if ((i10 & 4) != 0) {
            str3 = generateActivationFormParam.deviceId;
        }
        if ((i10 & 8) != 0) {
            str4 = generateActivationFormParam.protocolVersion;
        }
        return generateActivationFormParam.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final GenerateActivationFormParam copy(@Nullable String authCode, @Nullable String tokenId, @Nullable String deviceId, @Nullable String protocolVersion) {
        return new GenerateActivationFormParam(authCode, tokenId, deviceId, protocolVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateActivationFormParam)) {
            return false;
        }
        GenerateActivationFormParam generateActivationFormParam = (GenerateActivationFormParam) other;
        return Intrinsics.areEqual(this.authCode, generateActivationFormParam.authCode) && Intrinsics.areEqual(this.tokenId, generateActivationFormParam.tokenId) && Intrinsics.areEqual(this.deviceId, generateActivationFormParam.deviceId) && Intrinsics.areEqual(this.protocolVersion, generateActivationFormParam.protocolVersion);
    }

    @Nullable
    public final String getAuthCode() {
        return this.authCode;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @Nullable
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        String str = this.authCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tokenId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protocolVersion;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.token.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2;
        String str3 = this.authCode;
        return str3 == null || l.isBlank(str3) || (str = this.tokenId) == null || l.isBlank(str) || (str2 = this.deviceId) == null || l.isBlank(str2);
    }

    @NotNull
    public String toString() {
        String str = this.authCode;
        String str2 = this.tokenId;
        return c.b(a.c("GenerateActivationFormParam(authCode=", str, ", tokenId=", str2, ", deviceId="), this.deviceId, ", protocolVersion=", this.protocolVersion, ")");
    }

    public GenerateActivationFormParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.authCode = str;
        this.tokenId = str2;
        this.deviceId = str3;
        this.protocolVersion = str4;
    }

    public /* synthetic */ GenerateActivationFormParam(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? "1.0" : str4);
    }
}

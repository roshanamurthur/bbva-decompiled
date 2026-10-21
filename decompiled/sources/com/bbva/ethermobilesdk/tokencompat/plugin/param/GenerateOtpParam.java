package com.bbva.ethermobilesdk.tokencompat.plugin.param;

import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.extension.ExtensionKt;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenerateOtpParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/GenerateOtpParam;", "Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/MalformedParams;", "refToken", "", "pin", ClientData.KEY_CHALLENGE, "tokenType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallenge", "()Ljava/lang/String;", "getPin", "getRefToken", "getTokenType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GenerateOtpParam implements MalformedParams {

    @Nullable
    private final String challenge;

    @Nullable
    private final String pin;

    @SerializedName("ref_token")
    @Nullable
    private final String refToken;

    @SerializedName("type")
    @Nullable
    private final String tokenType;

    public GenerateOtpParam() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GenerateOtpParam copy$default(GenerateOtpParam generateOtpParam, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = generateOtpParam.refToken;
        }
        if ((i10 & 2) != 0) {
            str2 = generateOtpParam.pin;
        }
        if ((i10 & 4) != 0) {
            str3 = generateOtpParam.challenge;
        }
        if ((i10 & 8) != 0) {
            str4 = generateOtpParam.tokenType;
        }
        return generateOtpParam.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRefToken() {
        return this.refToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChallenge() {
        return this.challenge;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    @NotNull
    public final GenerateOtpParam copy(@Nullable String refToken, @Nullable String pin, @Nullable String challenge, @Nullable String tokenType) {
        return new GenerateOtpParam(refToken, pin, challenge, tokenType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateOtpParam)) {
            return false;
        }
        GenerateOtpParam generateOtpParam = (GenerateOtpParam) other;
        return Intrinsics.areEqual(this.refToken, generateOtpParam.refToken) && Intrinsics.areEqual(this.pin, generateOtpParam.pin) && Intrinsics.areEqual(this.challenge, generateOtpParam.challenge) && Intrinsics.areEqual(this.tokenType, generateOtpParam.tokenType);
    }

    @Nullable
    public final String getChallenge() {
        return this.challenge;
    }

    @Nullable
    public final String getPin() {
        return this.pin;
    }

    @Nullable
    public final String getRefToken() {
        return this.refToken;
    }

    @Nullable
    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        String str = this.refToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pin;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.challenge;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tokenType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.plugin.param.MalformedParams
    public boolean isMalformed() {
        return ExtensionKt.isMalformedParam(this.refToken) || ExtensionKt.isMalformedTokenType(this.tokenType);
    }

    @NotNull
    public String toString() {
        String str = this.refToken;
        String str2 = this.pin;
        return c.b(a.c("GenerateOtpParam(refToken=", str, ", pin=", str2, ", challenge="), this.challenge, ", tokenType=", this.tokenType, ")");
    }

    public GenerateOtpParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.refToken = str;
        this.pin = str2;
        this.challenge = str3;
        this.tokenType = str4;
    }

    public /* synthetic */ GenerateOtpParam(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}

package com.bbva.ethermobilesdk.tokencompat.plugin.param;

import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.extension.ExtensionKt;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RegisterTokenParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u001bH\u0016J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/RegisterTokenParam;", "Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/MalformedParams;", "authCode", "", "pin", "deviceId", "serial", "headers", "", "requestAppData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getDeviceId", "getHeaders", "()Ljava/util/Map;", "getPin", "getRequestAppData", "getSerial", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RegisterTokenParam implements MalformedParams {

    @SerializedName(SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE)
    @Nullable
    private final String authCode;

    @SerializedName("device_id")
    @Nullable
    private final String deviceId;

    @Nullable
    private final Map<String, String> headers;

    @Nullable
    private final String pin;

    @SerializedName("request_app_data")
    @Nullable
    private final String requestAppData;

    @Nullable
    private final String serial;

    public RegisterTokenParam() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegisterTokenParam copy$default(RegisterTokenParam registerTokenParam, String str, String str2, String str3, String str4, Map map, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = registerTokenParam.authCode;
        }
        if ((i10 & 2) != 0) {
            str2 = registerTokenParam.pin;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = registerTokenParam.deviceId;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = registerTokenParam.serial;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            map = registerTokenParam.headers;
        }
        Map map2 = map;
        if ((i10 & 32) != 0) {
            str5 = registerTokenParam.requestAppData;
        }
        return registerTokenParam.copy(str, str6, str7, str8, map2, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSerial() {
        return this.serial;
    }

    @Nullable
    public final Map<String, String> component5() {
        return this.headers;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRequestAppData() {
        return this.requestAppData;
    }

    @NotNull
    public final RegisterTokenParam copy(@Nullable String authCode, @Nullable String pin, @Nullable String deviceId, @Nullable String serial, @Nullable Map<String, String> headers, @Nullable String requestAppData) {
        return new RegisterTokenParam(authCode, pin, deviceId, serial, headers, requestAppData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterTokenParam)) {
            return false;
        }
        RegisterTokenParam registerTokenParam = (RegisterTokenParam) other;
        return Intrinsics.areEqual(this.authCode, registerTokenParam.authCode) && Intrinsics.areEqual(this.pin, registerTokenParam.pin) && Intrinsics.areEqual(this.deviceId, registerTokenParam.deviceId) && Intrinsics.areEqual(this.serial, registerTokenParam.serial) && Intrinsics.areEqual(this.headers, registerTokenParam.headers) && Intrinsics.areEqual(this.requestAppData, registerTokenParam.requestAppData);
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
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getPin() {
        return this.pin;
    }

    @Nullable
    public final String getRequestAppData() {
        return this.requestAppData;
    }

    @Nullable
    public final String getSerial() {
        return this.serial;
    }

    public int hashCode() {
        String str = this.authCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pin;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serial;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.headers;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str5 = this.requestAppData;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.plugin.param.MalformedParams
    public boolean isMalformed() {
        return ExtensionKt.isMalformedParam(this.authCode) || ExtensionKt.isMalformedParam(this.serial) || ExtensionKt.isMalformedParam(this.deviceId);
    }

    @NotNull
    public String toString() {
        String str = this.authCode;
        String str2 = this.pin;
        String str3 = this.deviceId;
        String str4 = this.serial;
        Map<String, String> map = this.headers;
        String str5 = this.requestAppData;
        StringBuilder sbC = a.c("RegisterTokenParam(authCode=", str, ", pin=", str2, ", deviceId=");
        k.e(sbC, str3, ", serial=", str4, ", headers=");
        sbC.append(map);
        sbC.append(", requestAppData=");
        sbC.append(str5);
        sbC.append(")");
        return sbC.toString();
    }

    public RegisterTokenParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map, @Nullable String str5) {
        this.authCode = str;
        this.pin = str2;
        this.deviceId = str3;
        this.serial = str4;
        this.headers = map;
        this.requestAppData = str5;
    }

    public /* synthetic */ RegisterTokenParam(String str, String str2, String str3, String str4, Map map, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : map, (i10 & 32) != 0 ? null : str5);
    }
}

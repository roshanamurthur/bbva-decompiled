package com.bbva.zoomauth.data;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZoomAuthResponseData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\""}, d2 = {"Lcom/bbva/zoomauth/data/ZoomAuthResponseData;", "", "code", "", "message", "", "data", "Lcom/google/gson/JsonObject;", "base64Img", "(ILjava/lang/String;Lcom/google/gson/JsonObject;Ljava/lang/String;)V", "getBase64Img", "()Ljava/lang/String;", "setBase64Img", "(Ljava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getData", "()Lcom/google/gson/JsonObject;", "setData", "(Lcom/google/gson/JsonObject;)V", "getMessage", "setMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "zoomauth_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ZoomAuthResponseData {

    @Nullable
    private String base64Img;
    private int code;

    @Nullable
    private JsonObject data;

    @Nullable
    private String message;

    public ZoomAuthResponseData(int i10, @Nullable String str, @Nullable JsonObject jsonObject, @Nullable String str2) {
        this.code = i10;
        this.message = str;
        this.data = jsonObject;
        this.base64Img = str2;
    }

    public static /* synthetic */ ZoomAuthResponseData copy$default(ZoomAuthResponseData zoomAuthResponseData, int i10, String str, JsonObject jsonObject, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = zoomAuthResponseData.code;
        }
        if ((i11 & 2) != 0) {
            str = zoomAuthResponseData.message;
        }
        if ((i11 & 4) != 0) {
            jsonObject = zoomAuthResponseData.data;
        }
        if ((i11 & 8) != 0) {
            str2 = zoomAuthResponseData.base64Img;
        }
        return zoomAuthResponseData.copy(i10, str, jsonObject, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBase64Img() {
        return this.base64Img;
    }

    @NotNull
    public final ZoomAuthResponseData copy(int code, @Nullable String message, @Nullable JsonObject data, @Nullable String base64Img) {
        return new ZoomAuthResponseData(code, message, data, base64Img);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZoomAuthResponseData)) {
            return false;
        }
        ZoomAuthResponseData zoomAuthResponseData = (ZoomAuthResponseData) other;
        return this.code == zoomAuthResponseData.code && Intrinsics.areEqual(this.message, zoomAuthResponseData.message) && Intrinsics.areEqual(this.data, zoomAuthResponseData.data) && Intrinsics.areEqual(this.base64Img, zoomAuthResponseData.base64Img);
    }

    @Nullable
    public final String getBase64Img() {
        return this.base64Img;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final JsonObject getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int i10 = this.code * 31;
        String str = this.message;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        JsonObject jsonObject = this.data;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        String str2 = this.base64Img;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setBase64Img(@Nullable String str) {
        this.base64Img = str;
    }

    public final void setCode(int i10) {
        this.code = i10;
    }

    public final void setData(@Nullable JsonObject jsonObject) {
        this.data = jsonObject;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    @NotNull
    public String toString() {
        return "ZoomAuthResponseData(code=" + this.code + ", message=" + ((Object) this.message) + ", data=" + this.data + ", base64Img=" + ((Object) this.base64Img) + RootService.CLOSE_BRACKET;
    }
}

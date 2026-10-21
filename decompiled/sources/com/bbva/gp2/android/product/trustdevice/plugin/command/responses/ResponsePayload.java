package com.bbva.gp2.android.product.trustdevice.plugin.command.responses;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResponsePayload.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/command/responses/ResponsePayload;", "", "result", "", "resultCode", "data", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getResult", "getResultCode", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final /* data */ class ResponsePayload {

    @Nullable
    private final String data;

    @NotNull
    private final String result;

    @Nullable
    private final String resultCode;

    public ResponsePayload(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.result = str;
        this.resultCode = str2;
        this.data = str3;
    }

    public static /* synthetic */ ResponsePayload copy$default(ResponsePayload responsePayload, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responsePayload.result;
        }
        if ((i10 & 2) != 0) {
            str2 = responsePayload.resultCode;
        }
        if ((i10 & 4) != 0) {
            str3 = responsePayload.data;
        }
        return responsePayload.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final ResponsePayload copy(@NotNull String result, @Nullable String resultCode, @Nullable String data) {
        return new ResponsePayload(result, resultCode, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponsePayload)) {
            return false;
        }
        ResponsePayload responsePayload = (ResponsePayload) other;
        return Intrinsics.areEqual(this.result, responsePayload.result) && Intrinsics.areEqual(this.resultCode, responsePayload.resultCode) && Intrinsics.areEqual(this.data, responsePayload.data);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        String str = this.result;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.resultCode;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.data;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ResponsePayload(result=");
        sb2.append(this.result);
        sb2.append(", resultCode=");
        sb2.append(this.resultCode);
        sb2.append(", data=");
        return d.f(sb2, this.data, ")");
    }

    public /* synthetic */ ResponsePayload(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}

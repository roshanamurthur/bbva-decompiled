package com.bbva.plugin.google.pay.responses;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResponsePayload.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/plugin/google/pay/responses/ResponsePayload;", "", "", "component1", "component2", "component3", "result", "resultCode", "data", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "b", "getResultCode", "c", "getData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ResponsePayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String resultCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String data;

    public ResponsePayload(@NotNull String result, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.resultCode = str;
        this.data = str2;
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
        Intrinsics.checkNotNullParameter(result, "result");
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
        int iHashCode = this.result.hashCode() * 31;
        String str = this.resultCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ResponsePayload(result=");
        sb2.append(this.result);
        sb2.append(", resultCode=");
        sb2.append(this.resultCode);
        sb2.append(", data=");
        return y2.b(sb2, this.data, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ ResponsePayload(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}

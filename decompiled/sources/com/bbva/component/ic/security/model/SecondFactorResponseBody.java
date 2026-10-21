package com.bbva.component.ic.security.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecondFactorResponseModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/ic/security/model/SecondFactorResponseBody;", "", "result", "Lcom/bbva/component/ic/security/model/ResponseResult;", "data", "Lcom/bbva/component/ic/security/model/ResponseData;", "<init>", "(Lcom/bbva/component/ic/security/model/ResponseResult;Lcom/bbva/component/ic/security/model/ResponseData;)V", "getResult", "()Lcom/bbva/component/ic/security/model/ResponseResult;", "getData", "()Lcom/bbva/component/ic/security/model/ResponseData;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SecondFactorResponseBody {

    @NotNull
    private final ResponseData data;

    @NotNull
    private final ResponseResult result;

    public SecondFactorResponseBody(@NotNull ResponseResult result, @NotNull ResponseData data) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(data, "data");
        this.result = result;
        this.data = data;
    }

    public static /* synthetic */ SecondFactorResponseBody copy$default(SecondFactorResponseBody secondFactorResponseBody, ResponseResult responseResult, ResponseData responseData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            responseResult = secondFactorResponseBody.result;
        }
        if ((i10 & 2) != 0) {
            responseData = secondFactorResponseBody.data;
        }
        return secondFactorResponseBody.copy(responseResult, responseData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResponseResult getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResponseData getData() {
        return this.data;
    }

    @NotNull
    public final SecondFactorResponseBody copy(@NotNull ResponseResult result, @NotNull ResponseData data) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(data, "data");
        return new SecondFactorResponseBody(result, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondFactorResponseBody)) {
            return false;
        }
        SecondFactorResponseBody secondFactorResponseBody = (SecondFactorResponseBody) other;
        return Intrinsics.areEqual(this.result, secondFactorResponseBody.result) && Intrinsics.areEqual(this.data, secondFactorResponseBody.data);
    }

    @NotNull
    public final ResponseData getData() {
        return this.data;
    }

    @NotNull
    public final ResponseResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.result.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SecondFactorResponseBody(result=" + this.result + ", data=" + this.data + ")";
    }
}

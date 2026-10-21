package com.bbva.component.ic.security.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecondFactorResponseModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/ic/security/model/ResponseResult;", "", "code", "", "info", "internalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getInfo", "getInternalCode", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResponseResult {

    @NotNull
    private final String code;

    @NotNull
    private final String info;

    @SerializedName("internal_code")
    @NotNull
    private final String internalCode;

    public ResponseResult(@NotNull String code, @NotNull String info, @NotNull String internalCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(internalCode, "internalCode");
        this.code = code;
        this.info = info;
        this.internalCode = internalCode;
    }

    public static /* synthetic */ ResponseResult copy$default(ResponseResult responseResult, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responseResult.code;
        }
        if ((i10 & 2) != 0) {
            str2 = responseResult.info;
        }
        if ((i10 & 4) != 0) {
            str3 = responseResult.internalCode;
        }
        return responseResult.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInternalCode() {
        return this.internalCode;
    }

    @NotNull
    public final ResponseResult copy(@NotNull String code, @NotNull String info, @NotNull String internalCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(internalCode, "internalCode");
        return new ResponseResult(code, info, internalCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseResult)) {
            return false;
        }
        ResponseResult responseResult = (ResponseResult) other;
        return Intrinsics.areEqual(this.code, responseResult.code) && Intrinsics.areEqual(this.info, responseResult.info) && Intrinsics.areEqual(this.internalCode, responseResult.internalCode);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final String getInternalCode() {
        return this.internalCode;
    }

    public int hashCode() {
        return this.internalCode.hashCode() + n1.c(this.info, this.code.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.info;
        return d.f(a.c("ResponseResult(code=", str, ", info=", str2, ", internalCode="), this.internalCode, ")");
    }
}

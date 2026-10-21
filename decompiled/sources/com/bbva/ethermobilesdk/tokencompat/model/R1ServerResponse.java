package com.bbva.ethermobilesdk.tokencompat.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: R1ServerResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/R1ServerResponse;", "", "code", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getValue", "setValue", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class R1ServerResponse {

    @Nullable
    private String code;

    @Nullable
    private String value;

    /* JADX WARN: Multi-variable type inference failed */
    public R1ServerResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ R1ServerResponse copy$default(R1ServerResponse r1ServerResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r1ServerResponse.code;
        }
        if ((i10 & 2) != 0) {
            str2 = r1ServerResponse.value;
        }
        return r1ServerResponse.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final R1ServerResponse copy(@Nullable String code, @Nullable String value) {
        return new R1ServerResponse(code, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof R1ServerResponse)) {
            return false;
        }
        R1ServerResponse r1ServerResponse = (R1ServerResponse) other;
        return Intrinsics.areEqual(this.code, r1ServerResponse.code) && Intrinsics.areEqual(this.value, r1ServerResponse.value);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return u.g("R1ServerResponse(code=", this.code, ", value=", this.value, ")");
    }

    public R1ServerResponse(@Nullable String str, @Nullable String str2) {
        this.code = str;
        this.value = str2;
    }

    public /* synthetic */ R1ServerResponse(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}

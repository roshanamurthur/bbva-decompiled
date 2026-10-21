package com.bbva.plugin.smsregex.request.command.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003J'\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/plugin/smsregex/request/command/model/RequestParams;", "", "", "component1", "", "component2", "phone", "patterns", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getPhone", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getPatterns", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class RequestParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phone")
    @Nullable
    private final String phone;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("patterns")
    @Nullable
    private final List<String> patterns;

    public RequestParams(@Nullable String str, @Nullable List<String> list) {
        this.phone = str;
        this.patterns = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestParams copy$default(RequestParams requestParams, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = requestParams.phone;
        }
        if ((i10 & 2) != 0) {
            list = requestParams.patterns;
        }
        return requestParams.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final List<String> component2() {
        return this.patterns;
    }

    @NotNull
    public final RequestParams copy(@Nullable String phone, @Nullable List<String> patterns) {
        return new RequestParams(phone, patterns);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestParams)) {
            return false;
        }
        RequestParams requestParams = (RequestParams) other;
        return Intrinsics.areEqual(this.phone, requestParams.phone) && Intrinsics.areEqual(this.patterns, requestParams.patterns);
    }

    @Nullable
    public final List<String> getPatterns() {
        return this.patterns;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.phone;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.patterns;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RequestParams(phone=" + this.phone + ", patterns=" + this.patterns + ")";
    }
}

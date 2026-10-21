package com.bbva.ethermobilesdk.deviceinfo.plugin.command.params;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetTrueTimeParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/params/GetTrueTimeParams;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "host", "timeout", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/params/GetTrueTimeParams;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getTimeout", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class GetTrueTimeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String host;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer timeout;

    /* JADX WARN: Multi-variable type inference failed */
    public GetTrueTimeParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetTrueTimeParams copy$default(GetTrueTimeParams getTrueTimeParams, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getTrueTimeParams.host;
        }
        if ((i10 & 2) != 0) {
            num = getTrueTimeParams.timeout;
        }
        return getTrueTimeParams.copy(str, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final GetTrueTimeParams copy(@Nullable String host, @Nullable Integer timeout) {
        return new GetTrueTimeParams(host, timeout);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTrueTimeParams)) {
            return false;
        }
        GetTrueTimeParams getTrueTimeParams = (GetTrueTimeParams) other;
        return Intrinsics.areEqual(this.host, getTrueTimeParams.host) && Intrinsics.areEqual(this.timeout, getTrueTimeParams.timeout);
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.timeout;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetTrueTimeParams(host=" + this.host + ", timeout=" + this.timeout + ")";
    }

    public GetTrueTimeParams(@Nullable String str, @Nullable Integer num) {
        this.host = str;
        this.timeout = num;
    }

    public /* synthetic */ GetTrueTimeParams(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "time.google.com" : str, (i10 & 2) != 0 ? 10000 : num);
    }
}

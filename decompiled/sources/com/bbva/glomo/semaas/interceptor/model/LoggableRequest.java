package com.bbva.glomo.semaas.interceptor.model;

import bk.q;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.network.model.response.NetworkResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoggableRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/bbva/glomo/semaas/interceptor/model/LoggableRequest;", "", "", "", "allHeaders", "Lcom/bbva/network/model/response/NetworkResponse;", "component1", "", "component2", "component3", "networkResponse", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/network/model/response/NetworkResponse;", "getNetworkResponse", "()Lcom/bbva/network/model/response/NetworkResponse;", "b", "J", "getStart", "()J", "c", "getEnd", "<init>", "(Lcom/bbva/network/model/response/NetworkResponse;JJ)V", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoggableRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkResponse networkResponse;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long end;

    public LoggableRequest(@NotNull NetworkResponse networkResponse, long j10, long j11) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        this.networkResponse = networkResponse;
        this.start = j10;
        this.end = j11;
    }

    public static /* synthetic */ LoggableRequest copy$default(LoggableRequest loggableRequest, NetworkResponse networkResponse, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            networkResponse = loggableRequest.networkResponse;
        }
        if ((i10 & 2) != 0) {
            j10 = loggableRequest.start;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = loggableRequest.end;
        }
        return loggableRequest.copy(networkResponse, j12, j11);
    }

    @NotNull
    public final Map<String, String> allHeaders() {
        NetworkResponse networkResponse = this.networkResponse;
        return q.plus(networkResponse.getRequest().getHeaders(), networkResponse.getHeaders());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkResponse getNetworkResponse() {
        return this.networkResponse;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    @NotNull
    public final LoggableRequest copy(@NotNull NetworkResponse networkResponse, long start, long end) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return new LoggableRequest(networkResponse, start, end);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoggableRequest)) {
            return false;
        }
        LoggableRequest loggableRequest = (LoggableRequest) other;
        return Intrinsics.areEqual(this.networkResponse, loggableRequest.networkResponse) && this.start == loggableRequest.start && this.end == loggableRequest.end;
    }

    public final long getEnd() {
        return this.end;
    }

    @NotNull
    public final NetworkResponse getNetworkResponse() {
        return this.networkResponse;
    }

    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        int iHashCode = this.networkResponse.hashCode() * 31;
        long j10 = this.start;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.end;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "LoggableRequest(networkResponse=" + this.networkResponse + ", start=" + this.start + ", end=" + this.end + ")";
    }
}

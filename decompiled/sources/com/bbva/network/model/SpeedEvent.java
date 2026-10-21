package com.bbva.network.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.response.NetworkResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpeedEvent.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0010\u0010&R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/bbva/network/model/SpeedEvent;", "", "", "component1", "component2", "component3", "()Ljava/lang/Long;", "", "component4", "Lcom/bbva/network/model/NetworkRequest;", "component5", "Lcom/bbva/network/model/response/NetworkResponse;", "component6", "receivedResponseAtMillis", "sentRequestAtMillis", "contentLength", "isFromCache", "request", DigipassManagerConstants.KEY_RESPONSE, "copy", "(JJLjava/lang/Long;ZLcom/bbva/network/model/NetworkRequest;Lcom/bbva/network/model/response/NetworkResponse;)Lcom/bbva/network/model/SpeedEvent;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "J", "getReceivedResponseAtMillis", "()J", "b", "getSentRequestAtMillis", "c", "Ljava/lang/Long;", "getContentLength", "d", "Z", "()Z", "e", "Lcom/bbva/network/model/NetworkRequest;", "getRequest", "()Lcom/bbva/network/model/NetworkRequest;", "f", "Lcom/bbva/network/model/response/NetworkResponse;", "getResponse", "()Lcom/bbva/network/model/response/NetworkResponse;", "<init>", "(JJLjava/lang/Long;ZLcom/bbva/network/model/NetworkRequest;Lcom/bbva/network/model/response/NetworkResponse;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SpeedEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long receivedResponseAtMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long sentRequestAtMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long contentLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isFromCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkResponse response;

    public SpeedEvent(long j10, long j11, @Nullable Long l6, boolean z10, @NotNull NetworkRequest request, @NotNull NetworkResponse response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        this.receivedResponseAtMillis = j10;
        this.sentRequestAtMillis = j11;
        this.contentLength = l6;
        this.isFromCache = z10;
        this.request = request;
        this.response = response;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getContentLength() {
        return this.contentLength;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsFromCache() {
        return this.isFromCache;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NetworkRequest getRequest() {
        return this.request;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NetworkResponse getResponse() {
        return this.response;
    }

    @NotNull
    public final SpeedEvent copy(long receivedResponseAtMillis, long sentRequestAtMillis, @Nullable Long contentLength, boolean isFromCache, @NotNull NetworkRequest request, @NotNull NetworkResponse response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        return new SpeedEvent(receivedResponseAtMillis, sentRequestAtMillis, contentLength, isFromCache, request, response);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedEvent)) {
            return false;
        }
        SpeedEvent speedEvent = (SpeedEvent) other;
        return this.receivedResponseAtMillis == speedEvent.receivedResponseAtMillis && this.sentRequestAtMillis == speedEvent.sentRequestAtMillis && Intrinsics.areEqual(this.contentLength, speedEvent.contentLength) && this.isFromCache == speedEvent.isFromCache && Intrinsics.areEqual(this.request, speedEvent.request) && Intrinsics.areEqual(this.response, speedEvent.response);
    }

    @Nullable
    public final Long getContentLength() {
        return this.contentLength;
    }

    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    public final NetworkRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final NetworkResponse getResponse() {
        return this.response;
    }

    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        long j10 = this.receivedResponseAtMillis;
        long j11 = this.sentRequestAtMillis;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        Long l6 = this.contentLength;
        int iHashCode = (i10 + (l6 == null ? 0 : l6.hashCode())) * 31;
        boolean z10 = this.isFromCache;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return this.response.hashCode() + ((this.request.hashCode() + ((iHashCode + r1) * 31)) * 31);
    }

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    @NotNull
    public String toString() {
        return "SpeedEvent(receivedResponseAtMillis=" + this.receivedResponseAtMillis + ", sentRequestAtMillis=" + this.sentRequestAtMillis + ", contentLength=" + this.contentLength + ", isFromCache=" + this.isFromCache + ", request=" + this.request + ", response=" + this.response + ")";
    }
}

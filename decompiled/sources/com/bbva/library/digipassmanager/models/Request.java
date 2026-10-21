package com.bbva.library.digipassmanager.models;

import com.bbva.network.constant.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\u0082\u0001\u0003\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/bbva/library/digipassmanager/models/Request;", "", "Lcom/bbva/network/constant/Method;", "a", "Lcom/bbva/network/constant/Method;", "getMethod", "()Lcom/bbva/network/constant/Method;", "method", "", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "", "c", "Ljava/util/Map;", "getQueryParams", "()Ljava/util/Map;", "queryParams", "d", "getHeaders", "headers", "e", "getBody", "body", "Lcom/bbva/library/digipassmanager/models/ActivateTokenRequest;", "Lcom/bbva/library/digipassmanager/models/CreateTokenRequest;", "Lcom/bbva/library/digipassmanager/models/ValidateTokenRequest;", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public abstract class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Method method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> queryParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> body;

    public Request() {
        throw null;
    }

    public Request(Method method, String str, Map map, Map map2, Map map3, DefaultConstructorMarker defaultConstructorMarker) {
        this.method = method;
        this.url = str;
        this.queryParams = map;
        this.headers = map2;
        this.body = map3;
    }

    @NotNull
    public final Map<String, Object> getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, String> getQueryParams() {
        return this.queryParams;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}

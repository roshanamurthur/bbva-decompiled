package com.bbva.component_devicemanager.domain.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.network.constant.Method;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerRequestConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0006\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J%\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003JM\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R3\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/DeviceManagerRequestConfig;", "", "", "component1", "component2", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "component3", "Lcom/bbva/network/constant/Method;", "component4", "urlHost", "urlPath", "headers", "method", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUrlHost", "()Ljava/lang/String;", "b", "getUrlPath", "c", "Ljava/util/HashMap;", "getHeaders", "()Ljava/util/HashMap;", "d", "Lcom/bbva/network/constant/Method;", "getMethod", "()Lcom/bbva/network/constant/Method;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/bbva/network/constant/Method;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DeviceManagerRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String urlHost;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String urlPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashMap<String, String> headers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Method method;

    public DeviceManagerRequestConfig(@NotNull String urlHost, @NotNull String urlPath, @NotNull HashMap<String, String> headers, @NotNull Method method) {
        Intrinsics.checkNotNullParameter(urlHost, "urlHost");
        Intrinsics.checkNotNullParameter(urlPath, "urlPath");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        this.urlHost = urlHost;
        this.urlPath = urlPath;
        this.headers = headers;
        this.method = method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceManagerRequestConfig copy$default(DeviceManagerRequestConfig deviceManagerRequestConfig, String str, String str2, HashMap map, Method method, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceManagerRequestConfig.urlHost;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceManagerRequestConfig.urlPath;
        }
        if ((i10 & 4) != 0) {
            map = deviceManagerRequestConfig.headers;
        }
        if ((i10 & 8) != 0) {
            method = deviceManagerRequestConfig.method;
        }
        return deviceManagerRequestConfig.copy(str, str2, map, method);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrlHost() {
        return this.urlHost;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrlPath() {
        return this.urlPath;
    }

    @NotNull
    public final HashMap<String, String> component3() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final DeviceManagerRequestConfig copy(@NotNull String urlHost, @NotNull String urlPath, @NotNull HashMap<String, String> headers, @NotNull Method method) {
        Intrinsics.checkNotNullParameter(urlHost, "urlHost");
        Intrinsics.checkNotNullParameter(urlPath, "urlPath");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        return new DeviceManagerRequestConfig(urlHost, urlPath, headers, method);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceManagerRequestConfig)) {
            return false;
        }
        DeviceManagerRequestConfig deviceManagerRequestConfig = (DeviceManagerRequestConfig) other;
        return Intrinsics.areEqual(this.urlHost, deviceManagerRequestConfig.urlHost) && Intrinsics.areEqual(this.urlPath, deviceManagerRequestConfig.urlPath) && Intrinsics.areEqual(this.headers, deviceManagerRequestConfig.headers) && this.method == deviceManagerRequestConfig.method;
    }

    @NotNull
    public final HashMap<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final String getUrlHost() {
        return this.urlHost;
    }

    @NotNull
    public final String getUrlPath() {
        return this.urlPath;
    }

    public int hashCode() {
        return this.method.hashCode() + ((this.headers.hashCode() + n1.c(this.urlPath, this.urlHost.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DeviceManagerRequestConfig(urlHost=" + this.urlHost + ", urlPath=" + this.urlPath + ", headers=" + this.headers + ", method=" + this.method + ")";
    }
}

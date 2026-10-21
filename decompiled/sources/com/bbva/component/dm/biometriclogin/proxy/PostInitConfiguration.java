package com.bbva.component.dm.biometriclogin.proxy;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PostInitConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/proxy/PostInitConfiguration;", "", "Lkotlin/Lazy;", "", "a", "Lkotlin/Lazy;", "getExternalDeviceId", "()Lkotlin/Lazy;", "externalDeviceId", "b", "Ljava/lang/String;", "getFacetsUrl", "()Ljava/lang/String;", "facetsUrl", "<init>", "(Lkotlin/Lazy;Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class PostInitConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy<String> externalDeviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String facetsUrl;

    public PostInitConfiguration(@NotNull Lazy<String> externalDeviceId, @NotNull String facetsUrl) {
        Intrinsics.checkNotNullParameter(externalDeviceId, "externalDeviceId");
        Intrinsics.checkNotNullParameter(facetsUrl, "facetsUrl");
        this.externalDeviceId = externalDeviceId;
        this.facetsUrl = facetsUrl;
    }

    @NotNull
    public final Lazy<String> getExternalDeviceId() {
        return this.externalDeviceId;
    }

    @NotNull
    public final String getFacetsUrl() {
        return this.facetsUrl;
    }
}

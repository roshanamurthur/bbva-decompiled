package com.bbva.ethermobilesdk.pinning.model;

import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProviderType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;", "", "catalog", "", LogKeysKt.PROPERTIES, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCatalog", "()Ljava/lang/String;", "getProperties", "APP_PROVIDER", "INTERNAL_PROVIDER", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ProviderType {
    APP_PROVIDER("ether.mobile.sdk.pinning.catalog.storage", "ether.mobile.sdk.pinning.properties.storage"),
    INTERNAL_PROVIDER("ether.mobile.sdk.pinning.internal.catalog.storage", "ether.mobile.sdk.pinning.internal.properties.storage");


    @NotNull
    private final String catalog;

    @NotNull
    private final String properties;

    ProviderType(String str, String str2) {
        this.catalog = str;
        this.properties = str2;
    }

    @NotNull
    public final String getCatalog() {
        return this.catalog;
    }

    @NotNull
    public final String getProperties() {
        return this.properties;
    }
}

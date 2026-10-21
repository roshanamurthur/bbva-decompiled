package com.bbva.ethermobilesdk.sslpinning;

import android.content.Context;
import com.bbva.ethermobilesdk.ethercore.EtherApi;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SslPinningApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/sslpinning/SslPinningApi;", "Lcom/bbva/ethermobilesdk/ethercore/EtherApi;", "Lcom/bbva/ethermobilesdk/sslpinning/SslPinningApiClient;", "Landroid/content/Context;", "context", "createClient", "Lcom/bbva/ethermobilesdk/sslpinning/SslPinningApiConfig;", "config", "<init>", "(Lcom/bbva/ethermobilesdk/sslpinning/SslPinningApiConfig;)V", "sslpinning_release"}, k = 1, mv = {1, 4, 0})
public final class SslPinningApi implements EtherApi<SslPinningApiClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SslPinningApiClient f30028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SslPinningApiConfig f30029b;

    public SslPinningApi(@NotNull SslPinningApiConfig sslPinningApiConfig) {
        this.f30029b = sslPinningApiConfig;
    }

    @Override // com.bbva.ethermobilesdk.ethercore.EtherApi
    @NotNull
    public SslPinningApiClient createClient(@NotNull Context context) throws InitializationException {
        SslPinningApiClient sslPinningApiClient = this.f30028a;
        if (sslPinningApiClient == null) {
            SslPinningApiClient sslPinningApiClient2 = SslPinningApiClient.INSTANCE;
            this.f30028a = sslPinningApiClient2;
            if (sslPinningApiClient2 != null) {
                sslPinningApiClient2.init$sslpinning_release(context, this.f30029b);
            }
            sslPinningApiClient = this.f30028a;
            if (sslPinningApiClient == null) {
                Intrinsics.throwNpe();
            }
        }
        return sslPinningApiClient;
    }
}

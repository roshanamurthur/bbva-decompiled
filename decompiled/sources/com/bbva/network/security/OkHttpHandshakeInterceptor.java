package com.bbva.network.security;

import android.content.Context;
import com.bbva.ethermobilesdk.EtherPinningFactory;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningGlobalEnvironment;
import com.bbva.ethermobilesdk.pinning.verifier.PinningVerifier;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.pinning.PinningCatalog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OkHttpHandshakeInterceptor.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/network/security/OkHttpHandshakeInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Landroid/content/Context;", "context", "Lcom/bbva/network/model/pinning/PinningCatalog;", "pinningCatalog", "", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "interceptors", "<init>", "(Landroid/content/Context;Lcom/bbva/network/model/pinning/PinningCatalog;Ljava/util/List;)V", "network_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOkHttpHandshakeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpHandshakeInterceptor.kt\ncom/bbva/network/security/OkHttpHandshakeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1726#2,3:54\n1726#2,3:57\n*S KotlinDebug\n*F\n+ 1 OkHttpHandshakeInterceptor.kt\ncom/bbva/network/security/OkHttpHandshakeInterceptor\n*L\n35#1:54,3\n43#1:57,3\n*E\n"})
public final class OkHttpHandshakeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<NetworkInterceptor> f35177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final PinningVerifier f35178b;

    /* JADX WARN: Multi-variable type inference failed */
    public OkHttpHandshakeInterceptor(@NotNull Context context, @Nullable PinningCatalog pinningCatalog, @NotNull List<? extends NetworkInterceptor> interceptors) {
        PinningVerifier pinningVerifierCreatePinningVerifier;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f35177a = interceptors;
        if (pinningCatalog != null) {
            int resCatalog = pinningCatalog.getResCatalog();
            PinningGlobalEnvironment mode = pinningCatalog.getMode();
            String assetCatalog = pinningCatalog.getAssetCatalog();
            Boolean resetData = pinningCatalog.getResetData();
            EtherPinningFactory etherPinningFactory = new EtherPinningFactory(context, resCatalog, mode, assetCatalog, resetData != null ? resetData.booleanValue() : false);
            etherPinningFactory.getUpdateManager().schedule(pinningCatalog.getUpdateInterval());
            pinningVerifierCreatePinningVerifier = etherPinningFactory.createPinningVerifier();
        } else {
            pinningVerifierCreatePinningVerifier = null;
        }
        this.f35178b = pinningVerifierCreatePinningVerifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r6.verify(r0, r1) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r5.verify(r2, r1) != false) goto L47;
     */
    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r9) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.network.security.OkHttpHandshakeInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public /* synthetic */ OkHttpHandshakeInterceptor(Context context, PinningCatalog pinningCatalog, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : pinningCatalog, list);
    }
}

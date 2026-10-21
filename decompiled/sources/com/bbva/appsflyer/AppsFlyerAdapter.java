package com.bbva.appsflyer;

import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.mastercard.mpsdk.mcbp.mcmlite.BuildConfig;
import com.salesforce.marketingcloud.config.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppsFlyerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\bH\u0016J&\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/bbva/appsflyer/AppsFlyerAdapter;", "", "generateMgMLink", "", "dataLinkGenerator", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAdditionalData", "", "data", "setConversionListener", "conversionListener", "Lcom/bbva/appsflyer/ConversionListener;", "setCustomer", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "setDebug", BuildConfig.BUILD_TYPE, "", "setDeepLinkListener", "deepLinkListener", "Lcom/bbva/appsflyer/InternalDeepLinkListener;", "setOneLinkCustomDomain", "brandDomain", "startTracking", "trackEvent", a.f64108s, "eventValues", "appsflyer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AppsFlyerAdapter {
    @Nullable
    Object generateMgMLink(@NotNull Map<String, ? extends Object> map, @NotNull Continuation<? super String> continuation);

    void setAdditionalData(@NotNull Map<String, ? extends Object> data);

    void setConversionListener(@NotNull ConversionListener conversionListener);

    void setCustomer(@NotNull String customerId);

    void setDebug(boolean debug);

    void setDeepLinkListener(@NotNull InternalDeepLinkListener deepLinkListener);

    void setOneLinkCustomDomain(@NotNull String brandDomain);

    void startTracking();

    void trackEvent(@NotNull String eventName, @Nullable Map<String, ? extends Object> eventValues);

    /* JADX INFO: compiled from: AppsFlyerAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setAdditionalData(@NotNull AppsFlyerAdapter appsFlyerAdapter, @NotNull Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        public static void setConversionListener(@NotNull AppsFlyerAdapter appsFlyerAdapter, @NotNull ConversionListener conversionListener) {
            Intrinsics.checkNotNullParameter(conversionListener, "conversionListener");
        }

        public static void setCustomer(@NotNull AppsFlyerAdapter appsFlyerAdapter, @NotNull String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
        }

        public static void setDeepLinkListener(@NotNull AppsFlyerAdapter appsFlyerAdapter, @NotNull InternalDeepLinkListener deepLinkListener) {
            Intrinsics.checkNotNullParameter(deepLinkListener, "deepLinkListener");
        }

        public static void trackEvent(@NotNull AppsFlyerAdapter appsFlyerAdapter, @NotNull String eventName, @Nullable Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
        }

        public static void startTracking(@NotNull AppsFlyerAdapter appsFlyerAdapter) {
        }

        public static void setDebug(@NotNull AppsFlyerAdapter appsFlyerAdapter, boolean z10) {
        }
    }
}

package com.bbva.appsflyer;

import android.app.Application;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.mastercard.mpsdk.mcbp.mcmlite.BuildConfig;
import com.salesforce.marketingcloud.config.a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppsFlyerController.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u001c\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J)\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/bbva/appsflyer/AppsFlyerController;", "Lcom/bbva/appsflyer/AppsFlyerAdapter;", "Lcom/bbva/appsflyer/ConversionListener;", "conversionListener", "", "setConversionListener", "Lcom/bbva/appsflyer/InternalDeepLinkListener;", "deepLinkListener", "setDeepLinkListener", "", "brandDomain", "setOneLinkCustomDomain", a.f64108s, "", "", "eventValues", "trackEvent", "startTracking", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "setCustomer", "data", "setAdditionalData", "", BuildConfig.BUILD_TYPE, "setDebug", "dataLinkGenerator", "generateMgMLink", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Application;", "applicationContext", "key", "<init>", "(Landroid/app/Application;Ljava/lang/String;)V", "appsflyer_release"}, k = 1, mv = {1, 8, 0})
public final class AppsFlyerController implements AppsFlyerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f26550a;

    public AppsFlyerController(@NotNull Application applicationContext, @NotNull String key) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f26550a = applicationContext;
        AppsFlyerLib.getInstance().init(key, new LoggerConversionListener(), applicationContext).setCollectIMEI(false);
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    @Nullable
    public Object generateMgMLink(@NotNull Map<String, ? extends Object> map, @NotNull Continuation<? super String> continuation) {
        Unit unit;
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        Application application = this.f26550a;
        LinkGenerator linkGeneratorGenerateInviteUrl = ShareInviteHelper.generateInviteUrl(application);
        if (linkGeneratorGenerateInviteUrl != null) {
            Intrinsics.checkNotNullExpressionValue(linkGeneratorGenerateInviteUrl, "generateInviteUrl(applicationContext)");
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            Object obj = map.get("customBrandDomain");
            if (obj != null) {
                appsFlyerLib.setOneLinkCustomDomain(obj.toString());
            }
            Object obj2 = map.get("idConsoleCampaign");
            if (obj2 != null) {
                appsFlyerLib.setAppInviteOneLink(obj2.toString());
            }
            Object obj3 = map.get("referrerName");
            if (obj3 != null) {
                linkGeneratorGenerateInviteUrl.setReferrerName(obj3.toString());
            }
            Object obj4 = map.get("channel");
            if (obj4 != null) {
                linkGeneratorGenerateInviteUrl.setChannel(obj4.toString());
            }
            Object obj5 = map.get("campaign");
            if (obj5 != null) {
                linkGeneratorGenerateInviteUrl.setCampaign(obj5.toString());
            }
            Object obj6 = map.get("referrerCustomerId");
            if (obj6 == null || linkGeneratorGenerateInviteUrl.setReferrerCustomerId(obj6.toString()) == null) {
                linkGeneratorGenerateInviteUrl.setReferrerCustomerId(AppsFlyerLib.getInstance().getAppsFlyerUID(application));
            }
            if (map.get("parameters") != null) {
                Object obj7 = map.get("parameters");
                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                for (Map.Entry entry : ((Map) obj7).entrySet()) {
                    linkGeneratorGenerateInviteUrl.addParameter(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
            }
            Object obj8 = map.get("brandDomain");
            if (obj8 != null) {
                linkGeneratorGenerateInviteUrl.setBrandDomain(obj8.toString());
            }
        } else {
            linkGeneratorGenerateInviteUrl = null;
        }
        if (linkGeneratorGenerateInviteUrl != null) {
            linkGeneratorGenerateInviteUrl.generateLink(application, new LinkGenerator.ResponseListener() { // from class: com.bbva.appsflyer.AppsFlyerController$generateMgMLink$2$2$1
                @Override // com.appsflyer.share.LinkGenerator.ResponseListener
                public void onResponse(@Nullable String p4) {
                    safeContinuation.resumeWith(Result.m5535constructorimpl(p4));
                }

                @Override // com.appsflyer.share.LinkGenerator.ResponseListener
                public void onResponseError(@Nullable String p4) {
                    Result.Companion companion = Result.INSTANCE;
                    safeContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(new AppsFlyerResponseException(p4))));
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            safeContinuation.resumeWith(Result.m5535constructorimpl(null));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    public void setAdditionalData(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AppsFlyerLib.getInstance().setAdditionalData(new HashMap(data));
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    public void setConversionListener(@NotNull ConversionListener conversionListener) {
        Intrinsics.checkNotNullParameter(conversionListener, "conversionListener");
        AppsFlyerLib.getInstance().registerConversionListener(this.f26550a, new ConversionListenerAdapter(conversionListener));
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    public void setCustomer(@NotNull String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        AppsFlyerLib.getInstance().setCustomerUserId(customerId);
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    public void setDebug(boolean debug) {
        AppsFlyerLib.getInstance().setDebugLog(debug);
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    public void setDeepLinkListener(@NotNull InternalDeepLinkListener deepLinkListener) {
        Intrinsics.checkNotNullParameter(deepLinkListener, "deepLinkListener");
        AppsFlyerLib.getInstance().subscribeForDeepLink(new DeepLinkListenerAdapter(deepLinkListener));
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    public void setOneLinkCustomDomain(@NotNull String brandDomain) {
        Intrinsics.checkNotNullParameter(brandDomain, "brandDomain");
        AppsFlyerLib.getInstance().setOneLinkCustomDomain(brandDomain);
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    public void startTracking() {
        AppsFlyerLib.getInstance().start(this.f26550a);
    }

    @Override // com.bbva.appsflyer.AppsFlyerAdapter
    public void trackEvent(@NotNull String eventName, @Nullable Map<String, ? extends Object> eventValues) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        AppsFlyerLib.getInstance().logEvent(this.f26550a, eventName, eventValues);
    }
}

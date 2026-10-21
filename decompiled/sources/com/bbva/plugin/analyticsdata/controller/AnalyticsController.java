package com.bbva.plugin.analyticsdata.controller;

import android.app.Application;
import android.content.Context;
import com.adobe.marketing.mobile.AdobeCallback;
import com.adobe.marketing.mobile.Identity;
import com.adobe.marketing.mobile.Lifecycle;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.MobilePrivacyStatus;
import com.adobe.marketing.mobile.Signal;
import com.bbva.plugin.analyticsdata.AnalyticsSourceConfig;
import com.bbva.plugin.analyticsdata.controller.AnalyticsController;
import ek.a;
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

/* JADX INFO: compiled from: AnalyticsController.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/analyticsdata/controller/AnalyticsController;", "Lcom/bbva/plugin/analyticsdata/controller/Analytics;", "", "id", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adobe/marketing/mobile/MobilePrivacyStatus;", "getPrivacyStatus", "status", "", "setPrivacyStatus", "Landroid/content/Context;", "context", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;", "config", "<init>", "(Landroid/content/Context;Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;)V", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsController implements Analytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnalyticsSourceConfig f35588a;

    public AnalyticsController(@NotNull Context context, @NotNull AnalyticsSourceConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f35588a = config;
        MobileCore.setApplication((Application) context);
        try {
            Result.Companion companion = Result.INSTANCE;
            Identity.registerExtension();
            com.adobe.marketing.mobile.Analytics.registerExtension();
            Lifecycle.registerExtension();
            Signal.registerExtension();
            MobileCore.start(new AdobeCallback() { // from class: ya.a
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public final void call(Object obj) {
                    AnalyticsController this_runCatching = this.f94761a;
                    Intrinsics.checkNotNullParameter(this_runCatching, "$this_runCatching");
                    AnalyticsSourceConfig analyticsSourceConfig = this_runCatching.f35588a;
                    if (analyticsSourceConfig instanceof AnalyticsSourceConfig.Identifier) {
                        MobileCore.configureWithAppID(analyticsSourceConfig.getValue());
                    } else if (analyticsSourceConfig instanceof AnalyticsSourceConfig.Assets) {
                        MobileCore.configureWithFileInAssets(analyticsSourceConfig.getValue());
                    } else if (analyticsSourceConfig instanceof AnalyticsSourceConfig.FilePath) {
                        MobileCore.configureWithFileInPath(analyticsSourceConfig.getValue());
                    }
                }
            });
            Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // com.bbva.plugin.analyticsdata.controller.Analytics
    @Nullable
    public Object getPrivacyStatus(@NotNull Continuation<? super MobilePrivacyStatus> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        MobileCore.getPrivacyStatus(new AnalyticsController$withSuspendable$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.plugin.analyticsdata.controller.Analytics
    @Nullable
    public Object id(@NotNull Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        Identity.getExperienceCloudId(new AnalyticsController$withSuspendable$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.plugin.analyticsdata.controller.Analytics
    public void setPrivacyStatus(@NotNull MobilePrivacyStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        MobileCore.setPrivacyStatus(status);
    }
}

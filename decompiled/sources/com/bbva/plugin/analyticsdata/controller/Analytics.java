package com.bbva.plugin.analyticsdata.controller;

import com.adobe.marketing.mobile.MobilePrivacyStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Analytics.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/analyticsdata/controller/Analytics;", "", "getPrivacyStatus", "Lcom/adobe/marketing/mobile/MobilePrivacyStatus;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "setPrivacyStatus", "", "status", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Analytics {
    @Nullable
    Object getPrivacyStatus(@NotNull Continuation<? super MobilePrivacyStatus> continuation);

    @Nullable
    Object id(@NotNull Continuation<? super String> continuation);

    void setPrivacyStatus(@NotNull MobilePrivacyStatus status);
}

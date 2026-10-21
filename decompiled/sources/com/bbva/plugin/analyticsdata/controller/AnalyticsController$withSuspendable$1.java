package com.bbva.plugin.analyticsdata.controller;

import androidx.core.app.NotificationCompat;
import com.adobe.marketing.mobile.AdobeCallbackWithError;
import com.adobe.marketing.mobile.AdobeError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnalyticsController.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/bbva/plugin/analyticsdata/controller/AnalyticsController$withSuspendable$1", "Lcom/adobe/marketing/mobile/AdobeCallbackWithError;", "result", "", NotificationCompat.CATEGORY_CALL, "(Ljava/lang/Object;)V", "Lcom/adobe/marketing/mobile/AdobeError;", "error", "fail", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsController$withSuspendable$1 implements AdobeCallbackWithError<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Continuation<Object> f35589a;

    public AnalyticsController$withSuspendable$1(SafeContinuation safeContinuation) {
        this.f35589a = safeContinuation;
    }

    @Override // com.adobe.marketing.mobile.AdobeCallback
    public void call(Object result) {
        this.f35589a.resumeWith(Result.m5535constructorimpl(result));
    }

    @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
    public void fail(@Nullable AdobeError error) {
        AdobeException exception = AdobeExceptionKt.toException(error);
        Result.Companion companion = Result.INSTANCE;
        this.f35589a.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(exception)));
    }
}

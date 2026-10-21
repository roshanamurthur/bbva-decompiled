package com.bbva.appsflyer;

import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConversionListenerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/appsflyer/ConversionListenerAdapter;", "Lcom/appsflyer/AppsFlyerConversionListener;", "", "", "data", "", "onAppOpenAttribution", "", "onConversionDataSuccess", "onConversionDataFail", "onAttributionFailure", "Lcom/bbva/appsflyer/ConversionListener;", "conversionListener", "<init>", "(Lcom/bbva/appsflyer/ConversionListener;)V", "appsflyer_release"}, k = 1, mv = {1, 8, 0})
public final class ConversionListenerAdapter implements AppsFlyerConversionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConversionListener f26556a;

    public ConversionListenerAdapter(@NotNull ConversionListener conversionListener) {
        Intrinsics.checkNotNullParameter(conversionListener, "conversionListener");
        this.f26556a = conversionListener;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(@Nullable Map<String, String> data) {
        this.f26556a.onConversionEvent(new ConversionEvent.AppOpenAttribution(data));
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(@Nullable String data) {
        this.f26556a.onConversionEvent(new ConversionEvent.AttributionFailure(data));
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(@Nullable String data) {
        this.f26556a.onConversionEvent(new ConversionEvent.ConversionDataFail(data));
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(@Nullable Map<String, Object> data) {
        this.f26556a.onConversionEvent(new ConversionEvent.ConversionDataSuccess(data));
    }
}

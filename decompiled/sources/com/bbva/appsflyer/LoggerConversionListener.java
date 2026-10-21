package com.bbva.appsflyer;

import com.appsflyer.AppsFlyerConversionListener;
import com.bbva.androidtoolkit.utils.Tracer;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoggerConversionListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0016J\u001e\u0010\n\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/appsflyer/LoggerConversionListener;", "Lcom/appsflyer/AppsFlyerConversionListener;", "()V", "onAppOpenAttribution", "", "p0", "", "", "onAttributionFailure", "onConversionDataFail", "onConversionDataSuccess", "", "appsflyer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoggerConversionListener implements AppsFlyerConversionListener {
    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(@Nullable Map<String, String> p4) {
        Tracer.i("AppsFlyer: onAppOpenAttribution");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(@Nullable String p4) {
        Tracer.i("AppsFlyer onAttributionFailure");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(@Nullable String p4) {
        Tracer.i("AppsFlyer onConversionDataFail");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(@Nullable Map<String, Object> p4) {
        Tracer.i("AppsFlyer: onConversionDataSuccess");
    }
}

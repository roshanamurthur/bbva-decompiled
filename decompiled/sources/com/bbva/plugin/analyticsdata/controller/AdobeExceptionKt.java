package com.bbva.plugin.analyticsdata.controller;

import com.adobe.marketing.mobile.AdobeError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AdobeException.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toException", "Lcom/bbva/plugin/analyticsdata/controller/AdobeException;", "Lcom/adobe/marketing/mobile/AdobeError;", "analyticsdata-plugin_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class AdobeExceptionKt {
    @NotNull
    public static final AdobeException toException(@Nullable AdobeError adobeError) {
        AdobeException adobeException = adobeError == null ? null : new AdobeException(adobeError.getErrorCode(), adobeError.getErrorName());
        return adobeException == null ? AdobeException.INSTANCE.getUnknownError() : adobeException;
    }
}

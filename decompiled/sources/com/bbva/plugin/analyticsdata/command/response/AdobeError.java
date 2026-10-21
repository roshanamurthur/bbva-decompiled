package com.bbva.plugin.analyticsdata.command.response;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.plugin.analyticsdata.controller.AdobeException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AdobeError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/analyticsdata/command/response/AdobeError;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "Lcom/bbva/plugin/analyticsdata/controller/AdobeException;", "adobeException", "<init>", "(Lcom/bbva/plugin/analyticsdata/controller/AdobeException;)V", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class AdobeError implements ErrorMessage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AdobeException f35584p0;

    public AdobeError(@NotNull AdobeException adobeException) {
        Intrinsics.checkNotNullParameter(adobeException, "adobeException");
        this.f35584p0 = adobeException;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    /* JADX INFO: renamed from: getCode */
    public int getMCode() {
        return this.f35584p0.getErrorCode();
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage */
    public String getMMessage() {
        String errorName = this.f35584p0.getErrorName();
        return errorName != null ? errorName : "";
    }
}

package com.bbva.plugin.analyticsdata.command.response;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.analyticsdata.controller.AdobeException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AdobeError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toErrorMessage", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "analyticsdata-plugin_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class AdobeErrorKt {
    @NotNull
    public static final ErrorMessage toErrorMessage(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return th2 instanceof AdobeException ? new AdobeError((AdobeException) th2) : Errors.ErrorDefault;
    }
}

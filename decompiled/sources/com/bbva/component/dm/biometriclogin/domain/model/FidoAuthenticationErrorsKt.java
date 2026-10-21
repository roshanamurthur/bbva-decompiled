package com.bbva.component.dm.biometriclogin.domain.model;

import com.bbva.sl.ar.android.secsdk.fido.error.FidoError;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoAuthenticationErrors.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"friendlyFraudError", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "BiometricAuthentication_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FidoAuthenticationErrorsKt {
    @NotNull
    public static final FidoException friendlyFraudError() {
        FidoException fidoExceptionBuild = new FidoException.Builder(FidoError.NOT_SET).sdkClientCode("KEY_DISAPPEARED_PERMANENTLY").build();
        Intrinsics.checkNotNullExpressionValue(fidoExceptionBuild, "build(...)");
        return fidoExceptionBuild;
    }
}

package com.bbva.component.ic.security.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OtpErrors.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isNotUnknown", "", "Lcom/bbva/component/ic/security/model/OtpErrors;", "component-ic-security_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OtpErrorsKt {
    public static final boolean isNotUnknown(@NotNull OtpErrors otpErrors) {
        Intrinsics.checkNotNullParameter(otpErrors, "<this>");
        return !Intrinsics.areEqual(otpErrors, OtpErrors.Unknown.INSTANCE);
    }
}

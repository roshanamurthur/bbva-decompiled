package com.bbva.component.dm.biometriclogin.presentation.view;

import ad.d;
import androidx.camera.core.impl.utils.a;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultErrorScreenUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/view/DefaultErrorScreenUtils;", "Lcom/bbva/component/dm/biometriclogin/presentation/view/ErrorScreenUtils;", "()V", "errorScreenOf", "", "errorScreen", "biometryErrorType", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "biometryType", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultErrorScreenUtils implements ErrorScreenUtils {
    @Override // com.bbva.component.dm.biometriclogin.presentation.view.ErrorScreenUtils
    @NotNull
    public String errorScreenOf(@NotNull String errorScreen, @NotNull BiometricErrorNavigation biometryErrorType) {
        Intrinsics.checkNotNullParameter(errorScreen, "errorScreen");
        Intrinsics.checkNotNullParameter(biometryErrorType, "biometryErrorType");
        return a.b(errorScreen, Constant.DASH_STRING, biometryErrorType.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String());
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.view.ErrorScreenUtils
    @NotNull
    public String errorScreenOf(@NotNull String errorScreen, @NotNull String biometryType) {
        Intrinsics.checkNotNullParameter(errorScreen, "errorScreen");
        Intrinsics.checkNotNullParameter(biometryType, "biometryType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(errorScreen);
        return d.f(sb2, Constant.DASH_STRING, biometryType);
    }
}

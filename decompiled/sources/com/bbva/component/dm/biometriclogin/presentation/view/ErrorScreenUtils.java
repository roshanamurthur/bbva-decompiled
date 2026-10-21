package com.bbva.component.dm.biometriclogin.presentation.view;

import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ErrorScreenUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/view/ErrorScreenUtils;", "", "errorScreenOf", "", "errorScreen", "biometryErrorType", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "biometryType", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ErrorScreenUtils {
    @NotNull
    String errorScreenOf(@NotNull String errorScreen, @NotNull BiometricErrorNavigation biometryErrorType);

    @NotNull
    String errorScreenOf(@NotNull String errorScreen, @NotNull String biometryType);
}

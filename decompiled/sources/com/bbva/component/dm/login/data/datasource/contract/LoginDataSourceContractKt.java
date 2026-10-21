package com.bbva.component.dm.login.data.datasource.contract;

import com.bbva.component.dm.login.datamanager.model.LoginException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginDataSourceContract.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"categoryFrom", "Lcom/bbva/component/dm/login/datamanager/model/LoginException$ErrorCategory;", "Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;", "code", "", "component-dm-login_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class LoginDataSourceContractKt {
    @NotNull
    public static final LoginException.ErrorCategory categoryFrom(@NotNull LoginDataSourceContract loginDataSourceContract, @Nullable String str) {
        Intrinsics.checkNotNullParameter(loginDataSourceContract, "<this>");
        if (CollectionsKt___CollectionsKt.contains(loginDataSourceContract.getInvalidCredentialsCodes(), str)) {
            return LoginException.ErrorCategory.INVALID_CREDENTIALS;
        }
        if (CollectionsKt___CollectionsKt.contains(loginDataSourceContract.getBlockedUserCodes(), str)) {
            return LoginException.ErrorCategory.BLOCKED_USER;
        }
        if (CollectionsKt___CollectionsKt.contains(loginDataSourceContract.getExpiredPasswordCodes(), str)) {
            return LoginException.ErrorCategory.EXPIRED_CREDENTIALS;
        }
        if (CollectionsKt___CollectionsKt.contains(loginDataSourceContract.getUnauthorizedAccessCodes(), str)) {
            return LoginException.ErrorCategory.UNAUTHORIZED_ACCESS;
        }
        return CollectionsKt___CollectionsKt.contains(loginDataSourceContract.getUserNotAllowedCodes(), str) ? LoginException.ErrorCategory.NOT_ALLOWED_CREDENTIALS : LoginException.ErrorCategory.UNKNOWN;
    }
}

package com.bbva.glomohybrid.login.domain.mapper;

import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.glomohybrid.login.domain.model.CountryLoginErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryLoginErrorMapperFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/mapper/CountryLoginErrorMapperFactory;", "Lcom/bbva/glomohybrid/login/domain/mapper/LoginErrorMapperFactory;", "()V", "create", "Lcom/bbva/glomohybrid/login/domain/model/CountryLoginErrorType;", "loginException", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountryLoginErrorMapperFactory implements LoginErrorMapperFactory {

    /* JADX INFO: compiled from: CountryLoginErrorMapperFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginException.ErrorCategory.values().length];
            try {
                iArr[LoginException.ErrorCategory.INVALID_CREDENTIALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoginException.ErrorCategory.BLOCKED_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoginException.ErrorCategory.EXPIRED_CREDENTIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoginException.ErrorCategory.UNAUTHORIZED_ACCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoginException.ErrorCategory.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.bbva.glomohybrid.login.domain.mapper.LoginErrorMapperFactory
    @NotNull
    public CountryLoginErrorType create(@NotNull LoginException loginException) {
        Intrinsics.checkNotNullParameter(loginException, "loginException");
        Integer statusCode = loginException.getStatusCode();
        if (statusCode != null && statusCode.intValue() == 504) {
            return CountryLoginErrorType.Flowmeter;
        }
        if (statusCode != null && statusCode.intValue() == 430 && Intrinsics.areEqual(loginException.getCode(), LoginHelperConstants.MAINTENANCE_ERROR_CODE)) {
            return CountryLoginErrorType.MaintenanceFlowmeter;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[loginException.getCategory().ordinal()];
        if (i10 == 1) {
            return CountryLoginErrorType.InvalidCredentials;
        }
        if (i10 == 2) {
            return CountryLoginErrorType.BlockedUser;
        }
        if (i10 == 3) {
            return CountryLoginErrorType.ExpiredCredentials;
        }
        if (i10 != 4) {
            return i10 != 5 ? LoginErrorMapperFactory.DefaultImpls.create(this, loginException) : CountryLoginErrorType.Unknown;
        }
        return CountryLoginErrorType.UnauthorizedAccess;
    }
}

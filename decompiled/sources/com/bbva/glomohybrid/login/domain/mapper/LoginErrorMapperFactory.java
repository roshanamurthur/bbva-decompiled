package com.bbva.glomohybrid.login.domain.mapper;

import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.glomohybrid.login.domain.model.CountryLoginErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginErrorMapperFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/mapper/LoginErrorMapperFactory;", "", "create", "Lcom/bbva/glomohybrid/login/domain/model/CountryLoginErrorType;", "loginException", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LoginErrorMapperFactory {

    /* JADX INFO: compiled from: LoginErrorMapperFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static CountryLoginErrorType create(@NotNull LoginErrorMapperFactory loginErrorMapperFactory, @NotNull LoginException loginException) {
            Intrinsics.checkNotNullParameter(loginException, "loginException");
            return CountryLoginErrorType.GenericError;
        }
    }

    @NotNull
    CountryLoginErrorType create(@NotNull LoginException loginException);
}

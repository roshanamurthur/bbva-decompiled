package com.bbva.glomohybrid.cellsweb.usecase;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.domain.model.LoginResult;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.base.handler.SingleAppHostChangerHandler;
import com.bbva.glomohybrid.cellsweb.usecase.params.ConfigureWebPrivateProfileParams;
import com.bbva.glomohybrid.cellsweb.usecase.result.SwitchPrivateProfileResult;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConfigureWebPrivateProfileUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J)\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/usecase/ConfigureWebPrivateProfileUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomohybrid/cellsweb/usecase/params/ConfigureWebPrivateProfileParams;", "Lcom/bbva/glomohybrid/cellsweb/usecase/result/SwitchPrivateProfileResult;", "Lcom/bbva/glomohybrid/base/handler/SingleAppHostChangerHandler;", "configureAuthenticationProfiles", "", "params", "Lcom/bbva/glomo/user/domain/model/UserType;", "configureLoginDataManager", "type", "", "configureNaturalAuthDataManager", "doLogin", "Lcom/bbva/component/dm/login/domain/model/LoginResult;", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "document", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "(Lcom/bbva/glomohybrid/cellsweb/usecase/params/ConfigureWebPrivateProfileParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isProfileChanged", "", "userType", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ConfigureWebPrivateProfileUseCase extends SuspendUseCaseWithParams<ConfigureWebPrivateProfileParams, SwitchPrivateProfileResult>, SingleAppHostChangerHandler {

    /* JADX INFO: compiled from: ConfigureWebPrivateProfileUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void handleHostChangeNotification(@NotNull ConfigureWebPrivateProfileUseCase configureWebPrivateProfileUseCase, @NotNull MessageDispatcher messageDispatcher, @NotNull MainStorage storage, @NotNull String host) {
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(host, "host");
            SingleAppHostChangerHandler.DefaultImpls.handleHostChangeNotification(configureWebPrivateProfileUseCase, messageDispatcher, storage, host);
        }
    }

    void configureAuthenticationProfiles(@NotNull UserType params);

    void configureLoginDataManager(@NotNull String type);

    void configureNaturalAuthDataManager(@NotNull String type);

    @Nullable
    Object doLogin(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super LoginResult<LoginResponse>> continuation);

    @Nullable
    Object execute(@NotNull ConfigureWebPrivateProfileParams configureWebPrivateProfileParams, @NotNull Continuation<? super SwitchPrivateProfileResult> continuation);

    boolean isProfileChanged(@NotNull UserType userType);
}

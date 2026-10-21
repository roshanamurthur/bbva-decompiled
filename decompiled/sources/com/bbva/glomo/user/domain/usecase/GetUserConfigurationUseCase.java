package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomo.user.repository.datasource.UserTypeDataSource;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetUserConfigurationUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/GetUserConfigurationUseCase;", "", "", "forcePersonalProfile", "forceMainDispatcher", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "execute", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "userTypeDataSource", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGetUserConfigurationUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetUserConfigurationUseCase.kt\ncom/bbva/glomo/user/domain/usecase/GetUserConfigurationUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
public final class GetUserConfigurationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final UserTypeDataSource f30812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f30813c;

    /* JADX INFO: compiled from: GetUserConfigurationUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase$execute$2", f = "GetUserConfigurationUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserProfileConfiguration>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f30815q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f30815q0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetUserConfigurationUseCase.this.new a(this.f30815q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserProfileConfiguration> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            GetUserConfigurationUseCase getUserConfigurationUseCase = GetUserConfigurationUseCase.this;
            return new UserProfileConfiguration(getUserConfigurationUseCase.f30811a.get(), GetUserConfigurationUseCase.access$fetchUserType(getUserConfigurationUseCase, this.f30815q0));
        }
    }

    public GetUserConfigurationUseCase(@NotNull RememberedUserDataSource rememberedUserDataSource, @Nullable UserTypeDataSource userTypeDataSource, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f30811a = rememberedUserDataSource;
        this.f30812b = userTypeDataSource;
        this.f30813c = dispatchers;
    }

    public static final UserType access$fetchUserType(GetUserConfigurationUseCase getUserConfigurationUseCase, boolean z10) {
        UserTypeDataSource userTypeDataSource = getUserConfigurationUseCase.f30812b;
        if (userTypeDataSource == null) {
            return null;
        }
        boolean zIsSelectorActive = userTypeDataSource.isSelectorActive();
        UserType userType = userTypeDataSource.getUserType();
        if (!zIsSelectorActive) {
            userType = null;
        }
        if (userType == null) {
            return null;
        }
        UserType userType2 = UserType.PERSONAL;
        if (userType == userType2 || !z10) {
            return userType;
        }
        userTypeDataSource.storeUserType(userType2);
        return userType2;
    }

    public static /* synthetic */ Object execute$default(GetUserConfigurationUseCase getUserConfigurationUseCase, boolean z10, boolean z11, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return getUserConfigurationUseCase.execute(z10, z11, continuation);
    }

    @Nullable
    public final Object execute(boolean z10, boolean z11, @NotNull Continuation<? super UserProfileConfiguration> continuation) {
        ThreadDispatchers threadDispatchers = this.f30813c;
        return BuildersKt.withContext(z11 ? threadDispatchers.main() : threadDispatchers.io(), new a(z10, null), continuation);
    }

    public /* synthetic */ GetUserConfigurationUseCase(RememberedUserDataSource rememberedUserDataSource, UserTypeDataSource userTypeDataSource, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rememberedUserDataSource, userTypeDataSource, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}

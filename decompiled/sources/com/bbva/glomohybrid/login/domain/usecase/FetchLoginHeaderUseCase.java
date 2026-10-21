package com.bbva.glomohybrid.login.domain.usecase;

import ad.d;
import com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher;
import com.bbva.component.dm.settings.domain.model.LandingBackgrounds;
import com.bbva.component.dm.settings.domain.model.LandingConfiguration;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.fetcher.UserAvatarFetcher;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.login.domain.model.LoginHeaderModel;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FetchLoginHeaderUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/FetchLoginHeaderUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "Lcom/bbva/glomohybrid/login/domain/model/LoginHeaderModel;", "params", "execute", "(Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "host", "Lcom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher;", "landingConfigFetcher", "Lcom/bbva/glomohybrid/base/fetcher/UserAvatarFetcher;", "avatarFetcher", "<init>", "(Ljava/lang/String;Lcom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher;Lcom/bbva/glomohybrid/base/fetcher/UserAvatarFetcher;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFetchLoginHeaderUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchLoginHeaderUseCase.kt\ncom/bbva/glomohybrid/login/domain/usecase/FetchLoginHeaderUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public final class FetchLoginHeaderUseCase implements SuspendUseCaseWithParams<UserProfileConfiguration, LoginHeaderModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f33423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingConfigurationFetcher f33424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UserAvatarFetcher f33425c;

    /* JADX INFO: compiled from: FetchLoginHeaderUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.FetchLoginHeaderUseCase", f = "FetchLoginHeaderUseCase.kt", i = {0, 0}, l = {19}, m = "execute", n = {"this", "config"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public FetchLoginHeaderUseCase f33426p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingConfiguration f33427q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f33428r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f33430t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33428r0 = obj;
            this.f33430t0 |= Integer.MIN_VALUE;
            return FetchLoginHeaderUseCase.this.execute((UserProfileConfiguration) null, (Continuation<? super LoginHeaderModel>) this);
        }
    }

    public FetchLoginHeaderUseCase(@NotNull String host, @NotNull LandingConfigurationFetcher landingConfigFetcher, @NotNull UserAvatarFetcher avatarFetcher) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(landingConfigFetcher, "landingConfigFetcher");
        Intrinsics.checkNotNullParameter(avatarFetcher, "avatarFetcher");
        this.f33423a = host;
        this.f33424b = landingConfigFetcher;
        this.f33425c = avatarFetcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull UserProfileConfiguration userProfileConfiguration, @NotNull Continuation<? super LoginHeaderModel> continuation) {
        a aVar;
        FetchLoginHeaderUseCase fetchLoginHeaderUseCase;
        LandingConfiguration landingConfiguration;
        String strF;
        LandingBackgrounds background;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f33430t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33430t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f33428r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f33430t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingConfiguration landingConfigurationFetchConfiguration = this.f33424b.fetchConfiguration(userProfileConfiguration);
            aVar.f33426p0 = this;
            aVar.f33427q0 = landingConfigurationFetchConfiguration;
            aVar.f33430t0 = 1;
            Object obj2 = this.f33425c.get(userProfileConfiguration, landingConfigurationFetchConfiguration, aVar);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            fetchLoginHeaderUseCase = this;
            obj = obj2;
            landingConfiguration = landingConfigurationFetchConfiguration;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            landingConfiguration = aVar.f33427q0;
            fetchLoginHeaderUseCase = aVar.f33426p0;
            ResultKt.throwOnFailure(obj);
        }
        UserAvatarModel userAvatarModel = (UserAvatarModel) obj;
        fetchLoginHeaderUseCase.getClass();
        String login = (landingConfiguration == null || (background = landingConfiguration.getBackground()) == null) ? null : background.getLogin();
        if (login == null || (strF = d.f(new StringBuilder(), fetchLoginHeaderUseCase.f33423a, login)) == null) {
            strF = "not-found";
        }
        return new LoginHeaderModel(userAvatarModel, strF);
    }
}

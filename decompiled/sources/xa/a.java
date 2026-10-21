package xa;

import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.notifications.viewmodel.NotificationDetailViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: NotificationDetailViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel$fetchAppSettings$2", f = "NotificationDetailViewModel.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nNotificationDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailViewModel.kt\ncom/bbva/notifications/viewmodel/NotificationDetailViewModel$fetchAppSettings$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,372:1\n41#2,6:373\n47#2:380\n133#3:379\n107#4:381\n*S KotlinDebug\n*F\n+ 1 NotificationDetailViewModel.kt\ncom/bbva/notifications/viewmodel/NotificationDetailViewModel$fetchAppSettings$2\n*L\n294#1:373,6\n294#1:380\n294#1:379\n294#1:381\n*E\n"})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AppSettingsResult>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f94499p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ NotificationDetailViewModel f94500q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NotificationDetailViewModel notificationDetailViewModel, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f94500q0 = notificationDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f94500q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AppSettingsResult> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f94499p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ViewModelComponentsProviders viewModelComponentsProviders = this.f94500q0.f35475q0;
            FetchSettingsUseCase fetchSettingsUseCase = (FetchSettingsUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(FetchSettingsUseCase.class), null, null);
            SettingsPolicy settingsPolicy = SettingsPolicy.LocalFirst;
            this.f94499p0 = 1;
            obj = fetchSettingsUseCase.execute(settingsPolicy, (Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return EitherKt.rightOrNull((Either) obj);
    }
}

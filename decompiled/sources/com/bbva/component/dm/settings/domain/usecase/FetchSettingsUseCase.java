package com.bbva.component.dm.settings.domain.usecase;

import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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

/* JADX INFO: compiled from: FetchSettingsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/settings/domain/usecase/FetchSettingsUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/component/dm/settings/repository/SettingsPolicy;", "Lcom/bbva/glomoutils/Either;", "", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "params", "execute", "(Lcom/bbva/component/dm/settings/repository/SettingsPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "repository", "", "Lcom/bbva/component/dm/settings/domain/usecase/AppSettingsObserver;", "observers", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatcher", "<init>", "(Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;Ljava/util/List;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final class FetchSettingsUseCase implements SuspendUseCaseWithParams<SettingsPolicy, Either<? extends Throwable, ? extends AppSettingsResult>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f28026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<AppSettingsObserver> f28027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f28028c;

    /* JADX INFO: compiled from: FetchSettingsUseCase.kt */
    @DebugMetadata(c = "com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase$execute$2", f = "FetchSettingsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFetchSettingsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchSettingsUseCase.kt\ncom/bbva/component/dm/settings/domain/usecase/FetchSettingsUseCase$execute$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1#2:31\n1855#3,2:32\n*S KotlinDebug\n*F\n+ 1 FetchSettingsUseCase.kt\ncom/bbva/component/dm/settings/domain/usecase/FetchSettingsUseCase$execute$2\n*L\n24#1:32,2\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SettingsPolicy f28030q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SettingsPolicy settingsPolicy, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28030q0 = settingsPolicy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FetchSettingsUseCase.this.new a(this.f28030q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            Object objM5535constructorimpl2;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            FetchSettingsUseCase fetchSettingsUseCase = FetchSettingsUseCase.this;
            AppSettingsRepository appSettingsRepository = fetchSettingsUseCase.f28026a;
            SettingsPolicy settingsPolicy = this.f28030q0;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(appSettingsRepository.getSettings(settingsPolicy));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                AppSettingsResult appSettingsResult = (AppSettingsResult) objM5535constructorimpl;
                Iterator it = fetchSettingsUseCase.f28027b.iterator();
                while (it.hasNext()) {
                    ((AppSettingsObserver) it.next()).onReceive(appSettingsResult);
                }
                objM5535constructorimpl2 = Result.m5535constructorimpl(EitherKt.right(appSettingsResult));
            } else {
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
            return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl2 : EitherKt.left(thM5538exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchSettingsUseCase(@NotNull AppSettingsRepository repository, @NotNull List<? extends AppSettingsObserver> observers, @NotNull ThreadDispatchers dispatcher) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(observers, "observers");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f28026a = repository;
        this.f28027b = observers;
        this.f28028c = dispatcher;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull SettingsPolicy settingsPolicy, @NotNull Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>> continuation) {
        return BuildersKt.withContext(this.f28028c.io(), new a(settingsPolicy, null), continuation);
    }

    public /* synthetic */ FetchSettingsUseCase(AppSettingsRepository appSettingsRepository, List list, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(appSettingsRepository, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}

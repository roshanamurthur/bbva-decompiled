package com.bbva.slidemenuview.cells.components.dm;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import com.bbva.slidemenuview.domain.model.MenuItems;
import com.bbva.slidemenuview.domain.usecase.MarkItemAsVisitedUseCase;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuDataManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B#\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lcom/bbva/slidemenuview/cells/components/dm/MenuDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "", "itemId", "", "markItemAsVisited", "Lcom/bbva/slidemenuview/cells/components/dm/MenuUseCaseFactory;", "useCaseFactory", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lcom/bbva/slidemenuview/cells/components/dm/MenuUseCaseFactory;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;Lkotlinx/coroutines/CoroutineScope;)V", "Companion", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MenuDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-menu";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MenuUseCaseFactory f36658p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f36659q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f36660r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f36661s0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Pair<Integer, Boolean>> f36657t0 = new ActionSpec<>("action-menu-refresh-item");

    /* JADX INFO: compiled from: MenuDataManager.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bbva/slidemenuview/cells/components/dm/MenuDataManager$Companion;", "", "()V", "ACTION_REFRESH_ITEM", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lkotlin/Pair;", "", "", "getACTION_REFRESH_ITEM", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ID", "", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Pair<Integer, Boolean>> getACTION_REFRESH_ITEM() {
            return MenuDataManager.f36657t0;
        }
    }

    /* JADX INFO: compiled from: MenuDataManager.kt */
    public static final class a extends Lambda implements Function0<MarkItemAsVisitedUseCase> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MarkItemAsVisitedUseCase invoke() {
            return MenuDataManager.this.f36658p0.markAsVisitedUseCase();
        }
    }

    /* JADX INFO: compiled from: MenuDataManager.kt */
    @DebugMetadata(c = "com.bbva.slidemenuview.cells.components.dm.MenuDataManager$markItemAsVisited$1", f = "MenuDataManager.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36663p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f36665r0;

        /* JADX INFO: compiled from: MenuDataManager.kt */
        @DebugMetadata(c = "com.bbva.slidemenuview.cells.components.dm.MenuDataManager$markItemAsVisited$1$1", f = "MenuDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MenuItems>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MenuDataManager f36666p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ int f36667q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MenuDataManager menuDataManager, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f36666p0 = menuDataManager;
                this.f36667q0 = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f36666p0, this.f36667q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MenuItems> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return MenuDataManager.access$getMarkAsVisitedUseCase(this.f36666p0).execute(Boxing.boxInt(this.f36667q0));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f36665r0 = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuDataManager.this.new b(this.f36665r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36663p0;
            int i11 = this.f36665r0;
            MenuDataManager menuDataManager = MenuDataManager.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcherIo = menuDataManager.f36659q0.io();
                a aVar = new a(menuDataManager, i11, null);
                this.f36663p0 = 1;
                if (BuildersKt.withContext(coroutineDispatcherIo, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            menuDataManager.fire(MenuDataManager.INSTANCE.getACTION_REFRESH_ITEM(), TuplesKt.to(Boxing.boxInt(i11), Boxing.boxBoolean(false)));
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MenuDataManager(MenuUseCaseFactory menuUseCaseFactory, ThreadDispatchers threadDispatchers, CoroutineScope coroutineScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(menuUseCaseFactory, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers, (i10 & 4) != 0 ? CoroutineScopeKt.MainScope() : coroutineScope);
    }

    public static final UseCaseWithParams access$getMarkAsVisitedUseCase(MenuDataManager menuDataManager) {
        return (UseCaseWithParams) menuDataManager.f36661s0.getValue();
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    public final void markItemAsVisited(int itemId) {
        BuildersKt__Builders_commonKt.launch$default(this.f36660r0, null, null, new b(itemId, null), 3, null);
    }

    public MenuDataManager(@NotNull MenuUseCaseFactory useCaseFactory, @NotNull ThreadDispatchers dispatchers, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(useCaseFactory, "useCaseFactory");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f36658p0 = useCaseFactory;
        this.f36659q0 = dispatchers;
        this.f36660r0 = scope;
        this.f36661s0 = LazyKt__LazyJVMKt.lazy(new a());
    }
}

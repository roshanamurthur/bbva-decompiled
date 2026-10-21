package l8;

import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.cellsweb.presentation.CellsWebContract;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$handleNavigationToPublicZone$1", f = "CellsWebGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CellsWebGlobalViewModel f83110p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CellsWebGlobalViewModel cellsWebGlobalViewModel, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f83110p0 = cellsWebGlobalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f83110p0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f83110p0.f31771x0.setValue(new Event(new CellsWebContract.Event.NativeNavigation(new Route("landing", Animation.Fade.INSTANCE, null, 4, null))));
        return Unit.INSTANCE;
    }
}

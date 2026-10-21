package l8;

import com.bbva.glomohybrid.cellsweb.presentation.CellsWebContract;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeContract;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$collectUserTypeEvents$1", f = "CellsWebViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83113p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CellsWebViewModel f83114q0;

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CellsWebViewModel f83115p0;

        public a(CellsWebViewModel cellsWebViewModel) {
            this.f83115p0 = cellsWebViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            UserTypeContract.Event event = (UserTypeContract.Event) obj;
            if (event instanceof UserTypeContract.Event.ShowModal) {
                this.f83115p0.sendEvent(new CellsWebContract.Event.ShowModal(((UserTypeContract.Event.ShowModal) event).getModal()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CellsWebViewModel cellsWebViewModel, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f83114q0 = cellsWebViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f83114q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83113p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CellsWebViewModel cellsWebViewModel = this.f83114q0;
            Flow<UserTypeContract.Event> userTypeEvents = cellsWebViewModel.getUserTypeViewModelDelegate().getUserTypeEvents();
            a aVar = new a(cellsWebViewModel);
            this.f83113p0 = 1;
            if (userTypeEvents.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

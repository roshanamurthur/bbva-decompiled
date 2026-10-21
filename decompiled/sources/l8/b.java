package l8;

import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.cellsweb.presentation.CellsWebContract;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeeplinkWebContract;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsWebGlobalViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel$mapDeeplinkEventsToCellsWebEvents$1", f = "CellsWebGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<DeeplinkWebContract.Event, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f83111p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CellsWebGlobalViewModel f83112q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CellsWebGlobalViewModel cellsWebGlobalViewModel, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f83112q0 = cellsWebGlobalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        b bVar = new b(this.f83112q0, continuation);
        bVar.f83111p0 = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeeplinkWebContract.Event event, Continuation<? super Unit> continuation) {
        return ((b) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DeeplinkWebContract.Event event = (DeeplinkWebContract.Event) this.f83111p0;
        if (event instanceof DeeplinkWebContract.Event.ShowNotificationChangeProfileRequest) {
            CellsWebGlobalViewModel cellsWebGlobalViewModel = this.f83112q0;
            if (cellsWebGlobalViewModel instanceof UserTypeViewModelDelegate) {
                ((UserTypeViewModelDelegate) cellsWebGlobalViewModel).setPendingDeeplink(((DeeplinkWebContract.Event.ShowNotificationChangeProfileRequest) event).getDeepLink());
            }
            cellsWebGlobalViewModel.f31771x0.setValue(new Event(new CellsWebContract.Event.ShowModal(new ModalType.ChangeProfileRequestByDeeplink(((DeeplinkWebContract.Event.ShowNotificationChangeProfileRequest) event).getNewUserType()))));
        }
        return Unit.INSTANCE;
    }
}

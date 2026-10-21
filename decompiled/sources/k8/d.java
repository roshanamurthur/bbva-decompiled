package k8;

import com.bbva.glomohybrid.cellsweb.presentation.model.ModalsContract;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.cellsweb.presentation.view.ModalsView;
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

/* JADX INFO: compiled from: CellsWebActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity$setupObservers$4", f = "CellsWebActivity.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f79246p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CellsWebActivity f79247q0;

    /* JADX INFO: compiled from: CellsWebActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CellsWebActivity f79248p0;

        public a(CellsWebActivity cellsWebActivity) {
            this.f79248p0 = cellsWebActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            ModalsContract.Intent intent = (ModalsContract.Intent) obj;
            boolean z10 = intent instanceof ModalsContract.Intent.ConfirmClick;
            CellsWebActivity cellsWebActivity = this.f79248p0;
            if (z10) {
                cellsWebActivity.i().onModalConfirmClick(intent.getModal());
            } else if (intent instanceof ModalsContract.Intent.CancelClick) {
                cellsWebActivity.i().onModalCancelClick(intent.getModal());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CellsWebActivity cellsWebActivity, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f79247q0 = cellsWebActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f79247q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Flow<ModalsContract.Intent> intents;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f79246p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CellsWebActivity cellsWebActivity = this.f79247q0;
            ModalsView modalsViewAccess$getSingleAppModalsView = CellsWebActivity.access$getSingleAppModalsView(cellsWebActivity);
            if (modalsViewAccess$getSingleAppModalsView != null && (intents = modalsViewAccess$getSingleAppModalsView.getIntents()) != null) {
                a aVar = new a(cellsWebActivity);
                this.f79246p0 = 1;
                if (intents.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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

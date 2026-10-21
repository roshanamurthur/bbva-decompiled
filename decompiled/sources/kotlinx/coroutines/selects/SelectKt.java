package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00030\b2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\"c\u0010\u001a\u001aQ\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001e\"\u001a\u0010\"\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010$*Â\u0001\b\u0007\u0010(\"[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030%¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00010\u00142[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030%¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00010\u0014B\u0002\b'*¦\u0001\b\u0007\u0010)\"M\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142M\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014B\u0002\b'*¦\u0001\b\u0007\u0010*\"M\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030%¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00030\u00142M\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030%¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00030\u0014B\u0002\b'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "select", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlin/ParameterName;", "name", "cause", "onCancellation", "", "tryResume", "", "trySelectInternalResult", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "TrySelectDetailedResult", "Lkotlin/Function3;", "", "clauseObject", "param", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "DUMMY_PROCESS_RESULT_FUNCTION", "Lkotlin/jvm/functions/Function3;", "Lkotlinx/coroutines/internal/Symbol;", "STATE_REG", "Lkotlinx/coroutines/internal/Symbol;", "STATE_COMPLETED", "STATE_CANCELLED", "NO_RESULT", "PARAM_CLAUSE_0", "getPARAM_CLAUSE_0", "()Lkotlinx/coroutines/internal/Symbol;", "Lkotlinx/coroutines/selects/SelectInstance;", "internalResult", "Lkotlinx/coroutines/InternalCoroutinesApi;", "OnCancellationConstructor", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
public final class SelectKt {

    @NotNull
    private static final Function3<Object, Object, Object, Object> DUMMY_PROCESS_RESULT_FUNCTION = new Function3() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Void invoke(@NotNull Object obj, @Nullable Object obj2, @Nullable Object obj3) {
            return null;
        }
    };

    @NotNull
    private static final Symbol STATE_REG = new Symbol("STATE_REG");

    @NotNull
    private static final Symbol STATE_COMPLETED = new Symbol("STATE_COMPLETED");

    @NotNull
    private static final Symbol STATE_CANCELLED = new Symbol("STATE_CANCELLED");

    @NotNull
    private static final Symbol NO_RESULT = new Symbol("NO_RESULT");

    @NotNull
    private static final Symbol PARAM_CLAUSE_0 = new Symbol("PARAM_CLAUSE_0");

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrySelectDetailedResult TrySelectDetailedResult(int i10) {
        if (i10 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i10 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i10 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i10 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    @NotNull
    public static final Symbol getPARAM_CLAUSE_0() {
        return PARAM_CLAUSE_0;
    }

    @Nullable
    public static final <R> Object select(@NotNull Function1<? super SelectBuilder<? super R>, Unit> function1, @NotNull Continuation<? super R> continuation) {
        SelectImplementation selectImplementation = new SelectImplementation(continuation.getContext());
        function1.invoke(selectImplementation);
        return selectImplementation.doSelect(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tryResume(CancellableContinuation<? super Unit> cancellableContinuation, Function1<? super Throwable, Unit> function1) {
        Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, function1);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void RegistrationFunction$annotations() {
    }
}

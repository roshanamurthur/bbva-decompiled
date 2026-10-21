package kotlinx.coroutines;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J`\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR1\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "", "Lkotlinx/coroutines/CancellableContinuationImpl;", "cont", "", "cause", "", "invokeHandlers", "result", "Lkotlinx/coroutines/CancelHandler;", "cancelHandler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "idempotentResume", "cancelCause", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Ljava/lang/Object;", "Lkotlinx/coroutines/CancelHandler;", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Throwable;", "getCancelled", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,662:1\n1#2:663\n*E\n"})
final /* data */ class CompletedContinuation {

    @JvmField
    @Nullable
    public final Throwable cancelCause;

    @JvmField
    @Nullable
    public final CancelHandler cancelHandler;

    @JvmField
    @Nullable
    public final Object idempotentResume;

    @JvmField
    @Nullable
    public final Function1<Throwable, Unit> onCancellation;

    @JvmField
    @Nullable
    public final Object result;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(@Nullable Object obj, @Nullable CancelHandler cancelHandler, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th2) {
        this.result = obj;
        this.cancelHandler = cancelHandler;
        this.onCancellation = function1;
        this.idempotentResume = obj2;
        this.cancelCause = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation copy$default(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, Function1 function1, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i10 & 2) != 0) {
            cancelHandler = completedContinuation.cancelHandler;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        if ((i10 & 4) != 0) {
            function1 = completedContinuation.onCancellation;
        }
        Function1 function2 = function1;
        if ((i10 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = completedContinuation.cancelCause;
        }
        return completedContinuation.copy(obj, cancelHandler2, function2, obj4, th2);
    }

    @NotNull
    public final CompletedContinuation copy(@Nullable Object result, @Nullable CancelHandler cancelHandler, @Nullable Function1<? super Throwable, Unit> onCancellation, @Nullable Object idempotentResume, @Nullable Throwable cancelCause) {
        return new CompletedContinuation(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) other;
        return Intrinsics.areEqual(this.result, completedContinuation.result) && Intrinsics.areEqual(this.cancelHandler, completedContinuation.cancelHandler) && Intrinsics.areEqual(this.onCancellation, completedContinuation.onCancellation) && Intrinsics.areEqual(this.idempotentResume, completedContinuation.idempotentResume) && Intrinsics.areEqual(this.cancelCause, completedContinuation.cancelCause);
    }

    public final boolean getCancelled() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        Object obj = this.result;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CancelHandler cancelHandler = this.cancelHandler;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.cancelCause;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final void invokeHandlers(@NotNull CancellableContinuationImpl<?> cont, @NotNull Throwable cause) {
        CancelHandler cancelHandler = this.cancelHandler;
        if (cancelHandler != null) {
            cont.callCancelHandler(cancelHandler, cause);
        }
        Function1<Throwable, Unit> function1 = this.onCancellation;
        if (function1 != null) {
            cont.callOnCancellation(function1, cause);
        }
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, Function1 function1, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : cancelHandler, (i10 & 4) != 0 ? null : function1, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}

package kb;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.plugin.rateapp.command.InAppReviewCommand;
import com.bbva.rateapp.InAppReview;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppReviewCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.rateapp.command.InAppReviewCommand$executeReview$1$1", f = "InAppReviewCommand.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f79278p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ InAppReview f79279q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Activity f79280r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f79281s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ InAppReviewCommand f79282t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InAppReview inAppReview, Activity activity, CommandCallback commandCallback, InAppReviewCommand inAppReviewCommand, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f79279q0 = inAppReview;
        this.f79280r0 = activity;
        this.f79281s0 = commandCallback;
        this.f79282t0 = inAppReviewCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f79279q0, this.f79280r0, this.f79281s0, this.f79282t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f79278p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f79278p0 = 1;
            obj = this.f79279q0.showInAppReview(this.f79280r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        boolean z10 = result instanceof Result.Success;
        CommandCallback commandCallback = this.f79281s0;
        if (z10) {
            commandCallback.sendEvent();
        } else if (result instanceof Result.Error) {
            InAppReviewCommand.access$sendError(this.f79282t0, commandCallback, ((Result.Error) result).getException());
        }
        return Unit.INSTANCE;
    }
}

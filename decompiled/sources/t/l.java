package t;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", f = "Clickable.kt", i = {}, l = {BluetoothState.REQUEST_ENABLE_BT}, m = "invokeSuspend", n = {}, s = {})
public final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93410p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f93411q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ PressInteraction.Press f93412r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f93411q0 = mutableInteractionSource;
        this.f93412r0 = press;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new l(this.f93411q0, this.f93412r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93410p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PressInteraction.Release release = new PressInteraction.Release(this.f93412r0);
            this.f93410p0 = 1;
            if (this.f93411q0.emit(release, this) == coroutine_suspended) {
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

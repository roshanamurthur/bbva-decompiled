package ec;

import com.bbva.smartassistance.SmartAssistanceController;
import com.bbva.smartassistance.listeners.CustomBaseSessionListener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import net.ipsoft.amelia.sdk.IAmeliaChat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SmartAssistanceController.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.smartassistance.SmartAssistanceController$createSession$2", f = "SmartAssistanceController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SmartAssistanceController f68307p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CustomBaseSessionListener f68308q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SmartAssistanceController smartAssistanceController, CustomBaseSessionListener customBaseSessionListener, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f68307p0 = smartAssistanceController;
        this.f68308q0 = customBaseSessionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f68307p0, this.f68308q0, continuation);
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
        IAmeliaChat iAmeliaChat = this.f68307p0.f36793c;
        if (iAmeliaChat == null) {
            return null;
        }
        CustomBaseSessionListener customBaseSessionListener = this.f68308q0;
        if (customBaseSessionListener != null) {
            customBaseSessionListener.setIAmeliaChat(iAmeliaChat);
        }
        iAmeliaChat.addSessionListener(customBaseSessionListener);
        iAmeliaChat.initialize();
        return Unit.INSTANCE;
    }
}

package g8;

import com.bbva.glomohybrid.base.session.SessionTokenGenerator;
import com.bbva.glomohybrid.base.usecase.AbstractStartBioCatchUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionTokenGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.base.session.SessionTokenGenerator$startBioCatch$2", f = "SessionTokenGenerator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SessionTokenGenerator f68588p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f68589q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SessionTokenGenerator sessionTokenGenerator, String str, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f68588p0 = sessionTokenGenerator;
        this.f68589q0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f68588p0, this.f68589q0, continuation);
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
        AbstractStartBioCatchUseCase abstractStartBioCatchUseCase = this.f68588p0.f31521e;
        if (abstractStartBioCatchUseCase == null) {
            return null;
        }
        abstractStartBioCatchUseCase.execute(this.f68589q0);
        return Unit.INSTANCE;
    }
}

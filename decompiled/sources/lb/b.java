package lb;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.plugin.smsregex.request.SmsFactory;
import com.bbva.plugin.smsregex.request.command.Request;
import com.bbva.smsregex.extractor.initializer.helpers.SmsClientResult;
import com.bbva.smsregex.extractor.initializer.helpers.SmsRetrieverContract;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.smsregex.request.command.Request$startClient$2", f = "Request.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SmsClientResult>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Request f83172q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f83173r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Request request, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f83172q0 = request;
        this.f83173r0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f83172q0, this.f83173r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SmsClientResult> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83171p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Request request = this.f83172q0;
            SmsFactory factory = request.f36038p0.getFactory();
            Application application = ((AbstractCommand) request).mApplication;
            Intrinsics.checkNotNullExpressionValue(application, "access$getMApplication$p$s-1534621073(...)");
            SmsRetrieverContract smsRetrieverContractCreateClient = factory.createClient(application);
            this.f83171p0 = 1;
            obj = smsRetrieverContractCreateClient.start(this.f83173r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

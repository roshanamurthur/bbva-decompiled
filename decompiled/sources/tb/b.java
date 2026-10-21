package tb;

import android.content.Intent;
import com.bbva.qr.activity.ScannerActivity;
import com.bbva.qr.utils.ConstantsKt;
import com.esotericsoftware.asm.Opcodes;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScannerActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.qr.activity.ScannerActivity$setTimeout$1", f = "ScannerActivity.kt", i = {}, l = {Opcodes.MONITORENTER}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93499p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f93500q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ScannerActivity f93501r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, ScannerActivity scannerActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f93500q0 = i10;
        this.f93501r0 = scannerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f93500q0, this.f93501r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93499p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            long j10 = this.f93500q0;
            this.f93499p0 = 1;
            if (DelayKt.delay(j10, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Intent intent = new Intent();
        intent.putExtra(ConstantsKt.IS_TIMEOUT, "timeout");
        ScannerActivity scannerActivity = this.f93501r0;
        scannerActivity.setResult(-1, intent);
        scannerActivity.finish();
        return Unit.INSTANCE;
    }
}

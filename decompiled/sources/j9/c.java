package j9;

import com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase", f = "RemoveUserDataUseCase.kt", i = {}, l = {85}, m = "unrollManualFirebaseNotification", n = {}, s = {})
public final class c extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f78813p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RemoveUserDataUseCase f78814q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f78815r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RemoveUserDataUseCase removeUserDataUseCase, Continuation<? super c> continuation) {
        super(continuation);
        this.f78814q0 = removeUserDataUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f78813p0 = obj;
        this.f78815r0 |= Integer.MIN_VALUE;
        return RemoveUserDataUseCase.access$unrollManualFirebaseNotification(this.f78814q0, this);
    }
}

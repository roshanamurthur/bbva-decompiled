package xa;

import com.bbva.notifications.viewmodel.NotificationDetailViewModel;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationDetailViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel", f = "NotificationDetailViewModel.kt", i = {0}, l = {ErrorCodes.ERR_CRY_BAD_PIN_SIZE}, m = "getShortcutActions", n = {"this"}, s = {"L$0"})
public final class b extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NotificationDetailViewModel f94501p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public NotificationDetailViewModel f94502q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f94503r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ NotificationDetailViewModel f94504s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f94505t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NotificationDetailViewModel notificationDetailViewModel, Continuation<? super b> continuation) {
        super(continuation);
        this.f94504s0 = notificationDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f94503r0 = obj;
        this.f94505t0 |= Integer.MIN_VALUE;
        return NotificationDetailViewModel.access$getShortcutActions(this.f94504s0, null, this);
    }
}

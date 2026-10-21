package xa;

import com.bbva.notifications.viewmodel.NotificationViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationViewModel", f = "NotificationViewModel.kt", i = {0}, l = {86}, m = "handleDynamicLink", n = {"this"}, s = {"L$0"})
public final class d extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NotificationViewModel f94509p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f94510q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ NotificationViewModel f94511r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f94512s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NotificationViewModel notificationViewModel, Continuation<? super d> continuation) {
        super(continuation);
        this.f94511r0 = notificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f94510q0 = obj;
        this.f94512s0 |= Integer.MIN_VALUE;
        return NotificationViewModel.access$handleDynamicLink(this.f94511r0, null, this);
    }
}

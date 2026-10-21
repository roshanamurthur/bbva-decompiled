package e8;

import com.bbva.component.dm.settings.domain.model.InAppUpdateConfiguration;
import com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase;
import com.bbva.glomohybrid.base.models.InAppUpdatesScheduleData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CheckForFlexibleUpdateUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase", f = "CheckForFlexibleUpdateUseCase.kt", i = {0, 0, 0}, l = {65}, m = "tryInAppUpdate", n = {"this", "scheduleData", "configuration"}, s = {"L$0", "L$1", "L$2"})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CheckForFlexibleUpdateUseCase f68280p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public InAppUpdatesScheduleData f68281q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public InAppUpdateConfiguration f68282r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f68283s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ CheckForFlexibleUpdateUseCase f68284t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f68285u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCase, Continuation<? super a> continuation) {
        super(continuation);
        this.f68284t0 = checkForFlexibleUpdateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f68283s0 = obj;
        this.f68285u0 |= Integer.MIN_VALUE;
        return CheckForFlexibleUpdateUseCase.access$tryInAppUpdate(this.f68284t0, null, null, this);
    }
}

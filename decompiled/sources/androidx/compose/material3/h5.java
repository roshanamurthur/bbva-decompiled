package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h5 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Job> f12877p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h5(Function0<? extends Job> function0) {
        super(0);
        this.f12877p0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.f12877p0.invoke();
        return Boolean.TRUE;
    }
}

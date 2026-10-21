package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f12863p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f12864q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(long j10, Function1 function1) {
        super(0);
        this.f12863p0 = function1;
        this.f12864q0 = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f12863p0.invoke(Long.valueOf(this.f12864q0));
        return Unit.INSTANCE;
    }
}

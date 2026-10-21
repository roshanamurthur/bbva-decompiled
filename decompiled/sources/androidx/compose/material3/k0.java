package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f12960p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f12961q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f12962r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(StateData stateData, boolean z10, long j10) {
        super(0);
        this.f12960p0 = stateData;
        this.f12961q0 = z10;
        this.f12962r0 = j10;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z10;
        if (this.f12961q0) {
            StateData stateData = this.f12960p0;
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            long utcTimeMillis = value != null ? value.getUtcTimeMillis() : Long.MAX_VALUE;
            long j10 = this.f12962r0;
            if (j10 < utcTimeMillis) {
                z10 = false;
            } else {
                CalendarDate value2 = stateData.getSelectedEndDate().getValue();
                if (j10 <= (value2 != null ? value2.getUtcTimeMillis() : Long.MIN_VALUE)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}

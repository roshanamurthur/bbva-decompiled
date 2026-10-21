package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f14363p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<TabPosition> f14364q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f14365r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Function3 function3, ArrayList arrayList, int i10) {
        super(2);
        this.f14363p0 = function3;
        this.f14364q0 = arrayList;
        this.f14365r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(963343607, iIntValue, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:311)");
            }
            this.f14363p0.invoke(this.f14364q0, composer2, Integer.valueOf(((this.f14365r0 >> 12) & 112) | 8));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

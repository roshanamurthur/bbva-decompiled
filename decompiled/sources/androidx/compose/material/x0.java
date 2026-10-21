package androidx.compose.material;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f9099p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(MutableIntState mutableIntState) {
        super(1);
        this.f9099p0 = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f9099p0.setIntValue(num.intValue());
        return Unit.INSTANCE;
    }
}

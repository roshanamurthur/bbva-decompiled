package m0;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ControlledComposition;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f83242p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet<Object> f83243q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        super(1);
        this.f83242p0 = controlledComposition;
        this.f83243q0 = mutableScatterSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f83242p0.recordWriteOf(obj);
        MutableScatterSet<Object> mutableScatterSet = this.f83243q0;
        if (mutableScatterSet != null) {
            mutableScatterSet.add(obj);
        }
        return Unit.INSTANCE;
    }
}

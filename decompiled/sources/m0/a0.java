package m0;

import androidx.compose.runtime.ControlledComposition;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f83230p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ControlledComposition controlledComposition) {
        super(1);
        this.f83230p0 = controlledComposition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f83230p0.recordReadOf(obj);
        return Unit.INSTANCE;
    }
}

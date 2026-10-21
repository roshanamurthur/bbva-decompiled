package u;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function1<PointerInputChange, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l f93680p0 = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PointerInputChange pointerInputChange) {
        PointerInputChange down = pointerInputChange;
        Intrinsics.checkNotNullParameter(down, "down");
        return Boolean.valueOf(!PointerType.m3532equalsimpl0(down.getType(), PointerType.INSTANCE.m3537getMouseT8wyACA()));
    }
}

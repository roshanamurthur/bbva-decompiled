package androidx.compose.ui.input.pointer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<PointerIcon, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PointerIconService f16491p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PointerIconService pointerIconService) {
        super(1);
        this.f16491p0 = pointerIconService;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PointerIcon pointerIcon) {
        this.f16491p0.setIcon(pointerIcon);
        return Unit.INSTANCE;
    }
}

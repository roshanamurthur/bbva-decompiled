package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "Lkotlin/Function1;", "", "", "disallowIntercept", "invoke", "Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "p0", "Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "getPointerInteropFilter$ui_release", "()Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "setPointerInteropFilter$ui_release", "(Landroidx/compose/ui/input/pointer/PointerInteropFilter;)V", "pointerInteropFilter", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class RequestDisallowInterceptTouchEvent implements Function1<Boolean, Unit> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public PointerInteropFilter pointerInteropFilter;

    @Nullable
    /* JADX INFO: renamed from: getPointerInteropFilter$ui_release, reason: from getter */
    public final PointerInteropFilter getPointerInteropFilter() {
        return this.pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void setPointerInteropFilter$ui_release(@Nullable PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    public void invoke(boolean disallowIntercept) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter == null) {
            return;
        }
        pointerInteropFilter.setDisallowIntercept$ui_release(disallowIntercept);
    }
}

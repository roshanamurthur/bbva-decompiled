package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0010\u0010\u000eR$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R3\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b8W@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/WindowInfoImpl;", "Landroidx/compose/ui/platform/WindowInfo;", "", "value", "isWindowFocused", "()Z", "setWindowFocused", "(Z)V", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A", "()I", "setKeyboardModifiers-5xRPYO0", "(I)V", "getKeyboardModifiers-k7X9c1A$annotations", "()V", "keyboardModifiers", "<init>", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class WindowInfoImpl implements WindowInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final MutableState<PointerKeyboardModifiers> f17338b = SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m3523boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f17339a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: compiled from: WindowInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/WindowInfoImpl$Companion;", "", "()V", "GlobalKeyboardModifiers", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getGlobalKeyboardModifiers$ui_release", "()Landroidx/compose/runtime/MutableState;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.f17338b;
        }
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo3814getKeyboardModifiersk7X9c1A() {
        return f17338b.getValue().getF16455a();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return this.f17339a.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m3816setKeyboardModifiers5xRPYO0(int i10) {
        f17338b.setValue(PointerKeyboardModifiers.m3523boximpl(i10));
    }

    public void setWindowFocused(boolean z10) {
        this.f17339a.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A$annotations, reason: not valid java name */
    public static /* synthetic */ void m3815getKeyboardModifiersk7X9c1A$annotations() {
    }
}

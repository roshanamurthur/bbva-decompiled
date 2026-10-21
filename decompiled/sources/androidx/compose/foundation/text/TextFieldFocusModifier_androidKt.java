package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextFieldFocusModifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "interceptDPadAndMoveFocus", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TextFieldFocusModifier_androidKt {

    /* JADX INFO: compiled from: TextFieldFocusModifier.android.kt */
    public static final class a extends Lambda implements Function1<KeyEvent, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FocusManager f5990p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5991q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FocusManager focusManager, TextFieldState textFieldState) {
            super(1);
            this.f5990p0 = focusManager;
            this.f5991q0 = textFieldState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(KeyEvent keyEvent) {
            android.view.KeyEvent keyEvent2 = keyEvent.m3355unboximpl();
            Intrinsics.checkNotNullParameter(keyEvent2, "keyEvent");
            InputDevice device = keyEvent2.getDevice();
            boolean zMo2227moveFocus3ESFkO8 = false;
            if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m3359equalsimpl0(KeyEvent_androidKt.m3367getTypeZmokQxo(keyEvent2), KeyEventType.INSTANCE.m3363getKeyDownCS__XNY())) {
                boolean zM547access$isKeyCodeYhN2O0w = TextFieldFocusModifier_androidKt.m547access$isKeyCodeYhN2O0w(keyEvent2, 19);
                FocusManager focusManager = this.f5990p0;
                if (zM547access$isKeyCodeYhN2O0w) {
                    zMo2227moveFocus3ESFkO8 = focusManager.mo2227moveFocus3ESFkO8(FocusDirection.INSTANCE.m2226getUpdhqQ8s());
                } else if (TextFieldFocusModifier_androidKt.m547access$isKeyCodeYhN2O0w(keyEvent2, 20)) {
                    zMo2227moveFocus3ESFkO8 = focusManager.mo2227moveFocus3ESFkO8(FocusDirection.INSTANCE.m2217getDowndhqQ8s());
                } else if (TextFieldFocusModifier_androidKt.m547access$isKeyCodeYhN2O0w(keyEvent2, 21)) {
                    zMo2227moveFocus3ESFkO8 = focusManager.mo2227moveFocus3ESFkO8(FocusDirection.INSTANCE.m2221getLeftdhqQ8s());
                } else if (TextFieldFocusModifier_androidKt.m547access$isKeyCodeYhN2O0w(keyEvent2, 22)) {
                    zMo2227moveFocus3ESFkO8 = focusManager.mo2227moveFocus3ESFkO8(FocusDirection.INSTANCE.m2225getRightdhqQ8s());
                } else if (TextFieldFocusModifier_androidKt.m547access$isKeyCodeYhN2O0w(keyEvent2, 23)) {
                    TextInputSession inputSession = this.f5991q0.getInputSession();
                    if (inputSession != null) {
                        inputSession.showSoftwareKeyboard();
                    }
                    zMo2227moveFocus3ESFkO8 = true;
                }
            }
            return Boolean.valueOf(zMo2227moveFocus3ESFkO8);
        }
    }

    /* JADX INFO: renamed from: access$isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m547access$isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i10) {
        return Key_androidKt.m3373getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m3366getKeyZmokQxo(keyEvent)) == i10;
    }

    @NotNull
    public static final Modifier interceptDPadAndMoveFocus(@NotNull Modifier modifier, @NotNull TextFieldState state, @NotNull FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new a(focusManager, state));
    }
}

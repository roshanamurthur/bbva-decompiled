package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Clickable.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u00020\u0001*\u00020\t8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\t8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "", "isComposeRootInScrollableContainer", "", "a", "J", "getTapIndicationDelay", "()J", "TapIndicationDelay", "Landroidx/compose/ui/input/key/KeyEvent;", "isPress-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isPress", "isClick-ZmokQxo", "isClick", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class Clickable_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3354a = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return f3354a;
    }

    /* JADX INFO: renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m155isClickZmokQxo(@NotNull KeyEvent isClick) {
        int iM3373getNativeKeyCodeYVgTNJs;
        Intrinsics.checkNotNullParameter(isClick, "$this$isClick");
        return KeyEventType.m3359equalsimpl0(KeyEvent_androidKt.m3367getTypeZmokQxo(isClick), KeyEventType.INSTANCE.m3364getKeyUpCS__XNY()) && ((iM3373getNativeKeyCodeYVgTNJs = Key_androidKt.m3373getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m3366getKeyZmokQxo(isClick))) == 23 || iM3373getNativeKeyCodeYVgTNJs == 66 || iM3373getNativeKeyCodeYVgTNJs == 160);
    }

    public static final boolean isComposeRootInScrollableContainer(@NotNull CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        Intrinsics.checkNotNullParameter(compositionLocalConsumerModifierNode, "<this>");
        ViewParent parent = ((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, AndroidCompositionLocals_androidKt.getLocalView())).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX INFO: renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m156isPressZmokQxo(@NotNull KeyEvent isPress) {
        int iM3373getNativeKeyCodeYVgTNJs;
        Intrinsics.checkNotNullParameter(isPress, "$this$isPress");
        return KeyEventType.m3359equalsimpl0(KeyEvent_androidKt.m3367getTypeZmokQxo(isPress), KeyEventType.INSTANCE.m3363getKeyDownCS__XNY()) && ((iM3373getNativeKeyCodeYVgTNJs = Key_androidKt.m3373getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m3366getKeyZmokQxo(isPress))) == 23 || iM3373getNativeKeyCodeYVgTNJs == 66 || iM3373getNativeKeyCodeYVgTNJs == 160);
    }
}

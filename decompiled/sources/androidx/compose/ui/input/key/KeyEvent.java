package androidx.compose.ui.input.key;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0015\u001a\u00060\u000fj\u0002`\u0010ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0015\u001a\u00060\u000fj\u0002`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0015\u0092\u0001\u00060\u000fj\u0002`\u0010ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "", "toString-impl", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroid/view/KeyEvent;)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "equals", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "a", "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "nativeKeyEvent", "constructor-impl", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class KeyEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.KeyEvent nativeKeyEvent;

    public /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEvent m3349boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static android.view.KeyEvent m3350constructorimpl(@NotNull android.view.KeyEvent nativeKeyEvent) {
        Intrinsics.checkNotNullParameter(nativeKeyEvent, "nativeKeyEvent");
        return nativeKeyEvent;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3351equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && Intrinsics.areEqual(keyEvent, ((KeyEvent) obj).m3355unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3352equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return Intrinsics.areEqual(keyEvent, keyEvent2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3353hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3354toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m3351equalsimpl(this.nativeKeyEvent, obj);
    }

    @NotNull
    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m3353hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m3354toStringimpl(this.nativeKeyEvent);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m3355unboximpl() {
        return this.nativeKeyEvent;
    }
}

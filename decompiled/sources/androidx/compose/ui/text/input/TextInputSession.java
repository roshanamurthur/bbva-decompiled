package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextInputService.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006R\u0011\u0010\u000e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "", "dispose", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "notifyFocusedRect", "Landroidx/compose/ui/text/input/TextFieldValue;", "oldValue", "newValue", "updateState", "showSoftwareKeyboard", "hideSoftwareKeyboard", "isOpen", "()Z", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,289:1\n153#1,5:290\n153#1,5:295\n153#1,5:300\n153#1,5:305\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n172#1:290,5\n194#1:295,5\n212#1:300,5\n227#1:305,5\n*E\n"})
public final class TextInputSession {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextInputService f18163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlatformTextInputService f18164b;

    public TextInputSession(@NotNull TextInputService textInputService, @NotNull PlatformTextInputService platformTextInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.f18163a = textInputService;
        this.f18164b = platformTextInputService;
    }

    public final void dispose() {
        this.f18163a.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f18164b.hideSoftwareKeyboard();
        }
        return zIsOpen;
    }

    public final boolean isOpen() {
        return Intrinsics.areEqual(this.f18163a.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f18164b.notifyFocusedRect(rect);
        }
        return zIsOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f18164b.showSoftwareKeyboard();
        }
        return zIsOpen;
    }

    public final boolean updateState(@Nullable TextFieldValue oldValue, @NotNull TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f18164b.updateState(oldValue, newValue);
        }
        return zIsOpen;
    }
}

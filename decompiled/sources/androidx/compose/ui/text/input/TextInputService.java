package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextInputService.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H\u0016ø\u0001\u0000J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/TextInputSession;", "startInput", "session", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "getCurrentInputSession$ui_text_release", "()Landroidx/compose/ui/text/input/TextInputSession;", "currentInputSession", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public class TextInputService {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlatformTextInputService f18143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicReference<TextInputSession> f18144b;

    public TextInputService(@NotNull PlatformTextInputService platformTextInputService) {
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.f18143a = platformTextInputService;
        this.f18144b = new AtomicReference<>(null);
    }

    @Nullable
    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this.f18144b.get();
    }

    @Deprecated(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @ReplaceWith(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void hideSoftwareKeyboard() {
        this.f18143a.hideSoftwareKeyboard();
    }

    @Deprecated(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @ReplaceWith(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void showSoftwareKeyboard() {
        if (this.f18144b.get() != null) {
            this.f18143a.showSoftwareKeyboard();
        }
    }

    @NotNull
    public TextInputSession startInput(@NotNull TextFieldValue value, @NotNull ImeOptions imeOptions, @NotNull Function1<? super List<? extends EditCommand>, Unit> onEditCommand, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        PlatformTextInputService platformTextInputService = this.f18143a;
        platformTextInputService.startInput(value, imeOptions, onEditCommand, onImeActionPerformed);
        TextInputSession textInputSession = new TextInputSession(this, platformTextInputService);
        this.f18144b.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(@NotNull TextInputSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        AtomicReference<TextInputSession> atomicReference = this.f18144b;
        while (!atomicReference.compareAndSet(session, null)) {
            if (atomicReference.get() != session) {
                return;
            }
        }
        this.f18143a.stopInput();
    }
}

package androidx.compose.ui.platform;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalSoftwareKeyboardController.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
public final class n0 implements SoftwareKeyboardController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextInputService f17420a;

    public n0(@NotNull TextInputService textInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        this.f17420a = textInputService;
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public final void hide() {
        this.f17420a.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public final /* synthetic */ void hideSoftwareKeyboard() {
        b1.a(this);
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public final void show() {
        this.f17420a.showSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public final /* synthetic */ void showSoftwareKeyboard() {
        b1.b(this);
    }
}

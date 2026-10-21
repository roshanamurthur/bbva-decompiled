package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.coreshims.SoftwareKeyboardControllerCompat;
import com.bbva.nativesettings.common.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InputMethodManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J(\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "", "restartInput", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class InputMethodManagerImpl implements InputMethodManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f18077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f18078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SoftwareKeyboardControllerCompat f18079c;

    /* JADX INFO: compiled from: InputMethodManager.kt */
    public static final class a extends Lambda implements Function0<android.view.inputmethod.InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final android.view.inputmethod.InputMethodManager invoke() {
            Object systemService = InputMethodManagerImpl.this.f18077a.getContext().getSystemService(Constants.INPUT_METHOD);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    }

    public InputMethodManagerImpl(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f18077a = view;
        this.f18078b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a());
        this.f18079c = new SoftwareKeyboardControllerCompat(view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.f18079c.hide();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        ((android.view.inputmethod.InputMethodManager) this.f18078b.getValue()).restartInput(this.f18077a);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.f18079c.show();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int token, @NotNull ExtractedText extractedText) {
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        ((android.view.inputmethod.InputMethodManager) this.f18078b.getValue()).updateExtractedText(this.f18077a, token, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        ((android.view.inputmethod.InputMethodManager) this.f18078b.getValue()).updateSelection(this.f18077a, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }
}

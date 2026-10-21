package androidx.compose.ui.platform;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: SoftwareKeyboardController.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 {
    @Deprecated(message = "Use hide instead.", replaceWith = @ReplaceWith(expression = "hide()", imports = {}))
    public static void a(SoftwareKeyboardController softwareKeyboardController) {
        softwareKeyboardController.hide();
    }

    @Deprecated(message = "Use show instead.", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public static void b(SoftwareKeyboardController softwareKeyboardController) {
        softwareKeyboardController.show();
    }
}

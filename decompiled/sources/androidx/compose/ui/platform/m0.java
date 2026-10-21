package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* JADX INFO: compiled from: ClipboardManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 {
    public static boolean a(ClipboardManager clipboardManager) {
        AnnotatedString text = clipboardManager.getText();
        return text != null && text.length() > 0;
    }
}

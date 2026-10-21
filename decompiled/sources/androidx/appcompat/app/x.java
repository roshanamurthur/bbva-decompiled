package androidx.appcompat.app;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f6, float f10, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11, boolean z11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f6, f10, metrics, z10, truncateAt, i11, z11);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher b(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}

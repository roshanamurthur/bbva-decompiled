package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class TooltipCompat {

    @RequiresApi(26)
    public static class a {
        @DoNotInline
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        y1 y1Var = y1.E0;
        if (y1Var != null && y1Var.f1701p0 == view) {
            y1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new y1(view, charSequence);
            return;
        }
        y1 y1Var2 = y1.F0;
        if (y1Var2 != null && y1Var2.f1701p0 == view) {
            y1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}

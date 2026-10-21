package com.afollestad.materialdialogs;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.StyleRes;
import com.afollestad.materialdialogs.utils.MDUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\b"}, d2 = {"inferTheme", "", "context", "Landroid/content/Context;", "dialogBehavior", "Lcom/afollestad/materialdialogs/DialogBehavior;", "inferThemeIsLight", "", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 1, 15})
public final class ThemeKt {
    @CheckResult
    @StyleRes
    public static final int inferTheme(@NotNull Context context, @NotNull DialogBehavior dialogBehavior) {
        return dialogBehavior.getThemeRes(!inferThemeIsLight(context));
    }

    @CheckResult
    public static final boolean inferThemeIsLight(@NotNull Context context) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        return MDUtil.isColorDark$default(mDUtil, MDUtil.resolveColor$default(mDUtil, context, null, Integer.valueOf(android.R.attr.textColorPrimary), null, 10, null), 0.0d, 1, null);
    }
}

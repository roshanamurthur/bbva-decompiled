package com.bbva.ui.extensions;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"themeColor", "", "Landroid/content/Context;", "colorResId", "themeColorResId", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\ncom/bbva/ui/extensions/ContextKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ContextKt {
    @ColorInt
    public static final int themeColor(@NotNull Context context, @AttrRes int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getColor(themeColorResId(context, i10));
    }

    @ColorRes
    public static final int themeColorResId(@NotNull Context context, @AttrRes int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }
}

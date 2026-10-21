package com.bbva.component.ui.login.extensions;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ContextExtension.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"resolveThemeAttr", "", "Landroid/content/Context;", "attr", "component-ui-login_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextExtensionKt {
    public static final int resolveThemeAttr(@NotNull Context context, @AttrRes int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }
}

package com.bbva.ui.component.menu.extensions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextExtension.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "Landroid/content/Context;", "getActivity", "(Landroid/content/Context;)Landroid/app/Activity;", "component-ui-menu_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContextExtensionKt {
    @Nullable
    public static final Activity getActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        return getActivity(baseContext);
    }
}

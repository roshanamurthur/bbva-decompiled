package com.bbva.component.ui.modal.extensions;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.camera.core.processing.f;
import androidx.core.content.res.ResourcesCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.component.ui.modal.utils.CenteredImageSpanSubclass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringExtension.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"addDrawableLeft", "Landroid/text/Spannable;", "", PluginUtils.IDENTIFIER_DRAWABLE, "", "resources", "Landroid/content/res/Resources;", "component-ui-modal_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringExtensionKt {
    @NotNull
    public static final Spannable addDrawableLeft(@NotNull String str, int i10, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        SpannableString spannableString = new SpannableString(f.d("%%%% ", str));
        Drawable drawable = ResourcesCompat.getDrawable(resources, i10, null);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            spannableString.setSpan(new CenteredImageSpanSubclass(drawable), 0, 4, 17);
        }
        return spannableString;
    }
}

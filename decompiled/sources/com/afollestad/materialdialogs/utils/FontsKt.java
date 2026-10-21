package com.afollestad.materialdialogs.utils;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.AttrRes;
import androidx.annotation.CheckResult;
import androidx.annotation.FontRes;
import androidx.core.content.res.ResourcesCompat;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Fonts.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "", "res", "attr", "Landroid/graphics/Typeface;", "font", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/graphics/Typeface;", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 4, 0})
public final class FontsKt {
    @CheckResult
    @Nullable
    public static final Typeface font(@NotNull MaterialDialog materialDialog, @FontRes @Nullable Integer num, @AttrRes @Nullable Integer num2) {
        MDUtil.INSTANCE.assertOneSet("font", num2, num);
        Typeface font = null;
        if (num != null) {
            try {
                return ResourcesCompat.getFont(materialDialog.getWindowContext(), num.intValue());
            } catch (Throwable th2) {
                th2.printStackTrace();
                return null;
            }
        }
        if (num2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        TypedArray typedArrayObtainStyledAttributes = materialDialog.getWindowContext().getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            if (resourceId == 0) {
                typedArrayObtainStyledAttributes.recycle();
                return null;
            }
            try {
                font = ResourcesCompat.getFont(materialDialog.getWindowContext(), resourceId);
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            typedArrayObtainStyledAttributes.recycle();
            return font;
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes.recycle();
            throw th4;
        }
    }

    public static /* synthetic */ Typeface font$default(MaterialDialog materialDialog, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        return font(materialDialog, num, num2);
    }
}

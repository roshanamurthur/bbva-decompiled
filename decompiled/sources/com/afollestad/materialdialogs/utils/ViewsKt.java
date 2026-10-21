package com.afollestad.materialdialogs.utils;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.exifinterface.media.ExifInterface;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Views.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0006\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u000b*\u0002H\u0001H\u0000¢\u0006\u0002\u0010\f\u001a\u001b\u0010\r\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u000b*\u0002H\u0001H\u0000¢\u0006\u0002\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u000b*\u0002H\u0001H\u0000¢\u0006\u0002\u0010\f\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0010*\u00020\u0011H\u0000¨\u0006\u0013"}, d2 = {"inflate", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup;", "res", "", "root", "(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;)Ljava/lang/Object;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "(Lcom/afollestad/materialdialogs/MaterialDialog;ILandroid/view/ViewGroup;)Ljava/lang/Object;", "isNotVisible", "", "Landroid/view/View;", "(Landroid/view/View;)Z", "isRtl", "isVisible", "setGravityEndCompat", "", "Landroid/widget/TextView;", "setGravityStartCompat", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 1, 15})
public final class ViewsKt {
    public static final <T> T inflate(@NotNull MaterialDialog materialDialog, @LayoutRes int i10, @Nullable ViewGroup viewGroup) {
        return (T) LayoutInflater.from(materialDialog.getWindowContext()).inflate(i10, viewGroup, false);
    }

    public static /* synthetic */ Object inflate$default(MaterialDialog materialDialog, int i10, ViewGroup viewGroup, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            viewGroup = null;
        }
        return inflate(materialDialog, i10, viewGroup);
    }

    public static final <T extends View> boolean isNotVisible(@NotNull T t10) {
        return !isVisible(t10);
    }

    public static final <T extends View> boolean isRtl(@NotNull T t10) {
        Resources resources = t10.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkExpressionValueIsNotNull(configuration, "resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    public static final <T extends View> boolean isVisible(@NotNull T t10) {
        if (t10 instanceof Button) {
            Button button = (Button) t10;
            if (button.getVisibility() != 0) {
                return false;
            }
            CharSequence text = button.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "this.text");
            if (!(!l.isBlank(StringsKt__StringsKt.trim(text)))) {
                return false;
            }
        } else if (t10.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static final void setGravityEndCompat(@NotNull TextView textView) {
        textView.setTextAlignment(6);
        textView.setGravity(8388629);
    }

    public static final void setGravityStartCompat(@NotNull TextView textView) {
        textView.setTextAlignment(5);
        textView.setGravity(8388627);
    }

    public static final <T> T inflate(@NotNull ViewGroup viewGroup, @LayoutRes int i10, @Nullable ViewGroup viewGroup2) {
        return (T) LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup2, false);
    }

    public static /* synthetic */ Object inflate$default(ViewGroup viewGroup, int i10, ViewGroup viewGroup2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            viewGroup2 = viewGroup;
        }
        return inflate(viewGroup, i10, viewGroup2);
    }
}

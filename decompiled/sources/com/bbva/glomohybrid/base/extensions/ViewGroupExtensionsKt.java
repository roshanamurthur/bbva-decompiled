package com.bbva.glomohybrid.base.extensions;

import android.view.ViewGroup;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewGroupExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"setMargin", "", "Landroid/view/ViewGroup;", Parameters.DIRECTION.LEFT, "", "top", Parameters.DIRECTION.RIGHT, "bottom", "(Landroid/view/ViewGroup;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewGroupExtensionsKt {
    public static final void setMargin(@NotNull ViewGroup viewGroup, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = num != null ? num.intValue() : marginLayoutParams.leftMargin;
            marginLayoutParams.topMargin = num2 != null ? num2.intValue() : marginLayoutParams.topMargin;
            marginLayoutParams.rightMargin = num3 != null ? num3.intValue() : marginLayoutParams.rightMargin;
            marginLayoutParams.bottomMargin = num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin;
        }
    }

    public static /* synthetic */ void setMargin$default(ViewGroup viewGroup, Integer num, Integer num2, Integer num3, Integer num4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            num3 = null;
        }
        if ((i10 & 8) != 0) {
            num4 = null;
        }
        setMargin(viewGroup, num, num2, num3, num4);
    }
}

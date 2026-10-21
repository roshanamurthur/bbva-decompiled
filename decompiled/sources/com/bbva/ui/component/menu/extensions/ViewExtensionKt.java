package com.bbva.ui.component.menu.extensions;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewExtension.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aA\u0010\u0005\u001a\u00020\u0006*\u00020\u00022.\u0010\u0007\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t0\b\"\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0000¢\u0006\u0002\u0010\f\u001aA\u0010\r\u001a\u00020\u0006*\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\u0010\u0014\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0015"}, d2 = {ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "Landroid/view/View;", "getActivity", "(Landroid/view/View;)Landroid/app/Activity;", "setAccessibilityDelegate", "", "action", "", "Lkotlin/Pair;", "Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;", "", "(Landroid/view/View;[Lkotlin/Pair;)V", "setMargin", "Landroid/view/ViewGroup;", Parameters.DIRECTION.LEFT, "", "top", Parameters.DIRECTION.RIGHT, "bottom", "(Landroid/view/ViewGroup;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component-ui-menu_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewExtensionKt {
    @Nullable
    public static final Activity getActivity(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return ContextExtensionKt.getActivity(context);
    }

    public static final void setAccessibilityDelegate(@NotNull View view, @NotNull final Pair<AccessibilityNodeInfo.AccessibilityAction, String>... action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.bbva.ui.component.menu.extensions.ViewExtensionKt.setAccessibilityDelegate.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfo info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                for (Pair<AccessibilityNodeInfo.AccessibilityAction, String> pair : action) {
                    info.addAction(new AccessibilityNodeInfo.AccessibilityAction(pair.getFirst().getId(), pair.getSecond()));
                }
            }
        });
    }

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

package com.bbva.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.camera.core.processing.f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import com.bbva.ui.extensions.FloatKt;
import com.google.android.material.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BbvaSnackbar.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/ui/widget/BbvaSnackbar;", "", "", "show", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class BbvaSnackbar {
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Snackbar f37669a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: BbvaSnackbar.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/ui/widget/BbvaSnackbar$Companion;", "", "()V", "LENGTH_LONG", "", "LENGTH_SHORT", "make", "Lcom/bbva/ui/widget/BbvaSnackbar;", "viewGroup", "Landroid/view/ViewGroup;", "messageResId", TypedValues.TransitionType.S_DURATION, "NoSwipeBehavior", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: BbvaSnackbar.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/ui/widget/BbvaSnackbar$Companion$NoSwipeBehavior;", "Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;", "()V", "canSwipeDismissView", "", "child", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NoSwipeBehavior extends BaseTransientBottomBar.Behavior {
            public static final int $stable = 0;

            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.Behavior, com.google.android.material.behavior.SwipeDismissBehavior
            public boolean canSwipeDismissView(@NotNull View child) {
                Intrinsics.checkNotNullParameter(child, "child");
                return false;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BbvaSnackbar make(@NotNull ViewGroup viewGroup, @StringRes int messageResId, int duration) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Snackbar snackbarMake = Snackbar.make(viewGroup, messageResId, duration);
            snackbarMake.setBehavior(new NoSwipeBehavior());
            snackbarMake.setGestureInsetBottomIgnored(true);
            View viewFindViewById = snackbarMake.getView().findViewById(R.id.snackbar_text);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById;
            Drawable drawable = ResourcesCompat.getDrawable(snackbarMake.getView().getResources(), com.bbva.ui.R.drawable.ic_info, null);
            if (drawable != null) {
                Context context = snackbarMake.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int px = (int) FloatKt.toPx(16.0f, context);
                drawable.setBounds(0, 0, px, px);
                drawable.setTint(ResourcesCompat.getColor(snackbarMake.getView().getResources(), com.bbva.ui.R.color.core_blue_60, null));
                int i10 = Build.VERSION.SDK_INT >= 29 ? 2 : 1;
                SpannableString spannableString = new SpannableString(f.d("   ", snackbarMake.getView().getContext().getString(messageResId)));
                spannableString.setSpan(new ImageSpan(drawable, i10), 0, 1, 17);
                textView.setText(spannableString);
            }
            Intrinsics.checkNotNullExpressionValue(snackbarMake, "apply(...)");
            return new BbvaSnackbar(snackbarMake, null);
        }
    }

    public BbvaSnackbar(Snackbar snackbar, DefaultConstructorMarker defaultConstructorMarker) {
        this.f37669a = snackbar;
    }

    public final void show() {
        this.f37669a.show();
    }
}

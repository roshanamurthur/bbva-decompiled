package com.bbva.ui.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.bbva.ui.R;
import com.bbva.ui.extensions.FloatKt;
import com.bbva.ui.widget.topsnackbar.TSnackbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BbvaTopSnackbar.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/ui/widget/BbvaTopSnackbar;", "", "", "colorResId", "backgroundColor", "textColor", "drawableResId", "icon", "", "show", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class BbvaTopSnackbar {
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TSnackbar f37702a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: BbvaTopSnackbar.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J#\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\b\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bbva/ui/widget/BbvaTopSnackbar$Companion;", "", "()V", "ICON_PADDING", "", "LENGTH_LONG", "", "LENGTH_SHORT", "MINIMUM_HEIGHT", "TEXT_VIEW_SIZE", "make", "Lcom/bbva/ui/widget/BbvaTopSnackbar;", "viewGroup", "Landroid/view/ViewGroup;", "messageResId", TypedValues.TransitionType.S_DURATION, "inTextView", "", "Lcom/bbva/ui/widget/topsnackbar/TSnackbar;", "block", "Lkotlin/Function1;", "Landroid/widget/TextView;", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: BbvaTopSnackbar.kt */
        public static final class a extends Lambda implements Function1<TextView, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f37703p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup) {
                super(1);
                this.f37703p0 = viewGroup;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(TextView textView) {
                TextView inTextView = textView;
                Intrinsics.checkNotNullParameter(inTextView, "$this$inTextView");
                inTextView.setGravity(17);
                inTextView.setTextSize(1, 15.0f);
                inTextView.setTextColor(ContextCompat.getColor(this.f37703p0.getContext(), R.color.white));
                return Unit.INSTANCE;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void inTextView(@NotNull TSnackbar tSnackbar, @NotNull Function1<? super TextView, Unit> block) {
            Intrinsics.checkNotNullParameter(tSnackbar, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            View viewFindViewById = tSnackbar.getView().findViewById(R.id.snackbar_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            block.invoke(viewFindViewById);
        }

        @NotNull
        public final BbvaTopSnackbar make(@NotNull ViewGroup viewGroup, @StringRes int messageResId, int duration) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            TSnackbar tSnackbarMake = TSnackbar.make(viewGroup, messageResId, duration);
            View view = tSnackbarMake.getView();
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setMinimumHeight((int) FloatKt.toPx(104.0f, context));
            Companion companion = BbvaTopSnackbar.INSTANCE;
            Intrinsics.checkNotNull(tSnackbarMake);
            companion.inTextView(tSnackbarMake, new a(viewGroup));
            Intrinsics.checkNotNullExpressionValue(tSnackbarMake, "apply(...)");
            return new BbvaTopSnackbar(tSnackbarMake, null);
        }
    }

    /* JADX INFO: compiled from: BbvaTopSnackbar.kt */
    public static final class a extends Lambda implements Function1<TextView, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f37704p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f37704p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextView textView) {
            TextView inTextView = textView;
            Intrinsics.checkNotNullParameter(inTextView, "$this$inTextView");
            Context context = inTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            inTextView.setCompoundDrawablePadding((int) FloatKt.toPx(9.0f, context));
            inTextView.setCompoundDrawablesWithIntrinsicBounds(0, this.f37704p0, 0, 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BbvaTopSnackbar.kt */
    public static final class b extends Lambda implements Function1<TextView, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f37705p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f37705p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextView textView) {
            TextView inTextView = textView;
            Intrinsics.checkNotNullParameter(inTextView, "$this$inTextView");
            inTextView.setTextColor(ContextCompat.getColor(inTextView.getContext(), this.f37705p0));
            return Unit.INSTANCE;
        }
    }

    public BbvaTopSnackbar(TSnackbar tSnackbar, DefaultConstructorMarker defaultConstructorMarker) {
        this.f37702a = tSnackbar;
    }

    @NotNull
    public final BbvaTopSnackbar backgroundColor(@ColorRes int colorResId) {
        View view = this.f37702a.getView();
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), colorResId));
        return this;
    }

    @NotNull
    public final BbvaTopSnackbar icon(@DrawableRes int drawableResId) {
        INSTANCE.inTextView(this.f37702a, new a(drawableResId));
        return this;
    }

    public final void show() {
        this.f37702a.show();
    }

    @NotNull
    public final BbvaTopSnackbar textColor(@ColorRes int colorResId) {
        INSTANCE.inTextView(this.f37702a, new b(colorResId));
        return this;
    }
}

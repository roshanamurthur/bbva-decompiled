package com.bbva.showinfo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.processing.f;
import androidx.core.content.ContextCompat;
import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.showinfo.model.SnackBarType;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoSnackBarExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0003*\u00020\u0006H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0003*\u00020\u0010H\u0000\u001a\u0016\u0010\u0014\u001a\u00020\u0003*\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000\u001a\u0016\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000\u001a\u0016\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000\"\u001a\u0010\u001f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroid/view/View;", "", "identifier", "", "sbIdentifier", "(Landroid/view/View;Ljava/lang/Integer;)V", "Landroid/widget/TextView;", "", "message", "drawableResource", "withSpannableImage", "Landroid/content/Context;", "context", "Landroid/text/style/ImageSpan;", "buildImageSpan", HideCommand.ID, "Lcom/google/android/material/snackbar/Snackbar;", "hideMessageText", "Lcom/google/android/material/snackbar/Snackbar$Callback;", "onDismissedCallback", "dismissCallback", "Landroid/view/View$OnClickListener;", "onClickListener", "sbClickListener", "Lcom/bbva/showinfo/model/SnackBarType;", "snackBarType", "sbBackgroundColor", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSNACK_BAR_TEXT_ID", "()I", "SNACK_BAR_TEXT_ID", "showinfo_release"}, k = 2, mv = {1, 9, 0})
public final class InfoSnackBarExtensionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36469a = com.google.android.material.R.id.snackbar_text;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f36470b = LazyKt__LazyJVMKt.lazy(a.f36471p0);

    /* JADX INFO: compiled from: InfoSnackBarExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackBarType.values().length];
            try {
                iArr[SnackBarType.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackBarType.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackBarType.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SnackBarType.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SnackBarType.HIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: InfoSnackBarExtensions.kt */
    public static final class a extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f36471p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 29 ? 2 : 1);
        }
    }

    @Nullable
    public static final ImageSpan buildImageSpan(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = ContextCompat.getDrawable(context, i10);
        if (drawable == null) {
            return null;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        return new ImageSpan(drawable, ((Number) f36470b.getValue()).intValue());
    }

    public static final void dismissCallback(@NotNull Snackbar snackbar, @Nullable Snackbar.Callback callback) {
        Intrinsics.checkNotNullParameter(snackbar, "<this>");
        if (callback != null) {
            snackbar.addCallback(callback);
        }
    }

    public static final int getSNACK_BAR_TEXT_ID() {
        return f36469a;
    }

    public static final void hide(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setVisibility(4);
        textView.setHeight(0);
    }

    public static final void hideMessageText(@NotNull Snackbar snackbar) {
        Intrinsics.checkNotNullParameter(snackbar, "<this>");
        View viewFindViewById = snackbar.getView().findViewById(f36469a);
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        if (textView != null) {
            hide(textView);
        }
    }

    public static final void sbBackgroundColor(@NotNull View view, @Nullable SnackBarType snackBarType) {
        int i10;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (snackBarType != null) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[snackBarType.ordinal()];
            if (i11 == 1) {
                i10 = com.bbva.ui.R.attr.surface_error_default;
            } else if (i11 == 2) {
                i10 = com.bbva.ui.R.attr.surface_info_default;
            } else if (i11 == 3) {
                i10 = com.bbva.ui.R.attr.surface_success_default;
            } else if (i11 == 4) {
                i10 = com.bbva.ui.R.attr.surface_warning_default;
            } else {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = com.bbva.ui.R.attr.surface_success_default;
            }
            int iIntValue = Integer.valueOf(i10).intValue();
            TypedValue typedValue = new TypedValue();
            view.getContext().getTheme().resolveAttribute(iIntValue, typedValue, true);
            view.setBackgroundColor(typedValue.data);
        }
    }

    public static final void sbClickListener(@NotNull View view, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public static final void sbIdentifier(@NotNull View view, @Nullable Integer num) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (num != null) {
            view.setId(num.intValue());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalArgumentException();
        }
    }

    public static final void withSpannableImage(@NotNull TextView textView, @NotNull String message, int i10) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        SpannableString spannableString = new SpannableString(f.d("%%%%  ", message));
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        spannableString.setSpan(buildImageSpan(context, i10), 0, 4, 17);
        textView.setText(spannableString);
    }
}

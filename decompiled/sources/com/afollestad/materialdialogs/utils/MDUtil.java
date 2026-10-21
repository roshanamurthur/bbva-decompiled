package com.afollestad.materialdialogs.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.camera.camera2.internal.compat.u;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.bbva.image.transform.MonochromeImageTransformer;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MDUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\t2\b\b\u0003\u0010\u0010\u001a\u00020\tH\u0007J?\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016J?\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182%\b\u0002\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\t\u0018\u00010\u001aH\u0007J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007J;\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0002\u0010#J$\u0010$\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\tH\u0007J9\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J9\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010*\u001a\u00020+2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010,J%\u0010-\u001a\u00020\t\"\b\b\u0000\u0010.*\u00020/*\u0002H.2\b\b\u0001\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0002\u00100J#\u00101\u001a\b\u0012\u0004\u0012\u00020\u000602*\u00020\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u00103J\u0018\u00104\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t05*\u000206H\u0007J7\u00107\u001a\u00020\u0004*\u0004\u0018\u00010\t2!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u00040\u001aH\u0087\b¢\u0006\u0002\u0010:J/\u0010;\u001a\u0002H<\"\b\b\u0000\u0010<*\u00020/*\u00020=2\b\b\u0002\u0010>\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0002\u0010?J\u0016\u0010@\u001a\u00020(*\u00020\t2\b\b\u0002\u0010A\u001a\u00020BH\u0007J\f\u0010C\u001a\u00020(*\u00020\u000eH\u0007J3\u0010D\u001a\u00020\u0004*\u0004\u0018\u00010E2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010HJ \u0010I\u001a\u00020\u0004*\u00020J2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u001aH\u0007JE\u0010L\u001a\u00020\u0004\"\b\b\u0000\u0010.*\u00020/*\u0004\u0018\u0001H.2\b\b\u0002\u0010M\u001a\u00020\t2\b\b\u0002\u0010N\u001a\u00020\t2\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020\tH\u0007¢\u0006\u0002\u0010QJ4\u0010R\u001a\u00020\u0004\"\b\b\u0000\u0010.*\u00020/*\u0002H.2\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0002\bSH\u0007¢\u0006\u0002\u0010TJ4\u0010U\u001a\u00020\u0004\"\b\b\u0000\u0010.*\u00020/*\u0002H.2\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0002\bSH\u0007¢\u0006\u0002\u0010T¨\u0006V"}, d2 = {"Lcom/afollestad/materialdialogs/utils/MDUtil;", "", "()V", "assertOneSet", "", "method", "", "b", "a", "", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V", "createColorSelector", "Landroid/content/res/ColorStateList;", "context", "Landroid/content/Context;", "unchecked", "checked", "resolveColor", "res", "attr", "fallback", "Lkotlin/Function0;", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)I", "resolveColors", "", "attrs", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forAttr", "resolveDimen", "", "defaultValue", "resolveDrawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "resolveInt", "resolveString", "", "html", "", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/CharSequence;", "materialDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/CharSequence;", "dimenPx", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "(Landroid/view/View;I)I", "getStringArray", "", "(Landroid/content/Context;Ljava/lang/Integer;)[Ljava/lang/String;", "getWidthAndHeight", "Lkotlin/Pair;", "Landroid/view/WindowManager;", "ifNotZero", "block", "value", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "inflate", "R", "Landroid/view/ViewGroup;", "ctxt", "(Landroid/view/ViewGroup;Landroid/content/Context;I)Landroid/view/View;", "isColorDark", MonochromeImageTransformer.THRESHOLD, "", "isLandscape", "maybeSetTextColor", "Landroid/widget/TextView;", "attrRes", "hintAttrRes", "(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V", "textChanged", "Landroid/widget/EditText;", "callback", "updatePadding", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "(Landroid/view/View;IIII)V", "waitForHeight", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "waitForWidth", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MDUtil {
    public static final MDUtil INSTANCE = new MDUtil();

    public static /* synthetic */ ColorStateList createColorSelector$default(MDUtil mDUtil, Context context, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return mDUtil.createColorSelector(context, i10, i11);
    }

    public static /* synthetic */ View inflate$default(MDUtil mDUtil, ViewGroup viewGroup, Context context, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
        }
        return mDUtil.inflate(viewGroup, context, i10);
    }

    public static /* synthetic */ boolean isColorDark$default(MDUtil mDUtil, int i10, double d2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d2 = 0.5d;
        }
        return mDUtil.isColorDark(i10, d2);
    }

    public static /* synthetic */ void maybeSetTextColor$default(MDUtil mDUtil, TextView textView, Context context, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        mDUtil.maybeSetTextColor(textView, context, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int resolveColor$default(MDUtil mDUtil, Context context, Integer num, Integer num2, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        return mDUtil.resolveColor(context, num, num2, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int[] resolveColors$default(MDUtil mDUtil, Context context, int[] iArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return mDUtil.resolveColors(context, iArr, function1);
    }

    public static /* synthetic */ float resolveDimen$default(MDUtil mDUtil, Context context, int i10, float f6, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f6 = 0.0f;
        }
        return mDUtil.resolveDimen(context, i10, f6);
    }

    public static /* synthetic */ Drawable resolveDrawable$default(MDUtil mDUtil, Context context, Integer num, Integer num2, Drawable drawable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            drawable = null;
        }
        return mDUtil.resolveDrawable(context, num, num2, drawable);
    }

    public static /* synthetic */ int resolveInt$default(MDUtil mDUtil, Context context, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return mDUtil.resolveInt(context, i10, i11);
    }

    public static /* synthetic */ CharSequence resolveString$default(MDUtil mDUtil, MaterialDialog materialDialog, Integer num, Integer num2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return mDUtil.resolveString(materialDialog, num, num2, z10);
    }

    public static /* synthetic */ void updatePadding$default(MDUtil mDUtil, View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view != null ? view.getPaddingLeft() : 0;
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = view != null ? view.getPaddingTop() : 0;
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = view != null ? view.getPaddingRight() : 0;
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = view != null ? view.getPaddingBottom() : 0;
        }
        mDUtil.updatePadding(view, i15, i16, i17, i13);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void assertOneSet(@NotNull String method, @Nullable Object b10, @Nullable Integer a10) {
        if (a10 == null && b10 == null) {
            throw new IllegalArgumentException(u.f(method, ": You must specify a resource ID or literal value"));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final ColorStateList createColorSelector(@NotNull Context context, @ColorInt int unchecked, @ColorInt int checked) {
        int iResolveColor$default = checked == 0 ? resolveColor$default(this, context, null, Integer.valueOf(R.attr.colorControlActivated), null, 10, null) : checked;
        int[][] iArr = {new int[]{-16842912, -16842908}, new int[]{android.R.attr.state_checked}, new int[]{android.R.attr.state_focused}};
        int[] iArr2 = new int[3];
        iArr2[0] = unchecked == 0 ? resolveColor$default(this, context, null, Integer.valueOf(R.attr.colorControlNormal), null, 10, null) : unchecked;
        iArr2[1] = iResolveColor$default;
        iArr2[2] = iResolveColor$default;
        return new ColorStateList(iArr, iArr2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> int dimenPx(@NotNull T t10, @DimenRes int i10) {
        Context context = t10.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return context.getResources().getDimensionPixelSize(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final String[] getStringArray(@NotNull Context context, @ArrayRes @Nullable Integer num) {
        if (num == null) {
            return new String[0];
        }
        String[] stringArray = context.getResources().getStringArray(num.intValue());
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "resources.getStringArray(res)");
        return stringArray;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Pair<Integer, Integer> getWidthAndHeight(@NotNull WindowManager windowManager) {
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void ifNotZero(@Nullable Integer num, @NotNull Function1<? super Integer, Unit> function1) {
        if (num == null || num.intValue() == 0) {
            return;
        }
        function1.invoke(num);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final <R extends View> R inflate(@NotNull ViewGroup viewGroup, @NotNull Context context, @LayoutRes int i10) {
        R r3 = (R) LayoutInflater.from(context).inflate(i10, viewGroup, false);
        if (r3 != null) {
            return r3;
        }
        throw new TypeCastException("null cannot be cast to non-null type R");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isColorDark(int i10, double d2) {
        if (i10 == 0) {
            return false;
        }
        return ((double) 1) - (((((double) Color.blue(i10)) * 0.114d) + ((((double) Color.green(i10)) * 0.587d) + (((double) Color.red(i10)) * 0.299d))) / ((double) 255)) >= d2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isLandscape(@NotNull Context context) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        return resources.getConfiguration().orientation == 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void maybeSetTextColor(@Nullable TextView textView, @NotNull Context context, @AttrRes @Nullable Integer num, @AttrRes @Nullable Integer num2) {
        int iResolveColor$default;
        int iResolveColor$default2;
        if (textView != null) {
            if (num == null && num2 == null) {
                return;
            }
            if (num != null && (iResolveColor$default2 = resolveColor$default(this, context, null, num, null, 10, null)) != 0) {
                textView.setTextColor(iResolveColor$default2);
            }
            if (num2 == null || (iResolveColor$default = resolveColor$default(this, context, null, num2, null, 10, null)) == 0) {
                return;
            }
            textView.setHintTextColor(iResolveColor$default);
        }
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int resolveColor(@NotNull Context context, @ColorRes @Nullable Integer res, @AttrRes @Nullable Integer attr, @Nullable Function0<Integer> fallback) {
        if (attr == null) {
            return ContextCompat.getColor(context, res != null ? res.intValue() : 0);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr.intValue()});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            return (color != 0 || fallback == null) ? color : fallback.invoke().intValue();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final int[] resolveColors(@NotNull Context context, @NotNull int[] attrs, @Nullable Function1<? super Integer, Integer> fallback) {
        Integer numInvoke;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs);
        try {
            IntRange intRangeUntil = c.until(0, attrs.length);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                int color = typedArrayObtainStyledAttributes.getColor(iNextInt, 0);
                if (color == 0) {
                    color = (fallback == null || (numInvoke = fallback.invoke(Integer.valueOf(attrs[iNextInt]))) == null) ? 0 : numInvoke.intValue();
                }
                arrayList.add(Integer.valueOf(color));
            }
            return CollectionsKt___CollectionsKt.toIntArray(arrayList);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final float resolveDimen(@NotNull Context context, @AttrRes int attr, float defaultValue) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return typedArrayObtainStyledAttributes.getDimension(0, defaultValue);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Drawable resolveDrawable(@NotNull Context context, @DrawableRes @Nullable Integer res, @AttrRes @Nullable Integer attr, @Nullable Drawable fallback) {
        if (attr == null) {
            return res == null ? fallback : ContextCompat.getDrawable(context, res.intValue());
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr.intValue()});
        try {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            if (drawable != null || fallback == null) {
                fallback = drawable;
            }
            return fallback;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int resolveInt(@NotNull Context context, @AttrRes int attr, int defaultValue) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return typedArrayObtainStyledAttributes.getInt(0, defaultValue);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final CharSequence resolveString(@NotNull MaterialDialog materialDialog, @StringRes @Nullable Integer res, @StringRes @Nullable Integer fallback, boolean html) {
        return resolveString(materialDialog.getWindowContext(), res, fallback, html);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void textChanged(@NotNull EditText editText, @NotNull final Function1<? super CharSequence, Unit> function1) {
        editText.addTextChangedListener(new TextWatcher() { // from class: com.afollestad.materialdialogs.utils.MDUtil.textChanged.1
            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence s4, int start, int before, int count) {
                function1.invoke(s4);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable s4) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence s4, int start, int count, int after) {
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> void updatePadding(@Nullable T t10, int i10, int i11, int i12, int i13) {
        if ((t10 != null && i10 == t10.getPaddingLeft() && i11 == t10.getPaddingTop() && i12 == t10.getPaddingRight() && i13 == t10.getPaddingBottom()) || t10 == null) {
            return;
        }
        t10.setPadding(i10, i11, i12, i13);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> void waitForHeight(@NotNull final T t10, @NotNull final Function1<? super T, Unit> function1) {
        if (t10.getMeasuredWidth() <= 0 || t10.getMeasuredHeight() <= 0) {
            t10.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.afollestad.materialdialogs.utils.MDUtil.waitForHeight.1

                /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
                @Nullable
                public Integer lastHeight;

                @Nullable
                public final Integer getLastHeight() {
                    return this.lastHeight;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    Integer num = this.lastHeight;
                    View view = t10;
                    if (num != null) {
                        int measuredHeight = view.getMeasuredHeight();
                        if (num != null && num.intValue() == measuredHeight) {
                            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            return;
                        }
                    }
                    if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                        return;
                    }
                    Integer num2 = this.lastHeight;
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (num2 != null && num2.intValue() == measuredHeight2) {
                        return;
                    }
                    this.lastHeight = Integer.valueOf(view.getMeasuredHeight());
                    function1.invoke(view);
                }

                public final void setLastHeight(@Nullable Integer num) {
                    this.lastHeight = num;
                }
            });
        } else {
            function1.invoke(t10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> void waitForWidth(@NotNull final T t10, @NotNull final Function1<? super T, Unit> function1) {
        if (t10.getMeasuredWidth() <= 0 || t10.getMeasuredHeight() <= 0) {
            t10.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.afollestad.materialdialogs.utils.MDUtil.waitForWidth.1

                /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
                @Nullable
                public Integer lastWidth;

                @Nullable
                public final Integer getLastWidth() {
                    return this.lastWidth;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    Integer num = this.lastWidth;
                    View view = t10;
                    if (num != null) {
                        int measuredWidth = view.getMeasuredWidth();
                        if (num != null && num.intValue() == measuredWidth) {
                            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            return;
                        }
                    }
                    if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                        return;
                    }
                    Integer num2 = this.lastWidth;
                    int measuredWidth2 = view.getMeasuredWidth();
                    if (num2 != null && num2.intValue() == measuredWidth2) {
                        return;
                    }
                    this.lastWidth = Integer.valueOf(view.getMeasuredWidth());
                    function1.invoke(view);
                }

                public final void setLastWidth(@Nullable Integer num) {
                    this.lastWidth = num;
                }
            });
        } else {
            function1.invoke(t10);
        }
    }

    public static /* synthetic */ CharSequence resolveString$default(MDUtil mDUtil, Context context, Integer num, Integer num2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return mDUtil.resolveString(context, num, num2, z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final CharSequence resolveString(@NotNull Context context, @StringRes @Nullable Integer res, @StringRes @Nullable Integer fallback, boolean html) {
        int iIntValue;
        if (res != null) {
            iIntValue = res.intValue();
        } else {
            iIntValue = fallback != null ? fallback.intValue() : 0;
        }
        if (iIntValue == 0) {
            return null;
        }
        CharSequence text = context.getResources().getText(iIntValue);
        Intrinsics.checkExpressionValueIsNotNull(text, "context.resources.getText(resourceId)");
        return html ? Html.fromHtml(text.toString()) : text;
    }
}

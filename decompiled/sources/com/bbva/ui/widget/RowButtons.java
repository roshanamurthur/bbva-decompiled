package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import com.bbva.ui.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RowButtons.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011B!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0015"}, d2 = {"Lcom/bbva/ui/widget/RowButtons;", "Landroid/widget/LinearLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "Lcom/bbva/ui/widget/RowButton;", "buttons", "setButtons", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRowButtons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowButtons.kt\ncom/bbva/ui/widget/RowButtons\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n233#2,3:81\n1324#3,3:84\n1855#4,2:87\n*S KotlinDebug\n*F\n+ 1 RowButtons.kt\ncom/bbva/ui/widget/RowButtons\n*L\n40#1:81,3\n49#1:84,3\n73#1:87,2\n*E\n"})
public final class RowButtons extends LinearLayout {
    public static final int MAXIMUM_BUTTONS = 4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f37726p0;
    public static final int $stable = 8;

    /* JADX INFO: compiled from: RowButtons.kt */
    public static final class a extends Lambda implements Function1<View, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f37727p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getVisibility() != 8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowButtons(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37726p0 = 4;
        a(this, null, 0, 6);
    }

    public static void a(RowButtons rowButtons, AttributeSet attributeSet, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        rowButtons.setWeightSum(1.0f);
        TypedArray typedArrayObtainStyledAttributes = rowButtons.getContext().obtainStyledAttributes(attributeSet, R.styleable.RowButtons, 0, i10);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        rowButtons.f37726p0 = typedArrayObtainStyledAttributes.getInt(R.styleable.RowButtons_maxButtons, 4);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i10 = 0;
        for (Object obj : SequencesKt___SequencesKt.filter(ViewGroupKt.getChildren(this), a.f37727p0)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ViewGroup.LayoutParams layoutParams = ((View) obj).getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                int i12 = this.f37726p0;
                if (i10 >= i12) {
                    layoutParams.width = 0;
                    layoutParams.height = 0;
                    ((LinearLayout.LayoutParams) layoutParams).weight = 0.0f;
                } else if (i12 > 0) {
                    layoutParams.width = 0;
                    layoutParams.height = -2;
                    ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f / i12;
                } else {
                    layoutParams.width = 0;
                    layoutParams.height = -2;
                    ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
                }
            }
            i10 = i11;
        }
    }

    public final void setButtons(@NotNull List<RowButton> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            addView((RowButton) it.next());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowButtons(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f37726p0 = 4;
        a(this, attrs, 0, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowButtons(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f37726p0 = 4;
        a(this, attrs, i10, 4);
    }
}

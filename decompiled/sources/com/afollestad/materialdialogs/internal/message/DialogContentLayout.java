package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.afollestad.materialdialogs.message.DialogMessageSettings;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogContentLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010J\u001a\u00020I\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bM\u0010NJP\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J3\u0010\u001b\u001a\u00020\u00162\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0018J\u001a\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0004J\u001a\u0010!\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0004J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0014J0\u0010(\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0014R\u001b\u0010-\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010D\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010H\u001a\u0004\u0018\u00010E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006O"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "Landroid/widget/FrameLayout;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "", "res", "", "text", "Landroid/graphics/Typeface;", "typeface", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/message/DialogMessageSettings;", "", "Lkotlin/ExtensionFunctionType;", "applySettings", "setMessage", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layoutManager", "addRecyclerView", "Landroid/view/View;", "view", "", "scrollable", "horizontalPadding", "addCustomView", "(Ljava/lang/Integer;Landroid/view/View;ZZ)Landroid/view/View;", "haveMoreThanOneChild", "top", "bottom", "modifyFirstAndLastPadding", "modifyScrollViewPadding", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", Parameters.DIRECTION.LEFT, Parameters.DIRECTION.RIGHT, "onLayout", "s0", "Lkotlin/Lazy;", "getFrameHorizontalMargin", "()I", "frameHorizontalMargin", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "t0", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "getScrollView", "()Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "setScrollView", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "scrollView", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "u0", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "getRecyclerView", "()Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "setRecyclerView", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "recyclerView", "v0", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "customView", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "rootLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogContentLayout extends FrameLayout {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f25540w0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I"))};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ViewGroup f25541p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f25542q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f25543r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final Lazy frameHorizontalMargin;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DialogScrollView scrollView;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DialogRecyclerView recyclerView;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public View customView;

    /* JADX INFO: compiled from: DialogContentLayout.kt */
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(DialogContentLayout.this.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal));
        }
    }

    public /* synthetic */ DialogContentLayout(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final int getFrameHorizontalMargin() {
        KProperty kProperty = f25540w0[0];
        return ((Number) this.frameHorizontalMargin.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public static /* synthetic */ void modifyFirstAndLastPadding$default(DialogContentLayout dialogContentLayout, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = -1;
        }
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        dialogContentLayout.modifyFirstAndLastPadding(i10, i11);
    }

    public static /* synthetic */ void modifyScrollViewPadding$default(DialogContentLayout dialogContentLayout, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = -1;
        }
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        dialogContentLayout.modifyScrollViewPadding(i10, i11);
    }

    public final void a() {
        if (this.scrollView == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) ViewsKt.inflate$default(this, R.layout.md_dialog_stub_scrollview, (ViewGroup) null, 2, (Object) null);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            this.f25541p0 = (ViewGroup) childAt;
            this.scrollView = dialogScrollView;
            addView(dialogScrollView);
        }
    }

    @NotNull
    public final View addCustomView(@LayoutRes @Nullable Integer res, @Nullable View view, boolean scrollable, boolean horizontalPadding) {
        if (!(this.customView == null)) {
            throw new IllegalStateException("Custom view already set.".toString());
        }
        View view2 = null;
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (scrollable) {
            this.f25543r0 = false;
            a();
            if (view == null) {
                if (res == null) {
                    Intrinsics.throwNpe();
                }
                view = (View) ViewsKt.inflate(this, res.intValue(), this.f25541p0);
            }
            this.customView = view;
            ViewGroup viewGroup2 = this.f25541p0;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            View view3 = this.customView;
            if (view3 != null) {
                if (horizontalPadding) {
                    MDUtil.updatePadding$default(MDUtil.INSTANCE, view3, getFrameHorizontalMargin(), 0, getFrameHorizontalMargin(), 0, 10, null);
                }
                view2 = view3;
            }
            viewGroup2.addView(view2);
        } else {
            this.f25543r0 = horizontalPadding;
            if (view == null) {
                if (res == null) {
                    Intrinsics.throwNpe();
                }
                view = (View) ViewsKt.inflate$default(this, res.intValue(), (ViewGroup) null, 2, (Object) null);
            }
            this.customView = view;
            addView(view);
        }
        View view4 = this.customView;
        if (view4 == null) {
            Intrinsics.throwNpe();
        }
        return view4;
    }

    public final void addRecyclerView(@NotNull MaterialDialog dialog, @NotNull RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.LayoutManager layoutManager) {
        if (this.recyclerView == null) {
            DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) ViewsKt.inflate$default(this, R.layout.md_dialog_stub_recyclerview, (ViewGroup) null, 2, (Object) null);
            dialogRecyclerView.attach(dialog);
            if (layoutManager == null) {
                layoutManager = new LinearLayoutManager(dialog.getWindowContext());
            }
            dialogRecyclerView.setLayoutManager(layoutManager);
            this.recyclerView = dialogRecyclerView;
            addView(dialogRecyclerView);
        }
        DialogRecyclerView dialogRecyclerView2 = this.recyclerView;
        if (dialogRecyclerView2 != null) {
            dialogRecyclerView2.setAdapter(adapter);
        }
    }

    @Nullable
    public final View getCustomView() {
        return this.customView;
    }

    @Nullable
    public final DialogRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Nullable
    public final DialogScrollView getScrollView() {
        return this.scrollView;
    }

    public final boolean haveMoreThanOneChild() {
        return getChildCount() > 1;
    }

    public final void modifyFirstAndLastPadding(int top, int bottom) {
        if (top != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, getChildAt(0), 0, top, 0, 0, 13, null);
        }
        if (bottom != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, getChildAt(getChildCount() - 1), 0, 0, 0, bottom, 7, null);
        }
    }

    public final void modifyScrollViewPadding(int top, int bottom) {
        View view = this.scrollView;
        if (view == null) {
            view = this.recyclerView;
        }
        if (top != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, view, 0, top, 0, 0, 13, null);
        }
        if (bottom != -1) {
            MDUtil.updatePadding$default(MDUtil.INSTANCE, view, 0, 0, 0, bottom, 7, null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredWidth;
        int frameHorizontalMargin;
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (i10 < childCount) {
            View currentChild = getChildAt(i10);
            Intrinsics.checkExpressionValueIsNotNull(currentChild, "currentChild");
            int measuredHeight = currentChild.getMeasuredHeight() + i11;
            if (Intrinsics.areEqual(currentChild, this.customView) && this.f25543r0) {
                frameHorizontalMargin = getFrameHorizontalMargin();
                measuredWidth = getMeasuredWidth() - getFrameHorizontalMargin();
            } else {
                measuredWidth = getMeasuredWidth();
                frameHorizontalMargin = 0;
            }
            currentChild.layout(frameHorizontalMargin, i11, measuredWidth, measuredHeight);
            i10++;
            i11 = measuredHeight;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        DialogScrollView dialogScrollView = this.scrollView;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.scrollView;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i10 = size2 - measuredHeight;
        int childCount = this.scrollView != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i11 = i10 / childCount;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View currentChild = getChildAt(i12);
            Intrinsics.checkExpressionValueIsNotNull(currentChild, "currentChild");
            int id = currentChild.getId();
            DialogScrollView dialogScrollView3 = this.scrollView;
            if (dialogScrollView3 == null || id != dialogScrollView3.getId()) {
                currentChild.measure((Intrinsics.areEqual(currentChild, this.customView) && this.f25543r0) ? View.MeasureSpec.makeMeasureSpec(size - (getFrameHorizontalMargin() * 2), 1073741824) : View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                measuredHeight = currentChild.getMeasuredHeight() + measuredHeight;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setCustomView(@Nullable View view) {
        this.customView = view;
    }

    public final void setMessage(@NotNull MaterialDialog dialog, @StringRes @Nullable Integer res, @Nullable CharSequence text, @Nullable Typeface typeface, @Nullable Function1<? super DialogMessageSettings, Unit> applySettings) {
        a();
        if (this.f25542q0 == null) {
            int i10 = R.layout.md_dialog_stub_message;
            ViewGroup viewGroup = this.f25541p0;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            TextView textView = (TextView) ViewsKt.inflate(this, i10, viewGroup);
            ViewGroup viewGroup2 = this.f25541p0;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            viewGroup2.addView(textView);
            this.f25542q0 = textView;
        }
        TextView textView2 = this.f25542q0;
        if (textView2 == null) {
            Intrinsics.throwNpe();
        }
        DialogMessageSettings dialogMessageSettings = new DialogMessageSettings(dialog, textView2);
        if (applySettings != null) {
            applySettings.invoke(dialogMessageSettings);
        }
        TextView textView3 = this.f25542q0;
        if (textView3 != null) {
            if (typeface != null) {
                textView3.setTypeface(typeface);
            }
            MDUtil.maybeSetTextColor$default(MDUtil.INSTANCE, textView3, dialog.getWindowContext(), Integer.valueOf(R.attr.md_color_content), null, 4, null);
            dialogMessageSettings.setText$com_afollestad_material_dialogs_core(res, text);
        }
    }

    public final void setRecyclerView(@Nullable DialogRecyclerView dialogRecyclerView) {
        this.recyclerView = dialogRecyclerView;
    }

    public final void setScrollView(@Nullable DialogScrollView dialogScrollView) {
        this.scrollView = dialogScrollView;
    }

    public DialogContentLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.frameHorizontalMargin = LazyKt__LazyJVMKt.lazy(new a());
    }
}

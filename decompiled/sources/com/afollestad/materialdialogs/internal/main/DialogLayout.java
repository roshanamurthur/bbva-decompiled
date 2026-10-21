package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.afollestad.materialdialogs.LayoutMode;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayoutKt;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.afollestad.materialdialogs.utils.DimensKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010S\u001a\u00020R\u0012\b\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J0\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0014J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014R\"\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010*\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010-\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u001a\u00100\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006X"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "Landroid/widget/FrameLayout;", "", "onFinishInflate", "Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "attachDialog", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "buttonsLayout", "attachButtonsLayout", "", "showTop", "showBottom", "invalidateDividers", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxHeight", "()I", "setMaxHeight", "(I)V", "maxHeight", "value", "q0", "Z", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "debugMode", "s0", "getFrameMarginVertical$com_afollestad_material_dialogs_core", "frameMarginVertical", "t0", "getFrameMarginVerticalLess$com_afollestad_material_dialogs_core", "frameMarginVerticalLess", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "setDialog", "(Lcom/afollestad/materialdialogs/MaterialDialog;)V", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "titleLayout", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "getTitleLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "setTitleLayout", "(Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;)V", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "contentLayout", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "getContentLayout", "()Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "setContentLayout", "(Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;)V", "u0", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "getButtonsLayout", "()Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "setButtonsLayout", "(Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;)V", "Lcom/afollestad/materialdialogs/LayoutMode;", "v0", "Lcom/afollestad/materialdialogs/LayoutMode;", "getLayoutMode", "()Lcom/afollestad/materialdialogs/LayoutMode;", "setLayoutMode", "(Lcom/afollestad/materialdialogs/LayoutMode;)V", "layoutMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class DialogLayout extends FrameLayout {

    @NotNull
    public DialogContentLayout contentLayout;

    @NotNull
    public MaterialDialog dialog;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public int maxHeight;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public boolean debugMode;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Paint f25527r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final int frameMarginVertical;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public final int frameMarginVerticalLess;

    @NotNull
    public DialogTitleLayout titleLayout;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DialogActionButtonLayout buttonsLayout;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public LayoutMode layoutMode;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f25531w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f25532x0;

    public DialogLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        MDUtil mDUtil = MDUtil.INSTANCE;
        this.frameMarginVertical = mDUtil.dimenPx(this, R.dimen.md_dialog_frame_margin_vertical);
        this.frameMarginVerticalLess = mDUtil.dimenPx(this, R.dimen.md_dialog_frame_margin_vertical_less);
        this.layoutMode = LayoutMode.WRAP_CONTENT;
        this.f25531w0 = true;
        this.f25532x0 = -1;
    }

    public static void a(DialogLayout dialogLayout, Canvas canvas, int i10, float f6) {
        canvas.drawLine(0.0f, f6, dialogLayout.getMeasuredWidth(), f6, dialogLayout.b(1.0f, i10));
    }

    public static void c(DialogLayout dialogLayout, Canvas canvas, int i10, float f6) {
        canvas.drawLine(f6, 0.0f, f6, dialogLayout.getMeasuredHeight(), dialogLayout.b(1.0f, i10));
    }

    public final void attachButtonsLayout(@NotNull DialogActionButtonLayout buttonsLayout) {
        this.buttonsLayout = buttonsLayout;
        this.f25531w0 = false;
    }

    public final void attachDialog(@NotNull MaterialDialog dialog) {
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        dialogTitleLayout.setDialog(dialog);
        DialogActionButtonLayout dialogActionButtonLayout = this.buttonsLayout;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setDialog(dialog);
        }
    }

    public final Paint b(float f6, int i10) {
        if (this.f25527r0 == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(DimensKt.dp(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f25527r0 = paint;
        }
        Paint paint2 = this.f25527r0;
        if (paint2 == null) {
            Intrinsics.throwNpe();
        }
        paint2.setColor(i10);
        setAlpha(f6);
        return paint2;
    }

    @Nullable
    public final DialogActionButtonLayout getButtonsLayout() {
        return this.buttonsLayout;
    }

    @NotNull
    public final DialogContentLayout getContentLayout() {
        DialogContentLayout dialogContentLayout = this.contentLayout;
        if (dialogContentLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
        }
        return dialogContentLayout;
    }

    public final boolean getDebugMode() {
        return this.debugMode;
    }

    @NotNull
    public final MaterialDialog getDialog() {
        MaterialDialog materialDialog = this.dialog;
        if (materialDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        return materialDialog;
    }

    /* JADX INFO: renamed from: getFrameMarginVertical$com_afollestad_material_dialogs_core, reason: from getter */
    public final int getFrameMarginVertical() {
        return this.frameMarginVertical;
    }

    /* JADX INFO: renamed from: getFrameMarginVerticalLess$com_afollestad_material_dialogs_core, reason: from getter */
    public final int getFrameMarginVerticalLess() {
        return this.frameMarginVerticalLess;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    @NotNull
    public final DialogTitleLayout getTitleLayout() {
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        return dialogTitleLayout;
    }

    public final void invalidateDividers(boolean showTop, boolean showBottom) {
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        dialogTitleLayout.setDrawDivider(showTop);
        DialogActionButtonLayout dialogActionButtonLayout = this.buttonsLayout;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setDrawDivider(showBottom);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
        }
        this.f25532x0 = MDUtil.INSTANCE.getWidthAndHeight((WindowManager) systemService).component2().intValue();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.debugMode) {
            c(this, canvas, -16776961, DimensKt.dp(this, 24));
            a(this, canvas, -16776961, DimensKt.dp(this, 24));
            c(this, canvas, -16776961, getMeasuredWidth() - DimensKt.dp(this, 24));
            DialogTitleLayout dialogTitleLayout = this.titleLayout;
            if (dialogTitleLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
            }
            if (ViewsKt.isVisible(dialogTitleLayout)) {
                DialogTitleLayout dialogTitleLayout2 = this.titleLayout;
                if (dialogTitleLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
                }
                a(this, canvas, SupportMenu.CATEGORY_MASK, dialogTitleLayout2.getBottom());
            }
            DialogContentLayout dialogContentLayout = this.contentLayout;
            if (dialogContentLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
            }
            if (ViewsKt.isVisible(dialogContentLayout)) {
                DialogContentLayout dialogContentLayout2 = this.contentLayout;
                if (dialogContentLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
                }
                a(this, canvas, InputDeviceCompat.SOURCE_ANY, dialogContentLayout2.getTop());
            }
            if (DialogActionButtonLayoutKt.shouldBeVisible(this.buttonsLayout)) {
                c(this, canvas, -16711681, ViewsKt.isRtl(this) ? DimensKt.dp(this, 8) : getMeasuredWidth() - DimensKt.dp(this, 8));
                DialogActionButtonLayout dialogActionButtonLayout = this.buttonsLayout;
                if (dialogActionButtonLayout == null || !dialogActionButtonLayout.getStackButtons()) {
                    DialogActionButtonLayout dialogActionButtonLayout2 = this.buttonsLayout;
                    if (dialogActionButtonLayout2 != null) {
                        for (DialogActionButton dialogActionButton : dialogActionButtonLayout2.getVisibleButtons()) {
                            DialogActionButtonLayout dialogActionButtonLayout3 = this.buttonsLayout;
                            if (dialogActionButtonLayout3 == null) {
                                Intrinsics.throwNpe();
                            }
                            float fDp = DimensKt.dp(this, 8) + dialogActionButtonLayout3.getTop() + dialogActionButton.getTop();
                            DialogActionButtonLayout dialogActionButtonLayout4 = this.buttonsLayout;
                            if (dialogActionButtonLayout4 == null) {
                                Intrinsics.throwNpe();
                            }
                            canvas.drawRect(dialogActionButton.getLeft() + DimensKt.dp(this, 4), fDp, dialogActionButton.getRight() - DimensKt.dp(this, 4), dialogActionButtonLayout4.getBottom() - DimensKt.dp(this, 8), b(0.4f, -16711681));
                        }
                        DialogActionButtonLayout dialogActionButtonLayout5 = this.buttonsLayout;
                        if (dialogActionButtonLayout5 == null) {
                            Intrinsics.throwNpe();
                        }
                        a(this, canvas, -65281, dialogActionButtonLayout5.getTop());
                        float measuredHeight = getMeasuredHeight() - (DimensKt.dp(this, 52) - DimensKt.dp(this, 8));
                        float measuredHeight2 = getMeasuredHeight() - DimensKt.dp(this, 8);
                        a(this, canvas, SupportMenu.CATEGORY_MASK, measuredHeight);
                        a(this, canvas, SupportMenu.CATEGORY_MASK, measuredHeight2);
                        a(this, canvas, -16776961, measuredHeight - DimensKt.dp(this, 8));
                        return;
                    }
                    return;
                }
                DialogActionButtonLayout dialogActionButtonLayout6 = this.buttonsLayout;
                if (dialogActionButtonLayout6 == null) {
                    Intrinsics.throwNpe();
                }
                float fDp2 = DimensKt.dp(this, 8) + dialogActionButtonLayout6.getTop();
                DialogActionButtonLayout dialogActionButtonLayout7 = this.buttonsLayout;
                if (dialogActionButtonLayout7 == null) {
                    Intrinsics.throwNpe();
                }
                for (DialogActionButton dialogActionButton2 : dialogActionButtonLayout7.getVisibleButtons()) {
                    float fDp3 = DimensKt.dp(this, 36) + fDp2;
                    canvas.drawRect(dialogActionButton2.getLeft(), fDp2, getMeasuredWidth() - DimensKt.dp(this, 8), fDp3, b(0.4f, -16711681));
                    fDp2 = DimensKt.dp(this, 16) + fDp3;
                }
                DialogActionButtonLayout dialogActionButtonLayout8 = this.buttonsLayout;
                if (dialogActionButtonLayout8 == null) {
                    Intrinsics.throwNpe();
                }
                a(this, canvas, -16776961, dialogActionButtonLayout8.getTop());
                DialogActionButtonLayout dialogActionButtonLayout9 = this.buttonsLayout;
                if (dialogActionButtonLayout9 == null) {
                    Intrinsics.throwNpe();
                }
                float fDp4 = DimensKt.dp(this, 8) + dialogActionButtonLayout9.getTop();
                float measuredHeight3 = getMeasuredHeight() - DimensKt.dp(this, 8);
                a(this, canvas, SupportMenu.CATEGORY_MASK, fDp4);
                a(this, canvas, SupportMenu.CATEGORY_MASK, measuredHeight3);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.md_title_layout);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.md_title_layout)");
        this.titleLayout = (DialogTitleLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.md_content_layout);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "findViewById(R.id.md_content_layout)");
        this.contentLayout = (DialogContentLayout) viewFindViewById2;
        this.buttonsLayout = (DialogActionButtonLayout) findViewById(R.id.md_button_layout);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredHeight;
        int measuredWidth = getMeasuredWidth();
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        int measuredHeight2 = dialogTitleLayout.getMeasuredHeight();
        DialogTitleLayout dialogTitleLayout2 = this.titleLayout;
        if (dialogTitleLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        dialogTitleLayout2.layout(0, 0, measuredWidth, measuredHeight2);
        if (this.f25531w0) {
            int measuredHeight3 = getMeasuredHeight();
            DialogActionButtonLayout dialogActionButtonLayout = this.buttonsLayout;
            measuredHeight = measuredHeight3 - (dialogActionButtonLayout != null ? dialogActionButtonLayout.getMeasuredHeight() : 0);
            if (DialogActionButtonLayoutKt.shouldBeVisible(this.buttonsLayout)) {
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight4 = getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.buttonsLayout;
                if (dialogActionButtonLayout2 == null) {
                    Intrinsics.throwNpe();
                }
                dialogActionButtonLayout2.layout(0, measuredHeight, measuredWidth2, measuredHeight4);
            }
        } else {
            measuredHeight = getMeasuredHeight();
        }
        int measuredWidth3 = getMeasuredWidth();
        DialogContentLayout dialogContentLayout = this.contentLayout;
        if (dialogContentLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
        }
        dialogContentLayout.layout(0, measuredHeight2, measuredWidth3, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int i10 = this.maxHeight;
        if (1 <= i10 && size2 > i10) {
            size2 = i10;
        }
        DialogTitleLayout dialogTitleLayout = this.titleLayout;
        if (dialogTitleLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        dialogTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (DialogActionButtonLayoutKt.shouldBeVisible(this.buttonsLayout)) {
            DialogActionButtonLayout dialogActionButtonLayout = this.buttonsLayout;
            if (dialogActionButtonLayout == null) {
                Intrinsics.throwNpe();
            }
            dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        DialogTitleLayout dialogTitleLayout2 = this.titleLayout;
        if (dialogTitleLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        int measuredHeight = dialogTitleLayout2.getMeasuredHeight();
        DialogActionButtonLayout dialogActionButtonLayout2 = this.buttonsLayout;
        int measuredHeight2 = size2 - (measuredHeight + (dialogActionButtonLayout2 != null ? dialogActionButtonLayout2.getMeasuredHeight() : 0));
        DialogContentLayout dialogContentLayout = this.contentLayout;
        if (dialogContentLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
        }
        dialogContentLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE));
        if (this.layoutMode != LayoutMode.WRAP_CONTENT) {
            setMeasuredDimension(size, this.f25532x0);
            return;
        }
        DialogTitleLayout dialogTitleLayout3 = this.titleLayout;
        if (dialogTitleLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        int measuredHeight3 = dialogTitleLayout3.getMeasuredHeight();
        DialogContentLayout dialogContentLayout2 = this.contentLayout;
        if (dialogContentLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
        }
        int measuredHeight4 = dialogContentLayout2.getMeasuredHeight() + measuredHeight3;
        DialogActionButtonLayout dialogActionButtonLayout3 = this.buttonsLayout;
        setMeasuredDimension(size, measuredHeight4 + (dialogActionButtonLayout3 != null ? dialogActionButtonLayout3.getMeasuredHeight() : 0));
    }

    public final void setButtonsLayout(@Nullable DialogActionButtonLayout dialogActionButtonLayout) {
        this.buttonsLayout = dialogActionButtonLayout;
    }

    public final void setContentLayout(@NotNull DialogContentLayout dialogContentLayout) {
        this.contentLayout = dialogContentLayout;
    }

    public final void setDebugMode(boolean z10) {
        this.debugMode = z10;
        setWillNotDraw(!z10);
    }

    public final void setDialog(@NotNull MaterialDialog materialDialog) {
        this.dialog = materialDialog;
    }

    public final void setLayoutMode(@NotNull LayoutMode layoutMode) {
        this.layoutMode = layoutMode;
    }

    public final void setMaxHeight(int i10) {
        this.maxHeight = i10;
    }

    public final void setTitleLayout(@NotNull DialogTitleLayout dialogTitleLayout) {
        this.titleLayout = dialogTitleLayout;
    }
}

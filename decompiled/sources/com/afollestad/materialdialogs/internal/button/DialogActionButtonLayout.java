package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.camera.camera2.internal.compat.u;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.main.BaseSubLayout;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogActionButtonLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u001b\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014J0\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0014J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014R\"\u0010\u0018\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010\u001e¨\u00061"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "Lcom/afollestad/materialdialogs/internal/main/BaseSubLayout;", "", "onFinishInflate", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "changed", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "x0", "Z", "getStackButtons$com_afollestad_material_dialogs_core", "()Z", "setStackButtons$com_afollestad_material_dialogs_core", "(Z)V", "stackButtons", "", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "actionButtons", "[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "getActionButtons", "()[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "setActionButtons", "([Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;)V", "Landroidx/appcompat/widget/AppCompatCheckBox;", "checkBoxPrompt", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBoxPrompt", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "setCheckBoxPrompt", "(Landroidx/appcompat/widget/AppCompatCheckBox;)V", "getVisibleButtons", "visibleButtons", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogActionButtonLayout extends BaseSubLayout {
    public static final int INDEX_NEGATIVE = 1;
    public static final int INDEX_NEUTRAL = 2;
    public static final int INDEX_POSITIVE = 0;

    @NotNull
    public DialogActionButton[] actionButtons;

    @NotNull
    public AppCompatCheckBox checkBoxPrompt;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f25486s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f25487t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f25488u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f25489w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public boolean stackButtons;

    /* JADX INFO: compiled from: DialogActionButtonLayout.kt */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WhichButton f25492q0;

        public a(WhichButton whichButton) {
            this.f25492q0 = whichButton;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogActionButtonLayout.this.getDialog().onActionButtonClicked$com_afollestad_material_dialogs_core(this.f25492q0);
        }
    }

    public /* synthetic */ DialogActionButtonLayout(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @NotNull
    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        return dialogActionButtonArr;
    }

    @NotNull
    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
        if (appCompatCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
        }
        return appCompatCheckBox;
    }

    /* JADX INFO: renamed from: getStackButtons$com_afollestad_material_dialogs_core, reason: from getter */
    public final boolean getStackButtons() {
        return this.stackButtons;
    }

    @NotNull
    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        ArrayList arrayList = new ArrayList();
        for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
            if (ViewsKt.isVisible(dialogActionButton)) {
                arrayList.add(dialogActionButton);
            }
        }
        Object[] array = arrayList.toArray(new DialogActionButton[0]);
        if (array != null) {
            return (DialogActionButton[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), getDividerHeight(), dividerPaint());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.md_button_positive);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.md_button_positive)");
        View viewFindViewById2 = findViewById(R.id.md_button_negative);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "findViewById(R.id.md_button_negative)");
        View viewFindViewById3 = findViewById(R.id.md_button_neutral);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById3, "findViewById(R.id.md_button_neutral)");
        this.actionButtons = new DialogActionButton[]{(DialogActionButton) viewFindViewById, (DialogActionButton) viewFindViewById2, (DialogActionButton) viewFindViewById3};
        View viewFindViewById4 = findViewById(R.id.md_checkbox_prompt);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.checkBoxPrompt = (AppCompatCheckBox) viewFindViewById4;
        DialogActionButton[] dialogActionButtonArr = this.actionButtons;
        if (dialogActionButtonArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
        }
        int length = dialogActionButtonArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dialogActionButtonArr[i10].setOnClickListener(new a(WhichButton.INSTANCE.fromIndex(i10)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredWidth;
        int measuredHeight;
        if (DialogActionButtonLayoutKt.shouldBeVisible(this)) {
            AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
            if (appCompatCheckBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
            }
            if (ViewsKt.isVisible(appCompatCheckBox)) {
                boolean zIsRtl = ViewsKt.isRtl(this);
                int i10 = this.v0;
                int measuredWidth2 = this.f25489w0;
                if (zIsRtl) {
                    measuredWidth = getMeasuredWidth() - measuredWidth2;
                    AppCompatCheckBox appCompatCheckBox2 = this.checkBoxPrompt;
                    if (appCompatCheckBox2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                    }
                    measuredWidth2 = measuredWidth - appCompatCheckBox2.getMeasuredWidth();
                    AppCompatCheckBox appCompatCheckBox3 = this.checkBoxPrompt;
                    if (appCompatCheckBox3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                    }
                    measuredHeight = appCompatCheckBox3.getMeasuredHeight();
                } else {
                    AppCompatCheckBox appCompatCheckBox4 = this.checkBoxPrompt;
                    if (appCompatCheckBox4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                    }
                    measuredWidth = appCompatCheckBox4.getMeasuredWidth() + measuredWidth2;
                    AppCompatCheckBox appCompatCheckBox5 = this.checkBoxPrompt;
                    if (appCompatCheckBox5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                    }
                    measuredHeight = appCompatCheckBox5.getMeasuredHeight();
                }
                int i11 = measuredHeight + i10;
                AppCompatCheckBox appCompatCheckBox6 = this.checkBoxPrompt;
                if (appCompatCheckBox6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
                }
                appCompatCheckBox6.layout(measuredWidth2, i10, measuredWidth, i11);
            }
            boolean z10 = this.stackButtons;
            int i12 = this.f25488u0;
            int i13 = this.f25486s0;
            if (z10) {
                int measuredWidth3 = getMeasuredWidth() - i13;
                int measuredHeight2 = getMeasuredHeight();
                Iterator it = ArraysKt___ArraysKt.reversed(getVisibleButtons()).iterator();
                while (it.hasNext()) {
                    int i14 = measuredHeight2 - i12;
                    ((DialogActionButton) it.next()).layout(i13, i14, measuredWidth3, measuredHeight2);
                    measuredHeight2 = i14;
                }
                return;
            }
            int measuredHeight3 = getMeasuredHeight() - i12;
            int measuredHeight4 = getMeasuredHeight();
            boolean zIsRtl2 = ViewsKt.isRtl(this);
            int i15 = this.f25487t0;
            if (zIsRtl2) {
                DialogActionButton[] dialogActionButtonArr = this.actionButtons;
                if (dialogActionButtonArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                if (ViewsKt.isVisible(dialogActionButtonArr[2])) {
                    DialogActionButton[] dialogActionButtonArr2 = this.actionButtons;
                    if (dialogActionButtonArr2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                    }
                    DialogActionButton dialogActionButton = dialogActionButtonArr2[2];
                    int measuredWidth4 = getMeasuredWidth() - i15;
                    dialogActionButton.layout(measuredWidth4 - dialogActionButton.getMeasuredWidth(), measuredHeight3, measuredWidth4, measuredHeight4);
                }
                DialogActionButton[] dialogActionButtonArr3 = this.actionButtons;
                if (dialogActionButtonArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                if (ViewsKt.isVisible(dialogActionButtonArr3[0])) {
                    DialogActionButton[] dialogActionButtonArr4 = this.actionButtons;
                    if (dialogActionButtonArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                    }
                    DialogActionButton dialogActionButton2 = dialogActionButtonArr4[0];
                    int measuredWidth5 = dialogActionButton2.getMeasuredWidth() + i13;
                    dialogActionButton2.layout(i13, measuredHeight3, measuredWidth5, measuredHeight4);
                    i13 = measuredWidth5;
                }
                DialogActionButton[] dialogActionButtonArr5 = this.actionButtons;
                if (dialogActionButtonArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                if (ViewsKt.isVisible(dialogActionButtonArr5[1])) {
                    DialogActionButton[] dialogActionButtonArr6 = this.actionButtons;
                    if (dialogActionButtonArr6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                    }
                    DialogActionButton dialogActionButton3 = dialogActionButtonArr6[1];
                    dialogActionButton3.layout(i13, measuredHeight3, dialogActionButton3.getMeasuredWidth() + i13, measuredHeight4);
                    return;
                }
                return;
            }
            DialogActionButton[] dialogActionButtonArr7 = this.actionButtons;
            if (dialogActionButtonArr7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            if (ViewsKt.isVisible(dialogActionButtonArr7[2])) {
                DialogActionButton[] dialogActionButtonArr8 = this.actionButtons;
                if (dialogActionButtonArr8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                DialogActionButton dialogActionButton4 = dialogActionButtonArr8[2];
                dialogActionButton4.layout(i15, measuredHeight3, dialogActionButton4.getMeasuredWidth() + i15, measuredHeight4);
            }
            int measuredWidth6 = getMeasuredWidth() - i13;
            DialogActionButton[] dialogActionButtonArr9 = this.actionButtons;
            if (dialogActionButtonArr9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            if (ViewsKt.isVisible(dialogActionButtonArr9[0])) {
                DialogActionButton[] dialogActionButtonArr10 = this.actionButtons;
                if (dialogActionButtonArr10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                DialogActionButton dialogActionButton5 = dialogActionButtonArr10[0];
                int measuredWidth7 = measuredWidth6 - dialogActionButton5.getMeasuredWidth();
                dialogActionButton5.layout(measuredWidth7, measuredHeight3, measuredWidth6, measuredHeight4);
                measuredWidth6 = measuredWidth7;
            }
            DialogActionButton[] dialogActionButtonArr11 = this.actionButtons;
            if (dialogActionButtonArr11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
            }
            if (ViewsKt.isVisible(dialogActionButtonArr11[1])) {
                DialogActionButton[] dialogActionButtonArr12 = this.actionButtons;
                if (dialogActionButtonArr12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("actionButtons");
                }
                DialogActionButton dialogActionButton6 = dialogActionButtonArr12[1];
                dialogActionButton6.layout(measuredWidth6 - dialogActionButton6.getMeasuredWidth(), measuredHeight3, measuredWidth6, measuredHeight4);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i10;
        if (!DialogActionButtonLayoutKt.shouldBeVisible(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        AppCompatCheckBox appCompatCheckBox = this.checkBoxPrompt;
        if (appCompatCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
        }
        if (ViewsKt.isVisible(appCompatCheckBox)) {
            int i11 = size - (this.f25489w0 * 2);
            AppCompatCheckBox appCompatCheckBox2 = this.checkBoxPrompt;
            if (appCompatCheckBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
            }
            appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        Context context = getDialog().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        Context windowContext = getDialog().getWindowContext();
        DialogActionButton[] visibleButtons = getVisibleButtons();
        int length = visibleButtons.length;
        int i12 = 0;
        while (true) {
            i10 = this.f25488u0;
            if (i12 >= length) {
                break;
            }
            DialogActionButton dialogActionButton = visibleButtons[i12];
            dialogActionButton.update$com_afollestad_material_dialogs_core(context, windowContext, this.stackButtons);
            if (this.stackButtons) {
                dialogActionButton.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            } else {
                dialogActionButton.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            }
            i12++;
        }
        if ((!(getVisibleButtons().length == 0)) && !this.stackButtons) {
            int measuredWidth = 0;
            for (DialogActionButton dialogActionButton2 : getVisibleButtons()) {
                measuredWidth += dialogActionButton2.getMeasuredWidth();
            }
            if (measuredWidth >= size && !this.stackButtons) {
                this.stackButtons = true;
                for (DialogActionButton dialogActionButton3 : getVisibleButtons()) {
                    dialogActionButton3.update$com_afollestad_material_dialogs_core(context, windowContext, true);
                    dialogActionButton3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                }
            }
        }
        int length2 = getVisibleButtons().length != 0 ? this.stackButtons ? getVisibleButtons().length * i10 : i10 : 0;
        AppCompatCheckBox appCompatCheckBox3 = this.checkBoxPrompt;
        if (appCompatCheckBox3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
        }
        if (ViewsKt.isVisible(appCompatCheckBox3)) {
            AppCompatCheckBox appCompatCheckBox4 = this.checkBoxPrompt;
            if (appCompatCheckBox4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBoxPrompt");
            }
            length2 = u.b(this.v0, 2, appCompatCheckBox4.getMeasuredHeight(), length2);
        }
        setMeasuredDimension(size, length2);
    }

    public final void setActionButtons(@NotNull DialogActionButton[] dialogActionButtonArr) {
        this.actionButtons = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(@NotNull AppCompatCheckBox appCompatCheckBox) {
        this.checkBoxPrompt = appCompatCheckBox;
    }

    public final void setStackButtons$com_afollestad_material_dialogs_core(boolean z10) {
        this.stackButtons = z10;
    }

    public DialogActionButtonLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        MDUtil mDUtil = MDUtil.INSTANCE;
        this.f25486s0 = mDUtil.dimenPx(this, R.dimen.md_action_button_frame_padding) - mDUtil.dimenPx(this, R.dimen.md_action_button_inset_horizontal);
        this.f25487t0 = mDUtil.dimenPx(this, R.dimen.md_action_button_frame_padding_neutral);
        this.f25488u0 = mDUtil.dimenPx(this, R.dimen.md_action_button_frame_spec_height);
        this.v0 = mDUtil.dimenPx(this, R.dimen.md_checkbox_prompt_margin_vertical);
        this.f25489w0 = mDUtil.dimenPx(this, R.dimen.md_checkbox_prompt_margin_horizontal);
    }
}

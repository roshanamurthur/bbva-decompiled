package com.afollestad.materialdialogs.input;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.CheckResult;
import androidx.annotation.StringRes;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogInputExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0007\u001a\u008f\u0001\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2 \b\u0002\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0002`\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016*2\u0010\u0017\"\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¨\u0006\u0018"}, d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/google/android/material/textfield/TextInputLayout;", "getInputLayout", "Landroid/widget/EditText;", "getInputField", "", "hint", "", "hintRes", "", "prefill", "prefillRes", "inputType", "maxLength", "", "waitForPositiveButton", "allowEmpty", "Lkotlin/Function2;", "", "Lcom/afollestad/materialdialogs/input/InputCallback;", "callback", "input", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;ILjava/lang/Integer;ZZLkotlin/jvm/functions/Function2;)Lcom/afollestad/materialdialogs/MaterialDialog;", "InputCallback", "com.afollestad.material-dialogs.input"}, k = 2, mv = {1, 4, 0})
public final class DialogInputExtKt {

    /* JADX INFO: compiled from: DialogInputExt.kt */
    public static final class a extends Lambda implements Function1<MaterialDialog, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MaterialDialog f25470p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MaterialDialog materialDialog) {
            super(1);
            this.f25470p0 = materialDialog;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MaterialDialog materialDialog) {
            InputUtilExtKt.showKeyboardIfApplicable(this.f25470p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DialogInputExt.kt */
    public static final class b extends Lambda implements Function1<MaterialDialog, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MaterialDialog f25471p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2 f25472q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MaterialDialog materialDialog, Function2 function2) {
            super(1);
            this.f25471p0 = materialDialog;
            this.f25472q0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MaterialDialog materialDialog) {
            MaterialDialog materialDialog2 = this.f25471p0;
            CharSequence text = DialogInputExtKt.getInputField(materialDialog2).getText();
            if (text == null) {
                text = "";
            }
            this.f25472q0.invoke(materialDialog2, text);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DialogInputExt.kt */
    public static final class c extends Lambda implements Function1<CharSequence, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MaterialDialog f25473p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f25474q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Integer f25475r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f25476s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2 f25477t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MaterialDialog materialDialog, boolean z10, Integer num, boolean z11, Function2 function2) {
            super(1);
            this.f25473p0 = materialDialog;
            this.f25474q0 = z10;
            this.f25475r0 = num;
            this.f25476s0 = z11;
            this.f25477t0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CharSequence charSequence) {
            Function2 function2;
            CharSequence charSequence2 = charSequence;
            MaterialDialog materialDialog = this.f25473p0;
            boolean z10 = this.f25474q0;
            if (!z10) {
                DialogActionExtKt.setActionButtonEnabled(materialDialog, WhichButton.POSITIVE, charSequence2.length() > 0);
            }
            Integer num = this.f25475r0;
            if (num != null) {
                num.intValue();
                InputUtilExtKt.invalidateInputMaxLength(materialDialog, z10);
            }
            if (!this.f25476s0 && (function2 = this.f25477t0) != null) {
                function2.invoke(materialDialog, charSequence2);
            }
            return Unit.INSTANCE;
        }
    }

    @CheckResult
    @NotNull
    public static final EditText getInputField(@NotNull MaterialDialog materialDialog) {
        EditText editText = getInputLayout(materialDialog).getEditText();
        if (editText != null) {
            return editText;
        }
        throw new IllegalStateException("You have not setup this dialog as an input dialog.");
    }

    @CheckResult
    @NotNull
    public static final TextInputLayout getInputLayout(@NotNull MaterialDialog materialDialog) {
        Object obj = materialDialog.getConfig().get("[custom_view_input_layout]");
        if (!(obj instanceof TextInputLayout)) {
            obj = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) obj;
        if (textInputLayout == null) {
            View viewFindViewById = DialogCustomViewExtKt.getCustomView(materialDialog).findViewById(R.id.md_input_layout);
            textInputLayout = (TextInputLayout) (viewFindViewById instanceof TextInputLayout ? viewFindViewById : null);
            if (textInputLayout == null) {
                throw new IllegalStateException("You have not setup this dialog as an input dialog.");
            }
            materialDialog.getConfig().put("[custom_view_input_layout]", textInputLayout);
        }
        return textInputLayout;
    }

    @CheckResult
    @SuppressLint({"CheckResult"})
    @NotNull
    public static final MaterialDialog input(@NotNull MaterialDialog materialDialog, @Nullable String str, @StringRes @Nullable Integer num, @Nullable CharSequence charSequence, @StringRes @Nullable Integer num2, int i10, @Nullable Integer num3, boolean z10, boolean z11, @Nullable Function2<? super MaterialDialog, ? super CharSequence, Unit> function2) {
        CharSequence string;
        String string2;
        DialogCustomViewExtKt.customView$default(materialDialog, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, false, false, false, 62, null);
        DialogCallbackExtKt.onPreShow(materialDialog, new a(materialDialog));
        if (!DialogActionExtKt.hasActionButtons(materialDialog)) {
            MaterialDialog.positiveButton$default(materialDialog, Integer.valueOf(android.R.string.ok), null, null, 6, null);
        }
        if (function2 != null && z10) {
            MaterialDialog.positiveButton$default(materialDialog, null, null, new b(materialDialog, function2), 3, null);
        }
        Resources resources = materialDialog.getWindowContext().getResources();
        EditText inputField = getInputField(materialDialog);
        if (charSequence != null) {
            string = charSequence;
        } else {
            string = num2 != null ? resources.getString(num2.intValue()) : "";
            Intrinsics.checkExpressionValueIsNotNull(string, "if (prefillRes != null) …tring(prefillRes) else \"\"");
        }
        if (string.length() > 0) {
            inputField.setText(string);
            DialogCallbackExtKt.onShow(materialDialog, new w3.a(inputField, string));
        }
        DialogActionExtKt.setActionButtonEnabled(materialDialog, WhichButton.POSITIVE, z11 || string.length() > 0);
        Resources resources2 = materialDialog.getWindowContext().getResources();
        EditText inputField2 = getInputField(materialDialog);
        if (str != null) {
            string2 = str;
        } else {
            string2 = num != null ? resources2.getString(num.intValue()) : null;
        }
        inputField2.setHint(string2);
        inputField2.setInputType(i10);
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.maybeSetTextColor(inputField2, materialDialog.getWindowContext(), Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
        Typeface bodyFont = materialDialog.getBodyFont();
        if (bodyFont != null) {
            inputField2.setTypeface(bodyFont);
        }
        if (num3 != null) {
            TextInputLayout inputLayout = getInputLayout(materialDialog);
            inputLayout.setCounterEnabled(true);
            inputLayout.setCounterMaxLength(num3.intValue());
            InputUtilExtKt.invalidateInputMaxLength(materialDialog, z11);
        }
        mDUtil.textChanged(getInputField(materialDialog), new c(materialDialog, z11, num3, z10, function2));
        return materialDialog;
    }

    public static /* synthetic */ MaterialDialog input$default(MaterialDialog materialDialog, String str, Integer num, CharSequence charSequence, Integer num2, int i10, Integer num3, boolean z10, boolean z11, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            charSequence = null;
        }
        if ((i11 & 8) != 0) {
            num2 = null;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        if ((i11 & 32) != 0) {
            num3 = null;
        }
        if ((i11 & 64) != 0) {
            z10 = true;
        }
        if ((i11 & 128) != 0) {
            z11 = false;
        }
        if ((i11 & 256) != 0) {
            function2 = null;
        }
        return input(materialDialog, str, num, charSequence, num2, i10, num3, z10, z11, function2);
    }
}

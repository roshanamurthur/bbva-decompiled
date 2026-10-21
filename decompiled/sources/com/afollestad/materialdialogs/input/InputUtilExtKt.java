package com.afollestad.materialdialogs.input;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.exifinterface.media.ExifInterface;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InputUtilExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a7\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u0002H\u00062\u0019\b\u0004\u0010\b\u001a\u0013\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0080\b¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\r"}, d2 = {"invalidateInputMaxLength", "", "Lcom/afollestad/materialdialogs/MaterialDialog;", "allowEmpty", "", "postRun", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "exec", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Z", "showKeyboardIfApplicable", "com.afollestad.material-dialogs.input"}, k = 2, mv = {1, 1, 15})
public final class InputUtilExtKt {
    public static final void invalidateInputMaxLength(@NotNull MaterialDialog materialDialog, boolean z10) {
        int counterMaxLength;
        Editable text = DialogInputExtKt.getInputField(materialDialog).getText();
        int length = text != null ? text.length() : 0;
        if ((z10 || length != 0) && (counterMaxLength = DialogInputExtKt.getInputLayout(materialDialog).getCounterMaxLength()) > 0) {
            DialogActionExtKt.setActionButtonEnabled(materialDialog, WhichButton.POSITIVE, length <= counterMaxLength);
        }
    }

    public static final <T extends View> boolean postRun(@NotNull final T t10, @NotNull final Function1<? super T, Unit> function1) {
        return t10.post(new Runnable() { // from class: com.afollestad.materialdialogs.input.InputUtilExtKt.postRun.1
            @Override // java.lang.Runnable
            public final void run() {
                function1.invoke(t10);
            }
        });
    }

    public static final void showKeyboardIfApplicable(@NotNull final MaterialDialog materialDialog) {
        final EditText inputField = DialogInputExtKt.getInputField(materialDialog);
        inputField.post(new Runnable() { // from class: com.afollestad.materialdialogs.input.InputUtilExtKt$showKeyboardIfApplicable$$inlined$postRun$1
            @Override // java.lang.Runnable
            public final void run() {
                EditText editText = (EditText) inputField;
                editText.requestFocus();
                Object systemService = materialDialog.getWindowContext().getSystemService(Constants.INPUT_METHOD);
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                ((InputMethodManager) systemService).showSoftInput(editText, 1);
            }
        });
    }
}

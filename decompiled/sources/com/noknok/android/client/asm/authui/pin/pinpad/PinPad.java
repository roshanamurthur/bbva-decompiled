package com.noknok.android.client.asm.authui.pin.pinpad;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.noknok.android.client.asm.authui.pin.R;
import com.noknok.android.client.asm.authui.pin.databinding.NnlAsmPinUiBinding;
import com.noknok.android.client.asm.pinmanagement.PinDatabase;
import com.noknok.android.client.asm.pinmanagement.PinInputLayoutBase;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.client.utils.ViewWrapper;
import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import n4.k;

/* JADX INFO: loaded from: classes11.dex */
public class PinPad implements View.OnClickListener, PinInputLayoutBase.PinStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NnlAsmPinUiBinding f63217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PinManageProcess f63218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PinInputLayoutBase f63219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63220d;

    public enum TYPE {
        CREATE_PIN(UIConfigTags.TAG_PIN_CREATE, R.string.nnl_asm_pin_create_pin),
        CONFIRM_PIN(UIConfigTags.TAG_PIN_REENTER, R.string.nnl_asm_pin_retype_pin),
        ENTER_PIN(UIConfigTags.TAG_PIN_ENTER, R.string.nnl_asm_pin_enter),
        OLD_PIN(UIConfigTags.TAG_PIN_OLD_PIN, R.string.nnl_asm_pin_old_pin),
        NEW_PIN_1(UIConfigTags.TAG_PIN_NEW_PIN, R.string.nnl_asm_pin_new_pin),
        NEW_PIN_2(UIConfigTags.TAG_PIN_REENTER_NEW_PIN, R.string.nnl_asm_pin_retype_new_pin),
        INVALID_TYPE(null, -1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f63222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f63223b;

        TYPE(String str, int i10) {
            this.f63222a = str;
            this.f63223b = i10;
        }

        public String getMessage(Context context) {
            int i10 = this.f63223b;
            if (i10 == -1) {
                return null;
            }
            return UiConfig.getText(context, UIConfigTags.LEVELS_PIN_VIEW, this.f63222a, i10);
        }
    }

    public PinPad(Activity activity, PinManageProcess pinManageProcess, TYPE type, int i10, PinDatabase.PinConfig pinConfig, int i11, String str) {
        this.f63220d = false;
        NnlAsmPinUiBinding nnlAsmPinUiBindingInflate = NnlAsmPinUiBinding.inflate(activity.getLayoutInflater());
        this.f63217a = nnlAsmPinUiBindingInflate;
        activity.setContentView(nnlAsmPinUiBindingInflate.getRoot());
        new ViewWrapper(nnlAsmPinUiBindingInflate.getRoot()).onShow();
        this.f63218b = pinManageProcess;
        nnlAsmPinUiBindingInflate.title.setText(type.getMessage(activity));
        TYPE type2 = TYPE.CREATE_PIN;
        if (type.equals(type2) || type.equals(TYPE.NEW_PIN_1)) {
            TextView textView = nnlAsmPinUiBindingInflate.pinRequirementsText;
            Context applicationContext = activity.getApplicationContext();
            List<String> list = UIConfigTags.LEVELS_PIN_VIEW;
            textView.setText(UiConfig.getText(applicationContext, list, UIConfigTags.TAG_PIN_CRITERIA_GENERAL, R.string.nnl_asm_pin_requirements));
            if (pinConfig.minLength == pinConfig.maxLength) {
                nnlAsmPinUiBindingInflate.pinLengthText.setText(MessageFormat.format(UiConfig.getText(activity.getApplicationContext(), list, UIConfigTags.TAG_PIN_CRITERIA_LENGTH, R.string.nnl_asm_pin_create_pin_size), Integer.valueOf(pinConfig.minLength)));
            } else {
                nnlAsmPinUiBindingInflate.pinLengthText.setText(MessageFormat.format(UiConfig.getText(activity.getApplicationContext(), list, UIConfigTags.TAG_PIN_CRITERIA_LENGTH_RANGE, R.string.nnl_asm_pin_create_pin_range), Integer.valueOf(pinConfig.minLength), Integer.valueOf(pinConfig.maxLength)));
            }
            if (pinConfig.maxRepeatDigits < pinConfig.maxLength) {
                nnlAsmPinUiBindingInflate.repeatedText.setVisibility(0);
                if (pinConfig.maxRepeatDigits == 1) {
                    nnlAsmPinUiBindingInflate.repeatedText.setText(UiConfig.getText(activity.getApplicationContext(), list, UIConfigTags.TAG_PIN_CRITERIA_NO_REPEATING_DIGITS, R.string.nnl_asm_pin_no_repeated_digits));
                } else {
                    nnlAsmPinUiBindingInflate.repeatedText.setText(MessageFormat.format(UiConfig.getText(activity.getApplicationContext(), list, UIConfigTags.TAG_PIN_CRITERIA_LIMIT_REPEATING_DIGITS, R.string.nnl_asm_pin_repeated_digits), Integer.valueOf(pinConfig.maxRepeatDigits)));
                }
            }
            if (pinConfig.maxSequentialDigits < pinConfig.maxLength) {
                nnlAsmPinUiBindingInflate.sequentialText.setVisibility(0);
                if (pinConfig.maxSequentialDigits == 1) {
                    nnlAsmPinUiBindingInflate.sequentialText.setText(UiConfig.getText(activity.getApplicationContext(), list, UIConfigTags.TAG_PIN_CRITERIA_NO_SEQUENTIAL_DIGITS, R.string.nnl_asm_pin_no_sequential_digits));
                } else {
                    nnlAsmPinUiBindingInflate.sequentialText.setText(MessageFormat.format(UiConfig.getText(activity.getApplicationContext(), list, UIConfigTags.TAG_PIN_CRITERIA_LIMIT_SEQUENTIAL_DIGITS, R.string.nnl_asm_pin_sequential_digits), Integer.valueOf(pinConfig.maxSequentialDigits)));
                }
            }
        }
        if ((type.equals(type2) || type.equals(TYPE.CONFIRM_PIN) || type.equals(TYPE.NEW_PIN_1) || type.equals(TYPE.NEW_PIN_2)) && pinConfig.confirmationButton) {
            nnlAsmPinUiBindingInflate.numericKeyboardButtonOk.setVisibility(0);
            nnlAsmPinUiBindingInflate.numericKeyboardButtonOk.setEnabled(false);
        } else {
            this.f63220d = true;
        }
        nnlAsmPinUiBindingInflate.subTitle.setText(str);
        PinInputLayoutBase pinStateChangeListener = new a(activity).setPinStateChangeListener(this);
        this.f63219c = pinStateChangeListener;
        if (type.equals(TYPE.ENTER_PIN) || type.equals(TYPE.OLD_PIN)) {
            pinStateChangeListener.setRange(i11, i11);
        } else {
            pinStateChangeListener.setRange(pinConfig.minLength, pinConfig.maxLength);
        }
        int identifier = activity.getResources().getIdentifier("nnl_asm_pin_cancelBtn", "id", activity.getPackageName());
        if (identifier != 0) {
            activity.findViewById(identifier).setOnClickListener(new k(activity, 6));
        }
        NumericKeyboard.setPinPad(activity, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f63218b.onKeyDown();
        int iValue = NumericKeyboard.value(view.getId());
        if (iValue == 10) {
            this.f63219c.removeLastDigit();
        } else if (iValue != 11) {
            this.f63219c.append(String.format(Locale.getDefault(), "%d", Integer.valueOf(iValue)));
        } else {
            this.f63218b.onEnter(this.f63219c.getPin());
        }
    }

    @Override // com.noknok.android.client.asm.pinmanagement.PinInputLayoutBase.PinStateChangeListener
    public void onPinStateChange(boolean z10) {
        if (!this.f63220d) {
            this.f63217a.numericKeyboardButtonOk.setEnabled(z10);
        } else if (z10) {
            this.f63218b.onEnter(this.f63219c.getPin());
        }
    }

    public void onRestoreState(Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("CUREDITTEXT")) == null) {
            return;
        }
        this.f63219c.append(string);
    }

    public void onSaveState(Bundle bundle) {
        bundle.putString("CUREDITTEXT", this.f63219c.getPin());
    }

    public void reset() {
        this.f63219c.reset(true);
    }

    public void setInfoText(Activity activity, String str) {
        if (str == null || "".equals(str)) {
            return;
        }
        Toast toastMakeText = Toast.makeText(activity.getApplicationContext(), str, 0);
        toastMakeText.setGravity(16, 0, 0);
        toastMakeText.show();
    }
}

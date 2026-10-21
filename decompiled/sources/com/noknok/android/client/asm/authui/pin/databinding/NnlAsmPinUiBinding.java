package com.noknok.android.client.asm.authui.pin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.asm.authui.pin.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlAsmPinUiBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f63214a;

    @NonNull
    public final Button numericKeyboardButton0;

    @NonNull
    public final Button numericKeyboardButton1;

    @NonNull
    public final Button numericKeyboardButton2;

    @NonNull
    public final Button numericKeyboardButton3;

    @NonNull
    public final Button numericKeyboardButton4;

    @NonNull
    public final Button numericKeyboardButton5;

    @NonNull
    public final Button numericKeyboardButton6;

    @NonNull
    public final Button numericKeyboardButton7;

    @NonNull
    public final Button numericKeyboardButton8;

    @NonNull
    public final Button numericKeyboardButton9;

    @NonNull
    public final Button numericKeyboardButtonBackspace;

    @NonNull
    public final Button numericKeyboardButtonOk;

    @NonNull
    public final TextView pinLengthText;

    @NonNull
    public final TextView pinRequirementsText;

    @NonNull
    public final EditText pinText;

    @NonNull
    public final TextView repeatedText;

    @NonNull
    public final TextView sequentialText;

    @NonNull
    public final TextView subTitle;

    @NonNull
    public final TextView title;

    private NnlAsmPinUiBinding(@NonNull View view, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull Button button5, @NonNull Button button6, @NonNull Button button7, @NonNull Button button8, @NonNull Button button9, @NonNull Button button10, @NonNull Button button11, @NonNull Button button12, @NonNull TextView textView, @NonNull TextView textView2, @NonNull EditText editText, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f63214a = view;
        this.numericKeyboardButton0 = button;
        this.numericKeyboardButton1 = button2;
        this.numericKeyboardButton2 = button3;
        this.numericKeyboardButton3 = button4;
        this.numericKeyboardButton4 = button5;
        this.numericKeyboardButton5 = button6;
        this.numericKeyboardButton6 = button7;
        this.numericKeyboardButton7 = button8;
        this.numericKeyboardButton8 = button9;
        this.numericKeyboardButton9 = button10;
        this.numericKeyboardButtonBackspace = button11;
        this.numericKeyboardButtonOk = button12;
        this.pinLengthText = textView;
        this.pinRequirementsText = textView2;
        this.pinText = editText;
        this.repeatedText = textView3;
        this.sequentialText = textView4;
        this.subTitle = textView5;
        this.title = textView6;
    }

    @NonNull
    public static NnlAsmPinUiBinding bind(@NonNull View view) {
        int i10 = R.id.numeric_keyboard_button_0;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.numeric_keyboard_button_1;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
            if (button2 != null) {
                i10 = R.id.numeric_keyboard_button_2;
                Button button3 = (Button) ViewBindings.findChildViewById(view, i10);
                if (button3 != null) {
                    i10 = R.id.numeric_keyboard_button_3;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, i10);
                    if (button4 != null) {
                        i10 = R.id.numeric_keyboard_button_4;
                        Button button5 = (Button) ViewBindings.findChildViewById(view, i10);
                        if (button5 != null) {
                            i10 = R.id.numeric_keyboard_button_5;
                            Button button6 = (Button) ViewBindings.findChildViewById(view, i10);
                            if (button6 != null) {
                                i10 = R.id.numeric_keyboard_button_6;
                                Button button7 = (Button) ViewBindings.findChildViewById(view, i10);
                                if (button7 != null) {
                                    i10 = R.id.numeric_keyboard_button_7;
                                    Button button8 = (Button) ViewBindings.findChildViewById(view, i10);
                                    if (button8 != null) {
                                        i10 = R.id.numeric_keyboard_button_8;
                                        Button button9 = (Button) ViewBindings.findChildViewById(view, i10);
                                        if (button9 != null) {
                                            i10 = R.id.numeric_keyboard_button_9;
                                            Button button10 = (Button) ViewBindings.findChildViewById(view, i10);
                                            if (button10 != null) {
                                                i10 = R.id.numeric_keyboard_button_backspace;
                                                Button button11 = (Button) ViewBindings.findChildViewById(view, i10);
                                                if (button11 != null) {
                                                    i10 = R.id.numeric_keyboard_button_ok;
                                                    Button button12 = (Button) ViewBindings.findChildViewById(view, i10);
                                                    if (button12 != null) {
                                                        i10 = R.id.pinLengthText;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                                                        if (textView != null) {
                                                            i10 = R.id.pinRequirementsText;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                            if (textView2 != null) {
                                                                i10 = R.id.pinText;
                                                                EditText editText = (EditText) ViewBindings.findChildViewById(view, i10);
                                                                if (editText != null) {
                                                                    i10 = R.id.repeatedText;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.sequentialText;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.subTitle;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.title;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                                                if (textView6 != null) {
                                                                                    return new NnlAsmPinUiBinding(view, button, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, textView, textView2, editText, textView3, textView4, textView5, textView6);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlAsmPinUiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f63214a;
    }

    @NonNull
    public static NnlAsmPinUiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_asm_pin_ui, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}

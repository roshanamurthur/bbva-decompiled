package com.noknok.android.client.asm.authui.pin.pinpad;

import android.app.Activity;
import com.noknok.android.client.asm.authui.pin.R;

/* JADX INFO: loaded from: classes11.dex */
public class NumericKeyboard {
    public static final int DELETE_VALUE = 10;
    public static final int OK_VALUE = 11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer[] f63215a = {Integer.valueOf(R.id.numeric_keyboard_button_0), Integer.valueOf(R.id.numeric_keyboard_button_1), Integer.valueOf(R.id.numeric_keyboard_button_2), Integer.valueOf(R.id.numeric_keyboard_button_3), Integer.valueOf(R.id.numeric_keyboard_button_4), Integer.valueOf(R.id.numeric_keyboard_button_5), Integer.valueOf(R.id.numeric_keyboard_button_6), Integer.valueOf(R.id.numeric_keyboard_button_7), Integer.valueOf(R.id.numeric_keyboard_button_8), Integer.valueOf(R.id.numeric_keyboard_button_9), Integer.valueOf(R.id.numeric_keyboard_button_backspace), Integer.valueOf(R.id.numeric_keyboard_button_ok)};

    public static void setPinPad(Activity activity, PinPad pinPad) {
        Integer[] numArr = f63215a;
        for (int i10 = 0; i10 < 12; i10++) {
            activity.findViewById(numArr[i10].intValue()).setOnClickListener(pinPad);
        }
    }

    public static int value(int i10) {
        int i11 = 0;
        while (true) {
            Integer[] numArr = f63215a;
            if (i11 >= 12) {
                return -1;
            }
            if (numArr[i11].intValue() == i10) {
                return i11;
            }
            i11++;
        }
    }
}

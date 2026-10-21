package com.instacart.library.truetime;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class InvalidNtpServerResponseException extends IOException {
    public final float actualValue;
    public final float expectedValue;
    public final String property;

    public InvalidNtpServerResponseException(String str) {
        super(str);
        this.property = "na";
        this.expectedValue = 0.0f;
        this.actualValue = 0.0f;
    }

    public InvalidNtpServerResponseException(String str, String str2, float f6, float f10) {
        super(String.format(Locale.getDefault(), str, str2, Float.valueOf(f6), Float.valueOf(f10)));
        this.property = str2;
        this.actualValue = f6;
        this.expectedValue = f10;
    }
}

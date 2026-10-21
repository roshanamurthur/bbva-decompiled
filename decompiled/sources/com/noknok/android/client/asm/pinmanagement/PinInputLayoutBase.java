package com.noknok.android.client.asm.pinmanagement;

import ad.d;
import androidx.databinding.e;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PinInputLayoutBase {
    protected int mMinLength = 0;
    protected int mMaxLength = 0;
    protected String mPin = "";
    protected PinStateChangeListener mListener = null;

    public interface PinStateChangeListener {
        void onPinStateChange(boolean z10);
    }

    public void append(String str) {
        String str2 = this.mPin;
        String strReplaceAll = str.replaceAll("[^0-9]", "");
        String strF = d.f(new StringBuilder(), this.mPin, strReplaceAll);
        this.mPin = strF;
        int length = strF.length();
        int i10 = this.mMaxLength;
        if (length > i10) {
            this.mPin = this.mPin.substring(0, i10);
        }
        if (this.mListener != null && str2.length() < this.mMinLength && this.mPin.length() >= this.mMinLength) {
            this.mListener.onPinStateChange(true);
        }
        draw(str2, this.mPin, strReplaceAll, false);
    }

    public abstract void draw(String str, String str2, String str3, boolean z10);

    public String getPin() {
        return this.mPin;
    }

    public void removeLastDigit() {
        if (this.mPin.length() == 0) {
            return;
        }
        String str = this.mPin;
        this.mPin = e.c(str, 1, 0);
        if (this.mListener != null && str.length() >= this.mMinLength && this.mPin.length() < this.mMinLength) {
            this.mListener.onPinStateChange(false);
        }
        draw(str, this.mPin, null, false);
    }

    public void reset(boolean z10) {
        String str = this.mPin;
        this.mPin = "";
        if (str.length() >= this.mMinLength) {
            this.mListener.onPinStateChange(false);
        }
        draw(str, this.mPin, null, z10);
    }

    public PinInputLayoutBase setPinStateChangeListener(PinStateChangeListener pinStateChangeListener) {
        this.mListener = pinStateChangeListener;
        return this;
    }

    public PinInputLayoutBase setRange(int i10, int i11) {
        this.mMinLength = i10;
        this.mMaxLength = i11;
        if (i10 > i11 || i10 == 0) {
            throw new IllegalArgumentException("PIN range is invalid");
        }
        return this;
    }
}

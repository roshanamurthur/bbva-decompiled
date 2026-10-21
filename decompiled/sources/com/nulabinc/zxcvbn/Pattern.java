package com.nulabinc.zxcvbn;

import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;

/* JADX INFO: loaded from: classes11.dex */
public enum Pattern {
    Bruteforce("bruteforce"),
    Dictionary("dictionary"),
    Spatial("spatial"),
    Repeat(VDPhotoSelfieCapture.LOG_TAG_REPEAT),
    Sequence("sequence"),
    Regex("regex"),
    Date("date");

    private final String value;

    Pattern(String str) {
        this.value = str;
    }

    public String value() {
        return this.value;
    }
}

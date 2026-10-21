package io.card.payment;

import android.text.InputFilter;
import android.text.TextWatcher;

/* JADX INFO: compiled from: Validator.java */
/* JADX INFO: loaded from: classes7.dex */
public interface k extends InputFilter, TextWatcher {
    boolean a();

    String getValue();

    boolean isValid();
}

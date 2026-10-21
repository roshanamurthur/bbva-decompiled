package com.cells.validator.rules.impl;

import com.cells.validator.rules.Rule;

/* JADX INFO: loaded from: classes9.dex */
public class NotNullRule<T> implements Rule<T> {
    @Override // com.cells.validator.rules.Rule
    public boolean isValid(T t10) {
        return t10 != null;
    }
}

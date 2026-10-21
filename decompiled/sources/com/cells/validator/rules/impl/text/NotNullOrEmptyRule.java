package com.cells.validator.rules.impl.text;

import com.cells.validator.rules.impl.NotNullRule;

/* JADX INFO: loaded from: classes9.dex */
public class NotNullOrEmptyRule extends NotNullRule<String> {
    @Override // com.cells.validator.rules.impl.NotNullRule, com.cells.validator.rules.Rule
    public boolean isValid(String str) {
        return super.isValid(str) && !str.isEmpty();
    }
}

package com.cells.validator.rules.impl.text;

import com.cells.validator.rules.impl.NotNullRule;

/* JADX INFO: loaded from: classes9.dex */
public class MinSizeRule extends NotNullRule<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39226a;

    public MinSizeRule(int i10) {
        this.f39226a = i10;
    }

    @Override // com.cells.validator.rules.impl.NotNullRule, com.cells.validator.rules.Rule
    public boolean isValid(String str) {
        return super.isValid(str) && str.length() >= this.f39226a;
    }
}

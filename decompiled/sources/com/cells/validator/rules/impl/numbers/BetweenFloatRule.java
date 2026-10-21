package com.cells.validator.rules.impl.numbers;

import com.cells.validator.rules.Rule;

/* JADX INFO: loaded from: classes9.dex */
public class BetweenFloatRule implements Rule<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39222b;

    public BetweenFloatRule(float f6, float f10) {
        this.f39221a = f6;
        this.f39222b = f10;
    }

    @Override // com.cells.validator.rules.Rule
    public boolean isValid(Float f6) {
        return f6.floatValue() >= this.f39221a && f6.floatValue() <= this.f39222b;
    }
}

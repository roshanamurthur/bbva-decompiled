package com.cells.validator.rules.impl.numbers;

import com.cells.validator.rules.Rule;

/* JADX INFO: loaded from: classes9.dex */
public class BetweenDoubleRule implements Rule<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f39219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f39220b;

    public BetweenDoubleRule(double d2, double d3) {
        this.f39219a = d2;
        this.f39220b = d3;
    }

    @Override // com.cells.validator.rules.Rule
    public boolean isValid(Double d2) {
        return d2.doubleValue() >= this.f39219a && d2.doubleValue() <= this.f39220b;
    }
}

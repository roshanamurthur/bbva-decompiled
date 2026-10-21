package com.cells.validator.rules.impl.numbers;

import com.cells.validator.rules.Rule;

/* JADX INFO: loaded from: classes9.dex */
public class BetweenIntRule implements Rule<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39224b;

    public BetweenIntRule(int i10, int i11) {
        this.f39223a = i10;
        this.f39224b = i11;
    }

    @Override // com.cells.validator.rules.Rule
    public boolean isValid(Integer num) {
        return num.intValue() >= this.f39223a && num.intValue() <= this.f39224b;
    }
}

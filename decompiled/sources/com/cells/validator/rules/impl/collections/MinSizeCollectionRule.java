package com.cells.validator.rules.impl.collections;

import com.cells.validator.rules.impl.NotNullRule;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class MinSizeCollectionRule extends NotNullRule<Collection> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39218a;

    public void setMinSize(int i10) {
        this.f39218a = i10;
    }

    @Override // com.cells.validator.rules.impl.NotNullRule, com.cells.validator.rules.Rule
    public boolean isValid(Collection collection) {
        return super.isValid(collection) && collection.size() >= this.f39218a;
    }
}

package com.cells.validator.rules.impl.collections;

import com.cells.validator.rules.impl.NotNullRule;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class NotNullOrEmptyCollectionRule extends NotNullRule<Collection> {
    @Override // com.cells.validator.rules.impl.NotNullRule, com.cells.validator.rules.Rule
    public boolean isValid(Collection collection) {
        return super.isValid(collection) && !collection.isEmpty();
    }
}

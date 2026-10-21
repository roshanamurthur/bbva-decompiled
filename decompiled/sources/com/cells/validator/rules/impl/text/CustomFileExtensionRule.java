package com.cells.validator.rules.impl.text;

import com.cells.validator.rules.RegexRule;

/* JADX INFO: loaded from: classes9.dex */
public class CustomFileExtensionRule extends RegexRule {
    public CustomFileExtensionRule(String str) {
        super(String.format("^.*\\.(%s)$", str));
    }
}

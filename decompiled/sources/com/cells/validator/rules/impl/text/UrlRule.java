package com.cells.validator.rules.impl.text;

import com.cells.validator.rules.RegexRule;

/* JADX INFO: loaded from: classes9.dex */
public class UrlRule extends RegexRule {
    public UrlRule() {
        super("^(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$");
    }
}

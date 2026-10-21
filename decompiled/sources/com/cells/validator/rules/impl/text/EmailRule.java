package com.cells.validator.rules.impl.text;

import com.cells.validator.rules.RegexRule;

/* JADX INFO: loaded from: classes9.dex */
public class EmailRule extends RegexRule {
    public EmailRule() {
        super("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
}

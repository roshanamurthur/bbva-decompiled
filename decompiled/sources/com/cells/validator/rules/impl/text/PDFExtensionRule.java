package com.cells.validator.rules.impl.text;

import com.cells.validator.rules.RegexRule;

/* JADX INFO: loaded from: classes9.dex */
public class PDFExtensionRule extends RegexRule {
    public PDFExtensionRule() {
        super("^.*\\.(pdf|PDF)$");
    }
}

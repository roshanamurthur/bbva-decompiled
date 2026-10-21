package com.cells.validator.rules;

import com.cells.validator.rules.impl.NotNullRule;
import com.cells.validator.rules.impl.text.EmailRule;
import com.cells.validator.rules.impl.text.ImageExtensionRule;
import com.cells.validator.rules.impl.text.NotNullOrEmptyRule;
import com.cells.validator.rules.impl.text.PDFExtensionRule;
import com.cells.validator.rules.impl.text.UrlRule;

/* JADX INFO: loaded from: classes9.dex */
public class StringRules {
    public static final NotNullRule<String> NOT_NULL = new NotNullRule<>();
    public static final NotNullOrEmptyRule NOT_NULL_OR_EMPTY_RULE = new NotNullOrEmptyRule();
    public static final UrlRule URI = new UrlRule();
    public static final PDFExtensionRule PDF = new PDFExtensionRule();
    public static final ImageExtensionRule IMAGE = new ImageExtensionRule();
    public static final EmailRule EMAIL = new EmailRule();
}

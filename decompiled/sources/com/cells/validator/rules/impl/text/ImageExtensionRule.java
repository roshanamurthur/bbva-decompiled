package com.cells.validator.rules.impl.text;

import com.cells.validator.rules.RegexRule;

/* JADX INFO: loaded from: classes9.dex */
public class ImageExtensionRule extends RegexRule {
    public ImageExtensionRule() {
        super("^.*\\.(jpg|JPG|png|PNG|GIF|gif)$");
    }
}

package com.veridas.config.validator;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ColorValidator.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/veridas/config/validator/ColorValidator;", "Lcom/veridas/config/validator/PatternValidator;", "()V", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ColorValidator extends PatternValidator {
    /* JADX WARN: Illegal instructions before constructor call */
    public ColorValidator() {
        Pattern patternCompile = Pattern.compile("^(#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{8})|red|blue|green|black|white|gray|cyan|magenta|yellow|lightgray|darkgray|grey|lightgrey|darkgrey|aqua|fuchsia|lime|maroon|navy|olive|purple|silver|teal|transparent)$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        super(patternCompile);
    }
}

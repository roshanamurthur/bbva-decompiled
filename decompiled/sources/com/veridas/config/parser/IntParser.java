package com.veridas.config.parser;

import ai.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntParser.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/veridas/config/parser/IntParser;", "Lcom/veridas/config/parser/Parser;", "", "()V", "parse", "value", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntParser implements Parser<Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.veridas.config.parser.Parser
    @NotNull
    public Integer parse(@Nullable String value) throws NumberFormatException {
        if (value == null) {
            throw new NumberFormatException(a.i(new Object[]{value}, 1, IntParserKt.INT_PARSE_EXCEPTION, "format(...)"));
        }
        try {
            return Integer.valueOf(Integer.parseInt(value));
        } catch (NumberFormatException unused) {
            throw new NumberFormatException(a.i(new Object[]{value}, 1, IntParserKt.INT_PARSE_EXCEPTION, "format(...)"));
        }
    }
}

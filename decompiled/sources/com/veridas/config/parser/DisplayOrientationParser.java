package com.veridas.config.parser;

import androidx.room.a;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.display.DisplayOrientation;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DisplayOrientationParser.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/veridas/config/parser/DisplayOrientationParser;", "Lcom/veridas/config/parser/Parser;", "Lcom/veridas/display/DisplayOrientation;", "()V", "parse", "value", "", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DisplayOrientationParser implements Parser<DisplayOrientation> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.veridas.config.parser.Parser
    @NotNull
    public DisplayOrientation parse(@Nullable String value) throws InvalidDisplayOrientationException {
        String strD;
        if (value != null) {
            Locale locale = Locale.ROOT;
            strD = a.d(locale, "ROOT", value, locale, "toLowerCase(...)");
        } else {
            strD = null;
        }
        if (Intrinsics.areEqual(strD, "landscape")) {
            return DisplayOrientation.LANDSCAPE;
        }
        if (Intrinsics.areEqual(strD, "portrait")) {
            return DisplayOrientation.PORTRAIT;
        }
        throw new InvalidDisplayOrientationException(value);
    }
}

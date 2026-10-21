package kotlin.text;

import java.util.Set;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes12.dex */
public class g extends f {
    @InlineOnly
    private static final Regex toRegex(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex(str);
    }

    @InlineOnly
    private static final Regex toRegex(String str, RegexOption option) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(option, "option");
        return new Regex(str, option);
    }

    @InlineOnly
    private static final Regex toRegex(String str, Set<? extends RegexOption> options) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Regex(str, options);
    }
}

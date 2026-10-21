package kotlin.text;

import java.util.regex.Pattern;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RegexExtensionsJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
public class f extends e {
    @InlineOnly
    private static final Regex toRegex(Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "<this>");
        return new Regex(pattern);
    }
}

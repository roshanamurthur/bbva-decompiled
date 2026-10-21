package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1789#2,3:398\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:398,3\n*E\n"})
public final class RegexKt {
    public static final MatchResult access$findNext(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    public static final MatchResult access$matchEntire(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    public static final int access$toInt(Iterable iterable) {
        Iterator it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((b) it.next()).getValue();
        }
        return value;
    }
}

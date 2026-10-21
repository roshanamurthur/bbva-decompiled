package kotlin.text;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
public class e extends d {

    /* JADX INFO: compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82366p0 = new a(1);

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return line;
        }
    }

    /* JADX INFO: compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f82367p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f82367p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return ad.d.f(new StringBuilder(), this.f82367p0, line);
        }
    }

    /* JADX INFO: compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends Lambda implements Function1<String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f82368p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f82368p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            boolean zIsBlank = l.isBlank(it);
            String str = this.f82368p0;
            if (zIsBlank) {
                return it.length() < str.length() ? str : it;
            }
            return u.f(str, it);
        }
    }

    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(String str) {
        return str.length() == 0 ? a.f82366p0 : new b(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!CharsKt__CharJVMKt.isWhitespace(str.charAt(i10))) {
                if (i10 == -1) {
                    return str.length();
                }
                return i10;
            }
            i10++;
        }
        i10 = -1;
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    @NotNull
    public static final String prependIndent(@NotNull String str, @NotNull String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.map(StringsKt__StringsKt.lineSequence(str), new c(indent)), RootService.LINE_BREAK, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i10, Function1<? super String, String> function1, Function1<? super String, String> function2) {
        String strInvoke;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if ((i11 == 0 || i11 == lastIndex) && l.isBlank(str)) {
                str = null;
            } else {
                String strInvoke2 = function2.invoke(str);
                if (strInvoke2 != null && (strInvoke = function1.invoke(strInvoke2)) != null) {
                    str = strInvoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i11 = i12;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(i10), (112 & 2) != 0 ? ", " : RootService.LINE_BREAK, (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String replaceIndent(@NotNull String str, @NotNull String newIndent) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> listLines = StringsKt__StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLines) {
            if (!l.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.minOrNull((Iterable) arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int size = (listLines.size() * newIndent.length()) + str.length();
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLines) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj2;
            if ((i10 == 0 || i10 == lastIndex) && l.isBlank(str2)) {
                str2 = null;
            } else {
                String strDrop = StringsKt___StringsKt.drop(str2, iIntValue);
                if (strDrop != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strDrop)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i11;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList3, new StringBuilder(size), (112 & 2) != 0 ? ", " : RootService.LINE_BREAK, (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    @NotNull
    public static final String replaceIndentByMargin(@NotNull String str, @NotNull String newIndent, @NotNull String marginPrefix) {
        int i10;
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (!(!l.isBlank(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listLines = StringsKt__StringsKt.lines(str);
        int size = (listLines.size() * newIndent.length()) + str.length();
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listLines) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == lastIndex) && l.isBlank(str2)) {
                str2 = null;
            } else {
                int length = str2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        i10 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.isWhitespace(str2.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (l.startsWith$default(str2, marginPrefix, i10, false, 4, null)) {
                        int length2 = marginPrefix.length() + i14;
                        Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str2.substring(length2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strSubstring)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i11 = i12;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(size), (112 & 2) != 0 ? ", " : RootService.LINE_BREAK, (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        if ((i10 & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    @IntrinsicConstEvaluation
    @NotNull
    public static String trimIndent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, "");
    }

    @IntrinsicConstEvaluation
    @NotNull
    public static final String trimMargin(@NotNull String str, @NotNull String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}

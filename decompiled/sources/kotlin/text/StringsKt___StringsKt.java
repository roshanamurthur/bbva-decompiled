package kotlin.text;

import androidx.camera.camera2.internal.n1;
import bk.p;
import bk.v;
import bk.w;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IntIterator;
import kotlin.collections.SlidingWindowKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _Strings.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2486:1\n126#1,2:2487\n214#1,5:2489\n502#1,5:2495\n502#1,5:2500\n462#1:2505\n1183#1,2:2506\n463#1,2:2508\n1185#1:2510\n465#1:2511\n462#1:2512\n1183#1,2:2513\n463#1,2:2515\n1185#1:2517\n465#1:2518\n1183#1,3:2519\n492#1,2:2522\n492#1,2:2524\n750#1,4:2526\n719#1,4:2530\n735#1,4:2534\n782#1,4:2538\n882#1,5:2542\n923#1,3:2547\n926#1,3:2557\n941#1,3:2560\n944#1,3:2570\n1041#1,3:2587\n1011#1,4:2590\n1000#1:2594\n1183#1,2:2595\n1185#1:2598\n1001#1:2599\n1183#1,3:2600\n1032#1:2603\n1174#1:2604\n1175#1:2606\n1033#1:2607\n1174#1,2:2608\n1183#1,3:2610\n1982#1,2:2613\n1984#1,6:2616\n2006#1,2:2622\n2008#1,6:2625\n2431#1,6:2631\n2461#1,7:2637\n1#2:2494\n1#2:2597\n1#2:2605\n1#2:2615\n1#2:2624\n372#3,7:2550\n372#3,7:2563\n372#3,7:2573\n372#3,7:2580\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n52#1:2487,2\n62#1:2489,5\n420#1:2495,5\n429#1:2500,5\n440#1:2505\n440#1:2506,2\n440#1:2508,2\n440#1:2510\n440#1:2511\n451#1:2512\n451#1:2513,2\n451#1:2515,2\n451#1:2517\n451#1:2518\n462#1:2519,3\n474#1:2522,2\n483#1:2524,2\n677#1:2526,4\n692#1:2530,4\n706#1:2534,4\n769#1:2538,4\n842#1:2542,5\n898#1:2547,3\n898#1:2557,3\n911#1:2560,3\n911#1:2570,3\n970#1:2587,3\n980#1:2590,4\n990#1:2594\n990#1:2595,2\n990#1:2598\n990#1:2599\n1000#1:2600,3\n1024#1:2603\n1024#1:2604\n1024#1:2606\n1024#1:2607\n1032#1:2608,2\n1786#1:2610,3\n2077#1:2613,2\n2077#1:2616,6\n2095#1:2622,2\n2095#1:2625,6\n2420#1:2631,6\n2448#1:2637,7\n990#1:2597\n1024#1:2605\n2077#1:2615\n2095#1:2624\n898#1:2550,7\n911#1:2563,7\n925#1:2573,7\n943#1:2580,7\n*E\n"})
public class StringsKt___StringsKt extends m {

    /* JADX INFO: compiled from: _Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<CharSequence, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82353p0 = new a(1);

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: compiled from: _Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<CharSequence, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f82356p0 = new b(1);

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: compiled from: _Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends Lambda implements Function1<CharSequence, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f82357p0 = new c(1);

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Strings.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", FirebaseAnalytics.Param.INDEX, "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<R> extends Lambda implements Function1<Integer, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f82358p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CharSequence f82359q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<CharSequence, R> f82360r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CharSequence charSequence, int i10, Function1 function1) {
            super(1);
            this.f82358p0 = i10;
            this.f82359q0 = charSequence;
            this.f82360r0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final R invoke(int i10) {
            int length = this.f82358p0 + i10;
            CharSequence charSequence = this.f82359q0;
            if (length < 0 || length > charSequence.length()) {
                length = charSequence.length();
            }
            return this.f82360r0.invoke(charSequence.subSequence(i10, length));
        }
    }

    /* JADX INFO: compiled from: _Strings.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\f\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends Lambda implements Function0<Iterator<? extends Character>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CharSequence f82361p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CharSequence charSequence) {
            super(0);
            this.f82361p0 = charSequence;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Iterator<? extends Character> invoke() {
            return StringsKt__StringsKt.iterator(this.f82361p0);
        }
    }

    public static final boolean all(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!((Boolean) androidx.databinding.f.f(charSequence, i10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    @NotNull
    public static final Iterable<Character> asIterable(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? CollectionsKt__CollectionsKt.emptyList() : new StringsKt___StringsKt$asIterable$$inlined$Iterable$1(charSequence);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Character>() { // from class: kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Character> iterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Pair pair = (Pair) androidx.databinding.f.f(charSequence, i10, transform);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Pair pair = (Pair) androidx.databinding.f.f(charSequence, i10, transform);
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> associateWith(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(kotlin.ranges.c.coerceAtMost(charSequence.length(), 128)), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static List<String> chunked(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i10, i10, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> chunkedSequence(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i10, a.f82353p0);
    }

    @InlineOnly
    private static final int count(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    @NotNull
    public static final CharSequence drop(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(kotlin.ranges.c.coerceAtMost(i10, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested character count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence dropLast(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            return take(charSequence, kotlin.ranges.c.coerceAtLeast(charSequence.length() - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested character count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence dropLastWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) androidx.databinding.f.f(charSequence, lastIndex, predicate)).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence dropWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int iA = androidx.databinding.e.a(charSequence, "<this>", function1, "predicate");
        for (int i10 = 0; i10 < iA; i10++) {
            if (!((Boolean) androidx.databinding.f.f(charSequence, i10, function1)).booleanValue()) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    @InlineOnly
    private static final char elementAtOrElse(CharSequence charSequence, int i10, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > StringsKt__StringsKt.getLastIndex(charSequence)) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @InlineOnly
    private static final Character elementAtOrNull(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return getOrNull(charSequence, i10);
    }

    @NotNull
    public static final CharSequence filter(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @NotNull
    public static final CharSequence filterIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return sb2;
    }

    @NotNull
    public static final <C extends Appendable> C filterIndexedTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final CharSequence filterNot(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @NotNull
    public static final <C extends Appendable> C filterNotTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Appendable> C filterTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Character find(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Character findLast(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    public static char first(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @InlineOnly
    private static final <R> R firstNotNullOf(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        R r3;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r3 = (R) androidx.databinding.f.f(charSequence, i10, transform);
            if (r3 != null) {
                if (r3 != null) {
                    return r3;
                }
                throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
            }
        }
        r3 = null;
        if (r3 != null) {
            return r3;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @InlineOnly
    private static final <R> R firstNotNullOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R r3 = (R) androidx.databinding.f.f(charSequence, i10, transform);
            if (r3 != null) {
                return r3;
            }
        }
        return null;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            bk.g.addAll(arrayList, (Iterable) androidx.databinding.f.f(charSequence, i10, transform));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            bk.g.addAll(arrayList, transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            bk.g.addAll(destination, transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            bk.g.addAll(destination, (Iterable) androidx.databinding.f.f(charSequence, i10, transform));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull CharSequence charSequence, R r3, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r3 = operation.invoke(r3, Character.valueOf(charSequence.charAt(i10)));
        }
        return r3;
    }

    public static final <R> R foldIndexed(@NotNull CharSequence charSequence, R r3, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            r3 = operation.invoke(Integer.valueOf(i11), r3, Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
        return r3;
    }

    public static final <R> R foldRight(@NotNull CharSequence charSequence, R r3, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r3);
        }
        return r3;
    }

    public static final <R> R foldRightIndexed(@NotNull CharSequence charSequence, R r3, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r3 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r3);
        }
        return r3;
    }

    public static final void forEach(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            action.invoke(Character.valueOf(charSequence.charAt(i10)));
        }
    }

    public static final void forEachIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
    }

    @InlineOnly
    private static final char getOrElse(CharSequence charSequence, int i10, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 > StringsKt__StringsKt.getLastIndex(charSequence)) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @Nullable
    public static final Character getOrNull(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0 || i10 > StringsKt__StringsKt.getLastIndex(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K> Grouping<Character, K> groupingBy(@NotNull final CharSequence charSequence, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<Character, K>() { // from class: kotlin.text.StringsKt___StringsKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public /* bridge */ /* synthetic */ Object keyOf(Character ch2) {
                return keyOf(ch2.charValue());
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<Character> sourceIterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }

            public K keyOf(char element) {
                return keySelector.invoke(Character.valueOf(element));
            }
        };
    }

    public static final int indexOfFirst(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int iA = androidx.databinding.e.a(charSequence, "<this>", function1, "predicate");
        for (int i10 = 0; i10 < iA; i10++) {
            if (((Boolean) androidx.databinding.f.f(charSequence, i10, function1)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (((Boolean) androidx.databinding.f.f(charSequence, length, predicate)).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    public static char last(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @NotNull
    public static final <R> List<R> map(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexedNotNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R> List<R> mapNotNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Object objF = androidx.databinding.f.f(charSequence, i10, transform);
            if (objF != null) {
                arrayList.add(objF);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapNotNullTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Object objF = androidx.databinding.f.f(charSequence, i10, transform);
            if (objF != null) {
                destination.add(objF);
            }
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char cCharAt2 = charSequence.charAt(intIteratorG.nextInt());
            R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char cCharAt2 = charSequence.charAt(intIteratorG.nextInt());
            R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(CharSequence charSequence, Function1<? super Character, Double> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) androidx.databinding.f.f(charSequence, 0, function1)).doubleValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        R r3 = (R) androidx.databinding.f.f(charSequence, 0, function1);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (r3.compareTo(rInvoke) < 0) {
                r3 = rInvoke;
            }
        }
        return r3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R r3 = (R) androidx.databinding.f.f(charSequence, 0, selector);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(r3, rInvoke) < 0) {
                r3 = rInvoke;
            }
        }
        return r3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r3 = (R) androidx.databinding.f.f(charSequence, 0, selector);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(r3, rInvoke) < 0) {
                r3 = rInvoke;
            }
        }
        return r3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char cCharAt2 = charSequence.charAt(intIteratorG.nextInt());
            R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        R rInvoke = function1.invoke(Character.valueOf(cCharAt));
        IntIterator intIteratorG = n1.g(1, lastIndex);
        while (intIteratorG.hasNext()) {
            char cCharAt2 = charSequence.charAt(intIteratorG.nextInt());
            R rInvoke2 = function1.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(CharSequence charSequence, Function1<? super Character, Double> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) androidx.databinding.f.f(charSequence, 0, function1)).doubleValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        R r3 = (R) androidx.databinding.f.f(charSequence, 0, function1);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (r3.compareTo(rInvoke) > 0) {
                r3 = rInvoke;
            }
        }
        return r3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R r3 = (R) androidx.databinding.f.f(charSequence, 0, selector);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(r3, rInvoke) > 0) {
                r3 = rInvoke;
            }
        }
        return r3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r3 = (R) androidx.databinding.f.f(charSequence, 0, selector);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(r3, rInvoke) > 0) {
                r3 = rInvoke;
            }
        }
        return r3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    public static final boolean none(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S onEach(@NotNull S s4, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s4, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i10 = 0; i10 < s4.length(); i10++) {
            action.invoke(Character.valueOf(s4.charAt(i10)));
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S extends CharSequence> S onEachIndexed(@NotNull S s4, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s4, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < s4.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(s4.charAt(i10)));
            i10++;
            i11++;
        }
        return s4;
    }

    @NotNull
    public static final Pair<CharSequence, CharSequence> partition(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        return new Pair<>(sb2, sb3);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return random(charSequence, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return randomOrNull(charSequence, Random.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final char reduce(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final char reduceIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt))).charValue();
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceOrNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final char reduceRight(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    public static final char reduceRightIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceRightOrNull(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static CharSequence reversed(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(sbReverse, "reverse(...)");
        return sbReverse;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFold(@NotNull CharSequence charSequence, R r3, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return bk.d.listOf(r3);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r3);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r3 = operation.invoke(r3, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r3);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFoldIndexed(@NotNull CharSequence charSequence, R r3, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return bk.d.listOf(r3);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r3);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r3 = operation.invoke(Integer.valueOf(i10), r3, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r3);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduce(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i10 = 1; i10 < length; i10++) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduceIndexed(@NotNull CharSequence charSequence, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i10 = 1; i10 < length; i10++) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <R> List<R> scan(@NotNull CharSequence charSequence, R r3, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return bk.d.listOf(r3);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r3);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r3 = operation.invoke(r3, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r3);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <R> List<R> scanIndexed(@NotNull CharSequence charSequence, R r3, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return bk.d.listOf(r3);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r3);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r3 = operation.invoke(Integer.valueOf(i10), r3, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r3);
        }
        return arrayList;
    }

    public static char single(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.subSequence(charSequence, indices);
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final int sumBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += ((Number) androidx.databinding.f.f(charSequence, i10, selector)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final double sumByDouble(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += ((Number) androidx.databinding.f.f(charSequence, i10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += ((Number) androidx.databinding.f.f(charSequence, i10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(CharSequence charSequence, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += ((Number) androidx.databinding.f.f(charSequence, i10, selector)).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(CharSequence charSequence, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            jLongValue += ((Number) androidx.databinding.f.f(charSequence, i10, selector)).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(CharSequence charSequence, Function1<? super Character, UInt> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM5570constructorimpl = UInt.m5570constructorimpl(0);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iM5570constructorimpl = UInt.m5570constructorimpl(((UInt) androidx.databinding.f.f(charSequence, i10, selector)).getF79399p0() + iM5570constructorimpl);
        }
        return iM5570constructorimpl;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(CharSequence charSequence, Function1<? super Character, ULong> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jM5595constructorimpl = ULong.m5595constructorimpl(0L);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            jM5595constructorimpl = ULong.m5595constructorimpl(((ULong) androidx.databinding.f.f(charSequence, i10, selector)).getF79403p0() + jM5595constructorimpl);
        }
        return jM5595constructorimpl;
    }

    @NotNull
    public static final CharSequence take(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(0, kotlin.ranges.c.coerceAtMost(i10, charSequence.length()));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested character count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence takeLast(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = charSequence.length();
        return charSequence.subSequence(length - kotlin.ranges.c.coerceAtMost(i10, length), length);
    }

    @NotNull
    public static final CharSequence takeLastWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) androidx.databinding.f.f(charSequence, lastIndex, predicate)).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final CharSequence takeWhile(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int iA = androidx.databinding.e.a(charSequence, "<this>", function1, "predicate");
        for (int i10 = 0; i10 < iA; i10++) {
            if (!((Boolean) androidx.databinding.f.f(charSequence, i10, function1)).booleanValue()) {
                return charSequence.subSequence(0, i10);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static <C extends Collection<? super Character>> C toCollection(@NotNull CharSequence charSequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) toCollection(charSequence, new HashSet(p.mapCapacity(kotlin.ranges.c.coerceAtMost(charSequence.length(), 128))));
    }

    @NotNull
    public static final List<Character> toList(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? toMutableList(charSequence) : bk.d.listOf(Character.valueOf(charSequence.charAt(0)));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    @NotNull
    public static final Set<Character> toSet(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? (Set) toCollection(charSequence, new LinkedHashSet(p.mapCapacity(kotlin.ranges.c.coerceAtMost(charSequence.length(), 128)))) : v.setOf(Character.valueOf(charSequence.charAt(0)));
        }
        return w.emptySet();
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<String> windowed(@NotNull CharSequence charSequence, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i10, i11, z10, b.f82356p0);
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(charSequence, i10, i11, z10);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> windowedSequence(@NotNull CharSequence charSequence, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i10, i11, z10, c.f82357p0);
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowedSequence(charSequence, i10, i11, z10);
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IndexingIterable(new e(charSequence));
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull CharSequence charSequence, @NotNull CharSequence other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> zipWithNext(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i10));
            i10++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (((Boolean) androidx.databinding.f.f(charSequence, i10, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> chunked(@NotNull CharSequence charSequence, int i10, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(charSequence, i10, i10, true, transform);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> chunkedSequence(@NotNull CharSequence charSequence, int i10, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowedSequence(charSequence, i10, i10, true, transform);
    }

    public static final int count(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (((Boolean) androidx.databinding.f.f(charSequence, i11, predicate)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static final boolean none(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (((Boolean) androidx.databinding.f.f(charSequence, i10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static char random(@NotNull CharSequence charSequence, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull CharSequence charSequence, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    @InlineOnly
    private static final String reversed(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return reversed((CharSequence) str).toString();
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> windowed(@NotNull CharSequence charSequence, int i10, int i11, boolean z10, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i10, i11);
        int length = charSequence.length();
        int i12 = 0;
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i10, int i11, boolean z10, Function1 function1, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(charSequence, i10, i11, z10, function1);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> windowedSequence(@NotNull CharSequence charSequence, int i10, int i11, boolean z10, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i10, i11);
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(kotlin.ranges.c.step(z10 ? StringsKt__StringsKt.getIndices(charSequence) : kotlin.ranges.c.until(0, (charSequence.length() - i10) + 1), i11)), new d(charSequence, i10, transform));
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i10, int i11, boolean z10, Function1 function1, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowedSequence(charSequence, i10, i11, z10, function1);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @NotNull
    public static final String filterNot(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static String slice(@NotNull String str, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.substring(str, indices);
    }

    @NotNull
    public static final String filterIndexed(@NotNull String str, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final char first(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return cCharAt;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull CharSequence charSequence, @NotNull CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final String filter(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final char single(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (!z10) {
                    chValueOf = Character.valueOf(cCharAt);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence charSequence, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb2.append(charSequence.charAt(it.next().intValue()));
        }
        return sb2;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Pair<Character, Character>> zipWithNext(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            i10++;
            arrayList.add(TuplesKt.to(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @NotNull
    public static final Pair<String, String> partition(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Pair<>(string, string2);
    }

    @InlineOnly
    private static final String slice(String str, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return slice((CharSequence) str, indices).toString();
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static String drop(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(kotlin.ranges.c.coerceAtMost(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested character count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static String dropLast(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            return take(str, kotlin.ranges.c.coerceAtLeast(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested character count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final String dropLastWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String strSubstring = str.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @NotNull
    public static String take(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, kotlin.ranges.c.coerceAtMost(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested character count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static String takeLast(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - kotlin.ranges.c.coerceAtMost(i10, length));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested character count ", i10, " is less than zero.").toString());
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @NotNull
    public static final String dropWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String strSubstring = str.substring(i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @NotNull
    public static final String takeLastWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String strSubstring = str.substring(lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    @NotNull
    public static final String takeWhile(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String strSubstring = str.substring(0, i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m5794maxOfOrNull(CharSequence charSequence, Function1<? super Character, Double> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        double dDoubleValue = ((Number) androidx.databinding.f.f(charSequence, 0, function1)).doubleValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m5798minOfOrNull(CharSequence charSequence, Function1<? super Character, Double> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        double dDoubleValue = ((Number) androidx.databinding.f.f(charSequence, 0, function1)).doubleValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m5792maxOf(CharSequence charSequence, Function1<? super Character, Float> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") != 0) {
            float fFloatValue = ((Number) androidx.databinding.f.f(charSequence, 0, function1)).floatValue();
            ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m5796minOf(CharSequence charSequence, Function1<? super Character, Float> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") != 0) {
            float fFloatValue = ((Number) androidx.databinding.f.f(charSequence, 0, function1)).floatValue();
            ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m5795maxOfOrNull(CharSequence charSequence, Function1<? super Character, Float> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        float fFloatValue = ((Number) androidx.databinding.f.f(charSequence, 0, function1)).floatValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m5799minOfOrNull(CharSequence charSequence, Function1<? super Character, Float> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        float fFloatValue = ((Number) androidx.databinding.f.f(charSequence, 0, function1)).floatValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m5793maxOf(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") != 0) {
            R r3 = (R) androidx.databinding.f.f(charSequence, 0, function1);
            ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (it.hasNext()) {
                R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
                if (r3.compareTo(rInvoke) < 0) {
                    r3 = rInvoke;
                }
            }
            return r3;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m5797minOf(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.databinding.e.a(charSequence, "<this>", function1, "selector") != 0) {
            R r3 = (R) androidx.databinding.f.f(charSequence, 0, function1);
            ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (it.hasNext()) {
                R rInvoke = function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
                if (r3.compareTo(rInvoke) > 0) {
                    r3 = rInvoke;
                }
            }
            return r3;
        }
        throw new NoSuchElementException();
    }
}

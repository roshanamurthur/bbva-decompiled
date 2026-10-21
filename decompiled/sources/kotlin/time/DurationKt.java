package kotlin.time;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.UIConfigTags;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\"\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\t\"\u0014\u0010\n\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u001e\u0010\u0013\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0013\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000f\u0010\u0014\"\u001e\u0010\u0013\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u000f\u0010\u0016\"\u001e\u0010\u001a\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0018\u0010\u0010\"\u001e\u0010\u001a\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014\"\u001e\u0010\u001a\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016\"\u001e\u0010\u001d\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001b\u0010\u0010\"\u001e\u0010\u001d\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014\"\u001e\u0010\u001d\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016\"\u001e\u0010 \u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0010\"\u001e\u0010 \u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014\"\u001e\u0010 \u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016\"\u001e\u0010#\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0012\u001a\u0004\b!\u0010\u0010\"\u001e\u0010#\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b!\u0010\u0014\"\u001e\u0010#\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b!\u0010\u0016\"\u001e\u0010&\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0012\u001a\u0004\b$\u0010\u0010\"\u001e\u0010&\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0015\u001a\u0004\b$\u0010\u0014\"\u001e\u0010&\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0017\u001a\u0004\b$\u0010\u0016\"\u001e\u0010)\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0012\u001a\u0004\b'\u0010\u0010\"\u001e\u0010)\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0015\u001a\u0004\b'\u0010\u0014\"\u001e\u0010)\u001a\u00020\u0003*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0017\u001a\u0004\b'\u0010\u0016¨\u0006*"}, d2 = {"", "Lkotlin/time/DurationUnit;", Tabulator.KEY_UNIT, "Lkotlin/time/Duration;", "toDuration", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "NANOS_IN_MILLIS", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "MAX_NANOS", "J", "MAX_MILLIS", "getNanoseconds", "(I)J", "getNanoseconds$annotations", "(I)V", "nanoseconds", "(J)J", "(J)V", "(D)J", "(D)V", "getMicroseconds", "getMicroseconds$annotations", "microseconds", "getMilliseconds", "getMilliseconds$annotations", "milliseconds", "getSeconds", "getSeconds$annotations", UIConfigTags.TAG_SECONDS, "getMinutes", "getMinutes$annotations", UIConfigTags.TAG_MINUTES, "getHours", "getHours$annotations", UIConfigTags.TAG_HOURS, "getDays", "getDays$annotations", UIConfigTags.TAG_DAYS, "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n1447#1,6:1497\n1450#1,3:1503\n1447#1,6:1506\n1447#1,6:1512\n1450#1,3:1521\n1#2:1496\n1726#3,3:1518\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1497,6\n1405#1:1503,3\n1408#1:1506,6\n1411#1:1512,6\n1447#1:1521,3\n1436#1:1518,3\n*E\n"})
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final long a(long j10) {
        return new LongRange(-4611686018426L, 4611686018426L).contains(j10) ? b(j10 * ((long) NANOS_IN_MILLIS)) : Duration.m5811constructorimpl((c.coerceIn(j10, -4611686018427387903L, MAX_MILLIS) << 1) + 1);
    }

    public static final long access$durationOfNanosNormalized(long j10) {
        return new LongRange(-4611686018426999999L, MAX_NANOS).contains(j10) ? b(j10) : Duration.m5811constructorimpl(((j10 / ((long) NANOS_IN_MILLIS)) << 1) + 1);
    }

    public static final long access$millisToNanos(long j10) {
        return j10 * ((long) NANOS_IN_MILLIS);
    }

    public static final long access$nanosToMillis(long j10) {
        return j10 / ((long) NANOS_IN_MILLIS);
    }

    public static final long access$parseDuration(String str, boolean z10) {
        boolean z11;
        boolean z12;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Duration.Companion companion = Duration.INSTANCE;
        long jM5888getZEROUwyO8pc = companion.m5888getZEROUwyO8pc();
        char cCharAt = str.charAt(0);
        boolean z13 = true;
        int length2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z14 = length2 > 0;
        boolean z15 = z14 && StringsKt__StringsKt.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = '9';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i10 = length2 + 1;
            if (i10 == length) {
                throw new IllegalArgumentException();
            }
            boolean z16 = false;
            DurationUnit durationUnit = null;
            while (i10 < length) {
                if (str.charAt(i10) != 'T') {
                    int i11 = i10;
                    while (i11 < str.length()) {
                        char cCharAt2 = str.charAt(i11);
                        if (!new CharRange(c11, c10).contains(cCharAt2) && !StringsKt__StringsKt.contains$default((CharSequence) "+-.", cCharAt2, false, 2, (Object) null)) {
                            break;
                        }
                        i11++;
                        c11 = '0';
                        c10 = '9';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i10, i11);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = strSubstring.length() + i10;
                    if (length3 < 0 || length3 > StringsKt__StringsKt.getLastIndex(str)) {
                        throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                    }
                    int i12 = length3 + 1;
                    DurationUnit durationUnitDurationUnitByIsoChar = DurationUnitKt__DurationUnitKt.durationUnitByIsoChar(str.charAt(length3), z16);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, '.', 0, false, 6, (Object) null);
                    if (durationUnitDurationUnitByIsoChar != DurationUnit.SECONDS || iIndexOf$default <= 0) {
                        jM5888getZEROUwyO8pc = Duration.m5842plusLRDsOJo(jM5888getZEROUwyO8pc, toDuration(c(strSubstring), durationUnitDurationUnitByIsoChar));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jM5842plusLRDsOJo = Duration.m5842plusLRDsOJo(jM5888getZEROUwyO8pc, toDuration(c(strSubstring2), durationUnitDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM5888getZEROUwyO8pc = Duration.m5842plusLRDsOJo(jM5842plusLRDsOJo, toDuration(Double.parseDouble(strSubstring3), durationUnitDurationUnitByIsoChar));
                    }
                    i10 = i12;
                    durationUnit = durationUnitDurationUnitByIsoChar;
                    c11 = '0';
                    c10 = '9';
                    z13 = true;
                } else {
                    if (z16 || (i10 = i10 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z16 = z13;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            long jM5842plusLRDsOJo2 = jM5888getZEROUwyO8pc;
            char c12 = '9';
            if (l.regionMatches(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM5888getZEROUwyO8pc = companion.m5886getINFINITEUwyO8pc();
            } else {
                boolean z17 = !z14;
                if (z14 && str.charAt(length2) == '(' && StringsKt___StringsKt.last(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z12 = false;
                    z11 = true;
                } else {
                    z11 = z17;
                    z12 = false;
                }
                DurationUnit durationUnit2 = null;
                while (length2 < length) {
                    if (z12 && z11) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i13 = length2;
                    while (i13 < str.length()) {
                        char cCharAt3 = str.charAt(i13);
                        if (!new CharRange('0', c12).contains(cCharAt3) && cCharAt3 != '.') {
                            break;
                        }
                        i13++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i13);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = strSubstring4.length() + length2;
                    int i14 = length4;
                    while (i14 < str.length()) {
                        if (!new CharRange('a', 'z').contains(str.charAt(i14))) {
                            break;
                        }
                        i14++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i14);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = strSubstring5.length() + length4;
                    DurationUnit durationUnitDurationUnitByShortName = DurationUnitKt__DurationUnitKt.durationUnitByShortName(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring4, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM5842plusLRDsOJo3 = Duration.m5842plusLRDsOJo(jM5842plusLRDsOJo2, toDuration(Long.parseLong(strSubstring6), durationUnitDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM5842plusLRDsOJo2 = Duration.m5842plusLRDsOJo(jM5842plusLRDsOJo3, toDuration(Double.parseDouble(strSubstring7), durationUnitDurationUnitByShortName));
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM5842plusLRDsOJo2 = Duration.m5842plusLRDsOJo(jM5842plusLRDsOJo2, toDuration(Long.parseLong(strSubstring4), durationUnitDurationUnitByShortName));
                    }
                    str2 = str3;
                    durationUnit2 = durationUnitDurationUnitByShortName;
                    z12 = true;
                    c12 = '9';
                }
                jM5888getZEROUwyO8pc = jM5842plusLRDsOJo2;
            }
        }
        return z15 ? Duration.m5859unaryMinusUwyO8pc(jM5888getZEROUwyO8pc) : jM5888getZEROUwyO8pc;
    }

    public static final long b(long j10) {
        return Duration.m5811constructorimpl(j10 << 1);
    }

    public static final long c(String str) {
        int length = str.length();
        int i10 = (length <= 0 || !StringsKt__StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i10 > 16) {
            Iterable intRange = new IntRange(i10, StringsKt__StringsKt.getLastIndex(str));
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!new CharRange('0', '9').contains(str.charAt(((IntIterator) it).nextInt()))) {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (l.startsWith$default(str, "+", false, 2, null)) {
            str = StringsKt___StringsKt.drop(str, 1);
        }
        return Long.parseLong(str);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(double d2) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(double d2) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(double d2) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(double d2) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(double d2) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(double d2) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(double d2) {
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(int i10, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? b(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i10, unit, DurationUnit.NANOSECONDS)) : toDuration(i10, unit);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(long j10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(long j10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(long j10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(long j10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(long j10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(long j10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(long j10) {
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(long j10, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jConvertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        if (new LongRange(-jConvertDurationUnitOverflow, jConvertDurationUnitOverflow).contains(j10)) {
            return b(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j10, unit, durationUnit));
        }
        return Duration.m5811constructorimpl((c.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j10, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS) << 1) + 1);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(double d2, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d2, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(dConvertDurationUnit)) {
            long jRoundToLong = mk.c.roundToLong(dConvertDurationUnit);
            if (new LongRange(-4611686018426999999L, MAX_NANOS).contains(jRoundToLong)) {
                return b(jRoundToLong);
            }
            return a(mk.c.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d2, unit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }
}

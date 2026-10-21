package kotlin.time;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.UIConfigTags;
import dk.f;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b:\b\u0087@\u0018\u0000 \u008c\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u008c\u0001B\u0013\b\u0000\u0012\u0007\u0010\u008a\u0001\u001a\u00020*¢\u0006\u0005\b\u008b\u0001\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0010H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0010H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001dJ\r\u0010$\u001a\u00020\u001b¢\u0006\u0004\b#\u0010\u001dJ\u0018\u0010'\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u009d\u0001\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2u\u00102\u001aq\u0012\u0013\u0012\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(1\u0012\u0004\u0012\u00028\u00000)H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b3\u00104J\u0088\u0001\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2`\u00102\u001a\\\u0012\u0013\u0012\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(1\u0012\u0004\u0012\u00028\u000006H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b3\u00107Js\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2K\u00102\u001aG\u0012\u0013\u0012\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(1\u0012\u0004\u0012\u00028\u000008H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b3\u00109J^\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010(26\u00102\u001a2\u0012\u0013\u0012\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(1\u0012\u0004\u0012\u00028\u00000:H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b3\u0010;J\u0015\u0010>\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b?\u0010\u0019J\u0015\u0010C\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010E\u001a\u00020*H\u0007¢\u0006\u0004\bD\u0010\u0003J\u000f\u0010G\u001a\u00020*H\u0007¢\u0006\u0004\bF\u0010\u0003J\u000f\u0010K\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020H2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010L\u001a\u00020\u000b¢\u0006\u0004\bI\u0010MJ\r\u0010O\u001a\u00020H¢\u0006\u0004\bN\u0010JJ\u0010\u0010R\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010V\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010SHÖ\u0003¢\u0006\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bW\u0010\u0003R\u001a\u0010\\\u001a\u00020\u000b8@X\u0081\u0004¢\u0006\f\u0012\u0004\bZ\u0010[\u001a\u0004\bY\u0010QR\u001a\u0010_\u001a\u00020\u000b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b^\u0010[\u001a\u0004\b]\u0010QR\u001a\u0010b\u001a\u00020\u000b8@X\u0081\u0004¢\u0006\f\u0012\u0004\ba\u0010[\u001a\u0004\b`\u0010QR\u001a\u0010e\u001a\u00020\u000b8@X\u0081\u0004¢\u0006\f\u0012\u0004\bd\u0010[\u001a\u0004\bc\u0010QR\u001a\u0010i\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bh\u0010[\u001a\u0004\bf\u0010gR\u001a\u0010l\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bk\u0010[\u001a\u0004\bj\u0010gR\u001a\u0010o\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bn\u0010[\u001a\u0004\bm\u0010gR\u001a\u0010r\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010[\u001a\u0004\bp\u0010gR\u001a\u0010u\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bt\u0010[\u001a\u0004\bs\u0010gR\u001a\u0010x\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bw\u0010[\u001a\u0004\bv\u0010gR\u001a\u0010{\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010[\u001a\u0004\by\u0010gR\u0011\u0010}\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b|\u0010\u0003R\u0011\u0010\u007f\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b~\u0010\u0003R\u0013\u0010\u0081\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0003R\u0013\u0010\u0083\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0003R\u0013\u0010\u0085\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u0003R\u0013\u0010\u0087\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0003R\u0013\u0010\u0089\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0003\u0088\u0001\u008a\u0001\u0092\u0001\u00020*\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006\u008d\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "unaryMinus-UwyO8pc", "(J)J", "unaryMinus", "other", "plus-LRDsOJo", "(JJ)J", "plus", "minus-LRDsOJo", "minus", "", ImageScaleTypeHandler.ID, "times-UwyO8pc", "(JI)J", "times", "", "(JD)J", "div-UwyO8pc", "div", "div-LRDsOJo", "(JJ)D", "Lkotlin/time/DurationUnit;", Tabulator.KEY_UNIT, "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "truncateTo", "", "isNegative-impl", "(J)Z", "isNegative", "isPositive-impl", "isPositive", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "compareTo-LRDsOJo", "(JJ)I", "compareTo", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", UIConfigTags.TAG_DAYS, UIConfigTags.TAG_HOURS, UIConfigTags.TAG_MINUTES, UIConfigTags.TAG_SECONDS, "nanoseconds", "action", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "toComponents", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toDouble", "toLong-impl", "toLong", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toInt", "toLongNanoseconds-impl", "toLongNanoseconds", "toLongMilliseconds-impl", "toLongMilliseconds", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString-impl", "toIsoString", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getAbsoluteValue-UwyO8pc", "absoluteValue", "getHoursComponent-impl", "getHoursComponent$annotations", "()V", "hoursComponent", "getMinutesComponent-impl", "getMinutesComponent$annotations", "minutesComponent", "getSecondsComponent-impl", "getSecondsComponent$annotations", "secondsComponent", "getNanosecondsComponent-impl", "getNanosecondsComponent$annotations", "nanosecondsComponent", "getInDays-impl", "(J)D", "getInDays$annotations", "inDays", "getInHours-impl", "getInHours$annotations", "inHours", "getInMinutes-impl", "getInMinutes$annotations", "inMinutes", "getInSeconds-impl", "getInSeconds$annotations", "inSeconds", "getInMilliseconds-impl", "getInMilliseconds$annotations", "inMilliseconds", "getInMicroseconds-impl", "getInMicroseconds$annotations", "inMicroseconds", "getInNanoseconds-impl", "getInNanoseconds$annotations", "inNanoseconds", "getInWholeDays-impl", "inWholeDays", "getInWholeHours-impl", "inWholeHours", "getInWholeMinutes-impl", "inWholeMinutes", "getInWholeSeconds-impl", "inWholeSeconds", "getInWholeMilliseconds-impl", "inWholeMilliseconds", "getInWholeMicroseconds-impl", "inWholeMicroseconds", "getInWholeNanoseconds-impl", "inWholeNanoseconds", "rawValue", "constructor-impl", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
public final class Duration implements Comparable<Duration> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f82381q0 = m5811constructorimpl(0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final long f82382r0 = m5811constructorimpl((DurationKt.MAX_MILLIS << 1) + 1);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final long f82383s0 = m5811constructorimpl(((-4611686018427387903L) << 1) + 1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f82384p0;

    /* JADX INFO: compiled from: Duration.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000eJ\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ\u001a\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000eJ\u001a\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000fJ\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\u001a\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b%\u0010#R\u001a\u0010'\u001a\u00020\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010-\u001a\u00020\t8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\u0082\u0002\u0004\n\u0002\b!¨\u00061"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "", "value", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "convert", "", "Lkotlin/time/Duration;", "nanoseconds-UwyO8pc", "(I)J", "nanoseconds", "", "(J)J", "(D)J", "microseconds-UwyO8pc", "microseconds", "milliseconds-UwyO8pc", "milliseconds", "seconds-UwyO8pc", UIConfigTags.TAG_SECONDS, "minutes-UwyO8pc", UIConfigTags.TAG_MINUTES, "hours-UwyO8pc", UIConfigTags.TAG_HOURS, "days-UwyO8pc", UIConfigTags.TAG_DAYS, "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parse", "parseIsoString-UwyO8pc", "parseIsoString", "parseOrNull-FghU774", "(Ljava/lang/String;)Lkotlin/time/Duration;", "parseOrNull", "parseIsoStringOrNull-FghU774", "parseIsoStringOrNull", "ZERO", "J", "getZERO-UwyO8pc", "()J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5862getDaysUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5865getHoursUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5868getMicrosecondsUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5871getMillisecondsUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5874getMinutesUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5877getNanosecondsUwyO8pc$annotations(double d2) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5880getSecondsUwyO8pc$annotations(double d2) {
        }

        @ExperimentalTime
        public final double convert(double value, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5884daysUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m5886getINFINITEUwyO8pc() {
            return Duration.f82382r0;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m5887getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.f82383s0;
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m5888getZEROUwyO8pc() {
            return Duration.f82381q0;
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5890hoursUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5893microsecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5896millisecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5899minutesUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5902nanosecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m5904parseUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, false);
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException(h0.b("Invalid duration string format: '", value, "'."), e5);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m5905parseIsoStringUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, true);
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException(h0.b("Invalid ISO duration string format: '", value, "'."), e5);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m5906parseIsoStringOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m5809boximpl(DurationKt.access$parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m5907parseOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m5809boximpl(DurationKt.access$parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5909secondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5863getDaysUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5866getHoursUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5869getMicrosecondsUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5872getMillisecondsUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5875getMinutesUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5878getNanosecondsUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5881getSecondsUwyO8pc$annotations(int i10) {
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5885daysUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5891hoursUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5894microsecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5897millisecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5900minutesUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5903nanosecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5910secondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5864getDaysUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5867getHoursUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5870getMicrosecondsUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5873getMillisecondsUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5876getMinutesUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5879getNanosecondsUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5882getSecondsUwyO8pc$annotations(long j10) {
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5883daysUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5889hoursUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5892microsecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5895millisecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5898minutesUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5901nanosecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = SvgConstantsKt.VERSION)
        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m5908secondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }
    }

    public /* synthetic */ Duration(long j10) {
        this.f82384p0 = j10;
    }

    public static final long a(long j10, long j11) {
        long jAccess$nanosToMillis = DurationKt.access$nanosToMillis(j11);
        long j12 = j10 + jAccess$nanosToMillis;
        if (!new LongRange(-4611686018426L, 4611686018426L).contains(j12)) {
            return m5811constructorimpl((c.coerceIn(j12, -4611686018427387903L, DurationKt.MAX_MILLIS) << 1) + 1);
        }
        return DurationKt.b(DurationKt.access$millisToNanos(j12) + (j11 - DurationKt.access$millisToNanos(jAccess$nanosToMillis)));
    }

    public static final void b(StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strPadStart = StringsKt__StringsKt.padStart(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strPadStart, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strPadStart, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m5809boximpl(long j10) {
        return new Duration(j10);
    }

    public static final DurationUnit c(long j10) {
        return d(j10) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m5811constructorimpl(long j10) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (d(j10)) {
                long j11 = j10 >> 1;
                if (!new LongRange(-4611686018426999999L, DurationKt.MAX_NANOS).contains(j11)) {
                    throw new AssertionError(j11 + " ns is out of nanoseconds range");
                }
            } else {
                long j12 = j10 >> 1;
                if (!new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS).contains(j12)) {
                    throw new AssertionError(j12 + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(j12)) {
                    throw new AssertionError(j12 + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static final boolean d(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m5812divLRDsOJo(long j10, long j11) {
        DurationUnit durationUnit = (DurationUnit) f.maxOf(c(j10), c(j11));
        return m5849toDoubleimpl(j10, durationUnit) / m5849toDoubleimpl(j11, durationUnit);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m5814divUwyO8pc(long j10, int i10) {
        if (i10 == 0) {
            if (m5840isPositiveimpl(j10)) {
                return f82382r0;
            }
            if (m5839isNegativeimpl(j10)) {
                return f82383s0;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (d(j10)) {
            return DurationKt.b((j10 >> 1) / ((long) i10));
        }
        if (m5838isInfiniteimpl(j10)) {
            return m5844timesUwyO8pc(j10, mk.c.getSign(i10));
        }
        long j11 = j10 >> 1;
        long j12 = i10;
        long j13 = j11 / j12;
        if (!new LongRange(-4611686018426L, 4611686018426L).contains(j13)) {
            return m5811constructorimpl((j13 << 1) + 1);
        }
        return DurationKt.b(DurationKt.access$millisToNanos(j13) + (DurationKt.access$millisToNanos(j11 - (j13 * j12)) / j12));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5815equalsimpl(long j10, Object obj) {
        return (obj instanceof Duration) && j10 == ((Duration) obj).getF82384p0();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5816equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m5817getAbsoluteValueUwyO8pc(long j10) {
        return m5839isNegativeimpl(j10) ? m5859unaryMinusUwyO8pc(j10) : j10;
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m5818getHoursComponentimpl(long j10) {
        if (m5838isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m5827getInWholeHoursimpl(j10) % ((long) 24));
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m5826getInWholeDaysimpl(long j10) {
        return m5852toLongimpl(j10, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m5827getInWholeHoursimpl(long j10) {
        return m5852toLongimpl(j10, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m5828getInWholeMicrosecondsimpl(long j10) {
        return m5852toLongimpl(j10, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m5829getInWholeMillisecondsimpl(long j10) {
        return ((((int) j10) & 1) == 1 && m5837isFiniteimpl(j10)) ? j10 >> 1 : m5852toLongimpl(j10, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m5830getInWholeMinutesimpl(long j10) {
        return m5852toLongimpl(j10, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m5831getInWholeNanosecondsimpl(long j10) {
        long j11 = j10 >> 1;
        if (d(j10)) {
            return j11;
        }
        if (j11 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j11 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.access$millisToNanos(j11);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m5832getInWholeSecondsimpl(long j10) {
        return m5852toLongimpl(j10, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m5833getMinutesComponentimpl(long j10) {
        if (m5838isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m5830getInWholeMinutesimpl(j10) % ((long) 60));
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m5834getNanosecondsComponentimpl(long j10) {
        if (m5838isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) ((((int) j10) & 1) == 1 ? DurationKt.access$millisToNanos((j10 >> 1) % ((long) 1000)) : (j10 >> 1) % ((long) 1000000000));
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m5835getSecondsComponentimpl(long j10) {
        if (m5838isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m5832getInWholeSecondsimpl(j10) % ((long) 60));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5836hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m5837isFiniteimpl(long j10) {
        return !m5838isInfiniteimpl(j10);
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m5838isInfiniteimpl(long j10) {
        return j10 == f82382r0 || j10 == f82383s0;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m5839isNegativeimpl(long j10) {
        return j10 < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m5840isPositiveimpl(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m5841minusLRDsOJo(long j10, long j11) {
        return m5842plusLRDsOJo(j10, m5859unaryMinusUwyO8pc(j11));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m5842plusLRDsOJo(long j10, long j11) {
        if (m5838isInfiniteimpl(j10)) {
            if (m5837isFiniteimpl(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m5838isInfiniteimpl(j11)) {
            return j11;
        }
        int i10 = ((int) j10) & 1;
        if (i10 != (((int) j11) & 1)) {
            return i10 == 1 ? a(j10 >> 1, j11 >> 1) : a(j11 >> 1, j10 >> 1);
        }
        long j12 = (j10 >> 1) + (j11 >> 1);
        return d(j10) ? DurationKt.access$durationOfNanosNormalized(j12) : DurationKt.a(j12);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m5844timesUwyO8pc(long j10, int i10) {
        if (m5838isInfiniteimpl(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : m5859unaryMinusUwyO8pc(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f82381q0;
        }
        long j11 = j10 >> 1;
        long j12 = i10;
        long j13 = j11 * j12;
        boolean zD = d(j10);
        long j14 = f82383s0;
        long j15 = f82382r0;
        if (zD) {
            if (new LongRange(-2147483647L, 2147483647L).contains(j11)) {
                return DurationKt.b(j13);
            }
            if (j13 / j12 == j11) {
                return DurationKt.access$durationOfNanosNormalized(j13);
            }
            long jAccess$nanosToMillis = DurationKt.access$nanosToMillis(j11);
            long j16 = jAccess$nanosToMillis * j12;
            long jAccess$nanosToMillis2 = DurationKt.access$nanosToMillis((j11 - DurationKt.access$millisToNanos(jAccess$nanosToMillis)) * j12) + j16;
            if (j16 / j12 == jAccess$nanosToMillis && (jAccess$nanosToMillis2 ^ j16) >= 0) {
                return m5811constructorimpl((c.coerceIn(jAccess$nanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)) << 1) + 1);
            }
            if (mk.c.getSign(i10) * mk.c.getSign(j11) <= 0) {
                return j14;
            }
        } else {
            if (j13 / j12 == j11) {
                return m5811constructorimpl((c.coerceIn(j13, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)) << 1) + 1);
            }
            if (mk.c.getSign(i10) * mk.c.getSign(j11) <= 0) {
                return j14;
            }
        }
        return j15;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m5848toComponentsimpl(long j10, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m5826getInWholeDaysimpl(j10)), Integer.valueOf(m5818getHoursComponentimpl(j10)), Integer.valueOf(m5833getMinutesComponentimpl(j10)), Integer.valueOf(m5835getSecondsComponentimpl(j10)), Integer.valueOf(m5834getNanosecondsComponentimpl(j10)));
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m5849toDoubleimpl(long j10, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f82382r0) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f82383s0) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j10 >> 1, c(j10), unit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m5850toIntimpl(long j10, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) c.coerceIn(m5852toLongimpl(j10, unit), -2147483648L, 2147483647L);
    }

    @NotNull
    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m5851toIsoStringimpl(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (m5839isNegativeimpl(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM5817getAbsoluteValueUwyO8pc = m5817getAbsoluteValueUwyO8pc(j10);
        long jM5827getInWholeHoursimpl = m5827getInWholeHoursimpl(jM5817getAbsoluteValueUwyO8pc);
        int iM5833getMinutesComponentimpl = m5833getMinutesComponentimpl(jM5817getAbsoluteValueUwyO8pc);
        int iM5835getSecondsComponentimpl = m5835getSecondsComponentimpl(jM5817getAbsoluteValueUwyO8pc);
        int iM5834getNanosecondsComponentimpl = m5834getNanosecondsComponentimpl(jM5817getAbsoluteValueUwyO8pc);
        if (m5838isInfiniteimpl(j10)) {
            jM5827getInWholeHoursimpl = 9999999999999L;
        }
        boolean z10 = false;
        boolean z11 = jM5827getInWholeHoursimpl != 0;
        boolean z12 = (iM5835getSecondsComponentimpl == 0 && iM5834getNanosecondsComponentimpl == 0) ? false : true;
        if (iM5833getMinutesComponentimpl != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(jM5827getInWholeHoursimpl);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iM5833getMinutesComponentimpl);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            b(sb2, iM5835getSecondsComponentimpl, iM5834getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m5852toLongimpl(long j10, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f82382r0) {
            return Long.MAX_VALUE;
        }
        if (j10 == f82383s0) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j10 >> 1, c(j10), unit);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5855toStringimpl(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f82382r0) {
            return "Infinity";
        }
        if (j10 == f82383s0) {
            return "-Infinity";
        }
        boolean zM5839isNegativeimpl = m5839isNegativeimpl(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zM5839isNegativeimpl) {
            sb2.append('-');
        }
        long jM5817getAbsoluteValueUwyO8pc = m5817getAbsoluteValueUwyO8pc(j10);
        long jM5826getInWholeDaysimpl = m5826getInWholeDaysimpl(jM5817getAbsoluteValueUwyO8pc);
        int iM5818getHoursComponentimpl = m5818getHoursComponentimpl(jM5817getAbsoluteValueUwyO8pc);
        int iM5833getMinutesComponentimpl = m5833getMinutesComponentimpl(jM5817getAbsoluteValueUwyO8pc);
        int iM5835getSecondsComponentimpl = m5835getSecondsComponentimpl(jM5817getAbsoluteValueUwyO8pc);
        int iM5834getNanosecondsComponentimpl = m5834getNanosecondsComponentimpl(jM5817getAbsoluteValueUwyO8pc);
        int i10 = 0;
        boolean z10 = jM5826getInWholeDaysimpl != 0;
        boolean z11 = iM5818getHoursComponentimpl != 0;
        boolean z12 = iM5833getMinutesComponentimpl != 0;
        boolean z13 = (iM5835getSecondsComponentimpl == 0 && iM5834getNanosecondsComponentimpl == 0) ? false : true;
        if (z10) {
            sb2.append(jM5826getInWholeDaysimpl);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM5818getHoursComponentimpl);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM5833getMinutesComponentimpl);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iM5835getSecondsComponentimpl != 0 || z10 || z11 || z12) {
                b(sb2, iM5835getSecondsComponentimpl, iM5834getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM5834getNanosecondsComponentimpl >= 1000000) {
                b(sb2, iM5834getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, iM5834getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (iM5834getNanosecondsComponentimpl >= 1000) {
                b(sb2, iM5834getNanosecondsComponentimpl / 1000, iM5834getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb2.append(iM5834getNanosecondsComponentimpl);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zM5839isNegativeimpl && i10 > 1) {
            sb2.insert(1, RootService.OPEN_BRACKET).append(RootService.CLOSE_BRACKET);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m5857toStringimpl$default(long j10, DurationUnit durationUnit, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m5856toStringimpl(j10, durationUnit, i10);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m5858truncateToUwyO8pc$kotlin_stdlib(long j10, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnitC = c(j10);
        if (unit.compareTo(durationUnitC) <= 0 || m5838isInfiniteimpl(j10)) {
            return j10;
        }
        long j11 = j10 >> 1;
        return DurationKt.toDuration(j11 - (j11 % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, durationUnitC)), durationUnitC);
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m5859unaryMinusUwyO8pc(long j10) {
        return m5811constructorimpl(((-(j10 >> 1)) << 1) + ((long) (((int) j10) & 1)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m5860compareToLRDsOJo(duration.getF82384p0());
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m5860compareToLRDsOJo(long j10) {
        return m5810compareToLRDsOJo(this.f82384p0, j10);
    }

    public boolean equals(Object obj) {
        return m5815equalsimpl(this.f82384p0, obj);
    }

    public int hashCode() {
        return m5836hashCodeimpl(this.f82384p0);
    }

    @NotNull
    public String toString() {
        return m5855toStringimpl(this.f82384p0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF82384p0() {
        return this.f82384p0;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m5810compareToLRDsOJo(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.compare(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m5839isNegativeimpl(j10) ? -i10 : i10;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m5847toComponentsimpl(long j10, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m5827getInWholeHoursimpl(j10)), Integer.valueOf(m5833getMinutesComponentimpl(j10)), Integer.valueOf(m5835getSecondsComponentimpl(j10)), Integer.valueOf(m5834getNanosecondsComponentimpl(j10)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m5846toComponentsimpl(long j10, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m5830getInWholeMinutesimpl(j10)), Integer.valueOf(m5835getSecondsComponentimpl(j10)), Integer.valueOf(m5834getNanosecondsComponentimpl(j10)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m5845toComponentsimpl(long j10, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m5832getInWholeSecondsimpl(j10)), Integer.valueOf(m5834getNanosecondsComponentimpl(j10)));
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m5813divUwyO8pc(long j10, double d2) {
        int iRoundToInt = mk.c.roundToInt(d2);
        if (iRoundToInt == d2 && iRoundToInt != 0) {
            return m5814divUwyO8pc(j10, iRoundToInt);
        }
        DurationUnit durationUnitC = c(j10);
        return DurationKt.toDuration(m5849toDoubleimpl(j10, durationUnitC) / d2, durationUnitC);
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = SvgConstantsKt.VERSION)
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m5843timesUwyO8pc(long j10, double d2) {
        int iRoundToInt = mk.c.roundToInt(d2);
        if (iRoundToInt == d2) {
            return m5844timesUwyO8pc(j10, iRoundToInt);
        }
        DurationUnit durationUnitC = c(j10);
        return DurationKt.toDuration(m5849toDoubleimpl(j10, durationUnitC) * d2, durationUnitC);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m5856toStringimpl(long j10, @NotNull DurationUnit unit, int i10) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i10 >= 0) {
            double dM5849toDoubleimpl = m5849toDoubleimpl(j10, unit);
            if (Double.isInfinite(dM5849toDoubleimpl)) {
                return String.valueOf(dM5849toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(dM5849toDoubleimpl, c.coerceAtMost(i10, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(g0.c("decimals must be not negative, but was ", i10).toString());
    }
}

package kotlin;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = SvgConstantsKt.VERSION)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0011\u0092\u0001\u00020\u0010¨\u0006\u0015"}, d2 = {"Lkotlin/UByte;", "", "", "toString-impl", "(B)Ljava/lang/String;", "toString", "", "hashCode-impl", "(B)I", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals-impl", "(BLjava/lang/Object;)Z", "equals", "", "data", "constructor-impl", "(B)B", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UByte implements Comparable<UByte> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte f79395p0;

    /* JADX INFO: compiled from: UByte.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ UByte(byte b10) {
        this.f79395p0 = b10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m5544boximpl(byte b10) {
        return new UByte(b10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5546equalsimpl(byte b10, Object obj) {
        return (obj instanceof UByte) && b10 == ((UByte) obj).getF79395p0();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5547equalsimpl0(byte b10, byte b11) {
        return b10 == b11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5549toStringimpl(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getF79395p0() & 255, uByte.getF79395p0() & 255);
    }

    public boolean equals(Object obj) {
        return m5546equalsimpl(this.f79395p0, obj);
    }

    public int hashCode() {
        return m5548hashCodeimpl(this.f79395p0);
    }

    @NotNull
    public String toString() {
        return m5549toStringimpl(this.f79395p0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte getF79395p0() {
        return this.f79395p0;
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m5545constructorimpl(byte b10) {
        return b10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5548hashCodeimpl(byte b10) {
        return b10;
    }
}

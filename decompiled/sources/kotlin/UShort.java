package kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = SvgConstantsKt.VERSION)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0011\u0092\u0001\u00020\u0010¨\u0006\u0015"}, d2 = {"Lkotlin/UShort;", "", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "", "hashCode-impl", "(S)I", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals-impl", "(SLjava/lang/Object;)Z", "equals", "", "data", "constructor-impl", "(S)S", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UShort implements Comparable<UShort> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final short f79407p0;

    /* JADX INFO: compiled from: UShort.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", ExifInterface.LATITUDE_SOUTH, "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ UShort(short s4) {
        this.f79407p0 = s4;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m5619boximpl(short s4) {
        return new UShort(s4);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5621equalsimpl(short s4, Object obj) {
        return (obj instanceof UShort) && s4 == ((UShort) obj).getF79407p0();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5622equalsimpl0(short s4, short s7) {
        return s4 == s7;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5624toStringimpl(short s4) {
        return String.valueOf(s4 & MAX_VALUE);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getF79407p0() & MAX_VALUE, uShort.getF79407p0() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m5621equalsimpl(this.f79407p0, obj);
    }

    public int hashCode() {
        return m5623hashCodeimpl(this.f79407p0);
    }

    @NotNull
    public String toString() {
        return m5624toStringimpl(this.f79407p0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getF79407p0() {
        return this.f79407p0;
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m5620constructorimpl(short s4) {
        return s4;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5623hashCodeimpl(short s4) {
        return s4;
    }
}

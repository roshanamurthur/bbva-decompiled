package androidx.compose.ui.unit;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "type", "constructor-impl", "(J)J", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class TextUnitType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18323b = m4596constructorimpl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f18324c = m4596constructorimpl(SvgConstantsKt.SPECIFIED_SOLID_OPACITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f18325d = m4596constructorimpl(SvgConstantsKt.SPECIFIED_VIEWPORT_FILL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18326a;

    /* JADX INFO: compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType$Companion;", "", "()V", "Em", "Landroidx/compose/ui/unit/TextUnitType;", "getEm-UIouoOA", "()J", "J", "Sp", "getSp-UIouoOA", "Unspecified", "getUnspecified-UIouoOA", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m4602getEmUIouoOA() {
            return TextUnitType.f18325d;
        }

        /* JADX INFO: renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m4603getSpUIouoOA() {
            return TextUnitType.f18324c;
        }

        /* JADX INFO: renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m4604getUnspecifiedUIouoOA() {
            return TextUnitType.f18323b;
        }
    }

    public /* synthetic */ TextUnitType(long j10) {
        this.f18326a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m4595boximpl(long j10) {
        return new TextUnitType(j10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4597equalsimpl(long j10, Object obj) {
        return (obj instanceof TextUnitType) && j10 == ((TextUnitType) obj).getF18326a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4598equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4599hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4600toStringimpl(long j10) {
        if (m4598equalsimpl0(j10, f18323b)) {
            return "Unspecified";
        }
        if (m4598equalsimpl0(j10, f18324c)) {
            return "Sp";
        }
        return m4598equalsimpl0(j10, f18325d) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4597equalsimpl(this.f18326a, obj);
    }

    public int hashCode() {
        return m4599hashCodeimpl(this.f18326a);
    }

    @NotNull
    public String toString() {
        return m4600toStringimpl(this.f18326a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF18326a() {
        return this.f18326a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4596constructorimpl(long j10) {
        return j10;
    }
}

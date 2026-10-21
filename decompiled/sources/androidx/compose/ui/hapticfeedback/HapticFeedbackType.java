package androidx.compose.ui.hapticfeedback;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HapticFeedbackType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class HapticFeedbackType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16162a;

    /* JADX INFO: compiled from: HapticFeedbackType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nø\u0001\u0000R\u001a\u0010\u0003\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "()V", "LongPress", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getLongPress-5zf0vsI", "()I", "TextHandleMove", "getTextHandleMove-5zf0vsI", "values", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m3039getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3041getLongPress5zf0vsI();
        }

        /* JADX INFO: renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m3040getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3042getTextHandleMove5zf0vsI();
        }

        @NotNull
        public final List<HapticFeedbackType> values() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new HapticFeedbackType[]{HapticFeedbackType.m3032boximpl(m3039getLongPress5zf0vsI()), HapticFeedbackType.m3032boximpl(m3040getTextHandleMove5zf0vsI())});
        }
    }

    public /* synthetic */ HapticFeedbackType(int i10) {
        this.f16162a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m3032boximpl(int i10) {
        return new HapticFeedbackType(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3034equalsimpl(int i10, Object obj) {
        return (obj instanceof HapticFeedbackType) && i10 == ((HapticFeedbackType) obj).getF16162a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3035equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3037toStringimpl(int i10) {
        Companion companion = INSTANCE;
        if (m3035equalsimpl0(i10, companion.m3039getLongPress5zf0vsI())) {
            return "LongPress";
        }
        return m3035equalsimpl0(i10, companion.m3040getTextHandleMove5zf0vsI()) ? "TextHandleMove" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3034equalsimpl(this.f16162a, obj);
    }

    public int hashCode() {
        return m3036hashCodeimpl(this.f16162a);
    }

    @NotNull
    public String toString() {
        return m3037toStringimpl(this.f16162a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF16162a() {
        return this.f16162a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3033constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3036hashCodeimpl(int i10) {
        return i10;
    }
}

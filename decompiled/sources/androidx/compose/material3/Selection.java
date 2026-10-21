package androidx.compose.material3;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/Selection;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "value", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class Selection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11266b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int value;

    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material3/Selection$Companion;", "", "()V", "Hour", "Landroidx/compose/material3/Selection;", "getHour-JiIwxys", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Minute", "getMinute-JiIwxys", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHour-JiIwxys, reason: not valid java name */
        public final int m1241getHourJiIwxys() {
            return Selection.access$getHour$cp();
        }

        /* JADX INFO: renamed from: getMinute-JiIwxys, reason: not valid java name */
        public final int m1242getMinuteJiIwxys() {
            return Selection.f11266b;
        }
    }

    public /* synthetic */ Selection(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ int access$getHour$cp() {
        return 0;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Selection m1235boximpl(int i10) {
        return new Selection(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1236equalsimpl(int i10, Object obj) {
        return (obj instanceof Selection) && i10 == ((Selection) obj).m1240unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1237equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1239toStringimpl(int i10) {
        return androidx.collection.g.a("Selection(value=", i10, RootService.CLOSE_BRACKET);
    }

    public boolean equals(Object obj) {
        return m1236equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1238hashCodeimpl(this.value);
    }

    public String toString() {
        return m1239toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1240unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1238hashCodeimpl(int i10) {
        return i10;
    }
}

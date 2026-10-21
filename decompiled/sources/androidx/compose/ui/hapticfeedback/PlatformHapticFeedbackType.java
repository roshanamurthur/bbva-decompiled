package androidx.compose.ui.hapticfeedback;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformHapticFeedback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;", "", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLongPress-5zf0vsI", "()I", "LongPress", "b", "getTextHandleMove-5zf0vsI", "TextHandleMove", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class PlatformHapticFeedbackType {

    @NotNull
    public static final PlatformHapticFeedbackType INSTANCE = new PlatformHapticFeedbackType();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final int LongPress = HapticFeedbackType.m3033constructorimpl(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int TextHandleMove = HapticFeedbackType.m3033constructorimpl(9);

    /* JADX INFO: renamed from: getLongPress-5zf0vsI, reason: not valid java name */
    public final int m3041getLongPress5zf0vsI() {
        return LongPress;
    }

    /* JADX INFO: renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
    public final int m3042getTextHandleMove5zf0vsI() {
        return TextHandleMove;
    }
}

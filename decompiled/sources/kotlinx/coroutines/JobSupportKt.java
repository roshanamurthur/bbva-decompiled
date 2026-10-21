package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"", "boxIncomplete", "unboxState", "Lkotlinx/coroutines/internal/Symbol;", "COMPLETING_ALREADY", "Lkotlinx/coroutines/internal/Symbol;", "COMPLETING_WAITING_CHILDREN", "COMPLETING_RETRY", "TOO_LATE_TO_CANCEL", "SEALED", "Lkotlinx/coroutines/Empty;", "EMPTY_NEW", "Lkotlinx/coroutines/Empty;", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
public final class JobSupportKt {

    @NotNull
    private static final Symbol COMPLETING_ALREADY = new Symbol("COMPLETING_ALREADY");

    @JvmField
    @NotNull
    public static final Symbol COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");

    @NotNull
    private static final Symbol COMPLETING_RETRY = new Symbol("COMPLETING_RETRY");

    @NotNull
    private static final Symbol TOO_LATE_TO_CANCEL = new Symbol("TOO_LATE_TO_CANCEL");

    @NotNull
    private static final Symbol SEALED = new Symbol("SEALED");

    @NotNull
    private static final Empty EMPTY_NEW = new Empty(false);

    @NotNull
    private static final Empty EMPTY_ACTIVE = new Empty(true);

    @Nullable
    public static final Object boxIncomplete(@Nullable Object obj) {
        return obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
    }

    @Nullable
    public static final Object unboxState(@Nullable Object obj) {
        Incomplete incomplete;
        IncompleteStateBox incompleteStateBox = obj instanceof IncompleteStateBox ? (IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.state) == null) ? obj : incomplete;
    }
}

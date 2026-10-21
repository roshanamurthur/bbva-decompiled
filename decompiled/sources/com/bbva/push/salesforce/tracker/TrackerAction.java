package com.bbva.push.salesforce.tracker;

import androidx.camera.core.processing.f;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.bbva.push.salesforce.tracker.TrackerAction[], still in use, count: 1, list:
  (r1v1 com.bbva.push.salesforce.tracker.TrackerAction[]) from 0x000f: INVOKE (r1v1 com.bbva.push.salesforce.tracker.TrackerAction[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:16)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: TrackerAction.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/push/salesforce/tracker/TrackerAction;", "", "", "action", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "Companion", "ACTION_OPEN", "salesforce-push_release"}, k = 1, mv = {1, 9, 0})
public final class TrackerAction {
    ACTION_OPEN;

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String action;

    /* JADX INFO: compiled from: TrackerAction.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/push/salesforce/tracker/TrackerAction$Companion;", "", "()V", "from", "Lcom/bbva/push/salesforce/tracker/TrackerAction;", "value", "", "salesforce-push_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTrackerAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackerAction.kt\ncom/bbva/push/salesforce/tracker/TrackerAction$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n288#2,2:14\n1#3:16\n*S KotlinDebug\n*F\n+ 1 TrackerAction.kt\ncom/bbva/push/salesforce/tracker/TrackerAction$Companion\n*L\n8#1:14,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrackerAction from(@NotNull String value) {
            TrackerAction next;
            TrackerAction trackerAction;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<TrackerAction> it = TrackerAction.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                trackerAction = next;
                if (Intrinsics.areEqual(trackerAction.name(), value)) {
                    break;
                }
            } while (!Intrinsics.areEqual(trackerAction.getAction(), value));
            TrackerAction trackerAction2 = next;
            if (trackerAction2 != null) {
                return trackerAction2;
            }
            throw new IllegalArgumentException(f.d("No action from ", value));
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new TrackerAction[]{r0});
    }

    public TrackerAction() {
        super("ACTION_OPEN", 0);
        this.action = TrackMessageOpenedCommand.ACTION;
    }

    @NotNull
    public static EnumEntries<TrackerAction> getEntries() {
        return $ENTRIES;
    }

    public static TrackerAction valueOf(String str) {
        return (TrackerAction) Enum.valueOf(TrackerAction.class, str);
    }

    public static TrackerAction[] values() {
        return (TrackerAction[]) $VALUES.clone();
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }
}

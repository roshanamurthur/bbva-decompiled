package com.bbva.notifications.constants;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 com.bbva.notifications.constants.ActionId[], still in use, count: 1, list:
  (r4v3 com.bbva.notifications.constants.ActionId[]) from 0x002f: INVOKE (r4v3 com.bbva.notifications.constants.ActionId[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:48)
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
/* JADX INFO: compiled from: PushConstants.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/constants/ActionId;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "EVENT_ID", "ID_TRACK", "DEEPLINK", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ActionId {
    EVENT_ID("eventId"),
    ID_TRACK("idTrack"),
    DEEPLINK("deeplink");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    /* JADX INFO: compiled from: PushConstants.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/notifications/constants/ActionId$Companion;", "", "()V", "values", "", "", "getValues", "()[Ljava/lang/String;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPushConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushConstants.kt\ncom/bbva/notifications/constants/ActionId$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,88:1\n11065#2:89\n11400#2,3:90\n37#3,2:93\n*S KotlinDebug\n*F\n+ 1 PushConstants.kt\ncom/bbva/notifications/constants/ActionId$Companion\n*L\n46#1:89\n46#1:90,3\n46#1:93,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getValues() {
            ActionId[] actionIdArrValues = ActionId.values();
            ArrayList arrayList = new ArrayList(actionIdArrValues.length);
            for (ActionId actionId : actionIdArrValues) {
                arrayList.add(actionId.getValue());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new ActionId[]{r0, r1, r2});
    }

    public ActionId(String str) {
        super(str, i);
        this.value = str;
    }

    @NotNull
    public static EnumEntries<ActionId> getEntries() {
        return $ENTRIES;
    }

    public static ActionId valueOf(String str) {
        return (ActionId) Enum.valueOf(ActionId.class, str);
    }

    public static ActionId[] values() {
        return (ActionId[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

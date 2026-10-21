package com.bbva.notifications.constants;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 com.bbva.notifications.constants.NotificationAction[], still in use, count: 1, list:
  (r3v3 com.bbva.notifications.constants.NotificationAction[]) from 0x0021: INVOKE (r3v3 com.bbva.notifications.constants.NotificationAction[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:34)
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\u000b\u0010\nj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/notifications/constants/NotificationAction;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "", "isDeeplink", "Z", "()Z", "isAvailableInPublicZone", "Companion", "CALL_BBVA", "REMOTE_BANKER", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class NotificationAction {
    CALL_BBVA("callBBVA"),
    REMOTE_BANKER("A000000743");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isAvailableInPublicZone;
    private final boolean isDeeplink;

    @NotNull
    private final String value;

    /* JADX INFO: compiled from: PushConstants.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/notifications/constants/NotificationAction$Companion;", "", "()V", "fromValue", "Lcom/bbva/notifications/constants/NotificationAction;", "value", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPushConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushConstants.kt\ncom/bbva/notifications/constants/NotificationAction$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final NotificationAction fromValue(@Nullable String value) {
            for (NotificationAction notificationAction : NotificationAction.values()) {
                if (Intrinsics.areEqual(notificationAction.getValue(), value)) {
                    return notificationAction;
                }
            }
            return null;
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new NotificationAction[]{r0, r1});
    }

    public NotificationAction(String str) {
        super(str, i);
        this.value = str;
        this.isDeeplink = false;
        this.isAvailableInPublicZone = false;
    }

    @NotNull
    public static EnumEntries<NotificationAction> getEntries() {
        return $ENTRIES;
    }

    public static NotificationAction valueOf(String str) {
        return (NotificationAction) Enum.valueOf(NotificationAction.class, str);
    }

    public static NotificationAction[] values() {
        return (NotificationAction[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: isAvailableInPublicZone, reason: from getter */
    public final boolean getIsAvailableInPublicZone() {
        return this.isAvailableInPublicZone;
    }

    /* JADX INFO: renamed from: isDeeplink, reason: from getter */
    public final boolean getIsDeeplink() {
        return this.isDeeplink;
    }
}

package com.bbva.glomohybrid.logs;

import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 com.bbva.glomohybrid.logs.LogHandlers[], still in use, count: 1, list:
  (r4v3 com.bbva.glomohybrid.logs.LogHandlers[]) from 0x002f: INVOKE (r4v3 com.bbva.glomohybrid.logs.LogHandlers[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:48)
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
/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/logs/LogHandlers;", "", "", "handlerID", "Ljava/lang/String;", "getHandlerID", "()Ljava/lang/String;", "Companion", "Default", "Semaas", "Crashlytics", "glomo-logs_release"}, k = 1, mv = {1, 9, 0})
public final class LogHandlers {
    Default("default"),
    Semaas("com.bbva.semaas"),
    Crashlytics(CrashlyticsHandler.ID);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String handlerID;

    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/logs/LogHandlers$Companion;", "", "()V", "handlerIds", "", "", "handlers", "Lcom/bbva/glomohybrid/logs/LogHandlers;", "glomo-logs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/bbva/glomohybrid/logs/LogHandlers$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1549#2:115\n1620#2,3:116\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/bbva/glomohybrid/logs/LogHandlers$Companion\n*L\n23#1:115\n23#1:116,3\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> handlerIds(@NotNull List<? extends LogHandlers> handlers) {
            Intrinsics.checkNotNullParameter(handlers, "handlers");
            List<? extends LogHandlers> list = handlers;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((LogHandlers) it.next()).getHandlerID());
            }
            return arrayList;
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new LogHandlers[]{r0, r1, r2});
    }

    public LogHandlers(String str) {
        super(str, i);
        this.handlerID = str;
    }

    @NotNull
    public static EnumEntries<LogHandlers> getEntries() {
        return $ENTRIES;
    }

    public static LogHandlers valueOf(String str) {
        return (LogHandlers) Enum.valueOf(LogHandlers.class, str);
    }

    public static LogHandlers[] values() {
        return (LogHandlers[]) $VALUES.clone();
    }

    @NotNull
    public final String getHandlerID() {
        return this.handlerID;
    }
}

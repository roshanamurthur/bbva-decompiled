package com.bbva.glomohybrid.logs.extensions;

import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherLoggerExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {LogKeysKt.LOG, "", "Lcom/bbva/ethermobile/elogger/EtherLogger;", "origin", "", "handlerId", "", "loggerLevel", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "loggableItem", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "glomo-logs_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEtherLoggerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherLoggerExtensions.kt\ncom/bbva/glomohybrid/logs/extensions/EtherLoggerExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1855#2,2:21\n*S KotlinDebug\n*F\n+ 1 EtherLoggerExtensions.kt\ncom/bbva/glomohybrid/logs/extensions/EtherLoggerExtensionsKt\n*L\n17#1:21,2\n*E\n"})
public final class EtherLoggerExtensionsKt {
    public static final void log(@NotNull EtherLogger etherLogger, @Nullable String str, @Nullable List<String> list, @NotNull LoggerLevel loggerLevel, @NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(etherLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggerLevel, "loggerLevel");
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            EtherLogger.log$default(etherLogger, str, null, loggerLevel, loggableItem, 2, null);
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            etherLogger.log(str, (String) it.next(), loggerLevel, loggableItem);
        }
    }

    public static /* synthetic */ void log$default(EtherLogger etherLogger, String str, List list, LoggerLevel loggerLevel, LoggableItem loggableItem, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            loggerLevel = LoggerLevel.VERBOSE;
        }
        log(etherLogger, str, list, loggerLevel, loggableItem);
    }
}

package com.bbva.ethermobile.elogger;

import androidx.webkit.ProxyConfig;
import bk.d;
import com.bbva.ethermobile.elogger.model.ErrorPayload;
import com.bbva.ethermobile.elogger.p000default.LocalTracer;
import com.bbva.ethermobile.elogger.p000default.LocalTracerConfig;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherLogger.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u001c\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobile/elogger/EtherLogger;", "", "", "origin", "handlerId", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "loggerLevel", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "loggableItem", "", LogKeysKt.LOG, "Lcom/bbva/ethermobile/elogger/model/ErrorPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "logError", "", "Lcom/bbva/ethermobile/elogger/LoggerHandler;", "associatedHandlers", "installCustomLogger", LogKeysKt.TAG, "installDefaultLogger", "<init>", "()V", "elogger_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEtherLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherLogger.kt\ncom/bbva/ethermobile/elogger/EtherLogger\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n526#2:67\n511#2,6:68\n766#3:74\n857#3,2:75\n766#3:77\n857#3,2:78\n1855#3,2:80\n*S KotlinDebug\n*F\n+ 1 EtherLogger.kt\ncom/bbva/ethermobile/elogger/EtherLogger\n*L\n25#1:67\n25#1:68,6\n31#1:74\n31#1:75,2\n34#1:77\n34#1:78,2\n37#1:80,2\n*E\n"})
public final class EtherLogger {

    @NotNull
    public static final EtherLogger INSTANCE = new EtherLogger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, List<LoggerHandler>> f29245a = new ConcurrentHashMap<>();

    public static /* synthetic */ void installDefaultLogger$default(EtherLogger etherLogger, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ELogger";
        }
        etherLogger.installDefaultLogger(str);
    }

    public static /* synthetic */ void log$default(EtherLogger etherLogger, String str, String str2, LoggerLevel loggerLevel, LoggableItem loggableItem, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            loggerLevel = LoggerLevel.VERBOSE;
        }
        etherLogger.log(str, str2, loggerLevel, loggableItem);
    }

    @NotNull
    public final EtherLogger installCustomLogger(@NotNull String origin, @NotNull List<? extends LoggerHandler> associatedHandlers) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(associatedHandlers, "associatedHandlers");
        associatedHandlers.isEmpty();
        f29245a.put(origin, associatedHandlers);
        return this;
    }

    public final void installDefaultLogger(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        INSTANCE.installCustomLogger(ProxyConfig.MATCH_ALL_SCHEMES, d.listOf(new DefaultLoggerHandler(new LocalTracer(new LocalTracerConfig(tag, true)))));
    }

    public final void log(@Nullable String origin, @Nullable String handlerId, @NotNull LoggerLevel loggerLevel, @NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggerLevel, "loggerLevel");
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        ConcurrentHashMap<String, List<LoggerHandler>> concurrentHashMap = f29245a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<LoggerHandler>> entry : concurrentHashMap.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), ProxyConfig.MATCH_ALL_SCHEMES) || origin == null || l.startsWith$default(origin, entry.getKey(), false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List listFlatten = CollectionsKt__IterablesKt.flatten(linkedHashMap.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFlatten) {
            LoggerHandler loggerHandler = (LoggerHandler) obj;
            if (handlerId == null || Intrinsics.areEqual(loggerHandler.getHandlerID(), handlerId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (loggerLevel.ordinal() >= ((LoggerHandler) obj2).getLoggerLevel().ordinal()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((LoggerHandler) it.next()).executeTrace(loggableItem);
        }
    }

    public final void logError(@NotNull String origin, @NotNull ErrorPayload payload) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(payload, "payload");
        log$default(this, origin, null, LoggerLevel.ERROR, new LoggableItem(payload.toMap()), 2, null);
    }
}

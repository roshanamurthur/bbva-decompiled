package com.bbva.glomo.semaas;

import bk.q;
import bk.v;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.ethermobile.elogger.LoggerHandler;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomo.semaas.span.SpanIdProvider;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.glomoutils.time.TimeProvider;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemaasLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B!\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/bbva/glomo/semaas/SemaasLogger;", "Lcom/bbva/ethermobile/elogger/LoggerHandler;", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "loggableItem", "", "isAbleToSend", "", LogKeysKt.LOG, "Lcom/bbva/glomo/semaas/LogPolicy;", "d", "Lcom/bbva/glomo/semaas/LogPolicy;", "getLogPolicy", "()Lcom/bbva/glomo/semaas/LogPolicy;", "setLogPolicy", "(Lcom/bbva/glomo/semaas/LogPolicy;)V", "logPolicy", "", "Lcom/bbva/glomo/semaas/FilterLogLevel;", "e", "Ljava/util/Set;", "getFilterLogLevels", "()Ljava/util/Set;", "setFilterLogLevels", "(Ljava/util/Set;)V", "filterLogLevels", "", "getHandlerID", "()Ljava/lang/String;", "handlerID", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "getLoggerLevel", "()Lcom/bbva/ethermobile/elogger/LoggerLevel;", "loggerLevel", "Lcom/bbva/glomo/semaas/SemaasDataSource;", "semaasDataSource", "Lcom/bbva/glomo/semaas/span/SpanIdProvider;", "spanIdProvider", "Lcom/bbva/glomoutils/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/bbva/glomo/semaas/SemaasDataSource;Lcom/bbva/glomo/semaas/span/SpanIdProvider;Lcom/bbva/glomoutils/time/TimeProvider;)V", "Companion", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSemaasLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemaasLogger.kt\ncom/bbva/glomo/semaas/SemaasLogger\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n*L\n1#1,104:1\n12#2:105\n12#2:106\n12#2:107\n12#2:108\n12#2:109\n12#2:110\n12#2:111\n12#2:112\n*S KotlinDebug\n*F\n+ 1 SemaasLogger.kt\ncom/bbva/glomo/semaas/SemaasLogger\n*L\n27#1:105\n49#1:106\n50#1:107\n51#1:108\n60#1:109\n61#1:110\n62#1:111\n63#1:112\n*E\n"})
public final class SemaasLogger extends LoggerHandler {

    @NotNull
    public static final String ID = "com.bbva.semaas";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SemaasDataSource f30737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SpanIdProvider f30738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TimeProvider f30739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LogPolicy logPolicy;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Set<? extends FilterLogLevel> filterLogLevels;

    /* JADX INFO: compiled from: SemaasLogger.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggerLevel.values().length];
            try {
                iArr[LoggerLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggerLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggerLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggerLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoggerLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoggerLevel.WTF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SemaasLogger(SemaasDataSource semaasDataSource, SpanIdProvider spanIdProvider, TimeProvider timeProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(semaasDataSource, spanIdProvider, (i10 & 4) != 0 ? new TimeProvider() : timeProvider);
    }

    @NotNull
    public final Set<FilterLogLevel> getFilterLogLevels() {
        return this.filterLogLevels;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public String getHandlerID() {
        return "com.bbva.semaas";
    }

    @NotNull
    public final LogPolicy getLogPolicy() {
        return this.logPolicy;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    @NotNull
    public LoggerLevel getLoggerLevel() {
        return LoggerLevel.VERBOSE;
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public boolean isAbleToSend(@NotNull LoggableItem loggableItem) {
        FilterLogLevel filterLogLevel;
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        Map<String, Object> payload = loggableItem.getPayload();
        Integer numValueOf = Integer.valueOf(LoggerLevel.VERBOSE.ordinal());
        Object obj = payload.get("level");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            numValueOf = num;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[LoggerLevel.INSTANCE.from(numValueOf.intValue()).ordinal()]) {
            case 1:
                filterLogLevel = FilterLogLevel.All;
                break;
            case 2:
                filterLogLevel = FilterLogLevel.Debug;
                break;
            case 3:
                filterLogLevel = FilterLogLevel.Info;
                break;
            case 4:
                filterLogLevel = FilterLogLevel.Warn;
                break;
            case 5:
                filterLogLevel = FilterLogLevel.Error;
                break;
            case 6:
                filterLogLevel = FilterLogLevel.Fatal;
                break;
            default:
                filterLogLevel = FilterLogLevel.Off;
                break;
        }
        return this.logPolicy.allowsLog(filterLogLevel, this.filterLogLevels);
    }

    @Override // com.bbva.ethermobile.elogger.LoggerHandler
    public void log(@NotNull LoggableItem loggableItem) {
        OmegaLogLevel omegaLogLevel;
        Intrinsics.checkNotNullParameter(loggableItem, "loggableItem");
        boolean zAreEqual = Intrinsics.areEqual(loggableItem.getPayload().get("type"), LogKeysKt.TRACE);
        TimeProvider timeProvider = this.f30739c;
        SpanIdProvider spanIdProvider = this.f30738b;
        if (zAreEqual) {
            Map<String, Object> payload = loggableItem.getPayload();
            SemaasDataSource semaasDataSource = this.f30737a;
            String spanId = spanIdProvider.getSpanId();
            Object obj = payload.get("name");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            String str2 = str == null ? "" : str;
            Long lValueOf = Long.valueOf(timeProvider.getNanoTime());
            Object obj2 = payload.get(LogKeysKt.START_DATE);
            if (!(obj2 instanceof Long)) {
                obj2 = null;
            }
            Long l6 = (Long) obj2;
            if (l6 != null) {
                lValueOf = l6;
            }
            long jLongValue = lValueOf.longValue();
            Long lValueOf2 = Long.valueOf(timeProvider.getNanoTime());
            Object obj3 = payload.get(LogKeysKt.END_DATE);
            if (!(obj3 instanceof Long)) {
                obj3 = null;
            }
            Long l7 = (Long) obj3;
            if (l7 != null) {
                lValueOf2 = l7;
            }
            long jLongValue2 = lValueOf2.longValue();
            Map<String, String> mapEmptyMap = q.emptyMap();
            Object obj4 = payload.get(LogKeysKt.PROPERTIES);
            Map<String, String> map = (Map) (obj4 instanceof Map ? obj4 : null);
            semaasDataSource.sendRhoEvent(spanId, str2, jLongValue, jLongValue2, map == null ? mapEmptyMap : map);
            return;
        }
        Map<String, Object> payload2 = loggableItem.getPayload();
        SemaasDataSource semaasDataSource2 = this.f30737a;
        String spanId2 = spanIdProvider.getSpanId();
        long nanoTime = timeProvider.getNanoTime();
        Integer numValueOf = Integer.valueOf(LoggerLevel.INFO.ordinal());
        Object obj5 = payload2.get("level");
        if (!(obj5 instanceof Integer)) {
            obj5 = null;
        }
        Integer num = (Integer) obj5;
        if (num != null) {
            numValueOf = num;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[LoggerLevel.INSTANCE.from(numValueOf.intValue()).ordinal()]) {
            case 1:
                omegaLogLevel = OmegaLogLevel.TRACE;
                break;
            case 2:
                omegaLogLevel = OmegaLogLevel.DEBUG;
                break;
            case 3:
                omegaLogLevel = OmegaLogLevel.INFO;
                break;
            case 4:
                omegaLogLevel = OmegaLogLevel.WARNING;
                break;
            case 5:
            case 6:
                omegaLogLevel = OmegaLogLevel.ERROR;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String strName = omegaLogLevel.name();
        Object obj6 = payload2.get("message");
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        String str3 = (String) obj6;
        String str4 = str3 == null ? "" : str3;
        Map<String, String> mapEmptyMap2 = q.emptyMap();
        Object obj7 = payload2.get(LogKeysKt.PROPERTIES);
        Map<String, String> map2 = (Map) (obj7 instanceof Map ? obj7 : null);
        semaasDataSource2.sendOmegaEvent(spanId2, nanoTime, strName, str4, map2 == null ? mapEmptyMap2 : map2);
    }

    public final void setFilterLogLevels(@NotNull Set<? extends FilterLogLevel> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.filterLogLevels = set;
    }

    public final void setLogPolicy(@NotNull LogPolicy logPolicy) {
        Intrinsics.checkNotNullParameter(logPolicy, "<set-?>");
        this.logPolicy = logPolicy;
    }

    public SemaasLogger(@NotNull SemaasDataSource semaasDataSource, @NotNull SpanIdProvider spanIdProvider, @NotNull TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(semaasDataSource, "semaasDataSource");
        Intrinsics.checkNotNullParameter(spanIdProvider, "spanIdProvider");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f30737a = semaasDataSource;
        this.f30738b = spanIdProvider;
        this.f30739c = timeProvider;
        this.logPolicy = LogPolicy.Fixed;
        this.filterLogLevels = v.setOf(FilterLogLevel.Off);
    }
}

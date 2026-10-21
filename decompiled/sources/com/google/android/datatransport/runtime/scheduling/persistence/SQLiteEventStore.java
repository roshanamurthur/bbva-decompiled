package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.g;
import androidx.camera.core.j;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.sharedstorage.extension.CustomCursor;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.mail.Part;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yd.c;

/* JADX INFO: loaded from: classes9.dex */
@Singleton
@WorkerThread
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Encoding f43867u0 = Encoding.of("proto");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SchemaManager f43868p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Clock f43869q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Clock f43870r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final c f43871s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Provider<String> f43872t0;

    public interface a<T, U> {
        U apply(T t10);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43874b;

        public b(String str, String str2) {
            this.f43873a = str;
            this.f43874b = str2;
        }
    }

    @Inject
    public SQLiteEventStore(@WallTime Clock clock, @Monotonic Clock clock2, c cVar, SchemaManager schemaManager, @Named("PACKAGE_NAME") Provider<String> provider) {
        this.f43868p0 = schemaManager;
        this.f43869q0 = clock;
        this.f43870r0 = clock2;
        this.f43871s0 = cVar;
        this.f43872t0 = provider;
    }

    @Nullable
    public static Long c(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))));
        if (transportContext.getExtras() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.getExtras(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{CustomCursor.ID}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String f(Iterable<PersistedEvent> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<PersistedEvent> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().getId());
            if (it.hasNext()) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb2.append(RootService.CLOSE_BRACKET);
        return sb2.toString();
    }

    @VisibleForTesting
    public static <T> T g(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @VisibleForTesting
    public final SQLiteDatabase b() {
        SchemaManager schemaManager = this.f43868p0;
        Objects.requireNonNull(schemaManager);
        Clock clock = this.f43870r0;
        long time = clock.getTime();
        while (true) {
            try {
                return schemaManager.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e5) {
                if (clock.getTime() >= ((long) this.f43871s0.a()) + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
        long time = this.f43869q0.getTime() - this.f43871s0.b();
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            String[] strArr = {String.valueOf(time)};
            g(sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new hc.a(this));
            Integer numValueOf = Integer.valueOf(sQLiteDatabaseB.delete("events", "timestamp_ms < ?", strArr));
            sQLiteDatabaseB.setTransactionSuccessful();
            return numValueOf.intValue();
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void clearDb() {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            sQLiteDatabaseB.delete("events", null, new String[0]);
            sQLiteDatabaseB.delete("transport_contexts", null, new String[0]);
            sQLiteDatabaseB.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43868p0.close();
    }

    @VisibleForTesting
    public final <T> T d(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, final TransportContext transportContext, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, transportContext);
        if (lC == null) {
            return arrayList;
        }
        g(sQLiteDatabase.query("events", new String[]{CustomCursor.ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "code", Part.INLINE}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i10)), new a() { // from class: yd.h
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                Encoding encoding = SQLiteEventStore.f43867u0;
                SQLiteEventStore sQLiteEventStore = this.f94783p0;
                sQLiteEventStore.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    boolean z10 = cursor.getInt(7) != 0;
                    EventInternal.Builder uptimeMillis = EventInternal.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3));
                    if (z10) {
                        String string = cursor.getString(4);
                        uptimeMillis.setEncodedPayload(new EncodedPayload(string == null ? SQLiteEventStore.f43867u0 : Encoding.of(string), cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        Encoding encodingOf = string2 == null ? SQLiteEventStore.f43867u0 : Encoding.of(string2);
                        Cursor cursorQuery = sQLiteEventStore.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            Encoding encoding2 = SQLiteEventStore.f43867u0;
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int length2 = 0;
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i11);
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                            }
                            cursorQuery.close();
                            uptimeMillis.setEncodedPayload(new EncodedPayload(encodingOf, bArr));
                        } catch (Throwable th2) {
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        uptimeMillis.setCode(Integer.valueOf(cursor.getInt(6)));
                    }
                    arrayList.add(PersistedEvent.create(j10, transportContext, uptimeMillis.build()));
                }
                return null;
            }
        });
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(TransportContext transportContext) {
        Cursor cursorRawQuery = b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(TransportContext transportContext) {
        return ((Boolean) d(new g4.a(this, transportContext))).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<TransportContext> loadActiveContexts() {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            List list = (List) g(sQLiteDatabaseB.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new com.google.android.gms.internal.mlkit_common.a());
            sQLiteDatabaseB.setTransactionSuccessful();
            return list;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<PersistedEvent> loadBatch(TransportContext transportContext) {
        return (Iterable) d(new j(this, transportContext));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public ClientMetrics loadClientMetrics() {
        final ClientMetrics.Builder builderNewBuilder = ClientMetrics.newBuilder();
        final HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            ClientMetrics clientMetrics = (ClientMetrics) g(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new a() { // from class: yd.g
                /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r5
                  0x002c: PHI (r5v11 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason) = 
                  (r5v4 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v5 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v6 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v7 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v8 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v9 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                 binds: [B:9:0x002a, B:12:0x0034, B:15:0x003d, B:18:0x0046, B:21:0x004f, B:24:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
                public final Object apply(Object obj) {
                    Map map2;
                    Cursor cursor = (Cursor) obj;
                    Encoding encoding = SQLiteEventStore.f43867u0;
                    SQLiteEventStore sQLiteEventStore = this.f94780p0;
                    sQLiteEventStore.getClass();
                    while (true) {
                        boolean zMoveToNext = cursor.moveToNext();
                        map2 = map;
                        if (!zMoveToNext) {
                            break;
                        }
                        String string = cursor.getString(0);
                        int i10 = cursor.getInt(1);
                        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
                        if (i10 != reason.getNumber()) {
                            LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                            if (i10 == reason2.getNumber()) {
                                reason = reason2;
                            } else {
                                reason2 = LogEventDropped.Reason.CACHE_FULL;
                                if (i10 == reason2.getNumber()) {
                                    reason = reason2;
                                } else {
                                    reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                                    if (i10 == reason2.getNumber()) {
                                        reason = reason2;
                                    } else {
                                        reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                                        if (i10 == reason2.getNumber()) {
                                            reason = reason2;
                                        } else {
                                            reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                            if (i10 == reason2.getNumber()) {
                                                reason = reason2;
                                            } else {
                                                reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                                if (i10 == reason2.getNumber()) {
                                                    reason = reason2;
                                                } else {
                                                    Logging.d("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        long j10 = cursor.getLong(2);
                        if (!map2.containsKey(string)) {
                            map2.put(string, new ArrayList());
                        }
                        ((List) map2.get(string)).add(LogEventDropped.newBuilder().setReason(reason).setEventsDroppedCount(j10).build());
                    }
                    Iterator it = map2.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        ClientMetrics.Builder builder = builderNewBuilder;
                        if (!zHasNext) {
                            long time = sQLiteEventStore.f43869q0.getTime();
                            SQLiteDatabase sQLiteDatabaseB2 = sQLiteEventStore.b();
                            sQLiteDatabaseB2.beginTransaction();
                            try {
                                Cursor cursorRawQuery = sQLiteDatabaseB2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                try {
                                    Encoding encoding2 = SQLiteEventStore.f43867u0;
                                    cursorRawQuery.moveToNext();
                                    TimeWindow timeWindowBuild = TimeWindow.newBuilder().setStartMs(cursorRawQuery.getLong(0)).setEndMs(time).build();
                                    cursorRawQuery.close();
                                    sQLiteDatabaseB2.setTransactionSuccessful();
                                    sQLiteDatabaseB2.endTransaction();
                                    builder.setWindow(timeWindowBuild);
                                    builder.setGlobalMetrics(GlobalMetrics.newBuilder().setStorageMetrics(StorageMetrics.newBuilder().setCurrentCacheSizeBytes(sQLiteEventStore.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore.b().compileStatement("PRAGMA page_count").simpleQueryForLong()).setMaxCacheSizeBytes(c.f94771a.f94763b).build()).build());
                                    builder.setAppNamespace(sQLiteEventStore.f43872t0.get());
                                    return builder.build();
                                } catch (Throwable th2) {
                                    cursorRawQuery.close();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                sQLiteDatabaseB2.endTransaction();
                                throw th3;
                            }
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        builder.addLogSourceMetrics(LogSourceMetrics.newBuilder().setLogSource((String) entry.getKey()).setLogEventDroppedList((List) entry.getValue()).build());
                    }
                }
            });
            sQLiteDatabaseB.setTransactionSuccessful();
            return clientMetrics;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    @Nullable
    public PersistedEvent persist(final TransportContext transportContext, final EventInternal eventInternal) {
        Logging.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.getPriority(), eventInternal.getTransportName(), transportContext.getBackendName());
        long jLongValue = ((Long) d(new a() { // from class: yd.d
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.f43867u0;
                SQLiteEventStore sQLiteEventStore = this.f94772p0;
                long jSimpleQueryForLong = sQLiteEventStore.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                c cVar = sQLiteEventStore.f43871s0;
                long jE = cVar.e();
                EventInternal eventInternal2 = eventInternal;
                if (jSimpleQueryForLong >= jE) {
                    sQLiteEventStore.recordLogEventDropped(1L, LogEventDropped.Reason.CACHE_FULL, eventInternal2.getTransportName());
                    return -1L;
                }
                TransportContext transportContext2 = transportContext;
                Long lC = SQLiteEventStore.c(sQLiteDatabase, transportContext2);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", transportContext2.getBackendName());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(transportContext2.getPriority())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (transportContext2.getExtras() != null) {
                        contentValues.put("extras", Base64.encodeToString(transportContext2.getExtras(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = cVar.d();
                byte[] bytes = eventInternal2.getEncodedPayload().getBytes();
                boolean z10 = bytes.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", eventInternal2.getTransportName());
                contentValues2.put("timestamp_ms", Long.valueOf(eventInternal2.getEventMillis()));
                contentValues2.put("uptime_ms", Long.valueOf(eventInternal2.getUptimeMillis()));
                contentValues2.put("payload_encoding", eventInternal2.getEncodedPayload().getEncoding().getName());
                contentValues2.put("code", eventInternal2.getCode());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put(Part.INLINE, Boolean.valueOf(z10));
                contentValues2.put(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, z10 ? bytes : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(((double) bytes.length) / ((double) iD));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bytes, (i10 - 1) * iD, Math.min(i10 * iD, bytes.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry<String, String> entry : eventInternal2.getMetadata().entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", entry.getKey());
                    contentValues4.put("value", entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return PersistedEvent.create(jLongValue, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + f(iterable);
            SQLiteDatabase sQLiteDatabaseB = b();
            sQLiteDatabaseB.beginTransaction();
            try {
                sQLiteDatabaseB.compileStatement(str).execute();
                g(sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null), new com.appsflyer.internal.a(this, 2));
                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseB.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseB.endTransaction();
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void recordLogEventDropped(final long j10, final LogEventDropped.Reason reason, final String str) {
        d(new a() { // from class: yd.e
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.f43867u0;
                LogEventDropped.Reason reason2 = reason;
                String string = Integer.toString(reason2.getNumber());
                String str2 = str;
                boolean zBooleanValue = ((Boolean) SQLiteEventStore.g(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string}), new w4.b(3))).booleanValue();
                long j11 = j10;
                if (zBooleanValue) {
                    sQLiteDatabase.execSQL(androidx.datastore.preferences.protobuf.e.f("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j11, " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(reason2.getNumber())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j11));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(final TransportContext transportContext, final long j10) {
        d(new a() { // from class: yd.f
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.f43867u0;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                TransportContext transportContext2 = transportContext;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext2.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext2.getPriority()))}) < 1) {
                    contentValues.put("backend_name", transportContext2.getBackendName());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(transportContext2.getPriority())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            b().compileStatement("DELETE FROM events WHERE _id in " + f(iterable)).execute();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void resetClientMetrics() {
        d(new g(this));
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(SynchronizationGuard.CriticalSection<T> criticalSection) {
        SQLiteDatabase sQLiteDatabaseB = b();
        Clock clock = this.f43870r0;
        long time = clock.getTime();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    T tExecute = criticalSection.execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return tExecute;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e5) {
                if (clock.getTime() >= ((long) this.f43871s0.a()) + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}

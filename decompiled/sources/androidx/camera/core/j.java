package androidx.camera.core;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements CallbackToFutureAdapter.Resolver, SQLiteEventStore.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2154p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2155q0;

    public /* synthetic */ j(Object obj, Object obj2) {
        this.f2154p0 = obj;
        this.f2155q0 = obj2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.f2154p0;
        TransportContext transportContext = (TransportContext) this.f2155q0;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        yd.c cVar = sQLiteEventStore.f43871s0;
        ArrayList arrayListE = sQLiteEventStore.e(sQLiteDatabase, transportContext, cVar.c());
        for (Priority priority : Priority.values()) {
            if (priority != transportContext.getPriority()) {
                int iC = cVar.c() - arrayListE.size();
                if (iC <= 0) {
                    break;
                }
                arrayListE.addAll(sQLiteEventStore.e(sQLiteDatabase, transportContext.withPriority(priority), iC));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListE.size(); i10++) {
            sb2.append(((PersistedEvent) arrayListE.get(i10)).getId());
            if (i10 < arrayListE.size() - 1) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb2.append(RootService.CLOSE_BRACKET);
        SQLiteEventStore.g(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new y0.h(map));
        ListIterator listIterator = arrayListE.listIterator();
        while (listIterator.hasNext()) {
            PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
            if (map.containsKey(Long.valueOf(persistedEvent.getId()))) {
                EventInternal.Builder builder = persistedEvent.getEvent().toBuilder();
                for (SQLiteEventStore.b bVar : (Set) map.get(Long.valueOf(persistedEvent.getId()))) {
                    builder.addMetadata(bVar.f43873a, bVar.f43874b);
                }
                listIterator.set(PersistedEvent.create(persistedEvent.getId(), persistedEvent.getTransportContext(), builder.build()));
            }
        }
        return arrayListE;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((CameraX) this.f2154p0).lambda$initInternal$0((Context) this.f2155q0, completer);
    }
}

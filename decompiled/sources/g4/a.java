package g4;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.cellscore.web.navigation.Route;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Reaction.NavigationExecution, SQLiteEventStore.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f68582p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f68583q0;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f68582p0 = obj;
        this.f68583q0 = obj2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.f68582p0;
        TransportContext transportContext = (TransportContext) this.f68583q0;
        Encoding encoding = SQLiteEventStore.f43867u0;
        sQLiteEventStore.getClass();
        Long lC = SQLiteEventStore.c((SQLiteDatabase) obj, transportContext);
        if (lC == null) {
            return Boolean.FALSE;
        }
        Cursor cursorRawQuery = sQLiteEventStore.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
        try {
            return Boolean.valueOf(cursorRawQuery.moveToNext());
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public final void execute(Activity activity, Object obj, Object obj2) {
        String str = (String) this.f68582p0;
        ((WebController) obj).openWeb(activity, new WebNavigation.Builder().route(str).nativeContainer((Route) this.f68583q0).build(), obj2);
    }
}

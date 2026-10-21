package com.appsflyer.internal;

import android.app.Activity;
import android.database.Cursor;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.activity.WebViewReaction;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.navigation.Dispatcher;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionEvents;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements AFd1cSDK, Reaction.NavigationExecution, SQLiteEventStore.a, Continuation, Transformer, MarketingCloudSdk.WhenReadyListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f26392p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f26393q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f26392p0 = i10;
        this.f26393q0 = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        int i10 = this.f26392p0;
        Object obj2 = this.f26393q0;
        switch (i10) {
            case 2:
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) obj2;
                Cursor cursor = (Cursor) obj;
                Encoding encoding = SQLiteEventStore.f43867u0;
                sQLiteEventStore.getClass();
                while (cursor.moveToNext()) {
                    sQLiteEventStore.recordLogEventDropped(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
                }
                return null;
            default:
                EventGDTLogger.Companion companion = EventGDTLogger.INSTANCE;
                ((EventGDTLogger) obj2).getClass();
                String strEncode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode((SessionEvent) obj);
                Intrinsics.checkNotNullExpressionValue(strEncode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
        }
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public final void execute(Activity activity, Object obj, Object obj2) {
        ((WebViewReaction) this.f26393q0).dispatchWebMessage(activity, (Dispatcher) obj, (CellsMessage) obj2);
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final void onRemoteConfigUpdateFinished(AFe1zSDK aFe1zSDK) {
        ((AFa1dSDK) this.f26393q0).AFInAppEventParameterName(aFe1zSDK);
    }

    @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
    public final void ready(MarketingCloudSdk marketingCloudSdk) {
        MarketingCloudConfig.init$lambda$1$lambda$0((ModuleReadyListener) this.f26393q0, marketingCloudSdk);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f26393q0;
        ExecutorService executorService = Utils.f47779a;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }
}

package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionLifecycleClient.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", "", "", "bindToService", "foregrounded", "backgrounded", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Companion", "ClientUpdateHandler", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionLifecycleClient {

    @NotNull
    public static final String TAG = "SessionLifecycleClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f48882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Messenger f48883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedBlockingDeque<Message> f48884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SessionLifecycleClient$serviceConnection$1 f48885d;

    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", NotificationCompat.CATEGORY_MESSAGE, "", "handleMessage", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public static final class ClientUpdateHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CoroutineContext f48886a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(@NotNull CoroutineContext backgroundDispatcher) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            this.f48886a = backgroundDispatcher;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            String string;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what != 3) {
                Log.w(SessionLifecycleClient.TAG, "Received unexpected event from the SessionLifecycleService: " + msg);
                super.handleMessage(msg);
                return;
            }
            Bundle data = msg.getData();
            if (data == null || (string = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) {
                string = "";
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f48886a), null, null, new a(string, null), 3, null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(@NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f48882a = backgroundDispatcher;
        this.f48884c = new LinkedBlockingDeque<>(20);
        this.f48885d = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName className, @Nullable IBinder serviceBinder) {
                SessionLifecycleClient sessionLifecycleClient = this.f48890a;
                sessionLifecycleClient.f48884c.size();
                sessionLifecycleClient.f48883b = new Messenger(serviceBinder);
                sessionLifecycleClient.getClass();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(sessionLifecycleClient.f48882a), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(sessionLifecycleClient, SessionLifecycleClient.access$drainQueue(sessionLifecycleClient), null), 3, null);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName className) {
                SessionLifecycleClient sessionLifecycleClient = this.f48890a;
                sessionLifecycleClient.f48883b = null;
                sessionLifecycleClient.getClass();
            }
        };
    }

    public static final List access$drainQueue(SessionLifecycleClient sessionLifecycleClient) {
        sessionLifecycleClient.getClass();
        ArrayList arrayList = new ArrayList();
        sessionLifecycleClient.f48884c.drainTo(arrayList);
        return arrayList;
    }

    public static final Message access$getLatestByCode(SessionLifecycleClient sessionLifecycleClient, List list, int i10) {
        Object obj;
        sessionLifecycleClient.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i10) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static final void access$sendMessageToServer(SessionLifecycleClient sessionLifecycleClient, Message message) {
        Messenger messenger = sessionLifecycleClient.f48883b;
        LinkedBlockingDeque<Message> linkedBlockingDeque = sessionLifecycleClient.f48884c;
        if (messenger == null) {
            if (!linkedBlockingDeque.offer(message)) {
                int i10 = message.what;
                return;
            } else {
                int i11 = message.what;
                linkedBlockingDeque.size();
                return;
            }
        }
        try {
            int i12 = message.what;
            messenger.send(message);
        } catch (RemoteException e5) {
            Log.w(TAG, "Unable to deliver message: " + message.what, e5);
            if (linkedBlockingDeque.offer(message)) {
                linkedBlockingDeque.size();
            }
        }
    }

    public final void backgrounded() {
        ArrayList arrayList = new ArrayList();
        this.f48884c.drainTo(arrayList);
        Message messageObtain = Message.obtain(null, 2, 0, 0);
        Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f48882a), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(this, arrayList, null), 3, null);
    }

    public final void bindToService() {
        SessionLifecycleServiceBinder.INSTANCE.getInstance().bindToService(new Messenger(new ClientUpdateHandler(this.f48882a)), this.f48885d);
    }

    public final void foregrounded() {
        ArrayList arrayList = new ArrayList();
        this.f48884c.drainTo(arrayList);
        Message messageObtain = Message.obtain(null, 1, 0, 0);
        Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f48882a), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(this, arrayList, null), 3, null);
    }
}

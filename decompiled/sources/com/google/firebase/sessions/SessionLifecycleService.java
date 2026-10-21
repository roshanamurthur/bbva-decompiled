package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionLifecycleService.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "onDestroy", "Landroid/os/HandlerThread;", "p0", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "handlerThread", "<init>", "()V", "Companion", "MessageHandler", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionLifecycleService extends Service {
    public static final int BACKGROUNDED = 2;

    @NotNull
    public static final String CLIENT_CALLBACK_MESSENGER = "ClientCallbackMessenger";
    public static final int FOREGROUNDED = 1;
    public static final int SESSION_UPDATED = 3;

    @NotNull
    public static final String SESSION_UPDATE_EXTRA = "SessionUpdateExtra";

    @NotNull
    public static final String TAG = "SessionLifecycleService";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public MessageHandler f48892q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Messenger f48893r0;

    /* JADX INFO: compiled from: SessionLifecycleService.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$MessageHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", NotificationCompat.CATEGORY_MESSAGE, "", "handleMessage", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public static final class MessageHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f48894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f48895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList<Messenger> f48896c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageHandler(@NotNull Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.f48896c = new ArrayList<>();
        }

        public final void a(Messenger messenger) {
            if (this.f48894a) {
                c(messenger, SessionGenerator.INSTANCE.getInstance().getCurrentSession().getSessionId());
                return;
            }
            String currentSessionId = SessionDatastore.INSTANCE.getInstance().getCurrentSessionId();
            if (currentSessionId != null) {
                c(messenger, currentSessionId);
            }
        }

        public final void b() {
            SessionGenerator.Companion companion = SessionGenerator.INSTANCE;
            companion.getInstance().generateNewSession();
            companion.getInstance().getCurrentSession().getSessionId();
            Objects.toString(companion.getInstance().getCurrentSession());
            SessionFirelogPublisher.INSTANCE.getInstance().logSession(companion.getInstance().getCurrentSession());
            for (Messenger it : new ArrayList(this.f48896c)) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                a(it);
            }
            SessionDatastore.INSTANCE.getInstance().updateSessionId(SessionGenerator.INSTANCE.getInstance().getCurrentSession().getSessionId());
        }

        public final void c(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(SessionLifecycleService.SESSION_UPDATE_EXTRA, str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Objects.toString(messenger);
                this.f48896c.remove(messenger);
            } catch (Exception e5) {
                Log.w(SessionLifecycleService.TAG, "Unable to push new session to " + messenger + '.', e5);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (this.f48895b > msg.getWhen()) {
                msg.getWhen();
                return;
            }
            int i10 = msg.what;
            if (i10 == 1) {
                msg.getWhen();
                if (!this.f48894a) {
                    this.f48894a = true;
                    b();
                } else if (msg.getWhen() - this.f48895b > Duration.m5829getInWholeMillisecondsimpl(SessionsSettings.INSTANCE.getInstance().m5294getSessionRestartTimeoutUwyO8pc())) {
                    b();
                }
                this.f48895b = msg.getWhen();
                return;
            }
            if (i10 == 2) {
                msg.getWhen();
                this.f48895b = msg.getWhen();
                return;
            }
            if (i10 != 4) {
                Log.w(SessionLifecycleService.TAG, "Received unexpected event from the SessionLifecycleClient: " + msg);
                super.handleMessage(msg);
                return;
            }
            ArrayList<Messenger> arrayList = this.f48896c;
            arrayList.add(msg.replyTo);
            Messenger messenger = msg.replyTo;
            Intrinsics.checkNotNullExpressionValue(messenger, "msg.replyTo");
            a(messenger);
            Objects.toString(msg.replyTo);
            msg.getWhen();
            arrayList.size();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getHandlerThread$com_google_firebase_firebase_sessions, reason: from getter */
    public final HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER, Messenger.class) : (Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER);
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            MessageHandler messageHandler = this.f48892q0;
            if (messageHandler != null) {
                messageHandler.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.f48893r0;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        this.f48892q0 = new MessageHandler(looper);
        this.f48893r0 = new Messenger(this.f48892q0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}

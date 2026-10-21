package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.threads.PoolableExecutors;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;

    @VisibleForTesting
    final ExecutorService executor = PoolableExecutors.factory().newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), ThreadPriority.HIGH_SPEED);
    private final Object lock = new Object();
    private int runningTasks = 0;

    public class a implements z.a {
        public a() {
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            x.a(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, Task task) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public Task<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new c(this, intent, 0, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.binder == null) {
                this.binder = new z(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.binder;
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.addOnCompleteListener(new d(), new OnCompleteListener() { // from class: com.google.firebase.messaging.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f48626a.lambda$onStartCommand$1(intent, task);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}

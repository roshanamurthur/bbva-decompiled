package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1tSDK implements Runnable {
    final ExecutorService AFInAppEventParameterName;
    public Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();
    private Timer afDebugLog = new Timer(true);
    public final List<AFd1zSDK> values = new CopyOnWriteArrayList();
    final Set<AFd1vSDK> AFInAppEventType = new CopyOnWriteArraySet();
    final Set<AFd1vSDK> valueOf = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFd1uSDK<?>> afRDLog = new ConcurrentSkipListSet();
    final NavigableSet<AFd1uSDK<?>> AFLogger = new ConcurrentSkipListSet();
    final List<AFd1uSDK<?>> afErrorLog = new ArrayList();
    final Set<AFd1uSDK<?>> afInfoLog = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1tSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        private /* synthetic */ AFd1uSDK AFInAppEventParameterName;

        public AnonymousClass5(AFd1uSDK aFd1uSDK) {
            this.AFInAppEventParameterName = aFd1uSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFd1tSDK.this.afRDLog) {
                try {
                    if (AFd1tSDK.this.afInfoLog.contains(this.AFInAppEventParameterName)) {
                        StringBuilder sb2 = new StringBuilder("QUEUE: tried to add already running task: ");
                        sb2.append(this.AFInAppEventParameterName);
                        AFLogger.afDebugLog(sb2.toString());
                        return;
                    }
                    if (!AFd1tSDK.this.afRDLog.contains(this.AFInAppEventParameterName) && !AFd1tSDK.this.AFLogger.contains(this.AFInAppEventParameterName)) {
                        AFd1tSDK aFd1tSDK = AFd1tSDK.this;
                        AFd1uSDK aFd1uSDK = this.AFInAppEventParameterName;
                        for (AFd1vSDK aFd1vSDK : aFd1uSDK.valueOf) {
                            if (aFd1tSDK.valueOf.contains(aFd1vSDK)) {
                                aFd1uSDK.AFInAppEventType.add(aFd1vSDK);
                            }
                        }
                        if (AFd1tSDK.this.AFKeystoreWrapper((AFd1uSDK<?>) this.AFInAppEventParameterName)) {
                            zAdd = AFd1tSDK.this.afRDLog.add(this.AFInAppEventParameterName);
                        } else {
                            zAdd = AFd1tSDK.this.AFLogger.add(this.AFInAppEventParameterName);
                            if (zAdd) {
                                StringBuilder sb3 = new StringBuilder("QUEUE: new task was blocked: ");
                                sb3.append(this.AFInAppEventParameterName);
                                AFLogger.afDebugLog(sb3.toString());
                                this.AFInAppEventParameterName.AFInAppEventParameterName();
                            }
                        }
                        if (zAdd) {
                            AFd1tSDK aFd1tSDK2 = AFd1tSDK.this;
                            aFd1tSDK2.afRDLog.addAll(aFd1tSDK2.afErrorLog);
                            AFd1tSDK.this.afErrorLog.clear();
                        } else {
                            StringBuilder sb4 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            sb4.append(this.AFInAppEventParameterName);
                            AFLogger.afDebugLog(sb4.toString());
                        }
                        if (!zAdd) {
                            StringBuilder sb5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb5.append(this.AFInAppEventParameterName);
                            AFLogger.afWarnLog(sb5.toString());
                            return;
                        }
                        AFd1tSDK.this.valueOf.add(this.AFInAppEventParameterName.values);
                        StringBuilder sb6 = new StringBuilder("QUEUE: new task added: ");
                        sb6.append(this.AFInAppEventParameterName);
                        AFLogger.afDebugLog(sb6.toString());
                        for (AFd1zSDK aFd1zSDK : AFd1tSDK.this.values) {
                        }
                        AFd1tSDK aFd1tSDK3 = AFd1tSDK.this;
                        aFd1tSDK3.AFInAppEventParameterName.submit(aFd1tSDK3);
                        AFd1tSDK aFd1tSDK4 = AFd1tSDK.this;
                        synchronized (aFd1tSDK4.afRDLog) {
                            try {
                                for (int size = (aFd1tSDK4.afRDLog.size() + aFd1tSDK4.AFLogger.size()) - 40; size > 0; size--) {
                                    boolean z10 = !aFd1tSDK4.AFLogger.isEmpty();
                                    boolean z11 = !aFd1tSDK4.afRDLog.isEmpty();
                                    if (z11 && z10) {
                                        if (aFd1tSDK4.afRDLog.first().compareTo(aFd1tSDK4.AFLogger.first()) > 0) {
                                            aFd1tSDK4.valueOf(aFd1tSDK4.afRDLog);
                                        } else {
                                            aFd1tSDK4.valueOf(aFd1tSDK4.AFLogger);
                                        }
                                    } else if (z11) {
                                        aFd1tSDK4.valueOf(aFd1tSDK4.afRDLog);
                                    } else if (z10) {
                                        aFd1tSDK4.valueOf(aFd1tSDK4.AFLogger);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                    sb7.append(this.AFInAppEventParameterName);
                    AFLogger.afDebugLog(sb7.toString());
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public AFd1tSDK(ExecutorService executorService) {
        this.AFInAppEventParameterName = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AFKeystoreWrapper(AFd1uSDK<?> aFd1uSDK) {
        return this.AFInAppEventType.containsAll(aFd1uSDK.AFInAppEventType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.afRDLog) {
            try {
                final AFd1uSDK<?> aFd1uSDKPollFirst = this.afRDLog.pollFirst();
                if (aFd1uSDKPollFirst == null) {
                    return;
                }
                this.afInfoLog.add(aFd1uSDKPollFirst);
                long jAFKeystoreWrapper = aFd1uSDKPollFirst.AFKeystoreWrapper();
                AFd1xSDK aFd1xSDK = new AFd1xSDK(Thread.currentThread());
                if (jAFKeystoreWrapper > 0) {
                    this.afDebugLog.schedule(aFd1xSDK, jAFKeystoreWrapper);
                }
                this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFd1zSDK> it = AFd1tSDK.this.values.iterator();
                        while (it.hasNext()) {
                            it.next().AFInAppEventType(aFd1uSDKPollFirst);
                        }
                    }
                });
                if (!this.afRDLog.isEmpty()) {
                    this.AFInAppEventParameterName.submit(this);
                }
                try {
                    AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf(aFd1uSDKPollFirst)));
                    final AFd1ySDK aFd1ySDKCall = aFd1uSDKPollFirst.call();
                    aFd1xSDK.cancel();
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                            sb2.append(aFd1uSDKPollFirst);
                            sb2.append(", result: ");
                            sb2.append(aFd1ySDKCall);
                            AFLogger.afDebugLog(sb2.toString());
                            AFd1tSDK.this.afInfoLog.remove(aFd1uSDKPollFirst);
                            Iterator<AFd1zSDK> it = AFd1tSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(aFd1uSDKPollFirst, aFd1ySDKCall);
                            }
                            if (aFd1ySDKCall == AFd1ySDK.SUCCESS) {
                                AFd1tSDK.this.AFInAppEventType.add(aFd1uSDKPollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            if (!aFd1uSDKPollFirst.AFInAppEventType()) {
                                AFd1tSDK.this.AFInAppEventType.add(aFd1uSDKPollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            synchronized (AFd1tSDK.this.afRDLog) {
                                try {
                                    AFd1tSDK.this.afErrorLog.add(aFd1uSDKPollFirst);
                                    for (AFd1zSDK aFd1zSDK : AFd1tSDK.this.values) {
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf(aFd1uSDKPollFirst)));
                    final AFd1ySDK aFd1ySDK = AFd1ySDK.TIMEOUT;
                    aFd1uSDKPollFirst.AFKeystoreWrapper = aFd1ySDK;
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                            sb2.append(aFd1uSDKPollFirst);
                            sb2.append(", result: ");
                            sb2.append(aFd1ySDK);
                            AFLogger.afDebugLog(sb2.toString());
                            AFd1tSDK.this.afInfoLog.remove(aFd1uSDKPollFirst);
                            Iterator<AFd1zSDK> it = AFd1tSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(aFd1uSDKPollFirst, aFd1ySDK);
                            }
                            if (aFd1ySDK == AFd1ySDK.SUCCESS) {
                                AFd1tSDK.this.AFInAppEventType.add(aFd1uSDKPollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            if (!aFd1uSDKPollFirst.AFInAppEventType()) {
                                AFd1tSDK.this.AFInAppEventType.add(aFd1uSDKPollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            synchronized (AFd1tSDK.this.afRDLog) {
                                try {
                                    AFd1tSDK.this.afErrorLog.add(aFd1uSDKPollFirst);
                                    for (AFd1zSDK aFd1zSDK : AFd1tSDK.this.values) {
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                } catch (Throwable unused2) {
                    aFd1xSDK.cancel();
                    final AFd1ySDK aFd1ySDK2 = AFd1ySDK.FAILURE;
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                            sb2.append(aFd1uSDKPollFirst);
                            sb2.append(", result: ");
                            sb2.append(aFd1ySDK2);
                            AFLogger.afDebugLog(sb2.toString());
                            AFd1tSDK.this.afInfoLog.remove(aFd1uSDKPollFirst);
                            Iterator<AFd1zSDK> it = AFd1tSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(aFd1uSDKPollFirst, aFd1ySDK2);
                            }
                            if (aFd1ySDK2 == AFd1ySDK.SUCCESS) {
                                AFd1tSDK.this.AFInAppEventType.add(aFd1uSDKPollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            if (!aFd1uSDKPollFirst.AFInAppEventType()) {
                                AFd1tSDK.this.AFInAppEventType.add(aFd1uSDKPollFirst.values);
                                AFd1tSDK.AFKeystoreWrapper(AFd1tSDK.this);
                                return;
                            }
                            synchronized (AFd1tSDK.this.afRDLog) {
                                try {
                                    AFd1tSDK.this.afErrorLog.add(aFd1uSDKPollFirst);
                                    for (AFd1zSDK aFd1zSDK : AFd1tSDK.this.values) {
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void valueOf(NavigableSet<AFd1uSDK<?>> navigableSet) {
        AFd1uSDK<?> aFd1uSDKPollFirst = navigableSet.pollFirst();
        this.AFInAppEventType.add(aFd1uSDKPollFirst.values);
        Iterator<AFd1zSDK> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(aFd1uSDKPollFirst);
        }
    }

    public static /* synthetic */ void AFKeystoreWrapper(AFd1tSDK aFd1tSDK) {
        synchronized (aFd1tSDK.afRDLog) {
            try {
                Iterator<AFd1uSDK<?>> it = aFd1tSDK.AFLogger.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    AFd1uSDK<?> next = it.next();
                    if (aFd1tSDK.AFKeystoreWrapper(next)) {
                        it.remove();
                        aFd1tSDK.afRDLog.add(next);
                        z10 = true;
                    }
                }
                if (z10) {
                    aFd1tSDK.AFInAppEventParameterName.submit(aFd1tSDK);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

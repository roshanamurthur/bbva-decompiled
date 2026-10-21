package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.o1;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
abstract class c extends Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f64074h = com.salesforce.marketingcloud.g.a("JobIntentService");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Object f64075i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashMap<ComponentName, h> f64076j = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f64077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h f64078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f64079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f64080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f64081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f64082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ArrayList<d> f64083g;

    @SuppressLint({"StaticFieldLeak"})
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            e eVarA;
            try {
                com.salesforce.marketingcloud.g.a(c.f64074h, "Starting to dequeue work...", new Object[0]);
                while (!isCancelled() && (eVarA = c.this.a()) != null) {
                    String str = c.f64074h;
                    com.salesforce.marketingcloud.g.a(str, "Processing next work: %s", eVarA);
                    c.this.a(eVarA.getIntent());
                    com.salesforce.marketingcloud.g.a(str, "Completing work: %s", eVarA);
                    eVarA.a();
                }
                com.salesforce.marketingcloud.g.a(c.f64074h, "Done processing work!", new Object[0]);
                return null;
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(c.f64074h, e5, "Exception thrown by JobIntentService", new Object[0]);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            c.this.e();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            c.this.e();
        }
    }

    public interface b {
        e a();

        IBinder b();
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.c$c, reason: collision with other inner class name */
    public static final class C0245c extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f64085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f64086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f64087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f64088g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f64089h;

        public C0245c(Context context, ComponentName componentName) {
            super(componentName);
            this.f64085d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f64086e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f64087f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void a() {
            synchronized (this) {
                try {
                    if (this.f64089h) {
                        if (this.f64088g) {
                            this.f64086e.acquire(60000L);
                        }
                        this.f64089h = false;
                        this.f64087f.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void b() {
            synchronized (this) {
                try {
                    if (!this.f64089h) {
                        this.f64089h = true;
                        this.f64087f.acquire(600000L);
                        this.f64086e.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void c() {
            synchronized (this) {
                this.f64088g = false;
            }
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f64101a);
            com.salesforce.marketingcloud.g.a(c.f64074h, "Starting service for work: %s", intent);
            if (this.f64085d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f64088g) {
                            this.f64088g = true;
                            if (!this.f64089h) {
                                this.f64086e.acquire(60000L);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f64090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f64091b;

        public d(Intent intent, int i10) {
            this.f64090a = intent;
            this.f64091b = i10;
        }

        @Override // com.salesforce.marketingcloud.c.e
        public void a() {
            com.salesforce.marketingcloud.g.a(c.f64074h, "Stopping self: #%d", Integer.valueOf(this.f64091b));
            c.this.stopSelf(this.f64091b);
        }

        @Override // com.salesforce.marketingcloud.c.e
        public Intent getIntent() {
            return this.f64090a;
        }
    }

    public interface e {
        void a();

        Intent getIntent();
    }

    @RequiresApi(26)
    public static final class f extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f64093d = com.salesforce.marketingcloud.g.a("JobServiceEngineImpl");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f64094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f64095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        JobParameters f64096c;

        public final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final JobWorkItem f64097a;

            public a(JobWorkItem jobWorkItem) {
                this.f64097a = jobWorkItem;
            }

            @Override // com.salesforce.marketingcloud.c.e
            public void a() {
                synchronized (f.this.f64095b) {
                    try {
                        JobParameters jobParameters = f.this.f64096c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f64097a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.salesforce.marketingcloud.c.e
            public Intent getIntent() {
                return this.f64097a.getIntent();
            }
        }

        public f(c cVar) {
            super(cVar);
            this.f64095b = new Object();
            this.f64094a = cVar;
        }

        @Override // com.salesforce.marketingcloud.c.b
        public e a() {
            synchronized (this.f64095b) {
                try {
                    JobParameters jobParameters = this.f64096c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f64094a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.salesforce.marketingcloud.c.b
        public IBinder b() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            com.salesforce.marketingcloud.g.a(f64093d, "onStartJob: %s", jobParameters);
            this.f64096c = jobParameters;
            this.f64094a.a(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            com.salesforce.marketingcloud.g.a(f64093d, "onStartJob: %s", jobParameters);
            boolean zB = this.f64094a.b();
            synchronized (this.f64095b) {
                this.f64096c = null;
            }
            return zB;
        }
    }

    @RequiresApi(26)
    public static final class g extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JobInfo f64099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final JobScheduler f64100e;

        public g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            a(i10);
            this.f64099d = new JobInfo.Builder(i10, this.f64101a).setOverrideDeadline(0L).build();
            this.f64100e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void a(Intent intent) {
            com.salesforce.marketingcloud.g.a(c.f64074h, "Enqueueing work: %s", intent);
            try {
                JobScheduler jobScheduler = this.f64100e;
                JobInfo jobInfo = this.f64099d;
                androidx.core.graphics.h.f();
                jobScheduler.enqueue(jobInfo, androidx.core.app.h.a(intent));
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(c.f64074h, e5, "Unable to enqueue %s for work %s", Integer.valueOf(this.f64103c), intent);
            }
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f64101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f64102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f64103c;

        public h(ComponentName componentName) {
            this.f64101a = componentName;
        }

        public void a() {
        }

        public abstract void a(Intent intent);

        public void a(int i10) {
            if (!this.f64102b) {
                this.f64102b = true;
                this.f64103c = i10;
            } else {
                if (this.f64103c == i10) {
                    return;
                }
                StringBuilder sbC = o1.c("Given job ID ", i10, " is different than previous ");
                sbC.append(this.f64103c);
                throw new IllegalArgumentException(sbC.toString());
            }
        }

        public void b() {
        }

        public void c() {
        }
    }

    public c() {
        this.f64083g = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    public e a() {
        b bVar = this.f64077a;
        if (bVar != null) {
            return bVar.a();
        }
        synchronized (this.f64083g) {
            try {
                if (this.f64083g.size() <= 0) {
                    return null;
                }
                return this.f64083g.remove(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a(@NonNull Intent intent);

    public void b(boolean z10) {
        this.f64080d = z10;
    }

    public boolean c() {
        return this.f64081e;
    }

    public boolean d() {
        return true;
    }

    public void e() {
        ArrayList<d> arrayList = this.f64083g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f64079c = null;
                    ArrayList<d> arrayList2 = this.f64083g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f64082f) {
                        this.f64078b.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        b bVar = this.f64077a;
        if (bVar == null) {
            return null;
        }
        IBinder iBinderB = bVar.b();
        com.salesforce.marketingcloud.g.a(f64074h, "Returning engine: %s", iBinderB);
        return iBinderB;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.salesforce.marketingcloud.g.a(f64074h, "CREATING: %s", this);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f64077a = new f(this);
            this.f64078b = null;
        } else {
            this.f64077a = null;
            this.f64078b = a((Context) this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        ArrayList<d> arrayList = this.f64083g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f64082f = true;
                this.f64078b.a();
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        if (this.f64083g == null) {
            com.salesforce.marketingcloud.g.a(f64074h, "Ignoring start command: %s", intent);
            return 2;
        }
        this.f64078b.c();
        com.salesforce.marketingcloud.g.a(f64074h, "Received compat start command #%d: %s", Integer.valueOf(i11), intent);
        synchronized (this.f64083g) {
            ArrayList<d> arrayList = this.f64083g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            a(true);
        }
        return 3;
    }

    public static h a(Context context, ComponentName componentName, boolean z10, int i10) {
        h c0245c;
        HashMap<ComponentName, h> map = f64076j;
        h hVar = map.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                c0245c = new C0245c(context, componentName);
            } else {
                if (!z10) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                c0245c = new g(context, componentName, i10);
            }
            hVar = c0245c;
            map.put(componentName, hVar);
        }
        return hVar;
    }

    public boolean b() {
        a aVar = this.f64079c;
        if (aVar != null) {
            aVar.cancel(this.f64080d);
        }
        this.f64081e = true;
        return d();
    }

    public static void a(@NonNull Context context, @NonNull ComponentName componentName, int i10, @NonNull Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f64075i) {
            h hVarA = a(context, componentName, true, i10);
            hVarA.a(i10);
            hVarA.a(intent);
        }
    }

    public static void a(@NonNull Context context, @NonNull Class cls, int i10, @NonNull Intent intent) {
        a(context, new ComponentName(context, (Class<?>) cls), i10, intent);
    }

    public void a(boolean z10) {
        if (this.f64079c == null) {
            this.f64079c = new a();
            h hVar = this.f64078b;
            if (hVar != null && z10) {
                hVar.b();
            }
            com.salesforce.marketingcloud.g.a(f64074h, "Starting processor: %s", this.f64079c);
            this.f64079c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}

package q3;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: compiled from: SystemForegroundDispatcher.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f92757p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f92758q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundDispatcher f92759r0;

    public a(SystemForegroundDispatcher systemForegroundDispatcher, WorkDatabase workDatabase, String str) {
        this.f92759r0 = systemForegroundDispatcher;
        this.f92757p0 = workDatabase;
        this.f92758q0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WorkSpec workSpec = this.f92757p0.workSpecDao().getWorkSpec(this.f92758q0);
        if (workSpec == null || !workSpec.hasConstraints()) {
            return;
        }
        synchronized (this.f92759r0.f24530r0) {
            this.f92759r0.f24533u0.put(this.f92758q0, workSpec);
            this.f92759r0.v0.add(workSpec);
            SystemForegroundDispatcher systemForegroundDispatcher = this.f92759r0;
            systemForegroundDispatcher.f24534w0.replace(systemForegroundDispatcher.v0);
        }
    }
}

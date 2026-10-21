package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.FileStore;

/* JADX INFO: loaded from: classes10.dex */
public class LogFileManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47830c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f47831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yf.b f47832b;

    public LogFileManager(FileStore fileStore) {
        this.f47831a = fileStore;
        this.f47832b = f47830c;
    }

    public void clearLog() {
        this.f47832b.d();
    }

    public byte[] getBytesForLog() {
        return this.f47832b.c();
    }

    @Nullable
    public String getLogString() {
        return this.f47832b.b();
    }

    public final void setCurrentSession(String str) {
        this.f47832b.a();
        this.f47832b = f47830c;
        if (str == null) {
            return;
        }
        this.f47832b = new b(this.f47831a.getSessionFile(str, "userlog"));
    }

    public void writeToLog(long j10, String str) {
        this.f47832b.e(j10, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        setCurrentSession(str);
    }

    public static final class a implements yf.b {
        @Override // yf.b
        public final String b() {
            return null;
        }

        @Override // yf.b
        public final byte[] c() {
            return null;
        }

        @Override // yf.b
        public final void a() {
        }

        @Override // yf.b
        public final void d() {
        }

        @Override // yf.b
        public final void e(long j10, String str) {
        }
    }
}

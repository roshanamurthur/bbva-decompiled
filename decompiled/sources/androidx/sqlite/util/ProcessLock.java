package androidx.sqlite.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProcessLock.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Landroidx/sqlite/util/ProcessLock;", "", "", "processLock", "", "lock", "unlock", "", "name", "Ljava/io/File;", "lockDir", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "Companion", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class ProcessLock {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final HashMap f23520e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final File f23522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lock f23523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FileChannel f23524d;

    /* JADX INFO: compiled from: ProcessLock.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/util/ProcessLock$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "Ljava/util/concurrent/locks/Lock;", "threadLocksMap", "Ljava/util/Map;", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n361#2,7:104\n*S KotlinDebug\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n*L\n99#1:104,7\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Lock access$getThreadLock(Companion companion, String str) {
            Lock lock;
            companion.getClass();
            synchronized (ProcessLock.f23520e) {
                try {
                    Map map = ProcessLock.f23520e;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }
    }

    public ProcessLock(@NotNull String name, @Nullable File file, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f23521a = z10;
        this.f23522b = file != null ? new File(file, u.f(name, ".lck")) : null;
        this.f23523c = Companion.access$getThreadLock(INSTANCE, name);
    }

    public static /* synthetic */ void lock$default(ProcessLock processLock, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = processLock.f23521a;
        }
        processLock.lock(z10);
    }

    public final void lock(boolean processLock) {
        this.f23523c.lock();
        if (processLock) {
            File file = this.f23522b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f23524d = channel;
            } catch (IOException e5) {
                this.f23524d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e5);
            }
        }
    }

    public final void unlock() {
        try {
            FileChannel fileChannel = this.f23524d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f23523c.unlock();
    }
}

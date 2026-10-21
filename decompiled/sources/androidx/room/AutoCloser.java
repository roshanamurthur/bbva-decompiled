package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.platform.j;
import androidx.exifinterface.media.ExifInterface;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AutoCloser.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001AB\u001f\u0012\u0006\u0010:\u001a\u00020&\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00106\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u001e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\"¨\u0006B"}, d2 = {"Landroidx/room/AutoCloser;", "", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegateOpenHelper", "", "init", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "block", "executeRefCountingFunction", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "incrementCountAndEnsureDbIsOpen", "decrementCountAndScheduleClose", "closeDatabaseIfOpen", "Ljava/lang/Runnable;", "onAutoClose", "setAutoCloseCallback", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegateOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "setDelegateOpenHelper", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "b", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "(Ljava/lang/Runnable;)V", "onAutoCloseCallback", "", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "", "g", "J", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "h", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getDelegateDatabase$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "setDelegateDatabase$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "delegateDatabase", "", "isActive", "()Z", "getRefCountForTest$room_runtime_release", "refCountForTest", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoCloser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.kt\nandroidx/room/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
public final class AutoCloser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String autoCloseBug = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Handler f23109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Runnable onAutoCloseCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f23111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23112d;
    public SupportSQLiteOpenHelper delegateOpenHelper;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Executor f23113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @GuardedBy("lock")
    public int refCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @GuardedBy("lock")
    public long lastDecrementRefCountTimeStamp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @GuardedBy("lock")
    @Nullable
    public SupportSQLiteDatabase delegateDatabase;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final j f23118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final androidx.lifecycle.b f23119k;

    /* JADX INFO: compiled from: AutoCloser.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/room/AutoCloser$Companion;", "", "()V", "autoCloseBug", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AutoCloser(long j10, @NotNull TimeUnit autoCloseTimeUnit, @NotNull Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.f23109a = new Handler(Looper.getMainLooper());
        this.f23111c = new Object();
        this.f23112d = autoCloseTimeUnit.toMillis(j10);
        this.f23113e = autoCloseExecutor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.f23118j = new j(this, 4);
        this.f23119k = new androidx.lifecycle.b(this, 1);
    }

    public final void closeDatabaseIfOpen() throws IOException {
        synchronized (this.f23111c) {
            try {
                this.f23117i = true;
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null) {
                    supportSQLiteDatabase.close();
                }
                this.delegateDatabase = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void decrementCountAndScheduleClose() {
        synchronized (this.f23111c) {
            try {
                int i10 = this.refCount;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
                }
                int i11 = i10 - 1;
                this.refCount = i11;
                if (i11 == 0) {
                    if (this.delegateDatabase == null) {
                        return;
                    } else {
                        this.f23109a.postDelayed(this.f23118j, this.f23112d);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <V> V executeRefCountingFunction(@NotNull Function1<? super SupportSQLiteDatabase, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getDelegateDatabase$room_runtime_release, reason: from getter */
    public final SupportSQLiteDatabase getDelegateDatabase() {
        return this.delegateDatabase;
    }

    @NotNull
    public final SupportSQLiteOpenHelper getDelegateOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.delegateOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    /* JADX INFO: renamed from: getLastDecrementRefCountTimeStamp$room_runtime_release, reason: from getter */
    public final long getLastDecrementRefCountTimeStamp() {
        return this.lastDecrementRefCountTimeStamp;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnAutoCloseCallback$room_runtime_release, reason: from getter */
    public final Runnable getOnAutoCloseCallback() {
        return this.onAutoCloseCallback;
    }

    /* JADX INFO: renamed from: getRefCount$room_runtime_release, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    @VisibleForTesting
    public final int getRefCountForTest$room_runtime_release() {
        int i10;
        synchronized (this.f23111c) {
            i10 = this.refCount;
        }
        return i10;
    }

    @NotNull
    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.f23111c) {
            this.f23109a.removeCallbacks(this.f23118j);
            this.refCount++;
            if (!(!this.f23117i)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                return supportSQLiteDatabase;
            }
            SupportSQLiteDatabase writableDatabase = getDelegateOpenHelper().getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void init(@NotNull SupportSQLiteOpenHelper delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        setDelegateOpenHelper(delegateOpenHelper);
    }

    public final boolean isActive() {
        return !this.f23117i;
    }

    public final void setAutoCloseCallback(@NotNull Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void setDelegateDatabase$room_runtime_release(@Nullable SupportSQLiteDatabase supportSQLiteDatabase) {
        this.delegateDatabase = supportSQLiteDatabase;
    }

    public final void setDelegateOpenHelper(@NotNull SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper, "<set-?>");
        this.delegateOpenHelper = supportSQLiteOpenHelper;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long j10) {
        this.lastDecrementRefCountTimeStamp = j10;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(@Nullable Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final void setRefCount$room_runtime_release(int i10) {
        this.refCount = i10;
    }
}

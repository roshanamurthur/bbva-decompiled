package okhttp3.internal.http2;

import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/http2/Settings;", "", "", ClearCommand.ID, "", "id", "value", SetCommand.ID, "", "isSet", "get", "size", "defaultValue", "getEnablePush", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "other", "merge", "getHeaderTableSize", "()I", "headerTableSize", "getInitialWindowSize", "initialWindowSize", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Settings {
    public static final int COUNT = 10;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f86033b = new int[10];

    public final void clear() {
        this.f86032a = 0;
        ArraysKt___ArraysJvmKt.fill$default(this.f86033b, 0, 0, 0, 6, (Object) null);
    }

    public final int get(int id) {
        return this.f86033b[id];
    }

    public final boolean getEnablePush(boolean defaultValue) {
        if ((this.f86032a & 4) != 0) {
            return this.f86033b[2] == 1;
        }
        return defaultValue;
    }

    public final int getHeaderTableSize() {
        if ((this.f86032a & 2) != 0) {
            return this.f86033b[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        if ((this.f86032a & 128) != 0) {
            return this.f86033b[7];
        }
        return 65535;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.f86032a & 16) != 0) {
            return this.f86033b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int defaultValue) {
        return (this.f86032a & 32) != 0 ? this.f86033b[5] : defaultValue;
    }

    public final int getMaxHeaderListSize(int defaultValue) {
        return (this.f86032a & 64) != 0 ? this.f86033b[6] : defaultValue;
    }

    public final boolean isSet(int id) {
        return ((1 << id) & this.f86032a) != 0;
    }

    public final void merge(@NotNull Settings other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.isSet(i10)) {
                set(i10, other.get(i10));
            }
        }
    }

    @NotNull
    public final Settings set(int id, int value) {
        if (id >= 0) {
            int[] iArr = this.f86033b;
            if (id < iArr.length) {
                this.f86032a = (1 << id) | this.f86032a;
                iArr[id] = value;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.f86032a);
    }
}

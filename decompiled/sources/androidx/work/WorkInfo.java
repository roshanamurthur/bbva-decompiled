package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TokenStateConstants;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final UUID f24315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final State f24316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Data f24317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final HashSet f24318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Data f24319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24320f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State BLOCKED;
        public static final State CANCELLED;
        public static final State ENQUEUED;
        public static final State FAILED;
        public static final State RUNNING;
        public static final State SUCCEEDED;

        static {
            State state = new State("ENQUEUED", 0);
            ENQUEUED = state;
            State state2 = new State(DebugCoroutineInfoImplKt.RUNNING, 1);
            RUNNING = state2;
            State state3 = new State("SUCCEEDED", 2);
            SUCCEEDED = state3;
            State state4 = new State("FAILED", 3);
            FAILED = state4;
            State state5 = new State(TokenStateConstants.BLOCKED_TOKEN_STATE, 4);
            BLOCKED = state5;
            State state6 = new State("CANCELLED", 5);
            CANCELLED = state6;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkInfo(@NonNull UUID uuid, @NonNull State state, @NonNull Data data, @NonNull List<String> list, @NonNull Data data2, int i10) {
        this.f24315a = uuid;
        this.f24316b = state;
        this.f24317c = data;
        this.f24318d = new HashSet(list);
        this.f24319e = data2;
        this.f24320f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f24320f == workInfo.f24320f && this.f24315a.equals(workInfo.f24315a) && this.f24316b == workInfo.f24316b && this.f24317c.equals(workInfo.f24317c) && this.f24318d.equals(workInfo.f24318d)) {
            return this.f24319e.equals(workInfo.f24319e);
        }
        return false;
    }

    @NonNull
    public UUID getId() {
        return this.f24315a;
    }

    @NonNull
    public Data getOutputData() {
        return this.f24317c;
    }

    @NonNull
    public Data getProgress() {
        return this.f24319e;
    }

    @IntRange(from = 0)
    public int getRunAttemptCount() {
        return this.f24320f;
    }

    @NonNull
    public State getState() {
        return this.f24316b;
    }

    @NonNull
    public Set<String> getTags() {
        return this.f24318d;
    }

    public int hashCode() {
        return ((this.f24319e.hashCode() + ((this.f24318d.hashCode() + ((this.f24317c.hashCode() + ((this.f24316b.hashCode() + (this.f24315a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f24320f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f24315a + "', mState=" + this.f24316b + ", mOutputData=" + this.f24317c + ", mTags=" + this.f24318d + ", mProgress=" + this.f24319e + AbstractJsonLexerKt.END_OBJ;
    }
}

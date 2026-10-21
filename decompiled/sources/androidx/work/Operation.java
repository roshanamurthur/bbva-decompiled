package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public interface Operation {

    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.SUCCESS SUCCESS = new State.SUCCESS();

    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.IN_PROGRESS IN_PROGRESS = new State.IN_PROGRESS();

    public static abstract class State {

        public static final class FAILURE extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f24311a;

            public FAILURE(@NonNull Throwable th2) {
                this.f24311a = th2;
            }

            @NonNull
            public Throwable getThrowable() {
                return this.f24311a;
            }

            @NonNull
            public String toString() {
                return String.format("FAILURE (%s)", this.f24311a.getMessage());
            }
        }

        public static final class IN_PROGRESS extends State {
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class SUCCESS extends State {
            @NonNull
            public String toString() {
                return NotifyProvisionResult.SUCCESS_RESULT;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public State() {
        }
    }

    @NonNull
    ListenableFuture<State.SUCCESS> getResult();

    @NonNull
    LiveData<State> getState();
}

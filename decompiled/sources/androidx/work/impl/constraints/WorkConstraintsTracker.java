package androidx.work.impl.constraints;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WorkConstraintsTracker implements ConstraintController.OnConstraintUpdatedCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24493d = Logger.tagWithPrefix("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final WorkConstraintsCallback f24494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintController<?>[] f24495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24496c;

    public WorkConstraintsTracker(@NonNull Context context, @NonNull TaskExecutor taskExecutor, @Nullable WorkConstraintsCallback workConstraintsCallback) {
        Context applicationContext = context.getApplicationContext();
        this.f24494a = workConstraintsCallback;
        this.f24495b = new ConstraintController[]{new BatteryChargingController(applicationContext, taskExecutor), new BatteryNotLowController(applicationContext, taskExecutor), new StorageNotLowController(applicationContext, taskExecutor), new NetworkConnectedController(applicationContext, taskExecutor), new NetworkUnmeteredController(applicationContext, taskExecutor), new NetworkNotRoamingController(applicationContext, taskExecutor), new NetworkMeteredController(applicationContext, taskExecutor)};
        this.f24496c = new Object();
    }

    public boolean areAllConstraintsMet(@NonNull String str) {
        synchronized (this.f24496c) {
            try {
                for (ConstraintController<?> constraintController : this.f24495b) {
                    if (constraintController.isWorkSpecConstrained(str)) {
                        Logger.get().debug(f24493d, String.format("Work %s constrained by %s", str, constraintController.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintMet(@NonNull List<String> list) {
        synchronized (this.f24496c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (areAllConstraintsMet(str)) {
                        Logger.get().debug(f24493d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                WorkConstraintsCallback workConstraintsCallback = this.f24494a;
                if (workConstraintsCallback != null) {
                    workConstraintsCallback.onAllConstraintsMet(arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintNotMet(@NonNull List<String> list) {
        synchronized (this.f24496c) {
            try {
                WorkConstraintsCallback workConstraintsCallback = this.f24494a;
                if (workConstraintsCallback != null) {
                    workConstraintsCallback.onAllConstraintsNotMet(list);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void replace(@NonNull Iterable<WorkSpec> iterable) {
        synchronized (this.f24496c) {
            try {
                for (ConstraintController<?> constraintController : this.f24495b) {
                    constraintController.setCallback(null);
                }
                for (ConstraintController<?> constraintController2 : this.f24495b) {
                    constraintController2.replace(iterable);
                }
                for (ConstraintController<?> constraintController3 : this.f24495b) {
                    constraintController3.setCallback(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void reset() {
        synchronized (this.f24496c) {
            try {
                for (ConstraintController<?> constraintController : this.f24495b) {
                    constraintController.reset();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

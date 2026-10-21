package androidx.work.impl.model;

import ad.d;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.n1;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"period_start_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class WorkSpec {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;

    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @NonNull
    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy backoffPolicy;

    @NonNull
    @Embedded
    public Constraints constraints;

    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "id")
    public String id;

    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @NonNull
    @ColumnInfo(name = "input")
    public Data input;

    @ColumnInfo(name = "input_merger_class_name")
    public String inputMergerClassName;

    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @NonNull
    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy outOfQuotaPolicy;

    @NonNull
    @ColumnInfo(name = "output")
    public Data output;

    @ColumnInfo(name = "period_start_time")
    public long periodStartTime;

    @IntRange(from = 0)
    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @NonNull
    @ColumnInfo(name = "state")
    public WorkInfo.State state;

    @NonNull
    @ColumnInfo(name = "worker_class_name")
    public String workerClassName;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24568a = Logger.tagWithPrefix("WorkSpec");
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER = new a();

    public static class IdAndState {

        @ColumnInfo(name = "id")
        public String id;

        @ColumnInfo(name = "state")
        public WorkInfo.State state;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            if (this.state != idAndState.state) {
                return false;
            }
            return this.id.equals(idAndState.id);
        }

        public int hashCode() {
            return this.state.hashCode() + (this.id.hashCode() * 31);
        }
    }

    public static class WorkInfoPojo {

        @ColumnInfo(name = "id")
        public String id;

        @ColumnInfo(name = "output")
        public Data output;

        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        public List<Data> progress;

        @ColumnInfo(name = "run_attempt_count")
        public int runAttemptCount;

        @ColumnInfo(name = "state")
        public WorkInfo.State state;

        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {LogKeysKt.TAG})
        public List<String> tags;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            if (this.runAttemptCount != workInfoPojo.runAttemptCount) {
                return false;
            }
            String str = this.id;
            if (str == null ? workInfoPojo.id != null : !str.equals(workInfoPojo.id)) {
                return false;
            }
            if (this.state != workInfoPojo.state) {
                return false;
            }
            Data data = this.output;
            if (data == null ? workInfoPojo.output != null : !data.equals(workInfoPojo.output)) {
                return false;
            }
            List<String> list = this.tags;
            if (list == null ? workInfoPojo.tags != null : !list.equals(workInfoPojo.tags)) {
                return false;
            }
            List<Data> list2 = this.progress;
            List<Data> list3 = workInfoPojo.progress;
            if (list2 != null) {
                return list2.equals(list3);
            }
            return list3 == null;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            WorkInfo.State state = this.state;
            int iHashCode2 = (iHashCode + (state != null ? state.hashCode() : 0)) * 31;
            Data data = this.output;
            int iHashCode3 = (((iHashCode2 + (data != null ? data.hashCode() : 0)) * 31) + this.runAttemptCount) * 31;
            List<String> list = this.tags;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<Data> list2 = this.progress;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        @NonNull
        public WorkInfo toWorkInfo() {
            List<Data> list = this.progress;
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags, (list == null || list.isEmpty()) ? Data.EMPTY : this.progress.get(0), this.runAttemptCount);
        }
    }

    public class a implements Function<List<WorkInfoPojo>, List<WorkInfo>> {
        @Override // androidx.arch.core.util.Function
        public final List<WorkInfo> apply(List<WorkInfoPojo> list) {
            List<WorkInfoPojo> list2 = list;
            if (list2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list2.size());
            Iterator<WorkInfoPojo> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toWorkInfo());
            }
            return arrayList;
        }
    }

    public WorkSpec(@NonNull String str, @NonNull String str2) {
        this.state = WorkInfo.State.ENQUEUED;
        Data data = Data.EMPTY;
        this.input = data;
        this.output = data;
        this.constraints = Constraints.NONE;
        this.backoffPolicy = BackoffPolicy.EXPONENTIAL;
        this.backoffDelayDuration = 30000L;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = str;
        this.workerClassName = str2;
    }

    public long calculateNextRunTime() {
        if (isBackedOff()) {
            return Math.min(WorkRequest.MAX_BACKOFF_MILLIS, this.backoffPolicy == BackoffPolicy.LINEAR ? this.backoffDelayDuration * ((long) this.runAttemptCount) : (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1)) + this.periodStartTime;
        }
        if (!isPeriodic()) {
            long jCurrentTimeMillis = this.periodStartTime;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.initialDelay;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.periodStartTime;
        long j11 = j10 == 0 ? jCurrentTimeMillis2 + this.initialDelay : j10;
        long j12 = this.flexDuration;
        long j13 = this.intervalDuration;
        if (j12 != j13) {
            return j11 + j13 + (j10 == 0 ? j12 * (-1) : 0L);
        }
        return j11 + (j10 != 0 ? j13 : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkSpec.class != obj.getClass()) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.initialDelay != workSpec.initialDelay || this.intervalDuration != workSpec.intervalDuration || this.flexDuration != workSpec.flexDuration || this.runAttemptCount != workSpec.runAttemptCount || this.backoffDelayDuration != workSpec.backoffDelayDuration || this.periodStartTime != workSpec.periodStartTime || this.minimumRetentionDuration != workSpec.minimumRetentionDuration || this.scheduleRequestedAt != workSpec.scheduleRequestedAt || this.expedited != workSpec.expedited || !this.id.equals(workSpec.id) || this.state != workSpec.state || !this.workerClassName.equals(workSpec.workerClassName)) {
            return false;
        }
        String str = this.inputMergerClassName;
        if (str == null ? workSpec.inputMergerClassName == null : str.equals(workSpec.inputMergerClassName)) {
            return this.input.equals(workSpec.input) && this.output.equals(workSpec.output) && this.constraints.equals(workSpec.constraints) && this.backoffPolicy == workSpec.backoffPolicy && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy;
        }
        return false;
    }

    public boolean hasConstraints() {
        return !Constraints.NONE.equals(this.constraints);
    }

    public int hashCode() {
        int iC = n1.c(this.workerClassName, (this.state.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
        String str = this.inputMergerClassName;
        int iHashCode = (this.output.hashCode() + ((this.input.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.initialDelay;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.intervalDuration;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.flexDuration;
        int iHashCode2 = (this.backoffPolicy.hashCode() + ((((this.constraints.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.runAttemptCount) * 31)) * 31;
        long j13 = this.backoffDelayDuration;
        int i12 = (iHashCode2 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.periodStartTime;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.minimumRetentionDuration;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.scheduleRequestedAt;
        return this.outOfQuotaPolicy.hashCode() + ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.expedited ? 1 : 0)) * 31);
    }

    public boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public void setBackoffDelayDuration(long j10) {
        String str = f24568a;
        if (j10 > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(str, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j10 = 18000000;
        }
        if (j10 < 10000) {
            Logger.get().warning(str, "Backoff delay duration less than minimum value", new Throwable[0]);
            j10 = 10000;
        }
        this.backoffDelayDuration = j10;
    }

    public void setPeriodic(long j10) {
        if (j10 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(f24568a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS)), new Throwable[0]);
            j10 = 900000;
        }
        setPeriodic(j10, j10);
    }

    @NonNull
    public String toString() {
        return d.f(new StringBuilder("{WorkSpec: "), this.id, "}");
    }

    public void setPeriodic(long j10, long j11) {
        String str = f24568a;
        if (j10 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(str, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS)), new Throwable[0]);
            j10 = 900000;
        }
        if (j11 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(str, String.format("Flex duration lesser than minimum allowed value; Changed to %s", Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS)), new Throwable[0]);
            j11 = 300000;
        }
        if (j11 > j10) {
            Logger.get().warning(str, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j10)), new Throwable[0]);
            j11 = j10;
        }
        this.intervalDuration = j10;
        this.flexDuration = j11;
    }

    public WorkSpec(@NonNull WorkSpec workSpec) {
        this.state = WorkInfo.State.ENQUEUED;
        Data data = Data.EMPTY;
        this.input = data;
        this.output = data;
        this.constraints = Constraints.NONE;
        this.backoffPolicy = BackoffPolicy.EXPONENTIAL;
        this.backoffDelayDuration = 30000L;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = workSpec.id;
        this.workerClassName = workSpec.workerClassName;
        this.state = workSpec.state;
        this.inputMergerClassName = workSpec.inputMergerClassName;
        this.input = new Data(workSpec.input);
        this.output = new Data(workSpec.output);
        this.initialDelay = workSpec.initialDelay;
        this.intervalDuration = workSpec.intervalDuration;
        this.flexDuration = workSpec.flexDuration;
        this.constraints = new Constraints(workSpec.constraints);
        this.runAttemptCount = workSpec.runAttemptCount;
        this.backoffPolicy = workSpec.backoffPolicy;
        this.backoffDelayDuration = workSpec.backoffDelayDuration;
        this.periodStartTime = workSpec.periodStartTime;
        this.minimumRetentionDuration = workSpec.minimumRetentionDuration;
        this.scheduleRequestedAt = workSpec.scheduleRequestedAt;
        this.expedited = workSpec.expedited;
        this.outOfQuotaPolicy = workSpec.outOfQuotaPolicy;
    }
}

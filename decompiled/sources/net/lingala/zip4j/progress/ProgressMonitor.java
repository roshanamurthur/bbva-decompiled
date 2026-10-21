package net.lingala.zip4j.progress;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;

/* JADX INFO: loaded from: classes12.dex */
public class ProgressMonitor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85101d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f85103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Result f85104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Exception f85105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f85107j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Task f85102e = Task.NONE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public State f85098a = State.READY;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {
        private static final /* synthetic */ Result[] $VALUES;
        public static final Result CANCELLED;
        public static final Result ERROR;
        public static final Result SUCCESS;
        public static final Result WORK_IN_PROGRESS;

        static {
            Result result = new Result(NotifyProvisionResult.SUCCESS_RESULT, 0);
            SUCCESS = result;
            Result result2 = new Result("WORK_IN_PROGRESS", 1);
            WORK_IN_PROGRESS = result2;
            Result result3 = new Result("ERROR", 2);
            ERROR = result3;
            Result result4 = new Result("CANCELLED", 3);
            CANCELLED = result4;
            $VALUES = new Result[]{result, result2, result3, result4};
        }

        public Result() {
            throw null;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State BUSY;
        public static final State READY;

        static {
            State state = new State("READY", 0);
            READY = state;
            State state2 = new State("BUSY", 1);
            BUSY = state2;
            $VALUES = new State[]{state, state2};
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Task {
        private static final /* synthetic */ Task[] $VALUES;
        public static final Task ADD_ENTRY;
        public static final Task CALCULATE_CRC;
        public static final Task EXTRACT_ENTRY;
        public static final Task MERGE_ZIP_FILES;
        public static final Task NONE;
        public static final Task REMOVE_ENTRY;
        public static final Task RENAME_FILE;
        public static final Task SET_COMMENT;

        static {
            Task task = new Task(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = task;
            Task task2 = new Task("ADD_ENTRY", 1);
            ADD_ENTRY = task2;
            Task task3 = new Task("REMOVE_ENTRY", 2);
            REMOVE_ENTRY = task3;
            Task task4 = new Task("CALCULATE_CRC", 3);
            CALCULATE_CRC = task4;
            Task task5 = new Task("EXTRACT_ENTRY", 4);
            EXTRACT_ENTRY = task5;
            Task task6 = new Task("MERGE_ZIP_FILES", 5);
            MERGE_ZIP_FILES = task6;
            Task task7 = new Task("SET_COMMENT", 6);
            SET_COMMENT = task7;
            Task task8 = new Task("RENAME_FILE", 7);
            RENAME_FILE = task8;
            $VALUES = new Task[]{task, task2, task3, task4, task5, task6, task7, task8};
        }

        public Task() {
            throw null;
        }

        public static Task valueOf(String str) {
            return (Task) Enum.valueOf(Task.class, str);
        }

        public static Task[] values() {
            return (Task[]) $VALUES.clone();
        }
    }

    public void endProgressMonitor() {
        this.f85104g = Result.SUCCESS;
        this.f85101d = 100;
        this.f85102e = Task.NONE;
        this.f85098a = State.READY;
    }

    public void fullReset() {
        this.f85102e = Task.NONE;
        this.f85098a = State.READY;
        this.f85103f = null;
        this.f85099b = 0L;
        this.f85100c = 0L;
        this.f85101d = 0;
    }

    public Task getCurrentTask() {
        return this.f85102e;
    }

    public Exception getException() {
        return this.f85105h;
    }

    public String getFileName() {
        return this.f85103f;
    }

    public int getPercentDone() {
        return this.f85101d;
    }

    public Result getResult() {
        return this.f85104g;
    }

    public State getState() {
        return this.f85098a;
    }

    public long getTotalWork() {
        return this.f85099b;
    }

    public long getWorkCompleted() {
        return this.f85100c;
    }

    public boolean isCancelAllTasks() {
        return this.f85106i;
    }

    public boolean isPause() {
        return this.f85107j;
    }

    public void setCancelAllTasks(boolean z10) {
        this.f85106i = z10;
    }

    public void setCurrentTask(Task task) {
        this.f85102e = task;
    }

    public void setException(Exception exc) {
        this.f85105h = exc;
    }

    public void setFileName(String str) {
        this.f85103f = str;
    }

    public void setPause(boolean z10) {
        this.f85107j = z10;
    }

    public void setPercentDone(int i10) {
        this.f85101d = i10;
    }

    public void setResult(Result result) {
        this.f85104g = result;
    }

    public void setState(State state) {
        this.f85098a = state;
    }

    public void setTotalWork(long j10) {
        this.f85099b = j10;
    }

    public void updateWorkCompleted(long j10) {
        long j11 = this.f85100c + j10;
        this.f85100c = j11;
        long j12 = this.f85099b;
        if (j12 > 0) {
            int i10 = (int) ((j11 * 100) / j12);
            this.f85101d = i10;
            if (i10 > 100) {
                this.f85101d = 100;
            }
        }
        while (this.f85107j) {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public void endProgressMonitor(Exception exc) {
        this.f85104g = Result.ERROR;
        this.f85105h = exc;
        this.f85102e = Task.NONE;
        this.f85098a = State.READY;
    }
}

package androidx.work;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OneTimeWorkRequest extends WorkRequest {
    @NonNull
    public static OneTimeWorkRequest from(@NonNull Class<? extends ListenableWorker> cls) {
        return new Builder(cls).build();
    }

    @NonNull
    public static List<OneTimeWorkRequest> from(@NonNull List<Class<? extends ListenableWorker>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Class<? extends ListenableWorker>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Builder(it.next()).build());
        }
        return arrayList;
    }

    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        public Builder(@NonNull Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f24335c.inputMergerClassName = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.WorkRequest.Builder
        @NonNull
        public final WorkRequest a() {
            if (this.f24333a && this.f24335c.constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new OneTimeWorkRequest(this.f24334b, this.f24335c, this.f24336d);
        }

        @NonNull
        public Builder setInputMerger(@NonNull Class<? extends InputMerger> cls) {
            this.f24335c.inputMergerClassName = cls.getName();
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        @NonNull
        public final WorkRequest.Builder b() {
            return this;
        }
    }
}

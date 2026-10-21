package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24325d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f24326a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f24327b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f24328c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f24329d = new ArrayList();

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromIds(@NonNull List<UUID> list) {
            Builder builder = new Builder();
            builder.addIds(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromStates(@NonNull List<WorkInfo.State> list) {
            Builder builder = new Builder();
            builder.addStates(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromTags(@NonNull List<String> list) {
            Builder builder = new Builder();
            builder.addTags(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromUniqueWorkNames(@NonNull List<String> list) {
            Builder builder = new Builder();
            builder.addUniqueWorkNames(list);
            return builder;
        }

        @NonNull
        public Builder addIds(@NonNull List<UUID> list) {
            this.f24326a.addAll(list);
            return this;
        }

        @NonNull
        public Builder addStates(@NonNull List<WorkInfo.State> list) {
            this.f24329d.addAll(list);
            return this;
        }

        @NonNull
        public Builder addTags(@NonNull List<String> list) {
            this.f24328c.addAll(list);
            return this;
        }

        @NonNull
        public Builder addUniqueWorkNames(@NonNull List<String> list) {
            this.f24327b.addAll(list);
            return this;
        }

        @NonNull
        public WorkQuery build() {
            if (this.f24326a.isEmpty() && this.f24327b.isEmpty() && this.f24328c.isEmpty() && this.f24329d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this);
        }
    }

    public WorkQuery(@NonNull Builder builder) {
        this.f24322a = builder.f24326a;
        this.f24323b = builder.f24327b;
        this.f24324c = builder.f24328c;
        this.f24325d = builder.f24329d;
    }

    @NonNull
    public List<UUID> getIds() {
        return this.f24322a;
    }

    @NonNull
    public List<WorkInfo.State> getStates() {
        return this.f24325d;
    }

    @NonNull
    public List<String> getTags() {
        return this.f24324c;
    }

    @NonNull
    public List<String> getUniqueWorkNames() {
        return this.f24323b;
    }
}

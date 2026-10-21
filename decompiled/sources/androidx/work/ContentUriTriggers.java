package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ContentUriTriggers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f24276a = new HashSet();

    public static final class Trigger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Uri f24277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24278b;

        public Trigger(@NonNull Uri uri, boolean z10) {
            this.f24277a = uri;
            this.f24278b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Trigger.class != obj.getClass()) {
                return false;
            }
            Trigger trigger = (Trigger) obj;
            return this.f24278b == trigger.f24278b && this.f24277a.equals(trigger.f24277a);
        }

        @NonNull
        public Uri getUri() {
            return this.f24277a;
        }

        public int hashCode() {
            return (this.f24277a.hashCode() * 31) + (this.f24278b ? 1 : 0);
        }

        public boolean shouldTriggerForDescendants() {
            return this.f24278b;
        }
    }

    public void add(@NonNull Uri uri, boolean z10) {
        this.f24276a.add(new Trigger(uri, z10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContentUriTriggers.class != obj.getClass()) {
            return false;
        }
        return this.f24276a.equals(((ContentUriTriggers) obj).f24276a);
    }

    @NonNull
    public Set<Trigger> getTriggers() {
        return this.f24276a;
    }

    public int hashCode() {
        return this.f24276a.hashCode();
    }

    public int size() {
        return this.f24276a.size();
    }
}

package rd;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;

/* JADX INFO: compiled from: AutoValue_Event.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a<T> extends Event<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f92989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f92990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Priority f92991c;

    public a(@Nullable Integer num, T t10, Priority priority) {
        this.f92989a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f92990b = t10;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.f92991c = priority;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.f92989a;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.f92990b.equals(event.getPayload()) && this.f92991c.equals(event.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public final Integer getCode() {
        return this.f92989a;
    }

    @Override // com.google.android.datatransport.Event
    public final T getPayload() {
        return this.f92990b;
    }

    @Override // com.google.android.datatransport.Event
    public final Priority getPriority() {
        return this.f92991c;
    }

    public final int hashCode() {
        Integer num = this.f92989a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f92990b.hashCode()) * 1000003) ^ this.f92991c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f92989a + ", payload=" + this.f92990b + ", priority=" + this.f92991c + "}";
    }
}

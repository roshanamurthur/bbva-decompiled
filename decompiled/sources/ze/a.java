package ze;

import androidx.collection.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends com.google.android.play.integrity.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f95060a;

    public a(long j10) {
        this.f95060a = j10;
    }

    @Override // com.google.android.play.integrity.internal.e
    public final int a() {
        return 3;
    }

    @Override // com.google.android.play.integrity.internal.e
    public final long b() {
        return this.f95060a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.integrity.internal.e) {
            com.google.android.play.integrity.internal.e eVar = (com.google.android.play.integrity.internal.e) obj;
            eVar.a();
            if (this.f95060a == eVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f95060a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ (-724379968);
    }

    public final String toString() {
        return h.d(new StringBuilder("EventRecord{eventType=3, eventTimestamp="), this.f95060a, "}");
    }
}

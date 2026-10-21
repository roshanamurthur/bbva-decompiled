package androidx.work.impl.constraints;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24492d;

    public NetworkState(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f24489a = z10;
        this.f24490b = z11;
        this.f24491c = z12;
        this.f24492d = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.f24489a == networkState.f24489a && this.f24490b == networkState.f24490b && this.f24491c == networkState.f24491c && this.f24492d == networkState.f24492d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public int hashCode() {
        boolean z10 = this.f24490b;
        ?? r1 = this.f24489a;
        int i10 = r1;
        if (z10) {
            i10 = r1 + 16;
        }
        int i11 = i10;
        if (this.f24491c) {
            i11 = i10 + 256;
        }
        return this.f24492d ? i11 + 4096 : i11;
    }

    public boolean isConnected() {
        return this.f24489a;
    }

    public boolean isMetered() {
        return this.f24491c;
    }

    public boolean isNotRoaming() {
        return this.f24492d;
    }

    public boolean isValidated() {
        return this.f24490b;
    }

    @NonNull
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f24489a), Boolean.valueOf(this.f24490b), Boolean.valueOf(this.f24491c), Boolean.valueOf(this.f24492d));
    }
}

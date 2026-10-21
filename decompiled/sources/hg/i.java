package hg;

import com.google.firebase.iid.InstanceIdResult;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements InstanceIdResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69438b;

    public i(String str, String str2) {
        this.f69437a = str;
        this.f69438b = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getId() {
        return this.f69437a;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getToken() {
        return this.f69438b;
    }
}

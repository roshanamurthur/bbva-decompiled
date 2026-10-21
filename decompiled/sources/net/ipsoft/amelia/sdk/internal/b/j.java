package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes12.dex */
public class j extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f84732d = null;

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(Reader reader) {
        this.f84732d = k.a(new JsonReader(reader));
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public String toString() {
        return "{ data: " + this.f84732d + ", error: " + this.f84764f + " }";
    }
}

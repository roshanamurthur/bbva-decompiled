package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes12.dex */
public class r extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f84766b = null;

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(Reader reader) {
        this.f84766b = s.a(new JsonReader(reader));
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ data: ");
        s sVar = this.f84766b;
        sb2.append(sVar == null ? null : Integer.valueOf(sVar.hashCode()));
        sb2.append(", error: ");
        l lVar = this.f84764f;
        sb2.append(lVar != null ? Integer.valueOf(lVar.hashCode()) : null);
        sb2.append(" }");
        return sb2.toString();
    }
}

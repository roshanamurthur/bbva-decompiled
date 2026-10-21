package net.ipsoft.amelia.sdk.internal.b;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public class ab extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f84686a;

    public ab(File file) {
        this.f84686a = file;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(InputStream inputStream) throws IOException {
        net.ipsoft.amelia.sdk.internal.common.j.a(inputStream, this.f84686a);
    }
}

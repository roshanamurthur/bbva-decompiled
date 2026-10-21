package ik;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends ByteArrayOutputStream {
    public a(int i10) {
        super(i10);
    }

    @NotNull
    public final byte[] getBuffer() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}

package net.lingala.zip4j.io.inputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class ZipStandardSplitInputStream extends SplitInputStream {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f84963s0;

    public ZipStandardSplitInputStream(File file, boolean z10, int i10) throws FileNotFoundException {
        super(file, z10, i10);
        this.f84963s0 = i10;
    }

    @Override // net.lingala.zip4j.io.inputstream.SplitInputStream
    public File getNextSplitFile(int i10) throws IOException {
        if (i10 == this.f84963s0) {
            return this.zipFile;
        }
        String canonicalPath = this.zipFile.getCanonicalPath();
        return new File(canonicalPath.substring(0, canonicalPath.lastIndexOf(Constant.DOT_STRING)) + (i10 >= 9 ? ".z" : ".z0") + (i10 + 1));
    }
}

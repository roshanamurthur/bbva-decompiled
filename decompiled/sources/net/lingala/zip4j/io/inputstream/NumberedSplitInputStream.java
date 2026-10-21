package net.lingala.zip4j.io.inputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import mx.openpay.library.domain.util.Constant;
import net.lingala.zip4j.util.FileUtils;

/* JADX INFO: loaded from: classes12.dex */
public class NumberedSplitInputStream extends SplitInputStream {
    public NumberedSplitInputStream(File file, boolean z10, int i10) throws FileNotFoundException {
        super(file, z10, i10);
    }

    @Override // net.lingala.zip4j.io.inputstream.SplitInputStream
    public File getNextSplitFile(int i10) throws IOException {
        String canonicalPath = this.zipFile.getCanonicalPath();
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(canonicalPath.substring(0, canonicalPath.lastIndexOf(Constant.DOT_STRING)));
        sbD.append(FileUtils.getNextNumberedSplitFileCounterAsExtension(i10));
        return new File(sbD.toString());
    }
}

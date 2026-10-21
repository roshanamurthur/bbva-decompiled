package z2;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: MultiDexExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}

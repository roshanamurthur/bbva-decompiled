package net.lingala.zip4j.tasks;

import androidx.camera.core.impl.utils.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipModel;

/* JADX INFO: compiled from: AbstractModifyFileTask.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b<T> extends AsyncZipTask<T> {
    public static void a(File file, File file2, boolean z10) throws ZipException {
        if (!z10) {
            if (!file2.delete()) {
                throw new ZipException("Could not delete temporary file");
            }
        } else {
            if (!file.delete()) {
                throw new ZipException("cannot delete old zip file");
            }
            if (!file2.renameTo(file)) {
                throw new ZipException("cannot rename modified zip file");
            }
        }
    }

    public static int b(ArrayList arrayList, FileHeader fileHeader) throws ZipException {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((FileHeader) arrayList.get(i10)).equals(fileHeader)) {
                return i10;
            }
        }
        throw new ZipException("Could not find file header in list of central directory file headers");
    }

    public static File c(String str) {
        Random random = new Random();
        StringBuilder sbD = c.d(str);
        sbD.append(random.nextInt(10000));
        File file = new File(sbD.toString());
        while (file.exists()) {
            StringBuilder sbD2 = c.d(str);
            sbD2.append(random.nextInt(10000));
            file = new File(sbD2.toString());
        }
        return file;
    }

    public static void d(ArrayList arrayList, ZipModel zipModel, FileHeader fileHeader, long j10) throws ZipException {
        int iB = b(arrayList, fileHeader);
        if (iB == -1) {
            throw new ZipException("Could not locate modified file header in zipModel");
        }
        while (true) {
            iB++;
            if (iB >= arrayList.size()) {
                return;
            }
            FileHeader fileHeader2 = (FileHeader) arrayList.get(iB);
            fileHeader2.setOffsetLocalHeader(fileHeader2.getOffsetLocalHeader() + j10);
            if (zipModel.isZip64Format() && fileHeader2.getZip64ExtendedInfo() != null && fileHeader2.getZip64ExtendedInfo().getOffsetLocalHeader() != -1) {
                fileHeader2.getZip64ExtendedInfo().setOffsetLocalHeader(fileHeader2.getZip64ExtendedInfo().getOffsetLocalHeader() + j10);
            }
        }
    }
}

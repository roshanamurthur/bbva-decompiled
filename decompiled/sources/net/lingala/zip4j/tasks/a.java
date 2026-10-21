package net.lingala.zip4j.tasks;

import java.util.Comparator;
import net.lingala.zip4j.model.FileHeader;

/* JADX INFO: compiled from: AbstractModifyFileTask.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements Comparator<FileHeader> {
    @Override // java.util.Comparator
    public final int compare(FileHeader fileHeader, FileHeader fileHeader2) {
        FileHeader fileHeader3 = fileHeader;
        FileHeader fileHeader4 = fileHeader2;
        if (fileHeader3.getFileName().equals(fileHeader4.getFileName())) {
            return 0;
        }
        return fileHeader3.getOffsetLocalHeader() < fileHeader4.getOffsetLocalHeader() ? -1 : 1;
    }
}

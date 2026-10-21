package com.adobe.marketing.mobile;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
interface CompressedFileService {

    public enum FileType {
        ZIP,
        TAR
    }

    boolean extract(File file, FileType fileType, String str);
}

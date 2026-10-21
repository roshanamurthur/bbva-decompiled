package com.sun.mail.util;

import java.io.IOException;
import javax.mail.Folder;

/* JADX INFO: loaded from: classes9.dex */
public class FolderClosedIOException extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final transient Folder f65549p0;

    public FolderClosedIOException(Folder folder) {
        this(folder, null);
    }

    public Folder getFolder() {
        return this.f65549p0;
    }

    public FolderClosedIOException(Folder folder, String str) {
        super(str);
        this.f65549p0 = folder;
    }
}

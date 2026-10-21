package com.esotericsoftware.kryo.serializers;

import java.nio.file.FileSystemException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 {
    public static /* synthetic */ FileSystemException e(String str, String str2) {
        return new FileSystemException(str, str2, "Recursively copying a directory into its subdirectory is prohibited.");
    }
}

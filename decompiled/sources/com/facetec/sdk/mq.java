package com.facetec.sdk;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public interface mq {

    /* JADX INFO: renamed from: com.facetec.sdk.mq$4, reason: invalid class name */
    public class AnonymousClass4 implements mq {
        @Override // com.facetec.sdk.mq
        public final void d(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }
    }

    void d(File file) throws IOException;
}

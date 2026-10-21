package com.google.firebase.crashlytics.internal.metadata;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: QueueFileLogStore.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements QueueFile.ElementReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f47860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f47861b;

    public a(byte[] bArr, int[] iArr) {
        this.f47860a = bArr;
        this.f47861b = iArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
    public final void read(InputStream inputStream, int i10) throws IOException {
        int[] iArr = this.f47861b;
        try {
            inputStream.read(this.f47860a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            inputStream.close();
        }
    }
}

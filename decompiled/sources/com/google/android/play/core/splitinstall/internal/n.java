package com.google.android.play.core.splitinstall.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class n implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f46268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46270c;

    public n(FileChannel fileChannel, long j10, long j11) {
        this.f46268a = fileChannel;
        this.f46269b = j10;
        this.f46270c = j11;
    }

    @Override // com.google.android.play.core.splitinstall.internal.g
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f46268a.map(FileChannel.MapMode.READ_ONLY, this.f46269b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.g
    public final long zza() {
        return this.f46270c;
    }
}

package com.huawei.hms.feature.h;

import android.annotation.TargetApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes10.dex */
interface a {

    /* JADX INFO: renamed from: com.huawei.hms.feature.h.a$a, reason: collision with other inner class name */
    public static final class C0225a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f50334a;

        public C0225a(ByteBuffer byteBuffer) {
            this.f50334a = byteBuffer.slice();
        }

        @Override // com.huawei.hms.feature.h.a
        public void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
            ByteBuffer byteBufferSlice;
            synchronized (this.f50334a) {
                int i11 = (int) j10;
                this.f50334a.position(i11);
                this.f50334a.limit(i11 + i10);
                byteBufferSlice = this.f50334a.slice();
            }
            for (MessageDigest messageDigest : messageDigestArr) {
                byteBufferSlice.position(0);
                messageDigest.update(byteBufferSlice);
            }
        }

        @Override // com.huawei.hms.feature.h.a
        public long size() {
            return this.f50334a.capacity();
        }
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileChannel f50335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f50336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f50337c;

        public b(FileChannel fileChannel, long j10, long j11) {
            this.f50335a = fileChannel;
            this.f50336b = j10;
            this.f50337c = j11;
        }

        @Override // com.huawei.hms.feature.h.a
        @TargetApi(21)
        public void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
            MappedByteBuffer map = this.f50335a.map(FileChannel.MapMode.READ_ONLY, this.f50336b + j10, i10);
            map.load();
            for (MessageDigest messageDigest : messageDigestArr) {
                map.position(0);
                messageDigest.update(map);
            }
        }

        @Override // com.huawei.hms.feature.h.a
        public long size() {
            return this.f50337c;
        }
    }

    void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException;

    long size();
}

package com.google.firebase.crashlytics.internal.metadata;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: QueueFileLogStore.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements yf.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f47862d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f47863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47864b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QueueFile f47865c;

    /* JADX INFO: compiled from: QueueFileLogStore.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f47866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47867b;

        public a(byte[] bArr, int i10) {
            this.f47866a = bArr;
            this.f47867b = i10;
        }
    }

    public b(File file) {
        this.f47863a = file;
    }

    @Override // yf.b
    public final void a() {
        CommonUtils.closeOrLog(this.f47865c, "There was a problem closing the Crashlytics log file.");
        this.f47865c = null;
    }

    @Override // yf.b
    public final String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f47862d);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // yf.b
    public final byte[] c() {
        a aVar;
        if (this.f47863a.exists()) {
            f();
            QueueFile queueFile = this.f47865c;
            if (queueFile == null) {
                aVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr = new byte[queueFile.r()];
                try {
                    this.f47865c.g(new com.google.firebase.crashlytics.internal.metadata.a(bArr, iArr));
                } catch (IOException e5) {
                    Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e5);
                }
                aVar = new a(bArr, iArr[0]);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.f47867b;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(aVar.f47866a, 0, bArr2, 0, i10);
        return bArr2;
    }

    @Override // yf.b
    public final void d() {
        a();
        this.f47863a.delete();
    }

    @Override // yf.b
    public final void e(long j10, String str) {
        f();
        int i10 = this.f47864b;
        if (this.f47865c == null) {
            return;
        }
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        try {
            int i11 = i10 / 4;
            if (str.length() > i11) {
                str = "..." + str.substring(str.length() - i11);
            }
            this.f47865c.c(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll(RootService.LINE_BREAK, " ")).getBytes(f47862d));
            while (!this.f47865c.l() && this.f47865c.r() > i10) {
                this.f47865c.o();
            }
        } catch (IOException e5) {
            Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e5);
        }
    }

    public final void f() {
        File file = this.f47863a;
        if (this.f47865c == null) {
            try {
                this.f47865c = new QueueFile(file);
            } catch (IOException e5) {
                Logger.getLogger().e("Could not open log file: " + file, e5);
            }
        }
    }
}

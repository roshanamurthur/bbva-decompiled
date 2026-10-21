package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class acd implements aco {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52385q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52386r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final aco f52387p0;

    public acd(@NotNull aco acoVar) {
        Intrinsics.checkNotNullParameter(acoVar, "");
        this.f52387p0 = acoVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        acd acdVar = (acd) objArr[0];
        int i13 = f52385q0;
        int i14 = (i13 & 43) + (i13 | 43);
        f52386r0 = i14 % 128;
        int i15 = i14 % 2;
        aco acoVar = acdVar.f52387p0;
        if (i15 == 0) {
            acoVar.setY();
            throw null;
        }
        acq y7 = acoVar.setY();
        int i16 = f52385q0;
        int i17 = (((i16 ^ 53) | (i16 & 53)) << 1) - (((~i16) & 53) | (i16 & (-54)));
        f52386r0 = i17 % 128;
        int i18 = i17 % 2;
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = f52385q0;
        int i11 = (i10 & 23) + (i10 | 23);
        f52386r0 = i11 % 128;
        int i12 = i11 % 2;
        this.f52387p0.close();
        if (i12 == 0) {
            throw null;
        }
        int i13 = ((-1) << 1) - ((f52386r0 + 22) ^ (-1));
        f52385q0 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 24 / 0;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Flushable
    public void flush() throws IOException {
        int i10 = f52386r0;
        int i11 = i10 & 33;
        int i12 = -(-((i10 ^ 33) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f52385q0 = i13 % 128;
        int i14 = i13 % 2;
        this.f52387p0.flush();
        int i15 = f52386r0;
        int i16 = i15 ^ 75;
        int i17 = ((i15 & 75) | i16) << 1;
        int i18 = -i16;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        f52385q0 = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 62 / 0;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    @NotNull
    public final acq setY() {
        return (acq) setDividerPadding(new Object[]{this}, 1660500344, -1660500344, System.identityHashCode(this));
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append(RootService.OPEN_BRACKET);
        sb2.append(this.f52387p0);
        sb2.append(RootService.CLOSE_BRACKET);
        String string = sb2.toString();
        int i10 = f52385q0;
        int i11 = (i10 & (-8)) | ((~i10) & 7);
        int i12 = (i10 & 7) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52386r0 = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    public void setDividerPadding(@NotNull abx abxVar, long j10) throws IOException {
        int i10 = f52386r0;
        int i11 = ((i10 ^ 65) | (i10 & 65)) << 1;
        int i12 = -(((~i10) & 65) | (i10 & (-66)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52385q0 = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(abxVar, "");
        this.f52387p0.setDividerPadding(abxVar, j10);
        int i15 = f52386r0;
        int i16 = (i15 & 59) + (i15 | 59);
        f52385q0 = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }
}

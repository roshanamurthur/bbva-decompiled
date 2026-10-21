package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/Metadata;", "Ljava/io/Closeable;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "()V", "", "p0", "[B", "setCompoundDrawableTintBlendMode", "()[B", "setY", "<init>", "([B)V"}, k = 1, mv = {1, 5, 1})
public final class Metadata implements Closeable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f51781q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f51782r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setY;

    public Metadata(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setY = bArr;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        int i19 = ((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14;
        byte[] bArr = null;
        if (i19 != 1) {
            Metadata metadata = (Metadata) objArr[0];
            int i20 = f51781q0 + 17;
            f51782r0 = i20 % 128;
            if (i20 % 2 == 0) {
                Random.INSTANCE.nextBytes(metadata.setY);
                int i21 = 89 / 0;
            } else {
                Random.INSTANCE.nextBytes(metadata.setY);
            }
            int i22 = f51781q0 + 47;
            f51782r0 = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 65 / 0;
            }
        } else {
            Metadata metadata2 = (Metadata) objArr[0];
            int i24 = f51782r0;
            int i25 = (i24 ^ 11) + ((i24 & 11) << 1);
            f51781q0 = i25 % 128;
            if (i25 % 2 != 0) {
                byte[] bArr2 = metadata2.setY;
                throw null;
            }
            bArr = metadata2.setY;
            int i26 = i24 + 103;
            f51781q0 = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 87 / 0;
            }
        }
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setY(new Object[]{this}, -1222766384, 1222766384, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, 1982236974, -1982236973, System.identityHashCode(this));
    }

    public /* synthetic */ Metadata(byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new byte[0] : bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Metadata() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

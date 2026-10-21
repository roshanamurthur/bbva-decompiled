package com.veridas.util;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/veridas/util/Base64;", "", "()V", "Companion", "Encoder", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Base64 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String[] f67480a = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "J", "K", "L", "M", "N", "O", "P", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", SharedPrefsStorage.VERSION_KEY, "w", "x", "y", "z", "0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", StorageTokenBuilder.OTP_LENGTH, "7", "8", "9", "+", "/", "="};

    /* JADX INFO: compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/veridas/util/Base64$Companion;", "", "()V", "LUT", "", "", "getLUT", "()[Ljava/lang/String;", "[Ljava/lang/String;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getLUT() {
            return Base64.f67480a;
        }
    }

    /* JADX INFO: compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lcom/veridas/util/Base64$Encoder;", "Ljava/io/OutputStream;", "", "b", "", "write", "Lkotlin/UByte;", "addByte-7apg3OU", "(B)Lcom/veridas/util/Base64$Encoder;", "addByte", "", "addBytes", "", "get", "<init>", "()V", "Companion", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
    public static final class Encoder extends OutputStream {
        public static final int BITS_IN_BYTE = 8;
        public static final int INPUT_BUFFER_SIZE = 3;
        public static final byte LIMIT_6_BITS = 64;
        public static final int OUTPUT_BUFFER_SIZE = 4;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final byte[] f67481p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f67482q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final byte[] f67483r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NotNull
        public final StringBuilder f67484s0;

        public Encoder() {
            byte[] bArr = new byte[3];
            for (int i10 = 0; i10 < 3; i10++) {
                bArr[i10] = 0;
            }
            this.f67481p0 = bArr;
            byte[] bArr2 = new byte[4];
            for (int i11 = 0; i11 < 4; i11++) {
                bArr2[i11] = 0;
            }
            this.f67483r0 = bArr2;
            this.f67484s0 = new StringBuilder();
        }

        @NotNull
        /* JADX INFO: renamed from: addByte-7apg3OU, reason: not valid java name */
        public final Encoder m5513addByte7apg3OU(byte b10) {
            write(b10 & 255);
            return this;
        }

        @NotNull
        public final Encoder addBytes(@NotNull byte[] b10) throws IOException {
            Intrinsics.checkNotNullParameter(b10, "b");
            write(b10);
            return this;
        }

        public final void b() {
            ArraysKt___ArraysJvmKt.fill$default(this.f67483r0, (byte) 64, 0, 0, 6, (Object) null);
            int i10 = this.f67482q0;
            if (i10 == 0) {
                i10 = 3;
            }
            int i11 = i10 + 1;
            int iM5570constructorimpl = 0;
            for (int i12 = 0; i12 < 3; i12++) {
                iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(iM5570constructorimpl << 8) | UInt.m5570constructorimpl(this.f67481p0[i12]));
            }
            byte bM5570constructorimpl = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(16515072 & iM5570constructorimpl) >>> 18);
            byte[] bArr = this.f67483r0;
            bArr[0] = bM5570constructorimpl;
            bArr[1] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(258048 & iM5570constructorimpl) >>> 12);
            if (i11 > 2) {
                bArr[2] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(iM5570constructorimpl & 4032) >>> 6);
            }
            if (i11 > 3) {
                bArr[3] = (byte) UInt.m5570constructorimpl(iM5570constructorimpl & 63);
            }
            for (int i13 = 0; i13 < 4; i13++) {
                this.f67484s0.append(Base64.INSTANCE.getLUT()[bArr[i13]]);
            }
            ArraysKt___ArraysJvmKt.fill$default(this.f67481p0, (byte) 0, 0, 0, 6, (Object) null);
        }

        @NotNull
        public final String get() {
            if (this.f67482q0 > 0) {
                b();
            }
            String string = this.f67484s0.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @Override // java.io.OutputStream
        public void write(int b10) {
            int i10 = this.f67482q0;
            this.f67481p0[i10] = (byte) b10;
            int i11 = i10 + 1;
            this.f67482q0 = i11;
            if (i11 == 3) {
                b();
                this.f67482q0 = 0;
            }
        }
    }
}

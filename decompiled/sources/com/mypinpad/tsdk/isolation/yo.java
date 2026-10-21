package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/yo;", "", "", "setDividerPadding", "()J", "Lcom/mypinpad/tsdk/i/yj;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/yj;", "Lcom/mypinpad/tsdk/i/abv;", "p0", "", "setY", "(Lcom/mypinpad/tsdk/i/abv;)V", "<init>", "()V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class yo {

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    static {
        int i10 = ((1 | 109) << 1) - (1 ^ 109);
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    public long setDividerPadding() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract yj setOnFocusChangeListener();

    public abstract void setY(@NotNull abv p4) throws IOException;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yo$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J1\u0010\u0011\u001a\u00020\u0004*\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0012"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "()V", "create", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "file", "Ljava/io/File;", "content", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "", "Lokio/ByteString;", "asRequestBody", "toRequestBody", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62163a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62164b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            int length;
            int i13 = ~i11;
            int i14 = ~(i13 | i12);
            int i15 = ~i12;
            int i16 = (((~((~i10) | i12)) | (~(i11 | i15))) * 406) + ((~(i13 | i15 | i10)) * (-406)) + ((i14 | (~(i15 | i10 | i11))) * (-406)) + (i11 * 407) + (i10 * (-405));
            if (i16 == 1) {
                byte[] bArr = (byte[]) objArr[0];
                yj yjVar = (yj) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i17 = f62163a;
                int i18 = i17 & 27;
                int i19 = (i18 - (~(-(-((i17 ^ 27) | i18))))) - 1;
                f62164b = i19 % 128;
                if (i19 % 2 != 0 ? (iIntValue2 & 1) != 0 : (iIntValue2 & 1) != 0) {
                    int i20 = (i17 & 105) + (i17 | 105);
                    f62164b = i20 % 128;
                    int i21 = i20 % 2;
                    yjVar = null;
                }
                if ((iIntValue2 & 4) != 0) {
                    int i22 = (i17 & 45) + (i17 | 45);
                    f62164b = i22 % 128;
                    if (i22 % 2 == 0) {
                        length = bArr.length;
                        int i23 = 2 / 0;
                    } else {
                        length = bArr.length;
                    }
                    iIntValue = length;
                    int i24 = (i17 ^ 77) + ((i17 & 77) << 1);
                    f62164b = i24 % 128;
                    int i25 = i24 % 2;
                }
                yo yoVar = (yo) setOnFocusChangeListener(new Object[]{bArr, yjVar, 0, Integer.valueOf(iIntValue)}, 1801639992, -1801639990, 0);
                int i26 = f62164b;
                int i27 = (i26 ^ 99) + ((i26 & 99) << 1);
                f62163a = i27 % 128;
                int i28 = i27 % 2;
                return yoVar;
            }
            if (i16 == 2) {
                byte[] bArr2 = (byte[]) objArr[0];
                yj yjVar2 = (yj) objArr[1];
                ((Number) objArr[2]).intValue();
                int iIntValue3 = ((Number) objArr[3]).intValue();
                Intrinsics.checkNotNullParameter(bArr2, "");
                yt.setY(new Object[]{Long.valueOf(bArr2.length), 0L, Long.valueOf(iIntValue3)}, 343603623, -343603579, (int) System.currentTimeMillis());
                setY sety = new setY(bArr2, yjVar2, iIntValue3);
                int i29 = f62164b;
                int i30 = (((i29 & (-8)) | ((~i29) & 7)) - (~((i29 & 7) << 1))) - 1;
                f62163a = i30 % 128;
                int i31 = i30 % 2;
                return sety;
            }
            String str = (String) objArr[0];
            yj yjVar3 = (yj) objArr[1];
            int i32 = f62164b;
            int i33 = i32 & 93;
            int i34 = -(-((i32 ^ 93) | i33));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f62163a = i35 % 128;
            int i36 = i35 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Charset charset = Charsets.UTF_8;
            if (yjVar3 != null) {
                int i37 = f62164b;
                int i38 = ((i37 ^ 73) | (i37 & 73)) << 1;
                int i39 = -(((~i37) & 73) | (i37 & (-74)));
                int i40 = (i38 & i39) + (i39 | i38);
                f62163a = i40 % 128;
                int i41 = i40 % 2;
                Charset charset2 = (Charset) yj.setX(new Object[]{yjVar3}, -1228786349, 1228786353, (int) System.currentTimeMillis());
                if (charset2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(yjVar3);
                    sb2.append("; charset=utf-8");
                    yjVar3 = (yj) yj.setX.setDividerPadding(new Object[]{sb2.toString()}, 2075813311, -2075813311, (int) System.currentTimeMillis());
                    int i42 = f62164b;
                    int i43 = ((i42 & 20) + (i42 | 20)) - 1;
                    f62163a = i43 % 128;
                    int i44 = i43 % 2;
                } else {
                    charset = charset2;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            yo yoVar2 = (yo) setOnFocusChangeListener(new Object[]{bytes, yjVar3, 0, Integer.valueOf(bytes.length)}, 1801639992, -1801639990, 0);
            int i45 = f62164b;
            int i46 = ((i45 & (-34)) | ((~i45) & 33)) + ((i45 & 33) << 1);
            f62163a = i46 % 128;
            int i47 = i46 % 2;
            return yoVar2;
        }

        public static /* synthetic */ yo setX(byte[] bArr, yj yjVar, int i10, int i11) {
            return (yo) setOnFocusChangeListener(new Object[]{bArr, yjVar, Integer.valueOf(i10), Integer.valueOf(i11)}, -1850403146, 1850403147, i10);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public static yo setY(@NotNull String str, @Nullable yj yjVar) {
            return (yo) setOnFocusChangeListener(new Object[]{str, yjVar}, 1582490390, -1582490390, (int) System.currentTimeMillis());
        }

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yo$setCompoundDrawableTintBlendMode$setY */
        public final class setY extends yo {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static int f62165e = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yj f62166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f62167b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ byte[] f62168c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f62169d = 0;

            public setY(byte[] bArr, yj yjVar, int i10) {
                this.f62166a = yjVar;
                this.f62167b = i10;
                this.f62168c = bArr;
            }

            public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
                long j10;
                int i13 = ~i11;
                int i14 = i13 | i10;
                int i15 = (((~(i10 | i12)) | (~(i13 | i12)) | (~i14)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i14 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
                if (i15 == 1) {
                    setY sety = (setY) objArr[0];
                    abv abvVar = (abv) objArr[1];
                    int i16 = f62165e;
                    int i17 = (-2) - (((i16 & 98) + (i16 | 98)) ^ (-1));
                    int i18 = i17 % 128;
                    int i19 = i17 % 2;
                    Intrinsics.checkNotNullParameter(abvVar, "");
                    abvVar.setX(sety.f62168c, sety.f62169d, sety.f62167b);
                    int i20 = f62165e;
                    int i21 = i20 & 39;
                    int i22 = (i20 ^ 39) | i21;
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    int i24 = i23 % 128;
                    int i25 = i23 % 2;
                    return null;
                }
                if (i15 != 2) {
                    setY sety2 = (setY) objArr[0];
                    int i26 = f62165e;
                    int i27 = i26 & 75;
                    int i28 = (((i26 & (-76)) | ((~i26) & 75)) - (~(-(-(i27 << 1))))) - 1;
                    int i29 = i28 % 128;
                    int i30 = i28 % 2;
                    int i31 = i27 + (i26 | 75);
                    int i32 = i31 % 128;
                    int i33 = i31 % 2;
                    return sety2.f62166a;
                }
                setY sety3 = (setY) objArr[0];
                int i34 = f62165e;
                int i35 = (i34 ^ 119) + ((i34 & 119) << 1);
                int i36 = i35 % 128;
                int i37 = i35 % 2;
                int i38 = sety3.f62167b;
                if (i37 != 0) {
                    j10 = i38;
                    int i39 = 99 / 0;
                } else {
                    j10 = i38;
                }
                int i40 = i36 & 45;
                int i41 = (((i36 ^ 45) | i40) << 1) - ((i36 | 45) & (~i40));
                f62165e = i41 % 128;
                int i42 = i41 % 2;
                return Long.valueOf(j10);
            }

            @Override // com.mypinpad.tsdk.isolation.yo
            public final long setDividerPadding() {
                return ((Long) setOnFocusChangeListener(new Object[]{this}, -1367448114, 1367448116, System.identityHashCode(this))).longValue();
            }

            @Override // com.mypinpad.tsdk.isolation.yo
            public final void setY(@NotNull abv abvVar) throws IOException {
                setOnFocusChangeListener(new Object[]{this, abvVar}, -1393753595, 1393753596, System.identityHashCode(this));
            }

            @Override // com.mypinpad.tsdk.isolation.yo
            @Nullable
            public final yj setOnFocusChangeListener() {
                return (yj) setOnFocusChangeListener(new Object[]{this}, -765995188, 765995188, System.identityHashCode(this));
            }
        }
    }
}

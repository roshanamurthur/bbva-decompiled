package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\f\u001a\u00020\t8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "a", "[B", "setY", "()[B", "setX", "b", "Lkotlin/Lazy;", "setDividerPadding", "<init>", "([B)V"}, k = 1, mv = {1, 5, 1})
public class setBackgroundTintList {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59489d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59490e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy setY;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final setBackgroundTintList f59488c = new setBackgroundTintList(new byte[]{0, 0, 0, 0, 0});

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()[B"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<byte[]> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f59493q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f59494r0 = 1;

        public a() {
            super(0);
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr;
            int i13 = ~i12;
            int i14 = ~i10;
            int i15 = ~i11;
            if ((((~(i10 | i15)) | (~(i11 | i14))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i13 | (~(i14 | i15))) * 1324) + (i11 * (-661)) + (i10 * (-661)) != 1) {
                setBackgroundTintList setbackgroundtintlist = setBackgroundTintList.this;
                byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray((byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist)), new IntRange(0, 4));
                int i16 = f59493q0;
                int i17 = (i16 & (-70)) | ((~i16) & 69);
                int i18 = -(-((i16 & 69) << 1));
                int i19 = (i17 & i18) + (i18 | i17);
                f59494r0 = i19 % 128;
                int i20 = i19 % 2;
                return bArrSliceArray;
            }
            a aVar = (a) objArr[0];
            int i21 = f59494r0;
            int i22 = ((i21 & 114) + (i21 | 114)) - 1;
            f59493q0 = i22 % 128;
            if (i22 % 2 != 0) {
                bArr = (byte[]) a(new Object[]{aVar}, 1510000269, -1510000269, System.identityHashCode(aVar));
                int i23 = 38 / 0;
            } else {
                bArr = (byte[]) a(new Object[]{aVar}, 1510000269, -1510000269, System.identityHashCode(aVar));
            }
            int i24 = f59494r0;
            int i25 = i24 & 9;
            int i26 = (i24 ^ 9) | i25;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f59493q0 = i27 % 128;
            int i28 = i27 % 2;
            return bArr;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return a(new Object[]{this}, -583327113, 583327114, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f59490e;
        int i11 = i10 | 17;
        int i12 = (i11 << 1) - ((~(i10 & 17)) & i11);
        f59489d = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public setBackgroundTintList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setX = bArr;
        if (!((Boolean) Companion.setX(new Object[]{bArr}, -456981728, 456981729, (int) System.currentTimeMillis())).booleanValue()) {
            throw new setIndeterminateDrawable(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, (String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()), null, 4, null);
        }
        this.setY = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
        int i14 = ~i11;
        int i15 = (((~(i10 | i14 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i14 | i12)) | i10) * (-366)) + i13;
        if (i15 == 1) {
            setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[0];
            int i16 = f59489d;
            int i17 = i16 & 91;
            int i18 = (i16 | 91) & (~i17);
            int i19 = i17 << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            f59490e = i20 % 128;
            int i21 = i20 % 2;
            byte[] bArr = (byte[]) setbackgroundtintlist.setY.getValue();
            int i22 = f59490e;
            int i23 = (i22 & 91) + (i22 | 91);
            f59489d = i23 % 128;
            int i24 = i23 % 2;
            return bArr;
        }
        if (i15 != 2) {
            int i25 = f59490e;
            int i26 = (i25 & 51) + (i25 | 51);
            int i27 = i26 % 128;
            f59489d = i27;
            int i28 = i26 % 2;
            setBackgroundTintList setbackgroundtintlist2 = f59488c;
            int i29 = (i27 ^ 29) + ((i27 & 29) << 1);
            f59490e = i29 % 128;
            int i30 = i29 % 2;
            return setbackgroundtintlist2;
        }
        setBackgroundTintList setbackgroundtintlist3 = (setBackgroundTintList) objArr[0];
        int i31 = f59489d;
        int i32 = (((i31 ^ 11) | (i31 & 11)) << 1) - (((~i31) & 11) | (i31 & (-12)));
        int i33 = i32 % 128;
        f59490e = i33;
        int i34 = i32 % 2;
        byte[] bArr2 = setbackgroundtintlist3.setX;
        int i35 = i33 & 99;
        int i36 = ((i33 | 99) & (~i35)) + (i35 << 1);
        f59489d = i36 % 128;
        int i37 = i36 % 2;
        return bArr2;
    }

    public boolean equals(@Nullable Object p4) {
        boolean zEquals;
        int i10 = f59490e;
        int i11 = (i10 | 21) << 1;
        int i12 = -(i10 ^ 21);
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f59489d = i13 % 128;
        int i14 = i13 % 2;
        if (!(p4 instanceof setBackgroundTintList)) {
            boolean zEquals2 = super.equals(p4);
            int i15 = f59489d;
            int i16 = i15 & 17;
            int i17 = i16 + ((i15 ^ 17) | i16);
            f59490e = i17 % 128;
            if (i17 % 2 != 0) {
                return zEquals2;
            }
            throw null;
        }
        int i18 = i10 + 31;
        f59489d = i18 % 128;
        int i19 = i18 % 2;
        byte[] bArr = this.setX;
        if (i19 != 0) {
            zEquals = Arrays.equals(((setBackgroundTintList) p4).setX, bArr);
            int i20 = 96 / 0;
        } else {
            zEquals = Arrays.equals(((setBackgroundTintList) p4).setX, bArr);
        }
        int i21 = f59490e + 73;
        f59489d = i21 % 128;
        if (i21 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    public int hashCode() {
        int i10 = f59490e;
        int i11 = ((i10 ^ 57) | (i10 & 57)) << 1;
        int i12 = -(((~i10) & 57) | (i10 & (-58)));
        int i13 = (i11 & i12) + (i12 | i11);
        f59489d = i13 % 128;
        int i14 = i13 % 2;
        int iHashCode = Arrays.hashCode(this.setX);
        int i15 = f59490e + 3;
        f59489d = i15 % 128;
        int i16 = i15 % 2;
        return iHashCode;
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 1426653476, -1426653475, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -1453308222, 1453308224, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setBackgroundTintList$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setBackgroundTintList$setDividerPadding;", "", "", "p0", "", "setX", "([B)Z", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "setDividerPadding", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f59496a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59497b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public static setBackgroundTintList setCompoundDrawableTintBlendMode() {
            return (setBackgroundTintList) setX(new Object[0], -1177291647, 1177291647, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0080 A[PHI: r4
          0x0080: PHI (r4v4 int) = (r4v3 int), (r4v28 int) binds: [B:11:0x007e, B:8:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x0084  */
        /* JADX WARN: Code duplicated, block: B:15:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:17:0x00bf  */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int length;
            int i13 = ~i10;
            if ((((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i13 | i11 | i12)) * (-604)) + (((~((~i12) | i13 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303) != 1) {
                int i14 = f59497b;
                int i15 = i14 & 21;
                int i16 = (i14 ^ 21) | i15;
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                f59496a = i17 % 128;
                int i18 = i17 % 2;
                setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setBackgroundTintList.setX(new Object[0], 999099336, -999099336, (int) System.currentTimeMillis());
                int i19 = f59497b;
                int i20 = ((i19 | 15) << 1) - (i19 ^ 15);
                f59496a = i20 % 128;
                int i21 = i20 % 2;
                return setbackgroundtintlist;
            }
            byte[] bArr = (byte[]) objArr[0];
            int i22 = f59497b;
            int i23 = ((i22 ^ 102) + ((i22 & 102) << 1)) - 1;
            f59496a = i23 % 128;
            if (i23 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bArr, "");
                length = bArr.length;
                if (3 > length) {
                    int i24 = f59496a;
                    int i25 = (i24 ^ 62) + ((i24 & 62) << 1);
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    f59497b = i26 % 128;
                    int i27 = i26 % 2;
                } else {
                    if (length <= 16) {
                        int i28 = f59497b;
                        int i29 = (((i28 ^ 123) | (i28 & 123)) << 1) - (((~i28) & 123) | (i28 & (-124)));
                        int i30 = i29 % 128;
                        f59496a = i30;
                        int i31 = i29 % 2;
                        int i32 = i30 & 99;
                        int i33 = -(-((i30 ^ 99) | i32));
                        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                        f59497b = i34 % 128;
                        int i35 = i34 % 2;
                        return Boolean.TRUE;
                    }
                    int i36 = f59496a;
                    int i37 = ((i36 | 97) << 1) - (i36 ^ 97);
                    f59497b = i37 % 128;
                    int i38 = i37 % 2;
                }
            } else {
                Intrinsics.checkNotNullParameter(bArr, "");
                length = bArr.length;
                if (5 > length) {
                    int i210 = f59496a;
                    int i211 = (i210 ^ 62) + ((i210 & 62) << 1);
                    int i212 = (i211 ^ (-1)) + (i211 << 1);
                    f59497b = i212 % 128;
                    int i213 = i212 % 2;
                } else {
                    if (length <= 16) {
                        int i214 = f59497b;
                        int i215 = (((i214 ^ 123) | (i214 & 123)) << 1) - (((~i214) & 123) | (i214 & (-124)));
                        int i39 = i215 % 128;
                        f59496a = i39;
                        int i310 = i215 % 2;
                        int i311 = i39 & 99;
                        int i312 = -(-((i39 ^ 99) | i311));
                        int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                        f59497b = i313 % 128;
                        int i314 = i313 % 2;
                        return Boolean.TRUE;
                    }
                    int i315 = f59496a;
                    int i316 = ((i315 | 97) << 1) - (i315 ^ 97);
                    f59497b = i316 % 128;
                    int i317 = i316 % 2;
                }
            }
            return Boolean.FALSE;
        }

        public static boolean setX(@NotNull byte[] p4) {
            return ((Boolean) setX(new Object[]{p4}, -456981728, 456981729, (int) System.currentTimeMillis())).booleanValue();
        }
    }

    public static final /* synthetic */ setBackgroundTintList setX() {
        return (setBackgroundTintList) setX(new Object[0], 999099336, -999099336, (int) System.currentTimeMillis());
    }
}

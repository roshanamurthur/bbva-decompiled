package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0012\u000bB%\b\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/yh;", "Lcom/mypinpad/tsdk/i/yo;", "Lcom/mypinpad/tsdk/i/yj;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/yj;", "", "setDividerPadding", "()J", "Lcom/mypinpad/tsdk/i/abv;", "p0", "", "setY", "(Lcom/mypinpad/tsdk/i/abv;)V", "", "", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0})
public final class yh extends yo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final yj f62086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62087d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f62088e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f62089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f62090b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/yh$setCompoundDrawableTintBlendMode;", "", "", "p0", "p1", "setY", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mypinpad/tsdk/i/yh$setCompoundDrawableTintBlendMode;", "Lcom/mypinpad/tsdk/i/yh;", "()Lcom/mypinpad/tsdk/i/yh;"}, k = 1, mv = {1, 6, 0})
    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Charset f62091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList f62092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList f62093c;

        public setCompoundDrawableTintBlendMode(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this.f62091a = (i10 & 1) != 0 ? null : charset;
            this.f62092b = new ArrayList();
            this.f62093c = new ArrayList();
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = (~((~i11) | i13)) | i12;
            int i15 = ~(i10 | i11);
            if (((i11 | (~(i12 | i13))) * 376) + (((~(i10 | (~i12))) | i15) * (-376)) + ((i14 | i15) * 376) + (i11 * (-375)) + (i10 * (-375)) == 1) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                return new yh(setcompounddrawabletintblendmode.f62092b, setcompounddrawabletintblendmode.f62093c);
            }
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ArrayList arrayList = setcompounddrawabletintblendmode2.f62092b;
            yg.Companion companion = yg.INSTANCE;
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            Charset charset = setcompounddrawabletintblendmode2.f62091a;
            arrayList.add((String) yg.Companion.setDividerPadding(new Object[]{companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, bool, bool, bool2, bool, charset, 91}, -700019500, 700019509, 0));
            setcompounddrawabletintblendmode2.f62093c.add((String) yg.Companion.setDividerPadding(new Object[]{companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, bool, bool, bool2, bool, charset, 91}, -700019500, 700019509, 0));
            return setcompounddrawabletintblendmode2;
        }

        @NotNull
        public final yh setY() {
            return (yh) setX(new Object[]{this}, -1712660640, 1712660641, System.identityHashCode(this));
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setY(@NotNull String p4, @NotNull String p10) {
            return (setCompoundDrawableTintBlendMode) setX(new Object[]{this, p4, p10}, -1183851361, 1183851361, System.identityHashCode(this));
        }

        @JvmOverloads
        public setCompoundDrawableTintBlendMode() {
            this(null, 1, null);
        }
    }

    static {
        yj.setX setx = yj.setOnFocusChangeListener;
        f62086c = (yj) yj.setX.setDividerPadding(new Object[]{"application/x-www-form-urlencoded"}, -2934678, 2934679, (int) System.currentTimeMillis());
        int i10 = f62088e;
        int i11 = ((i10 | 79) << 1) - (i10 ^ 79);
        f62087d = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 39 / 0;
        }
    }

    public yh(@NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f62089a = (List) yt.setY(new Object[]{list}, 1581148594, -1581148571, (int) System.currentTimeMillis());
        this.f62090b = (List) yt.setY(new Object[]{list2}, 1581148594, -1581148571, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0110 A[PHI: r7
      0x0110: PHI (r7v9 long) = (r7v8 long), (r7v15 long) binds: [B:22:0x010e, B:19:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0125 A[PHI: r7
      0x0125: PHI (r7v14 long) = (r7v8 long), (r7v15 long) binds: [B:22:0x010e, B:19:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x017e A[PHI: r12
      0x017e: PHI (r12v8 int) = (r12v6 int), (r12v10 int) binds: [B:33:0x017c, B:30:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x018c  */
    /* JADX WARN: Code duplicated, block: B:37:0x019f  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
        long jLongValue;
        abx abxVar;
        Long lValueOf;
        int i13;
        int i14;
        int i15 = ~i11;
        int i16 = ~(i15 | i12);
        int i17 = ~i12;
        int i18 = i16 | (~(i17 | i10));
        int i19 = ~(i17 | i11);
        int i20 = ~i10;
        int i21 = (((~(i20 | i11)) | i19) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i15 | i20)) | (~(i20 | i17 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i18 | i19) * (-516)) + (i11 * 517) + (i10 * (-515));
        if (i21 != 1) {
            if (i21 == 2) {
                yh yhVar = (yh) objArr[0];
                abv abvVar = (abv) objArr[1];
                int i22 = f62088e;
                int i23 = (i22 ^ 23) + ((i22 & 23) << 1);
                f62087d = i23 % 128;
                int i24 = i23 % 2;
                Intrinsics.checkNotNullParameter(abvVar, "");
                ((Long) setCompoundDrawableTintBlendMode(new Object[]{yhVar, abvVar, Boolean.FALSE}, -1164208507, 1164208508, System.identityHashCode(yhVar))).longValue();
                int i25 = f62087d;
                int i26 = i25 & 23;
                int i27 = -(-((i25 ^ 23) | i26));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                f62088e = i28 % 128;
                if (i28 % 2 != 0) {
                    return null;
                }
                int i29 = 2 / 0;
                return null;
            }
            if (i21 == 3) {
                int i30 = f62087d;
                int i31 = ((i30 & 50) + (i30 | 50)) - 1;
                int i32 = i31 % 128;
                f62088e = i32;
                int i33 = i31 % 2;
                int i34 = i32 + 5;
                f62087d = i34 % 128;
                if (i34 % 2 != 0) {
                    int i35 = 25 / 0;
                }
                return f62086c;
            }
            yh yhVar2 = (yh) objArr[0];
            int i36 = f62088e;
            int i37 = ((i36 | 61) << 1) - (61 ^ i36);
            f62087d = i37 % 128;
            int i38 = i37 % 2;
            long jLongValue2 = ((Long) setCompoundDrawableTintBlendMode(new Object[]{yhVar2, null, Boolean.TRUE}, -1164208507, 1164208508, System.identityHashCode(yhVar2))).longValue();
            int i39 = f62088e;
            int i40 = i39 & 25;
            int i41 = i39 | 25;
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            f62087d = i42 % 128;
            int i43 = i42 % 2;
            return Long.valueOf(jLongValue2);
        }
        yh yhVar3 = (yh) objArr[0];
        abv abvVar2 = (abv) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i44 = f62088e;
        int i45 = i44 & 101;
        int i46 = i45 + ((i44 ^ 101) | i45);
        f62087d = i46 % 128;
        if (i46 % 2 != 0) {
            jLongValue = 1;
            if (zBooleanValue) {
                abxVar = new abx();
                int i47 = f62087d;
                int i48 = ((i47 ^ 87) - (~((i47 & 87) << 1))) - 1;
                f62088e = i48 % 128;
                int i49 = i48 % 2;
            } else {
                Intrinsics.checkNotNull(abvVar2);
                abxVar = abvVar2.setOnFocusChangeListener();
                int i50 = f62087d;
                int i51 = ((i50 ^ 99) - (~(-(-((i50 & 99) << 1))))) - 1;
                f62088e = i51 % 128;
                int i52 = i51 % 2;
            }
        } else {
            jLongValue = 0;
            if (zBooleanValue) {
                abxVar = new abx();
                int i410 = f62087d;
                int i411 = ((i410 ^ 87) - (~((i410 & 87) << 1))) - 1;
                f62088e = i411 % 128;
                int i412 = i411 % 2;
            } else {
                Intrinsics.checkNotNull(abvVar2);
                abxVar = abvVar2.setOnFocusChangeListener();
                int i53 = f62087d;
                int i54 = ((i53 ^ 99) - (~(-(-((i53 & 99) << 1))))) - 1;
                f62088e = i54 % 128;
                int i55 = i54 % 2;
            }
        }
        int size = yhVar3.f62089a.size();
        int i56 = f62088e + 79;
        f62087d = i56 % 128;
        int i57 = i56 % 2;
        int i58 = 0;
        while (i58 < size) {
            int i59 = f62087d;
            int i60 = i59 & 123;
            int i61 = (i60 - (~(-(-((i59 ^ 123) | i60))))) - 1;
            f62088e = i61 % 128;
            if (i61 % 2 == 0) {
                i13 = (i58 & 7) + (i58 | 7);
                if (i58 > 0) {
                    i14 = ((i59 ^ 120) + ((i59 & 120) << 1)) - 1;
                    f62088e = i14 % 128;
                    if (i14 % 2 == 0) {
                    }
                }
            } else {
                int i62 = i58 & 1;
                int i63 = -(-((i58 ^ 1) | i62));
                i13 = (i62 & i63) + (i62 | i63);
                if (i58 > 0) {
                    i14 = ((i59 ^ 120) + ((i59 & 120) << 1)) - 1;
                    f62088e = i14 % 128;
                    if (i14 % 2 == 0) {
                    }
                }
            }
            int i64 = f62088e;
            int i65 = (i64 & 20) + (i64 | 20);
            int i66 = (i65 ^ (-1)) + (i65 << 1);
            f62087d = i66 % 128;
            int i67 = i66 % 2;
            i58 = i13;
        }
        if (!(!zBooleanValue)) {
            int i68 = f62087d;
            int i69 = ((i68 & 13) - (~(-(-(i68 | 13))))) - 1;
            f62088e = i69 % 128;
            int i70 = i69 % 2;
            jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
            abx.setOnFocusChangeListener(new Object[]{abxVar}, 502611487, -502611445, System.identityHashCode(abxVar));
            int i71 = f62088e + 41;
            f62087d = i71 % 128;
            int i72 = i71 % 2;
        }
        int i73 = f62088e;
        int i74 = i73 & 21;
        int i75 = (((i73 | 21) & (~i74)) - (~(-(-(i74 << 1))))) - 1;
        f62087d = i75 % 128;
        if (i75 % 2 != 0) {
            int i76 = 53 / 0;
            lValueOf = Long.valueOf(jLongValue);
        } else {
            lValueOf = Long.valueOf(jLongValue);
        }
        return lValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.yo
    public final long setDividerPadding() {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this}, -1460373227, 1460373227, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.yo
    @NotNull
    public final yj setOnFocusChangeListener() {
        return (yj) setCompoundDrawableTintBlendMode(new Object[]{this}, 792090853, -792090850, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.yo
    public final void setY(@NotNull abv p4) throws NoSuchAlgorithmException, IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 354495158, -354495156, System.identityHashCode(this));
    }
}

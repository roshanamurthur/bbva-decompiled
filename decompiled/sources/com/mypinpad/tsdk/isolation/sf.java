package com.mypinpad.tsdk.isolation;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class sf implements Serializable {
    public static final byte[] E0 = null;
    public static final int F0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final char[] f60850u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f60851w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f60852x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f60853y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f60854p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f60855q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f60856r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final String f60857s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final String f60858t0;

    static {
        c();
        f60852x0 = 0;
        f60853y0 = 1;
        v0 = 0;
        f60851w0 = 1;
        f60850u0 = new char[]{59285, 58982, 58981, 58981};
    }

    public sf(boolean z10, boolean z11, int i10, @Nullable String str, @Nullable String str2) {
        this.f60854p0 = z10;
        this.f60855q0 = z11;
        this.f60856r0 = i10;
        this.f60857s0 = str;
        this.f60858t0 = str2;
    }

    public static void a(int i10, byte b10, int i11, Object[] objArr) {
        int i12 = b10 * 2;
        int i13 = i10 + 97;
        int i14 = i11 + 4;
        byte[] bArr = new byte[i12 + 1];
        int i15 = -1;
        byte[] bArr2 = E0;
        if (bArr2 == null) {
            i13 = (-i13) + i14;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            i15 = -1;
            bArr2 = bArr2;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr[i16] = (byte) i13;
            int i17 = i14 + 1;
            if (i16 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i13 = (-bArr2[i17]) + i13;
            i14 = i17;
            objArr = objArr;
            bArr = bArr;
            i15 = i16;
            bArr2 = bArr2;
        }
    }

    public static void b(int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        char[] cArr;
        int i11 = f60853y0 + 107;
        f60852x0 = i11 % 128;
        int i12 = 2;
        char c10 = 0;
        if (i11 % 2 != 0) {
            int i13 = 0 / 0;
        }
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        int i18 = F0;
        char[] cArr2 = f60850u0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                int i20 = f60852x0 + 73;
                f60853y0 = i20 % 128;
                int i21 = i20 % i12;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = Integer.valueOf(cArr2[i19]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), ExpandableListView.getPackedPositionType(0L) + 37, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + TypedValues.MotionType.TYPE_DRAW_PATH);
                        byte b10 = (byte) (i18 & 1);
                        byte b11 = (byte) (-b10);
                        Object[] objArr3 = new Object[1];
                        a(b10, (byte) (b11 + 1), b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr3[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    i18 = i18;
                    cArr2 = cArr2;
                    i12 = 2;
                    c10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i15];
        System.arraycopy(cArr2, i14, cArr4, 0, i15);
        if (i17 > 0) {
            char[] cArr5 = new char[i15];
            System.arraycopy(cArr4, 0, cArr5, 0, i15);
            int i22 = i15 - i17;
            System.arraycopy(cArr5, 0, cArr4, i22, i17);
            System.arraycopy(cArr5, i17, cArr4, 0, i22);
        }
        int i23 = f60852x0 + 103;
        f60853y0 = i23 % 128;
        if (i23 % 2 == 0) {
            cArr = new char[i15];
            i10 = 0;
        } else {
            i10 = 0;
            cArr = new char[i15];
        }
        while (true) {
            setnavigationonclicklistener.setX = i10;
            int i24 = setnavigationonclicklistener.setX;
            if (i24 >= i15) {
                break;
            }
            cArr[i24] = cArr4[(i15 - i24) - 1];
            i10 = i24 + 1;
        }
        int i25 = f60853y0 + 87;
        f60852x0 = i25 % 128;
        int i26 = i25 % 2;
        if (i16 > 0) {
            int i27 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i27;
                int i28 = setnavigationonclicklistener.setX;
                if (i28 >= i15) {
                    break;
                }
                int i29 = f60852x0 + 97;
                f60853y0 = i29 % 128;
                int i30 = i29 % 2;
                cArr[i28] = (char) (cArr[i28] - iArr[2]);
                i27 = i28 + 1;
            }
        }
        objArr[0] = new String(cArr);
    }

    public static void c() {
        E0 = new byte[]{91, -14, -6, UtilitiesSDKConstants.SRP_LABEL_MAC};
        F0 = 143;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Object obj;
        int i13 = v0 + 47;
        f60851w0 = i13 % 128;
        if (i13 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            b(new int[]{0, 4, 141, 1}, objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            b(new int[]{0, 4, 141, 1}, objArr3);
            obj = objArr3[0];
        }
        String strIntern = ((String) obj).intern();
        int i14 = f60851w0 + 115;
        v0 = i14 % 128;
        int i15 = i14 % 2;
        return strIntern;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            int i10 = v0 + 15;
            f60851w0 = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (!(obj instanceof sf)) {
            int i12 = f60851w0 + 47;
            v0 = i12 % 128;
            return i12 % 2 != 0;
        }
        sf sfVar = (sf) obj;
        if (this.f60854p0 != sfVar.f60854p0) {
            int i13 = v0 + 67;
            f60851w0 = i13 % 128;
            return i13 % 2 == 0;
        }
        if (this.f60855q0 != sfVar.f60855q0) {
            int i14 = f60851w0 + 63;
            v0 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (this.f60856r0 == sfVar.f60856r0) {
            return Intrinsics.areEqual(this.f60857s0, sfVar.f60857s0) && Intrinsics.areEqual(this.f60858t0, sfVar.f60858t0);
        }
        int i16 = f60851w0 + 123;
        v0 = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int i10 = v0 + 91;
        f60851w0 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = this.f60854p0;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i12 = r1 * 31;
        boolean z11 = this.f60855q0;
        int i13 = (((i12 + (z11 ? 1 : z11)) * 31) + this.f60856r0) * 31;
        int iHashCode = 0;
        String str = this.f60857s0;
        int iHashCode2 = (i13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60858t0;
        if (str2 != null) {
            iHashCode = str2.hashCode();
            int i14 = v0 + 83;
            f60851w0 = i14 % 128;
            int i15 = i14 % 2;
        }
        return iHashCode2 + iHashCode;
    }

    @Nullable
    public final String setCompoundDrawableTintBlendMode() {
        int i10 = v0;
        int i11 = i10 + 75;
        f60851w0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 83;
        f60851w0 = i12 % 128;
        if (i12 % 2 != 0) {
            return this.f60857s0;
        }
        throw null;
    }

    @Nullable
    public final String setDividerPadding() {
        int i10 = v0;
        int i11 = i10 + 31;
        f60851w0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 59;
        f60851w0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f60858t0;
    }

    public final int setX() {
        int i10 = f60851w0 + 43;
        v0 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f60856r0;
        }
        throw null;
    }

    public final boolean setY() {
        int i10 = v0 + 121;
        int i11 = i10 % 128;
        f60851w0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 13;
        v0 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.f60854p0;
        }
        throw null;
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -12572854, 12572854, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener() {
        int i10 = f60851w0;
        int i11 = i10 + 95;
        v0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 57;
        v0 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.f60855q0;
        }
        throw null;
    }
}

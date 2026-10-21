package com.mypinpad.tsdk.isolation;

import androidx.camera.core.processing.f;
import bk.w;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/abr;", "Lcom/mypinpad/tsdk/i/yl;", "Lcom/mypinpad/tsdk/i/abr$setY;", "p0", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/abr$setY;)Lcom/mypinpad/tsdk/i/abr;", "Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;", "Lcom/mypinpad/tsdk/i/yr;", "setX", "(Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;)Lcom/mypinpad/tsdk/i/yr;", "Lcom/mypinpad/tsdk/i/abr$setDividerPadding;", "<init>", "(Lcom/mypinpad/tsdk/i/abr$setDividerPadding;)V", "setY", "setDividerPadding"}, k = 1, mv = {1, 6, 0})
public final class abr implements yl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52342d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52343e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setDividerPadding f52344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public volatile Set<String> f52345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public volatile setY f52346c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/abr$setDividerPadding;", "", "", "p0", "", "setX", "(Ljava/lang/String;)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface setDividerPadding {

        /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f52347a;

        @JvmField
        @NotNull
        public static final setDividerPadding setX = new Companion.a();

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abr$setDividerPadding$setOnFocusChangeListener, reason: from kotlin metadata */
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f52347a = new Companion();

            /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abr$setDividerPadding$setOnFocusChangeListener$a */
            public static final class a implements setDividerPadding {
                @Override // com.mypinpad.tsdk.i.abr.setDividerPadding
                public final void setX(@NotNull String str) {
                    Object[] objArr = {this, str};
                    System.identityHashCode(this);
                    String str2 = (String) objArr[1];
                    Intrinsics.checkNotNullParameter(str2, "");
                    aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
                    aaw.setCompoundDrawableTintBlendMode(new Object[]{str2, 0, 6}, -2146983271, 2146983272, 0);
                }
            }

            static {
                int i10 = 1 & 27;
                int i11 = (i10 - (~((1 ^ 27) | i10))) - 1;
                int i12 = i11 % 128;
                int i13 = i11 % 2;
            }
        }

        void setX(@NotNull String p4);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/abr$setY;", "", "setX", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setY"}, k = 1, mv = {1, 6, 0})
    public static final class setY {
        public static final setY setCompoundDrawableTintBlendMode;
        private static final /* synthetic */ setY[] setDividerPadding;
        private static int setOnDragListener = 1;
        public static final setY setOnFocusChangeListener;
        private static int setOnLongClickListener;
        public static final setY setX;
        public static final setY setY;

        static {
            setY sety = new setY(ExpectedUserActionOnPoiTypes.NONE, 0);
            setX = sety;
            setY sety2 = new setY("BASIC", 1);
            setCompoundDrawableTintBlendMode = sety2;
            setY sety3 = new setY("HEADERS", 2);
            setOnFocusChangeListener = sety3;
            setY sety4 = new setY("BODY", 3);
            setY = sety4;
            int i10 = 1 + 37;
            setOnLongClickListener = i10 % 128;
            int i11 = i10 % 2;
            setY[] setyArr = {sety, sety2, sety3, sety4};
            int i12 = ((1 | 83) << 1) - (1 ^ 83);
            int i13 = i12 % 128;
            setOnLongClickListener = i13;
            if (i12 % 2 != 0) {
                int i14 = 21 / 0;
            }
            setDividerPadding = setyArr;
            int i15 = i13 + 87;
            setOnDragListener = i15 % 128;
            int i16 = i15 % 2;
        }

        public setY() {
            throw null;
        }

        public static setY valueOf(String str) {
            int i10 = setOnDragListener;
            int i11 = ((i10 & 48) + (i10 | 48)) - 1;
            setOnLongClickListener = i11 % 128;
            if (i11 % 2 != 0) {
                Enum.valueOf(setY.class, str);
                throw null;
            }
            setY sety = (setY) Enum.valueOf(setY.class, str);
            int i12 = setOnDragListener;
            int i13 = (i12 & (-78)) | ((~i12) & 77);
            int i14 = -(-((i12 & 77) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            setOnLongClickListener = i15 % 128;
            int i16 = i15 % 2;
            return sety;
        }

        public static setY[] values() {
            setY[] setyArr;
            int i10 = setOnDragListener;
            int i11 = i10 & 35;
            int i12 = -(-((i10 ^ 35) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            setOnLongClickListener = i13 % 128;
            int i14 = i13 % 2;
            setY[] setyArr2 = setDividerPadding;
            if (i14 != 0) {
                setyArr = (setY[]) setyArr2.clone();
                int i15 = 90 / 0;
            } else {
                setyArr = (setY[]) setyArr2.clone();
            }
            int i16 = setOnDragListener;
            int i17 = i16 ^ 95;
            int i18 = -(-((i16 & 95) << 1));
            int i19 = (i17 & i18) + (i18 | i17);
            setOnLongClickListener = i19 % 128;
            int i20 = i19 % 2;
            return setyArr;
        }
    }

    @JvmOverloads
    public abr(@NotNull setDividerPadding setdividerpadding) {
        Intrinsics.checkNotNullParameter(setdividerpadding, "");
        this.f52344a = setdividerpadding;
        this.f52345b = w.emptySet();
        this.f52346c = setY.setX;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:170:0x099a  */
    /* JADX WARN: Code duplicated, block: B:26:0x012c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0189 A[PHI: r2 r18
      0x0189: PHI (r2v134 com.mypinpad.tsdk.i.yj) = (r2v118 com.mypinpad.tsdk.i.yj), (r2v136 com.mypinpad.tsdk.i.yj) binds: [B:40:0x0186, B:37:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r18v2 char) = (r18v1 char), (r18v3 char) binds: [B:40:0x0186, B:37:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x019f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0214  */
    /* JADX WARN: Code duplicated, block: B:67:0x02ac A[PHI: r3
      0x02ac: PHI (r3v70 char) = (r3v69 char), (r3v95 char) binds: [B:69:0x02af, B:65:0x02a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x0322  */
    /* JADX WARN: Code duplicated, block: B:76:0x0330  */
    /* JADX WARN: Code duplicated, block: B:77:0x0340  */
    /* JADX WARN: Code duplicated, block: B:79:0x0367  */
    /* JADX WARN: Code duplicated, block: B:82:0x0394  */
    /* JADX WARN: Code duplicated, block: B:83:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x0419  */
    public static /* synthetic */ yr a(Object[] objArr) throws Exception {
        boolean z10;
        boolean z11;
        String strStringPlus;
        String string;
        int i10;
        boolean z12;
        String strConcat;
        String string2;
        ye yeVar;
        int iIntValue;
        Long lValueOf;
        Charset charset;
        String str;
        int i11;
        int i12;
        char c10;
        int i13;
        char c11;
        Object[] objArr2;
        abx abxVar;
        yj onFocusChangeListener;
        Charset charset2;
        char c12;
        yj onFocusChangeListener2;
        Object[] objArr3;
        abr abrVar = (abr) objArr[0];
        yl.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (yl.setCompoundDrawableTintBlendMode) objArr[1];
        int i14 = f52342d;
        int i15 = (((i14 ^ 3) | (i14 & 3)) << 1) - (((~i14) & 3) | (i14 & (-4)));
        f52343e = i15 % 128;
        int i16 = 2;
        int i17 = i15 % 2;
        Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
        setY sety = abrVar.f52346c;
        yk compoundDrawableTintBlendMode = setcompounddrawabletintblendmode.setCompoundDrawableTintBlendMode();
        if (sety == setY.setX) {
            int i18 = f52342d;
            int i19 = i18 & 23;
            int i20 = (i18 ^ 23) | i19;
            int i21 = (i19 & i20) + (i20 | i19);
            f52343e = i21 % 128;
            int i22 = i21 % 2;
            return setcompounddrawabletintblendmode.setDividerPadding(compoundDrawableTintBlendMode);
        }
        if (sety == setY.setY) {
            int i23 = f52342d + 39;
            int i24 = i23 % 128;
            f52343e = i24;
            int i25 = i23 % 2;
            int i26 = (i24 & 63) + (i24 | 63);
            f52342d = i26 % 128;
            int i27 = i26 % 2;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z11 = true;
        } else {
            int i28 = f52343e + 93;
            f52342d = i28 % 128;
            int i29 = i28 % 2;
            if (sety == setY.setOnFocusChangeListener) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        yo yoVar = (yo) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -2084954302, 2084954305, System.identityHashCode(compoundDrawableTintBlendMode));
        xx y7 = setcompounddrawabletintblendmode.setY();
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode)));
        sb2.append(' ');
        sb2.append((yg) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -534472234, 534472239, System.identityHashCode(compoundDrawableTintBlendMode)));
        if (y7 != null) {
            int i30 = f52343e + 27;
            f52342d = i30 % 128;
            int i31 = i30 % 2;
            strStringPlus = Intrinsics.stringPlus(" ", y7.setCompoundDrawableTintBlendMode());
            int i32 = f52343e + 55;
            f52342d = i32 % 128;
            int i33 = i32 % 2;
        } else {
            System.identityHashCode(abrVar);
            System.identityHashCode(abrVar);
            strStringPlus = "";
        }
        sb2.append(strStringPlus);
        String string3 = sb2.toString();
        if (!z11) {
            int i34 = f52343e;
            int i35 = ((i34 ^ 77) | (i34 & 77)) << 1;
            int i36 = -((i34 & (-78)) | ((~i34) & 77));
            int i37 = (i35 & i36) + (i35 | i36);
            f52342d = i37 % 128;
            if (i37 % 2 != 0) {
                throw null;
            }
            if (yoVar != null) {
                StringBuilder sbE = f.e(string3, " (");
                sbE.append(yoVar.setDividerPadding());
                sbE.append("-byte body)");
                string3 = sbE.toString();
            }
        }
        abrVar.f52344a.setX(string3);
        if (z11) {
            int i38 = f52342d;
            int i39 = (i38 & 35) + (i38 | 35);
            f52343e = i39 % 128;
            if (i39 % 2 == 0) {
                throw null;
            }
            ye yeVar2 = (ye) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -1466291161, 1466291162, System.identityHashCode(compoundDrawableTintBlendMode));
            if (yoVar != null) {
                int i40 = f52342d;
                int i41 = (i40 & 89) + (i40 | 89);
                f52343e = i41 % 128;
                if (i41 % 2 == 0) {
                    onFocusChangeListener2 = yoVar.setOnFocusChangeListener();
                    c12 = 0;
                    int i42 = 23 / 0;
                    if (onFocusChangeListener2 != null) {
                        objArr3 = new Object[2];
                        objArr3[c12] = yeVar2;
                        objArr3[1] = DigipassManagerConstants.KEY_CONTENT_TYPE;
                        if (((String) ye.setCompoundDrawableTintBlendMode(objArr3, 914142416, -914142409, System.identityHashCode(yeVar2))) == null) {
                            System.identityHashCode(abrVar);
                            System.identityHashCode(abrVar);
                            abrVar.f52344a.setX(Intrinsics.stringPlus("Content-Type: ", onFocusChangeListener2));
                        }
                    }
                } else {
                    c12 = 0;
                    onFocusChangeListener2 = yoVar.setOnFocusChangeListener();
                    if (onFocusChangeListener2 != null) {
                        objArr3 = new Object[2];
                        objArr3[c12] = yeVar2;
                        objArr3[1] = DigipassManagerConstants.KEY_CONTENT_TYPE;
                        if (((String) ye.setCompoundDrawableTintBlendMode(objArr3, 914142416, -914142409, System.identityHashCode(yeVar2))) == null) {
                            System.identityHashCode(abrVar);
                            System.identityHashCode(abrVar);
                            abrVar.f52344a.setX(Intrinsics.stringPlus("Content-Type: ", onFocusChangeListener2));
                        }
                    }
                }
                if (yoVar.setDividerPadding() != -1) {
                    int i43 = f52343e + 87;
                    f52342d = i43 % 128;
                    if (i43 % 2 != 0) {
                        throw null;
                    }
                    if (((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar2, "Content-Length"}, 914142416, -914142409, System.identityHashCode(yeVar2))) == null) {
                        abrVar.f52344a.setX(Intrinsics.stringPlus("Content-Length: ", Long.valueOf(yoVar.setDividerPadding())));
                        int i44 = f52343e;
                        i13 = 1;
                        int i45 = (i44 ^ 77) + ((i44 & 77) << 1);
                        f52342d = i45 % 128;
                        int i46 = i45 % 2;
                    } else {
                        i13 = 1;
                    }
                    c10 = 0;
                } else {
                    c10 = 0;
                    i13 = 1;
                }
            } else {
                c10 = 0;
                i13 = 1;
            }
            Object[] objArr4 = new Object[i13];
            objArr4[c10] = yeVar2;
            int iIntValue2 = ((Integer) ye.setCompoundDrawableTintBlendMode(objArr4, -1558209065, 1558209065, System.identityHashCode(yeVar2))).intValue();
            int i47 = 0;
            while (i47 < iIntValue2) {
                int i48 = f52342d;
                int i49 = i48 & 17;
                int i50 = ((i48 ^ 17) | i49) << 1;
                int i51 = -((i48 | 17) & (~i49));
                int i52 = (i50 & i51) + (i51 | i50);
                f52343e = i52 % 128;
                int i53 = i52 % i16;
                int i54 = i47 | 1;
                int i55 = i54 << 1;
                int i56 = -(i54 & (~(i47 & 1)));
                Object[] objArr5 = new Object[3];
                objArr5[0] = abrVar;
                objArr5[1] = yeVar2;
                objArr5[i16] = Integer.valueOf(i47);
                setY(objArr5, -38491783, 38491786, i47);
                int i57 = f52342d;
                int i58 = ((i57 & (-82)) | ((~i57) & 81)) + ((i57 & 81) << 1);
                f52343e = i58 % 128;
                int i59 = i58 % 2;
                i47 = ((i55 | i56) << 1) - (i56 ^ i55);
                i16 = 2;
            }
            if (z10) {
                int i60 = f52343e;
                int i61 = ((i60 ^ 32) + ((i60 & 32) << 1)) - 1;
                f52342d = i61 % 128;
                if (i61 % 2 != 0) {
                    c11 = 0;
                    int i62 = 87 / 0;
                    if (yoVar == null) {
                        abrVar.f52344a.setX(Intrinsics.stringPlus("--> END ", (String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode))));
                        int i63 = f52342d;
                        int i64 = i63 | 109;
                        int i65 = (i64 << 1) - ((~(i63 & 109)) & i64);
                        f52343e = i65 % 128;
                        int i66 = i65 % 2;
                    } else {
                        Object[] objArr6 = new Object[1];
                        objArr6[c11] = compoundDrawableTintBlendMode;
                        objArr2 = new Object[1];
                        objArr2[c11] = (ye) yk.setCompoundDrawableTintBlendMode(objArr6, -1466291161, 1466291162, System.identityHashCode(compoundDrawableTintBlendMode));
                        if (((Boolean) setY(objArr2, -1097570189, 1097570193, (int) System.currentTimeMillis())).booleanValue()) {
                            setDividerPadding setdividerpadding = abrVar.f52344a;
                            StringBuilder sb3 = new StringBuilder("--> END ");
                            sb3.append((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode)));
                            sb3.append(" (encoded body omitted)");
                            setdividerpadding.setX(sb3.toString());
                            int i67 = f52342d;
                            int i68 = i67 & 55;
                            int i69 = i67 | 55;
                            int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                            f52343e = i70 % 128;
                            int i71 = i70 % 2;
                        } else {
                            abxVar = new abx();
                            yoVar.setY(abxVar);
                            onFocusChangeListener = yoVar.setOnFocusChangeListener();
                            if (onFocusChangeListener == null) {
                                int i72 = f52343e;
                                int i73 = i72 & 31;
                                int i74 = i73 + ((i72 ^ 31) | i73);
                                f52342d = i74 % 128;
                                int i75 = i74 % 2;
                                charset2 = null;
                            } else {
                                charset2 = (Charset) yj.setX(new Object[]{onFocusChangeListener, StandardCharsets.UTF_8}, -1673590045, 1673590046, System.identityHashCode(onFocusChangeListener));
                                int i76 = f52343e + 43;
                                f52342d = i76 % 128;
                                int i77 = i76 % 2;
                            }
                            if (charset2 == null) {
                                System.identityHashCode(abrVar);
                                System.identityHashCode(abrVar);
                                charset2 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(charset2, "");
                            }
                            abrVar.f52344a.setX("");
                            if (((Boolean) abq.setY(new Object[]{abxVar}, -1111583503, 1111583503, (int) System.currentTimeMillis())).booleanValue()) {
                                abrVar.f52344a.setX(abxVar.setCompoundDrawableTintBlendMode(charset2));
                                setDividerPadding setdividerpadding2 = abrVar.f52344a;
                                StringBuilder sb4 = new StringBuilder("--> END ");
                                sb4.append((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode)));
                                sb4.append(" (");
                                sb4.append(yoVar.setDividerPadding());
                                sb4.append("-byte body)");
                                setdividerpadding2.setX(sb4.toString());
                            } else {
                                setDividerPadding setdividerpadding3 = abrVar.f52344a;
                                StringBuilder sb5 = new StringBuilder("--> END ");
                                sb5.append((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode)));
                                sb5.append(" (binary ");
                                sb5.append(yoVar.setDividerPadding());
                                sb5.append("-byte body omitted)");
                                setdividerpadding3.setX(sb5.toString());
                                int i78 = f52343e;
                                int i79 = (i78 & 121) + (i78 | 121);
                                f52342d = i79 % 128;
                                int i80 = i79 % 2;
                            }
                        }
                    }
                } else {
                    c11 = 0;
                    if (yoVar == null) {
                        abrVar.f52344a.setX(Intrinsics.stringPlus("--> END ", (String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode))));
                        int i610 = f52342d;
                        int i611 = i610 | 109;
                        int i612 = (i611 << 1) - ((~(i610 & 109)) & i611);
                        f52343e = i612 % 128;
                        int i613 = i612 % 2;
                    } else {
                        Object[] objArr7 = new Object[1];
                        objArr7[c11] = compoundDrawableTintBlendMode;
                        objArr2 = new Object[1];
                        objArr2[c11] = (ye) yk.setCompoundDrawableTintBlendMode(objArr7, -1466291161, 1466291162, System.identityHashCode(compoundDrawableTintBlendMode));
                        if (((Boolean) setY(objArr2, -1097570189, 1097570193, (int) System.currentTimeMillis())).booleanValue()) {
                            setDividerPadding setdividerpadding4 = abrVar.f52344a;
                            StringBuilder sb6 = new StringBuilder("--> END ");
                            sb6.append((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode)));
                            sb6.append(" (encoded body omitted)");
                            setdividerpadding4.setX(sb6.toString());
                            int i614 = f52342d;
                            int i615 = i614 & 55;
                            int i616 = i614 | 55;
                            int i710 = ((i615 | i616) << 1) - (i616 ^ i615);
                            f52343e = i710 % 128;
                            int i711 = i710 % 2;
                        } else {
                            abxVar = new abx();
                            yoVar.setY(abxVar);
                            onFocusChangeListener = yoVar.setOnFocusChangeListener();
                            if (onFocusChangeListener == null) {
                                int i712 = f52343e;
                                int i713 = i712 & 31;
                                int i714 = i713 + ((i712 ^ 31) | i713);
                                f52342d = i714 % 128;
                                int i715 = i714 % 2;
                                charset2 = null;
                            } else {
                                charset2 = (Charset) yj.setX(new Object[]{onFocusChangeListener, StandardCharsets.UTF_8}, -1673590045, 1673590046, System.identityHashCode(onFocusChangeListener));
                                int i716 = f52343e + 43;
                                f52342d = i716 % 128;
                                int i717 = i716 % 2;
                            }
                            if (charset2 == null) {
                                System.identityHashCode(abrVar);
                                System.identityHashCode(abrVar);
                                charset2 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(charset2, "");
                            }
                            abrVar.f52344a.setX("");
                            if (((Boolean) abq.setY(new Object[]{abxVar}, -1111583503, 1111583503, (int) System.currentTimeMillis())).booleanValue()) {
                                abrVar.f52344a.setX(abxVar.setCompoundDrawableTintBlendMode(charset2));
                                setDividerPadding setdividerpadding5 = abrVar.f52344a;
                                StringBuilder sb7 = new StringBuilder("--> END ");
                                sb7.append((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode)));
                                sb7.append(" (");
                                sb7.append(yoVar.setDividerPadding());
                                sb7.append("-byte body)");
                                setdividerpadding5.setX(sb7.toString());
                            } else {
                                setDividerPadding setdividerpadding6 = abrVar.f52344a;
                                StringBuilder sb8 = new StringBuilder("--> END ");
                                sb8.append((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode)));
                                sb8.append(" (binary ");
                                sb8.append(yoVar.setDividerPadding());
                                sb8.append("-byte body omitted)");
                                setdividerpadding6.setX(sb8.toString());
                                int i718 = f52343e;
                                int i719 = (i718 & 121) + (i718 | 121);
                                f52342d = i719 % 128;
                                int i81 = i719 % 2;
                            }
                        }
                    }
                }
            } else {
                abrVar.f52344a.setX(Intrinsics.stringPlus("--> END ", (String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -441618648, 441618657, System.identityHashCode(compoundDrawableTintBlendMode))));
                int i617 = f52342d;
                int i618 = i617 | 109;
                int i619 = (i618 << 1) - ((~(i617 & 109)) & i618);
                f52343e = i619 % 128;
                int i6110 = i619 % 2;
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            yr dividerPadding = setcompounddrawabletintblendmode.setDividerPadding(compoundDrawableTintBlendMode);
            int i82 = f52342d + 13;
            f52343e = i82 % 128;
            int i83 = i82 % 2;
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            yn ynVar = (yn) yr.setX(new Object[]{dividerPadding}, -428621868, 428621887, System.identityHashCode(dividerPadding));
            Intrinsics.checkNotNull(ynVar);
            long onFocusChangeListener3 = ynVar.setOnFocusChangeListener();
            if (onFocusChangeListener3 != -1) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(onFocusChangeListener3);
                sb9.append("-byte");
                string = sb9.toString();
            } else {
                string = "unknown-length";
            }
            setDividerPadding setdividerpadding7 = abrVar.f52344a;
            StringBuilder sb10 = new StringBuilder("<-- ");
            sb10.append(((Integer) yr.setX(new Object[]{dividerPadding}, 151122101, -151122100, System.identityHashCode(dividerPadding))).intValue());
            if (((String) yr.setX(new Object[]{dividerPadding}, -171382441, 171382457, System.identityHashCode(dividerPadding))).length() == 0) {
                int i84 = f52342d;
                int i85 = i84 | 51;
                int i86 = (i85 << 1) - ((~(i84 & 51)) & i85);
                f52343e = i86 % 128;
                int i87 = i86 % 2;
                System.identityHashCode(abrVar);
                System.identityHashCode(abrVar);
                i10 = 1;
                z12 = true;
            } else {
                i10 = 1;
                z12 = false;
            }
            if (!z12) {
                Object[] objArr8 = new Object[i10];
                objArr8[0] = dividerPadding;
                strConcat = " ".concat(String.valueOf((String) yr.setX(objArr8, -171382441, 171382457, System.identityHashCode(dividerPadding))));
                int i88 = f52343e;
                int i89 = (i88 ^ 79) + ((i88 & 79) << 1);
                f52342d = i89 % 128;
                int i90 = i89 % 2;
            } else {
                int i91 = f52343e;
                int i92 = i91 & 113;
                int i93 = (((~i92) & (i91 | 113)) - (~(i92 << 1))) - 1;
                f52342d = i93 % 128;
                if (i93 % 2 != 0) {
                    throw null;
                }
                int i94 = i91 & 83;
                int i95 = (((i91 ^ 83) | i94) << 1) - ((i91 | 83) & (~i94));
                f52342d = i95 % 128;
                int i96 = i95 % 2;
                strConcat = "";
            }
            sb10.append(strConcat);
            sb10.append(' ');
            yk ykVar = (yk) yr.setX(new Object[]{dividerPadding}, -504719753, 504719763, System.identityHashCode(dividerPadding));
            sb10.append((yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar)));
            sb10.append(" (");
            sb10.append(millis);
            sb10.append("ms");
            if (z11) {
                int i97 = f52342d;
                int i98 = i97 & 31;
                int i99 = ((i97 ^ 31) | i98) << 1;
                int i100 = -((i97 | 31) & (~i98));
                int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
                f52343e = i101 % 128;
                int i102 = i101 % 2;
                string2 = "";
            } else {
                StringBuilder sb11 = new StringBuilder(", ");
                sb11.append(string);
                sb11.append(" body");
                string2 = sb11.toString();
                int i103 = f52342d;
                int i104 = i103 & 103;
                int i105 = (i103 ^ 103) | i104;
                int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                f52343e = i106 % 128;
                int i107 = i106 % 2;
            }
            sb10.append(string2);
            sb10.append(RootService.CLOSE_BRACKET);
            setdividerpadding7.setX(sb10.toString());
            if (z11) {
                int i108 = f52343e;
                int i109 = ((i108 | 79) << 1) - (i108 ^ 79);
                f52342d = i109 % 128;
                if (i109 % 2 != 0) {
                    yeVar = (ye) yr.setX(new Object[]{dividerPadding}, 1547100838, -1547100838, System.identityHashCode(dividerPadding));
                    iIntValue = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1558209065, 1558209065, System.identityHashCode(yeVar))).intValue();
                } else {
                    yeVar = (ye) yr.setX(new Object[]{dividerPadding}, 1547100838, -1547100838, System.identityHashCode(dividerPadding));
                    iIntValue = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1558209065, 1558209065, System.identityHashCode(yeVar))).intValue();
                }
                int i110 = f52343e;
                int i111 = (-2) - (((i110 & 4) + (i110 | 4)) ^ (-1));
                f52342d = i111 % 128;
                int i112 = i111 % 2;
                int i113 = 0;
                while (i113 < iIntValue) {
                    int i114 = f52342d;
                    int i115 = i114 & 91;
                    int i116 = (i114 | 91) & (~i115);
                    int i117 = i115 << 1;
                    int i118 = (i116 & i117) + (i116 | i117);
                    f52343e = i118 % 128;
                    if (i118 % 2 == 0) {
                        int i119 = i113 & 80;
                        int i120 = (i113 ^ 80) | i119;
                        i12 = ((i119 & i120) << 1) + (i119 ^ i120);
                        setY(new Object[]{abrVar, yeVar, Integer.valueOf(i113)}, -38491783, 38491786, i113);
                    } else {
                        int i121 = i113 & 100;
                        int i122 = -(-((i113 ^ 100) | i121));
                        int i123 = (i121 ^ i122) + ((i121 & i122) << 1);
                        int i124 = i123 & (-99);
                        i12 = (i124 << 1) + ((~i124) & (i123 | (-99)));
                        setY(new Object[]{abrVar, yeVar, Integer.valueOf(i113)}, -38491783, 38491786, i113);
                    }
                    i113 = i12;
                }
                if (z10) {
                    int i125 = f52342d;
                    int i126 = i125 & 3;
                    int i127 = i125 | 3;
                    int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
                    f52343e = i128 % 128;
                    if (i128 % 2 == 0) {
                        ((Boolean) zt.setX(new Object[]{dividerPadding}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    if (!((Boolean) zt.setX(new Object[]{dividerPadding}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue()) {
                        abrVar.f52344a.setX("<-- END HTTP");
                        int i129 = f52342d;
                        int i130 = i129 & 117;
                        int i131 = (i129 | 117) & (~i130);
                        int i132 = -(-(i130 << 1));
                        int i133 = (i131 ^ i132) + ((i131 & i132) << 1);
                        f52343e = i133 % 128;
                        int i134 = i133 % 2;
                    } else if (((Boolean) setY(new Object[]{(ye) yr.setX(new Object[]{dividerPadding}, 1547100838, -1547100838, System.identityHashCode(dividerPadding))}, -1097570189, 1097570193, (int) System.currentTimeMillis())).booleanValue()) {
                        int i135 = f52343e;
                        int i136 = ((i135 | 9) << 1) - (i135 ^ 9);
                        f52342d = i136 % 128;
                        int i137 = i136 % 2;
                        abrVar.f52344a.setX("<-- END HTTP (encoded body omitted)");
                    } else {
                        aby y10 = ynVar.setY();
                        y10.setOnFocusChangeListener(Long.MAX_VALUE);
                        abx onFocusChangeListener4 = y10.setOnFocusChangeListener();
                        if (l.equals("gzip", (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, "Content-Encoding"}, 914142416, -914142409, System.identityHashCode(yeVar)), true)) {
                            lValueOf = Long.valueOf(((Long) abx.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, 1395393434, -1395393402, System.identityHashCode(onFocusChangeListener4))).longValue());
                            aca acaVar = new aca((abx) abx.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, -1050909291, 1050909303, System.identityHashCode(onFocusChangeListener4)));
                            try {
                                onFocusChangeListener4 = new abx();
                                ((Long) abx.setOnFocusChangeListener(new Object[]{onFocusChangeListener4, acaVar}, -1844326734, 1844326753, System.identityHashCode(onFocusChangeListener4))).longValue();
                                CloseableKt.closeFinally(acaVar, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(acaVar, th2);
                                    throw th3;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        yj x4 = ynVar.setX();
                        if (x4 == null) {
                            int i138 = f52343e + 107;
                            f52342d = i138 % 128;
                            if (i138 % 2 != 0) {
                                throw null;
                            }
                            charset = null;
                        } else {
                            charset = (Charset) yj.setX(new Object[]{x4, StandardCharsets.UTF_8}, -1673590045, 1673590046, System.identityHashCode(x4));
                        }
                        if (charset == null) {
                            int i139 = f52342d;
                            i11 = 1;
                            int i140 = (i139 ^ 103) + ((i139 & 103) << 1);
                            f52343e = i140 % 128;
                            int i141 = i140 % 2;
                            charset = StandardCharsets.UTF_8;
                            str = "";
                            Intrinsics.checkNotNullExpressionValue(charset, str);
                        } else {
                            str = "";
                            i11 = 1;
                        }
                        Object[] objArr9 = new Object[i11];
                        objArr9[0] = onFocusChangeListener4;
                        if (!((Boolean) abq.setY(objArr9, -1111583503, 1111583503, (int) System.currentTimeMillis())).booleanValue()) {
                            abrVar.f52344a.setX(str);
                            setDividerPadding setdividerpadding8 = abrVar.f52344a;
                            StringBuilder sb12 = new StringBuilder("<-- END HTTP (binary ");
                            sb12.append(((Long) abx.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, 1395393434, -1395393402, System.identityHashCode(onFocusChangeListener4))).longValue());
                            sb12.append("-byte body omitted)");
                            setdividerpadding8.setX(sb12.toString());
                            return dividerPadding;
                        }
                        if (onFocusChangeListener3 != 0) {
                            int i142 = f52343e;
                            int i143 = i142 & 17;
                            int i144 = ((((i142 ^ 17) | i143) << 1) - (~(-((i142 | 17) & (~i143))))) - 1;
                            f52342d = i144 % 128;
                            if (i144 % 2 != 0) {
                                abrVar.f52344a.setX(str);
                                abrVar.f52344a.setX(((abx) abx.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, -1050909291, 1050909303, System.identityHashCode(onFocusChangeListener4))).setCompoundDrawableTintBlendMode(charset));
                                throw null;
                            }
                            abrVar.f52344a.setX(str);
                            abrVar.f52344a.setX(((abx) abx.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, -1050909291, 1050909303, System.identityHashCode(onFocusChangeListener4))).setCompoundDrawableTintBlendMode(charset));
                            int i145 = f52342d + 47;
                            f52343e = i145 % 128;
                            int i146 = i145 % 2;
                        }
                        if (lValueOf != null) {
                            setDividerPadding setdividerpadding9 = abrVar.f52344a;
                            StringBuilder sb13 = new StringBuilder("<-- END HTTP (");
                            sb13.append(((Long) abx.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, 1395393434, -1395393402, System.identityHashCode(onFocusChangeListener4))).longValue());
                            sb13.append("-byte, ");
                            sb13.append(lValueOf);
                            sb13.append("-gzipped-byte body)");
                            setdividerpadding9.setX(sb13.toString());
                            int i147 = f52343e + 63;
                            f52342d = i147 % 128;
                            int i148 = i147 % 2;
                        } else {
                            setDividerPadding setdividerpadding10 = abrVar.f52344a;
                            StringBuilder sb14 = new StringBuilder("<-- END HTTP (");
                            sb14.append(((Long) abx.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, 1395393434, -1395393402, System.identityHashCode(onFocusChangeListener4))).longValue());
                            sb14.append("-byte body)");
                            setdividerpadding10.setX(sb14.toString());
                        }
                    }
                } else {
                    abrVar.f52344a.setX("<-- END HTTP");
                    int i1210 = f52342d;
                    int i1310 = i1210 & 117;
                    int i1311 = (i1210 | 117) & (~i1310);
                    int i1312 = -(-(i1310 << 1));
                    int i1313 = (i1311 ^ i1312) + ((i1311 & i1312) << 1);
                    f52343e = i1313 % 128;
                    int i1314 = i1313 % 2;
                }
            }
            return dividerPadding;
        } catch (Exception e5) {
            abrVar.f52344a.setX(Intrinsics.stringPlus("<-- HTTP FAILED: ", e5));
            throw e5;
        }
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        String str;
        Boolean bool;
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i15 = ~i11;
        int i16 = ((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14;
        if (i16 == 1) {
            abr abrVar = (abr) objArr[0];
            setY sety = (setY) objArr[1];
            int i17 = f52342d;
            int i18 = ((i17 | 123) << 1) - (((~i17) & 123) | (i17 & (-124)));
            f52343e = i18 % 128;
            if (i18 % 2 == 0) {
                Intrinsics.checkNotNullParameter(sety, "");
                setY(new Object[]{abrVar, sety}, -1123256186, 1123256186, System.identityHashCode(abrVar));
                int i19 = 25 / 0;
            } else {
                Intrinsics.checkNotNullParameter(sety, "");
                setY(new Object[]{abrVar, sety}, -1123256186, 1123256186, System.identityHashCode(abrVar));
            }
            int i20 = f52343e;
            int i21 = ((i20 | 1) << 1) - (i20 ^ 1);
            f52342d = i21 % 128;
            int i22 = i21 % 2;
            return abrVar;
        }
        if (i16 == 2) {
            return a(objArr);
        }
        if (i16 == 3) {
            abr abrVar2 = (abr) objArr[0];
            ye yeVar = (ye) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i23 = f52343e;
            int i24 = (i23 ^ 59) + ((i23 & 59) << 1);
            f52342d = i24 % 128;
            if (i24 % 2 != 0) {
                abrVar2.f52345b.contains((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(iIntValue)}, 611642845, -611642844, iIntValue));
                throw null;
            }
            if (!abrVar2.f52345b.contains((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(iIntValue)}, 611642845, -611642844, iIntValue))) {
                str = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(iIntValue)}, -1668064352, 1668064356, iIntValue);
                int i25 = f52343e;
                int i26 = ((i25 | 13) << 1) - (i25 ^ 13);
                f52342d = i26 % 128;
                int i27 = i26 % 2;
            } else {
                int i28 = f52343e;
                int i29 = i28 & 29;
                int i30 = ((i28 ^ 29) | i29) << 1;
                int i31 = -((~i29) & (i28 | 29));
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                f52342d = i32 % 128;
                if (i32 % 2 != 0) {
                    throw null;
                }
                int i33 = (i28 & 22) + (i28 | 22);
                int i34 = (i33 ^ (-1)) + (i33 << 1);
                f52342d = i34 % 128;
                int i35 = i34 % 2;
                str = "██";
            }
            setDividerPadding setdividerpadding = abrVar2.f52344a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(iIntValue)}, 611642845, -611642844, iIntValue));
            sb2.append(": ");
            sb2.append(str);
            setdividerpadding.setX(sb2.toString());
            int i36 = f52343e;
            int i37 = i36 | 41;
            int i38 = (i37 << 1) - ((~(i36 & 41)) & i37);
            f52342d = i38 % 128;
            if (i38 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i16 != 4) {
            abr abrVar3 = (abr) objArr[0];
            setY sety2 = (setY) objArr[1];
            int i39 = f52343e;
            int i40 = i39 & 75;
            int i41 = (((i39 ^ 75) | i40) << 1) - ((i39 | 75) & (~i40));
            f52342d = i41 % 128;
            if (i41 % 2 != 0) {
                Intrinsics.checkNotNullParameter(sety2, "");
                abrVar3.f52346c = sety2;
                int i42 = 40 / 0;
            } else {
                Intrinsics.checkNotNullParameter(sety2, "");
                abrVar3.f52346c = sety2;
            }
            int i43 = f52343e;
            int i44 = i43 & 17;
            int i45 = (i44 - (~(-(-((i43 ^ 17) | i44))))) - 1;
            f52342d = i45 % 128;
            int i46 = i45 % 2;
            return null;
        }
        ye yeVar2 = (ye) objArr[0];
        int i47 = f52342d;
        int i48 = (i47 | 115) << 1;
        int i49 = -(i47 ^ 115);
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        f52343e = i50 % 128;
        int i51 = i50 % 2;
        String str2 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar2, "Content-Encoding"}, 914142416, -914142409, System.identityHashCode(yeVar2));
        if (str2 == null) {
            int i52 = f52343e;
            int i53 = i52 & 91;
            int i54 = (i53 - (~(-(-((i52 ^ 91) | i53))))) - 1;
            f52342d = i54 % 128;
            int i55 = i54 % 2;
            int i56 = i52 + 55;
            f52342d = i56 % 128;
            int i57 = i56 % 2;
        } else {
            if (!l.equals(str2, "identity", true)) {
                int i58 = f52343e;
                int i59 = i58 & 33;
                int i60 = (i58 ^ 33) | i59;
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                f52342d = i61 % 128;
                if (i61 % 2 == 0 ? !l.equals(str2, "gzip", true) : !l.equals(str2, "gzip", true)) {
                    int i62 = f52342d;
                    int i63 = ((i62 & 98) + (i62 | 98)) - 1;
                    f52343e = i63 % 128;
                    int i64 = i63 % 2;
                    bool = Boolean.TRUE;
                }
                return bool;
            }
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i65 = 73315625 & iCurrentTimeMillis;
            int i66 = (~i65) & (73315625 | iCurrentTimeMillis);
            int i67 = ~iCurrentTimeMillis;
            int i68 = (i65 & i66) | (i66 ^ i65);
            int i69 = ~i68;
            int i70 = (i68 | i69) & i69;
            int i71 = 1478576708 ^ i70;
            int i72 = i70 & 1478576708;
            int i73 = (i72 & i71) | (i71 ^ i72);
            int i74 = ((-1549880933) & i67) | (1549880932 & iCurrentTimeMillis);
            int i75 = (-1549880933) & iCurrentTimeMillis;
            int i76 = ~((i74 & i75) | (i74 ^ i75));
            int i77 = -(-(((i73 & i76) | (i73 ^ i76)) * (-754)));
            int i78 = (((~i77) & (-689484745)) | (689484744 & i77)) + ((i77 & (-689484745)) << 1);
            int i79 = ~(((-1478576709) & iCurrentTimeMillis) | ((-1478576709) ^ iCurrentTimeMillis));
            int i80 = (iCurrentTimeMillis | i67) & i67;
            int i81 = (i80 & (-73315626)) | (i80 ^ (-73315626));
            int i82 = i81 & (-1549880933);
            int i83 = (i81 | (-1549880933)) & (~i82);
            int i84 = ~((i83 & i82) | (i83 ^ i82));
            int i85 = i79 ^ i84;
            int i86 = i84 & i79;
            int i87 = -(-(((i86 & i85) | (i85 ^ i86)) * (-754)));
            int i88 = (i78 & i87) + (i87 | i78);
            int i89 = 73315625 ^ i67;
            int i90 = 73315625 & i67;
            int i91 = (((i89 & i90) | (i89 ^ i90)) * 754) + i88;
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i92 = ~iCurrentTimeMillis2;
            int i93 = ~i92;
            int i94 = ((-746751457) & i93) | (i92 & 746751456) | ((-746751457) & i92);
            int i95 = ~i94;
            int i96 = (i94 | i95) & i95;
            int i97 = 450889200 & i92;
            int i98 = ~((iCurrentTimeMillis2 & (-450889201)) | i97 | (450889200 & iCurrentTimeMillis2));
            int i99 = ((~i98) & i96) | ((~i96) & i98);
            int i100 = i96 & i98;
            int i101 = (((i100 & i99) | (i99 ^ i100)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + 610438625;
            int i102 = (i93 & 450889200) | (i92 & (-450889201));
            int i103 = (i102 & i97) | (i102 ^ i97);
            int i104 = ((-746751457) & i103) | ((~i103) & 746751456);
            int i105 = i103 & 746751456;
            int i106 = ~((i105 & i104) | (i104 ^ i105));
            int i107 = (i92 & (-142607841)) | (142607840 & iCurrentTimeMillis2);
            int i108 = iCurrentTimeMillis2 & (-142607841);
            int i109 = ~((i108 & i107) | (i107 ^ i108));
            int i110 = i106 ^ i109;
            int i111 = i109 & i106;
            int i112 = -(-(((i111 & i110) | (i110 ^ i111)) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
            int i113 = i101 & i112;
            if (i91 > i113 + ((i112 ^ i101) | i113)) {
                throw null;
            }
        }
        bool = Boolean.FALSE;
        return bool;
    }

    @NotNull
    public final abr setOnFocusChangeListener(@NotNull setY p4) {
        return (abr) setY(new Object[]{this, p4}, -307528281, 307528282, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.yl
    @NotNull
    public final yr setX(@NotNull yl.setCompoundDrawableTintBlendMode p4) throws IOException {
        return (yr) setY(new Object[]{this, p4}, 658914892, -658914890, System.identityHashCode(this));
    }

    public /* synthetic */ abr(setDividerPadding setdividerpadding, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? setDividerPadding.setX : setdividerpadding);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public abr() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

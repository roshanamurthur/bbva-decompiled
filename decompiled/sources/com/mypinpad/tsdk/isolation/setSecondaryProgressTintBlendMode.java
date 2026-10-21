package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode;", "Ljava/io/Serializable;", "<init>", "()V", "setY", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setX", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode$setCompoundDrawableTintBlendMode;", "Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode$setX;", "Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode$setOnFocusChangeListener;", "Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode$setY;", "Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode$setDividerPadding;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class setSecondaryProgressTintBlendMode implements Serializable {

    public static final class setCompoundDrawableTintBlendMode extends setSecondaryProgressTintBlendMode {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final long f60514q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60515r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f60516s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f60517t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f60518u0;
        public static final byte[] v0 = null;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final setElegantTextHeight f60519p0;

        static {
            a();
            f60517t0 = 0;
            f60518u0 = 1;
            f60515r0 = 0;
            f60516s0 = 1;
            f60514q0 = -4185640938608499188L;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setCompoundDrawableTintBlendMode(@NotNull setElegantTextHeight seteleganttextheight) {
            super(null);
            Intrinsics.checkNotNullParameter(seteleganttextheight, "");
            this.f60519p0 = seteleganttextheight;
        }

        public static void a() {
            v0 = new byte[]{122, -117, -53, 52};
        }

        public final boolean equals(@Nullable Object obj) throws Throwable {
            Class<?> cls;
            char[] charArray;
            int i10 = 1;
            int i11 = 2;
            if (this == obj) {
                int i12 = f60515r0 + 117;
                f60516s0 = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
                int i14 = f60515r0 + 69;
                f60516s0 = i14 % 128;
                int i15 = i14 % 2;
            }
            if (!Intrinsics.areEqual(setCompoundDrawableTintBlendMode.class, cls)) {
                return false;
            }
            if (obj != null) {
                if (this.f60519p0 != ((setCompoundDrawableTintBlendMode) obj).f60519p0) {
                    return false;
                }
                int i16 = f60515r0 + 11;
                f60516s0 = i16 % 128;
                if (i16 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1;
            int i17 = f60518u0 + 45;
            int i18 = i17 % 128;
            f60517t0 = i18;
            if (i17 % 2 != 0) {
                throw null;
            }
            int i19 = i18 + 121;
            f60518u0 = i19 % 128;
            if (i19 % 2 == 0) {
                charArray = "\ue6c6取\ue6a8ᥰತ饮䷣귶춪▪찷䙈뀰\uf2d2\ue0ee竒杀鼄ᬎ\u2fdd䮗ꮦ丆쁪㻎烶抦\uf578\ue561ᴣ闧꧌즧⩝졲䉎볒\uf69cﳒ睟捊菊យ⮫嘐ꡰ䩃\udce2㫫璯紾\uf13f\ue132ƛ釡ꖏ푹⸌쑔廟뢚ﭔｄ猫濜蟥Ꮫ⑩剴갤䚶\ud8b3ڥ祧礸贖\uedf7֓건Ꙣ퀋틏삫媐蝂ｧוֹ\u0fdc殟讫⸢‿席價䊤풡ճ紟疽觋\ue98a".toCharArray();
                int i20 = 69 / 0;
            } else {
                charArray = "\ue6c6取\ue6a8ᥰತ饮䷣귶춪▪찷䙈뀰\uf2d2\ue0ee竒杀鼄ᬎ\u2fdd䮗ꮦ丆쁪㻎烶抦\uf578\ue561ᴣ闧꧌즧⩝졲䉎볒\uf69cﳒ睟捊菊យ⮫嘐ꡰ䩃\udce2㫫璯紾\uf13f\ue132ƛ釡ꖏ푹⸌쑔廟뢚ﭔｄ猫濜蟥Ꮫ⑩剴갤䚶\ud8b3ڥ祧礸贖\uedf7֓건Ꙣ퀋틏삫媐蝂ｧוֹ\u0fdc殟讫⸢‿席價䊤풡ճ紟疽觋\ue98a".toCharArray();
            }
            setOnDragListener setondraglistener = new setOnDragListener();
            long j10 = f60514q0;
            char[] y7 = setOnDragListener.setY(2122665171656649951L ^ j10, charArray, tapTimeout);
            setondraglistener.setDividerPadding = 4;
            while (true) {
                int i21 = setondraglistener.setDividerPadding;
                if (i21 >= y7.length) {
                    throw new NullPointerException(new String(y7, 4, y7.length - 4).intern());
                }
                int i22 = f60517t0 + 97;
                f60518u0 = i22 % 128;
                int i23 = i22 % i11;
                int i24 = i21 - 4;
                setondraglistener.setX = i24;
                long j11 = y7[i21] ^ y7[i21 % 4];
                setOnDragListener setondraglistener2 = setondraglistener;
                long j12 = i24;
                try {
                    Object[] objArr = new Object[3];
                    objArr[i11] = Long.valueOf(j10);
                    objArr[i10] = Long.valueOf(j12);
                    objArr[0] = Long.valueOf(j11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(2144228148);
                    if (method == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9778), (ViewConfiguration.getEdgeSlop() >> 16) + 43, 3188 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        Class<?>[] clsArr = new Class[3];
                        Class<?> cls3 = Long.TYPE;
                        clsArr[0] = cls3;
                        clsArr[i10] = cls3;
                        clsArr[i11] = cls3;
                        method = cls2.getMethod("y", clsArr);
                        map.put(2144228148, method);
                    }
                    y7[i21] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    Object[] objArr2 = new Object[i11];
                    objArr2[i10] = setondraglistener2;
                    objArr2[0] = setondraglistener2;
                    Object method2 = map.get(-62642757);
                    if (method2 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), 51 - TextUtils.indexOf((CharSequence) "", '0', 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3029);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[i10];
                        int i25 = 117 - (b11 * 4);
                        int i26 = 1 - (b12 * i11);
                        int i27 = 3 - (b10 * 2);
                        byte[] bArr = new byte[i26];
                        byte[] bArr2 = v0;
                        int i28 = 0;
                        if (bArr2 == null) {
                            i25 += -i27;
                            i27 = i27;
                        }
                        while (true) {
                            int i29 = i28 + 1;
                            bArr[i28] = (byte) i25;
                            if (i29 == i26) {
                                break;
                            }
                            int i30 = i27 + 1;
                            i28 = i29;
                            i25 += -bArr2[i30];
                            i27 = i30;
                        }
                        objArr3[0] = new String(bArr, 0);
                        method2 = cls4.getMethod((String) objArr3[0], Object.class, Object.class);
                        setTextScaleX.setMaxEms.put(-62642757, method2);
                    }
                    ((Method) method2).invoke(null, objArr2);
                    setondraglistener = setondraglistener2;
                    i10 = 1;
                    i11 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        }

        public final int hashCode() {
            int i10 = f60515r0 + 61;
            f60516s0 = i10 % 128;
            int i11 = i10 % 2;
            int iHashCode = this.f60519p0.hashCode();
            int i12 = f60516s0 + 63;
            f60515r0 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 30 / 0;
            }
            return iHashCode;
        }

        @NotNull
        public final setElegantTextHeight setY() {
            int i10 = f60515r0 + 25;
            f60516s0 = i10 % 128;
            if (i10 % 2 != 0) {
                return this.f60519p0;
            }
            throw null;
        }
    }

    public static final class setDividerPadding extends setSecondaryProgressTintBlendMode {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final char[] f60520q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60521r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f60522s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f60523t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f60524u0;
        public static final byte[] v0 = null;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final setMeasureWithLargestChildEnabled f60525p0;

        static {
            b();
            f60523t0 = 0;
            f60524u0 = 1;
            f60521r0 = 0;
            f60522s0 = 1;
            f60520q0 = new char[]{59288, 59294, 59283, 59288, 59267, 59295, 58974, 59295, 59289, 59285, 58920, 59287, 59288, 59267, 59268, 58920, 59292, 59292, 59271, 59294, 58975, 59294, 59289, 59294, 58920, 59289, 59268, 58920, 59268, 59269, 58987, 59285, 58920, 59287, 58986, 58920, 59268, 59289, 59294, 59294, 58987, 59285, 58920, 59292, 59292, 59271, 59294, 59287, 59268, 59287, 59292, 59288, 59295, 59289, 58997, 58974, 59268, 59285, 59283, 59284, 59290, 59287, 58982, 59267, 59290, 59268, 59294, 58999, 59294, 59283, 59000, 58974, 59294, 59283, 59288, 58974, 59294, 59289, 59283, 59268, 58987, 59290, 59281, 59287, 59268, 59294, 59283, 58974, 59267, 59268, 59283, 59290, 59271, 59285, 59287, 59269, 58974, 59284, 58987};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setDividerPadding(@NotNull setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled) {
            super(null);
            Intrinsics.checkNotNullParameter(setmeasurewithlargestchildenabled, "");
            this.f60525p0 = setmeasurewithlargestchildenabled;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = 4 - r6
                int r7 = r7 * 4
                int r0 = 1 - r7
                int r8 = r8 + 97
                byte[] r0 = new byte[r0]
                r1 = 0
                int r7 = 0 - r7
                byte[] r2 = com.mypinpad.tsdk.i.setSecondaryProgressTintBlendMode.setDividerPadding.v0
                if (r2 != 0) goto L18
                r8 = r7
                r3 = r8
                r4 = r1
                r7 = r6
                goto L31
            L18:
                r3 = r1
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L1d:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L2c:
                r3 = r2[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L31:
                int r6 = r6 + 1
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setSecondaryProgressTintBlendMode.setDividerPadding.a(byte, int, short, java.lang.Object[]):void");
        }

        public static void b() {
            v0 = new byte[]{27, 123, 116, -20};
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v10 java.lang.NullPointerException, still in use, count: 2, list:
              (r0v10 java.lang.NullPointerException) from 0x0188: MOVE (r23v1 java.lang.NullPointerException) = (r0v10 java.lang.NullPointerException) (LINE:393)
              (r0v10 java.lang.NullPointerException) from 0x006a: PHI (r0v18 java.lang.NullPointerException) = (r0v10 java.lang.NullPointerException), (r0v27 java.lang.NullPointerException) binds: [B:17:0x0066, B:28:0x00f1] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 501
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setSecondaryProgressTintBlendMode.setDividerPadding.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int i10 = f60522s0 + 69;
            f60521r0 = i10 % 128;
            int i11 = i10 % 2;
            int iHashCode = this.f60525p0.hashCode();
            int i12 = f60522s0 + 117;
            f60521r0 = i12 % 128;
            int i13 = i12 % 2;
            return iHashCode;
        }

        @NotNull
        public final setMeasureWithLargestChildEnabled setOnFocusChangeListener() {
            int i10 = f60522s0 + 61;
            f60521r0 = i10 % 128;
            if (i10 % 2 == 0) {
                return this.f60525p0;
            }
            throw null;
        }
    }

    public static final class setOnFocusChangeListener extends setSecondaryProgressTintBlendMode {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f60526p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60527q0 = 1;

        public setOnFocusChangeListener() {
            super(null);
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i12 | i11);
            if ((((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109)) == 1) {
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                int i15 = f60526p0;
                int i16 = ((-1) << 1) - ((-1) ^ ((i15 & 70) + (i15 | 70)));
                f60527q0 = i16 % 128;
                int i17 = i16 % 2;
                int iHashCode = setonfocuschangelistener.getClass().hashCode();
                System.identityHashCode(setonfocuschangelistener);
                System.identityHashCode(setonfocuschangelistener);
                return Integer.valueOf(iHashCode);
            }
            Boolean bool = Boolean.FALSE;
            setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
            Object obj = objArr[1];
            int i18 = f60527q0;
            int i19 = i18 & 33;
            int i20 = (i18 | 33) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            int i23 = i22 % 128;
            f60526p0 = i23;
            Class<?> cls = null;
            if (i22 % 2 != 0) {
                throw null;
            }
            if (setonfocuschangelistener2 == obj) {
                int i24 = ((i23 & 72) + (i23 | 72)) - 1;
                int i25 = i24 % 128;
                f60527q0 = i25;
                boolean z10 = i24 % 2 != 0;
                int i26 = i25 + 49;
                f60526p0 = i26 % 128;
                int i27 = i26 % 2;
                return Boolean.valueOf(z10);
            }
            Class<?> cls2 = setonfocuschangelistener2.getClass();
            if (obj == null) {
                int i28 = f60527q0;
                int i29 = i28 & 41;
                int i30 = (i29 - (~((i28 ^ 41) | i29))) - 1;
                f60526p0 = i30 % 128;
                if (i30 % 2 != 0) {
                    throw null;
                }
            } else {
                cls = obj.getClass();
                int i31 = f60526p0;
                int i32 = (i31 & 37) + (i31 | 37);
                f60527q0 = i32 % 128;
                int i33 = i32 % 2;
            }
            if (Intrinsics.areEqual(cls2, cls)) {
                int i34 = f60526p0;
                int i35 = ((i34 | 33) << 1) - (((~i34) & 33) | (i34 & (-34)));
                f60527q0 = i35 % 128;
                int i36 = i35 % 2;
                return Boolean.TRUE;
            }
            int i37 = f60527q0;
            int i38 = i37 & 31;
            int i39 = (~i38) & (i37 | 31);
            int i40 = -(-(i38 << 1));
            int i41 = (i39 & i40) + (i40 | i39);
            f60526p0 = i41 % 128;
            int i42 = i41 % 2;
            int i43 = i37 + 37;
            f60526p0 = i43 % 128;
            if (i43 % 2 == 0) {
                return bool;
            }
            int i44 = 17 / 0;
            return bool;
        }

        public final boolean equals(@Nullable Object obj) {
            return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1391587720, -1391587720, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) setDividerPadding(new Object[]{this}, -184579944, 184579945, System.identityHashCode(this))).intValue();
        }
    }

    public static final class setX extends setSecondaryProgressTintBlendMode {
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            ((setX) objArr[0]).getClass();
            return null;
        }

        @Nullable
        public final Throwable setCompoundDrawableTintBlendMode() {
            return (Throwable) setY(new Object[]{this}, -73350345, 73350345, System.identityHashCode(this));
        }
    }

    public static final class setY extends setSecondaryProgressTintBlendMode {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f60528p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60529q0 = 1;

        public setY() {
            super(null);
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            Class<?> cls;
            int i13 = (i11 * 702) + (i10 * (-700));
            int i14 = ~i10;
            int i15 = ~i11;
            if ((i15 * 701) + ((i14 | i11) * (-701)) + ((~(i14 | i15)) * 701) + i13 == 1) {
                setY sety = (setY) objArr[0];
                int i16 = f60528p0 + 113;
                f60529q0 = i16 % 128;
                int i17 = i16 % 2;
                Class<?> cls2 = sety.getClass();
                if (i17 == 0) {
                    cls2.hashCode();
                    throw null;
                }
                int iHashCode = cls2.hashCode();
                int i18 = f60528p0;
                int i19 = (i18 & (-46)) | ((~i18) & 45);
                int i20 = -(-((i18 & 45) << 1));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f60529q0 = i21 % 128;
                int i22 = i21 % 2;
                return Integer.valueOf(iHashCode);
            }
            setY sety2 = (setY) objArr[0];
            Object obj = objArr[1];
            int i23 = f60528p0;
            int i24 = ((i23 | 121) << 1) - (i23 ^ 121);
            int i25 = i24 % 128;
            f60529q0 = i25;
            int i26 = i24 % 2;
            if (sety2 == obj) {
                int i27 = i25 & 23;
                int i28 = (i25 ^ 23) | i27;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                f60528p0 = i29 % 128;
                int i30 = i29 % 2;
                int i31 = i25 & 67;
                int i32 = (i25 ^ 67) | i31;
                int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                f60528p0 = i33 % 128;
                if (i33 % 2 != 0) {
                    int i34 = 80 / 0;
                }
            } else {
                Class<?> cls3 = sety2.getClass();
                if (obj == null) {
                    int i35 = f60528p0;
                    int i36 = ((i35 & (-72)) | ((~i35) & 71)) + ((i35 & 71) << 1);
                    int i37 = i36 % 128;
                    f60529q0 = i37;
                    int i38 = i36 % 2;
                    int i39 = i37 + 58;
                    int i40 = (i39 ^ (-1)) + (i39 << 1);
                    f60528p0 = i40 % 128;
                    int i41 = i40 % 2;
                    cls = null;
                } else {
                    cls = obj.getClass();
                    int i42 = f60529q0;
                    int i43 = (((i42 | 48) << 1) - (i42 ^ 48)) - 1;
                    f60528p0 = i43 % 128;
                    int i44 = i43 % 2;
                }
                if (!Intrinsics.areEqual(cls3, cls)) {
                    int i45 = f60529q0;
                    int i46 = i45 & 27;
                    int i47 = (i45 ^ 27) | i46;
                    int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                    int i49 = i48 % 128;
                    f60528p0 = i49;
                    int i50 = i48 % 2;
                    int i51 = i49 + 101;
                    f60529q0 = i51 % 128;
                    int i52 = i51 % 2;
                    return Boolean.FALSE;
                }
                int i53 = f60529q0;
                int i54 = (i53 & 23) + (i53 | 23);
                f60528p0 = i54 % 128;
                if (i54 % 2 != 0) {
                    throw null;
                }
            }
            return Boolean.TRUE;
        }

        public final boolean equals(@Nullable Object obj) {
            return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, 785312607, -785312607, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1894546580, 1894546581, System.identityHashCode(this))).intValue();
        }
    }

    private setSecondaryProgressTintBlendMode() {
    }

    public /* synthetic */ setSecondaryProgressTintBlendMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

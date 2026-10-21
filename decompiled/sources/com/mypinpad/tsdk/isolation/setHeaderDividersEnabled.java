package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setHeaderDividersEnabled implements Closeable {
    public static int E0;
    public static int F0;
    public static int G0;
    public static final byte[] H0 = null;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int[] f59771x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f59772y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f59773p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f59774q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final setCompoundDrawablesRelativeWithIntrinsicBounds f59775r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final execute f59776s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f59777t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public char[] f59778u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final getBeepOnSuccess f59779w0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setY", "(I)[B"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<Integer, byte[]> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f59780q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f59781r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setRight f59782p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(setRight setright) {
            super(1);
            this.f59782p0 = setright;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~(i10 | i12);
            int i17 = ((i15 | i16) * (-814)) + i13;
            int i18 = ~(i14 | (~i12));
            int i19 = ~i10;
            int i20 = ~(i19 | i11);
            if ((((~(i19 | i12)) | i20 | (~(i11 | i12))) * 407) + ((i18 | i20 | i16) * 407) + i17 != 1) {
                a aVar = (a) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i21 = f59780q0 + 9;
                f59781r0 = i21 % 128;
                int i22 = i21 % 2;
                byte[] y7 = setRight.setY(aVar.f59782p0, iIntValue);
                int i23 = f59781r0;
                int i24 = ((i23 & (-108)) | ((~i23) & 107)) + ((i23 & 107) << 1);
                f59780q0 = i24 % 128;
                int i25 = i24 % 2;
                return y7;
            }
            a aVar2 = (a) objArr[0];
            Object obj = objArr[1];
            int i26 = f59780q0;
            int i27 = i26 & 49;
            int i28 = (i26 | 49) & (~i27);
            int i29 = i27 << 1;
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            f59781r0 = i30 % 128;
            int i31 = i30 % 2;
            int iIntValue2 = ((Number) obj).intValue();
            Object[] objArr2 = new Object[2];
            if (i31 != 0) {
                objArr2[0] = aVar2;
                objArr2[1] = Integer.valueOf(iIntValue2);
                return (byte[]) a(objArr2, -1582466464, 1582466464, iIntValue2);
            }
            objArr2[0] = aVar2;
            objArr2[1] = Integer.valueOf(iIntValue2);
            a(objArr2, -1582466464, 1582466464, iIntValue2);
            throw null;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ byte[] invoke(Integer num) {
            return a(new Object[]{this, num}, 33496464, -33496463, System.identityHashCode(this));
        }
    }

    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final execute f59783a;

        public setOnFocusChangeListener(@NotNull execute executeVar) {
            Intrinsics.checkNotNullParameter(executeVar, "");
            this.f59783a = executeVar;
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            return ((setOnFocusChangeListener) objArr[0]).f59783a;
        }

        @NotNull
        public final execute setX() {
            return (execute) setY(new Object[]{this}, -1617459082, 1617459082, System.identityHashCode(this));
        }
    }

    static {
        e();
        F0 = 0;
        G0 = 1;
        f59772y0 = 0;
        E0 = 1;
        f59771x0 = new int[]{-1095364884, -985567763, 928353038, -2124274578, -209493146, -869075459, -1049829111, -506073179, 1181222339, -1536788373, 108262764, -1627602679, 357713348, 63052046, -1137977816, 471041712, -555788980, -1284690878};
    }

    public setHeaderDividersEnabled(@NotNull setRight setright, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(setright, "");
        this.f59773p0 = z10;
        this.f59774q0 = z11;
        this.f59775r0 = new setCompoundDrawablesRelativeWithIntrinsicBounds();
        this.f59776s0 = new execute();
        this.f59779w0 = new getBeepOnSuccess(new a(setright));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r7 = 108 - r7
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.setHeaderDividersEnabled.H0
            if (r2 != 0) goto L19
            r4 = r7
            r3 = r1
            r7 = r5
            goto L2b
        L19:
            r3 = r1
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r1)
            r8[r1] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r2[r5]
        L2b:
            int r5 = r5 + 1
            int r4 = -r4
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setHeaderDividersEnabled.a(byte, short, short, java.lang.Object[]):void");
    }

    public static void e() {
        H0 = new byte[]{82, 1, 85, -74};
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0083 A[PHI: r7 r8
      0x0083: PHI (r7v8 java.lang.Character) = (r7v4 java.lang.Character), (r7v9 java.lang.Character) binds: [B:15:0x0081, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r8v3 int) = (r8v1 int), (r8v4 int) binds: [B:15:0x0081, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[SYNTHETIC] */
    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws setRotation {
        Character next;
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = ~i11;
        if (((~(i10 | i16)) * 69) + (((~(i11 | i12)) | (~(i15 | i12)) | (~(i15 | i11))) * (-69)) + (((~(i15 | i16 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70) == 1) {
            setHeaderDividersEnabled setheaderdividersenabled = (setHeaderDividersEnabled) objArr[0];
            int i17 = E0 + 67;
            f59772y0 = i17 % 128;
            int i18 = i17 % 2;
            boolean z10 = setheaderdividersenabled.f59777t0;
            if (i18 == 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        setHeaderDividersEnabled setheaderdividersenabled2 = (setHeaderDividersEnabled) objArr[0];
        int i19 = f59772y0 + 69;
        E0 = i19 % 128;
        int i20 = i19 % 2;
        if (!setheaderdividersenabled2.setLayoutAnimation()) {
            throw new setRotation(902);
        }
        execute executeVar = new execute();
        char[] cArr = (char[]) setCompoundDrawablesRelativeWithIntrinsicBounds.setY(new Object[]{setheaderdividersenabled2.f59775r0, 0}, 1108736109, -1108736108, 0);
        Iterator<Character> it = setheaderdividersenabled2.f59776s0.iterator();
        int i21 = 0;
        while (it.hasNext()) {
            int i22 = E0 + 91;
            f59772y0 = i22 % 128;
            if (i22 % 2 != 0) {
                next = it.next();
                i13 = i21 + 90;
                if (i21 < 0) {
                    i14 = E0 + 49;
                    f59772y0 = i14 % 128;
                    if (i14 % 2 == 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                } else {
                    continue;
                }
            } else {
                next = it.next();
                i13 = i21 + 1;
                if (i21 < 0) {
                    i14 = E0 + 49;
                    f59772y0 = i14 % 128;
                    if (i14 % 2 == 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                } else {
                    continue;
                }
            }
            int i23 = i21 + 1;
            executeVar.add(Character.valueOf(cArr[ArraysKt___ArraysKt.indexOf((char[]) setCompoundDrawablesRelativeWithIntrinsicBounds.setY(new Object[]{setheaderdividersenabled2.setY(), Integer.valueOf(i23)}, 1108736109, -1108736108, i23), next.charValue())]));
            i21 = i13;
        }
        int i24 = f59772y0 + 115;
        E0 = i24 % 128;
        if (i24 % 2 == 0) {
            throw null;
        }
        setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener(executeVar);
        int i25 = E0 + 1;
        f59772y0 = i25 % 128;
        if (i25 % 2 == 0) {
            return setonfocuschangelistener;
        }
        int i26 = 96 / 0;
        return setonfocuschangelistener;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 java.lang.IllegalStateException, still in use, count: 2, list:
          (r0v9 java.lang.IllegalStateException) from 0x00ca: MOVE (r23v0 java.lang.IllegalStateException) = (r0v9 java.lang.IllegalStateException) (LINE:203)
          (r0v9 java.lang.IllegalStateException) from 0x003f: PHI (r0v28 java.lang.IllegalStateException) = (r0v9 java.lang.IllegalStateException), (r0v35 java.lang.IllegalStateException) binds: [B:8:0x003b, B:16:0x00b4] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setHeaderDividersEnabled.b():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = E0 + 79;
        f59772y0 = i10 % 128;
        int i11 = i10 % 2;
        this.f59777t0 = true;
        execute executeVar = this.f59776s0;
        execute.setDividerPadding(new Object[]{executeVar}, -928336311, 928336316, System.identityHashCode(executeVar));
        char[] compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode();
        Iterator<Integer> it = ArraysKt___ArraysKt.getIndices(compoundDrawableTintBlendMode).iterator();
        while (!(!it.hasNext())) {
            int i12 = E0 + 17;
            f59772y0 = i12 % 128;
            if (i12 % 2 != 0) {
                compoundDrawableTintBlendMode[((IntIterator) it).nextInt()] = (char) Random.INSTANCE.nextInt();
                throw null;
            }
            compoundDrawableTintBlendMode[((IntIterator) it).nextInt()] = (char) Random.INSTANCE.nextInt();
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds = this.f59775r0;
        setCompoundDrawablesRelativeWithIntrinsicBounds.setY(new Object[]{setcompounddrawablesrelativewithintrinsicbounds}, -1787621891, 1787621891, System.identityHashCode(setcompounddrawablesrelativewithintrinsicbounds));
    }

    @NotNull
    public final char[] setCompoundDrawableTintBlendMode() {
        int i10 = f59772y0 + 65;
        E0 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        char[] cArr = this.f59778u0;
        if (cArr != null) {
            return cArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i11 = E0 + 107;
        f59772y0 = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 125080965, -125080964, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        execute executeVar = this.f59776s0;
        if (executeVar.size() < 4 && (!this.f59774q0 || executeVar.size() != 0)) {
            int i10 = f59772y0 + 29;
            E0 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = f59772y0 + 123;
        E0 = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @NotNull
    public final char[] setNavigationOnClickListener() {
        int i10 = f59772y0 + 109;
        E0 = i10 % 128;
        int i11 = i10 % 2;
        byte b10 = 10;
        char[] cArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        while (b10 > 1) {
            int i12 = E0 + 25;
            f59772y0 = i12 % 128;
            int i13 = i12 % 2;
            getBeepOnSuccess getbeeponsuccess = this.f59779w0;
            if (i13 != 0) {
                byte bByteValue = ((Byte) getBeepOnSuccess.setCompoundDrawableTintBlendMode(new Object[]{getbeeponsuccess, Byte.valueOf(b10)}, 408057020, -408057019, System.identityHashCode(getbeeponsuccess))).byteValue();
                char cCharValue = ((Character) readObject.setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(bByteValue)}, -144701569, 144701570, (int) System.currentTimeMillis())).charValue();
                b10 = (byte) (b10 / (-1));
                readObject.setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(bByteValue), Character.valueOf(((Character) readObject.setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(b10)}, -144701569, 144701570, (int) System.currentTimeMillis())).charValue())}, -776996633, 776996635, (int) System.currentTimeMillis());
                readObject.setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(b10), Character.valueOf(cCharValue)}, -776996633, 776996635, (int) System.currentTimeMillis());
            } else {
                byte bByteValue2 = ((Byte) getBeepOnSuccess.setCompoundDrawableTintBlendMode(new Object[]{getbeeponsuccess, Byte.valueOf(b10)}, 408057020, -408057019, System.identityHashCode(getbeeponsuccess))).byteValue();
                char cCharValue2 = ((Character) readObject.setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(bByteValue2)}, -144701569, 144701570, (int) System.currentTimeMillis())).charValue();
                b10 = (byte) (b10 - 1);
                readObject.setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(bByteValue2), Character.valueOf(((Character) readObject.setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(b10)}, -144701569, 144701570, (int) System.currentTimeMillis())).charValue())}, -776996633, 776996635, (int) System.currentTimeMillis());
                readObject.setCompoundDrawableTintBlendMode(new Object[]{cArr, Byte.valueOf(b10), Character.valueOf(cCharValue2)}, -776996633, 776996635, (int) System.currentTimeMillis());
            }
        }
        int i14 = E0 + 11;
        f59772y0 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 45 / 0;
        }
        return cArr;
    }

    public final void setOnDragListener() throws setRotation {
        int i10 = f59772y0 + 55;
        E0 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f59777t0) {
            throw new setRotation(TypedValues.Custom.TYPE_INT);
        }
        execute executeVar = this.f59776s0;
        if (executeVar.isEmpty()) {
            int i12 = E0 + 77;
            f59772y0 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        executeVar.clear();
        setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds = this.f59775r0;
        setCompoundDrawablesRelativeWithIntrinsicBounds.setY(new Object[]{setcompounddrawablesrelativewithintrinsicbounds}, -1958278013, 1958278016, System.identityHashCode(setcompounddrawablesrelativewithintrinsicbounds));
        setOnFocusChangeListener(setNavigationOnClickListener());
        setCompoundDrawablesRelativeWithIntrinsicBounds.setY(new Object[]{setcompounddrawablesrelativewithintrinsicbounds, setCompoundDrawableTintBlendMode()}, 671563438, -671563436, System.identityHashCode(setcompounddrawablesrelativewithintrinsicbounds));
    }

    @NotNull
    public final setOnFocusChangeListener setOnLongClickListener() {
        return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this}, -1627665820, 1627665820, System.identityHashCode(this));
    }

    @NotNull
    public final char[] setX() throws Throwable {
        int i10 = E0 + 93;
        f59772y0 = i10 % 128;
        if (i10 % 2 != 0) {
            b();
            throw null;
        }
        b();
        char[] navigationOnClickListener = this.f59773p0 ? setNavigationOnClickListener() : new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] cArr = (char[]) navigationOnClickListener.clone();
        setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds = this.f59775r0;
        setCompoundDrawablesRelativeWithIntrinsicBounds.setY(new Object[]{setcompounddrawablesrelativewithintrinsicbounds, cArr}, 671563438, -671563436, System.identityHashCode(setcompounddrawablesrelativewithintrinsicbounds));
        setOnFocusChangeListener(setNavigationOnClickListener());
        setCompoundDrawablesRelativeWithIntrinsicBounds.setY(new Object[]{setcompounddrawablesrelativewithintrinsicbounds, setCompoundDrawableTintBlendMode()}, 671563438, -671563436, System.identityHashCode(setcompounddrawablesrelativewithintrinsicbounds));
        int i11 = E0 + 95;
        f59772y0 = i11 % 128;
        int i12 = i11 % 2;
        return navigationOnClickListener;
    }

    @NotNull
    public final setCompoundDrawablesRelativeWithIntrinsicBounds setY() {
        int i10 = E0 + 47;
        int i11 = i10 % 128;
        f59772y0 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = i11 + 57;
        E0 = i12 % 128;
        int i13 = i12 % 2;
        setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds = this.f59775r0;
        if (i13 == 0) {
            int i14 = 31 / 0;
        }
        return setcompounddrawablesrelativewithintrinsicbounds;
    }

    @NotNull
    public final execute setOnFocusChangeListener() {
        int i10 = f59772y0 + 43;
        int i11 = i10 % 128;
        E0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 5;
        f59772y0 = i13 % 128;
        int i14 = i13 % 2;
        execute executeVar = this.f59776s0;
        if (i14 != 0) {
            int i15 = 33 / 0;
        }
        return executeVar;
    }

    public final void setOnFocusChangeListener(@NotNull char[] cArr) {
        int i10 = E0 + 27;
        f59772y0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(cArr, "");
        this.f59778u0 = cArr;
        int i12 = E0 + 103;
        f59772y0 = i12 % 128;
        int i13 = i12 % 2;
    }
}

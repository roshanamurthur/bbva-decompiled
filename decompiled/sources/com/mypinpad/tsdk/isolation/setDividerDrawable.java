package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/setDividerDrawable;", "Ljava/io/Serializable;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode;", "q0", "Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode;", "setX", "()Lcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode;", "p1", "<init>", "(ILcom/mypinpad/tsdk/i/setSecondaryProgressTintBlendMode;)V"}, k = 1, mv = {1, 5, 1})
public final class setDividerDrawable implements Serializable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char[] f59623r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char f59624s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f59625t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f59626u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f59627w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f59628x0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int setOnFocusChangeListener;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final setSecondaryProgressTintBlendMode setX;

    static {
        b();
        v0 = 0;
        f59627w0 = 1;
        f59625t0 = 0;
        f59626u0 = 1;
        f59624s0 = (char) 53956;
        f59623r0 = new char[]{59183, 59196, 59190, 59147, 59176, 59198, 59193, 59254, 59192, 59189, 59188, 59182, 59194, 59191, 59186, 59170, 59199, 59185, 59179, 59177, 59259, 59151, 59253, 59145, 59187};
    }

    public setDividerDrawable(int i10, @Nullable setSecondaryProgressTintBlendMode setsecondaryprogresstintblendmode) {
        this.setOnFocusChangeListener = i10;
        this.setX = setsecondaryprogresstintblendmode;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = r6 + 99
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.setDividerDrawable.f59628x0
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L33
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            r3 = r2[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L33:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setDividerDrawable.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f59628x0 = new byte[]{16, 49, -20, -72};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 java.lang.NullPointerException, still in use, count: 2, list:
          (r0v5 java.lang.NullPointerException) from 0x011a: MOVE (r24v0 java.lang.NullPointerException) = (r0v5 java.lang.NullPointerException) (LINE:283)
          (r0v5 java.lang.NullPointerException) from 0x008b: PHI (r0v18 java.lang.NullPointerException) = (r0v5 java.lang.NullPointerException), (r0v25 java.lang.NullPointerException) binds: [B:23:0x008a, B:31:0x0100] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setDividerDrawable.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[PHI: r3
      0x001c: PHI (r3v5 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int i10;
        int iHashCode;
        int i11 = f59626u0 + 117;
        f59625t0 = i11 % 128;
        int i12 = i11 % 2;
        setSecondaryProgressTintBlendMode setsecondaryprogresstintblendmode = this.setX;
        int i13 = this.setOnFocusChangeListener;
        if (i12 != 0) {
            i10 = i13 / 20;
            if (setsecondaryprogresstintblendmode == null) {
                iHashCode = 0;
            } else {
                iHashCode = setsecondaryprogresstintblendmode.hashCode();
            }
        } else {
            i10 = i13 * 31;
            if (setsecondaryprogresstintblendmode == null) {
                iHashCode = 0;
            } else {
                iHashCode = setsecondaryprogresstintblendmode.hashCode();
            }
        }
        int i14 = i10 + iHashCode;
        int i15 = f59626u0 + 25;
        f59625t0 = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 4 / 0;
        }
        return i14;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final int setOnFocusChangeListener() {
        int i10 = f59625t0;
        int i11 = i10 + 49;
        f59626u0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 45;
        f59626u0 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = this.setOnFocusChangeListener;
        if (i13 == 0) {
            int i15 = 57 / 0;
        }
        return i14;
    }

    @JvmName(name = "setX")
    @Nullable
    public final setSecondaryProgressTintBlendMode setX() {
        int i10 = f59626u0;
        int i11 = i10 + 45;
        f59625t0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 85;
        f59625t0 = i13 % 128;
        int i14 = i13 % 2;
        return this.setX;
    }
}

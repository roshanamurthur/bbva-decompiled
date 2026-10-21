package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BY\u0012\u0006\u00100\u001a\u00020\t\u0012\u0006\u00101\u001a\u00020\u000f\u0012\u0006\u00102\u001a\u00020\u0015\u0012\u0006\u00103\u001a\u00020\u0015\u0012\u0006\u00104\u001a\u00020\u0015\u0012\u0006\u00105\u001a\u00020\u001f\u0012\b\u00106\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010,¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\u00158\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u001f8\u0007X\u0087\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0014\u0010\"R\u001c\u0010\u001c\u001a\u0004\u0018\u00010#8\u0007X\u0087\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010'8\u0007X\u0087\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010,8\u0007X\u0087\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u000e\u0010/"}, d2 = {"Lcom/mypinpad/tsdk/i/j;", "Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;", "", "setZ", "()Ljava/lang/String;", "", "setAlwaysDrawnWithCacheEnabled", "()V", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/fd;", "a", "Lcom/mypinpad/tsdk/i/fd;", "setX", "()Lcom/mypinpad/tsdk/i/fd;", "setNavigationOnClickListener", "Lcom/mypinpad/tsdk/i/getY;", "b", "Lcom/mypinpad/tsdk/i/getY;", "setY", "()Lcom/mypinpad/tsdk/i/getY;", "setOnDragListener", "", "c", "Z", "setDividerPadding", "()Z", "getNavBarTitleString", "d", "setOnFocusChangeListener", "setLayoutAnimation", "e", "", "f", "B", "()B", "Lcom/mypinpad/tsdk/i/setTransitionVisibility;", "g", "Lcom/mypinpad/tsdk/i/setTransitionVisibility;", "()Lcom/mypinpad/tsdk/i/setTransitionVisibility;", "", "h", "[B", "setOnLongClickListener", "()[B", "Lcom/mypinpad/tsdk/i/TransactionProcessingResult;", "i", "Lcom/mypinpad/tsdk/i/TransactionProcessingResult;", "()Lcom/mypinpad/tsdk/i/TransactionProcessingResult;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Lcom/mypinpad/tsdk/i/fd;Lcom/mypinpad/tsdk/i/getY;ZZZBLcom/mypinpad/tsdk/i/setTransitionVisibility;[BLcom/mypinpad/tsdk/i/TransactionProcessingResult;)V"}, k = 1, mv = {1, 5, 1})
public final class j implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56563j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56564k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public fd setNavigationOnClickListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public getY setOnDragListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean getNavBarTitleString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean setLayoutAnimation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean setDividerPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public byte setY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public setTransitionVisibility setOnFocusChangeListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public byte[] setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TransactionProcessingResult setX;

    public j(@NotNull fd fdVar, @NotNull getY gety, boolean z10, boolean z11, boolean z12, byte b10, @Nullable setTransitionVisibility settransitionvisibility, @Nullable byte[] bArr, @Nullable TransactionProcessingResult transactionProcessingResult) {
        Intrinsics.checkNotNullParameter(fdVar, "");
        Intrinsics.checkNotNullParameter(gety, "");
        this.setNavigationOnClickListener = fdVar;
        this.setOnDragListener = gety;
        this.getNavBarTitleString = z10;
        this.setLayoutAnimation = z11;
        this.setDividerPadding = z12;
        this.setY = b10;
        this.setOnFocusChangeListener = settransitionvisibility;
        this.setCompoundDrawableTintBlendMode = bArr;
        this.setX = transactionProcessingResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = (((~(i11 | (~i12))) | (~(i13 | i11))) * Opcodes.ATHROW) + ((i10 | (~(i11 | i12))) * Opcodes.ATHROW) + (i13 * (-191)) + (i11 * 192) + (i10 * (-381));
        String str = null;
        Object[] objArr2 = 0;
        int i15 = 2;
        switch (i14) {
            case 1:
                j jVar = (j) objArr[0];
                int i16 = f56563j;
                int i17 = i16 & 87;
                int i18 = -(-((i16 ^ 87) | i17));
                int i19 = (i17 & i18) + (i18 | i17);
                f56564k = i19 % 128;
                int i20 = i19 % 2;
                jVar.setNavigationOnClickListener = fd.N_A;
                jVar.setOnDragListener = getY.setNavigationOnClickListener;
                jVar.getNavBarTitleString = false;
                jVar.setLayoutAnimation = false;
                jVar.setDividerPadding = false;
                jVar.setY = (byte) -1;
                jVar.setOnFocusChangeListener = null;
                byte[] bArr = jVar.setCompoundDrawableTintBlendMode;
                if (bArr != null) {
                    System.identityHashCode(jVar);
                    System.identityHashCode(jVar);
                    setRemoteViewsAdapter.setX(new Object[]{bArr}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                    int i21 = f56563j;
                    int i22 = ((i21 ^ 84) + ((i21 & 84) << 1)) - 1;
                    f56564k = i22 % 128;
                    int i23 = i22 % 2;
                }
                jVar.setCompoundDrawableTintBlendMode = null;
                jVar.setX = null;
                int i24 = f56564k;
                int i25 = (i24 & (-44)) | ((~i24) & 43);
                int i26 = -(-((i24 & 43) << 1));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f56563j = i27 % 128;
                if (i27 % 2 == 0) {
                    return null;
                }
                int i28 = 57 / 0;
                return null;
            case 2:
                j jVar2 = (j) objArr[0];
                getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr = new getDetailsFieldTextSizeSp[6];
                getdetailsfieldtextsizespArr[0] = setLogo.setX(jVar2.setNavigationOnClickListener.setDividerPadding());
                getdetailsfieldtextsizespArr[1] = setLogo.setX(jVar2.setOnDragListener.setDividerPadding());
                setTransitionVisibility settransitionvisibility = jVar2.setOnFocusChangeListener;
                getdetailsfieldtextsizespArr[2] = settransitionvisibility == null ? null : setLogo.setX(settransitionvisibility.setX());
                TransactionProcessingResult transactionProcessingResult = jVar2.setX;
                getdetailsfieldtextsizespArr[3] = transactionProcessingResult == null ? null : setLogo.setX(transactionProcessingResult.setX());
                getdetailsfieldtextsizespArr[4] = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(jVar2.setLayoutAnimation)}, -772901588, 772901588, (int) System.currentTimeMillis());
                getdetailsfieldtextsizespArr[5] = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(jVar2.setLayoutAnimation)}, -772901588, 772901588, (int) System.currentTimeMillis());
                TerminalLogger terminalLogger = new TerminalLogger(getdetailsfieldtextsizespArr, str, i15, objArr2 == true ? 1 : 0);
                return (String) TerminalLogger.setOnFocusChangeListener(new Object[]{terminalLogger}, -1352067446, 1352067446, System.identityHashCode(terminalLogger));
            case 3:
                j jVar3 = (j) objArr[0];
                int i29 = f56564k;
                int i30 = (-2) - ((-1) ^ ((i29 ^ 122) + ((i29 & 122) << 1)));
                int i31 = i30 % 128;
                f56563j = i31;
                int i32 = i30 % 2;
                objValueOf = jVar3.setOnDragListener;
                if (i32 != 0) {
                    throw null;
                }
                int i33 = i31 & 111;
                int i34 = (((i31 | 111) & (~i33)) - (~(-(-(i33 << 1))))) - 1;
                f56564k = i34 % 128;
                if (i34 % 2 == 0) {
                    throw null;
                }
                break;
            case 4:
                j jVar4 = (j) objArr[0];
                int i35 = f56564k;
                int i36 = (((i35 | 84) << 1) - (i35 ^ 84)) - 1;
                f56563j = i36 % 128;
                int i37 = i36 % 2;
                boolean z10 = jVar4.setDividerPadding;
                if (i37 != 0) {
                    int i38 = 32 / 0;
                }
                return Boolean.valueOf(z10);
            case 5:
                j jVar5 = (j) objArr[0];
                int i39 = f56564k;
                int i40 = (i39 ^ 49) + ((i39 & 49) << 1);
                f56563j = i40 % 128;
                int i41 = i40 % 2;
                boolean z11 = jVar5.setLayoutAnimation;
                int i42 = i39 ^ 99;
                int i43 = ((((i39 & 99) | i42) << 1) - (~(-i42))) - 1;
                f56563j = i43 % 128;
                if (i43 % 2 != 0) {
                    int i44 = 42 / 0;
                }
                objValueOf = Boolean.valueOf(z11);
                break;
            case 6:
                j jVar6 = (j) objArr[0];
                int i45 = f56563j;
                int i46 = (i45 ^ 85) + ((i45 & 85) << 1);
                f56564k = i46 % 128;
                int i47 = i46 % 2;
                objValueOf = jVar6.setX;
                if (i47 == 0) {
                    throw null;
                }
                int i48 = ((i45 & (-52)) | ((~i45) & 51)) + ((i45 & 51) << 1);
                f56564k = i48 % 128;
                if (i48 % 2 == 0) {
                    throw null;
                }
                break;
            case 7:
                j jVar7 = (j) objArr[0];
                int i49 = f56563j;
                int i50 = i49 & 103;
                int i51 = (((i49 ^ 103) | i50) << 1) - ((i49 | 103) & (~i50));
                f56564k = i51 % 128;
                if (i51 % 2 != 0) {
                    return jVar7.setCompoundDrawableTintBlendMode;
                }
                byte[] bArr2 = jVar7.setCompoundDrawableTintBlendMode;
                throw null;
            case 8:
                j jVar8 = (j) objArr[0];
                int i52 = f56564k;
                int i53 = ((i52 | 53) << 1) - (i52 ^ 53);
                f56563j = i53 % 128;
                if (i53 % 2 == 0) {
                    return jVar8.setNavigationOnClickListener;
                }
                fd fdVar = jVar8.setNavigationOnClickListener;
                throw null;
            case 9:
                j jVar9 = (j) objArr[0];
                int i54 = f56564k + 17;
                f56563j = i54 % 128;
                int i55 = i54 % 2;
                boolean z12 = jVar9.getNavBarTitleString;
                if (i55 == 0) {
                    return Boolean.valueOf(z12);
                }
                throw null;
            case 10:
                j jVar10 = (j) objArr[0];
                int i56 = f56563j;
                int i57 = i56 & 91;
                int i58 = -(-((i56 ^ 91) | i57));
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                f56564k = i59 % 128;
                int i60 = i59 % 2;
                byte b10 = jVar10.setY;
                if (i60 == 0) {
                    int i61 = 34 / 0;
                }
                return Byte.valueOf(b10);
            case 11:
                j jVar11 = (j) objArr[0];
                int i62 = f56563j;
                int i63 = (i62 ^ 23) + ((i62 & 23) << 1);
                f56564k = i63 % 128;
                int i64 = i63 % 2;
                objValueOf = jVar11.setOnFocusChangeListener;
                if (i64 == 0) {
                    int i65 = 90 / 0;
                }
                break;
            default:
                int i66 = f56564k;
                int i67 = i66 & 61;
                int i68 = (i66 | 61) & (~i67);
                int i69 = i67 << 1;
                int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
                f56563j = i70 % 128;
                if (i70 % 2 != 0) {
                    setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                    int i71 = 60 / 0;
                } else {
                    setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
                }
                return "";
        }
        return objValueOf;
    }

    @NotNull
    public static String setZ() {
        return (String) setDividerPadding(new Object[0], -598422633, 598422633, (int) System.currentTimeMillis());
    }

    @JvmName(name = "getNavBarTitleString")
    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 24686371, -24686367, System.identityHashCode(this))).booleanValue();
    }

    public final void setAlwaysDrawnWithCacheEnabled() {
        setDividerPadding(new Object[]{this}, 449840060, -449840059, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setDividerPadding(new Object[]{this}, 1453236910, -1453236908, System.identityHashCode(this));
    }

    @JvmName(name = "setLayoutAnimation")
    @Nullable
    public final setTransitionVisibility setLayoutAnimation() {
        return (setTransitionVisibility) setDividerPadding(new Object[]{this}, -453755924, 453755935, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    @Nullable
    public final TransactionProcessingResult setNavigationOnClickListener() {
        return (TransactionProcessingResult) setDividerPadding(new Object[]{this}, -1501769096, 1501769102, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    public final byte setOnDragListener() {
        return ((Byte) setDividerPadding(new Object[]{this}, 1057108919, -1057108909, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 775130114, -775130109, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setOnLongClickListener")
    @Nullable
    public final byte[] setOnLongClickListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1879825437, 1879825444, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final fd setX() {
        return (fd) setDividerPadding(new Object[]{this}, -624677485, 624677493, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final getY setY() {
        return (getY) setDividerPadding(new Object[]{this}, -500139973, 500139976, System.identityHashCode(this));
    }

    public /* synthetic */ j(fd fdVar, getY gety, boolean z10, boolean z11, boolean z12, byte b10, setTransitionVisibility settransitionvisibility, byte[] bArr, TransactionProcessingResult transactionProcessingResult, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fdVar, gety, z10, z11, z12, b10, settransitionvisibility, (i10 & 128) != 0 ? null : bArr, (i10 & 256) != 0 ? null : transactionProcessingResult);
    }

    @JvmName(name = "setDividerPadding")
    public final boolean setDividerPadding() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 693029875, -693029866, System.identityHashCode(this))).booleanValue();
    }
}

package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0012\u0010\f\u001a\u00020\tX\u0087@¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/ack;", "", "Lcom/mypinpad/tsdk/i/acj;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/acj;", "p0", "", "setY", "(Lcom/mypinpad/tsdk/i/acj;)V", "", "setOnFocusChangeListener", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setDividerPadding", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class ack {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<acj>[] f52400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52401d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52402e = 1;

    @NotNull
    public static final ack INSTANCE = new ack();

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    public static int setDividerPadding = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final acj f52398a = new acj(new byte[0], 0, 0, false);

    static {
        int i10 = 0;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() << 1;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i11 = (-758) - (~(-(-(iAvailableProcessors * (-756)))));
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        int i13 = ~iCurrentTimeMillis;
        int i14 = (-1) ^ i13;
        int i15 = -(~(((i14 & i13) | (i14 ^ i13)) * (-757)));
        int i16 = (((i12 | i15) << 1) - (i12 ^ i15)) - 1;
        int i17 = ~iAvailableProcessors;
        int i18 = ~iAvailableProcessors;
        int i19 = i18 | iAvailableProcessors;
        int i20 = i17 & i19;
        int i21 = i20 ^ (-1);
        int i22 = (i21 & i20) | (i21 ^ i20);
        int i23 = (i22 & i13) | ((~i22) & iCurrentTimeMillis);
        int i24 = i22 & iCurrentTimeMillis;
        int i25 = -(-((~((i24 & i23) | (i23 ^ i24))) * 1514));
        int i26 = (i16 & i25) + (i16 | i25);
        int i27 = ~((~0) & i20);
        int i28 = i17 & i19;
        int i29 = i28 & i13;
        int i30 = ~(((i13 | i28) & (~i29)) | i29);
        int i31 = (i30 & i27) | (i27 ^ i30);
        int i32 = (iAvailableProcessors & i18) | (i18 ^ iAvailableProcessors);
        int i33 = ~((i32 & iCurrentTimeMillis) | (i32 ^ iCurrentTimeMillis));
        int i34 = i31 & i33;
        int i35 = (i33 | i31) & (~i34);
        int i36 = -(~(((i35 & i34) | (i35 ^ i34)) * 757));
        int iHighestOneBit = Integer.highestOneBit((((i26 | i36) << 1) - (i36 ^ i26)) - 1);
        f52399b = iHighestOneBit;
        AtomicReference<acj>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        int i37 = f52401d;
        int i38 = ((i37 & 91) - (~(-(-(i37 | 91))))) - 1;
        f52402e = i38 % 128;
        int i39 = i38 % 2;
        while (i10 < iHighestOneBit) {
            atomicReferenceArr[i10] = new AtomicReference<>();
            i10 = ((-1) << 1) - (((i10 & 2) + (i10 | 2)) ^ (-1));
            int i40 = f52402e;
            int i41 = (i40 & (-4)) | ((~i40) & 3);
            int i42 = (i40 & 3) << 1;
            int i43 = (i41 & i42) + (i42 | i41);
            f52401d = i43 % 128;
            int i44 = i43 % 2;
        }
        f52400c = atomicReferenceArr;
        int i45 = f52401d;
        int i46 = i45 & 1;
        int i47 = (i46 - (~((i45 ^ 1) | i46))) - 1;
        f52402e = i47 % 128;
        int i48 = i47 % 2;
    }

    @JvmStatic
    @NotNull
    public static final acj setCompoundDrawableTintBlendMode() {
        return (acj) setY(new Object[0], -504906881, 504906881, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        acj acjVar;
        int i15 = ~i10;
        int i16 = ~(i12 | i11);
        int i17 = (((~(i10 | (~i11))) | (~(i15 | i11))) * 110) + ((i16 | (~(i10 | i11))) * 220) + ((i15 | i16) * (-220)) + (i11 * 111) + (i10 * (-109));
        acj acjVar2 = f52398a;
        if (i17 != 1) {
            if (i17 == 2) {
                int i18 = f52401d;
                int i19 = i18 & 75;
                int i20 = -(-((i18 ^ 75) | i19));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f52402e = i21 % 128;
                int i22 = i21 % 2;
                AtomicReference<acj> atomicReference = f52400c[(int) (Thread.currentThread().getId() & (((long) f52399b) - 1))];
                int i23 = f52401d;
                int i24 = i23 & 101;
                int i25 = (i24 - (~((i23 ^ 101) | i24))) - 1;
                f52402e = i25 % 128;
                int i26 = i25 % 2;
                return atomicReference;
            }
            int i27 = f52401d + 33;
            f52402e = i27 % 128;
            int i28 = i27 % 2;
            AtomicReference atomicReference2 = (AtomicReference) setY(new Object[0], -1815407358, 1815407360, (int) System.currentTimeMillis());
            acj acjVar3 = (acj) atomicReference2.getAndSet(acjVar2);
            if (acjVar3 == acjVar2) {
                acjVar = new acj();
                int i29 = f52401d;
                int i30 = i29 & 77;
                int i31 = i29 | 77;
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                f52402e = i32 % 128;
                int i33 = i32 % 2;
            } else {
                if (acjVar3 != null) {
                    atomicReference2.set(acjVar3.setDividerPadding);
                    acjVar3.setDividerPadding = null;
                    acjVar3.setX = 0;
                    int i34 = f52402e;
                    int i35 = (i34 & 69) + (i34 | 69);
                    f52401d = i35 % 128;
                    if (i35 % 2 != 0) {
                        int i36 = 37 / 0;
                    }
                    return acjVar3;
                }
                atomicReference2.set(null);
                acjVar = new acj();
                int i37 = f52402e;
                int i38 = i37 & 29;
                int i39 = ((i37 | 29) & (~i38)) + (i38 << 1);
                f52401d = i39 % 128;
                if (i39 % 2 != 0) {
                    throw null;
                }
            }
            return acjVar;
        }
        acj acjVar4 = (acj) objArr[0];
        int i40 = f52401d;
        int i41 = i40 & 113;
        int i42 = -(-((i40 ^ 113) | i41));
        int i43 = (i41 & i42) + (i42 | i41);
        f52402e = i43 % 128;
        if (i43 % 2 == 0) {
            Intrinsics.checkNotNullParameter(acjVar4, "");
            acj acjVar5 = acjVar4.setDividerPadding;
            throw null;
        }
        Intrinsics.checkNotNullParameter(acjVar4, "");
        if (acjVar4.setDividerPadding == null) {
            int i44 = f52401d;
            int i45 = i44 + 107;
            f52402e = i45 % 128;
            if (i45 % 2 == 0) {
                throw null;
            }
            if (acjVar4.setOnDragListener == null) {
                int i46 = i44 & 83;
                int i47 = (i46 - (~((i44 ^ 83) | i46))) - 1;
                int i48 = i47 % 128;
                f52402e = i48;
                int i49 = i47 % 2;
                if (acjVar4.setLayoutAnimation) {
                    int i50 = ((i48 | 27) << 1) - (i48 ^ 27);
                    f52401d = i50 % 128;
                    int i51 = i50 % 2;
                    return null;
                }
                AtomicReference atomicReference3 = (AtomicReference) setY(new Object[0], -1815407358, 1815407360, (int) System.currentTimeMillis());
                acj acjVar6 = (acj) atomicReference3.get();
                if (acjVar6 == acjVar2) {
                    int i52 = f52402e;
                    int i53 = i52 & 119;
                    int i54 = (i52 | 119) & (~i53);
                    int i55 = -(-(i53 << 1));
                    int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                    f52401d = i56 % 128;
                    int i57 = i56 % 2;
                    return null;
                }
                if (acjVar6 == null) {
                    int i58 = f52402e;
                    int i59 = i58 & 121;
                    int i60 = ((((i58 ^ 121) | i59) << 1) - (~(-((~i59) & (i58 | 121))))) - 1;
                    f52401d = i60 % 128;
                    int i61 = i60 % 2;
                    int i62 = i58 & 107;
                    int i63 = ((i58 ^ 107) | i62) << 1;
                    int i64 = -((i58 | 107) & (~i62));
                    int i65 = (i63 & i64) + (i64 | i63);
                    f52401d = i65 % 128;
                    int i66 = i65 % 2;
                    i13 = 0;
                } else {
                    i13 = acjVar6.setX;
                    int i67 = f52402e;
                    int i68 = i67 & 1;
                    int i69 = -(-(i67 | 1));
                    int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                    f52401d = i70 % 128;
                    int i71 = i70 % 2;
                }
                if (i13 >= setDividerPadding) {
                    int i72 = f52402e;
                    int i73 = i72 & 11;
                    i14 = ((i72 | 11) & (~i73)) + (i73 << 1);
                    f52401d = i14 % 128;
                } else {
                    acjVar4.setDividerPadding = acjVar6;
                    acjVar4.setCompoundDrawableTintBlendMode = 0;
                    acjVar4.setX = (i13 ^ 8192) + ((i13 & 8192) << 1);
                    while (!atomicReference3.compareAndSet(acjVar6, acjVar4)) {
                        if (atomicReference3.get() != acjVar6) {
                            int i74 = f52401d;
                            int i75 = (i74 ^ 103) + ((i74 & 103) << 1);
                            f52402e = i75 % 128;
                            int i76 = i75 % 2;
                            acjVar4.setDividerPadding = null;
                            int i77 = ((i74 | 33) << 1) - (i74 ^ 33);
                            f52402e = i77 % 128;
                            int i78 = i77 % 2;
                            break;
                        }
                    }
                    i14 = f52401d + 57;
                    f52402e = i14 % 128;
                }
                int i79 = i14 % 2;
                return null;
            }
        }
        System.currentTimeMillis();
        System.currentTimeMillis();
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @JvmStatic
    public static final void setY(@NotNull acj p4) {
        setY(new Object[]{p4}, -2008837629, 2008837630, (int) System.currentTimeMillis());
    }
}

package androidx.compose.ui.node;

import i1.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a8\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¨\u0006\u0010"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", "callback", "", "executeDiff", "startX", "startY", "endX", "endY", "", "reverse", "", "data", "fillSnake", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class MyersDiffKt {
    public static final void access$swap(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    public static final void executeDiff(int i10, int i11, @NotNull DiffCallback callback) {
        int i12;
        int i13;
        int i14;
        i1.g gVar;
        char c10;
        i1.g gVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i23 = 1;
        int i24 = ((i10 + i11) + 1) / 2;
        i1.g diagonals = new i1.g(i24 * 3);
        i1.g gVar3 = new i1.g(i24 * 4);
        gVar3.b(0, i10, 0, i11);
        int i25 = (i24 * 2) + 1;
        int[] data = new int[i25];
        Intrinsics.checkNotNullParameter(data, "data");
        int[] data2 = new int[i25];
        Intrinsics.checkNotNullParameter(data2, "data");
        int[] data3 = new int[5];
        Intrinsics.checkNotNullParameter(data3, "data");
        while (true) {
            int i26 = gVar3.f69482b;
            if (i26 == 0) {
                break;
            }
            int[] iArr = gVar3.f69481a;
            int i27 = iArr[i26 - 1];
            int i28 = iArr[i26 - 2];
            int i29 = iArr[i26 - 3];
            int i30 = i26 - 4;
            gVar3.f69482b = i30;
            int i31 = iArr[i30];
            int i32 = i29 - i31;
            int i33 = i27 - i28;
            if (i32 < i23 || i33 < i23) {
                i13 = i25;
                i14 = i23;
                gVar = gVar3;
            } else {
                int i34 = ((i32 + i33) + 1) / 2;
                int i35 = i25 / 2;
                int i36 = i35 + 1;
                data[i36] = i31;
                data2[i36] = i29;
                i13 = i25;
                int i37 = 0;
                while (true) {
                    if (i37 < i34) {
                        int i38 = i32 - i33;
                        int i39 = i34;
                        int i40 = i32;
                        boolean z10 = Math.abs(i38) % 2 == 1;
                        int i41 = -i37;
                        int i42 = i33;
                        int i43 = i41;
                        while (true) {
                            if (i43 <= i37) {
                                if (i43 == i41 || (i43 != i37 && data[i43 + 1 + i35] > data[(i43 - 1) + i35])) {
                                    i20 = data[i43 + 1 + i35];
                                    i21 = i20;
                                } else {
                                    i21 = data[(i43 - 1) + i35];
                                    i20 = i21 + 1;
                                }
                                int i44 = ((i20 - i31) + i28) - i43;
                                int i45 = (i37 == 0 || i20 != i21) ? i44 : i44 - 1;
                                gVar2 = gVar3;
                                int i46 = i44;
                                while (i20 < i29 && i46 < i27 && callback.areItemsTheSame(i20, i46)) {
                                    i20++;
                                    i46++;
                                }
                                data[i35 + i43] = i20;
                                boolean z11 = z10;
                                if (z10) {
                                    int i47 = i38 - i43;
                                    int i48 = i27;
                                    if (i47 < i41 + 1 || i47 > i37 - 1 || data2[i35 + i47] > i20) {
                                        i22 = i48;
                                    } else {
                                        fillSnake(i21, i45, i20, i46, false, data3);
                                        i17 = i48;
                                    }
                                } else {
                                    i22 = i27;
                                }
                                i43 += 2;
                                i27 = i22;
                                gVar3 = gVar2;
                                z10 = z11;
                            } else {
                                gVar2 = gVar3;
                                int i49 = i27;
                                boolean z12 = i38 % 2 == 0;
                                int i50 = i41;
                                while (true) {
                                    if (i50 <= i37) {
                                        if (i50 == i41 || (i50 != i37 && data2[i50 + 1 + i35] < data2[(i50 - 1) + i35])) {
                                            i15 = data2[i50 + 1 + i35];
                                            i16 = i15;
                                        } else {
                                            i16 = data2[(i50 - 1) + i35];
                                            i15 = i16 - 1;
                                        }
                                        int i51 = i49 - ((i29 - i15) - i50);
                                        int i52 = (i37 == 0 || i15 != i16) ? i51 : i51 + 1;
                                        int i53 = i51;
                                        while (true) {
                                            if (i15 > i31 && i53 > i28) {
                                                i18 = i16;
                                                i17 = i49;
                                                if (!callback.areItemsTheSame(i15 - 1, i53 - 1)) {
                                                    break;
                                                }
                                                i15--;
                                                i53--;
                                                i16 = i18;
                                                i49 = i17;
                                            } else {
                                                i17 = i49;
                                                i18 = i16;
                                                break;
                                            }
                                        }
                                        data2[i35 + i50] = i15;
                                        if (!z12 || (i19 = i38 - i50) < i41 || i19 > i37 || data[i35 + i19] < i15) {
                                            i50 += 2;
                                            gVar2 = gVar2;
                                            i49 = i17;
                                        } else {
                                            fillSnake(i15, i53, i18, i52, true, data3);
                                        }
                                    } else {
                                        i37++;
                                        gVar3 = gVar2;
                                        i27 = i49;
                                        i32 = i40;
                                        i34 = i39;
                                        i33 = i42;
                                    }
                                }
                            }
                            if (q.a(data3) > 0) {
                                Intrinsics.checkNotNullParameter(diagonals, "diagonals");
                                int i54 = data3[3];
                                int i55 = data3[1];
                                int i56 = i54 - i55;
                                int i57 = data3[2];
                                int i58 = data3[0];
                                int i59 = i57 - i58;
                                if (i56 == i59) {
                                    diagonals.a(i58, i55, i59);
                                } else if (data3[4] != 0) {
                                    diagonals.a(i58, i55, q.a(data3));
                                } else if (i56 > i59) {
                                    diagonals.a(i58, i55 + 1, q.a(data3));
                                } else {
                                    diagonals.a(i58 + 1, i55, q.a(data3));
                                }
                            }
                            i14 = 1;
                            gVar = gVar2;
                            gVar.b(i31, data3[0], i28, data3[1]);
                            c10 = 2;
                            gVar.b(data3[2], i29, data3[3], i17);
                        }
                    } else {
                        gVar = gVar3;
                        i14 = 1;
                    }
                    gVar3 = gVar;
                    i25 = i13;
                    i23 = i14;
                }
            }
            c10 = 2;
            gVar3 = gVar;
            i25 = i13;
            i23 = i14;
        }
        int i60 = diagonals.f69482b;
        if (i60 % 3 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i60 > 3) {
            i12 = 0;
            diagonals.c(0, i60 - 3);
        } else {
            i12 = 0;
        }
        diagonals.a(i10, i11, i12);
        int i61 = i12;
        int i62 = i61;
        while (i62 < diagonals.f69482b) {
            int[] iArr2 = diagonals.f69481a;
            int i63 = iArr2[i62];
            int i64 = iArr2[i62 + 2];
            int i65 = i63 - i64;
            int i66 = iArr2[i62 + 1] - i64;
            i62 += 3;
            while (i12 < i65) {
                callback.remove(i61, i12);
                i12++;
            }
            while (i61 < i66) {
                callback.insert(i61);
                i61++;
            }
            while (true) {
                int i67 = i64 - 1;
                if (i64 > 0) {
                    callback.same(i12, i61);
                    i12++;
                    i61++;
                    i64 = i67;
                }
            }
        }
    }

    public static final void fillSnake(int i10, int i11, int i12, int i13, boolean z10, @NotNull int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data[0] = i10;
        data[1] = i11;
        data[2] = i12;
        data[3] = i13;
        data[4] = z10 ? 1 : 0;
    }
}

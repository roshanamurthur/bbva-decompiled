package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import java.util.ArrayList;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: AdapterHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements t.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0100a f22951d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools.SimplePool f22948a = new Pools.SimplePool(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f22949b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f22950c = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22953f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f22952e = new t(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdapterHelper.java */
    public interface InterfaceC0100a {
    }

    /* JADX INFO: compiled from: AdapterHelper.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22957d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f22954a;
            if (i10 != bVar.f22954a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f22957d - this.f22955b) == 1 && this.f22957d == bVar.f22955b && this.f22955b == bVar.f22957d) {
                return true;
            }
            if (this.f22957d != bVar.f22957d || this.f22955b != bVar.f22955b) {
                return false;
            }
            Object obj2 = this.f22956c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f22956c)) {
                    return false;
                }
            } else if (bVar.f22956c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f22954a * 31) + this.f22955b) * 31) + this.f22957d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(Constant.BRACKET_OPEN);
            int i10 = this.f22954a;
            if (i10 == 1) {
                str = "add";
            } else if (i10 == 2) {
                str = "rm";
            } else if (i10 != 4) {
                str = i10 != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f22955b);
            sb2.append("c:");
            sb2.append(this.f22957d);
            sb2.append(",p:");
            return androidx.camera.core.impl.a.e(sb2, this.f22956c, Constant.BRACKET_CLOSE);
        }
    }

    public a(v vVar) {
        this.f22951d = vVar;
    }

    public final boolean a(int i10) {
        ArrayList<b> arrayList = this.f22950c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f22954a;
            if (i12 == 8) {
                if (f(bVar.f22957d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f22955b;
                int i14 = bVar.f22957d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f22950c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((v) this.f22951d).a(arrayList.get(i10));
        }
        k(arrayList);
        this.f22953f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f22949b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f22954a;
            InterfaceC0100a interfaceC0100a = this.f22951d;
            if (i11 == 1) {
                v vVar = (v) interfaceC0100a;
                vVar.a(bVar);
                vVar.c(bVar.f22955b, bVar.f22957d);
            } else if (i11 == 2) {
                v vVar2 = (v) interfaceC0100a;
                vVar2.a(bVar);
                int i12 = bVar.f22955b;
                int i13 = bVar.f22957d;
                RecyclerView recyclerView = vVar2.f23087a;
                recyclerView.J(i12, i13, true);
                recyclerView.C1 = true;
                recyclerView.f22772z1.f22834d += i13;
            } else if (i11 == 4) {
                v vVar3 = (v) interfaceC0100a;
                vVar3.a(bVar);
                vVar3.b(bVar.f22955b, bVar.f22957d, bVar.f22956c);
            } else if (i11 == 8) {
                v vVar4 = (v) interfaceC0100a;
                vVar4.a(bVar);
                vVar4.d(bVar.f22955b, bVar.f22957d);
            }
        }
        k(arrayList);
        this.f22953f = 0;
    }

    public final void d(b bVar) {
        int i10;
        Pools.SimplePool simplePool;
        int i11 = bVar.f22954a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(bVar.f22955b, i11);
        int i12 = bVar.f22955b;
        int i13 = bVar.f22954a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        int i15 = 1;
        while (true) {
            int i16 = bVar.f22957d;
            simplePool = this.f22948a;
            if (i14 >= i16) {
                break;
            }
            int iL2 = l((i10 * i14) + bVar.f22955b, bVar.f22954a);
            int i17 = bVar.f22954a;
            if (i17 == 2 ? iL2 != iL : !(i17 == 4 && iL2 == iL + 1)) {
                b bVarH = h(i17, iL, i15, bVar.f22956c);
                e(bVarH, i12);
                bVarH.f22956c = null;
                simplePool.release(bVarH);
                if (bVar.f22954a == 4) {
                    i12 += i15;
                }
                i15 = 1;
                iL = iL2;
            } else {
                i15++;
            }
            i14++;
        }
        Object obj = bVar.f22956c;
        bVar.f22956c = null;
        simplePool.release(bVar);
        if (i15 > 0) {
            b bVarH2 = h(bVar.f22954a, iL, i15, obj);
            e(bVarH2, i12);
            bVarH2.f22956c = null;
            simplePool.release(bVarH2);
        }
    }

    public final void e(b bVar, int i10) {
        v vVar = (v) this.f22951d;
        vVar.a(bVar);
        int i11 = bVar.f22954a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            vVar.b(i10, bVar.f22957d, bVar.f22956c);
        } else {
            int i12 = bVar.f22957d;
            RecyclerView recyclerView = vVar.f23087a;
            recyclerView.J(i10, i12, true);
            recyclerView.C1 = true;
            recyclerView.f22772z1.f22834d += i12;
        }
    }

    public final int f(int i10, int i11) {
        ArrayList<b> arrayList = this.f22950c;
        int size = arrayList.size();
        while (i11 < size) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f22954a;
            if (i12 == 8) {
                int i13 = bVar.f22955b;
                if (i13 == i10) {
                    i10 = bVar.f22957d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f22957d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f22955b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f22957d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f22957d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f22949b.size() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b h(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f22948a.acquire();
        if (bVar != null) {
            bVar.f22954a = i10;
            bVar.f22955b = i11;
            bVar.f22957d = i12;
            bVar.f22956c = obj;
            return bVar;
        }
        b bVar2 = new b();
        bVar2.f22954a = i10;
        bVar2.f22955b = i11;
        bVar2.f22957d = i12;
        bVar2.f22956c = obj;
        return bVar2;
    }

    public final void i(b bVar) {
        this.f22950c.add(bVar);
        int i10 = bVar.f22954a;
        InterfaceC0100a interfaceC0100a = this.f22951d;
        if (i10 == 1) {
            ((v) interfaceC0100a).c(bVar.f22955b, bVar.f22957d);
            return;
        }
        if (i10 == 2) {
            int i11 = bVar.f22955b;
            int i12 = bVar.f22957d;
            RecyclerView recyclerView = ((v) interfaceC0100a).f23087a;
            recyclerView.J(i11, i12, false);
            recyclerView.C1 = true;
            return;
        }
        if (i10 == 4) {
            ((v) interfaceC0100a).b(bVar.f22955b, bVar.f22957d, bVar.f22956c);
        } else if (i10 == 8) {
            ((v) interfaceC0100a).d(bVar.f22955b, bVar.f22957d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0192  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:199:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0187  */
    public final void j() {
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        byte b11;
        b bVarH;
        int i14;
        int i15;
        int i16;
        b bVarH2;
        boolean z11;
        boolean z12;
        b bVarH3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ArrayList<b> arrayList = this.f22949b;
        t tVar = this.f22952e;
        tVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                b10 = -1;
                i10 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f22954a != 8) {
                    z13 = true;
                } else if (z13) {
                    break;
                }
                size--;
            }
            i11 = 4;
            i12 = 2;
            if (size == -1) {
                break;
            }
            int i25 = size + 1;
            b bVar = arrayList.get(size);
            b bVar2 = arrayList.get(i25);
            int i26 = bVar2.f22954a;
            if (i26 != 1) {
                t.a aVar = tVar.f23085a;
                if (i26 == 2) {
                    int i27 = bVar.f22955b;
                    int i28 = bVar.f22957d;
                    if (i27 < i28) {
                        z12 = bVar2.f22955b == i27 && bVar2.f22957d == i28 - i27;
                        z11 = false;
                    } else if (bVar2.f22955b == i28 + 1 && bVar2.f22957d == i27 - i28) {
                        z12 = true;
                        z11 = true;
                    } else {
                        z11 = true;
                        z12 = false;
                    }
                    int i29 = bVar2.f22955b;
                    if (i28 < i29) {
                        bVar2.f22955b = i29 - 1;
                    } else {
                        int i30 = bVar2.f22957d;
                        if (i28 < i29 + i30) {
                            bVar2.f22957d = i30 - 1;
                            bVar.f22954a = 2;
                            bVar.f22957d = 1;
                            if (bVar2.f22957d == 0) {
                                arrayList.remove(i25);
                                a aVar2 = (a) aVar;
                                aVar2.getClass();
                                bVar2.f22956c = null;
                                aVar2.f22948a.release(bVar2);
                            }
                        }
                    }
                    int i31 = bVar.f22955b;
                    int i32 = bVar2.f22955b;
                    if (i31 <= i32) {
                        bVar2.f22955b = i32 + 1;
                    } else {
                        int i33 = i32 + bVar2.f22957d;
                        if (i31 < i33) {
                            bVarH3 = ((a) aVar).h(2, i31 + 1, i33 - i31, null);
                            bVar2.f22957d = bVar.f22955b - bVar2.f22955b;
                        }
                        if (z12) {
                            arrayList.set(size, bVar2);
                            arrayList.remove(i25);
                            a aVar3 = (a) aVar;
                            aVar3.getClass();
                            bVar.f22956c = null;
                            aVar3.f22948a.release(bVar);
                        } else {
                            if (z11) {
                                if (bVarH3 != null) {
                                    i23 = bVar.f22955b;
                                    if (i23 > bVarH3.f22955b) {
                                        bVar.f22955b = i23 - bVarH3.f22957d;
                                    }
                                    i24 = bVar.f22957d;
                                    if (i24 > bVarH3.f22955b) {
                                        bVar.f22957d = i24 - bVarH3.f22957d;
                                    }
                                }
                                i21 = bVar.f22955b;
                                if (i21 > bVar2.f22955b) {
                                    bVar.f22955b = i21 - bVar2.f22957d;
                                }
                                i22 = bVar.f22957d;
                                if (i22 > bVar2.f22955b) {
                                    bVar.f22957d = i22 - bVar2.f22957d;
                                }
                            } else {
                                if (bVarH3 != null) {
                                    i19 = bVar.f22955b;
                                    if (i19 >= bVarH3.f22955b) {
                                        bVar.f22955b = i19 - bVarH3.f22957d;
                                    }
                                    i20 = bVar.f22957d;
                                    if (i20 >= bVarH3.f22955b) {
                                        bVar.f22957d = i20 - bVarH3.f22957d;
                                    }
                                }
                                i17 = bVar.f22955b;
                                if (i17 >= bVar2.f22955b) {
                                    bVar.f22955b = i17 - bVar2.f22957d;
                                }
                                i18 = bVar.f22957d;
                                if (i18 >= bVar2.f22955b) {
                                    bVar.f22957d = i18 - bVar2.f22957d;
                                }
                            }
                            arrayList.set(size, bVar2);
                            if (bVar.f22955b != bVar.f22957d) {
                                arrayList.set(i25, bVar);
                            } else {
                                arrayList.remove(i25);
                            }
                            if (bVarH3 != null) {
                                arrayList.add(size, bVarH3);
                            }
                        }
                    }
                    bVarH3 = null;
                    if (z12) {
                        arrayList.set(size, bVar2);
                        arrayList.remove(i25);
                        a aVar4 = (a) aVar;
                        aVar4.getClass();
                        bVar.f22956c = null;
                        aVar4.f22948a.release(bVar);
                    } else {
                        if (z11) {
                            if (bVarH3 != null) {
                                i23 = bVar.f22955b;
                                if (i23 > bVarH3.f22955b) {
                                    bVar.f22955b = i23 - bVarH3.f22957d;
                                }
                                i24 = bVar.f22957d;
                                if (i24 > bVarH3.f22955b) {
                                    bVar.f22957d = i24 - bVarH3.f22957d;
                                }
                            }
                            i21 = bVar.f22955b;
                            if (i21 > bVar2.f22955b) {
                                bVar.f22955b = i21 - bVar2.f22957d;
                            }
                            i22 = bVar.f22957d;
                            if (i22 > bVar2.f22955b) {
                                bVar.f22957d = i22 - bVar2.f22957d;
                            }
                        } else {
                            if (bVarH3 != null) {
                                i19 = bVar.f22955b;
                                if (i19 >= bVarH3.f22955b) {
                                    bVar.f22955b = i19 - bVarH3.f22957d;
                                }
                                i20 = bVar.f22957d;
                                if (i20 >= bVarH3.f22955b) {
                                    bVar.f22957d = i20 - bVarH3.f22957d;
                                }
                            }
                            i17 = bVar.f22955b;
                            if (i17 >= bVar2.f22955b) {
                                bVar.f22955b = i17 - bVar2.f22957d;
                            }
                            i18 = bVar.f22957d;
                            if (i18 >= bVar2.f22955b) {
                                bVar.f22957d = i18 - bVar2.f22957d;
                            }
                        }
                        arrayList.set(size, bVar2);
                        if (bVar.f22955b != bVar.f22957d) {
                            arrayList.set(i25, bVar);
                        } else {
                            arrayList.remove(i25);
                        }
                        if (bVarH3 != null) {
                            arrayList.add(size, bVarH3);
                        }
                    }
                } else if (i26 == 4) {
                    int i34 = bVar.f22957d;
                    int i35 = bVar2.f22955b;
                    if (i34 < i35) {
                        bVar2.f22955b = i35 - 1;
                    } else {
                        int i36 = bVar2.f22957d;
                        if (i34 < i35 + i36) {
                            bVar2.f22957d = i36 - 1;
                            bVarH = ((a) aVar).h(4, bVar.f22955b, 1, bVar2.f22956c);
                        }
                        i14 = bVar.f22955b;
                        i15 = bVar2.f22955b;
                        if (i14 <= i15) {
                            bVar2.f22955b = i15 + 1;
                        } else {
                            i16 = i15 + bVar2.f22957d;
                            if (i14 < i16) {
                                int i37 = i16 - i14;
                                bVarH2 = ((a) aVar).h(4, i14 + 1, i37, bVar2.f22956c);
                                bVar2.f22957d -= i37;
                            }
                            arrayList.set(i25, bVar);
                            if (bVar2.f22957d > 0) {
                                arrayList.set(size, bVar2);
                            } else {
                                arrayList.remove(size);
                                a aVar5 = (a) aVar;
                                aVar5.getClass();
                                bVar2.f22956c = null;
                                aVar5.f22948a.release(bVar2);
                            }
                            if (bVarH != null) {
                                arrayList.add(size, bVarH);
                            }
                            if (bVarH2 != null) {
                                arrayList.add(size, bVarH2);
                            }
                        }
                        bVarH2 = null;
                        arrayList.set(i25, bVar);
                        if (bVar2.f22957d > 0) {
                            arrayList.set(size, bVar2);
                        } else {
                            arrayList.remove(size);
                            a aVar6 = (a) aVar;
                            aVar6.getClass();
                            bVar2.f22956c = null;
                            aVar6.f22948a.release(bVar2);
                        }
                        if (bVarH != null) {
                            arrayList.add(size, bVarH);
                        }
                        if (bVarH2 != null) {
                            arrayList.add(size, bVarH2);
                        }
                    }
                    bVarH = null;
                    i14 = bVar.f22955b;
                    i15 = bVar2.f22955b;
                    if (i14 <= i15) {
                        bVar2.f22955b = i15 + 1;
                    } else {
                        i16 = i15 + bVar2.f22957d;
                        if (i14 < i16) {
                            int i38 = i16 - i14;
                            bVarH2 = ((a) aVar).h(4, i14 + 1, i38, bVar2.f22956c);
                            bVar2.f22957d -= i38;
                        }
                        arrayList.set(i25, bVar);
                        if (bVar2.f22957d > 0) {
                            arrayList.set(size, bVar2);
                        } else {
                            arrayList.remove(size);
                            a aVar7 = (a) aVar;
                            aVar7.getClass();
                            bVar2.f22956c = null;
                            aVar7.f22948a.release(bVar2);
                        }
                        if (bVarH != null) {
                            arrayList.add(size, bVarH);
                        }
                        if (bVarH2 != null) {
                            arrayList.add(size, bVarH2);
                        }
                    }
                    bVarH2 = null;
                    arrayList.set(i25, bVar);
                    if (bVar2.f22957d > 0) {
                        arrayList.set(size, bVar2);
                    } else {
                        arrayList.remove(size);
                        a aVar8 = (a) aVar;
                        aVar8.getClass();
                        bVar2.f22956c = null;
                        aVar8.f22948a.release(bVar2);
                    }
                    if (bVarH != null) {
                        arrayList.add(size, bVarH);
                    }
                    if (bVarH2 != null) {
                        arrayList.add(size, bVarH2);
                    }
                }
            } else {
                int i39 = bVar.f22957d;
                int i40 = bVar2.f22955b;
                int i41 = i39 < i40 ? -1 : 0;
                int i42 = bVar.f22955b;
                if (i42 < i40) {
                    i41++;
                }
                if (i40 <= i42) {
                    bVar.f22955b = i42 + bVar2.f22957d;
                }
                int i43 = bVar2.f22955b;
                if (i43 <= i39) {
                    bVar.f22957d = i39 + bVar2.f22957d;
                }
                bVar2.f22955b = i43 + i41;
                arrayList.set(size, bVar2);
                arrayList.set(i25, bVar);
            }
        }
        int size2 = arrayList.size();
        int i44 = 0;
        while (i44 < size2) {
            b bVarH4 = arrayList.get(i44);
            int i45 = bVarH4.f22954a;
            if (i45 != 1) {
                Pools.SimplePool simplePool = this.f22948a;
                InterfaceC0100a interfaceC0100a = this.f22951d;
                if (i45 == i12) {
                    int i46 = bVarH4.f22955b;
                    int i47 = bVarH4.f22957d + i46;
                    int i48 = i46;
                    int i49 = 0;
                    byte b12 = -1;
                    while (i48 < i47) {
                        RecyclerView recyclerView = ((v) interfaceC0100a).f23087a;
                        RecyclerView.ViewHolder viewHolderA = recyclerView.A(i48, true);
                        if (viewHolderA == null || recyclerView.f22763u0.k(viewHolderA.itemView)) {
                            viewHolderA = null;
                        }
                        if (viewHolderA != null || a(i48)) {
                            if (b12 == 0) {
                                d(h(2, i46, i49, null));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b11 = 1;
                        } else {
                            if (b12 == 1) {
                                i(h(2, i46, i49, null));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b11 = 0;
                        }
                        if (z10) {
                            i48 -= i49;
                            i47 -= i49;
                            i49 = 1;
                        } else {
                            i49++;
                        }
                        i48++;
                        b12 = b11;
                    }
                    if (i49 != bVarH4.f22957d) {
                        bVarH4.f22956c = null;
                        simplePool.release(bVarH4);
                        i13 = 2;
                        bVarH4 = h(2, i46, i49, null);
                    } else {
                        i13 = 2;
                    }
                    if (b12 == 0) {
                        d(bVarH4);
                    } else {
                        i(bVarH4);
                    }
                } else if (i45 != i11) {
                    if (i45 == i10) {
                        i(bVarH4);
                    }
                    i13 = i12;
                } else {
                    int i50 = bVarH4.f22955b;
                    int i51 = bVarH4.f22957d + i50;
                    byte b13 = b10;
                    int i52 = i50;
                    int i53 = 0;
                    while (i50 < i51) {
                        RecyclerView recyclerView2 = ((v) interfaceC0100a).f23087a;
                        RecyclerView.ViewHolder viewHolderA2 = recyclerView2.A(i50, true);
                        if (viewHolderA2 == null || recyclerView2.f22763u0.k(viewHolderA2.itemView)) {
                            viewHolderA2 = null;
                        }
                        if (viewHolderA2 != null || a(i50)) {
                            if (b13 == 0) {
                                d(h(4, i52, i53, bVarH4.f22956c));
                                i52 = i50;
                                i53 = 0;
                            }
                            b13 = 1;
                        } else {
                            if (b13 == 1) {
                                i(h(4, i52, i53, bVarH4.f22956c));
                                i52 = i50;
                                i53 = 0;
                            }
                            b13 = 0;
                        }
                        i53++;
                        i50++;
                    }
                    if (i53 != bVarH4.f22957d) {
                        Object obj = bVarH4.f22956c;
                        bVarH4.f22956c = null;
                        simplePool.release(bVarH4);
                        bVarH4 = h(4, i52, i53, obj);
                    }
                    if (b13 == 0) {
                        d(bVarH4);
                    } else {
                        i(bVarH4);
                    }
                    i13 = 2;
                }
            } else {
                i13 = i12;
                i(bVarH4);
            }
            i44++;
            i12 = i13;
            b10 = -1;
            i10 = 8;
            i11 = 4;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            bVar.f22956c = null;
            this.f22948a.release(bVar);
        }
        arrayList.clear();
    }

    public final int l(int i10, int i11) {
        int i12;
        int i13;
        ArrayList<b> arrayList = this.f22950c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i14 = bVar.f22954a;
            if (i14 == 8) {
                int i15 = bVar.f22955b;
                int i16 = bVar.f22957d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f22955b = i15 + 1;
                            bVar.f22957d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f22955b = i15 - 1;
                            bVar.f22957d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f22957d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f22957d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f22955b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f22955b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f22955b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f22957d;
                    } else if (i14 == 2) {
                        i10 += bVar.f22957d;
                    }
                } else if (i11 == 1) {
                    bVar.f22955b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f22955b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            int i18 = bVar2.f22954a;
            Pools.SimplePool simplePool = this.f22948a;
            if (i18 == 8) {
                int i19 = bVar2.f22957d;
                if (i19 == bVar2.f22955b || i19 < 0) {
                    arrayList.remove(size2);
                    bVar2.f22956c = null;
                    simplePool.release(bVar2);
                }
            } else if (bVar2.f22957d <= 0) {
                arrayList.remove(size2);
                bVar2.f22956c = null;
                simplePool.release(bVar2);
            }
        }
        return i10;
    }
}

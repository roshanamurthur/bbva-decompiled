package com.facetec.sdk;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class fd<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<Comparable> f41543d = new Comparator<Comparable>() { // from class: com.facetec.sdk.fd.4
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static /* synthetic */ boolean f41544h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b<K, V> f41545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f41546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f41547c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Comparator<? super K> f41548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private fd<K, V>.d f41549f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b<K, V> f41550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private fd<K, V>.e f41551j;

    public abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b<K, V> f41560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f41561b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b<K, V> f41562d = null;

        public c() {
            this.f41560a = fd.this.f41545a.f41556e;
            this.f41561b = fd.this.f41546b;
        }

        public final b<K, V> e() {
            b<K, V> bVar = this.f41560a;
            fd fdVar = fd.this;
            if (bVar == fdVar.f41545a) {
                throw new NoSuchElementException();
            }
            if (fdVar.f41546b != this.f41561b) {
                throw new ConcurrentModificationException();
            }
            this.f41560a = bVar.f41556e;
            this.f41562d = bVar;
            return bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f41560a != fd.this.f41545a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            b<K, V> bVar = this.f41562d;
            if (bVar == null) {
                throw new IllegalStateException();
            }
            fd.this.b((b) bVar, true);
            this.f41562d = null;
            this.f41561b = fd.this.f41546b;
        }
    }

    public final class d extends AbstractSet<K> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            fd.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return fd.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new c() { // from class: com.facetec.sdk.fd.d.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static final byte[] f41565a = null;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f41566b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f41567c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final int f41568d = 0;

                static {
                    c();
                    f41566b = 0;
                    f41567c = 1;
                }

                {
                    fd fdVar = fd.this;
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0147. Please report as an issue. */
                public static synchronized void c(long j10, long j11) {
                    try {
                        ff ffVar = new ff(j10, j11);
                        byte[] bArr = f41565a;
                        char c10 = '8';
                        short s4 = bArr[56];
                        Object[] objArr = new Object[1];
                        f(s4, (byte) (s4 | 73), (byte) 114, objArr);
                        char c11 = 0;
                        String str = (String) objArr[0];
                        short s7 = (short) 114;
                        Object[] objArr2 = new Object[1];
                        f(s7, (byte) 74, bArr[56], objArr2);
                        try {
                            Object[] objArr3 = {(String) objArr2[0]};
                            char c12 = 16;
                            Object[] objArr4 = new Object[1];
                            f(s7, (byte) (-bArr[16]), (byte) (-bArr[34]), objArr4);
                            Class<?> cls = Class.forName((String) objArr4[0]);
                            Object[] objArr5 = new Object[1];
                            f((short) (f41568d & 965), bArr[7], bArr[0], objArr5);
                            String str2 = (String) objArr5[0];
                            Object[] objArr6 = new Object[1];
                            f(s7, (byte) (-bArr[16]), (byte) (-bArr[34]), objArr6);
                            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
                            int[] iArr = new int[objArr7.length];
                            int i10 = 0;
                            while (i10 < objArr7.length) {
                                Object[] objArr8 = new Object[1];
                                objArr8[c11] = objArr7[i10];
                                short s9 = (short) 133;
                                byte[] bArr2 = f41565a;
                                byte b10 = (byte) (-bArr2[c12]);
                                Object[] objArr9 = new Object[1];
                                f(s9, b10, (byte) (b10 + 4), objArr9);
                                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                                Object[] objArr10 = new Object[1];
                                f((short) 149, bArr2[c10], bArr2[18], objArr10);
                                String str3 = (String) objArr10[c11];
                                Object[] objArr11 = new Object[1];
                                f(s7, (byte) (-bArr2[16]), (byte) (-bArr2[34]), objArr11);
                                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                                byte b11 = (byte) (-bArr2[16]);
                                Object[] objArr12 = new Object[1];
                                f(s9, b11, (byte) (b11 + 4), objArr12);
                                Class<?> cls3 = Class.forName((String) objArr12[0]);
                                Object[] objArr13 = new Object[1];
                                f((short) 155, (byte) (-bArr2[25]), bArr2[21], objArr13);
                                iArr[i10] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                                i10++;
                                c12 = 16;
                                c10 = '8';
                                c11 = 0;
                            }
                            int i11 = 0;
                            while (true) {
                                int i12 = i11 + 1;
                                switch (ffVar.d(iArr[i11])) {
                                    case -17:
                                        i11 = 11;
                                        break;
                                    case -16:
                                        i11 = 35;
                                        break;
                                    case -15:
                                        ffVar.d(14);
                                        i11 = ffVar.f41578d == 0 ? 34 : i12;
                                        break;
                                    case -14:
                                        i11 = 1;
                                        break;
                                    case -13:
                                        i11 = 23;
                                        break;
                                    case -12:
                                        ffVar.d(14);
                                        if (ffVar.f41578d == 0) {
                                            i12 = 22;
                                        }
                                        break;
                                    case -11:
                                        ffVar.f41579e = 1;
                                        ffVar.d(3);
                                        ffVar.d(5);
                                        f41566b = ffVar.f41578d;
                                        break;
                                    case -10:
                                        ffVar.f41579e = f41567c;
                                        ffVar.d(1);
                                        break;
                                    case -9:
                                        break;
                                    case -8:
                                        i11 = 13;
                                        break;
                                    case -7:
                                        i11 = 24;
                                        break;
                                    case -6:
                                        bn.b();
                                        break;
                                    case -5:
                                        ffVar.f41579e = 1;
                                        ffVar.d(3);
                                        ffVar.d(5);
                                        bn.f40664d = ffVar.f41578d;
                                        break;
                                    case -4:
                                        ffVar.f41579e = 1;
                                        ffVar.d(3);
                                        ffVar.d(4);
                                        ffVar.f41579e = ((Class) bp.a('J' - AndroidCharacter.getMirror('0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51, (char) ExpandableListView.getPackedPositionGroup(0L))).getField("i").getInt(ffVar.f41582h);
                                        ffVar.d(1);
                                        break;
                                    case -3:
                                        ffVar.f41581g = ((Class) bp.a(26 - TextUtils.getOffsetAfter("", 0), 53 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getMode(0))).getField("b").get(null);
                                        ffVar.d(2);
                                        break;
                                    case -2:
                                        ffVar.f41579e = bn.f40664d;
                                        ffVar.d(1);
                                        break;
                                    case -1:
                                        i11 = 8;
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void f(short r7, short r8, byte r9, java.lang.Object[] r10) {
                    /*
                        int r7 = r7 + 4
                        int r9 = r9 + 1
                        byte[] r0 = com.facetec.sdk.fd.d.AnonymousClass1.f41565a
                        int r8 = 118 - r8
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r8 = r7
                        r3 = r1
                        r4 = r2
                        r1 = r0
                        r0 = r10
                        r10 = r9
                        goto L31
                    L14:
                        r3 = r2
                    L15:
                        r6 = r9
                        r9 = r8
                        r8 = r6
                        int r4 = r3 + 1
                        byte r5 = (byte) r9
                        r1[r3] = r5
                        if (r4 != r8) goto L27
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L27:
                        r3 = r0[r7]
                        r6 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r10
                        r10 = r9
                        r9 = r6
                    L31:
                        int r10 = r10 + r7
                        int r7 = r8 + 1
                        int r8 = r10 + 2
                        r10 = r0
                        r0 = r1
                        r1 = r3
                        r3 = r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.fd.d.AnonymousClass1.f(short, short, byte, java.lang.Object[]):void");
                }

                @Override // java.util.Iterator
                public K next() {
                    return e().f41559j;
                }

                public static void c() {
                    f41565a = new byte[]{4, 34, Constants.DIRECTORY_ENTRY, 41, 2, -7, -1, 3, -8, -1, 4, -9, -1, 5, -10, 8, -12, -1, 6, -11, -1, 7, -12, -1, 8, -13, 9, -13, 10, -14, -1, 9, -14, 11, -15, -1, 10, -15, -1, 2, -3, -6, 3, -3, -6, 3, -2, -7, 3, -1, -8, -1, 2, -2, -7, 3, 0, -9, 3, -1, -8, -1, 2, -1, -8, -1, 2, 0, -9, -1, 2, 1, -10, -1, 2, 1, -10, -1, 2, -3, -6, 3, 2, -11, 3, 3, -12, 3, 4, -13, 3, -1, -8, -1, 2, -2, -7, 3, 0, -9, 3, -1, -8, -1, 2, 2, -11, -1, 2, 3, -12, -1, 2, 4, -13, -1, 2, 4, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 31, -4, -11, 3, -9, -5, -6, -5, 9, -11, 19, -23, -53, 60, -13, 11, -9, -59, 25, 35, 4, ByteSourceJsonBootstrapper.UTF8_BOM_1, 0, -4, 11, -23, 9, 7, -18, -24, MessageUtils.MESSAGE_21_NAK, 3, 4, -32, 9, 9, 7, -18};
                    f41568d = 171;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return fd.this.a(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return fd.this.f41547c;
        }
    }

    public class e extends AbstractSet<Map.Entry<K, V>> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            fd.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && fd.this.b((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c() { // from class: com.facetec.sdk.fd.e.5
                {
                    fd fdVar = fd.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return e();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            b<K, V> bVarB;
            if (!(obj instanceof Map.Entry) || (bVarB = fd.this.b((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            fd.this.b((b) bVarB, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return fd.this.f41547c;
        }
    }

    public fd() {
        this(f41543d);
    }

    private b<K, V> b(K k10, boolean z10) {
        int iCompareTo;
        b<K, V> bVar;
        Comparator<? super K> comparator = this.f41548e;
        b<K, V> bVar2 = this.f41550i;
        if (bVar2 != null) {
            Comparable comparable = comparator == f41543d ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(bVar2.f41559j) : comparator.compare(k10, bVar2.f41559j);
                if (iCompareTo != 0) {
                    b<K, V> bVar3 = iCompareTo < 0 ? bVar2.f41553b : bVar2.f41555d;
                    if (bVar3 == null) {
                        break;
                    }
                    bVar2 = bVar3;
                } else {
                    return bVar2;
                }
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        b<K, V> bVar4 = this.f41545a;
        if (bVar2 != null) {
            bVar = new b<>(bVar2, k10, bVar4, bVar4.f41552a);
            if (iCompareTo < 0) {
                bVar2.f41553b = bVar;
            } else {
                bVar2.f41555d = bVar;
            }
            e((b) bVar2, true);
        } else {
            if (comparator == f41543d && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            bVar = new b<>(bVar2, k10, bVar4, bVar4.f41552a);
            this.f41550i = bVar;
        }
        this.f41547c++;
        this.f41546b++;
        return bVar;
    }

    private void d(b<K, V> bVar) {
        b<K, V> bVar2 = bVar.f41553b;
        b<K, V> bVar3 = bVar.f41555d;
        b<K, V> bVar4 = bVar2.f41553b;
        b<K, V> bVar5 = bVar2.f41555d;
        bVar.f41553b = bVar5;
        if (bVar5 != null) {
            bVar5.f41554c = bVar;
        }
        e((b) bVar, (b) bVar2);
        bVar2.f41555d = bVar;
        bVar.f41554c = bVar2;
        int iMax = Math.max(bVar3 != null ? bVar3.f41557f : 0, bVar5 != null ? bVar5.f41557f : 0) + 1;
        bVar.f41557f = iMax;
        bVar2.f41557f = Math.max(iMax, bVar4 != null ? bVar4.f41557f : 0) + 1;
    }

    private static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final b<K, V> a(Object obj) {
        b<K, V> bVarB = b(obj);
        if (bVarB != null) {
            b((b) bVarB, true);
        }
        return bVarB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f41550i = null;
        this.f41547c = 0;
        this.f41546b++;
        b<K, V> bVar = this.f41545a;
        bVar.f41552a = bVar;
        bVar.f41556e = bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        fd<K, V>.e eVar = this.f41551j;
        if (eVar != null) {
            return eVar;
        }
        fd<K, V>.e eVar2 = new e();
        this.f41551j = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        b<K, V> bVarB = b(obj);
        if (bVarB != null) {
            return bVarB.f41558g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        fd<K, V>.d dVar = this.f41549f;
        if (dVar != null) {
            return dVar;
        }
        fd<K, V>.d dVar2 = new d();
        this.f41549f = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v3) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        b<K, V> bVarB = b((Object) k10, true);
        V v6 = bVarB.f41558g;
        bVarB.f41558g = v3;
        return v6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b<K, V> bVarA = a(obj);
        if (bVarA != null) {
            return bVarA.f41558g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f41547c;
    }

    private fd(Comparator<? super K> comparator) {
        this.f41547c = 0;
        this.f41546b = 0;
        this.f41545a = new b<>();
        this.f41548e = comparator == null ? f41543d : comparator;
    }

    private void e(b<K, V> bVar, b<K, V> bVar2) {
        b<K, V> bVar3 = bVar.f41554c;
        bVar.f41554c = null;
        if (bVar2 != null) {
            bVar2.f41554c = bVar3;
        }
        if (bVar3 == null) {
            this.f41550i = bVar2;
            return;
        }
        if (bVar3.f41553b == bVar) {
            bVar3.f41553b = bVar2;
        } else {
            if (!f41544h && bVar3.f41555d != bVar) {
                throw new AssertionError();
            }
            bVar3.f41555d = bVar2;
        }
    }

    public static final class b<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b<K, V> f41552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b<K, V> f41553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        b<K, V> f41554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        b<K, V> f41555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        b<K, V> f41556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f41557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        V f41558g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final K f41559j;

        public b() {
            this.f41559j = null;
            this.f41552a = this;
            this.f41556e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f41559j;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v3 = this.f41558g;
                    if (v3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f41559j;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f41558g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f41559j;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v3 = this.f41558g;
            return iHashCode ^ (v3 != null ? v3.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v3) {
            V v6 = this.f41558g;
            this.f41558g = v3;
            return v6;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f41559j);
            sb2.append("=");
            sb2.append(this.f41558g);
            return sb2.toString();
        }

        public b(b<K, V> bVar, K k10, b<K, V> bVar2, b<K, V> bVar3) {
            this.f41554c = bVar;
            this.f41559j = k10;
            this.f41557f = 1;
            this.f41556e = bVar2;
            this.f41552a = bVar3;
            bVar3.f41556e = this;
            bVar2.f41552a = this;
        }
    }

    private void e(b<K, V> bVar, boolean z10) {
        while (bVar != null) {
            b<K, V> bVar2 = bVar.f41553b;
            b<K, V> bVar3 = bVar.f41555d;
            int i10 = bVar2 != null ? bVar2.f41557f : 0;
            int i11 = bVar3 != null ? bVar3.f41557f : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                b<K, V> bVar4 = bVar3.f41553b;
                b<K, V> bVar5 = bVar3.f41555d;
                int i13 = (bVar4 != null ? bVar4.f41557f : 0) - (bVar5 != null ? bVar5.f41557f : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    if (!f41544h && i13 != 1) {
                        throw new AssertionError();
                    }
                    d(bVar3);
                    b((b) bVar);
                } else {
                    b((b) bVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                b<K, V> bVar6 = bVar2.f41553b;
                b<K, V> bVar7 = bVar2.f41555d;
                int i14 = (bVar6 != null ? bVar6.f41557f : 0) - (bVar7 != null ? bVar7.f41557f : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    if (!f41544h && i14 != -1) {
                        throw new AssertionError();
                    }
                    b((b) bVar2);
                    d(bVar);
                } else {
                    d(bVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                bVar.f41557f = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                if (!f41544h && i12 != -1 && i12 != 1) {
                    throw new AssertionError();
                }
                bVar.f41557f = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            bVar = bVar.f41554c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final b<K, V> b(Map.Entry<?, ?> entry) {
        b<K, V> bVarB = b(entry.getKey());
        if (bVarB == null || !e(bVarB.f41558g, entry.getValue())) {
            return null;
        }
        return bVarB;
    }

    public final void b(b<K, V> bVar, boolean z10) {
        int i10;
        if (z10) {
            b<K, V> bVar2 = bVar.f41552a;
            bVar2.f41556e = bVar.f41556e;
            bVar.f41556e.f41552a = bVar2;
        }
        b<K, V> bVar3 = bVar.f41553b;
        b<K, V> bVar4 = bVar.f41555d;
        b<K, V> bVar5 = bVar.f41554c;
        int i11 = 0;
        if (bVar3 != null && bVar4 != null) {
            if (bVar3.f41557f > bVar4.f41557f) {
                b<K, V> bVar6 = bVar3.f41555d;
                while (true) {
                    b<K, V> bVar7 = bVar6;
                    bVar4 = bVar3;
                    bVar3 = bVar7;
                    if (bVar3 == null) {
                        break;
                    } else {
                        bVar6 = bVar3.f41555d;
                    }
                }
            } else {
                while (true) {
                    b<K, V> bVar8 = bVar4.f41553b;
                    if (bVar8 == null) {
                        break;
                    } else {
                        bVar4 = bVar8;
                    }
                }
            }
            b((b) bVar4, false);
            b<K, V> bVar9 = bVar.f41553b;
            if (bVar9 != null) {
                i10 = bVar9.f41557f;
                bVar4.f41553b = bVar9;
                bVar9.f41554c = bVar4;
                bVar.f41553b = null;
            } else {
                i10 = 0;
            }
            b<K, V> bVar10 = bVar.f41555d;
            if (bVar10 != null) {
                i11 = bVar10.f41557f;
                bVar4.f41555d = bVar10;
                bVar10.f41554c = bVar4;
                bVar.f41555d = null;
            }
            bVar4.f41557f = Math.max(i10, i11) + 1;
            e((b) bVar, (b) bVar4);
            return;
        }
        if (bVar3 != null) {
            e((b) bVar, (b) bVar3);
            bVar.f41553b = null;
        } else if (bVar4 != null) {
            e((b) bVar, (b) bVar4);
            bVar.f41555d = null;
        } else {
            e((b) bVar, (b) null);
        }
        e((b) bVar5, false);
        this.f41547c--;
        this.f41546b++;
    }

    private void b(b<K, V> bVar) {
        b<K, V> bVar2 = bVar.f41553b;
        b<K, V> bVar3 = bVar.f41555d;
        b<K, V> bVar4 = bVar3.f41553b;
        b<K, V> bVar5 = bVar3.f41555d;
        bVar.f41555d = bVar4;
        if (bVar4 != null) {
            bVar4.f41554c = bVar;
        }
        e((b) bVar, (b) bVar3);
        bVar3.f41553b = bVar;
        bVar.f41554c = bVar3;
        int iMax = Math.max(bVar2 != null ? bVar2.f41557f : 0, bVar4 != null ? bVar4.f41557f : 0) + 1;
        bVar.f41557f = iMax;
        bVar3.f41557f = Math.max(iMax, bVar5 != null ? bVar5.f41557f : 0) + 1;
    }
}

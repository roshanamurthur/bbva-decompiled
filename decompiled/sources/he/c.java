package he;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.g0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ColorResourcesTableCreator.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte f69375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f69376b = new d(1, "android");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f69377c = new a();

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public class a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            return bVar.f69380c - bVar2.f69380c;
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f69378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte f69379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final short f69380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f69381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ColorInt
        public final int f69382e;

        public b(int i10, String str, int i11) {
            this.f69381d = str;
            this.f69382e = i11;
            this.f69380c = (short) (65535 & i10);
            this.f69379b = (byte) ((i10 >> 16) & 255);
            this.f69378a = (byte) ((i10 >> 24) & 255);
        }
    }

    /* JADX INFO: renamed from: he.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class C0292c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f69383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f69385c = new g(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g f69386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j f69387e;

        public C0292c(d dVar, List<b> list) {
            this.f69384b = dVar;
            String[] strArr = new String[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                strArr[i10] = list.get(i10).f69381d;
            }
            this.f69386d = new g(true, strArr);
            this.f69387e = new j(list);
            this.f69383a = new e((short) 512, (short) 288, a());
        }

        public final int a() {
            int i10 = this.f69385c.f69406l + 288 + this.f69386d.f69406l;
            j jVar = this.f69387e;
            int i11 = (jVar.f69413b * 4) + 16;
            i iVar = jVar.f69415d;
            return (iVar.f69411e.length * 16) + (iVar.f69410d.length * 4) + 84 + i11 + i10;
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69389b;

        public d(int i10, String str) {
            this.f69388a = i10;
            this.f69389b = str;
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f69390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final short f69391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69392c;

        public e(short s4, short s7, int i10) {
            this.f69390a = s4;
            this.f69391b = s7;
            this.f69392c = i10;
        }

        public final void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(c.d(this.f69390a));
            byteArrayOutputStream.write(c.d(this.f69391b));
            byteArrayOutputStream.write(c.a(this.f69392c));
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69394b;

        public f(int i10, @ColorInt int i11) {
            this.f69393a = i10;
            this.f69394b = i11;
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f69395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f69398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f69399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f69400f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f69401g = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList f69402h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ArrayList f69403i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f69404j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f69405k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f69406l;

        public g(boolean z10, String... strArr) {
            byte[] bArr;
            this.f69404j = z10;
            int length = 0;
            for (String str : strArr) {
                if (this.f69404j) {
                    byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
                    byte length2 = (byte) bytes.length;
                    int length3 = bytes.length;
                    bArr = new byte[length3 + 3];
                    System.arraycopy(bytes, 0, bArr, 2, length2);
                    bArr[1] = length2;
                    bArr[0] = length2;
                    bArr[length3 + 2] = 0;
                } else {
                    char[] charArray = str.toCharArray();
                    int length4 = charArray.length * 2;
                    bArr = new byte[length4 + 4];
                    byte[] bArrD = c.d((short) charArray.length);
                    bArr[0] = bArrD[0];
                    bArr[1] = bArrD[1];
                    for (int i10 = 0; i10 < charArray.length; i10++) {
                        byte[] bArrB = c.b(charArray[i10]);
                        int i11 = i10 * 2;
                        bArr[i11 + 2] = bArrB[0];
                        bArr[i11 + 3] = bArrB[1];
                    }
                    bArr[length4 + 2] = 0;
                    bArr[length4 + 3] = 0;
                }
                Pair pair = new Pair(bArr, Collections.emptyList());
                this.f69400f.add(Integer.valueOf(length));
                byte[] bArr2 = (byte[]) pair.first;
                length += bArr2.length;
                this.f69402h.add(bArr2);
                this.f69403i.add((List) pair.second);
            }
            int size = 0;
            for (List list : this.f69403i) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    h hVar = (h) it.next();
                    this.f69400f.add(Integer.valueOf(length));
                    hVar.getClass();
                    throw null;
                }
                this.f69401g.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i12 = length % 4;
            int i13 = i12 == 0 ? 0 : 4 - i12;
            this.f69405k = i13;
            int size2 = this.f69402h.size();
            this.f69396b = size2;
            this.f69397c = this.f69402h.size() - strArr.length;
            boolean z11 = this.f69402h.size() - strArr.length > 0;
            if (!z11) {
                this.f69401g.clear();
                this.f69403i.clear();
            }
            int size3 = (this.f69401g.size() * 4) + (size2 * 4) + 28;
            this.f69398d = size3;
            int i14 = length + i13;
            this.f69399e = z11 ? size3 + i14 : 0;
            int i15 = size3 + i14 + (z11 ? size : 0);
            this.f69406l = i15;
            this.f69395a = new e((short) 1, (short) 28, i15);
        }

        public final void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f69395a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(c.a(this.f69396b));
            byteArrayOutputStream.write(c.a(this.f69397c));
            byteArrayOutputStream.write(c.a(this.f69404j ? 256 : 0));
            byteArrayOutputStream.write(c.a(this.f69398d));
            byteArrayOutputStream.write(c.a(this.f69399e));
            Iterator it = this.f69400f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(c.a(((Integer) it.next()).intValue()));
            }
            Iterator it2 = this.f69401g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(c.a(((Integer) it2.next()).intValue()));
            }
            Iterator it3 = this.f69402h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write((byte[]) it3.next());
            }
            int i10 = this.f69405k;
            if (i10 > 0) {
                byteArrayOutputStream.write(new byte[i10]);
            }
            Iterator it4 = this.f69403i.iterator();
            while (it4.hasNext()) {
                Iterator it5 = ((List) it4.next()).iterator();
                while (it5.hasNext()) {
                    ((h) it5.next()).getClass();
                    byteArrayOutputStream.write(c.a(0));
                    byteArrayOutputStream.write(c.a(0));
                    byteArrayOutputStream.write(c.a(0));
                }
                byteArrayOutputStream.write(c.a(-1));
            }
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class h {
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f69407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f69409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f69410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f[] f69411e;

        public i(List list, HashSet hashSet, int i10) {
            byte[] bArr = new byte[64];
            this.f69409c = bArr;
            this.f69408b = i10;
            bArr[0] = 64;
            this.f69411e = new f[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f69411e[i11] = new f(i11, ((b) list.get(i11)).f69382e);
            }
            this.f69410d = new int[i10];
            int i12 = 0;
            for (short s4 = 0; s4 < i10; s4 = (short) (s4 + 1)) {
                if (hashSet.contains(Short.valueOf(s4))) {
                    this.f69410d[s4] = i12;
                    i12 += 16;
                } else {
                    this.f69410d[s4] = -1;
                }
            }
            this.f69407a = new e((short) 513, (short) 84, (this.f69411e.length * 16) + (this.f69410d.length * 4) + 84);
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f69412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f69414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i f69415d;

        public j(List<b> list) {
            this.f69413b = ((b) androidx.emoji2.text.flatbuffer.a.b(list, 1)).f69380c + 1;
            HashSet hashSet = new HashSet();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f69380c));
            }
            this.f69414c = new int[this.f69413b];
            short s4 = 0;
            while (true) {
                int i10 = this.f69413b;
                if (s4 >= i10) {
                    this.f69412a = new e((short) 514, (short) 16, (i10 * 4) + 16);
                    this.f69415d = new i(list, hashSet, i10);
                    return;
                } else {
                    if (hashSet.contains(Short.valueOf(s4))) {
                        this.f69414c[s4] = 1073741824;
                    }
                    s4 = (short) (s4 + 1);
                }
            }
        }
    }

    public static byte[] a(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)};
    }

    public static byte[] b(char c10) {
        return new byte[]{(byte) (c10 & 255), (byte) ((c10 >> '\b') & 255)};
    }

    public static byte[] c(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        d dVar2 = new d(127, context.getPackageName());
        HashMap map2 = new HashMap();
        b bVar = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            String resourceName = context.getResources().getResourceName(entry.getKey().intValue());
            b bVar2 = new b(iIntValue, resourceName, entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                StringBuilder sbD = ci.a.d("Non color resource found: name=", resourceName, ", typeId=");
                sbD.append(Integer.toHexString(bVar2.f69379b & 255));
                throw new IllegalArgumentException(sbD.toString());
            }
            byte b10 = bVar2.f69378a;
            if (b10 == 1) {
                dVar = f69376b;
            } else {
                if (b10 != 127) {
                    throw new IllegalArgumentException(g0.c("Not supported with unknown package id: ", b10));
                }
                dVar = dVar2;
            }
            if (!map2.containsKey(dVar)) {
                map2.put(dVar, new ArrayList());
            }
            ((List) map2.get(dVar)).add(bVar2);
            bVar = bVar2;
        }
        byte b11 = bVar.f69379b;
        f69375a = b11;
        if (b11 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ArrayList<C0292c> arrayList = new ArrayList();
        int size = map2.size();
        g gVar = new g(false, new String[0]);
        for (Map.Entry entry2 : map2.entrySet()) {
            List list = (List) entry2.getValue();
            Collections.sort(list, f69377c);
            arrayList.add(new C0292c((d) entry2.getKey(), list));
        }
        Iterator it = arrayList.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((C0292c) it.next()).a();
        }
        int i10 = gVar.f69406l + 12 + iA;
        byteArrayOutputStream.write(d((short) 2));
        byteArrayOutputStream.write(d((short) 12));
        byteArrayOutputStream.write(a(i10));
        byteArrayOutputStream.write(a(size));
        gVar.a(byteArrayOutputStream);
        for (C0292c c0292c : arrayList) {
            c0292c.f69383a.a(byteArrayOutputStream);
            d dVar3 = c0292c.f69384b;
            byteArrayOutputStream.write(a(dVar3.f69388a));
            char[] charArray = dVar3.f69389b.toCharArray();
            for (int i11 = 0; i11 < 128; i11++) {
                if (i11 < charArray.length) {
                    byteArrayOutputStream.write(b(charArray[i11]));
                } else {
                    byteArrayOutputStream.write(b((char) 0));
                }
            }
            byteArrayOutputStream.write(a(288));
            byteArrayOutputStream.write(a(0));
            g gVar2 = c0292c.f69385c;
            byteArrayOutputStream.write(a(gVar2.f69406l + 288));
            byteArrayOutputStream.write(a(0));
            byteArrayOutputStream.write(a(0));
            gVar2.a(byteArrayOutputStream);
            c0292c.f69386d.a(byteArrayOutputStream);
            j jVar = c0292c.f69387e;
            jVar.f69412a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{f69375a, 0, 0, 0});
            byteArrayOutputStream.write(a(jVar.f69413b));
            for (int i12 : jVar.f69414c) {
                byteArrayOutputStream.write(a(i12));
            }
            i iVar = jVar.f69415d;
            iVar.f69407a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{f69375a, 0, 0, 0});
            byteArrayOutputStream.write(a(iVar.f69408b));
            int[] iArr = iVar.f69410d;
            byteArrayOutputStream.write(a((iArr.length * 4) + 84));
            byteArrayOutputStream.write(iVar.f69409c);
            for (int i13 : iArr) {
                byteArrayOutputStream.write(a(i13));
            }
            for (f fVar : iVar.f69411e) {
                fVar.getClass();
                byteArrayOutputStream.write(d((short) 8));
                byteArrayOutputStream.write(d((short) 2));
                byteArrayOutputStream.write(a(fVar.f69393a));
                byteArrayOutputStream.write(d((short) 8));
                byteArrayOutputStream.write(new byte[]{0, 28});
                byteArrayOutputStream.write(a(fVar.f69394b));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] d(short s4) {
        return new byte[]{(byte) (s4 & 255), (byte) ((s4 >> 8) & 255)};
    }
}

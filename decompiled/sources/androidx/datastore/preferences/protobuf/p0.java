package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SchemaUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f21106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0<?, ?> f21107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0<?, ?> f21108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u0 f21109d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f21106a = cls;
        f21107b = B(false);
        f21108c = B(true);
        f21109d = new u0();
    }

    public static <UT, UB> UB A(int i10, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub2, t0<UT, UB> t0Var) {
        if (enumVerifier == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) D(i10, iIntValue, ub2, t0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(iIntValue2)) {
                    ub2 = (UB) D(i10, iIntValue2, ub2, t0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static t0<?, ?> B(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (t0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB D(int i10, int i11, UB ub2, t0<UT, UB> t0Var) {
        if (ub2 == null) {
            ub2 = (UB) t0Var.m();
        }
        t0Var.e(i10, i11, ub2);
        return ub2;
    }

    public static void E(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeBool(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i12)).booleanValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeBoolNoTag(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public static void F(int i10, List list, h hVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        hVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            hVar.f21064a.writeBytes(i10, (ByteString) list.get(i11));
        }
    }

    public static void G(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeDouble(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i12)).doubleValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeDoubleNoTag(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    public static void H(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeEnum(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeEnumNoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void I(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeFixed32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeFixed32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void J(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeFixed64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeFixed64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void K(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeFloat(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i12)).floatValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeFloatNoTag(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    public static void L(int i10, List list, h hVar, o0 o0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        hVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            hVar.h(i10, o0Var, list.get(i11));
        }
    }

    public static void M(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void N(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void O(int i10, List list, h hVar, o0 o0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        hVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            hVar.k(i10, o0Var, list.get(i11));
        }
    }

    public static void P(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeSFixed32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeSFixed32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void Q(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeSFixed64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeSFixed64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void R(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeSInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeSInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void S(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeSInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeSInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void T(int i10, List list, h hVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        hVar.getClass();
        boolean z10 = list instanceof LazyStringList;
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeString(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i11 < list.size()) {
            Object raw = lazyStringList.getRaw(i11);
            if (raw instanceof String) {
                codedOutputStream.writeString(i10, (String) raw);
            } else {
                codedOutputStream.writeBytes(i10, (ByteString) raw);
            }
            i11++;
        }
    }

    public static void U(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeUInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeUInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void V(int i10, List list, h hVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = hVar.f21064a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeUInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeUInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeBoolSize(i10, true) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i10, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i11));
        }
        return iComputeTagSize;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.computeTagSize(i10) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p) {
            p pVar = (p) list;
            iComputeEnumSizeNoTag = 0;
            while (i10 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(pVar.getInt(i10));
                i10++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i10 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed32Size(i10, 0) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed64Size(i10, 0L) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<MessageLite> list, o0 o0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iA += CodedOutputStream.a(i10, list.get(i11), o0Var);
        }
        return iA;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.computeTagSize(i10) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p) {
            p pVar = (p) list;
            iComputeInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(pVar.getInt(i10));
                i10++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.computeTagSize(i10) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            iComputeInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(tVar.getLong(i10));
                i10++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    public static int o(int i10, o0 o0Var, Object obj) {
        if (obj instanceof LazyFieldLite) {
            return CodedOutputStream.computeLazyFieldSize(i10, (LazyFieldLite) obj);
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10);
        int iB = ((AbstractMessageLite) ((MessageLite) obj)).b(o0Var);
        return CodedOutputStream.computeUInt32SizeNoTag(iB) + iB + iComputeTagSize;
    }

    public static int p(int i10, List<?> list, o0 o0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof LazyFieldLite) {
                iComputeTagSize = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) + iComputeTagSize;
            } else {
                int iB = ((AbstractMessageLite) ((MessageLite) obj)).b(o0Var);
                iComputeTagSize = CodedOutputStream.computeUInt32SizeNoTag(iB) + iB + iComputeTagSize;
            }
        }
        return iComputeTagSize;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.computeTagSize(i10) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p) {
            p pVar = (p) list;
            iComputeSInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(pVar.getInt(i10));
                i10++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.computeTagSize(i10) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            iComputeSInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(tVar.getLong(i10));
                i10++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    public static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i11 < size) {
                Object raw = lazyStringList.getRaw(i11);
                iComputeTagSize = (raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw)) + iComputeTagSize;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iComputeTagSize = (obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                i11++;
            }
        }
        return iComputeTagSize;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.computeTagSize(i10) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p) {
            p pVar = (p) list;
            iComputeUInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(pVar.getInt(i10));
                i10++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.computeTagSize(i10) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            iComputeUInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(tVar.getLong(i10));
                i10++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    public static Object z(int i10, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj, t0 t0Var) {
        if (enumLiteMap == null) {
            return obj;
        }
        int size = abstractList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int iIntValue = ((Integer) abstractList.get(i12)).intValue();
            if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                if (i12 != i11) {
                    abstractList.set(i11, Integer.valueOf(iIntValue));
                }
                i11++;
            } else {
                obj = D(i10, iIntValue, obj, t0Var);
            }
        }
        if (i11 != size) {
            abstractList.subList(i11, size).clear();
        }
        return obj;
    }
}

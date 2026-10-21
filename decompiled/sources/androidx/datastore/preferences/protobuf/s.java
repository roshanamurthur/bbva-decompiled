package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ListFieldSchema.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21139a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f21140b = new b();

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class a extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?> f21141c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public static List d(int i10, long j10, Object obj) {
            List list;
            List listMutableCopyWithCapacity;
            List list2 = (List) v0.f21151d.m(j10, obj);
            if (list2.isEmpty()) {
                if (list2 instanceof LazyStringList) {
                    listMutableCopyWithCapacity = new LazyStringArrayList(i10);
                } else {
                    listMutableCopyWithCapacity = ((list2 instanceof i0) && (list2 instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list2).mutableCopyWithCapacity(i10) : new ArrayList(i10);
                }
                v0.x(j10, obj, listMutableCopyWithCapacity);
                return listMutableCopyWithCapacity;
            }
            if (f21141c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + i10);
                arrayList.addAll(list2);
                v0.x(j10, obj, arrayList);
                list = arrayList;
            } else {
                if (!(list2 instanceof UnmodifiableLazyStringList)) {
                    if (!(list2 instanceof i0) || !(list2 instanceof Internal.ProtobufList)) {
                        return list2;
                    }
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list2;
                    if (protobufList.isModifiable()) {
                        return list2;
                    }
                    Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list2.size() + i10);
                    v0.x(j10, obj, protobufListMutableCopyWithCapacity);
                    return protobufListMutableCopyWithCapacity;
                }
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list2.size() + i10);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list2);
                v0.x(j10, obj, lazyStringArrayList);
                list = lazyStringArrayList;
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final void a(long j10, Object obj) {
            Object objUnmodifiableList;
            List list = (List) v0.f21151d.m(j10, obj);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (f21141c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof i0) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            v0.x(j10, obj, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final void b(long j10, Object obj, Object obj2) {
            List list = (List) v0.f21151d.m(j10, obj2);
            List listD = d(list.size(), j10, obj);
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            v0.x(j10, obj, list);
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final List c(long j10, Object obj) {
            return d(10, j10, obj);
        }
    }

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class b extends s {
        @Override // androidx.datastore.preferences.protobuf.s
        public final void a(long j10, Object obj) {
            ((Internal.ProtobufList) v0.f21151d.m(j10, obj)).makeImmutable();
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final void b(long j10, Object obj, Object obj2) {
            v0.e eVar = v0.f21151d;
            Internal.ProtobufList protobufListMutableCopyWithCapacity = (Internal.ProtobufList) eVar.m(j10, obj);
            Internal.ProtobufList protobufList = (Internal.ProtobufList) eVar.m(j10, obj2);
            int size = protobufListMutableCopyWithCapacity.size();
            int size2 = protobufList.size();
            if (size > 0 && size2 > 0) {
                if (!protobufListMutableCopyWithCapacity.isModifiable()) {
                    protobufListMutableCopyWithCapacity = protobufListMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                }
                protobufListMutableCopyWithCapacity.addAll(protobufList);
            }
            if (size > 0) {
                protobufList = protobufListMutableCopyWithCapacity;
            }
            v0.x(j10, obj, protobufList);
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final List c(long j10, Object obj) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) v0.f21151d.m(j10, obj);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            v0.x(j10, obj, protobufListMutableCopyWithCapacity);
            return protobufListMutableCopyWithCapacity;
        }
    }

    public abstract void a(long j10, Object obj);

    public abstract void b(long j10, Object obj, Object obj2);

    public abstract List c(long j10, Object obj);
}

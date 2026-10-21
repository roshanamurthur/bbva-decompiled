package uc;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uc.e;

/* JADX INFO: compiled from: GroupedLinkedMap.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c<K extends e, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f93772a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f93773b = new HashMap();

    /* JADX INFO: compiled from: GroupedLinkedMap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f93774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f93775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f93776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<K, V> f93777d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f93777d = this;
            this.f93776c = this;
            this.f93774a = k10;
        }
    }

    @Nullable
    public final V a(K k10) {
        a aVar;
        HashMap map = this.f93773b;
        a aVar2 = (a) map.get(k10);
        if (aVar2 == null) {
            a aVar3 = new a(k10);
            map.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f93777d;
        aVar4.f93776c = aVar.f93776c;
        aVar.f93776c.f93777d = aVar4;
        a<K, V> aVar5 = this.f93772a;
        aVar.f93777d = aVar5;
        a<K, V> aVar6 = aVar5.f93776c;
        aVar.f93776c = aVar6;
        aVar6.f93777d = aVar;
        aVar.f93777d.f93776c = aVar;
        ArrayList arrayList = aVar.f93775b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return (V) aVar.f93775b.remove(size - 1);
        }
        return null;
    }

    public final void b(K k10, V v3) {
        HashMap map = this.f93773b;
        a aVar = (a) map.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            aVar.f93776c = aVar;
            aVar.f93777d = aVar;
            a<K, V> aVar2 = this.f93772a;
            aVar.f93777d = aVar2.f93777d;
            aVar.f93776c = aVar2;
            aVar2.f93777d = aVar;
            aVar.f93777d.f93776c = aVar;
            map.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f93775b == null) {
            aVar.f93775b = new ArrayList();
        }
        aVar.f93775b.add(v3);
    }

    @Nullable
    public final V c() {
        a<K, V> aVar = this.f93772a;
        a aVar2 = aVar.f93777d;
        while (true) {
            V v3 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f93775b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v3 = (V) aVar2.f93775b.remove(size - 1);
            }
            if (v3 != null) {
                return v3;
            }
            a<K, V> aVar3 = aVar2.f93777d;
            aVar3.f93776c = aVar2.f93776c;
            aVar2.f93776c.f93777d = aVar3;
            HashMap map = this.f93773b;
            Object obj = aVar2.f93774a;
            map.remove(obj);
            ((e) obj).a();
            aVar2 = aVar2.f93777d;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f93772a;
        a aVar2 = aVar.f93776c;
        boolean z10 = false;
        while (!aVar2.equals(aVar)) {
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sb2.append(aVar2.f93774a);
            sb2.append(AbstractJsonLexerKt.COLON);
            ArrayList arrayList = aVar2.f93775b;
            sb2.append(arrayList != null ? arrayList.size() : 0);
            sb2.append("}, ");
            aVar2 = aVar2.f93776c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}

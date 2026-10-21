package org.junit.runners;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: RuleContainer.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0476a f92034d = new C0476a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap<Object, Integer> f92035a = new IdentityHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f92036b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f92037c = new ArrayList();

    /* JADX INFO: renamed from: org.junit.runners.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RuleContainer.java */
    public static class C0476a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            int i10;
            b bVar3 = bVar;
            b bVar4 = bVar2;
            int i11 = bVar3.f92040c;
            int i12 = bVar4.f92040c;
            if (i11 < i12) {
                i10 = 1;
            } else {
                i10 = i11 == i12 ? 0 : -1;
            }
            return i10 != 0 ? i10 : bVar3.f92039b - bVar4.f92039b;
        }
    }

    /* JADX INFO: compiled from: RuleContainer.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f92038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f92039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f92040c;

        public b(Object obj, int i10, Integer num) {
            this.f92038a = obj;
            this.f92039b = i10;
            this.f92040c = num != null ? num.intValue() : -1;
        }
    }
}

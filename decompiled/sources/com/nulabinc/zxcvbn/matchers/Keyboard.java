package com.nulabinc.zxcvbn.matchers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes11.dex */
public class Keyboard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Character, List<String>> f63677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f63680e;

    public static abstract class AdjacentGraphBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f63681b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f63682c = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63683a;

        public class a implements d {
            @Override // com.nulabinc.zxcvbn.matchers.Keyboard.AdjacentGraphBuilder.d
            public final boolean a(char c10) {
                return Character.isWhitespace(c10);
            }
        }

        public class b implements d {
            @Override // com.nulabinc.zxcvbn.matchers.Keyboard.AdjacentGraphBuilder.d
            public final boolean a(char c10) {
                return c10 == '\n';
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63684a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f63685b;

            public c(int i10, int i11) {
                this.f63684a = i10;
                this.f63685b = i11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f63684a == cVar.f63684a && this.f63685b == cVar.f63685b;
            }

            public final int hashCode() {
                return (this.f63684a * 31) + this.f63685b;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
                sb2.append(this.f63684a);
                sb2.append(",");
                return androidx.activity.a.d(sb2, this.f63685b, AbstractJsonLexerKt.END_LIST);
            }
        }

        public interface d {
            boolean a(char c10);
        }

        public AdjacentGraphBuilder(String str) {
            this.f63683a = str;
        }

        public static ArrayList a(String str, d dVar) {
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            boolean z10 = false;
            int i11 = 0;
            while (i10 < length) {
                if (dVar.a(str.charAt(i10))) {
                    if (z10) {
                        arrayList.add(str.substring(i11, i10));
                        z10 = false;
                    }
                    i11 = i10 + 1;
                    i10 = i11;
                } else {
                    i10++;
                    z10 = true;
                }
            }
            if (z10) {
                arrayList.add(str.substring(i11, i10));
            }
            return arrayList;
        }

        public Map<Character, List<String>> build() {
            HashMap map = new HashMap();
            a aVar = f63681b;
            String str = this.f63683a;
            ArrayList<String> arrayListA = a(str, aVar);
            int i10 = 1;
            int length = ((String) arrayListA.get(0)).length() + 1;
            for (String str2 : arrayListA) {
            }
            for (String str3 : a(str, f63682c)) {
                int iCalcSlant = calcSlant(i10);
                for (String str4 : a(str3, aVar)) {
                    int iIndexOf = str3.indexOf(str4) - iCalcSlant;
                    int i11 = iIndexOf / length;
                    int i12 = iIndexOf % length;
                    map.put(new c(i11, i10), str4);
                }
                i10++;
            }
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                for (char c10 : ((String) entry.getValue()).toCharArray()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<c> it = getAdjacentCoords((c) entry.getKey()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(map.get(it.next()));
                    }
                    map2.put(Character.valueOf(c10), arrayList);
                }
            }
            return map2;
        }

        public abstract int calcSlant(int i10);

        public abstract List<c> getAdjacentCoords(c cVar);

        public abstract boolean isSlanted();
    }

    public Keyboard(String str, AdjacentGraphBuilder adjacentGraphBuilder) {
        this.f63676a = str;
        Map<Character, List<String>> mapBuild = adjacentGraphBuilder.build();
        this.f63677b = mapBuild;
        this.f63678c = adjacentGraphBuilder.isSlanted();
        this.f63679d = mapBuild.size();
        Iterator<Map.Entry<Character, List<String>>> it = mapBuild.entrySet().iterator();
        double size = 0.0d;
        while (it.hasNext()) {
            List<String> value = it.next().getValue();
            ArrayList arrayList = new ArrayList();
            for (String str2 : value) {
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            size += (double) arrayList.size();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<Character, List<String>>> it2 = mapBuild.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getKey());
        }
        this.f63680e = size / ((double) arrayList2.size());
    }

    public Map<Character, List<String>> getAdjacencyGraph() {
        return this.f63677b;
    }

    public double getAverageDegree() {
        return this.f63680e;
    }

    public String getName() {
        return this.f63676a;
    }

    public int getStartingPositions() {
        return this.f63679d;
    }

    public boolean isSlanted() {
        return this.f63678c;
    }
}

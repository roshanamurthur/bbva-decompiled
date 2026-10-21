package net.ipsoft.amelia.sdk.internal.c;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f84787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84790e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f84791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<c> f84792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f84793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f84794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f84795e;

        public a a(String str) {
            this.f84791a = str;
            return this;
        }

        public a b(String str) {
            this.f84793c = str;
            return this;
        }

        public a c(String str) {
            this.f84794d = str;
            return this;
        }

        public a d(String str) {
            this.f84795e = str;
            return this;
        }

        public a a(List<c> list) {
            this.f84792b = list;
            return this;
        }

        public a a(c cVar) {
            if (this.f84792b == null) {
                this.f84792b = new ArrayList();
            }
            this.f84792b.add(cVar);
            return this;
        }

        public b a() {
            return new b(this.f84791a, this.f84792b, this.f84793c, this.f84794d, this.f84795e);
        }
    }

    public b(String str, List<c> list, String str2, String str3, String str4) {
        this.f84786a = str;
        this.f84787b = list;
        this.f84788c = str2;
        this.f84789d = str3;
        this.f84790e = str4;
    }

    public c a(String str) {
        for (c cVar : this.f84787b) {
            if (cVar.m.equals(str)) {
                return cVar;
            }
        }
        return null;
    }
}

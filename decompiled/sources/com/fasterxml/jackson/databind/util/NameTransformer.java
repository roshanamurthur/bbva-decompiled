package com.fasterxml.jackson.databind.util;

import ad.d;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String strReverse = this._t1.reverse(str);
            return strReverse != null ? this._t2.reverse(strReverse) : strReverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    public static class a extends NameTransformer {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f43516p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f43517q0;

        public a(String str, String str2) {
            this.f43516p0 = str;
            this.f43517q0 = str2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String reverse(String str) {
            String str2 = this.f43516p0;
            if (!str.startsWith(str2)) {
                return null;
            }
            String strSubstring = str.substring(str2.length());
            String str3 = this.f43517q0;
            if (strSubstring.endsWith(str3)) {
                return strSubstring.substring(0, strSubstring.length() - str3.length());
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[PreAndSuffixTransformer('");
            sb2.append(this.f43516p0);
            sb2.append("','");
            return d.f(sb2, this.f43517q0, "')]");
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String transform(String str) {
            return this.f43516p0 + str + this.f43517q0;
        }
    }

    public static class b extends NameTransformer {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f43518p0;

        public b(String str) {
            this.f43518p0 = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String reverse(String str) {
            String str2 = this.f43518p0;
            if (str.startsWith(str2)) {
                return str.substring(str2.length());
            }
            return null;
        }

        public final String toString() {
            return d.f(new StringBuilder("[PrefixTransformer('"), this.f43518p0, "')]");
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String transform(String str) {
            return d.f(new StringBuilder(), this.f43518p0, str);
        }
    }

    public static class c extends NameTransformer {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f43519p0;

        public c(String str) {
            this.f43519p0 = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String reverse(String str) {
            String str2 = this.f43519p0;
            if (str.endsWith(str2)) {
                return str.substring(0, str.length() - str2.length());
            }
            return null;
        }

        public final String toString() {
            return d.f(new StringBuilder("[SuffixTransformer('"), this.f43519p0, "')]");
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String transform(String str) {
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
            sbD.append(this.f43519p0);
            return sbD.toString();
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(String str, String str2) {
        boolean z10 = false;
        boolean z11 = str != null && str.length() > 0;
        if (str2 != null && str2.length() > 0) {
            z10 = true;
        }
        if (z11) {
            return z10 ? new a(str, str2) : new b(str);
        }
        return z10 ? new c(str2) : NOP;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);

    public static final class NopTransformer extends NameTransformer implements Serializable {
        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }
}

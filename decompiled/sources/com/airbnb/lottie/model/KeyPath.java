package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.a;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class KeyPath {
    public static final KeyPath COMPOSITION = new KeyPath("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f25959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public KeyPathElement f25960b;

    public KeyPath(String... strArr) {
        this.f25959a = Arrays.asList(strArr);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f25959a.add(str);
        return keyPath;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyPath keyPath = (KeyPath) obj;
        if (!this.f25959a.equals(keyPath.f25959a)) {
            return false;
        }
        KeyPathElement keyPathElement = this.f25960b;
        KeyPathElement keyPathElement2 = keyPath.f25960b;
        if (keyPathElement != null) {
            return keyPathElement.equals(keyPathElement2);
        }
        return keyPathElement2 == null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean fullyResolvesTo(String str, int i10) {
        List<String> list = this.f25959a;
        if (i10 >= list.size()) {
            return false;
        }
        boolean z10 = i10 == list.size() - 1;
        String str2 = list.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == list.size() + (-2) && ((String) a.b(list, 1)).equals("**"))) && (str2.equals(str) || str2.equals(ProxyConfig.MATCH_ALL_SCHEMES));
        }
        if (!z10 && list.get(i10 + 1).equals(str)) {
            return i10 == list.size() + (-2) || (i10 == list.size() + (-3) && ((String) a.b(list, 1)).equals("**"));
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < list.size() - 1) {
            return false;
        }
        return list.get(i11).equals(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPathElement getResolvedElement() {
        return this.f25960b;
    }

    public int hashCode() {
        int iHashCode = this.f25959a.hashCode() * 31;
        KeyPathElement keyPathElement = this.f25960b;
        return iHashCode + (keyPathElement != null ? keyPathElement.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int incrementDepthBy(String str, int i10) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.f25959a;
        if (list.get(i10).equals("**")) {
            return (i10 != list.size() - 1 && list.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public String keysToString() {
        return this.f25959a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean matches(String str, int i10) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f25959a;
        if (i10 >= list.size()) {
            return false;
        }
        return list.get(i10).equals(str) || list.get(i10).equals("**") || list.get(i10).equals(ProxyConfig.MATCH_ALL_SCHEMES);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean propagateToChildren(String str, int i10) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f25959a;
        return i10 < list.size() - 1 || list.get(i10).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPath resolve(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f25960b = keyPathElement;
        return keyPath;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f25959a);
        sb2.append(",resolved=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.f25960b != null, AbstractJsonLexerKt.END_OBJ);
    }

    public KeyPath(KeyPath keyPath) {
        this.f25959a = new ArrayList(keyPath.f25959a);
        this.f25960b = keyPath.f25960b;
    }
}

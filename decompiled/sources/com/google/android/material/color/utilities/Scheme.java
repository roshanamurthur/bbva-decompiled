package com.google.android.material.color.utilities;

import androidx.activity.a;
import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
@CheckReturnValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Scheme {
    public int A;
    public int B;
    public int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f44410l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f44417t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44418u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f44419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f44420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f44421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f44422y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f44423z;

    public Scheme() {
    }

    public Scheme(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38) {
        this.f44399a = i10;
        this.f44400b = i11;
        this.f44401c = i12;
        this.f44402d = i13;
        this.f44403e = i14;
        this.f44404f = i15;
        this.f44405g = i16;
        this.f44406h = i17;
        this.f44407i = i18;
        this.f44408j = i19;
        this.f44409k = i20;
        this.f44410l = i21;
        this.m = i22;
        this.f44411n = i23;
        this.f44412o = i24;
        this.f44413p = i25;
        this.f44414q = i26;
        this.f44415r = i27;
        this.f44416s = i28;
        this.f44417t = i29;
        this.f44418u = i30;
        this.f44419v = i31;
        this.f44420w = i32;
        this.f44421x = i33;
        this.f44422y = i34;
        this.f44423z = i35;
        this.A = i36;
        this.B = i37;
        this.C = i38;
    }

    public static Scheme a(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f44366a1.tone(80)).withOnPrimary(corePalette.f44366a1.tone(20)).withPrimaryContainer(corePalette.f44366a1.tone(30)).withOnPrimaryContainer(corePalette.f44366a1.tone(90)).withSecondary(corePalette.f44367a2.tone(80)).withOnSecondary(corePalette.f44367a2.tone(20)).withSecondaryContainer(corePalette.f44367a2.tone(30)).withOnSecondaryContainer(corePalette.f44367a2.tone(90)).withTertiary(corePalette.f44368a3.tone(80)).withOnTertiary(corePalette.f44368a3.tone(20)).withTertiaryContainer(corePalette.f44368a3.tone(30)).withOnTertiaryContainer(corePalette.f44368a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f44369n1.tone(10)).withOnBackground(corePalette.f44369n1.tone(90)).withSurface(corePalette.f44369n1.tone(10)).withOnSurface(corePalette.f44369n1.tone(90)).withSurfaceVariant(corePalette.f44370n2.tone(30)).withOnSurfaceVariant(corePalette.f44370n2.tone(80)).withOutline(corePalette.f44370n2.tone(60)).withOutlineVariant(corePalette.f44370n2.tone(30)).withShadow(corePalette.f44369n1.tone(0)).withScrim(corePalette.f44369n1.tone(0)).withInverseSurface(corePalette.f44369n1.tone(90)).withInverseOnSurface(corePalette.f44369n1.tone(20)).withInversePrimary(corePalette.f44366a1.tone(40));
    }

    public static Scheme b(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f44366a1.tone(40)).withOnPrimary(corePalette.f44366a1.tone(100)).withPrimaryContainer(corePalette.f44366a1.tone(90)).withOnPrimaryContainer(corePalette.f44366a1.tone(10)).withSecondary(corePalette.f44367a2.tone(40)).withOnSecondary(corePalette.f44367a2.tone(100)).withSecondaryContainer(corePalette.f44367a2.tone(90)).withOnSecondaryContainer(corePalette.f44367a2.tone(10)).withTertiary(corePalette.f44368a3.tone(40)).withOnTertiary(corePalette.f44368a3.tone(100)).withTertiaryContainer(corePalette.f44368a3.tone(90)).withOnTertiaryContainer(corePalette.f44368a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f44369n1.tone(99)).withOnBackground(corePalette.f44369n1.tone(10)).withSurface(corePalette.f44369n1.tone(99)).withOnSurface(corePalette.f44369n1.tone(10)).withSurfaceVariant(corePalette.f44370n2.tone(90)).withOnSurfaceVariant(corePalette.f44370n2.tone(30)).withOutline(corePalette.f44370n2.tone(50)).withOutlineVariant(corePalette.f44370n2.tone(80)).withShadow(corePalette.f44369n1.tone(0)).withScrim(corePalette.f44369n1.tone(0)).withInverseSurface(corePalette.f44369n1.tone(20)).withInverseOnSurface(corePalette.f44369n1.tone(95)).withInversePrimary(corePalette.f44366a1.tone(80));
    }

    public static Scheme dark(int i10) {
        return a(CorePalette.of(i10));
    }

    public static Scheme darkContent(int i10) {
        return a(CorePalette.contentOf(i10));
    }

    public static Scheme light(int i10) {
        return b(CorePalette.of(i10));
    }

    public static Scheme lightContent(int i10) {
        return b(CorePalette.contentOf(i10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme) || !super.equals(obj)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        return this.f44399a == scheme.f44399a && this.f44400b == scheme.f44400b && this.f44401c == scheme.f44401c && this.f44402d == scheme.f44402d && this.f44403e == scheme.f44403e && this.f44404f == scheme.f44404f && this.f44405g == scheme.f44405g && this.f44406h == scheme.f44406h && this.f44407i == scheme.f44407i && this.f44408j == scheme.f44408j && this.f44409k == scheme.f44409k && this.f44410l == scheme.f44410l && this.m == scheme.m && this.f44411n == scheme.f44411n && this.f44412o == scheme.f44412o && this.f44413p == scheme.f44413p && this.f44414q == scheme.f44414q && this.f44415r == scheme.f44415r && this.f44416s == scheme.f44416s && this.f44417t == scheme.f44417t && this.f44418u == scheme.f44418u && this.f44419v == scheme.f44419v && this.f44420w == scheme.f44420w && this.f44421x == scheme.f44421x && this.f44422y == scheme.f44422y && this.f44423z == scheme.f44423z && this.A == scheme.A && this.B == scheme.B && this.C == scheme.C;
    }

    public int getBackground() {
        return this.f44414q;
    }

    public int getError() {
        return this.m;
    }

    public int getErrorContainer() {
        return this.f44412o;
    }

    public int getInverseOnSurface() {
        return this.B;
    }

    public int getInversePrimary() {
        return this.C;
    }

    public int getInverseSurface() {
        return this.A;
    }

    public int getOnBackground() {
        return this.f44415r;
    }

    public int getOnError() {
        return this.f44411n;
    }

    public int getOnErrorContainer() {
        return this.f44413p;
    }

    public int getOnPrimary() {
        return this.f44400b;
    }

    public int getOnPrimaryContainer() {
        return this.f44402d;
    }

    public int getOnSecondary() {
        return this.f44404f;
    }

    public int getOnSecondaryContainer() {
        return this.f44406h;
    }

    public int getOnSurface() {
        return this.f44417t;
    }

    public int getOnSurfaceVariant() {
        return this.f44419v;
    }

    public int getOnTertiary() {
        return this.f44408j;
    }

    public int getOnTertiaryContainer() {
        return this.f44410l;
    }

    public int getOutline() {
        return this.f44420w;
    }

    public int getOutlineVariant() {
        return this.f44421x;
    }

    public int getPrimary() {
        return this.f44399a;
    }

    public int getPrimaryContainer() {
        return this.f44401c;
    }

    public int getScrim() {
        return this.f44423z;
    }

    public int getSecondary() {
        return this.f44403e;
    }

    public int getSecondaryContainer() {
        return this.f44405g;
    }

    public int getShadow() {
        return this.f44422y;
    }

    public int getSurface() {
        return this.f44416s;
    }

    public int getSurfaceVariant() {
        return this.f44418u;
    }

    public int getTertiary() {
        return this.f44407i;
    }

    public int getTertiaryContainer() {
        return this.f44409k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f44399a) * 31) + this.f44400b) * 31) + this.f44401c) * 31) + this.f44402d) * 31) + this.f44403e) * 31) + this.f44404f) * 31) + this.f44405g) * 31) + this.f44406h) * 31) + this.f44407i) * 31) + this.f44408j) * 31) + this.f44409k) * 31) + this.f44410l) * 31) + this.m) * 31) + this.f44411n) * 31) + this.f44412o) * 31) + this.f44413p) * 31) + this.f44414q) * 31) + this.f44415r) * 31) + this.f44416s) * 31) + this.f44417t) * 31) + this.f44418u) * 31) + this.f44419v) * 31) + this.f44420w) * 31) + this.f44421x) * 31) + this.f44422y) * 31) + this.f44423z) * 31) + this.A) * 31) + this.B) * 31) + this.C;
    }

    public void setBackground(int i10) {
        this.f44414q = i10;
    }

    public void setError(int i10) {
        this.m = i10;
    }

    public void setErrorContainer(int i10) {
        this.f44412o = i10;
    }

    public void setInverseOnSurface(int i10) {
        this.B = i10;
    }

    public void setInversePrimary(int i10) {
        this.C = i10;
    }

    public void setInverseSurface(int i10) {
        this.A = i10;
    }

    public void setOnBackground(int i10) {
        this.f44415r = i10;
    }

    public void setOnError(int i10) {
        this.f44411n = i10;
    }

    public void setOnErrorContainer(int i10) {
        this.f44413p = i10;
    }

    public void setOnPrimary(int i10) {
        this.f44400b = i10;
    }

    public void setOnPrimaryContainer(int i10) {
        this.f44402d = i10;
    }

    public void setOnSecondary(int i10) {
        this.f44404f = i10;
    }

    public void setOnSecondaryContainer(int i10) {
        this.f44406h = i10;
    }

    public void setOnSurface(int i10) {
        this.f44417t = i10;
    }

    public void setOnSurfaceVariant(int i10) {
        this.f44419v = i10;
    }

    public void setOnTertiary(int i10) {
        this.f44408j = i10;
    }

    public void setOnTertiaryContainer(int i10) {
        this.f44410l = i10;
    }

    public void setOutline(int i10) {
        this.f44420w = i10;
    }

    public void setOutlineVariant(int i10) {
        this.f44421x = i10;
    }

    public void setPrimary(int i10) {
        this.f44399a = i10;
    }

    public void setPrimaryContainer(int i10) {
        this.f44401c = i10;
    }

    public void setScrim(int i10) {
        this.f44423z = i10;
    }

    public void setSecondary(int i10) {
        this.f44403e = i10;
    }

    public void setSecondaryContainer(int i10) {
        this.f44405g = i10;
    }

    public void setShadow(int i10) {
        this.f44422y = i10;
    }

    public void setSurface(int i10) {
        this.f44416s = i10;
    }

    public void setSurfaceVariant(int i10) {
        this.f44418u = i10;
    }

    public void setTertiary(int i10) {
        this.f44407i = i10;
    }

    public void setTertiaryContainer(int i10) {
        this.f44409k = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Scheme{primary=");
        sb2.append(this.f44399a);
        sb2.append(", onPrimary=");
        sb2.append(this.f44400b);
        sb2.append(", primaryContainer=");
        sb2.append(this.f44401c);
        sb2.append(", onPrimaryContainer=");
        sb2.append(this.f44402d);
        sb2.append(", secondary=");
        sb2.append(this.f44403e);
        sb2.append(", onSecondary=");
        sb2.append(this.f44404f);
        sb2.append(", secondaryContainer=");
        sb2.append(this.f44405g);
        sb2.append(", onSecondaryContainer=");
        sb2.append(this.f44406h);
        sb2.append(", tertiary=");
        sb2.append(this.f44407i);
        sb2.append(", onTertiary=");
        sb2.append(this.f44408j);
        sb2.append(", tertiaryContainer=");
        sb2.append(this.f44409k);
        sb2.append(", onTertiaryContainer=");
        sb2.append(this.f44410l);
        sb2.append(", error=");
        sb2.append(this.m);
        sb2.append(", onError=");
        sb2.append(this.f44411n);
        sb2.append(", errorContainer=");
        sb2.append(this.f44412o);
        sb2.append(", onErrorContainer=");
        sb2.append(this.f44413p);
        sb2.append(", background=");
        sb2.append(this.f44414q);
        sb2.append(", onBackground=");
        sb2.append(this.f44415r);
        sb2.append(", surface=");
        sb2.append(this.f44416s);
        sb2.append(", onSurface=");
        sb2.append(this.f44417t);
        sb2.append(", surfaceVariant=");
        sb2.append(this.f44418u);
        sb2.append(", onSurfaceVariant=");
        sb2.append(this.f44419v);
        sb2.append(", outline=");
        sb2.append(this.f44420w);
        sb2.append(", outlineVariant=");
        sb2.append(this.f44421x);
        sb2.append(", shadow=");
        sb2.append(this.f44422y);
        sb2.append(", scrim=");
        sb2.append(this.f44423z);
        sb2.append(", inverseSurface=");
        sb2.append(this.A);
        sb2.append(", inverseOnSurface=");
        sb2.append(this.B);
        sb2.append(", inversePrimary=");
        return a.d(sb2, this.C, AbstractJsonLexerKt.END_OBJ);
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int i10) {
        this.f44414q = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int i10) {
        this.m = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int i10) {
        this.f44412o = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int i10) {
        this.B = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int i10) {
        this.C = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int i10) {
        this.A = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int i10) {
        this.f44415r = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int i10) {
        this.f44411n = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int i10) {
        this.f44413p = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int i10) {
        this.f44400b = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int i10) {
        this.f44402d = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int i10) {
        this.f44404f = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int i10) {
        this.f44406h = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int i10) {
        this.f44417t = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int i10) {
        this.f44419v = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int i10) {
        this.f44408j = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int i10) {
        this.f44410l = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int i10) {
        this.f44420w = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int i10) {
        this.f44421x = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int i10) {
        this.f44399a = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int i10) {
        this.f44401c = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int i10) {
        this.f44423z = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int i10) {
        this.f44403e = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int i10) {
        this.f44405g = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int i10) {
        this.f44422y = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int i10) {
        this.f44416s = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int i10) {
        this.f44418u = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int i10) {
        this.f44407i = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int i10) {
        this.f44409k = i10;
        return this;
    }
}

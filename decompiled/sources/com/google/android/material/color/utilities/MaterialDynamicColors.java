package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.esotericsoftware.kryo.serializers.q;
import com.esotericsoftware.kryo.serializers.r;
import com.esotericsoftware.kryo.serializers.t;
import com.esotericsoftware.kryo.serializers.u;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import ie.a;
import ie.a0;
import ie.b;
import ie.b0;
import ie.c;
import ie.c0;
import ie.d;
import ie.d0;
import ie.e;
import ie.e0;
import ie.f;
import ie.f0;
import ie.g;
import ie.g0;
import ie.h;
import ie.h0;
import ie.i;
import ie.i0;
import ie.j;
import ie.j0;
import ie.k;
import ie.k0;
import ie.l;
import ie.l0;
import ie.m;
import ie.m0;
import ie.n;
import ie.o;
import ie.o0;
import ie.p;
import ie.p0;
import ie.q0;
import ie.r0;
import ie.s0;
import ie.t0;
import ie.u0;
import ie.v;
import ie.v0;
import ie.w;
import ie.x;
import ie.y;
import ie.z;
import java.util.function.Function;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialDynamicColors {
    public static boolean a(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    public static boolean b(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.MONOCHROME;
    }

    public static double c(Hct hct, DynamicScheme dynamicScheme) {
        Hct hctInViewingConditions = hct.inViewingConditions(ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d));
        return (!DynamicColor.tonePrefersLightForeground(hct.getTone()) || DynamicColor.toneAllowsLightForeground(hctInViewingConditions.getTone())) ? DynamicColor.enableLightForeground(hctInViewingConditions.getTone()) : DynamicColor.enableLightForeground(hct.getTone());
    }

    @NonNull
    public DynamicColor background() {
        return new DynamicColor("background", new k(3), new l(2), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette("control_activated", new h(1), new i(1));
    }

    @NonNull
    public DynamicColor controlHighlight() {
        return new DynamicColor("control_highlight", new m0(0), new t(2), false, null, null, null, null, new u(4));
    }

    @NonNull
    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette("control_normal", new z(3), new c(4));
    }

    @NonNull
    public DynamicColor error() {
        return new DynamicColor("error", new ie.t(0), new ie.u(0), true, new v(this, 0), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new w(this, 0));
    }

    @NonNull
    public DynamicColor errorContainer() {
        return new DynamicColor("error_container", new u(6), new q(5), true, new f(this, 3), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new g(this, 3));
    }

    @NonNull
    public DynamicColor highestSurface(@NonNull DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    @NonNull
    public DynamicColor inverseOnSurface() {
        return new DynamicColor("inverse_on_surface", new r0(4), new s0(5), false, new l0(this, 2), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor inversePrimary() {
        return new DynamicColor("inverse_primary", new c(1), new r(2), false, new d(this, 1), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor inverseSurface() {
        return new DynamicColor("inverse_surface", new b(1), new m(1), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_palette_key_color", new b(3), new m(3));
    }

    @NonNull
    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", new s0(2), new t0(2));
    }

    @NonNull
    public DynamicColor onBackground() {
        return new DynamicColor("on_background", new p(4), new ie.q(2), false, new ie.r(this, 2), null, new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public DynamicColor onError() {
        return new DynamicColor("on_error", new k(2), new l(1), false, new n(this, 2), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onErrorContainer() {
        return new DynamicColor("on_error_container", new h(0), new i(0), false, new j(this, 0), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimary() {
        return new DynamicColor("on_primary", new f0(0), new b(2), false, new g0(this, 0), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryContainer() {
        return new DynamicColor("on_primary_container", new l(3), new n(this, 3), false, new o(this, 1), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixed() {
        return new DynamicColor("on_primary_fixed", new c(2), new r(3), false, new d(this, 2), new e(this, 1), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixedVariant() {
        return new DynamicColor("on_primary_fixed_variant", new p0(0), new d0(2), false, new a(this, 1), new e0(this, 2), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSecondary() {
        return new DynamicColor("on_secondary", new j0(0), new f0(1), false, new k0(this, 0), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryContainer() {
        return new DynamicColor("on_secondary_container", new ie.u(3), new v(this, 4), false, new w(this, 1), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixed() {
        return new DynamicColor("on_secondary_fixed", new u(1), new q(1), false, new f(this, 0), new g(this, 0), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixedVariant() {
        return new DynamicColor("on_secondary_fixed_variant", new c(5), new r(6), false, new d(this, 3), new e(this, 2), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSurface() {
        return new DynamicColor("on_surface", new q(2), new a0(0), false, new g(this, 1), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSurfaceVariant() {
        return new DynamicColor("on_surface_variant", new d0(1), new p(2), false, new e0(this, 1), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onTertiary() {
        return new DynamicColor("on_tertiary", new r0(2), new s0(3), false, new l0(this, 0), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryContainer() {
        return new DynamicColor("on_tertiary_container", new ie.t(3), new i0(this, 2), false, new v(this, 2), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixed() {
        return new DynamicColor("on_tertiary_fixed", new m(2), new ie.t(2), false, new i0(this, 1), new v(this, 1), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixedVariant() {
        return new DynamicColor("on_tertiary_fixed_variant", new h(4), new i(5), false, new j(this, 1), new o0(this, 1), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor outline() {
        return new DynamicColor("outline", new ie.t(4), new ie.u(2), false, new v(this, 3), null, new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public DynamicColor outlineVariant() {
        return new DynamicColor("outline_variant", new u(3), new q(3), false, new f(this, 1), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), null);
    }

    @NonNull
    public DynamicColor primary() {
        return new DynamicColor("primary", new d0(0), new p(1), true, new e0(this, 0), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new ie.r(this, 1));
    }

    @NonNull
    public DynamicColor primaryContainer() {
        return new DynamicColor("primary_container", new b(0), new m(0), true, new x(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new i0(this, 0));
    }

    @NonNull
    public DynamicColor primaryFixed() {
        return new DynamicColor("primary_fixed", new k(0), new l(0), true, new n(this, 0), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new o(this, 0));
    }

    @NonNull
    public DynamicColor primaryFixedDim() {
        return new DynamicColor("primary_fixed_dim", new b0(0), new k(1), true, new c0(this, 0), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new n(this, 1));
    }

    @NonNull
    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette("primary_palette_key_color", new t(1), new u(2));
    }

    @NonNull
    public DynamicColor scrim() {
        return new DynamicColor("scrim", new y(1), new z(1), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor secondary() {
        return new DynamicColor("secondary", new s0(0), new t0(0), true, new u0(this, 0), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new v0(this, 0));
    }

    @NonNull
    public DynamicColor secondaryContainer() {
        return new DynamicColor("secondary_container", new t(3), new u(5), true, new x(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new f(this, 2));
    }

    @NonNull
    public DynamicColor secondaryFixed() {
        return new DynamicColor("secondary_fixed", new c(0), new r(1), true, new d(this, 0), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new e(this, 0));
    }

    @NonNull
    public DynamicColor secondaryFixedDim() {
        return new DynamicColor("secondary_fixed_dim", new p(0), new ie.q(0), true, new ie.r(this, 0), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: ie.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                MaterialDynamicColors materialDynamicColors = this.f69648a;
                return new ToneDeltaPair(materialDynamicColors.secondaryFixed(), materialDynamicColors.secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
            }
        });
    }

    @NonNull
    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette("secondary_palette_key_color", new s0(1), new t0(1));
    }

    @NonNull
    public DynamicColor shadow() {
        return new DynamicColor("shadow", new y(2), new z(2), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor surface() {
        return new DynamicColor("surface", new p(3), new ie.q(1), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceBright() {
        return new DynamicColor("surface_bright", new h0(1), new h(3), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainer() {
        return new DynamicColor("surface_container", new i(2), new b0(1), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHigh() {
        return new DynamicColor("surface_container_high", new i(4), new b0(3), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHighest() {
        return new DynamicColor("surface_container_highest", new p0(1), new d0(3), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLow() {
        return new DynamicColor("surface_container_low", new h0(0), new h(2), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLowest() {
        return new DynamicColor("surface_container_lowest", new ie.t(1), new ie.u(1), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceDim() {
        return new DynamicColor("surface_dim", new j0(2), new f0(3), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceTint() {
        return new DynamicColor("surface_tint", new y(0), new z(0), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceVariant() {
        return new DynamicColor("surface_variant", new m(4), new ie.t(5), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor tertiary() {
        return new DynamicColor("tertiary", new r0(3), new s0(4), true, new l0(this, 1), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new u0(this, 1));
    }

    @NonNull
    public DynamicColor tertiaryContainer() {
        return new DynamicColor("tertiary_container", new i(3), new b0(2), true, new o0(this, 0), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new c0(this, 1));
    }

    @NonNull
    public DynamicColor tertiaryFixed() {
        return new DynamicColor("tertiary_fixed", new j0(1), new f0(2), true, new k0(this, 1), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new g0(this, 1));
    }

    @NonNull
    public DynamicColor tertiaryFixedDim() {
        return new DynamicColor("tertiary_fixed_dim", new q(4), new a0(1), true, new g(this, 2), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: ie.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                MaterialDynamicColors materialDynamicColors = this.f69636a;
                return new ToneDeltaPair(materialDynamicColors.tertiaryFixed(), materialDynamicColors.tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette("tertiary_palette_key_color", new f0(4), new b(4));
    }

    @NonNull
    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette("text_hint_inverse", new r(5), new m0(1));
    }

    @NonNull
    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette("text_primary_inverse", new q0(1), new r0(1));
    }

    @NonNull
    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", new y(3), new z(4));
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new q0(0), new r0(0));
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new c(3), new r(4));
    }
}

package com.google.firebase.components;

import ad.d;
import androidx.appcompat.widget.g0;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.noknok.android.client.extension.PlayIntegrity;

/* JADX INFO: loaded from: classes10.dex */
public final class Dependency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qualified<?> f47673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47675c;

    public Dependency(Class<?> cls, int i10, int i11) {
        this((Qualified<?>) Qualified.unqualified(cls), i10, i11);
    }

    public static Dependency deferred(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    @Deprecated
    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency setOfProvider(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.f47673a.equals(dependency.f47673a) && this.f47674b == dependency.f47674b && this.f47675c == dependency.f47675c;
    }

    public Qualified<?> getInterface() {
        return this.f47673a;
    }

    public int hashCode() {
        return ((((this.f47673a.hashCode() ^ 1000003) * 1000003) ^ this.f47674b) * 1000003) ^ this.f47675c;
    }

    public boolean isDeferred() {
        return this.f47675c == 2;
    }

    public boolean isDirectInjection() {
        return this.f47675c == 0;
    }

    public boolean isRequired() {
        return this.f47674b == 1;
    }

    public boolean isSet() {
        return this.f47674b == 2;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f47673a);
        sb2.append(", type=");
        int i10 = this.f47674b;
        if (i10 == 1) {
            str = PlayIntegrity.KEY_REQUIRED;
        } else {
            str = i10 == 0 ? "optional" : SetCommand.ID;
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f47675c;
        if (i11 == 0) {
            str2 = DevicePublicKeyStringDef.DIRECT;
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(g0.c("Unsupported injection: ", i11));
            }
            str2 = "deferred";
        }
        return d.f(sb2, str2, "}");
    }

    public Dependency(Qualified<?> qualified, int i10, int i11) {
        this.f47673a = (Qualified) Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.f47674b = i10;
        this.f47675c = i11;
    }

    public static Dependency deferred(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 2);
    }

    public static Dependency optionalProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 1);
    }

    public static Dependency required(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency requiredProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 1);
    }

    public static Dependency setOf(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 0);
    }

    public static Dependency setOfProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 1);
    }
}

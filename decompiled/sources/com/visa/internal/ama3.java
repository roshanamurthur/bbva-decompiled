package com.visa.internal;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ama3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f68027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final str1 f68028e;

    public ama3(String name, String code, String fontFamily, String fontNames, str1 data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontNames, "fontNames");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f68024a = name;
        this.f68025b = code;
        this.f68026c = fontFamily;
        this.f68027d = fontNames;
        this.f68028e = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ama3)) {
            return false;
        }
        ama3 ama3Var = (ama3) obj;
        return Intrinsics.areEqual(this.f68024a, ama3Var.f68024a) && Intrinsics.areEqual(this.f68025b, ama3Var.f68025b) && Intrinsics.areEqual(this.f68026c, ama3Var.f68026c) && Intrinsics.areEqual(this.f68027d, ama3Var.f68027d) && Intrinsics.areEqual(this.f68028e, ama3Var.f68028e);
    }

    public final int hashCode() {
        return this.f68028e.hashCode() + n1.c(this.f68027d, n1.c(this.f68026c, n1.c(this.f68025b, this.f68024a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Language(name=" + this.f68024a + ", code=" + this.f68025b + ", fontFamily=" + this.f68026c + ", fontNames=" + this.f68027d + ", data=" + this.f68028e + RootService.CLOSE_BRACKET;
    }
}

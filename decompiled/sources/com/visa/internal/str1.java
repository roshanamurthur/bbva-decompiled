package com.visa.internal;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class str1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68044c;

    public str1(String approve, String success, String complete) {
        Intrinsics.checkNotNullParameter(approve, "approve");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(complete, "complete");
        this.f68042a = approve;
        this.f68043b = success;
        this.f68044c = complete;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof str1)) {
            return false;
        }
        str1 str1Var = (str1) obj;
        return Intrinsics.areEqual(this.f68042a, str1Var.f68042a) && Intrinsics.areEqual(this.f68043b, str1Var.f68043b) && Intrinsics.areEqual(this.f68044c, str1Var.f68044c);
    }

    public final int hashCode() {
        return this.f68044c.hashCode() + n1.c(this.f68043b, this.f68042a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextOptionData(approve=");
        sb2.append(this.f68042a);
        sb2.append(", success=");
        sb2.append(this.f68043b);
        sb2.append(", complete=");
        return y2.b(sb2, this.f68044c, RootService.CLOSE_BRACKET);
    }
}

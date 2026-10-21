package com.visa.internal;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.visa.CheckmarkMode;
import com.visa.CheckmarkTextOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class irts6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f68033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckmarkMode f68034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CheckmarkTextOption f68035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f68036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mast2 f68037h;

    public irts6(int i10, int i11, boolean z10, boolean z11, CheckmarkMode checkmarkMode, CheckmarkTextOption checkmarkText, String languageCode, mast2 languages) {
        Intrinsics.checkNotNullParameter(checkmarkMode, "checkmarkMode");
        Intrinsics.checkNotNullParameter(checkmarkText, "checkmarkText");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.f68030a = i10;
        this.f68031b = i11;
        this.f68032c = z10;
        this.f68033d = z11;
        this.f68034e = checkmarkMode;
        this.f68035f = checkmarkText;
        this.f68036g = languageCode;
        this.f68037h = languages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irts6)) {
            return false;
        }
        irts6 irts6Var = (irts6) obj;
        return this.f68030a == irts6Var.f68030a && this.f68031b == irts6Var.f68031b && this.f68032c == irts6Var.f68032c && this.f68033d == irts6Var.f68033d && this.f68034e == irts6Var.f68034e && this.f68035f == irts6Var.f68035f && Intrinsics.areEqual(this.f68036g, irts6Var.f68036g) && Intrinsics.areEqual(this.f68037h, irts6Var.f68037h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int i10 = (this.f68031b + (this.f68030a * 31)) * 31;
        boolean z10 = this.f68032c;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i11 = (i10 + r1) * 31;
        boolean z11 = this.f68033d;
        return this.f68037h.hashCode() + n1.c(this.f68036g, (this.f68035f.hashCode() + ((this.f68034e.hashCode() + ((i11 + (z11 ? 1 : z11)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SensoryConfig(backdropColor=" + this.f68030a + ", foregroundColor=" + this.f68031b + ", soundEnabled=" + this.f68032c + ", hapticEnabled=" + this.f68033d + ", checkmarkMode=" + this.f68034e + ", checkmarkText=" + this.f68035f + ", languageCode=" + this.f68036g + ", languages=" + this.f68037h + RootService.CLOSE_BRACKET;
    }
}

package com.bbva.selfiecapture.plugin.command.params.response;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelfieCaptureResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/params/response/CapturedImagePro;", "", "id", "", "url", ClientData.KEY_CHALLENGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUrl", "getChallenge", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CapturedImagePro {

    @Nullable
    private final String challenge;

    @NotNull
    private final String id;

    @NotNull
    private final String url;

    public CapturedImagePro(@NotNull String id, @NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = id;
        this.url = url;
        this.challenge = str;
    }

    public static /* synthetic */ CapturedImagePro copy$default(CapturedImagePro capturedImagePro, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = capturedImagePro.id;
        }
        if ((i10 & 2) != 0) {
            str2 = capturedImagePro.url;
        }
        if ((i10 & 4) != 0) {
            str3 = capturedImagePro.challenge;
        }
        return capturedImagePro.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final CapturedImagePro copy(@NotNull String id, @NotNull String url, @Nullable String challenge) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        return new CapturedImagePro(id, url, challenge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapturedImagePro)) {
            return false;
        }
        CapturedImagePro capturedImagePro = (CapturedImagePro) other;
        return Intrinsics.areEqual(this.id, capturedImagePro.id) && Intrinsics.areEqual(this.url, capturedImagePro.url) && Intrinsics.areEqual(this.challenge, capturedImagePro.challenge);
    }

    @Nullable
    public final String getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iC = n1.c(this.url, this.id.hashCode() * 31, 31);
        String str = this.challenge;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.url;
        return d.f(a.c("CapturedImagePro(id=", str, ", url=", str2, ", challenge="), this.challenge, ")");
    }
}

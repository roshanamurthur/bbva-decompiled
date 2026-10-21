package com.veridas.metadata.entities;

import android.util.Base64;
import com.veridas.Veridas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Integrity.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/veridas/metadata/entities/Integrity;", "", "", "a", "Ljava/lang/String;", "getRev", "()Ljava/lang/String;", "rev", "", "b", "[B", "getSalt", "()[B", "setSalt", "([B)V", "salt", "getSalt64", "salt64", "<init>", "()V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class Integrity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String rev = Veridas.REVISION;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public byte[] salt = Random.INSTANCE.nextBytes(16);

    @NotNull
    public final String getRev() {
        return this.rev;
    }

    @NotNull
    public final byte[] getSalt() {
        return this.salt;
    }

    @NotNull
    public final String getSalt64() {
        String strEncodeToString = Base64.encodeToString(this.salt, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return StringsKt__StringsKt.trim((CharSequence) strEncodeToString).toString();
    }

    public final void setSalt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.salt = bArr;
    }
}

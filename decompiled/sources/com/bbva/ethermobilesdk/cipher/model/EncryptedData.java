package com.bbva.ethermobilesdk.cipher.model;

import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.cipher.keystore.provider.impl.AndroidKeyStoreProvider;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncryptedData.kt */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(23)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/model/EncryptedData;", "", "", "toString", "", "a", "[B", "getIv", "()[B", "iv", "b", "getData", "data", "<init>", "([B[B)V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class EncryptedData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] iv;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] data;

    /* JADX INFO: compiled from: EncryptedData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/model/EncryptedData$Companion;", "", "()V", "from", "Lcom/bbva/ethermobilesdk/cipher/model/EncryptedData;", "data", "", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EncryptedData from(@NotNull String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) data, new String[]{"|"}, false, 0, 6, (Object) null);
            return new EncryptedData(EncodingUtilsKt.base64ToByteArray((String) listSplit$default.get(1)), EncodingUtilsKt.base64ToByteArray((String) listSplit$default.get(2)));
        }
    }

    public EncryptedData(@NotNull byte[] iv, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(data, "data");
        this.iv = iv;
        this.data = data;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final byte[] getIv() {
        return this.iv;
    }

    @NotNull
    public String toString() {
        byte[] bytes = AndroidKeyStoreProvider.KP_23.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return EncodingUtilsKt.toBase64(bytes) + "|" + EncodingUtilsKt.toBase64(this.iv) + "|" + EncodingUtilsKt.toBase64(this.data);
    }
}

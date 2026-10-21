package com.bbva.ethermobilesdk.cipher.pincipher.model;

import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteHostData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/pincipher/model/ByteHostData;", "", "", "component1", "component2", "component3", "component4", FirebaseAnalytics.Param.INDEX, "version", "firstSegment", "secondSegment", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "[B", "getIndex", "()[B", "b", "getVersion", "c", "getFirstSegment", "d", "getSecondSegment", "<init>", "([B[B[B[B)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ByteHostData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] version;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] firstSegment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] secondSegment;

    public ByteHostData(@NotNull byte[] index, @NotNull byte[] version, @NotNull byte[] firstSegment, @NotNull byte[] secondSegment) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(firstSegment, "firstSegment");
        Intrinsics.checkNotNullParameter(secondSegment, "secondSegment");
        this.index = index;
        this.version = version;
        this.firstSegment = firstSegment;
        this.secondSegment = secondSegment;
    }

    public static /* synthetic */ ByteHostData copy$default(ByteHostData byteHostData, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = byteHostData.index;
        }
        if ((i10 & 2) != 0) {
            bArr2 = byteHostData.version;
        }
        if ((i10 & 4) != 0) {
            bArr3 = byteHostData.firstSegment;
        }
        if ((i10 & 8) != 0) {
            bArr4 = byteHostData.secondSegment;
        }
        return byteHostData.copy(bArr, bArr2, bArr3, bArr4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getFirstSegment() {
        return this.firstSegment;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte[] getSecondSegment() {
        return this.secondSegment;
    }

    @NotNull
    public final ByteHostData copy(@NotNull byte[] index, @NotNull byte[] version, @NotNull byte[] firstSegment, @NotNull byte[] secondSegment) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(firstSegment, "firstSegment");
        Intrinsics.checkNotNullParameter(secondSegment, "secondSegment");
        return new ByteHostData(index, version, firstSegment, secondSegment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ByteHostData)) {
            return false;
        }
        ByteHostData byteHostData = (ByteHostData) other;
        return Intrinsics.areEqual(this.index, byteHostData.index) && Intrinsics.areEqual(this.version, byteHostData.version) && Intrinsics.areEqual(this.firstSegment, byteHostData.firstSegment) && Intrinsics.areEqual(this.secondSegment, byteHostData.secondSegment);
    }

    @NotNull
    public final byte[] getFirstSegment() {
        return this.firstSegment;
    }

    @NotNull
    public final byte[] getIndex() {
        return this.index;
    }

    @NotNull
    public final byte[] getSecondSegment() {
        return this.secondSegment;
    }

    @NotNull
    public final byte[] getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Arrays.hashCode(this.secondSegment) + ((Arrays.hashCode(this.firstSegment) + ((Arrays.hashCode(this.version) + (Arrays.hashCode(this.index) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String string = Arrays.toString(this.index);
        String string2 = Arrays.toString(this.version);
        return c.b(a.c("ByteHostData(index=", string, ", version=", string2, ", firstSegment="), Arrays.toString(this.firstSegment), ", secondSegment=", Arrays.toString(this.secondSegment), ")");
    }
}

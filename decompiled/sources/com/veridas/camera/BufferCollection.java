package com.veridas.camera;

import com.bbva.plugin.media.capture.util.Constants;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BufferCollection.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/veridas/camera/BufferCollection;", "", "", "key", "Ljava/nio/ByteBuffer;", "get", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Landroid/hardware/Camera;", Constants.CAMERA_SRC, "", "attachBuffers", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getBufferSize", "()I", "bufferSize", "numberOfBuffers", "<init>", "(II)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBufferCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferCollection.kt\ncom/veridas/camera/BufferCollection\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,35:1\n215#2,2:36\n*S KotlinDebug\n*F\n+ 1 BufferCollection.kt\ncom/veridas/camera/BufferCollection\n*L\n30#1:36,2\n*E\n"})
public final class BufferCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int bufferSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f66599b;

    public BufferCollection(int i10, int i11) {
        this.bufferSize = i11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i12 = 0; i12 < i10; i12++) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.bufferSize);
            byte[] bArrArray = byteBufferAllocateDirect.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
            Intrinsics.checkNotNull(byteBufferAllocateDirect);
            linkedHashMap.put(bArrArray, byteBufferAllocateDirect);
        }
        this.f66599b = linkedHashMap;
    }

    public final void attachBuffers(@NotNull android.hardware.Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Iterator it = this.f66599b.entrySet().iterator();
        while (it.hasNext()) {
            camera.addCallbackBuffer((byte[]) ((Map.Entry) it.next()).getKey());
        }
    }

    public final boolean contains(@NotNull byte[] key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f66599b.containsKey(key);
    }

    @Nullable
    public final ByteBuffer get(@NotNull byte[] key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (ByteBuffer) this.f66599b.get(key);
    }

    public final int getBufferSize() {
        return this.bufferSize;
    }

    public /* synthetic */ BufferCollection(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1 : i10, i11);
    }
}

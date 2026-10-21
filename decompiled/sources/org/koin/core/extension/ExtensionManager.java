package org.koin.core.extension;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;

/* JADX INFO: compiled from: ExtensionManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\nR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R<\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0014j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002`\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lorg/koin/core/extension/ExtensionManager;", "", "Lorg/koin/core/extension/KoinExtension;", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "getExtension", "(Ljava/lang/String;)Lorg/koin/core/extension/KoinExtension;", "getExtensionOrNull", "extension", "", "registerExtension", "(Ljava/lang/String;Lorg/koin/core/extension/KoinExtension;)V", HearingDisabilitiesConstants.CLOSE_MODAL, "Lorg/koin/core/Koin;", "a", "Lorg/koin/core/Koin;", "get_koin$koin_core", "()Lorg/koin/core/Koin;", "_koin", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "getExtensions", "()Ljava/util/HashMap;", "getExtensions$annotations", "()V", IAppSDKPlus.EXTRA_KEY_EXTENSIONS, "<init>", "(Lorg/koin/core/Koin;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
@KoinInternalApi
@SourceDebugExtension({"SMAP\nExtensionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtensionManager.kt\norg/koin/core/extension/ExtensionManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n36#1:47\n1855#2,2:48\n*S KotlinDebug\n*F\n+ 1 ExtensionManager.kt\norg/koin/core/extension/ExtensionManager\n*L\n34#1:47\n44#1:48,2\n*E\n"})
public final class ExtensionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Koin _koin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashMap<String, KoinExtension> extensions;

    public ExtensionManager(@NotNull Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        this.extensions = new HashMap<>();
    }

    public final void close() {
        Collection<KoinExtension> collectionValues = this.extensions.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "extensions.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((KoinExtension) it.next()).onClose();
        }
    }

    public final /* synthetic */ <T extends KoinExtension> T getExtension(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        KoinExtension koinExtension = getExtensions().get(id);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t10 = (T) koinExtension;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(("Koin extension '" + id + "' not found.").toString());
    }

    public final /* synthetic */ <T extends KoinExtension> T getExtensionOrNull(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        KoinExtension koinExtension = getExtensions().get(id);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) koinExtension;
    }

    @NotNull
    public final HashMap<String, KoinExtension> getExtensions() {
        return this.extensions;
    }

    @NotNull
    /* JADX INFO: renamed from: get_koin$koin_core, reason: from getter */
    public final Koin get_koin() {
        return this._koin;
    }

    public final <T extends KoinExtension> void registerExtension(@NotNull String id, @NotNull T extension) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.extensions.put(id, extension);
        extension.setKoin(this._koin);
    }

    @PublishedApi
    public static /* synthetic */ void getExtensions$annotations() {
    }
}

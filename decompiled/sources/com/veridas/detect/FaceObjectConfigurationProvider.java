package com.veridas.detect;

import bk.q;
import com.veridas.resource.AndroidResourcesUtil;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FaceObjectConfigurationProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0003\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/veridas/detect/FaceObjectConfigurationProvider;", "Lcom/veridas/detect/ObjectConfigurationProvider;", "Lcom/veridas/detect/DetectableObjectConfiguration;", "get", "", "identifier", "", "identifiers", "Lcom/veridas/detect/ObjectConfigurationCollection;", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "resourcesDatabase", "<init>", "(Lcom/veridas/resource/database/IBlockingResourcesDatabase;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class FaceObjectConfigurationProvider implements ObjectConfigurationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IBlockingResourcesDatabase f66760a;

    public FaceObjectConfigurationProvider(@NotNull IBlockingResourcesDatabase resourcesDatabase) {
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        this.f66760a = resourcesDatabase;
    }

    @Override // com.veridas.detect.ObjectConfigurationProvider
    @NotNull
    public DetectableObjectConfiguration get() {
        byte[] cascadeBytes = this.f66760a.getCascadeBytes("haarcascade_frontalface_alt2.xml");
        if (cascadeBytes != null) {
            return new DetectableObjectConfiguration(null, null, AndroidResourcesUtil.bytesToString(cascadeBytes), "haarcascade_frontalface_alt2.xml", 0, 0.0d, false, 0.0d, 0.0d, 0, 0, false, 1.1d, 5.0d, 5.0d, 1.5d, 1.5d, 2, 0.0d, 0.0d, 0.0d, 1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 126095347, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.veridas.detect.ObjectConfigurationProvider
    @NotNull
    public DetectableObjectConfiguration get(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return get();
    }

    @Override // com.veridas.detect.ObjectConfigurationProvider
    @NotNull
    public ObjectConfigurationCollection get(@NotNull List<String> identifiers) {
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        return new ObjectConfigurationCollection(q.emptyMap());
    }
}

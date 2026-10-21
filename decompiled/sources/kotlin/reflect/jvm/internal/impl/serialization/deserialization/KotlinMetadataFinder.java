package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KotlinMetadataFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface KotlinMetadataFinder {
    @Nullable
    InputStream findBuiltInsData(@NotNull FqName fqName);
}

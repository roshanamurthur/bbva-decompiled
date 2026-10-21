package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: javaTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaPrimitiveType extends JavaType {
    @Nullable
    PrimitiveType getType();
}

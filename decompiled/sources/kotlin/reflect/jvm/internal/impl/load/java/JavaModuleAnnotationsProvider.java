package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaModuleAnnotationsProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaModuleAnnotationsProvider {
    @Nullable
    List<JavaAnnotation> getAnnotationsForModuleOwnerOfClass(@NotNull ClassId classId);
}

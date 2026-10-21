package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaTypeParameterListOwner extends JavaElement {
    @NotNull
    List<JavaTypeParameter> getTypeParameters();
}

package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaMember extends JavaAnnotationOwner, JavaModifierListOwner, JavaNamedElement {
    @NotNull
    JavaClass getContainingClass();
}

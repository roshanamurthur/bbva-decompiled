package com.bbva.cells.pluginkit.command;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Command.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t\u0012\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00030\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/bbva/cells/pluginkit/command/DependencyProvider;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "type", "Lkotlin/Function0;", "", "componentsProvider", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class DependencyProvider<T> implements ReadOnlyProperty<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<?> f26811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0<Map<KClass<?>, Object>> f26812b;

    /* JADX WARN: Multi-variable type inference failed */
    public DependencyProvider(@NotNull KClass<?> type, @NotNull Function0<? extends Map<KClass<?>, ? extends Object>> componentsProvider) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(componentsProvider, "componentsProvider");
        this.f26811a = type;
        this.f26812b = componentsProvider;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public T getValue(@NotNull Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return (T) this.f26812b.invoke().get(this.f26811a);
    }
}

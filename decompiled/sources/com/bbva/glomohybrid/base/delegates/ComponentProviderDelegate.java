package com.bbva.glomohybrid.base.delegates;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.app.ComponentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComponentProviderDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/base/delegates/ComponentProviderDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "Landroid/app/Activity;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroid/app/Activity;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "", "componentId", "", "pageId", "<init>", "(Ljava/lang/String;I)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class ComponentProviderDelegate<T> implements ReadOnlyProperty<Activity, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f31301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f31303c;

    public ComponentProviderDelegate(@NotNull String componentId, int i10) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.f31301a = componentId;
        this.f31302b = i10;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Activity activity, KProperty kProperty) {
        return getValue2(activity, (KProperty<?>) kProperty);
    }

    @Nullable
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public T getValue2(@NotNull Activity thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t10 = this.f31303c;
        if (t10 == null) {
            int i10 = this.f31302b;
            String str = this.f31301a;
            t10 = (T) ComponentManager.get(i10, str);
            if (t10 == null) {
                t10 = (T) ComponentManager.get(str);
                Intrinsics.checkNotNullExpressionValue(t10, "get(...)");
            } else {
                Intrinsics.checkNotNull(t10);
            }
        }
        this.f31303c = t10;
        return t10;
    }

    public /* synthetic */ ComponentProviderDelegate(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? -1 : i10);
    }
}

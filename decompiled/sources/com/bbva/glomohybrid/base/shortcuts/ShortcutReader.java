package com.bbva.glomohybrid.base.shortcuts;

import a6.c;
import com.bbva.cells.component.kit.common.RxComponent;
import com.bbva.cells.component.kit.featureflag.FlagState;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortcutReader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\f\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nH\u0016J\"\u0010\u0011\u001a\u00020\u00072\u001a\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\rR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/base/shortcuts/ShortcutReader;", "Lcom/bbva/cells/component/kit/common/RxComponent;", "", "getId", "key", "Lcom/bbva/cells/component/kit/featureflag/FlagState;", "state", "", "setFeatureFlag", "name", "Lio/reactivex/functions/Consumer;", "consumer", "featureFlag", "", "", "", "shortcuts", "setConfig", "Lcom/bbva/glomohybrid/base/shortcuts/Shortcut;", "<set-?>", "t0", "Ljava/util/List;", "getShortcuts", "()Ljava/util/List;", "<init>", "()V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nShortcutReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutReader.kt\ncom/bbva/glomohybrid/base/shortcuts/ShortcutReader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1603#2,9:35\n1855#2:44\n1856#2:46\n1612#2:47\n1#3:45\n*S KotlinDebug\n*F\n+ 1 ShortcutReader.kt\ncom/bbva/glomohybrid/base/shortcuts/ShortcutReader\n*L\n31#1:35,9\n31#1:44\n31#1:46\n31#1:47\n31#1:45\n*E\n"})
public final class ShortcutReader extends RxComponent {

    @NotNull
    public static final String ID = "shortcut-component";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public ArrayList f31565t0 = new ArrayList();

    public ShortcutReader() {
        newProperty("shortcuts", new c(this, 1));
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getK0() {
        return ID;
    }

    @NotNull
    public final List<Shortcut> getShortcuts() {
        return this.f31565t0;
    }

    public final void setConfig(@NotNull List<? extends Map<String, ? extends Object>> shortcuts) {
        Intrinsics.checkNotNullParameter(shortcuts, "shortcuts");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = shortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new Shortcut((Map) it.next()));
        }
        this.f31565t0 = arrayList;
    }

    @Override // com.bbva.cells.component.kit.common.Component, com.bbva.cells.component.kit.properties.RxDynamicPropertyObserver
    public void featureFlag(@Nullable String name, @Nullable Consumer<FlagState> consumer) {
    }

    @Override // com.bbva.cells.component.kit.common.Component
    public void setFeatureFlag(@Nullable String key, @Nullable FlagState state) {
    }
}

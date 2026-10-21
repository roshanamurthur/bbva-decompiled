package com.bbva.glomohybrid.base.extensions;

import android.os.Bundle;
import androidx.camera.core.processing.f;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BundleExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u001a0\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u0004*\u0004\u0018\u00010\u0005\u001a\u0018\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007*\u00020\u0005¨\u0006\b"}, d2 = {"toHashMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Landroid/os/Bundle;", "toMap", "", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBundleExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleExtensions.kt\ncom/bbva/glomohybrid/base/extensions/BundleExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1855#2,2:19\n1208#2,2:21\n1238#2,4:23\n1#3:27\n*S KotlinDebug\n*F\n+ 1 BundleExtensions.kt\ncom/bbva/glomohybrid/base/extensions/BundleExtensionsKt\n*L\n8#1:19,2\n15#1:21,2\n15#1:23,4\n*E\n"})
public final class BundleExtensionsKt {
    @Nullable
    public static final HashMap<String, Object> toHashMap(@Nullable Bundle bundle) {
        LinkedHashMap linkedHashMap;
        Set<String> setKeySet;
        if (bundle == null || (setKeySet = bundle.keySet()) == null) {
            linkedHashMap = null;
        } else {
            Set<String> set = setKeySet;
            linkedHashMap = new LinkedHashMap(f.a(set, 10, 16));
            for (String str : set) {
                linkedHashMap.put(str, bundle.get(str));
            }
        }
        if (linkedHashMap != null) {
            return new HashMap<>(linkedHashMap);
        }
        return null;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        HashMap map = new HashMap();
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            Intrinsics.checkNotNull(str);
            map.put(str, bundle.getString(str));
        }
        return map;
    }
}

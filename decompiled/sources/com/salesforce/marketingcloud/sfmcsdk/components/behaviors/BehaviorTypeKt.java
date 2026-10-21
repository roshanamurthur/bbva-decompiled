package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BehaviorType.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toEvent", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior;", "sfmcsdk_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BehaviorTypeKt {
    @Nullable
    public static final Event toEvent(@NotNull Behavior behavior) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(behavior, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String appVersion = behavior.getAppVersion();
        if (appVersion != null) {
            linkedHashMap.put(BehaviorManagerImpl.BUNDLE_KEY_CURRENT_VERSION, appVersion);
        }
        String appName = behavior.getAppName();
        if (appName != null) {
            linkedHashMap.put(BehaviorManagerImpl.BUNDLE_KEY_APP_NAME, appName);
        }
        if (behavior instanceof Behavior.AppVersionChanged) {
            String previousVersion = behavior.getPreviousVersion();
            if (previousVersion != null) {
                linkedHashMap.put(BehaviorManagerImpl.BUNDLE_KEY_PREVIOUS_VERSION, previousVersion);
            }
            strValueOf = String.valueOf(Reflection.getOrCreateKotlinClass(behavior.getClass()).getSimpleName());
        } else if (behavior instanceof Behavior.ScreenEntry) {
            linkedHashMap.put("screen_name", ((Behavior.ScreenEntry) behavior).getName());
            strValueOf = String.valueOf(Reflection.getOrCreateKotlinClass(behavior.getClass()).getSimpleName());
        } else {
            strValueOf = String.valueOf(Reflection.getOrCreateKotlinClass(behavior.getClass()).getSimpleName());
        }
        return EventManager.INSTANCE.customEvent(strValueOf, linkedHashMap, Event.Producer.SFMC_SDK, Event.Category.SYSTEM);
    }
}

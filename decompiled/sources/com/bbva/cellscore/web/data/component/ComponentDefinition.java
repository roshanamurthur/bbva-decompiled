package com.bbva.cellscore.web.data.component;

import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class ComponentDefinition {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ComponentType {
        private static final /* synthetic */ ComponentType[] $VALUES;
        public static final ComponentType CROSS;
        public static final ComponentType DATA_MANAGER;
        public static final ComponentType UI;

        static {
            ComponentType componentType = new ComponentType(ComponentDTO.UI, 0);
            UI = componentType;
            ComponentType componentType2 = new ComponentType("CROSS", 1);
            CROSS = componentType2;
            ComponentType componentType3 = new ComponentType("DATA_MANAGER", 2);
            DATA_MANAGER = componentType3;
            $VALUES = new ComponentType[]{componentType, componentType2, componentType3};
        }

        public ComponentType() {
            throw null;
        }

        public static ComponentType valueOf(String str) {
            return (ComponentType) Enum.valueOf(ComponentType.class, str);
        }

        public static ComponentType[] values() {
            return (ComponentType[]) $VALUES.clone();
        }
    }

    public static ComponentDefinition create(String str, String str2, ComponentType componentType, ArrayList<FeatureFlag> arrayList, Map<String, Object> map, ArrayList<Channel> arrayList2) {
        return new a(str, str2, componentType, arrayList, map, arrayList2);
    }

    public abstract ArrayList<Channel> channels();

    public abstract ArrayList<FeatureFlag> flags();

    public ComponentDefinition from(Map<String, Object> map) {
        return new a(tag(), zone(), type(), flags(), map, channels());
    }

    public abstract Map<String, Object> properties();

    public abstract String tag();

    public abstract ComponentType type();

    public abstract String zone();
}

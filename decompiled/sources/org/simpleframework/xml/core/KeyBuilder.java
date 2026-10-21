package org.simpleframework.xml.core;

import java.util.Arrays;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes13.dex */
class KeyBuilder {
    private final Label label;

    public enum KeyType {
        TEXT,
        ATTRIBUTE,
        ELEMENT
    }

    public KeyBuilder(Label label) {
        this.label = label;
    }

    public Object getKey() throws Exception {
        return this.label.isAttribute() ? getKey(KeyType.ATTRIBUTE) : getKey(KeyType.ELEMENT);
    }

    public static class Key {
        private final KeyType type;
        private final String value;

        public Key(KeyType keyType, String str) throws Exception {
            this.value = str;
            this.type = keyType;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return equals((Key) obj);
            }
            return false;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return this.value;
        }

        public boolean equals(Key key) {
            if (this.type == key.type) {
                return key.value.equals(this.value);
            }
            return false;
        }
    }

    private Object getKey(KeyType keyType) throws Exception {
        String key = getKey(this.label.getPaths());
        return keyType == null ? key : new Key(keyType, key);
    }

    private String getKey(String[] strArr) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        if (strArr.length > 0) {
            Arrays.sort(strArr);
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(Typography.greater);
            }
        }
        return sb2.toString();
    }
}

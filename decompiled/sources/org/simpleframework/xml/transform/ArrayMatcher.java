package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes13.dex */
class ArrayMatcher implements Matcher {
    private final Matcher primary;

    public ArrayMatcher(Matcher matcher) {
        this.primary = matcher;
    }

    private Transform matchArray(Class cls) throws Exception {
        Transform transformMatch = this.primary.match(cls);
        if (transformMatch == null) {
            return null;
        }
        return new ArrayTransform(transformMatch, cls);
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) throws Exception {
        Class<?> componentType = cls.getComponentType();
        if (componentType == Character.TYPE) {
            return new CharacterArrayTransform(componentType);
        }
        if (componentType == Character.class) {
            return new CharacterArrayTransform(componentType);
        }
        return componentType == String.class ? new StringArrayTransform() : matchArray(componentType);
    }
}

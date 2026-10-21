package flexjson;

/* JADX INFO: loaded from: classes7.dex */
public class TypeContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BasicType f68509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68510b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f68511c;

    public TypeContext(BasicType basicType) {
        this.f68509a = basicType;
    }

    public void decrement() {
        this.f68510b = Math.max(this.f68510b - 1, 0);
    }

    public BasicType getBasicType() {
        return this.f68509a;
    }

    public String getPropertyName() {
        return this.f68511c;
    }

    public void increment() {
        this.f68510b++;
    }

    public boolean isFirst() {
        return this.f68510b == 0;
    }

    public void setBasicType(BasicType basicType) {
        this.f68509a = basicType;
    }

    public void setPropertyName(String str) {
        this.f68511c = str;
    }
}

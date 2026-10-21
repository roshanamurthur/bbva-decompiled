package javax.activation;

/* JADX INFO: loaded from: classes12.dex */
public class ActivationDataFlavor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MimeType f78839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f78840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f78841d;

    public ActivationDataFlavor(Class cls, String str, String str2) {
        this.f78839b = null;
        this.f78838a = str;
        this.f78840c = str2;
        this.f78841d = cls;
    }

    public boolean equals(ActivationDataFlavor activationDataFlavor) {
        return isMimeTypeEqual(activationDataFlavor.f78838a) && activationDataFlavor.getRepresentationClass() == this.f78841d;
    }

    public String getHumanPresentableName() {
        return this.f78840c;
    }

    public String getMimeType() {
        return this.f78838a;
    }

    public Class getRepresentationClass() {
        return this.f78841d;
    }

    public boolean isMimeTypeEqual(String str) {
        String str2 = this.f78838a;
        try {
            if (this.f78839b == null) {
                this.f78839b = new MimeType(str2);
            }
            return this.f78839b.match(new MimeType(str));
        } catch (MimeTypeParseException unused) {
            return str2.equalsIgnoreCase(str);
        }
    }

    public void setHumanPresentableName(String str) {
        this.f78840c = str;
    }

    public ActivationDataFlavor(Class cls, String str) {
        this.f78839b = null;
        this.f78838a = "application/x-java-serialized-object";
        this.f78841d = cls;
        this.f78840c = str;
    }

    public ActivationDataFlavor(String str, String str2) {
        this.f78839b = null;
        this.f78840c = null;
        this.f78841d = null;
        this.f78838a = str;
        try {
            this.f78841d = Class.forName("java.io.InputStream");
        } catch (ClassNotFoundException unused) {
        }
        this.f78840c = str2;
    }

    public String normalizeMimeType(String str) {
        return str;
    }

    public String normalizeMimeTypeParameter(String str, String str2) {
        return str2;
    }
}

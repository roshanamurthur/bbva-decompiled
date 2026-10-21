package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public class Quota {
    public String quotaRoot;
    public Resource[] resources;

    public static class Resource {
        public long limit;
        public String name;
        public long usage;

        public Resource(String str, long j10, long j11) {
            this.name = str;
            this.usage = j10;
            this.limit = j11;
        }
    }

    public Quota(String str) {
        this.quotaRoot = str;
    }

    public void setResourceLimit(String str, long j10) {
        if (this.resources == null) {
            this.resources = new Resource[]{new Resource(str, 0L, j10)};
            return;
        }
        int i10 = 0;
        while (true) {
            Resource[] resourceArr = this.resources;
            if (i10 >= resourceArr.length) {
                int length = resourceArr.length;
                Resource[] resourceArr2 = new Resource[length + 1];
                System.arraycopy(resourceArr, 0, resourceArr2, 0, resourceArr.length);
                resourceArr2[length] = new Resource(str, 0L, j10);
                this.resources = resourceArr2;
                return;
            }
            if (resourceArr[i10].name.equalsIgnoreCase(str)) {
                this.resources[i10].limit = j10;
                return;
            }
            i10++;
        }
    }
}

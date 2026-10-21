package javax.mail;

import java.util.Vector;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class FetchProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector<Item> f78881a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vector<String> f78882b = null;

    public static class Item {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78883a;
        public static final Item ENVELOPE = new Item("ENVELOPE");
        public static final Item CONTENT_INFO = new Item("CONTENT_INFO");
        public static final Item SIZE = new Item("SIZE");
        public static final Item FLAGS = new Item("FLAGS");

        public Item(String str) {
            this.f78883a = str;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getName());
            sb2.append(Constant.BRACKET_OPEN);
            return ad.d.f(sb2, this.f78883a, Constant.BRACKET_CLOSE);
        }
    }

    public void add(Item item) {
        if (this.f78881a == null) {
            this.f78881a = new Vector<>();
        }
        this.f78881a.addElement(item);
    }

    public boolean contains(Item item) {
        Vector<Item> vector = this.f78881a;
        return vector != null && vector.contains(item);
    }

    public String[] getHeaderNames() {
        Vector<String> vector = this.f78882b;
        if (vector == null) {
            return new String[0];
        }
        String[] strArr = new String[vector.size()];
        this.f78882b.copyInto(strArr);
        return strArr;
    }

    public Item[] getItems() {
        Vector<Item> vector = this.f78881a;
        if (vector == null) {
            return new Item[0];
        }
        Item[] itemArr = new Item[vector.size()];
        this.f78881a.copyInto(itemArr);
        return itemArr;
    }

    public boolean contains(String str) {
        Vector<String> vector = this.f78882b;
        return vector != null && vector.contains(str);
    }

    public void add(String str) {
        if (this.f78882b == null) {
            this.f78882b = new Vector<>();
        }
        this.f78882b.addElement(str);
    }
}

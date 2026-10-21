package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ZxcvbnBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f63653a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f63654b = new LinkedHashMap();

    public Zxcvbn build() {
        return new Zxcvbn(new Context(this.f63653a, this.f63654b));
    }

    public ZxcvbnBuilder dictionaries(List<Dictionary> list) {
        Iterator<Dictionary> it = list.iterator();
        while (it.hasNext()) {
            dictionary(it.next());
        }
        return this;
    }

    public ZxcvbnBuilder dictionary(Dictionary dictionary) {
        this.f63653a.put(dictionary.getName(), dictionary);
        return this;
    }

    public ZxcvbnBuilder keyboard(Keyboard keyboard) {
        this.f63654b.put(keyboard.getName(), keyboard);
        return this;
    }

    public ZxcvbnBuilder keyboards(List<Keyboard> list) {
        Iterator<Keyboard> it = list.iterator();
        while (it.hasNext()) {
            keyboard(it.next());
        }
        return this;
    }
}

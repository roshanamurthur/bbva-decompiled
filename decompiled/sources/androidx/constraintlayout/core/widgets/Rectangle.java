package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19195x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19196y;

    public boolean contains(int i10, int i11) {
        int i12;
        int i13 = this.f19195x;
        return i10 >= i13 && i10 < i13 + this.width && i11 >= (i12 = this.f19196y) && i11 < i12 + this.height;
    }

    public int getCenterX() {
        return (this.f19195x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f19196y + this.height) / 2;
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f19195x = i10;
        this.f19196y = i11;
        this.width = i12;
        this.height = i13;
    }
}

package cz.muni.fi.xklinex.whiteboxAES;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class State implements Serializable {
    public static final int BYTES = 16;
    public static final int COLS = 4;
    public static final int ROWS = 4;
    private static final long serialVersionUID = 985187931620550251L;
    protected final boolean immutable = false;
    protected byte[] state;

    public State() {
        init();
    }

    public static void copy(State state, State state2) {
        state2.setState(state2.getState(), true);
    }

    public static int getCIdx(int i10, int i11) {
        return (i11 * 4) + i10;
    }

    public static int getTIdx(int i10) {
        return getCIdx(i10 / 4, i10 % 4);
    }

    public static int transpose(int i10) {
        return ((i10 % 4) * 4) + (i10 / 4);
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.state, ((State) obj).state);
        }
        return false;
    }

    public byte get(int i10) {
        if (i10 < 0 || i10 >= 16) {
            throw new IllegalArgumentException("Invalid byte requested");
        }
        return this.state[i10];
    }

    public byte[] getState() {
        return this.state;
    }

    public byte getT(int i10) {
        return get(getTIdx(i10));
    }

    public int hashCode() {
        return Arrays.hashCode(this.state) + 413;
    }

    public final void init() {
        this.state = new byte[16];
    }

    public void loadFrom(State state) {
        System.arraycopy(state.getState(), 0, this.state, 0, 16);
    }

    public void set(byte b10, int i10) {
        if (i10 < 0 || i10 >= 16) {
            throw new IllegalArgumentException("Invalid byte requested");
        }
        byte[] bArr = this.state;
        if (bArr == null) {
            throw new NullPointerException("State is not initialized");
        }
        bArr[i10] = b10;
    }

    public void setColumn(W32b w32b, int i10) {
        byte[] bArr = w32b.get();
        byte[] bArr2 = this.state;
        bArr2[i10] = bArr[0];
        bArr2[i10 + 4] = bArr[1];
        bArr2[i10 + 8] = bArr[2];
        bArr2[i10 + 12] = bArr[3];
    }

    public void setState(byte[] bArr, boolean z10) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("XOR table has to have 8 sub-tables");
        }
        if (z10) {
            this.state = Arrays.copyOf(bArr, 16);
        } else {
            this.state = bArr;
        }
    }

    public String toString() {
        if (this.state == null) {
            return "State{state=null}";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = this.state.length;
        int i10 = 0;
        while (i10 < length) {
            sb2.append(String.format("0x%02X", Integer.valueOf(this.state[i10] & 255)));
            i10++;
            if (i10 != length) {
                sb2.append(", ");
            }
        }
        return "State{state=" + ((Object) sb2) + ";mem=" + Arrays.toString(this.state) + "}";
    }

    public State transpose() {
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = getT(i10);
        }
        this.state = bArr;
        return this;
    }

    public State(byte[] bArr, boolean z10, boolean z11) {
        if (z11) {
            init();
            for (int i10 = 0; i10 < 16; i10++) {
                this.state[i10] = bArr[transpose(i10)];
            }
            return;
        }
        if (z10) {
            this.state = Arrays.copyOf(bArr, 16);
        } else {
            this.state = bArr;
        }
    }
}
